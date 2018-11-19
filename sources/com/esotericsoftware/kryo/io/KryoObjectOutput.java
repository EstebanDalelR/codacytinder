package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.Kryo;
import java.io.IOException;
import java.io.ObjectOutput;

public class KryoObjectOutput extends KryoDataOutput implements ObjectOutput {
    private final Kryo kryo;

    public KryoObjectOutput(Kryo kryo, Output output) {
        super(output);
        this.kryo = kryo;
    }

    public void writeObject(Object obj) throws IOException {
        this.kryo.writeClassAndObject(this.output, obj);
    }

    public void flush() throws IOException {
        this.output.flush();
    }

    public void close() throws IOException {
        this.output.close();
    }
}
