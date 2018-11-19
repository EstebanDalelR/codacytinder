package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.i */
class C3401i extends OutputStream implements C1751k {
    /* renamed from: a */
    private final Map<GraphRequest, C1753l> f10369a = new HashMap();
    /* renamed from: b */
    private final Handler f10370b;
    /* renamed from: c */
    private GraphRequest f10371c;
    /* renamed from: d */
    private C1753l f10372d;
    /* renamed from: e */
    private int f10373e;

    C3401i(Handler handler) {
        this.f10370b = handler;
    }

    /* renamed from: a */
    public void mo1842a(GraphRequest graphRequest) {
        this.f10371c = graphRequest;
        this.f10372d = graphRequest != null ? (C1753l) this.f10369a.get(graphRequest) : null;
    }

    /* renamed from: a */
    int m13075a() {
        return this.f10373e;
    }

    /* renamed from: b */
    Map<GraphRequest, C1753l> m13078b() {
        return this.f10369a;
    }

    /* renamed from: a */
    void m13076a(long j) {
        if (this.f10372d == null) {
            this.f10372d = new C1753l(this.f10370b, this.f10371c);
            this.f10369a.put(this.f10371c, this.f10372d);
        }
        this.f10372d.m6078b(j);
        this.f10373e = (int) (((long) this.f10373e) + j);
    }

    public void write(byte[] bArr) {
        m13076a((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        m13076a((long) i2);
    }

    public void write(int i) {
        m13076a(1);
    }
}
