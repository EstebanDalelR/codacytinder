package com.esotericsoftware.kryo.io;

import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;

public class KryoDataInput implements DataInput {
    protected Input input;

    public KryoDataInput(Input input) {
        setInput(input);
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public void readFully(byte[] bArr) throws IOException {
        readFully(bArr, 0, bArr.length);
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.input.readBytes(bArr, i, i2);
        } catch (byte[] bArr2) {
            throw new EOFException(bArr2.getMessage());
        }
    }

    public int skipBytes(int i) throws IOException {
        return (int) this.input.skip((long) i);
    }

    public boolean readBoolean() throws IOException {
        return this.input.readBoolean();
    }

    public byte readByte() throws IOException {
        return this.input.readByte();
    }

    public int readUnsignedByte() throws IOException {
        return this.input.readByteUnsigned();
    }

    public short readShort() throws IOException {
        return this.input.readShort();
    }

    public int readUnsignedShort() throws IOException {
        return this.input.readShortUnsigned();
    }

    public char readChar() throws IOException {
        return this.input.readChar();
    }

    public int readInt() throws IOException {
        return this.input.readInt();
    }

    public long readLong() throws IOException {
        return this.input.readLong();
    }

    public float readFloat() throws IOException {
        return this.input.readFloat();
    }

    public double readDouble() throws IOException {
        return this.input.readDouble();
    }

    public String readLine() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public String readUTF() throws IOException {
        return this.input.readString();
    }
}
