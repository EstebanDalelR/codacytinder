package com.crashlytics.android.core;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;

final class CodedOutputStream implements Flushable {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private final byte[] buffer;
    private final int limit;
    private final OutputStream output;
    private int position;

    static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
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

    public static int computeRawVarint32Size(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j) {
        return (j & -128) == 0 ? 1 : (j & -16384) == 0 ? 2 : (j & -2097152) == 0 ? 3 : (j & -268435456) == 0 ? 4 : (j & -34359738368L) == 0 ? 5 : (j & -4398046511104L) == 0 ? 6 : (j & -562949953421312L) == 0 ? 7 : (j & -72057594037927936L) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j << 1) ^ (j >> 63);
    }

    private CodedOutputStream(byte[] bArr, int i, int i2) {
        this.output = null;
        this.buffer = bArr;
        this.position = i;
        this.limit = i + i2;
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.output = outputStream;
        this.buffer = bArr;
        this.position = null;
        this.limit = bArr.length;
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new CodedOutputStream(bArr, i, i2);
    }

    public void writeDouble(int i, double d) throws IOException {
        writeTag(i, 1);
        writeDoubleNoTag(d);
    }

    public void writeFloat(int i, float f) throws IOException {
        writeTag(i, 5);
        writeFloatNoTag(f);
    }

    public void writeUInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeUInt64NoTag(j);
    }

    public void writeInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeInt64NoTag(j);
    }

    public void writeInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeInt32NoTag(i2);
    }

    public void writeFixed64(int i, long j) throws IOException {
        writeTag(i, 1);
        writeFixed64NoTag(j);
    }

    public void writeFixed32(int i, int i2) throws IOException {
        writeTag(i, 5);
        writeFixed32NoTag(i2);
    }

    public void writeBool(int i, boolean z) throws IOException {
        writeTag(i, 0);
        writeBoolNoTag(z);
    }

    public void writeString(int i, String str) throws IOException {
        writeTag(i, 2);
        writeStringNoTag(str);
    }

    public void writeBytes(int i, ByteString byteString) throws IOException {
        writeTag(i, 2);
        writeBytesNoTag(byteString);
    }

    public void writeUInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeUInt32NoTag(i2);
    }

    public void writeEnum(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeEnumNoTag(i2);
    }

    public void writeSFixed32(int i, int i2) throws IOException {
        writeTag(i, 5);
        writeSFixed32NoTag(i2);
    }

    public void writeSFixed64(int i, long j) throws IOException {
        writeTag(i, 1);
        writeSFixed64NoTag(j);
    }

    public void writeSInt32(int i, int i2) throws IOException {
        writeTag(i, 0);
        writeSInt32NoTag(i2);
    }

    public void writeSInt64(int i, long j) throws IOException {
        writeTag(i, 0);
        writeSInt64NoTag(j);
    }

    public void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException {
        writeTag(1, 3);
        writeUInt32(2, i);
        writeBytes(3, byteString);
        writeTag(1, 4);
    }

    public void writeDoubleNoTag(double d) throws IOException {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d));
    }

    public void writeFloatNoTag(float f) throws IOException {
        writeRawLittleEndian32(Float.floatToRawIntBits(f));
    }

    public void writeUInt64NoTag(long j) throws IOException {
        writeRawVarint64(j);
    }

    public void writeInt64NoTag(long j) throws IOException {
        writeRawVarint64(j);
    }

    public void writeInt32NoTag(int i) throws IOException {
        if (i >= 0) {
            writeRawVarint32(i);
        } else {
            writeRawVarint64((long) i);
        }
    }

    public void writeFixed64NoTag(long j) throws IOException {
        writeRawLittleEndian64(j);
    }

    public void writeFixed32NoTag(int i) throws IOException {
        writeRawLittleEndian32(i);
    }

    public void writeBoolNoTag(boolean z) throws IOException {
        writeRawByte((int) z);
    }

    public void writeStringNoTag(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeBytesNoTag(ByteString byteString) throws IOException {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public void writeUInt32NoTag(int i) throws IOException {
        writeRawVarint32(i);
    }

    public void writeEnumNoTag(int i) throws IOException {
        writeInt32NoTag(i);
    }

    public void writeSFixed32NoTag(int i) throws IOException {
        writeRawLittleEndian32(i);
    }

    public void writeSFixed64NoTag(long j) throws IOException {
        writeRawLittleEndian64(j);
    }

    public void writeSInt32NoTag(int i) throws IOException {
        writeRawVarint32(encodeZigZag32(i));
    }

    public void writeSInt64NoTag(long j) throws IOException {
        writeRawVarint64(encodeZigZag64(j));
    }

    public static int computeDoubleSize(int i, double d) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d);
    }

    public static int computeFloatSize(int i, float f) {
        return computeTagSize(i) + computeFloatSizeNoTag(f);
    }

    public static int computeUInt64Size(int i, long j) {
        return computeTagSize(i) + computeUInt64SizeNoTag(j);
    }

    public static int computeInt64Size(int i, long j) {
        return computeTagSize(i) + computeInt64SizeNoTag(j);
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeFixed64Size(int i, long j) {
        return computeTagSize(i) + computeFixed64SizeNoTag(j);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeFixed32SizeNoTag(i2);
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeStringSize(int i, String str) {
        return computeTagSize(i) + computeStringSizeNoTag(str);
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeTagSize(i) + computeUInt32SizeNoTag(i2);
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeSFixed32SizeNoTag(i2);
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeTagSize(i) + computeSFixed64SizeNoTag(j);
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeTagSize(i) + computeSInt32SizeNoTag(i2);
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeRawMessageSetExtensionSize(int i, ByteString byteString) {
        return ((computeTagSize(1) * 2) + computeUInt32Size(2, i)) + computeBytesSize(3, byteString);
    }

    public static int computeUInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeRawVarint64Size(j);
    }

    public static int computeInt32SizeNoTag(int i) {
        return i >= 0 ? computeRawVarint32Size(i) : 10;
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            str = str.getBytes("UTF-8");
            return computeRawVarint32Size(str.length) + str.length;
        } catch (String str2) {
            throw new RuntimeException("UTF-8 not supported.", str2);
        }
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeRawVarint32Size(byteString.size()) + byteString.size();
    }

    public static int computeUInt32SizeNoTag(int i) {
        return computeRawVarint32Size(i);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeRawVarint32Size(encodeZigZag32(i));
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeRawVarint64Size(encodeZigZag64(j));
    }

    private void refreshBuffer() throws IOException {
        if (this.output == null) {
            throw new OutOfSpaceException();
        }
        this.output.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    public void flush() throws IOException {
        if (this.output != null) {
            refreshBuffer();
        }
    }

    public int spaceLeft() {
        if (this.output == null) {
            return this.limit - this.position;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public void writeRawByte(byte b) throws IOException {
        if (this.position == this.limit) {
            refreshBuffer();
        }
        byte[] bArr = this.buffer;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
    }

    public void writeRawByte(int i) throws IOException {
        writeRawByte((byte) i);
    }

    public void writeRawBytes(ByteString byteString) throws IOException {
        writeRawBytes(byteString, 0, byteString.size());
    }

    public void writeRawBytes(byte[] bArr) throws IOException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawBytes(byte[] bArr, int i, int i2) throws IOException {
        if (this.limit - this.position >= i2) {
            System.arraycopy(bArr, i, this.buffer, this.position, i2);
            this.position += i2;
            return;
        }
        int i3 = this.limit - this.position;
        System.arraycopy(bArr, i, this.buffer, this.position, i3);
        i += i3;
        i2 -= i3;
        this.position = this.limit;
        refreshBuffer();
        if (i2 <= this.limit) {
            System.arraycopy(bArr, i, this.buffer, 0, i2);
            this.position = i2;
            return;
        }
        this.output.write(bArr, i, i2);
    }

    public void writeRawBytes(ByteString byteString, int i, int i2) throws IOException {
        if (this.limit - this.position >= i2) {
            byteString.copyTo(this.buffer, i, this.position, i2);
            this.position += i2;
            return;
        }
        int i3 = this.limit - this.position;
        byteString.copyTo(this.buffer, i, this.position, i3);
        i += i3;
        i2 -= i3;
        this.position = this.limit;
        refreshBuffer();
        if (i2 <= this.limit) {
            byteString.copyTo(this.buffer, i, 0, i2);
            this.position = i2;
            return;
        }
        byteString = byteString.newInput();
        long j = (long) i;
        if (j != byteString.skip(j)) {
            throw new IllegalStateException("Skip failed.");
        }
        while (i2 > 0) {
            i = Math.min(i2, this.limit);
            i3 = byteString.read(this.buffer, 0, i);
            if (i3 != i) {
                throw new IllegalStateException("Read failed.");
            }
            this.output.write(this.buffer, 0, i3);
            i2 -= i3;
        }
    }

    public void writeTag(int i, int i2) throws IOException {
        writeRawVarint32(WireFormat.makeTag(i, i2));
    }

    public static int computeTagSize(int i) {
        return computeRawVarint32Size(WireFormat.makeTag(i, 0));
    }

    public void writeRawVarint32(int i) throws IOException {
        while ((i & -128) != 0) {
            writeRawByte((i & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            i >>>= 7;
        }
        writeRawByte(i);
    }

    public void writeRawVarint64(long j) throws IOException {
        while ((j & -128) != 0) {
            writeRawByte((((int) j) & 127) | ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            j >>>= 7;
        }
        writeRawByte((int) j);
    }

    public void writeRawLittleEndian32(int i) throws IOException {
        writeRawByte(i & 255);
        writeRawByte((i >> 8) & 255);
        writeRawByte((i >> 16) & 255);
        writeRawByte((i >> 24) & 255);
    }

    public void writeRawLittleEndian64(long j) throws IOException {
        writeRawByte(((int) j) & 255);
        writeRawByte(((int) (j >> 8)) & 255);
        writeRawByte(((int) (j >> 16)) & 255);
        writeRawByte(((int) (j >> 24)) & 255);
        writeRawByte(((int) (j >> 32)) & 255);
        writeRawByte(((int) (j >> 40)) & 255);
        writeRawByte(((int) (j >> 48)) & 255);
        writeRawByte(((int) (j >> 56)) & 255);
    }
}
