package com.leanplum.p069a;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.leanplum.a.z */
final class C5730z extends DataInputStream {
    public C5730z(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public final byte[] m25176a(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException(String.format("Read wrong number of bytes. Got: %s, Expected: %s.", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}));
    }
}
