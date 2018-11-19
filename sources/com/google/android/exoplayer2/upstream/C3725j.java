package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.C2289a;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.upstream.j */
public final class C3725j implements DataSource {
    /* renamed from: a */
    private final DataSource f11760a;
    /* renamed from: b */
    private final DataSink f11761b;
    /* renamed from: c */
    private boolean f11762c;
    /* renamed from: d */
    private long f11763d;

    public C3725j(DataSource dataSource, DataSink dataSink) {
        this.f11760a = (DataSource) C2289a.m8309a((Object) dataSource);
        this.f11761b = (DataSink) C2289a.m8309a((Object) dataSink);
    }

    public long open(DataSpec dataSpec) throws IOException {
        DataSpec dataSpec2 = dataSpec;
        this.f11763d = this.f11760a.open(dataSpec2);
        if (this.f11763d == 0) {
            return 0;
        }
        if (dataSpec2.f6826e == -1 && r0.f11763d != -1) {
            dataSpec2 = new DataSpec(dataSpec2.f6822a, dataSpec2.f6824c, dataSpec2.f6825d, r0.f11763d, dataSpec2.f6827f, dataSpec2.f6828g);
        }
        r0.f11762c = true;
        r0.f11761b.open(dataSpec2);
        return r0.f11763d;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f11763d == 0) {
            return -1;
        }
        i2 = this.f11760a.read(bArr, i, i2);
        if (i2 > 0) {
            this.f11761b.write(bArr, i, i2);
            if (this.f11763d != -1) {
                this.f11763d -= (long) i2;
            }
        }
        return i2;
    }

    public Uri getUri() {
        return this.f11760a.getUri();
    }

    public void close() throws IOException {
        try {
            this.f11760a.close();
        } finally {
            if (this.f11762c) {
                this.f11762c = false;
                this.f11761b.close();
            }
        }
    }
}
