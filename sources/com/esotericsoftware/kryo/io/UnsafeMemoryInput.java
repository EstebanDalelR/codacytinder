package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import java.io.InputStream;
import java.nio.ByteBuffer;
import sun.nio.ch.DirectBuffer;

public final class UnsafeMemoryInput extends ByteBufferInput {
    private long bufaddress;

    public UnsafeMemoryInput() {
        this.varIntsEnabled = false;
    }

    public UnsafeMemoryInput(int i) {
        super(i);
        this.varIntsEnabled = false;
        updateBufferAddress();
    }

    public UnsafeMemoryInput(byte[] bArr) {
        super(bArr);
        this.varIntsEnabled = null;
        updateBufferAddress();
    }

    public UnsafeMemoryInput(ByteBuffer byteBuffer) {
        super(byteBuffer);
        this.varIntsEnabled = null;
        updateBufferAddress();
    }

    public UnsafeMemoryInput(long j, int i) {
        super(j, i);
        this.varIntsEnabled = 0;
        updateBufferAddress();
    }

    public UnsafeMemoryInput(InputStream inputStream) {
        super(inputStream);
        this.varIntsEnabled = null;
        updateBufferAddress();
    }

    public UnsafeMemoryInput(InputStream inputStream, int i) {
        super(inputStream, i);
        this.varIntsEnabled = null;
        updateBufferAddress();
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        super.setBuffer(byteBuffer);
        updateBufferAddress();
    }

    private void updateBufferAddress() {
        this.bufaddress = ((DirectBuffer) this.niobuffer).address();
    }

    public int readInt() throws KryoException {
        require(4);
        int i = UnsafeUtil.unsafe().getInt(this.bufaddress + ((long) this.position));
        this.position += 4;
        return i;
    }

    public float readFloat() throws KryoException {
        require(4);
        float f = UnsafeUtil.unsafe().getFloat(this.bufaddress + ((long) this.position));
        this.position += 4;
        return f;
    }

    public short readShort() throws KryoException {
        require(2);
        short s = UnsafeUtil.unsafe().getShort(this.bufaddress + ((long) this.position));
        this.position += 2;
        return s;
    }

    public long readLong() throws KryoException {
        require(8);
        long j = UnsafeUtil.unsafe().getLong(this.bufaddress + ((long) this.position));
        this.position += 8;
        return j;
    }

    public boolean readBoolean() throws KryoException {
        this.niobuffer.position(this.position);
        return super.readBoolean();
    }

    public byte readByte() throws KryoException {
        this.niobuffer.position(this.position);
        return super.readByte();
    }

    public char readChar() throws KryoException {
        require(2);
        char c = UnsafeUtil.unsafe().getChar(this.bufaddress + ((long) this.position));
        this.position += 2;
        return c;
    }

    public double readDouble() throws KryoException {
        require(8);
        double d = UnsafeUtil.unsafe().getDouble(this.bufaddress + ((long) this.position));
        this.position += 8;
        return d;
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

    public byte[] readBytes(int i) throws KryoException {
        i = new byte[i];
        readBytes(i, 0, (long) i.length);
        return i;
    }

    public final void readBytes(Object obj, long j, long j2) throws KryoException {
        if (obj.getClass().isArray()) {
            readBytes(obj, UnsafeUtil.byteArrayBaseOffset, j, (int) j2);
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
            UnsafeUtil.unsafe().copyMemory(null, r0.bufaddress + ((long) r0.position), obj, j + j3, j4);
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
}
