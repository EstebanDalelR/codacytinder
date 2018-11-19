package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.StreamFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.UnsafeInput;
import com.esotericsoftware.kryo.io.UnsafeOutput;
import java.io.InputStream;
import java.io.OutputStream;

public class FastestStreamFactory implements StreamFactory {
    private static boolean isUnsafe = (UnsafeUtil.unsafe() != null);

    public void setKryo(Kryo kryo) {
    }

    public Input getInput() {
        return isUnsafe ? new UnsafeInput() : new Input();
    }

    public Input getInput(int i) {
        return isUnsafe ? new UnsafeInput(i) : new Input(i);
    }

    public Input getInput(byte[] bArr) {
        return isUnsafe ? new UnsafeInput(bArr) : new Input(bArr);
    }

    public Input getInput(byte[] bArr, int i, int i2) {
        return isUnsafe ? new UnsafeInput(bArr, i, i2) : new Input(bArr, i, i2);
    }

    public Input getInput(InputStream inputStream) {
        return isUnsafe ? new UnsafeInput(inputStream) : new Input(inputStream);
    }

    public Input getInput(InputStream inputStream, int i) {
        return isUnsafe ? new UnsafeInput(inputStream, i) : new Input(inputStream, i);
    }

    public Output getOutput() {
        return isUnsafe ? new UnsafeOutput() : new Output();
    }

    public Output getOutput(int i) {
        return isUnsafe ? new UnsafeOutput(i) : new Output(i);
    }

    public Output getOutput(int i, int i2) {
        return isUnsafe ? new UnsafeOutput(i, i2) : new Output(i, i2);
    }

    public Output getOutput(byte[] bArr) {
        return isUnsafe ? new UnsafeOutput(bArr) : new Output(bArr);
    }

    public Output getOutput(byte[] bArr, int i) {
        return isUnsafe ? new UnsafeOutput(bArr, i) : new Output(bArr, i);
    }

    public Output getOutput(OutputStream outputStream) {
        return isUnsafe ? new UnsafeOutput(outputStream) : new Output(outputStream);
    }

    public Output getOutput(OutputStream outputStream, int i) {
        return isUnsafe ? new UnsafeOutput(outputStream, i) : new Output(outputStream, i);
    }
}
