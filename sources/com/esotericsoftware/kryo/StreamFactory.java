package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.io.InputStream;
import java.io.OutputStream;

public interface StreamFactory {
    Input getInput();

    Input getInput(int i);

    Input getInput(InputStream inputStream);

    Input getInput(InputStream inputStream, int i);

    Input getInput(byte[] bArr);

    Input getInput(byte[] bArr, int i, int i2);

    Output getOutput();

    Output getOutput(int i);

    Output getOutput(int i, int i2);

    Output getOutput(OutputStream outputStream);

    Output getOutput(OutputStream outputStream, int i);

    Output getOutput(byte[] bArr);

    Output getOutput(byte[] bArr, int i);

    void setKryo(Kryo kryo);
}
