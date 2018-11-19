package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import com.esotericsoftware.kryo.util.Util;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.OutputStream;
import java.nio.ByteOrder;

public final class UnsafeOutput extends Output {
    private static final boolean isLittleEndian = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);
    private boolean supportVarInts;

    public UnsafeOutput() {
        this.supportVarInts = false;
    }

    public UnsafeOutput(int i) {
        this(i, i);
    }

    public UnsafeOutput(int i, int i2) {
        super(i, i2);
        this.supportVarInts = false;
    }

    public UnsafeOutput(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public UnsafeOutput(byte[] bArr, int i) {
        super(bArr, i);
        this.supportVarInts = null;
    }

    public UnsafeOutput(OutputStream outputStream) {
        super(outputStream);
        this.supportVarInts = null;
    }

    public UnsafeOutput(OutputStream outputStream, int i) {
        super(outputStream, i);
        this.supportVarInts = null;
    }

    public final void writeInt(int i) throws KryoException {
        require(4);
        UnsafeUtil.unsafe().putInt(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), i);
        this.position += 4;
    }

    private final void writeLittleEndianInt(int i) {
        if (isLittleEndian) {
            writeInt(i);
        } else {
            writeInt(Util.swapInt(i));
        }
    }

    public final void writeFloat(float f) throws KryoException {
        require(4);
        UnsafeUtil.unsafe().putFloat(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), f);
        this.position += 5.6E-45f;
    }

    public final void writeShort(int i) throws KryoException {
        require(2);
        UnsafeUtil.unsafe().putShort(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), (short) i);
        this.position += 2;
    }

    public final void writeLong(long j) throws KryoException {
        require(8);
        UnsafeUtil.unsafe().putLong(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), j);
        this.position += 8;
    }

    private final void writeLittleEndianLong(long j) {
        if (isLittleEndian) {
            writeLong(j);
        } else {
            writeLong(Util.swapLong(j));
        }
    }

    public final void writeDouble(double d) throws KryoException {
        require(8);
        UnsafeUtil.unsafe().putDouble(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), d);
        this.position += 4.0E-323d;
    }

    public final void writeChar(char c) throws KryoException {
        require(2);
        UnsafeUtil.unsafe().putChar(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), c);
        this.position += '\u0002';
    }

    public final int writeInt(int i, boolean z) throws KryoException {
        if (this.supportVarInts) {
            return writeVarInt(i, z);
        }
        writeInt(i);
        return 4;
    }

    public final int writeLong(long j, boolean z) throws KryoException {
        if (this.supportVarInts) {
            return writeVarLong(j, z);
        }
        writeLong(j);
        return 8;
    }

    public final int writeVarInt(int i, boolean z) throws KryoException {
        if (!z) {
            i = (i >> 31) ^ (i << 1);
        }
        z = i & 127;
        i >>>= 7;
        if (i == 0) {
            write((int) z);
            return 1;
        }
        z = (z | ProfileEditingConfig.DEFAULT_MAX_LENGTH) | ((i & 127) << 8);
        i >>>= 7;
        if (i == 0) {
            writeLittleEndianInt(z);
            this.position -= 2;
            return 2;
        }
        z = (z | true) | ((i & 127) << 16);
        i >>>= 7;
        if (i == 0) {
            writeLittleEndianInt(z);
            this.position--;
            return 3;
        }
        z = (z | true) | ((i & 127) << 24);
        i >>>= 7;
        if (i == 0) {
            writeLittleEndianInt(z);
            this.position += 0;
            return 4;
        }
        writeLittleEndianLong(((((long) z) | 2147483648L) | (((long) (i & 127)) << 32)) & -1);
        this.position -= 3;
        return 5;
    }

    public final int writeVarLong(long j, boolean z) throws KryoException {
        UnsafeOutput unsafeOutput = this;
        long j2 = !z ? (j << 1) ^ (j >> 63) : j;
        int i = (int) (j2 & 127);
        j2 >>>= 7;
        if (j2 == 0) {
            writeByte(i);
            return 1;
        }
        int i2 = (int) (((long) (i | ProfileEditingConfig.DEFAULT_MAX_LENGTH)) | ((j2 & 127) << 8));
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianInt(i2);
            unsafeOutput.position -= 2;
            return 2;
        }
        int i3 = (int) (((long) (i2 | 32768)) | ((j2 & 127) << 16));
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianInt(i3);
            unsafeOutput.position--;
            return 3;
        }
        i3 = (int) (((long) (i3 | 8388608)) | ((j2 & 127) << 24));
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianInt(i3);
            unsafeOutput.position += 0;
            return 4;
        }
        long j3 = ((((long) i3) & 4294967295L) | 2147483648L) | ((j2 & 127) << 32);
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianLong(j3);
            unsafeOutput.position -= 3;
            return 5;
        }
        j3 = (j3 | 549755813888L) | ((j2 & 127) << 40);
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianLong(j3);
            unsafeOutput.position -= 2;
            return 6;
        }
        long j4 = (j3 | 140737488355328L) | ((j2 & 127) << 48);
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianLong(j4);
            unsafeOutput.position--;
            return 7;
        }
        j4 = (j4 | 36028797018963968L) | ((j2 & 127) << 56);
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianLong(j4);
            return 8;
        }
        writeLittleEndianLong(j4 | Long.MIN_VALUE);
        write((int) (j2 & 255));
        return 9;
    }

    public final void writeInts(int[] iArr, boolean z) throws KryoException {
        if (this.supportVarInts) {
            super.writeInts(iArr, z);
            return;
        }
        Object obj = iArr;
        writeBytes(obj, UnsafeUtil.intArrayBaseOffset, 0, (long) (iArr.length << 2));
    }

    public final void writeLongs(long[] jArr, boolean z) throws KryoException {
        if (this.supportVarInts) {
            super.writeLongs(jArr, z);
            return;
        }
        Object obj = jArr;
        writeBytes(obj, UnsafeUtil.longArrayBaseOffset, 0, (long) (jArr.length << 3));
    }

    public final void writeInts(int[] iArr) throws KryoException {
        Object obj = iArr;
        writeBytes(obj, UnsafeUtil.intArrayBaseOffset, 0, (long) (iArr.length << 2));
    }

    public final void writeLongs(long[] jArr) throws KryoException {
        Object obj = jArr;
        writeBytes(obj, UnsafeUtil.longArrayBaseOffset, 0, (long) (jArr.length << 3));
    }

    public final void writeFloats(float[] fArr) throws KryoException {
        Object obj = fArr;
        writeBytes(obj, UnsafeUtil.floatArrayBaseOffset, 0, (long) (fArr.length << 2));
    }

    public final void writeShorts(short[] sArr) throws KryoException {
        Object obj = sArr;
        writeBytes(obj, UnsafeUtil.shortArrayBaseOffset, 0, (long) (sArr.length << 1));
    }

    public final void writeChars(char[] cArr) throws KryoException {
        Object obj = cArr;
        writeBytes(obj, UnsafeUtil.charArrayBaseOffset, 0, (long) (cArr.length << 1));
    }

    public final void writeDoubles(double[] dArr) throws KryoException {
        Object obj = dArr;
        writeBytes(obj, UnsafeUtil.doubleArrayBaseOffset, 0, (long) (dArr.length << 3));
    }

    public final void writeBytes(Object obj, long j, long j2) throws KryoException {
        writeBytes(obj, 0, j, j2);
    }

    private final void writeBytes(Object obj, long j, long j2, long j3) throws KryoException {
        long j4 = j3;
        long j5 = j4;
        int min = Math.min(this.capacity - this.position, (int) j4);
        long j6 = j2;
        while (true) {
            long j7 = (long) min;
            long j8 = UnsafeUtil.byteArrayBaseOffset + ((long) r0.position);
            long j9 = j7;
            UnsafeUtil.unsafe().copyMemory(obj, j + j6, r0.buffer, j8, j7);
            r0.position += min;
            long j10 = j5 - j9;
            if (j10 != 0) {
                long j11 = j6 + j9;
                int min2 = Math.min(r0.capacity, (int) j10);
                require(min2);
                long j12 = j11;
                min = min2;
                j6 = j12;
                j5 = j10;
            } else {
                return;
            }
        }
    }

    public boolean supportVarInts() {
        return this.supportVarInts;
    }

    public void supportVarInts(boolean z) {
        this.supportVarInts = z;
    }
}
