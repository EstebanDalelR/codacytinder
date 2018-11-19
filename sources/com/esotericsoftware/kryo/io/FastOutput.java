package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import java.io.OutputStream;

public final class FastOutput extends Output {
    public FastOutput(int i) {
        this(i, i);
    }

    public FastOutput(int i, int i2) {
        super(i, i2);
    }

    public FastOutput(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public FastOutput(byte[] bArr, int i) {
        super(bArr, i);
    }

    public FastOutput(OutputStream outputStream) {
        super(outputStream);
    }

    public FastOutput(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public int writeInt(int i, boolean z) throws KryoException {
        writeInt(i);
        return 4;
    }

    public int writeLong(long j, boolean z) throws KryoException {
        writeLong(j);
        return 8;
    }
}
