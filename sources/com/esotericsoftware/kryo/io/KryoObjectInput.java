package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.Kryo;
import java.io.IOException;
import java.io.ObjectInput;

public class KryoObjectInput extends KryoDataInput implements ObjectInput {
    private final Kryo kryo;

    public int available() throws IOException {
        return 0;
    }

    public KryoObjectInput(Kryo kryo, Input input) {
        super(input);
        this.kryo = kryo;
    }

    public Object readObject() throws ClassNotFoundException, IOException {
        return this.kryo.readClassAndObject(this.input);
    }

    public int read() throws IOException {
        return this.input.read();
    }

    public int read(byte[] bArr) throws IOException {
        return this.input.read(bArr);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.input.read(bArr, i, i2);
    }

    public long skip(long j) throws IOException {
        return this.input.skip(j);
    }

    public void close() throws IOException {
        this.input.close();
    }
}
