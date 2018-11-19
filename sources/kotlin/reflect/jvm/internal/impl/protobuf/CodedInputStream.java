package kotlin.reflect.jvm.internal.impl.protobuf;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder;

public final class CodedInputStream {
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    private interface RefillCallback {
        void onRefill();
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (j >>> 1) ^ (-(j & 1));
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    static CodedInputStream newInstance(LiteralByteString literalByteString) {
        CodedInputStream codedInputStream = new CodedInputStream(literalByteString);
        try {
            codedInputStream.pushLimit(literalByteString.size());
            return codedInputStream;
        } catch (LiteralByteString literalByteString2) {
            throw new IllegalArgumentException(literalByteString2);
        }
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
        if (readRawVarint32 <= this.bufferSize - this.bufferPos && readRawVarint32 > 0) {
            String str = new String(this.buffer, this.bufferPos, readRawVarint32, "UTF-8");
            this.bufferPos += readRawVarint32;
            return str;
        } else if (readRawVarint32 == 0) {
            return "";
        } else {
            return new String(readRawBytesSlowPath(readRawVarint32), "UTF-8");
        }
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] bArr;
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferPos;
        if (readRawVarint32 <= this.bufferSize - i && readRawVarint32 > 0) {
            bArr = this.buffer;
            this.bufferPos = i + readRawVarint32;
        } else if (readRawVarint32 == 0) {
            return "";
        } else {
            bArr = readRawBytesSlowPath(readRawVarint32);
            i = 0;
        }
        if (Utf8.isValidUtf8(bArr, i, i + readRawVarint32)) {
            return new String(bArr, i, readRawVarint32, "UTF-8");
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public void readGroup(int i, Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i, 4));
        this.recursionDepth--;
    }

    public void readMessage(Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        readRawVarint32 = pushLimit(readRawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
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
        MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(null);
        this.recursionDepth--;
        popLimit(readRawVarint32);
        return messageLite;
    }

    public ByteString readBytes() throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (readRawVarint32 <= this.bufferSize - this.bufferPos && readRawVarint32 > 0) {
            ByteString boundedByteString = (this.bufferIsImmutable && this.enableAliasing) ? new BoundedByteString(this.buffer, this.bufferPos, readRawVarint32) : ByteString.copyFrom(this.buffer, this.bufferPos, readRawVarint32);
            this.bufferPos += readRawVarint32;
            return boundedByteString;
        } else if (readRawVarint32 == 0) {
            return ByteString.EMPTY;
        } else {
            return new LiteralByteString(readRawBytesSlowPath(readRawVarint32));
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
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int readRawVarint32() throws java.io.IOException {
        /*
        r10 = this;
        r0 = r10.bufferPos;
        r1 = r10.bufferSize;
        if (r1 != r0) goto L_0x0008;
    L_0x0006:
        goto L_0x0083;
    L_0x0008:
        r1 = r10.buffer;
        r2 = r0 + 1;
        r0 = r1[r0];
        if (r0 < 0) goto L_0x0013;
    L_0x0010:
        r10.bufferPos = r2;
        return r0;
    L_0x0013:
        r3 = r10.bufferSize;
        r3 = r3 - r2;
        r4 = 9;
        if (r3 >= r4) goto L_0x001b;
    L_0x001a:
        goto L_0x0083;
    L_0x001b:
        r3 = r2 + 1;
        r2 = r1[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        r4 = (long) r0;
        r6 = 0;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x002f;
    L_0x0029:
        r0 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        r6 = r4 ^ r0;
        r0 = (int) r6;
        goto L_0x0089;
    L_0x002f:
        r2 = r3 + 1;
        r3 = r1[r3];
        r3 = r3 << 14;
        r0 = r0 ^ r3;
        r3 = (long) r0;
        r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r5 < 0) goto L_0x0042;
    L_0x003b:
        r0 = 16256; // 0x3f80 float:2.278E-41 double:8.0315E-320;
        r5 = r3 ^ r0;
        r0 = (int) r5;
    L_0x0040:
        r3 = r2;
        goto L_0x0089;
    L_0x0042:
        r3 = r2 + 1;
        r2 = r1[r2];
        r2 = r2 << 21;
        r0 = r0 ^ r2;
        r4 = (long) r0;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x0055;
    L_0x004e:
        r0 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r6 = r4 ^ r0;
        r0 = (int) r6;
        goto L_0x0089;
    L_0x0055:
        r2 = r3 + 1;
        r3 = r1[r3];
        r4 = r3 << 28;
        r0 = r0 ^ r4;
        r4 = (long) r0;
        r6 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r8 = r4 ^ r6;
        r0 = (int) r8;
        if (r3 >= 0) goto L_0x0040;
    L_0x0065:
        r3 = r2 + 1;
        r2 = r1[r2];
        if (r2 >= 0) goto L_0x0089;
    L_0x006b:
        r2 = r3 + 1;
        r3 = r1[r3];
        if (r3 >= 0) goto L_0x0040;
    L_0x0071:
        r3 = r2 + 1;
        r2 = r1[r2];
        if (r2 >= 0) goto L_0x0089;
    L_0x0077:
        r2 = r3 + 1;
        r3 = r1[r3];
        if (r3 >= 0) goto L_0x0040;
    L_0x007d:
        r3 = r2 + 1;
        r1 = r1[r2];
        if (r1 >= 0) goto L_0x0089;
    L_0x0083:
        r0 = r10.readRawVarint64SlowPath();
        r0 = (int) r0;
        return r0;
    L_0x0089:
        r10.bufferPos = r3;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint32():int");
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readRawVarint64() throws java.io.IOException {
        /*
        r12 = this;
        r0 = r12.bufferPos;
        r1 = r12.bufferSize;
        if (r1 != r0) goto L_0x0008;
    L_0x0006:
        goto L_0x00cd;
    L_0x0008:
        r1 = r12.buffer;
        r2 = r0 + 1;
        r0 = r1[r0];
        if (r0 < 0) goto L_0x0014;
    L_0x0010:
        r12.bufferPos = r2;
        r0 = (long) r0;
        return r0;
    L_0x0014:
        r3 = r12.bufferSize;
        r3 = r3 - r2;
        r4 = 9;
        if (r3 >= r4) goto L_0x001d;
    L_0x001b:
        goto L_0x00cd;
    L_0x001d:
        r3 = r2 + 1;
        r2 = r1[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        r4 = (long) r0;
        r6 = 0;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x0031;
    L_0x002b:
        r0 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        r6 = r4 ^ r0;
        goto L_0x00d4;
    L_0x0031:
        r0 = r3 + 1;
        r2 = r1[r3];
        r2 = r2 << 14;
        r2 = (long) r2;
        r8 = r4 ^ r2;
        r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r2 < 0) goto L_0x0045;
    L_0x003e:
        r1 = 16256; // 0x3f80 float:2.278E-41 double:8.0315E-320;
        r6 = r8 ^ r1;
    L_0x0042:
        r3 = r0;
        goto L_0x00d4;
    L_0x0045:
        r3 = r0 + 1;
        r0 = r1[r0];
        r0 = r0 << 21;
        r4 = (long) r0;
        r10 = r8 ^ r4;
        r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x0059;
    L_0x0052:
        r0 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r6 = r10 ^ r0;
        goto L_0x00d4;
    L_0x0059:
        r0 = r3 + 1;
        r2 = r1[r3];
        r2 = (long) r2;
        r4 = 28;
        r2 = r2 << r4;
        r4 = r10 ^ r2;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 < 0) goto L_0x006d;
    L_0x0067:
        r1 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r6 = r4 ^ r1;
        goto L_0x0042;
    L_0x006d:
        r3 = r0 + 1;
        r0 = r1[r0];
        r8 = (long) r0;
        r0 = 35;
        r8 = r8 << r0;
        r10 = r4 ^ r8;
        r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x0083;
    L_0x007b:
        r0 = -34093383808; // 0xfffffff80fe03f80 float:2.2112565E-29 double:NaN;
        r6 = r10 ^ r0;
        goto L_0x00d4;
    L_0x0083:
        r0 = r3 + 1;
        r2 = r1[r3];
        r2 = (long) r2;
        r4 = 42;
        r2 = r2 << r4;
        r4 = r10 ^ r2;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 < 0) goto L_0x0099;
    L_0x0091:
        r1 = 4363953127296; // 0x3f80fe03f80 float:2.2112565E-29 double:2.1560793202584E-311;
        r6 = r4 ^ r1;
        goto L_0x0042;
    L_0x0099:
        r3 = r0 + 1;
        r0 = r1[r0];
        r8 = (long) r0;
        r0 = 49;
        r8 = r8 << r0;
        r10 = r4 ^ r8;
        r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r0 >= 0) goto L_0x00af;
    L_0x00a7:
        r0 = -558586000294016; // 0xfffe03f80fe03f80 float:2.2112565E-29 double:NaN;
        r6 = r10 ^ r0;
        goto L_0x00d4;
    L_0x00af:
        r0 = r3 + 1;
        r2 = r1[r3];
        r2 = (long) r2;
        r4 = 56;
        r2 = r2 << r4;
        r4 = r10 ^ r2;
        r2 = 71499008037633920; // 0xfe03f80fe03f80 float:2.2112565E-29 double:6.838959413692434E-304;
        r8 = r4 ^ r2;
        r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x00d2;
    L_0x00c4:
        r3 = r0 + 1;
        r0 = r1[r0];
        r0 = (long) r0;
        r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x00d3;
    L_0x00cd:
        r0 = r12.readRawVarint64SlowPath();
        return r0;
    L_0x00d2:
        r3 = r0;
    L_0x00d3:
        r6 = r8;
    L_0x00d4:
        r12.bufferPos = r3;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint64():long");
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
        int i = this.bufferPos;
        if (this.bufferSize - i < 4) {
            refillBuffer(4);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    public long readRawLittleEndian64() throws IOException {
        int i = this.bufferPos;
        if (this.bufferSize - i < 8) {
            refillBuffer(8);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 8;
        return (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48)) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private CodedInputStream(InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    private CodedInputStream(LiteralByteString literalByteString) {
        this.enableAliasing = false;
        this.currentLimit = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = literalByteString.bytes;
        this.bufferPos = literalByteString.getOffsetIntoBytes();
        this.bufferSize = this.bufferPos + literalByteString.size();
        this.totalBytesRetired = -this.bufferPos;
        this.input = null;
        this.bufferIsImmutable = true;
    }

    public int pushLimit(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        i += this.totalBytesRetired + this.bufferPos;
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
        if (this.currentLimit == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return -1;
        }
        return this.currentLimit - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() throws IOException {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    private void ensureAvailable(int i) throws IOException {
        if (this.bufferSize - this.bufferPos < i) {
            refillBuffer(i);
        }
    }

    private void refillBuffer(int i) throws IOException {
        if (tryRefillBuffer(i) == 0) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private boolean tryRefillBuffer(int i) throws IOException {
        StringBuilder stringBuilder;
        if (this.bufferPos + i <= this.bufferSize) {
            stringBuilder = new StringBuilder(77);
            stringBuilder.append("refillBuffer() called when ");
            stringBuilder.append(i);
            stringBuilder.append(" bytes were already available in buffer");
            throw new IllegalStateException(stringBuilder.toString());
        } else if ((this.totalBytesRetired + this.bufferPos) + i > this.currentLimit) {
            return false;
        } else {
            if (this.refillCallback != null) {
                this.refillCallback.onRefill();
            }
            if (this.input != null) {
                int i2 = this.bufferPos;
                if (i2 > 0) {
                    if (this.bufferSize > i2) {
                        System.arraycopy(this.buffer, i2, this.buffer, 0, this.bufferSize - i2);
                    }
                    this.totalBytesRetired += i2;
                    this.bufferSize -= i2;
                    this.bufferPos = 0;
                }
                i2 = this.input.read(this.buffer, this.bufferSize, this.buffer.length - this.bufferSize);
                if (i2 != 0 && i2 >= -1) {
                    if (i2 <= this.buffer.length) {
                        if (i2 > 0) {
                            this.bufferSize += i2;
                            if ((this.totalBytesRetired + i) - this.sizeLimit > 0) {
                                throw InvalidProtocolBufferException.sizeLimitExceeded();
                            }
                            recomputeBufferSizeAfterLimit();
                            return this.bufferSize >= i ? 1 : tryRefillBuffer(i);
                        }
                    }
                }
                stringBuilder = new StringBuilder(102);
                stringBuilder.append("InputStream#read(byte[]) returned invalid result: ");
                stringBuilder.append(i2);
                stringBuilder.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(stringBuilder.toString());
            }
            return false;
        }
    }

    public byte readRawByte() throws IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i = this.bufferPos;
        this.bufferPos = i + 1;
        return bArr[i];
    }

    private byte[] readRawBytesSlowPath(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        } else if ((this.totalBytesRetired + this.bufferPos) + i > this.currentLimit) {
            skipRawBytes((this.currentLimit - this.totalBytesRetired) - this.bufferPos);
            throw InvalidProtocolBufferException.truncatedMessage();
        } else if (i < 4096) {
            Object obj = new byte[i];
            r2 = this.bufferSize - this.bufferPos;
            System.arraycopy(this.buffer, this.bufferPos, obj, 0, r2);
            this.bufferPos = this.bufferSize;
            i -= r2;
            ensureAvailable(i);
            System.arraycopy(this.buffer, 0, obj, r2, i);
            this.bufferPos = i;
            return obj;
        } else {
            r2 = this.bufferPos;
            int i2 = this.bufferSize;
            this.totalBytesRetired += this.bufferSize;
            this.bufferPos = 0;
            this.bufferSize = 0;
            i2 -= r2;
            int i3 = i - i2;
            List<byte[]> arrayList = new ArrayList();
            while (i3 > 0) {
                Object obj2 = new byte[Math.min(i3, 4096)];
                int i4 = 0;
                while (i4 < obj2.length) {
                    int read = this.input == null ? -1 : this.input.read(obj2, i4, obj2.length - i4);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += read;
                    i4 += read;
                }
                i3 -= obj2.length;
                arrayList.add(obj2);
            }
            i = new byte[i];
            System.arraycopy(this.buffer, r2, i, 0, i2);
            for (byte[] bArr : arrayList) {
                System.arraycopy(bArr, 0, i, i2, bArr.length);
                i2 += bArr.length;
            }
            return i;
        }
    }

    public void skipRawBytes(int i) throws IOException {
        if (i > this.bufferSize - this.bufferPos || i < 0) {
            skipRawBytesSlowPath(i);
        } else {
            this.bufferPos += i;
        }
    }

    private void skipRawBytesSlowPath(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if ((this.totalBytesRetired + this.bufferPos) + i > this.currentLimit) {
            skipRawBytes((this.currentLimit - this.totalBytesRetired) - this.bufferPos);
            throw InvalidProtocolBufferException.truncatedMessage();
        } else {
            int i2 = this.bufferSize - this.bufferPos;
            this.bufferPos = this.bufferSize;
            refillBuffer(1);
            while (true) {
                int i3 = i - i2;
                if (i3 > this.bufferSize) {
                    i2 += this.bufferSize;
                    this.bufferPos = this.bufferSize;
                    refillBuffer(1);
                } else {
                    this.bufferPos = i3;
                    return;
                }
            }
        }
    }
}
