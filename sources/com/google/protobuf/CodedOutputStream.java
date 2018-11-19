package com.google.protobuf;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();
    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private boolean serializationDeterministic;

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super(MESSAGE);
        }

        OutOfSpaceException(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            stringBuilder.append(str);
            super(stringBuilder.toString());
        }

        OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        OutOfSpaceException(String str, Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            stringBuilder.append(str);
            super(stringBuilder.toString(), th);
        }
    }

    private static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        AbstractBufferedEncoder(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            this.buffer = new byte[Math.max(i, 20)];
            this.limit = this.buffer.length;
        }

        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        final void buffer(byte b) {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = b;
            this.totalBytesWritten++;
        }

        final void bufferTag(int i, int i2) {
            bufferUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        final void bufferInt32NoTag(int i) {
            if (i >= 0) {
                bufferUInt32NoTag(i);
            } else {
                bufferUInt64NoTag((long) i);
            }
        }

        final void bufferUInt32NoTag(int i) {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                byte[] bArr;
                int i2;
                long j = (long) this.position;
                while ((i & -128) != 0) {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    UnsafeUtil.putByte(bArr, (long) i2, (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                    i >>>= 7;
                }
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                UnsafeUtil.putByte(bArr, (long) i2, (byte) i);
                this.totalBytesWritten += (int) (((long) this.position) - j);
                return;
            }
            byte[] bArr2;
            int i3;
            while ((i & -128) != 0) {
                bArr2 = this.buffer;
                i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                this.totalBytesWritten++;
                i >>>= 7;
            }
            bArr2 = this.buffer;
            i3 = this.position;
            this.position = i3 + 1;
            bArr2[i3] = (byte) i;
            this.totalBytesWritten++;
        }

        final void bufferUInt64NoTag(long j) {
            byte[] bArr;
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                long j2 = (long) this.position;
                while ((j & -128) != 0) {
                    bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    UnsafeUtil.putByte(bArr, (long) i, (byte) ((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                    j >>>= 7;
                }
                bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                UnsafeUtil.putByte(bArr, (long) i2, (byte) ((int) j));
                this.totalBytesWritten += (int) (((long) this.position) - j2);
                return;
            }
            while ((j & -128) != 0) {
                bArr = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr[i3] = (byte) ((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                this.totalBytesWritten++;
                j >>>= 7;
            }
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) ((int) j);
            this.totalBytesWritten++;
        }

        final void bufferFixed32NoTag(int i) {
            byte[] bArr = this.buffer;
            int i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) ((i >> 8) & 255);
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) ((i >> 16) & 255);
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            bArr[i2] = (byte) ((i >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        final void bufferFixed64NoTag(long j) {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) ((j >> 8) & 255));
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) ((j >> 16) & 255));
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) ((int) ((j >> 24) & 255));
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) (((int) (j >> 32)) & 255);
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) (((int) (j >> 40)) & 255);
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) (((int) (j >> 48)) & 255);
            bArr = this.buffer;
            i = this.position;
            this.position = i + 1;
            bArr[i] = (byte) (((int) (j >> 56)) & 255);
            this.totalBytesWritten += 8;
        }
    }

    private static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        public void flush() {
        }

        ArrayEncoder(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if (((i | i2) | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            this.buffer = bArr;
            this.offset = i;
            this.position = i;
            this.limit = i3;
        }

        public final void writeTag(int i, int i2) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public final void writeInt32(int i, int i2) throws IOException {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        public final void writeUInt32(int i, int i2) throws IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        public final void writeFixed32(int i, int i2) throws IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        public final void writeUInt64(int i, long j) throws IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        public final void writeFixed64(int i, long j) throws IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        public final void writeBool(int i, boolean z) throws IOException {
            writeTag(i, 0);
            write((byte) z);
        }

        public final void writeString(int i, String str) throws IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public final void writeBytes(int i, ByteString byteString) throws IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public final void writeByteArray(int i, byte[] bArr) throws IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public final void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public final void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo((ByteOutput) this);
        }

        public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            byteBuffer = byteBuffer.duplicate();
            byteBuffer.clear();
            write(byteBuffer);
        }

        public final void writeMessage(int i, MessageLite messageLite) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public final void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public final void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo((CodedOutputStream) this);
        }

        public final void write(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (byte b2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), b2);
            }
        }

        public final void writeInt32NoTag(int i) throws IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag((long) i);
            }
        }

        public final void writeUInt32NoTag(int i) throws IOException {
            byte[] bArr;
            int i2;
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS || spaceLeft() < 10) {
                while ((i & -128) != 0) {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    i >>>= 7;
                }
                try {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) i;
                    return;
                } catch (int i3) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), i3);
                }
            }
            while ((i3 & -128) != 0) {
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                UnsafeUtil.putByte(bArr, (long) i2, (byte) ((i3 & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                i3 >>>= 7;
            }
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            UnsafeUtil.putByte(bArr, (long) i2, (byte) i3);
        }

        public final void writeFixed32NoTag(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) ((i >> 8) & 255);
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) ((i >> 16) & 255);
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) ((i >> 24) & 255);
            } catch (int i3) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), i3);
            }
        }

        public final void writeUInt64NoTag(long j) throws IOException {
            byte[] bArr;
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS || spaceLeft() < 10) {
                while ((j & -128) != 0) {
                    bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                    j >>>= 7;
                }
                try {
                    bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((int) j);
                    return;
                } catch (long j2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), j2);
                }
            }
            while ((j2 & -128) != 0) {
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                UnsafeUtil.putByte(bArr, (long) i, (byte) ((((int) j2) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                j2 >>>= 7;
            }
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            UnsafeUtil.putByte(bArr, (long) i2, (byte) ((int) j2));
        }

        public final void writeFixed64NoTag(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) (((int) (j >> 8)) & 255);
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) (((int) (j >> 16)) & 255);
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) (((int) (j >> 24)) & 255);
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) (((int) (j >> 32)) & 255);
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) (((int) (j >> 40)) & 255);
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) (((int) (j >> 48)) & 255);
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) (((int) (j >> 56)) & 255);
            } catch (long j2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), j2);
            }
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (byte[] bArr2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)}), bArr2);
            }
        }

        public final void writeLazy(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        public final void write(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, remaining);
                this.position += remaining;
            } catch (ByteBuffer byteBuffer2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(remaining)}), byteBuffer2);
            }
        }

        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        public final void writeStringNoTag(String str) throws IOException {
            int i = this.position;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    this.position = i + computeUInt32SizeNoTag2;
                    computeUInt32SizeNoTag = Utf8.encode(str, this.buffer, this.position, spaceLeft());
                    this.position = i;
                    writeUInt32NoTag((computeUInt32SizeNoTag - i) - computeUInt32SizeNoTag2);
                    this.position = computeUInt32SizeNoTag;
                    return;
                }
                writeUInt32NoTag(Utf8.encodedLength(str));
                this.position = Utf8.encode(str, this.buffer, this.position, spaceLeft());
            } catch (UnpairedSurrogateException e) {
                this.position = i;
                inefficientWriteStringNoTag(str, e);
            } catch (Throwable e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public final int spaceLeft() {
            return this.limit - this.position;
        }

        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }
    }

    private static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        SafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        public void writeTag(int i, int i2) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public void writeInt32(int i, int i2) throws IOException {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        public void writeUInt32(int i, int i2) throws IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        public void writeFixed32(int i, int i2) throws IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        public void writeUInt64(int i, long j) throws IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        public void writeFixed64(int i, long j) throws IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        public void writeBool(int i, boolean z) throws IOException {
            writeTag(i, 0);
            write((byte) z);
        }

        public void writeString(int i, String str) throws IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public void writeBytes(int i, ByteString byteString) throws IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public void writeByteArray(int i, byte[] bArr) throws IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public void writeMessage(int i, MessageLite messageLite) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo((CodedOutputStream) this);
        }

        public void write(byte b) throws IOException {
            try {
                this.buffer.put(b);
            } catch (Throwable e) {
                throw new OutOfSpaceException(e);
            }
        }

        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo((ByteOutput) this);
        }

        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            byteBuffer = byteBuffer.duplicate();
            byteBuffer.clear();
            write(byteBuffer);
        }

        public void writeInt32NoTag(int i) throws IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag((long) i);
            }
        }

        public void writeUInt32NoTag(int i) throws IOException {
            while ((i & -128) != 0) {
                this.buffer.put((byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                i >>>= 7;
            }
            try {
                this.buffer.put((byte) i);
            } catch (Throwable e) {
                throw new OutOfSpaceException(e);
            }
        }

        public void writeFixed32NoTag(int i) throws IOException {
            try {
                this.buffer.putInt(i);
            } catch (Throwable e) {
                throw new OutOfSpaceException(e);
            }
        }

        public void writeUInt64NoTag(long j) throws IOException {
            while ((j & -128) != 0) {
                this.buffer.put((byte) ((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                j >>>= 7;
            }
            try {
                this.buffer.put((byte) ((int) j));
            } catch (Throwable e) {
                throw new OutOfSpaceException(e);
            }
        }

        public void writeFixed64NoTag(long j) throws IOException {
            try {
                this.buffer.putLong(j);
            } catch (Throwable e) {
                throw new OutOfSpaceException(e);
            }
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.buffer.put(bArr, i, i2);
            } catch (Throwable e) {
                throw new OutOfSpaceException(e);
            } catch (Throwable e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public void writeLazy(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                this.buffer.put(byteBuffer);
            } catch (Throwable e) {
                throw new OutOfSpaceException(e);
            }
        }

        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        public void writeStringNoTag(String str) throws IOException {
            int position = this.buffer.position();
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    computeUInt32SizeNoTag = this.buffer.position() + computeUInt32SizeNoTag2;
                    this.buffer.position(computeUInt32SizeNoTag);
                    encode(str);
                    computeUInt32SizeNoTag2 = this.buffer.position();
                    this.buffer.position(position);
                    writeUInt32NoTag(computeUInt32SizeNoTag2 - computeUInt32SizeNoTag);
                    this.buffer.position(computeUInt32SizeNoTag2);
                    return;
                }
                writeUInt32NoTag(Utf8.encodedLength(str));
                encode(str);
            } catch (UnpairedSurrogateException e) {
                this.buffer.position(position);
                inefficientWriteStringNoTag(str, e);
            } catch (Throwable e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public void flush() {
            this.originalBuffer.position(this.buffer.position());
        }

        public int spaceLeft() {
            return this.buffer.remaining();
        }

        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        private void encode(String str) throws IOException {
            try {
                Utf8.encodeUtf8(str, this.buffer);
            } catch (Throwable e) {
                throw new OutOfSpaceException(e);
            }
        }
    }

    private static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit = (this.limit - 10);
        private final ByteBuffer originalBuffer;
        private long position = this.initialPosition;

        UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.address = UnsafeUtil.addressOffset(byteBuffer);
            this.initialPosition = this.address + ((long) byteBuffer.position());
            this.limit = this.address + ((long) byteBuffer.limit());
        }

        static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        public void writeTag(int i, int i2) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public void writeInt32(int i, int i2) throws IOException {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        public void writeUInt32(int i, int i2) throws IOException {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        public void writeFixed32(int i, int i2) throws IOException {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        public void writeUInt64(int i, long j) throws IOException {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        public void writeFixed64(int i, long j) throws IOException {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        public void writeBool(int i, boolean z) throws IOException {
            writeTag(i, 0);
            write((byte) z);
        }

        public void writeString(int i, String str) throws IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public void writeBytes(int i, ByteString byteString) throws IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public void writeByteArray(int i, byte[] bArr) throws IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public void writeMessage(int i, MessageLite messageLite) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo((CodedOutputStream) this);
        }

        public void write(byte b) throws IOException {
            if (this.position >= this.limit) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(1)}));
            }
            long j = this.position;
            this.position = j + 1;
            UnsafeUtil.putByte(j, b);
        }

        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo((ByteOutput) this);
        }

        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            byteBuffer = byteBuffer.duplicate();
            byteBuffer.clear();
            write(byteBuffer);
        }

        public void writeInt32NoTag(int i) throws IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag((long) i);
            }
        }

        public void writeUInt32NoTag(int i) throws IOException {
            long j;
            if (this.position <= this.oneVarintLimit) {
                while ((i & -128) != 0) {
                    j = this.position;
                    this.position = j + 1;
                    UnsafeUtil.putByte(j, (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                    i >>>= 7;
                }
                j = this.position;
                this.position = j + 1;
                UnsafeUtil.putByte(j, (byte) i);
                return;
            }
            while (this.position < this.limit) {
                if ((i & -128) == 0) {
                    j = this.position;
                    this.position = j + 1;
                    UnsafeUtil.putByte(j, (byte) i);
                    return;
                }
                j = this.position;
                this.position = j + 1;
                UnsafeUtil.putByte(j, (byte) ((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                i >>>= 7;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(1)}));
        }

        public void writeFixed32NoTag(int i) throws IOException {
            this.buffer.putInt(bufferPos(this.position), i);
            this.position += 4;
        }

        public void writeUInt64NoTag(long j) throws IOException {
            if (this.position <= this.oneVarintLimit) {
                while ((j & -128) != 0) {
                    long j2 = this.position;
                    this.position = j2 + 1;
                    UnsafeUtil.putByte(j2, (byte) ((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                    j >>>= 7;
                }
                long j3 = this.position;
                this.position = j3 + 1;
                UnsafeUtil.putByte(j3, (byte) ((int) j));
                return;
            }
            while (this.position < this.limit) {
                if ((j & -128) == 0) {
                    j3 = this.position;
                    this.position = j3 + 1;
                    UnsafeUtil.putByte(j3, (byte) ((int) j));
                    return;
                }
                j2 = this.position;
                this.position = j2 + 1;
                UnsafeUtil.putByte(j2, (byte) ((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH));
                j >>>= 7;
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(1)}));
        }

        public void writeFixed64NoTag(long j) throws IOException {
            this.buffer.putLong(bufferPos(this.position), j);
            this.position += 8;
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                if (this.limit - j >= this.position) {
                    UnsafeUtil.copyMemory(bArr, (long) i, this.position, j);
                    this.position += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i2)}));
        }

        public void writeLazy(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        public void write(ByteBuffer byteBuffer) throws IOException {
            try {
                int remaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += (long) remaining;
            } catch (Throwable e) {
                throw new OutOfSpaceException(e);
            }
        }

        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        public void writeStringNoTag(String str) throws IOException {
            long j = this.position;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    computeUInt32SizeNoTag = bufferPos(this.position) + computeUInt32SizeNoTag2;
                    this.buffer.position(computeUInt32SizeNoTag);
                    Utf8.encodeUtf8(str, this.buffer);
                    computeUInt32SizeNoTag2 = this.buffer.position() - computeUInt32SizeNoTag;
                    writeUInt32NoTag(computeUInt32SizeNoTag2);
                    this.position += (long) computeUInt32SizeNoTag2;
                    return;
                }
                computeUInt32SizeNoTag = Utf8.encodedLength(str);
                writeUInt32NoTag(computeUInt32SizeNoTag);
                repositionBuffer(this.position);
                Utf8.encodeUtf8(str, this.buffer);
                this.position += (long) computeUInt32SizeNoTag;
            } catch (UnpairedSurrogateException e) {
                this.position = j;
                repositionBuffer(this.position);
                inefficientWriteStringNoTag(str, e);
            } catch (Throwable e2) {
                throw new OutOfSpaceException(e2);
            } catch (Throwable e22) {
                throw new OutOfSpaceException(e22);
            }
        }

        public void flush() {
            this.originalBuffer.position(bufferPos(this.position));
        }

        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        private void repositionBuffer(long j) {
            this.buffer.position(bufferPos(j));
        }

        private int bufferPos(long j) {
            return (int) (j - this.address);
        }
    }

    private static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        ByteOutputEncoder(ByteOutput byteOutput, int i) {
            super(i);
            if (byteOutput == null) {
                throw new NullPointerException("out");
            }
            this.out = byteOutput;
        }

        public void writeTag(int i, int i2) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public void writeInt32(int i, int i2) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferInt32NoTag(i2);
        }

        public void writeUInt32(int i, int i2) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt32NoTag(i2);
        }

        public void writeFixed32(int i, int i2) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i, 5);
            bufferFixed32NoTag(i2);
        }

        public void writeUInt64(int i, long j) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt64NoTag(j);
        }

        public void writeFixed64(int i, long j) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i, 1);
            bufferFixed64NoTag(j);
        }

        public void writeBool(int i, boolean z) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i, 0);
            buffer((byte) z);
        }

        public void writeString(int i, String str) throws IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public void writeBytes(int i, ByteString byteString) throws IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public void writeByteArray(int i, byte[] bArr) throws IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo((ByteOutput) this);
        }

        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            byteBuffer = byteBuffer.duplicate();
            byteBuffer.clear();
            write(byteBuffer);
        }

        public void writeMessage(int i, MessageLite messageLite) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo((CodedOutputStream) this);
        }

        public void write(byte b) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b);
        }

        public void writeInt32NoTag(int i) throws IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag((long) i);
            }
        }

        public void writeUInt32NoTag(int i) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt32NoTag(i);
        }

        public void writeFixed32NoTag(int i) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i);
        }

        public void writeUInt64NoTag(long j) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j);
        }

        public void writeFixed64NoTag(long j) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j);
        }

        public void writeStringNoTag(String str) throws IOException {
            int length = str.length() * 3;
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i = computeUInt32SizeNoTag + length;
            if (i > this.limit) {
                byte[] bArr = new byte[length];
                str = Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(str);
                writeLazy(bArr, 0, str);
                return;
            }
            if (i > this.limit - this.position) {
                doFlush();
            }
            length = this.position;
            try {
                i = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (i == computeUInt32SizeNoTag) {
                    this.position = length + i;
                    computeUInt32SizeNoTag = Utf8.encode(str, this.buffer, this.position, this.limit - this.position);
                    this.position = length;
                    int i2 = (computeUInt32SizeNoTag - length) - i;
                    bufferUInt32NoTag(i2);
                    this.position = computeUInt32SizeNoTag;
                    this.totalBytesWritten += i2;
                } else {
                    computeUInt32SizeNoTag = Utf8.encodedLength(str);
                    bufferUInt32NoTag(computeUInt32SizeNoTag);
                    this.position = Utf8.encode(str, this.buffer, this.position, computeUInt32SizeNoTag);
                    this.totalBytesWritten += computeUInt32SizeNoTag;
                }
            } catch (UnpairedSurrogateException e) {
                this.totalBytesWritten -= this.position - length;
                this.position = length;
                inefficientWriteStringNoTag(str, e);
            } catch (Throwable e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            flush();
            this.out.write(bArr, i, i2);
            this.totalBytesWritten += i2;
        }

        public void writeLazy(byte[] bArr, int i, int i2) throws IOException {
            flush();
            this.out.writeLazy(bArr, i, i2);
            this.totalBytesWritten += i2;
        }

        public void write(ByteBuffer byteBuffer) throws IOException {
            flush();
            int remaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += remaining;
        }

        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            flush();
            int remaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += remaining;
        }

        private void flushIfNotAvailable(int i) throws IOException {
            if (this.limit - this.position < i) {
                doFlush();
            }
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }
    }

    private static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        HeapNioEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        public void flush() {
            this.byteBuffer.position(this.initialPosition + getTotalBytesWritten());
        }
    }

    private static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        OutputStreamEncoder(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        public void writeTag(int i, int i2) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public void writeInt32(int i, int i2) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferInt32NoTag(i2);
        }

        public void writeUInt32(int i, int i2) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt32NoTag(i2);
        }

        public void writeFixed32(int i, int i2) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i, 5);
            bufferFixed32NoTag(i2);
        }

        public void writeUInt64(int i, long j) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i, 0);
            bufferUInt64NoTag(j);
        }

        public void writeFixed64(int i, long j) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i, 1);
            bufferFixed64NoTag(j);
        }

        public void writeBool(int i, boolean z) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i, 0);
            buffer((byte) z);
        }

        public void writeString(int i, String str) throws IOException {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public void writeBytes(int i, ByteString byteString) throws IOException {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public void writeByteArray(int i, byte[] bArr) throws IOException {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo((ByteOutput) this);
        }

        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            byteBuffer = byteBuffer.duplicate();
            byteBuffer.clear();
            write(byteBuffer);
        }

        public void writeMessage(int i, MessageLite messageLite) throws IOException {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo((CodedOutputStream) this);
        }

        public void write(byte b) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b);
        }

        public void writeInt32NoTag(int i) throws IOException {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag((long) i);
            }
        }

        public void writeUInt32NoTag(int i) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt32NoTag(i);
        }

        public void writeFixed32NoTag(int i) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i);
        }

        public void writeUInt64NoTag(long j) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j);
        }

        public void writeFixed64NoTag(long j) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j);
        }

        public void writeStringNoTag(String str) throws IOException {
            int i;
            try {
                int length = str.length() * 3;
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                i = computeUInt32SizeNoTag + length;
                if (i > this.limit) {
                    byte[] bArr = new byte[length];
                    length = Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(length);
                    writeLazy(bArr, 0, length);
                    return;
                }
                int i2;
                if (i > this.limit - this.position) {
                    doFlush();
                }
                length = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                i = this.position;
                if (length == computeUInt32SizeNoTag) {
                    this.position = i + length;
                    computeUInt32SizeNoTag = Utf8.encode(str, this.buffer, this.position, this.limit - this.position);
                    this.position = i;
                    i2 = (computeUInt32SizeNoTag - i) - length;
                    bufferUInt32NoTag(i2);
                    this.position = computeUInt32SizeNoTag;
                } else {
                    i2 = Utf8.encodedLength(str);
                    bufferUInt32NoTag(i2);
                    this.position = Utf8.encode(str, this.buffer, this.position, i2);
                }
                this.totalBytesWritten += i2;
            } catch (UnpairedSurrogateException e) {
                this.totalBytesWritten -= this.position - i;
                this.position = i;
                throw e;
            } catch (Throwable e2) {
                throw new OutOfSpaceException(e2);
            } catch (UnpairedSurrogateException e3) {
                inefficientWriteStringNoTag(str, e3);
            }
        }

        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.limit - this.position >= i2) {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
                this.totalBytesWritten += i2;
                return;
            }
            int i3 = this.limit - this.position;
            System.arraycopy(bArr, i, this.buffer, this.position, i3);
            i += i3;
            i2 -= i3;
            this.position = this.limit;
            this.totalBytesWritten += i3;
            doFlush();
            if (i2 <= this.limit) {
                System.arraycopy(bArr, i, this.buffer, 0, i2);
                this.position = i2;
            } else {
                this.out.write(bArr, i, i2);
            }
            this.totalBytesWritten += i2;
        }

        public void writeLazy(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        public void write(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            if (this.limit - this.position >= remaining) {
                byteBuffer.get(this.buffer, this.position, remaining);
                this.position += remaining;
                this.totalBytesWritten += remaining;
                return;
            }
            int i = this.limit - this.position;
            byteBuffer.get(this.buffer, this.position, i);
            remaining -= i;
            this.position = this.limit;
            this.totalBytesWritten += i;
            doFlush();
            while (remaining > this.limit) {
                byteBuffer.get(this.buffer, 0, this.limit);
                this.out.write(this.buffer, 0, this.limit);
                remaining -= this.limit;
                this.totalBytesWritten += this.limit;
            }
            byteBuffer.get(this.buffer, 0, remaining);
            this.position = remaining;
            this.totalBytesWritten += remaining;
        }

        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        private void flushIfNotAvailable(int i) throws IOException {
            if (this.limit - this.position < i) {
                doFlush();
            }
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    static int computePreferredBufferSize(int i) {
        return i > 4096 ? 4096 : i;
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeUInt32SizeNoTag(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int computeUInt64SizeNoTag(long j) {
        if ((j & -128) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i;
        if ((j & -34359738368L) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((j & -2097152) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public abstract int spaceLeft();

    public abstract void write(byte b) throws IOException;

    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeBool(int i, boolean z) throws IOException;

    public abstract void writeByteArray(int i, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException;

    abstract void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public abstract void writeFixed32(int i, int i2) throws IOException;

    public abstract void writeFixed32NoTag(int i) throws IOException;

    public abstract void writeFixed64(int i, long j) throws IOException;

    public abstract void writeFixed64NoTag(long j) throws IOException;

    public abstract void writeInt32(int i, int i2) throws IOException;

    public abstract void writeInt32NoTag(int i) throws IOException;

    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    public abstract void writeLazy(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeMessage(int i, MessageLite messageLite) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    public abstract void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException;

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public abstract void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException;

    public abstract void writeString(int i, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i, int i2) throws IOException;

    public abstract void writeUInt32(int i, int i2) throws IOException;

    public abstract void writeUInt32NoTag(int i) throws IOException;

    public abstract void writeUInt64(int i, long j) throws IOException;

    public abstract void writeUInt64NoTag(long j) throws IOException;

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        return new OutputStreamEncoder(outputStream, i);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new ArrayEncoder(bArr, i, i2);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new HeapNioEncoder(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        if (UnsafeDirectNioEncoder.isSupported()) {
            byteBuffer = newUnsafeInstance(byteBuffer);
        } else {
            byteBuffer = newSafeInstance(byteBuffer);
        }
        return byteBuffer;
    }

    static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new UnsafeDirectNioEncoder(byteBuffer);
    }

    static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new SafeDirectNioEncoder(byteBuffer);
    }

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i) {
        return newInstance(byteBuffer);
    }

    static CodedOutputStream newInstance(ByteOutput byteOutput, int i) {
        if (i >= 0) {
            return new ByteOutputEncoder(byteOutput, i);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }

    private CodedOutputStream() {
    }

    public final void writeSInt32(int i, int i2) throws IOException {
        writeUInt32(i, encodeZigZag32(i2));
    }

    public final void writeSFixed32(int i, int i2) throws IOException {
        writeFixed32(i, i2);
    }

    public final void writeInt64(int i, long j) throws IOException {
        writeUInt64(i, j);
    }

    public final void writeSInt64(int i, long j) throws IOException {
        writeUInt64(i, encodeZigZag64(j));
    }

    public final void writeSFixed64(int i, long j) throws IOException {
        writeFixed64(i, j);
    }

    public final void writeFloat(int i, float f) throws IOException {
        writeFixed32(i, Float.floatToRawIntBits(f));
    }

    public final void writeDouble(int i, double d) throws IOException {
        writeFixed64(i, Double.doubleToRawLongBits(d));
    }

    public final void writeEnum(int i, int i2) throws IOException {
        writeInt32(i, i2);
    }

    public final void writeRawByte(byte b) throws IOException {
        write(b);
    }

    public final void writeRawByte(int i) throws IOException {
        write((byte) i);
    }

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.writeTo((ByteOutput) this);
    }

    public final void writeSInt32NoTag(int i) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i));
    }

    public final void writeSFixed32NoTag(int i) throws IOException {
        writeFixed32NoTag(i);
    }

    public final void writeInt64NoTag(long j) throws IOException {
        writeUInt64NoTag(j);
    }

    public final void writeSInt64NoTag(long j) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j));
    }

    public final void writeSFixed64NoTag(long j) throws IOException {
        writeFixed64NoTag(j);
    }

    public final void writeFloatNoTag(float f) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f));
    }

    public final void writeDoubleNoTag(double d) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d));
    }

    public final void writeBoolNoTag(boolean z) throws IOException {
        write((byte) z);
    }

    public final void writeEnumNoTag(int i) throws IOException {
        writeInt32NoTag(i);
    }

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeTagSize(i) + computeUInt32SizeNoTag(i2);
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeTagSize(i) + computeSInt32SizeNoTag(i2);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeFixed32SizeNoTag(i2);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeSFixed32SizeNoTag(i2);
    }

    public static int computeInt64Size(int i, long j) {
        return computeTagSize(i) + computeInt64SizeNoTag(j);
    }

    public static int computeUInt64Size(int i, long j) {
        return computeTagSize(i) + computeUInt64SizeNoTag(j);
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeFixed64Size(int i, long j) {
        return computeTagSize(i) + computeFixed64SizeNoTag(j);
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeTagSize(i) + computeSFixed64SizeNoTag(j);
    }

    public static int computeFloatSize(int i, float f) {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    public static int computeDoubleSize(int i, double d) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeStringSize(int i, String str) {
        return computeTagSize(i) + computeStringSizeNoTag(str);
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeByteArraySize(int i, byte[] bArr) {
        return computeTagSize(i) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteBufferSize(int i, ByteBuffer byteBuffer) {
        return computeTagSize(i) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeLazyFieldSize(int i, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSetExtensionSize(int i, MessageLite messageLite) {
        return ((computeTagSize(1) * 2) + computeUInt32Size(2, i)) + computeMessageSize(3, messageLite);
    }

    public static int computeRawMessageSetExtensionSize(int i, ByteString byteString) {
        return ((computeTagSize(1) * 2) + computeUInt32Size(2, i)) + computeBytesSize(3, byteString);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i, LazyFieldLite lazyFieldLite) {
        return ((computeTagSize(1) * 2) + computeUInt32Size(2, i)) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i, 0));
    }

    public static int computeInt32SizeNoTag(int i) {
        return i >= 0 ? computeUInt32SizeNoTag(i) : 10;
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeUInt32SizeNoTag(encodeZigZag32(i));
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(encodeZigZag64(j));
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeStringSizeNoTag(java.lang.String r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = com.google.protobuf.Utf8.encodedLength(r1);	 Catch:{ UnpairedSurrogateException -> 0x0005 }
        goto L_0x000c;
    L_0x0005:
        r0 = com.google.protobuf.Internal.UTF_8;
        r1 = r1.getBytes(r0);
        r0 = r1.length;
    L_0x000c:
        r1 = computeLengthDelimitedFieldSize(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedOutputStream.computeStringSizeNoTag(java.lang.String):int");
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    static int computeLengthDelimitedFieldSize(int i) {
        return computeUInt32SizeNoTag(i) + i;
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void inefficientWriteStringNoTag(String str, UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", unpairedSurrogateException);
        str = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(str.length);
            writeLazy(str, null, str.length);
        } catch (Throwable e) {
            throw new OutOfSpaceException(e);
        } catch (String str2) {
            throw str2;
        }
    }

    @Deprecated
    public final void writeGroup(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    @Deprecated
    public static int computeGroupSize(int i, MessageLite messageLite) {
        return (computeTagSize(i) * 2) + computeGroupSizeNoTag(messageLite);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    @Deprecated
    public final void writeRawVarint32(int i) throws IOException {
        writeUInt32NoTag(i);
    }

    @Deprecated
    public final void writeRawVarint64(long j) throws IOException {
        writeUInt64NoTag(j);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i) {
        return computeUInt32SizeNoTag(i);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j) {
        return computeUInt64SizeNoTag(j);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i) throws IOException {
        writeFixed32NoTag(i);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j) throws IOException {
        writeFixed64NoTag(j);
    }
}
