package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.util.C2291b;
import com.google.android.exoplayer2.util.C2314v;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.offline.a */
public final class C2159a {
    /* renamed from: a */
    private final C2291b f6190a;

    /* renamed from: a */
    public void m7765a(C2160b... c2160bArr) throws IOException {
        Closeable dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(this.f6190a.m8318b());
            int i = 0;
            try {
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(c2160bArr.length);
                int length = c2160bArr.length;
                while (i < length) {
                    C2160b.m7766a(c2160bArr[i], dataOutputStream);
                    i++;
                }
                this.f6190a.m8317a(dataOutputStream);
                C2314v.m8473a(null);
            } catch (Throwable th) {
                c2160bArr = th;
                C2314v.m8473a(dataOutputStream);
                throw c2160bArr;
            }
        } catch (Throwable th2) {
            c2160bArr = th2;
            dataOutputStream = null;
            C2314v.m8473a(dataOutputStream);
            throw c2160bArr;
        }
    }
}
