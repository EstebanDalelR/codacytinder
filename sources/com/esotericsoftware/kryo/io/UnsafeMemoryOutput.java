package com.esotericsoftware.kryo.io;

import android.support.v4.media.session.PlaybackStateCompat;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import com.esotericsoftware.kryo.util.Util;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import sun.nio.ch.DirectBuffer;

public final class UnsafeMemoryOutput extends ByteBufferOutput {
    private static final boolean isLittleEndian = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN);
    private long bufaddress;

    public UnsafeMemoryOutput() {
        this.varIntsEnabled = false;
    }

    public UnsafeMemoryOutput(int i) {
        this(i, i);
    }

    public UnsafeMemoryOutput(int i, int i2) {
        super(i, i2);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }

    public UnsafeMemoryOutput(OutputStream outputStream) {
        super(outputStream);
        this.varIntsEnabled = null;
        updateBufferAddress();
    }

    public UnsafeMemoryOutput(OutputStream outputStream, int i) {
        super(outputStream, i);
        this.varIntsEnabled = null;
        updateBufferAddress();
    }

    public UnsafeMemoryOutput(long j, int i) {
        super(j, i);
        this.varIntsEnabled = 0;
        updateBufferAddress();
    }

    public void setBuffer(ByteBuffer byteBuffer, int i) {
        super.setBuffer(byteBuffer, i);
        updateBufferAddress();
    }

    private void updateBufferAddress() {
        this.bufaddress = ((DirectBuffer) this.niobuffer).address();
    }

    public final void writeInt(int i) throws KryoException {
        require(4);
        UnsafeUtil.unsafe().putInt(this.bufaddress + ((long) this.position), i);
        this.position += 4;
    }

    public final void writeFloat(float f) throws KryoException {
        require(4);
        UnsafeUtil.unsafe().putFloat(this.bufaddress + ((long) this.position), f);
        this.position += 5.6E-45f;
    }

    public final void writeShort(int i) throws KryoException {
        require(2);
        UnsafeUtil.unsafe().putShort(this.bufaddress + ((long) this.position), (short) i);
        this.position += 2;
    }

    public final void writeLong(long j) throws KryoException {
        require(8);
        UnsafeUtil.unsafe().putLong(this.bufaddress + ((long) this.position), j);
        this.position += 8;
    }

    public final void writeByte(int i) throws KryoException {
        this.niobuffer.position(this.position);
        super.writeByte(i);
    }

    public void writeByte(byte b) throws KryoException {
        this.niobuffer.position(this.position);
        super.writeByte(b);
    }

    public final void writeBoolean(boolean z) throws KryoException {
        this.niobuffer.position(this.position);
        super.writeBoolean(z);
    }

    public final void writeChar(char c) throws KryoException {
        require(2);
        UnsafeUtil.unsafe().putChar(this.bufaddress + ((long) this.position), c);
        this.position += '\u0002';
    }

    public final void writeDouble(double d) throws KryoException {
        require(8);
        UnsafeUtil.unsafe().putDouble(this.bufaddress + ((long) this.position), d);
        this.position += 4.0E-323d;
    }

    public final int writeInt(int i, boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return writeVarInt(i, z);
        }
        writeInt(i);
        return 4;
    }

    public final int writeLong(long j, boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return writeVarLong(j, z);
        }
        writeLong(j);
        return 8;
    }

    public final int writeVarInt(int i, boolean z) throws KryoException {
        UnsafeMemoryOutput unsafeMemoryOutput = this;
        long j = (long) i;
        if (!z) {
            j = (j << 1) ^ (j >> 31);
        }
        long j2 = j & 127;
        j >>>= 7;
        if (j == 0) {
            writeByte((byte) ((int) j2));
            return 1;
        }
        long j3 = (j2 | 128) | ((j & 127) << 8);
        j >>>= 7;
        if (j == 0) {
            writeLittleEndianInt((int) j3);
            unsafeMemoryOutput.position -= 2;
            return 2;
        }
        j3 = (j3 | PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) | ((j & 127) << 16);
        j >>>= 7;
        if (j == 0) {
            writeLittleEndianInt((int) j3);
            unsafeMemoryOutput.position--;
            return 3;
        }
        long j4 = (j3 | 8388608) | ((j & 127) << 24);
        j >>>= 7;
        if (j == 0) {
            writeLittleEndianInt((int) j4);
            unsafeMemoryOutput.position += 0;
            return 4;
        }
        writeLittleEndianLong(((j4 | 2147483648L) | ((j & 127) << 32)) & 68719476735L);
        unsafeMemoryOutput.position -= 3;
        return 5;
    }

    public final int writeVarLong(long j, boolean z) throws KryoException {
        UnsafeMemoryOutput unsafeMemoryOutput = this;
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
            unsafeMemoryOutput.position -= 2;
            return 2;
        }
        int i3 = (int) (((long) (i2 | 32768)) | ((j2 & 127) << 16));
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianInt(i3);
            unsafeMemoryOutput.position--;
            return 3;
        }
        i3 = (int) (((long) (i3 | 8388608)) | ((j2 & 127) << 24));
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianInt(i3);
            unsafeMemoryOutput.position += 0;
            return 4;
        }
        long j3 = (((long) ((int) (((long) i3) | 2147483648L))) & 4294967295L) | ((j2 & 127) << 32);
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianLong(j3);
            unsafeMemoryOutput.position -= 3;
            return 5;
        }
        j3 = (j3 | 549755813888L) | ((j2 & 127) << 40);
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianLong(j3);
            unsafeMemoryOutput.position -= 2;
            return 6;
        }
        j3 = (j3 | 140737488355328L) | ((j2 & 127) << 48);
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianLong(j3);
            unsafeMemoryOutput.position--;
            return 7;
        }
        j3 = (j3 | 36028797018963968L) | ((j2 & 127) << 56);
        j2 >>>= 7;
        if (j2 == 0) {
            writeLittleEndianLong(j3);
            return 8;
        }
        writeLittleEndianLong(j3 | Long.MIN_VALUE);
        writeByte((int) (j2 & 255));
        return 9;
    }

    private final void writeLittleEndianInt(int i) {
        if (isLittleEndian) {
            writeInt(i);
        } else {
            writeInt(Util.swapInt(i));
        }
    }

    private final void writeLittleEndianLong(long j) {
        if (isLittleEndian) {
            writeLong(j);
        } else {
            writeLong(Util.swapLong(j));
        }
    }

    public final void writeInts(int[] iArr, boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            super.writeInts(iArr, z);
            return;
        }
        Object obj = iArr;
        writeBytes(obj, UnsafeUtil.intArrayBaseOffset, 0, (long) (iArr.length << 2));
    }

    public final void writeLongs(long[] jArr, boolean z) throws KryoException {
        if (this.varIntsEnabled) {
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

    public void writeBytes(byte[] bArr) throws KryoException {
        if (bArr == null) {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
        writeBytes(bArr, 0, (long) bArr.length);
    }

    public final void writeBytes(Object obj, long j, long j2) throws KryoException {
        writeBytes(obj, UnsafeUtil.byteArrayBaseOffset, j, j2);
    }

    private final void writeBytes(Object obj, long j, long j2, long j3) throws KryoException {
        long j4 = j3;
        long j5 = j4;
        int min = Math.min(this.capacity - this.position, (int) j4);
        long j6 = j2;
        while (true) {
            long j7 = (long) min;
            long j8 = r0.bufaddress + ((long) r0.position);
            long j9 = j7;
            UnsafeUtil.unsafe().copyMemory(obj, j + j6, null, j8, j7);
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
}
