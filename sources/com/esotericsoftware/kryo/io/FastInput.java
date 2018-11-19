package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import java.io.InputStream;

public final class FastInput extends Input {
    public FastInput(int i) {
        super(i);
    }

    public FastInput(byte[] bArr) {
        super(bArr);
    }

    public FastInput(byte[] bArr, int i, int i2) {
        super(bArr, i, i2);
    }

    public FastInput(InputStream inputStream) {
        super(inputStream);
    }

    public FastInput(InputStream inputStream, int i) {
        super(inputStream, i);
    }

    public int readInt(boolean z) throws KryoException {
        return readInt();
    }

    public long readLong(boolean z) throws KryoException {
        return readLong();
    }
}
