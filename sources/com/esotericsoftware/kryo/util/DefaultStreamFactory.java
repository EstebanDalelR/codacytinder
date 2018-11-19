package com.esotericsoftware.kryo.util;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.StreamFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.io.InputStream;
import java.io.OutputStream;

public class DefaultStreamFactory implements StreamFactory {
    public void setKryo(Kryo kryo) {
    }

    public Input getInput() {
        return new Input();
    }

    public Input getInput(int i) {
        return new Input(i);
    }

    public Input getInput(byte[] bArr) {
        return new Input(bArr);
    }

    public Input getInput(byte[] bArr, int i, int i2) {
        return new Input(bArr, i, i2);
    }

    public Input getInput(InputStream inputStream) {
        return new Input(inputStream);
    }

    public Input getInput(InputStream inputStream, int i) {
        return new Input(inputStream, i);
    }

    public Output getOutput() {
        return new Output();
    }

    public Output getOutput(int i) {
        return new Output(i);
    }

    public Output getOutput(int i, int i2) {
        return new Output(i, i2);
    }

    public Output getOutput(byte[] bArr) {
        return new Output(bArr);
    }

    public Output getOutput(byte[] bArr, int i) {
        return new Output(bArr, i);
    }

    public Output getOutput(OutputStream outputStream) {
        return new Output(outputStream);
    }

    public Output getOutput(OutputStream outputStream, int i) {
        return new Output(outputStream, i);
    }
}
