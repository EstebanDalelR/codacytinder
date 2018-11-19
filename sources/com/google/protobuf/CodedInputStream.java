package com.google.protobuf;

import com.google.protobuf.MessageLite.Builder;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_RECURSION_LIMIT = 100;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile boolean proto3DiscardUnknownFieldsDefault = true;
    private boolean explicitDiscardUnknownFields;
    int recursionDepth;
    int recursionLimit;
    int sizeLimit;

    private static final class ArrayDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private ArrayDecoder(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i2 + i;
            this.pos = i;
            this.startPos = this.pos;
            this.immutable = z;
        }

        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            this.lastTag = readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public int getLastTag() {
            return this.lastTag;
        }

        public boolean skipField(int i) throws IOException {
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    skipRawVarint();
                    return true;
                case 1:
                    skipRawBytes(8);
                    return true;
                case 2:
                    skipRawBytes(readRawVarint32());
                    return true;
                case 3:
                    skipMessage();
                    checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                    return true;
                case 4:
                    return false;
                case 5:
                    skipRawBytes(4);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
            long readInt64;
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    readInt64 = readInt64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeUInt64NoTag(readInt64);
                    return true;
                case 1:
                    readInt64 = readRawLittleEndian64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed64NoTag(readInt64);
                    return true;
                case 2:
                    ByteString readBytes = readBytes();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeBytesNoTag(readBytes);
                    return true;
                case 3:
                    codedOutputStream.writeRawVarint32(i);
                    skipMessage(codedOutputStream);
                    i = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                    checkLastTagWas(i);
                    codedOutputStream.writeRawVarint32(i);
                    return true;
                case 4:
                    return false;
                case 5:
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        public String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= this.limit - this.pos) {
                String str = new String(this.buffer, this.pos, readRawVarint32, Internal.UTF_8);
                this.pos += readRawVarint32;
                return str;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > this.limit - this.pos) {
                if (readRawVarint32 == 0) {
                    return "";
                }
                if (readRawVarint32 <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (Utf8.isValidUtf8(this.buffer, this.pos, this.pos + readRawVarint32)) {
                int i = this.pos;
                this.pos += readRawVarint32;
                return new String(this.buffer, i, readRawVarint32, Internal.UTF_8);
            } else {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
        }

        public void readGroup(int i, Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        public <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return messageLite;
        }

        @Deprecated
        public void readUnknownGroup(int i, Builder builder) throws IOException {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        public void readMessage(Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            readRawVarint32 = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(null);
            this.recursionDepth--;
            popLimit(readRawVarint32);
        }

        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            readRawVarint32 = pushLimit(readRawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(null);
            this.recursionDepth--;
            popLimit(readRawVarint32);
            return messageLite;
        }

        public ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= this.limit - this.pos) {
                ByteString wrap;
                if (this.immutable && this.enableAliasing) {
                    wrap = ByteString.wrap(this.buffer, this.pos, readRawVarint32);
                } else {
                    wrap = ByteString.copyFrom(this.buffer, this.pos, readRawVarint32);
                }
                this.pos += readRawVarint32;
                return wrap;
            } else if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            } else {
                return ByteString.wrap(readRawBytes(readRawVarint32));
            }
        }

        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        public ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= this.limit - this.pos) {
                ByteBuffer wrap;
                if (this.immutable || !this.enableAliasing) {
                    wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, this.pos, this.pos + readRawVarint32));
                } else {
                    wrap = ByteBuffer.wrap(this.buffer, this.pos, readRawVarint32).slice();
                }
                this.pos += readRawVarint32;
                return wrap;
            } else if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int readRawVarint32() throws java.io.IOException {
            /*
            r5 = this;
            r0 = r5.pos;
            r1 = r5.limit;
            if (r1 != r0) goto L_0x0007;
        L_0x0006:
            goto L_0x006c;
        L_0x0007:
            r1 = r5.buffer;
            r2 = r0 + 1;
            r0 = r1[r0];
            if (r0 < 0) goto L_0x0012;
        L_0x000f:
            r5.pos = r2;
            return r0;
        L_0x0012:
            r3 = r5.limit;
            r3 = r3 - r2;
            r4 = 9;
            if (r3 >= r4) goto L_0x001a;
        L_0x0019:
            goto L_0x006c;
        L_0x001a:
            r3 = r2 + 1;
            r2 = r1[r2];
            r2 = r2 << 7;
            r0 = r0 ^ r2;
            if (r0 >= 0) goto L_0x0026;
        L_0x0023:
            r0 = r0 ^ -128;
            goto L_0x0072;
        L_0x0026:
            r2 = r3 + 1;
            r3 = r1[r3];
            r3 = r3 << 14;
            r0 = r0 ^ r3;
            if (r0 < 0) goto L_0x0033;
        L_0x002f:
            r0 = r0 ^ 16256;
        L_0x0031:
            r3 = r2;
            goto L_0x0072;
        L_0x0033:
            r3 = r2 + 1;
            r2 = r1[r2];
            r2 = r2 << 21;
            r0 = r0 ^ r2;
            if (r0 >= 0) goto L_0x0041;
        L_0x003c:
            r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
            r0 = r0 ^ r1;
            goto L_0x0072;
        L_0x0041:
            r2 = r3 + 1;
            r3 = r1[r3];
            r4 = r3 << 28;
            r0 = r0 ^ r4;
            r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
            r0 = r0 ^ r4;
            if (r3 >= 0) goto L_0x0031;
        L_0x004e:
            r3 = r2 + 1;
            r2 = r1[r2];
            if (r2 >= 0) goto L_0x0072;
        L_0x0054:
            r2 = r3 + 1;
            r3 = r1[r3];
            if (r3 >= 0) goto L_0x0031;
        L_0x005a:
            r3 = r2 + 1;
            r2 = r1[r2];
            if (r2 >= 0) goto L_0x0072;
        L_0x0060:
            r2 = r3 + 1;
            r3 = r1[r3];
            if (r3 >= 0) goto L_0x0031;
        L_0x0066:
            r3 = r2 + 1;
            r1 = r1[r2];
            if (r1 >= 0) goto L_0x0072;
        L_0x006c:
            r0 = r5.readRawVarint64SlowPath();
            r0 = (int) r0;
            return r0;
        L_0x0072:
            r5.pos = r3;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.ArrayDecoder.readRawVarint32():int");
        }

        private void skipRawVarint() throws IOException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.buffer;
                int i2 = this.pos;
                this.pos = i2 + 1;
                if (bArr[i2] < (byte) 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            int i = 0;
            while (i < 10) {
                if (readRawByte() < (byte) 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public long readRawVarint64() throws IOException {
            int i = this.pos;
            if (this.limit != i) {
                byte[] bArr = this.buffer;
                int i2 = i + 1;
                byte b = bArr[i];
                if (b >= (byte) 0) {
                    this.pos = i2;
                    return (long) b;
                } else if (this.limit - i2 >= 9) {
                    long j;
                    long j2;
                    long j3;
                    int i3 = i2 + 1;
                    i = b ^ (bArr[i2] << 7);
                    if (i < 0) {
                        j = (long) (i ^ -128);
                    } else {
                        i2 = i3 + 1;
                        i ^= bArr[i3] << 14;
                        if (i >= 0) {
                            j2 = (long) (i ^ 16256);
                            i = i2;
                            j3 = j2;
                            this.pos = i;
                            return j3;
                        }
                        i3 = i2 + 1;
                        i ^= bArr[i2] << 21;
                        if (i < 0) {
                            j = (long) (i ^ -2080896);
                        } else {
                            long j4;
                            long j5 = (long) i;
                            i = i3 + 1;
                            long j6 = j5 ^ (((long) bArr[i3]) << 28);
                            if (j6 >= 0) {
                                j4 = j6 ^ 266354560;
                            } else {
                                int i4 = i + 1;
                                long j7 = j6 ^ (((long) bArr[i]) << 35);
                                if (j7 < 0) {
                                    j3 = j7 ^ -34093383808L;
                                } else {
                                    i = i4 + 1;
                                    j6 = j7 ^ (((long) bArr[i4]) << 42);
                                    if (j6 >= 0) {
                                        j4 = j6 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 1;
                                        j7 = j6 ^ (((long) bArr[i]) << 49);
                                        if (j7 < 0) {
                                            j3 = j7 ^ -558586000294016L;
                                        } else {
                                            i = i4 + 1;
                                            long j8 = (j7 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                i4 = i + 1;
                                                if (((long) bArr[i]) >= 0) {
                                                    i = i4;
                                                }
                                            }
                                            j3 = j8;
                                            this.pos = i;
                                            return j3;
                                        }
                                    }
                                }
                                i = i4;
                                this.pos = i;
                                return j3;
                            }
                            j3 = j4;
                            this.pos = i;
                            return j3;
                        }
                    }
                    j2 = j;
                    i = i3;
                    j3 = j2;
                    this.pos = i;
                    return j3;
                }
            }
            return readRawVarint64SlowPath();
        }

        long readRawVarint64SlowPath() throws IOException {
            long j = 0;
            int i = 0;
            while (i < 64) {
                byte readRawByte = readRawByte();
                long j2 = j | (((long) (readRawByte & 127)) << i);
                if ((readRawByte & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                    return j2;
                }
                i += 7;
                j = j2;
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public int readRawLittleEndian32() throws IOException {
            int i = this.pos;
            if (this.limit - i < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
        }

        public long readRawLittleEndian64() throws IOException {
            int i = this.pos;
            if (this.limit - i < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48)) | ((((long) bArr[i + 7]) & 255) << 56);
        }

        public void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        public int pushLimit(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            i += getTotalBytesRead();
            int i2 = this.currentLimit;
            if (i > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        private void recomputeBufferSizeAfterLimit() {
            this.limit += this.bufferSizeAfterLimit;
            int i = this.limit - this.startPos;
            if (i > this.currentLimit) {
                this.bufferSizeAfterLimit = i - this.currentLimit;
                this.limit -= this.bufferSizeAfterLimit;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        public int getBytesUntilLimit() {
            if (this.currentLimit == Integer.MAX_VALUE) {
                return -1;
            }
            return this.currentLimit - getTotalBytesRead();
        }

        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        public byte readRawByte() throws IOException {
            if (this.pos == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            return bArr[i];
        }

        public byte[] readRawBytes(int i) throws IOException {
            if (i > 0 && i <= this.limit - this.pos) {
                int i2 = this.pos;
                this.pos += i;
                return Arrays.copyOfRange(this.buffer, i2, this.pos);
            } else if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        public void skipRawBytes(int i) throws IOException {
            if (i >= 0 && i <= this.limit - this.pos) {
                this.pos += i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }
    }

    private static final class StreamDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private RefillCallback refillCallback;
        private int totalBytesRetired;

        private interface RefillCallback {
            void onRefill();
        }

        private class SkippedDataSink implements RefillCallback {
            private ByteArrayOutputStream byteArrayStream;
            private int lastPos = StreamDecoder.this.pos;

            private SkippedDataSink() {
            }

            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new ByteArrayOutputStream();
                }
                this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }

            ByteBuffer getSkippedData() {
                if (this.byteArrayStream == null) {
                    return ByteBuffer.wrap(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                }
                this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos);
                return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }
        }

        public void enableAliasing(boolean z) {
        }

        private StreamDecoder(InputStream inputStream, int i) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            Internal.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            this.lastTag = readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public int getLastTag() {
            return this.lastTag;
        }

        public boolean skipField(int i) throws IOException {
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    skipRawVarint();
                    return true;
                case 1:
                    skipRawBytes(8);
                    return true;
                case 2:
                    skipRawBytes(readRawVarint32());
                    return true;
                case 3:
                    skipMessage();
                    checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                    return true;
                case 4:
                    return false;
                case 5:
                    skipRawBytes(4);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
            long readInt64;
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    readInt64 = readInt64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeUInt64NoTag(readInt64);
                    return true;
                case 1:
                    readInt64 = readRawLittleEndian64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed64NoTag(readInt64);
                    return true;
                case 2:
                    ByteString readBytes = readBytes();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeBytesNoTag(readBytes);
                    return true;
                case 3:
                    codedOutputStream.writeRawVarint32(i);
                    skipMessage(codedOutputStream);
                    i = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                    checkLastTagWas(i);
                    codedOutputStream.writeRawVarint32(i);
                    return true;
                case 4:
                    return false;
                case 5:
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        public String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            String str;
            if (readRawVarint32 > 0 && readRawVarint32 <= this.bufferSize - this.pos) {
                str = new String(this.buffer, this.pos, readRawVarint32, Internal.UTF_8);
                this.pos += readRawVarint32;
                return str;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 > this.bufferSize) {
                    return new String(readRawBytesSlowPath(readRawVarint32), Internal.UTF_8);
                }
                refillBuffer(readRawVarint32);
                str = new String(this.buffer, this.pos, readRawVarint32, Internal.UTF_8);
                this.pos += readRawVarint32;
                return str;
            }
        }

        public String readStringRequireUtf8() throws IOException {
            byte[] bArr;
            int readRawVarint32 = readRawVarint32();
            int i = this.pos;
            int i2 = 0;
            if (readRawVarint32 <= this.bufferSize - i && readRawVarint32 > 0) {
                bArr = this.buffer;
                this.pos = i + readRawVarint32;
                i2 = i;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= this.bufferSize) {
                    refillBuffer(readRawVarint32);
                    bArr = this.buffer;
                    this.pos = readRawVarint32 + 0;
                } else {
                    bArr = readRawBytesSlowPath(readRawVarint32);
                }
            }
            if (Utf8.isValidUtf8(bArr, i2, i2 + readRawVarint32)) {
                return new String(bArr, i2, readRawVarint32, Internal.UTF_8);
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        public void readGroup(int i, Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        public <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return messageLite;
        }

        @Deprecated
        public void readUnknownGroup(int i, Builder builder) throws IOException {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        public void readMessage(Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            readRawVarint32 = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(null);
            this.recursionDepth--;
            popLimit(readRawVarint32);
        }

        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            readRawVarint32 = pushLimit(readRawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(null);
            this.recursionDepth--;
            popLimit(readRawVarint32);
            return messageLite;
        }

        public ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= this.bufferSize - this.pos && readRawVarint32 > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.buffer, this.pos, readRawVarint32);
                this.pos += readRawVarint32;
                return copyFrom;
            } else if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            } else {
                return readBytesSlowPath(readRawVarint32);
            }
        }

        public byte[] readByteArray() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > this.bufferSize - this.pos || readRawVarint32 <= 0) {
                return readRawBytesSlowPath(readRawVarint32);
            }
            byte[] copyOfRange = Arrays.copyOfRange(this.buffer, this.pos, this.pos + readRawVarint32);
            this.pos += readRawVarint32;
            return copyOfRange;
        }

        public ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= this.bufferSize - this.pos && readRawVarint32 > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, this.pos, this.pos + readRawVarint32));
                this.pos += readRawVarint32;
                return wrap;
            } else if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            } else {
                return ByteBuffer.wrap(readRawBytesSlowPath(readRawVarint32));
            }
        }

        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int readRawVarint32() throws java.io.IOException {
            /*
            r5 = this;
            r0 = r5.pos;
            r1 = r5.bufferSize;
            if (r1 != r0) goto L_0x0007;
        L_0x0006:
            goto L_0x006c;
        L_0x0007:
            r1 = r5.buffer;
            r2 = r0 + 1;
            r0 = r1[r0];
            if (r0 < 0) goto L_0x0012;
        L_0x000f:
            r5.pos = r2;
            return r0;
        L_0x0012:
            r3 = r5.bufferSize;
            r3 = r3 - r2;
            r4 = 9;
            if (r3 >= r4) goto L_0x001a;
        L_0x0019:
            goto L_0x006c;
        L_0x001a:
            r3 = r2 + 1;
            r2 = r1[r2];
            r2 = r2 << 7;
            r0 = r0 ^ r2;
            if (r0 >= 0) goto L_0x0026;
        L_0x0023:
            r0 = r0 ^ -128;
            goto L_0x0072;
        L_0x0026:
            r2 = r3 + 1;
            r3 = r1[r3];
            r3 = r3 << 14;
            r0 = r0 ^ r3;
            if (r0 < 0) goto L_0x0033;
        L_0x002f:
            r0 = r0 ^ 16256;
        L_0x0031:
            r3 = r2;
            goto L_0x0072;
        L_0x0033:
            r3 = r2 + 1;
            r2 = r1[r2];
            r2 = r2 << 21;
            r0 = r0 ^ r2;
            if (r0 >= 0) goto L_0x0041;
        L_0x003c:
            r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
            r0 = r0 ^ r1;
            goto L_0x0072;
        L_0x0041:
            r2 = r3 + 1;
            r3 = r1[r3];
            r4 = r3 << 28;
            r0 = r0 ^ r4;
            r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
            r0 = r0 ^ r4;
            if (r3 >= 0) goto L_0x0031;
        L_0x004e:
            r3 = r2 + 1;
            r2 = r1[r2];
            if (r2 >= 0) goto L_0x0072;
        L_0x0054:
            r2 = r3 + 1;
            r3 = r1[r3];
            if (r3 >= 0) goto L_0x0031;
        L_0x005a:
            r3 = r2 + 1;
            r2 = r1[r2];
            if (r2 >= 0) goto L_0x0072;
        L_0x0060:
            r2 = r3 + 1;
            r3 = r1[r3];
            if (r3 >= 0) goto L_0x0031;
        L_0x0066:
            r3 = r2 + 1;
            r1 = r1[r2];
            if (r1 >= 0) goto L_0x0072;
        L_0x006c:
            r0 = r5.readRawVarint64SlowPath();
            r0 = (int) r0;
            return r0;
        L_0x0072:
            r5.pos = r3;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.readRawVarint32():int");
        }

        private void skipRawVarint() throws IOException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.buffer;
                int i2 = this.pos;
                this.pos = i2 + 1;
                if (bArr[i2] < (byte) 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            int i = 0;
            while (i < 10) {
                if (readRawByte() < (byte) 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public long readRawVarint64() throws IOException {
            int i = this.pos;
            if (this.bufferSize != i) {
                byte[] bArr = this.buffer;
                int i2 = i + 1;
                byte b = bArr[i];
                if (b >= (byte) 0) {
                    this.pos = i2;
                    return (long) b;
                } else if (this.bufferSize - i2 >= 9) {
                    long j;
                    long j2;
                    long j3;
                    int i3 = i2 + 1;
                    i = b ^ (bArr[i2] << 7);
                    if (i < 0) {
                        j = (long) (i ^ -128);
                    } else {
                        i2 = i3 + 1;
                        i ^= bArr[i3] << 14;
                        if (i >= 0) {
                            j2 = (long) (i ^ 16256);
                            i = i2;
                            j3 = j2;
                            this.pos = i;
                            return j3;
                        }
                        i3 = i2 + 1;
                        i ^= bArr[i2] << 21;
                        if (i < 0) {
                            j = (long) (i ^ -2080896);
                        } else {
                            long j4;
                            long j5 = (long) i;
                            i = i3 + 1;
                            long j6 = j5 ^ (((long) bArr[i3]) << 28);
                            if (j6 >= 0) {
                                j4 = j6 ^ 266354560;
                            } else {
                                int i4 = i + 1;
                                long j7 = j6 ^ (((long) bArr[i]) << 35);
                                if (j7 < 0) {
                                    j3 = j7 ^ -34093383808L;
                                } else {
                                    i = i4 + 1;
                                    j6 = j7 ^ (((long) bArr[i4]) << 42);
                                    if (j6 >= 0) {
                                        j4 = j6 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 1;
                                        j7 = j6 ^ (((long) bArr[i]) << 49);
                                        if (j7 < 0) {
                                            j3 = j7 ^ -558586000294016L;
                                        } else {
                                            i = i4 + 1;
                                            long j8 = (j7 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                i4 = i + 1;
                                                if (((long) bArr[i]) >= 0) {
                                                    i = i4;
                                                }
                                            }
                                            j3 = j8;
                                            this.pos = i;
                                            return j3;
                                        }
                                    }
                                }
                                i = i4;
                                this.pos = i;
                                return j3;
                            }
                            j3 = j4;
                            this.pos = i;
                            return j3;
                        }
                    }
                    j2 = j;
                    i = i3;
                    j3 = j2;
                    this.pos = i;
                    return j3;
                }
            }
            return readRawVarint64SlowPath();
        }

        long readRawVarint64SlowPath() throws IOException {
            long j = 0;
            int i = 0;
            while (i < 64) {
                byte readRawByte = readRawByte();
                long j2 = j | (((long) (readRawByte & 127)) << i);
                if ((readRawByte & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                    return j2;
                }
                i += 7;
                j = j2;
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public int readRawLittleEndian32() throws IOException {
            int i = this.pos;
            if (this.bufferSize - i < 4) {
                refillBuffer(4);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
        }

        public long readRawLittleEndian64() throws IOException {
            int i = this.pos;
            if (this.bufferSize - i < 8) {
                refillBuffer(8);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48)) | ((((long) bArr[i + 7]) & 255) << 56);
        }

        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        public int pushLimit(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            i += this.totalBytesRetired + this.pos;
            int i2 = this.currentLimit;
            if (i > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        private void recomputeBufferSizeAfterLimit() {
            this.bufferSize += this.bufferSizeAfterLimit;
            int i = this.totalBytesRetired + this.bufferSize;
            if (i > this.currentLimit) {
                this.bufferSizeAfterLimit = i - this.currentLimit;
                this.bufferSize -= this.bufferSizeAfterLimit;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        public int getBytesUntilLimit() {
            if (this.currentLimit == Integer.MAX_VALUE) {
                return -1;
            }
            return this.currentLimit - (this.totalBytesRetired + this.pos);
        }

        public boolean isAtEnd() throws IOException {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        private void refillBuffer(int i) throws IOException {
            if (!tryRefillBuffer(i)) {
                if (i > (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private boolean tryRefillBuffer(int i) throws IOException {
            StringBuilder stringBuilder;
            if (this.pos + i <= this.bufferSize) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("refillBuffer() called when ");
                stringBuilder.append(i);
                stringBuilder.append(" bytes were already available in buffer");
                throw new IllegalStateException(stringBuilder.toString());
            } else if (i > (this.sizeLimit - this.totalBytesRetired) - this.pos || (this.totalBytesRetired + this.pos) + i > this.currentLimit) {
                return false;
            } else {
                if (this.refillCallback != null) {
                    this.refillCallback.onRefill();
                }
                int i2 = this.pos;
                if (i2 > 0) {
                    if (this.bufferSize > i2) {
                        System.arraycopy(this.buffer, i2, this.buffer, 0, this.bufferSize - i2);
                    }
                    this.totalBytesRetired += i2;
                    this.bufferSize -= i2;
                    this.pos = 0;
                }
                i2 = this.input.read(this.buffer, this.bufferSize, Math.min(this.buffer.length - this.bufferSize, (this.sizeLimit - this.totalBytesRetired) - this.bufferSize));
                if (i2 != 0 && i2 >= -1) {
                    if (i2 <= this.buffer.length) {
                        if (i2 <= 0) {
                            return false;
                        }
                        this.bufferSize += i2;
                        recomputeBufferSizeAfterLimit();
                        return this.bufferSize >= i ? 1 : tryRefillBuffer(i);
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("InputStream#read(byte[]) returned invalid result: ");
                stringBuilder.append(i2);
                stringBuilder.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public byte readRawByte() throws IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            return bArr[i];
        }

        public byte[] readRawBytes(int i) throws IOException {
            int i2 = this.pos;
            if (i > this.bufferSize - i2 || i <= 0) {
                return readRawBytesSlowPath(i);
            }
            i += i2;
            this.pos = i;
            return Arrays.copyOfRange(this.buffer, i2, i);
        }

        private byte[] readRawBytesSlowPath(int i) throws IOException {
            byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
            if (readRawBytesSlowPathOneChunk != null) {
                return readRawBytesSlowPathOneChunk;
            }
            int i2 = this.pos;
            int i3 = this.bufferSize - this.pos;
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - i3);
            i = new byte[i];
            System.arraycopy(this.buffer, i2, i, 0, i3);
            for (byte[] bArr : readRawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr, 0, i, i3, bArr.length);
                i3 += bArr.length;
            }
            return i;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i) throws IOException {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = (this.totalBytesRetired + this.pos) + i;
            if (i2 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            } else if (i2 > this.currentLimit) {
                skipRawBytes((this.currentLimit - this.totalBytesRetired) - this.pos);
                throw InvalidProtocolBufferException.truncatedMessage();
            } else {
                i2 = this.bufferSize - this.pos;
                int i3 = i - i2;
                if (i3 >= 4096) {
                    if (i3 > this.input.available()) {
                        return 0;
                    }
                }
                Object obj = new byte[i];
                System.arraycopy(this.buffer, this.pos, obj, 0, i2);
                this.totalBytesRetired += this.bufferSize;
                this.pos = 0;
                this.bufferSize = 0;
                while (i2 < obj.length) {
                    int read = this.input.read(obj, i2, i - i2);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += read;
                    i2 += read;
                }
                return obj;
            }
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i) throws IOException {
            List<byte[]> arrayList = new ArrayList();
            while (i > 0) {
                Object obj = new byte[Math.min(i, 4096)];
                int i2 = 0;
                while (i2 < obj.length) {
                    int read = this.input.read(obj, i2, obj.length - i2);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += read;
                    i2 += read;
                }
                i -= obj.length;
                arrayList.add(obj);
            }
            return arrayList;
        }

        private com.google.protobuf.ByteString readBytesSlowPath(int r5) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:410)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.fixIterableType(LoopRegionVisitor.java:308)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkIterableForEach(LoopRegionVisitor.java:249)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:68)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r4.readRawBytesSlowPathOneChunk(r5);
            if (r0 == 0) goto L_0x000b;
        L_0x0006:
            r5 = com.google.protobuf.ByteString.wrap(r0);
            return r5;
        L_0x000b:
            r0 = r4.pos;
            r1 = r4.bufferSize;
            r2 = r4.pos;
            r1 = r1 - r2;
            r2 = r4.totalBytesRetired;
            r3 = r4.bufferSize;
            r2 = r2 + r3;
            r4.totalBytesRetired = r2;
            r2 = 0;
            r4.pos = r2;
            r4.bufferSize = r2;
            r5 = r5 - r1;
            r5 = r4.readRawBytesSlowPathRemainingChunks(r5);
            r2 = new java.util.ArrayList;
            r3 = r5.size();
            r3 = r3 + 1;
            r2.<init>(r3);
            r3 = r4.buffer;
            r0 = com.google.protobuf.ByteString.copyFrom(r3, r0, r1);
            r2.add(r0);
            r5 = r5.iterator();
        L_0x003b:
            r0 = r5.hasNext();
            if (r0 == 0) goto L_0x004f;
        L_0x0041:
            r0 = r5.next();
            r0 = (byte[]) r0;
            r0 = com.google.protobuf.ByteString.wrap(r0);
            r2.add(r0);
            goto L_0x003b;
        L_0x004f:
            r5 = com.google.protobuf.ByteString.copyFrom(r2);
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.StreamDecoder.readBytesSlowPath(int):com.google.protobuf.ByteString");
        }

        public void skipRawBytes(int i) throws IOException {
            if (i > this.bufferSize - this.pos || i < 0) {
                skipRawBytesSlowPath(i);
            } else {
                this.pos += i;
            }
        }

        private void skipRawBytesSlowPath(int i) throws IOException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else if ((this.totalBytesRetired + this.pos) + i > this.currentLimit) {
                skipRawBytes((this.currentLimit - this.totalBytesRetired) - this.pos);
                throw InvalidProtocolBufferException.truncatedMessage();
            } else {
                int i2 = this.bufferSize - this.pos;
                this.pos = this.bufferSize;
                refillBuffer(1);
                while (true) {
                    int i3 = i - i2;
                    if (i3 > this.bufferSize) {
                        i2 += this.bufferSize;
                        this.pos = this.bufferSize;
                        refillBuffer(1);
                    } else {
                        this.pos = i3;
                        return;
                    }
                }
            }
        }
    }

    private static final class UnsafeDirectNioDecoder extends CodedInputStream {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            this.address = UnsafeUtil.addressOffset(byteBuffer);
            this.limit = this.address + ((long) byteBuffer.limit());
            this.pos = this.address + ((long) byteBuffer.position());
            this.startPos = this.pos;
            this.immutable = z;
        }

        public int readTag() throws IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            this.lastTag = readRawVarint32();
            if (WireFormat.getTagFieldNumber(this.lastTag) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public int getLastTag() {
            return this.lastTag;
        }

        public boolean skipField(int i) throws IOException {
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    skipRawVarint();
                    return true;
                case 1:
                    skipRawBytes(8);
                    return true;
                case 2:
                    skipRawBytes(readRawVarint32());
                    return true;
                case 3:
                    skipMessage();
                    checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                    return true;
                case 4:
                    return false;
                case 5:
                    skipRawBytes(4);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
            long readInt64;
            switch (WireFormat.getTagWireType(i)) {
                case 0:
                    readInt64 = readInt64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeUInt64NoTag(readInt64);
                    return true;
                case 1:
                    readInt64 = readRawLittleEndian64();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed64NoTag(readInt64);
                    return true;
                case 2:
                    ByteString readBytes = readBytes();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeBytesNoTag(readBytes);
                    return true;
                case 3:
                    codedOutputStream.writeRawVarint32(i);
                    skipMessage(codedOutputStream);
                    i = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                    checkLastTagWas(i);
                    codedOutputStream.writeRawVarint32(i);
                    return true;
                case 4:
                    return false;
                case 5:
                    int readRawLittleEndian32 = readRawLittleEndian32();
                    codedOutputStream.writeRawVarint32(i);
                    codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                    return true;
                default:
                    throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public void skipMessage() throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag));
        }

        public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int readTag;
            do {
                readTag = readTag();
                if (readTag == 0) {
                    return;
                }
            } while (skipField(readTag, codedOutputStream));
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        public long readUInt64() throws IOException {
            return readRawVarint64();
        }

        public long readInt64() throws IOException {
            return readRawVarint64();
        }

        public int readInt32() throws IOException {
            return readRawVarint32();
        }

        public long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        public String readString() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                byte[] bArr = new byte[readRawVarint32];
                long j = (long) readRawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0, j);
                String str = new String(bArr, Internal.UTF_8);
                this.pos += j;
                return str;
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public String readStringRequireUtf8() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 >= 0 && readRawVarint32 <= remaining()) {
                byte[] bArr = new byte[readRawVarint32];
                long j = (long) readRawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0, j);
                if (Utf8.isValidUtf8(bArr)) {
                    String str = new String(bArr, Internal.UTF_8);
                    this.pos += j;
                    return str;
                }
                throw InvalidProtocolBufferException.invalidUtf8();
            } else if (readRawVarint32 == 0) {
                return "";
            } else {
                if (readRawVarint32 <= 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        public void readGroup(int i, Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        public <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return messageLite;
        }

        @Deprecated
        public void readUnknownGroup(int i, Builder builder) throws IOException {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        public void readMessage(Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            readRawVarint32 = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(null);
            this.recursionDepth--;
            popLimit(readRawVarint32);
        }

        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (this.recursionDepth >= this.recursionLimit) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            readRawVarint32 = pushLimit(readRawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom((CodedInputStream) this, extensionRegistryLite);
            checkLastTagWas(null);
            this.recursionDepth--;
            popLimit(readRawVarint32);
            return messageLite;
        }

        public ByteString readBytes() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (this.immutable && this.enableAliasing) {
                long j = (long) readRawVarint32;
                ByteBuffer slice = slice(this.pos, this.pos + j);
                this.pos += j;
                return ByteString.wrap(slice);
            } else {
                byte[] bArr = new byte[readRawVarint32];
                long j2 = (long) readRawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0, j2);
                this.pos += j2;
                return ByteString.wrap(bArr);
            }
        }

        public byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        public ByteBuffer readByteBuffer() throws IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (this.immutable || !this.enableAliasing) {
                byte[] bArr = new byte[readRawVarint32];
                long j = (long) readRawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0, j);
                this.pos += j;
                return ByteBuffer.wrap(bArr);
            } else {
                long j2 = (long) readRawVarint32;
                ByteBuffer slice = slice(this.pos, this.pos + j2);
                this.pos += j2;
                return slice;
            }
        }

        public int readUInt32() throws IOException {
            return readRawVarint32();
        }

        public int readEnum() throws IOException {
            return readRawVarint32();
        }

        public int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        public long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        public int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        public long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int readRawVarint32() throws java.io.IOException {
            /*
            r10 = this;
            r0 = r10.pos;
            r2 = r10.limit;
            r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
            if (r4 != 0) goto L_0x000a;
        L_0x0008:
            goto L_0x008a;
        L_0x000a:
            r2 = 1;
            r4 = r0 + r2;
            r0 = com.google.protobuf.UnsafeUtil.getByte(r0);
            if (r0 < 0) goto L_0x0017;
        L_0x0014:
            r10.pos = r4;
            return r0;
        L_0x0017:
            r6 = r10.limit;
            r8 = r6 - r4;
            r6 = 9;
            r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
            if (r1 >= 0) goto L_0x0022;
        L_0x0021:
            goto L_0x008a;
        L_0x0022:
            r1 = 0;
            r6 = r4 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r4);
            r1 = r1 << 7;
            r0 = r0 ^ r1;
            if (r0 >= 0) goto L_0x0031;
        L_0x002e:
            r0 = r0 ^ -128;
            goto L_0x0090;
        L_0x0031:
            r1 = 0;
            r4 = r6 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r6);
            r1 = r1 << 14;
            r0 = r0 ^ r1;
            if (r0 < 0) goto L_0x0041;
        L_0x003d:
            r0 = r0 ^ 16256;
        L_0x003f:
            r6 = r4;
            goto L_0x0090;
        L_0x0041:
            r1 = 0;
            r6 = r4 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r4);
            r1 = r1 << 21;
            r0 = r0 ^ r1;
            if (r0 >= 0) goto L_0x0052;
        L_0x004d:
            r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
            r0 = r0 ^ r1;
            goto L_0x0090;
        L_0x0052:
            r1 = 0;
            r4 = r6 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r6);
            r6 = r1 << 28;
            r0 = r0 ^ r6;
            r6 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
            r0 = r0 ^ r6;
            if (r1 >= 0) goto L_0x003f;
        L_0x0062:
            r6 = r4 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r4);
            if (r1 >= 0) goto L_0x0090;
        L_0x006a:
            r4 = r6 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r6);
            if (r1 >= 0) goto L_0x003f;
        L_0x0072:
            r6 = r4 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r4);
            if (r1 >= 0) goto L_0x0090;
        L_0x007a:
            r4 = r6 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r6);
            if (r1 >= 0) goto L_0x003f;
        L_0x0082:
            r6 = r4 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r4);
            if (r1 >= 0) goto L_0x0090;
        L_0x008a:
            r0 = r10.readRawVarint64SlowPath();
            r0 = (int) r0;
            return r0;
        L_0x0090:
            r10.pos = r6;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.readRawVarint32():int");
        }

        private void skipRawVarint() throws IOException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws IOException {
            int i = 0;
            while (i < 10) {
                long j = this.pos;
                this.pos = j + 1;
                if (UnsafeUtil.getByte(j) < (byte) 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws IOException {
            int i = 0;
            while (i < 10) {
                if (readRawByte() < (byte) 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long readRawVarint64() throws java.io.IOException {
            /*
            r12 = this;
            r0 = r12.pos;
            r2 = r12.limit;
            r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
            if (r4 != 0) goto L_0x000a;
        L_0x0008:
            goto L_0x00e2;
        L_0x000a:
            r2 = 1;
            r4 = r0 + r2;
            r0 = com.google.protobuf.UnsafeUtil.getByte(r0);
            if (r0 < 0) goto L_0x0018;
        L_0x0014:
            r12.pos = r4;
            r0 = (long) r0;
            return r0;
        L_0x0018:
            r6 = r12.limit;
            r8 = r6 - r4;
            r6 = 9;
            r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
            if (r1 >= 0) goto L_0x0024;
        L_0x0022:
            goto L_0x00e2;
        L_0x0024:
            r1 = 0;
            r6 = r4 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r4);
            r1 = r1 << 7;
            r0 = r0 ^ r1;
            if (r0 >= 0) goto L_0x0036;
        L_0x0030:
            r0 = r0 ^ -128;
            r0 = (long) r0;
        L_0x0033:
            r2 = r0;
            goto L_0x00e9;
        L_0x0036:
            r1 = 0;
            r4 = r6 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r6);
            r1 = r1 << 14;
            r0 = r0 ^ r1;
            if (r0 < 0) goto L_0x0049;
        L_0x0042:
            r0 = r0 ^ 16256;
            r0 = (long) r0;
            r2 = r0;
        L_0x0046:
            r6 = r4;
            goto L_0x00e9;
        L_0x0049:
            r1 = 0;
            r6 = r4 + r2;
            r1 = com.google.protobuf.UnsafeUtil.getByte(r4);
            r1 = r1 << 21;
            r0 = r0 ^ r1;
            if (r0 >= 0) goto L_0x005b;
        L_0x0055:
            r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
            r0 = r0 ^ r1;
            r0 = (long) r0;
            goto L_0x0033;
        L_0x005b:
            r0 = (long) r0;
            r4 = r6 + r2;
            r6 = com.google.protobuf.UnsafeUtil.getByte(r6);
            r6 = (long) r6;
            r8 = 28;
            r6 = r6 << r8;
            r8 = r0 ^ r6;
            r0 = 0;
            r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r6 < 0) goto L_0x0074;
        L_0x006e:
            r0 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
            r2 = r8 ^ r0;
            goto L_0x0046;
        L_0x0074:
            r6 = 0;
            r6 = r4 + r2;
            r4 = com.google.protobuf.UnsafeUtil.getByte(r4);
            r4 = (long) r4;
            r10 = 35;
            r4 = r4 << r10;
            r10 = r8 ^ r4;
            r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
            if (r4 >= 0) goto L_0x008d;
        L_0x0085:
            r0 = -34093383808; // 0xfffffff80fe03f80 float:2.2112565E-29 double:NaN;
            r2 = r10 ^ r0;
            goto L_0x00e9;
        L_0x008d:
            r4 = 0;
            r4 = r6 + r2;
            r6 = com.google.protobuf.UnsafeUtil.getByte(r6);
            r6 = (long) r6;
            r8 = 42;
            r6 = r6 << r8;
            r8 = r10 ^ r6;
            r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r6 < 0) goto L_0x00a6;
        L_0x009e:
            r0 = 4363953127296; // 0x3f80fe03f80 float:2.2112565E-29 double:2.1560793202584E-311;
            r2 = r8 ^ r0;
            goto L_0x0046;
        L_0x00a6:
            r6 = 0;
            r6 = r4 + r2;
            r4 = com.google.protobuf.UnsafeUtil.getByte(r4);
            r4 = (long) r4;
            r10 = 49;
            r4 = r4 << r10;
            r10 = r8 ^ r4;
            r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
            if (r4 >= 0) goto L_0x00bf;
        L_0x00b7:
            r0 = -558586000294016; // 0xfffe03f80fe03f80 float:2.2112565E-29 double:NaN;
            r2 = r10 ^ r0;
            goto L_0x00e9;
        L_0x00bf:
            r4 = 0;
            r4 = r6 + r2;
            r6 = com.google.protobuf.UnsafeUtil.getByte(r6);
            r6 = (long) r6;
            r8 = 56;
            r6 = r6 << r8;
            r8 = r10 ^ r6;
            r6 = 71499008037633920; // 0xfe03f80fe03f80 float:2.2112565E-29 double:6.838959413692434E-304;
            r10 = r8 ^ r6;
            r6 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
            if (r6 >= 0) goto L_0x00e7;
        L_0x00d7:
            r6 = r4 + r2;
            r2 = com.google.protobuf.UnsafeUtil.getByte(r4);
            r2 = (long) r2;
            r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
            if (r4 >= 0) goto L_0x00e8;
        L_0x00e2:
            r0 = r12.readRawVarint64SlowPath();
            return r0;
        L_0x00e7:
            r6 = r4;
        L_0x00e8:
            r2 = r10;
        L_0x00e9:
            r12.pos = r6;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.readRawVarint64():long");
        }

        long readRawVarint64SlowPath() throws IOException {
            long j = 0;
            int i = 0;
            while (i < 64) {
                byte readRawByte = readRawByte();
                long j2 = j | (((long) (readRawByte & 127)) << i);
                if ((readRawByte & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                    return j2;
                }
                i += 7;
                j = j2;
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public int readRawLittleEndian32() throws IOException {
            long j = this.pos;
            if (this.limit - j < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = j + 4;
            return ((UnsafeUtil.getByte(j + 3) & 255) << 24) | (((UnsafeUtil.getByte(j) & 255) | ((UnsafeUtil.getByte(j + 1) & 255) << 8)) | ((UnsafeUtil.getByte(j + 2) & 255) << 16));
        }

        public long readRawLittleEndian64() throws IOException {
            long j = this.pos;
            if (this.limit - j < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = j + 8;
            return (((((((((long) UnsafeUtil.getByte(j)) & 255) | ((((long) UnsafeUtil.getByte(j + 1)) & 255) << 8)) | ((((long) UnsafeUtil.getByte(j + 2)) & 255) << 16)) | ((((long) UnsafeUtil.getByte(j + 3)) & 255) << 24)) | ((((long) UnsafeUtil.getByte(j + 4)) & 255) << 32)) | ((((long) UnsafeUtil.getByte(j + 5)) & 255) << 40)) | ((((long) UnsafeUtil.getByte(j + 6)) & 255) << 48)) | ((((long) UnsafeUtil.getByte(j + 7)) & 255) << 56);
        }

        public void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        public int pushLimit(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            i += getTotalBytesRead();
            int i2 = this.currentLimit;
            if (i > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        public void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        public int getBytesUntilLimit() {
            if (this.currentLimit == Integer.MAX_VALUE) {
                return -1;
            }
            return this.currentLimit - getTotalBytesRead();
        }

        public boolean isAtEnd() throws IOException {
            return this.pos == this.limit;
        }

        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        public byte readRawByte() throws IOException {
            if (this.pos == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            long j = this.pos;
            this.pos = j + 1;
            return UnsafeUtil.getByte(j);
        }

        public byte[] readRawBytes(int i) throws IOException {
            if (i >= 0 && i <= remaining()) {
                byte[] bArr = new byte[i];
                long j = (long) i;
                slice(this.pos, this.pos + j).get(bArr);
                this.pos += j;
                return bArr;
            } else if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        public void skipRawBytes(int i) throws IOException {
            if (i >= 0 && i <= remaining()) {
                this.pos += (long) i;
            } else if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            this.limit += (long) this.bufferSizeAfterLimit;
            int i = (int) (this.limit - this.startPos);
            if (i > this.currentLimit) {
                this.bufferSizeAfterLimit = i - this.currentLimit;
                this.limit -= (long) this.bufferSizeAfterLimit;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private int bufferPos(long j) {
            return (int) (j - this.address);
        }

        private java.nio.ByteBuffer slice(long r4, long r6) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = r3.buffer;
            r0 = r0.position();
            r1 = r3.buffer;
            r1 = r1.limit();
            r2 = r3.buffer;	 Catch:{ IllegalArgumentException -> 0x0031 }
            r4 = r3.bufferPos(r4);	 Catch:{ IllegalArgumentException -> 0x0031 }
            r2.position(r4);	 Catch:{ IllegalArgumentException -> 0x0031 }
            r4 = r3.buffer;	 Catch:{ IllegalArgumentException -> 0x0031 }
            r5 = r3.bufferPos(r6);	 Catch:{ IllegalArgumentException -> 0x0031 }
            r4.limit(r5);	 Catch:{ IllegalArgumentException -> 0x0031 }
            r4 = r3.buffer;	 Catch:{ IllegalArgumentException -> 0x0031 }
            r4 = r4.slice();	 Catch:{ IllegalArgumentException -> 0x0031 }
            r5 = r3.buffer;
            r5.position(r0);
            r5 = r3.buffer;
            r5.limit(r1);
            return r4;
        L_0x002f:
            r4 = move-exception;
            goto L_0x0036;
        L_0x0031:
            r4 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();	 Catch:{ all -> 0x002f }
            throw r4;	 Catch:{ all -> 0x002f }
        L_0x0036:
            r5 = r3.buffer;
            r5.position(r0);
            r5 = r3.buffer;
            r5.limit(r1);
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.slice(long, long):java.nio.ByteBuffer");
        }
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (j >>> 1) ^ (-(j & 1));
    }

    public abstract void checkLastTagWas(int i) throws InvalidProtocolBufferException;

    public abstract void enableAliasing(boolean z);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(int i, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readGroup(int i, Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readMessage(Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i, Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public abstract boolean skipField(int i) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipRawBytes(int i) throws IOException;

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    static CodedInputStream newInstance(InputStream inputStream, int i) {
        if (inputStream == null) {
            return newInstance(Internal.EMPTY_BYTE_ARRAY);
        }
        return new StreamDecoder(inputStream, i);
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i, int i2) {
        return newInstance(bArr, i, i2, false);
    }

    static CodedInputStream newInstance(byte[] bArr, int i, int i2, boolean z) {
        CodedInputStream arrayDecoder = new ArrayDecoder(bArr, i, i2, z);
        try {
            arrayDecoder.pushLimit(i2);
            return arrayDecoder;
        } catch (byte[] bArr2) {
            throw new IllegalArgumentException(bArr2);
        }
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.isSupported()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z);
        }
        z = new byte[byteBuffer.remaining()];
        byteBuffer.duplicate().get(z);
        return newInstance(z, null, z.length, true);
    }

    private CodedInputStream() {
        this.recursionLimit = 100;
        this.sizeLimit = Integer.MAX_VALUE;
        this.explicitDiscardUnknownFields = false;
    }

    public final int setRecursionLimit(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Recursion limit cannot be negative: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i2 = this.recursionLimit;
        this.recursionLimit = i;
        return i2;
    }

    public final int setSizeLimit(int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Size limit cannot be negative: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int i2 = this.sizeLimit;
        this.sizeLimit = i;
        return i2;
    }

    static void setProto3DiscardUnknownsByDefaultForTest() {
        proto3DiscardUnknownFieldsDefault = true;
    }

    static void setProto3KeepUnknownsByDefaultForTest() {
        proto3DiscardUnknownFieldsDefault = false;
    }

    static boolean getProto3DiscardUnknownFieldsDefault() {
        return proto3DiscardUnknownFieldsDefault;
    }

    final void discardUnknownFields() {
        this.explicitDiscardUnknownFields = true;
    }

    final void unsetDiscardUnknownFields() {
        this.explicitDiscardUnknownFields = false;
    }

    final boolean shouldDiscardUnknownFields() {
        return this.explicitDiscardUnknownFields;
    }

    final boolean shouldDiscardUnknownFieldsProto3() {
        return this.explicitDiscardUnknownFields ? true : proto3DiscardUnknownFieldsDefault;
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
            return i;
        }
        i &= 127;
        int i2 = 7;
        while (i2 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i |= (read & 127) << i2;
            if ((read & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                return i;
            }
            i2 += 7;
        }
        while (i2 < 64) {
            read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if ((read & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0) {
                return i;
            } else {
                i2 += 7;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    static int readRawVarint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
