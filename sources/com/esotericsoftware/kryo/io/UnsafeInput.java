package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import java.io.InputStream;

public final class UnsafeInput extends Input {
    private boolean varIntsEnabled = false;

    public UnsafeInput(int i) {
        super(i);
    }

    public UnsafeInput(byte[] bArr) {
        super(bArr);
    }

    public UnsafeInput(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public UnsafeInput(InputStream inputStream) {
        super(inputStream);
    }

    public UnsafeInput(InputStream inputStream, int i) {
        super(inputStream, i);
    }

    public int readInt() throws KryoException {
        require(4);
        int i = UnsafeUtil.unsafe().getInt(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 4;
        return i;
    }

    public float readFloat() throws KryoException {
        require(4);
        float f = UnsafeUtil.unsafe().getFloat(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 4;
        return f;
    }

    public short readShort() throws KryoException {
        require(2);
        short s = UnsafeUtil.unsafe().getShort(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 2;
        return s;
    }

    public long readLong() throws KryoException {
        require(8);
        long j = UnsafeUtil.unsafe().getLong(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 8;
        return j;
    }

    public double readDouble() throws KryoException {
        require(8);
        double d = UnsafeUtil.unsafe().getDouble(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 8;
        return d;
    }

    public char readChar() throws KryoException {
        require(2);
        char c = UnsafeUtil.unsafe().getChar(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 2;
        return c;
    }

    public int readInt(boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return super.readInt(z);
        }
        return readInt();
    }

    public long readLong(boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return super.readLong(z);
        }
        return readLong();
    }

    public final int[] readInts(int i, boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return super.readInts(i, z);
        }
        int i2 = i << 2;
        i = new int[i];
        readBytes(i, UnsafeUtil.intArrayBaseOffset, 0, i2);
        return i;
    }

    public final long[] readLongs(int i, boolean z) throws KryoException {
        if (this.varIntsEnabled) {
            return super.readLongs(i, z);
        }
        int i2 = i << 3;
        i = new long[i];
        readBytes(i, UnsafeUtil.longArrayBaseOffset, 0, i2);
        return i;
    }

    public final int[] readInts(int i) throws KryoException {
        int i2 = i << 2;
        i = new int[i];
        readBytes(i, UnsafeUtil.intArrayBaseOffset, 0, i2);
        return i;
    }

    public final long[] readLongs(int i) throws KryoException {
        int i2 = i << 3;
        i = new long[i];
        readBytes(i, UnsafeUtil.longArrayBaseOffset, 0, i2);
        return i;
    }

    public final float[] readFloats(int i) throws KryoException {
        int i2 = i << 2;
        i = new float[i];
        readBytes(i, UnsafeUtil.floatArrayBaseOffset, 0, i2);
        return i;
    }

    public final short[] readShorts(int i) throws KryoException {
        int i2 = i << 1;
        i = new short[i];
        readBytes(i, UnsafeUtil.shortArrayBaseOffset, 0, i2);
        return i;
    }

    public final char[] readChars(int i) throws KryoException {
        int i2 = i << 1;
        i = new char[i];
        readBytes(i, UnsafeUtil.charArrayBaseOffset, 0, i2);
        return i;
    }

    public final double[] readDoubles(int i) throws KryoException {
        int i2 = i << 3;
        i = new double[i];
        readBytes(i, UnsafeUtil.doubleArrayBaseOffset, 0, i2);
        return i;
    }

    public final void readBytes(Object obj, long j, long j2) throws KryoException {
        if (obj.getClass().isArray()) {
            readBytes(obj, 0, j, (int) j2);
            return;
        }
        throw new KryoException("Only bulk reads of arrays is supported");
    }

    private final void readBytes(Object obj, long j, long j2, int i) throws KryoException {
        int i2 = i;
        int min = Math.min(this.limit - this.position, i2);
        int i3 = i2;
        long j3 = j2;
        while (true) {
            long j4 = (long) min;
            UnsafeUtil.unsafe().copyMemory(r0.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) r0.position), obj, j + j3, j4);
            r0.position += min;
            i3 -= min;
            if (i3 != 0) {
                long j5 = j3 + j4;
                min = Math.min(i3, r0.capacity);
                require(min);
                j3 = j5;
            } else {
                return;
            }
        }
    }

    public boolean getVarIntsEnabled() {
        return this.varIntsEnabled;
    }

    public void setVarIntsEnabled(boolean z) {
        this.varIntsEnabled = z;
    }
}
