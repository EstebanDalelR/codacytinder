package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequestBatch.Callback;
import com.facebook.GraphRequestBatch.OnProgressCallback;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.facebook.j */
class C3423j extends FilterOutputStream implements C1751k {
    /* renamed from: a */
    private final Map<GraphRequest, C1753l> f10403a;
    /* renamed from: b */
    private final GraphRequestBatch f10404b;
    /* renamed from: c */
    private final long f10405c = FacebookSdk.m3997h();
    /* renamed from: d */
    private long f10406d;
    /* renamed from: e */
    private long f10407e;
    /* renamed from: f */
    private long f10408f;
    /* renamed from: g */
    private C1753l f10409g;

    C3423j(OutputStream outputStream, GraphRequestBatch graphRequestBatch, Map<GraphRequest, C1753l> map, long j) {
        super(outputStream);
        this.f10404b = graphRequestBatch;
        this.f10403a = map;
        this.f10408f = j;
    }

    /* renamed from: a */
    private void m13114a(long j) {
        if (this.f10409g != null) {
            this.f10409g.m6077a(j);
        }
        this.f10406d += j;
        if (this.f10406d >= this.f10407e + this.f10405c || this.f10406d >= this.f10408f) {
            m13113a();
        }
    }

    /* renamed from: a */
    private void m13113a() {
        if (this.f10406d > this.f10407e) {
            for (Callback callback : this.f10404b.m4080e()) {
                if (callback instanceof OnProgressCallback) {
                    Handler c = this.f10404b.m4078c();
                    final OnProgressCallback onProgressCallback = (OnProgressCallback) callback;
                    if (c == null) {
                        onProgressCallback.onBatchProgress(this.f10404b, this.f10406d, this.f10408f);
                    } else {
                        c.post(new Runnable(this) {
                            /* renamed from: b */
                            final /* synthetic */ C3423j f4831b;

                            public void run() {
                                onProgressCallback.onBatchProgress(this.f4831b.f10404b, this.f4831b.f10406d, this.f4831b.f10408f);
                            }
                        });
                    }
                }
            }
            this.f10407e = this.f10406d;
        }
    }

    /* renamed from: a */
    public void mo1842a(GraphRequest graphRequest) {
        this.f10409g = graphRequest != null ? (C1753l) this.f10403a.get(graphRequest) : null;
    }

    public void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        m13114a((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        m13114a((long) i2);
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        m13114a(1);
    }

    public void close() throws IOException {
        super.close();
        for (C1753l a : this.f10403a.values()) {
            a.m6076a();
        }
        m13113a();
    }
}
