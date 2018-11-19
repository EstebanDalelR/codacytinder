package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.net.URLDecoder;

/* renamed from: com.google.android.exoplayer2.upstream.b */
public final class C3717b implements DataSource {
    /* renamed from: a */
    private DataSpec f11680a;
    /* renamed from: b */
    private int f11681b;
    /* renamed from: c */
    private byte[] f11682c;

    public long open(DataSpec dataSpec) throws IOException {
        this.f11680a = dataSpec;
        dataSpec = dataSpec.f6822a;
        String scheme = dataSpec.getScheme();
        if (ManagerWebServices.FB_DATA.equals(scheme)) {
            String[] split = dataSpec.getSchemeSpecificPart().split(",");
            if (split.length > 2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected URI format: ");
                stringBuilder.append(dataSpec);
                throw new ParserException(stringBuilder.toString());
            }
            dataSpec = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f11682c = Base64.decode(dataSpec, 0);
                } catch (Throwable e) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Error while parsing Base64 encoded string: ");
                    stringBuilder2.append(dataSpec);
                    throw new ParserException(stringBuilder2.toString(), e);
                }
            }
            this.f11682c = URLDecoder.decode(dataSpec, "US-ASCII").getBytes();
            return (long) this.f11682c.length;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported scheme: ");
        stringBuilder.append(scheme);
        throw new ParserException(stringBuilder.toString());
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return null;
        }
        int length = this.f11682c.length - this.f11681b;
        if (length == 0) {
            return -1;
        }
        i2 = Math.min(i2, length);
        System.arraycopy(this.f11682c, this.f11681b, bArr, i, i2);
        this.f11681b += i2;
        return i2;
    }

    public Uri getUri() {
        return this.f11680a != null ? this.f11680a.f6822a : null;
    }

    public void close() throws IOException {
        this.f11680a = null;
        this.f11682c = null;
    }
}
