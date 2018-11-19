package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C2279c;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.exoplayer2.source.hls.a */
final class C3691a implements DataSource {
    /* renamed from: a */
    private final DataSource f11496a;
    /* renamed from: b */
    private final byte[] f11497b;
    /* renamed from: c */
    private final byte[] f11498c;
    /* renamed from: d */
    private CipherInputStream f11499d;

    public C3691a(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.f11496a = dataSource;
        this.f11497b = bArr;
        this.f11498c = bArr2;
    }

    public long open(DataSpec dataSpec) throws IOException {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f11497b, "AES"), new IvParameterSpec(this.f11498c));
                InputStream c2279c = new C2279c(this.f11496a, dataSpec);
                this.f11499d = new CipherInputStream(c2279c, instance);
                c2279c.m8249b();
                return -1;
            } catch (DataSpec dataSpec2) {
                throw new RuntimeException(dataSpec2);
            }
        } catch (DataSpec dataSpec22) {
            throw new RuntimeException(dataSpec22);
        }
    }

    public void close() throws IOException {
        if (this.f11499d != null) {
            this.f11499d = null;
            this.f11496a.close();
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        C2289a.m8313b(this.f11499d != null);
        bArr = this.f11499d.read(bArr, i, i2);
        return bArr < null ? -1 : bArr;
    }

    public Uri getUri() {
        return this.f11496a.getUri();
    }
}
