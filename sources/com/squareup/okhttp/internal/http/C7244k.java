package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C6066n;
import com.squareup.okhttp.C6067o;
import com.squareup.okhttp.C6076t;
import com.tinder.api.ManagerWebServices;
import okio.BufferedSource;

/* renamed from: com.squareup.okhttp.internal.http.k */
public final class C7244k extends C6076t {
    /* renamed from: a */
    private final C6066n f26136a;
    /* renamed from: b */
    private final BufferedSource f26137b;

    public C7244k(C6066n c6066n, BufferedSource bufferedSource) {
        this.f26136a = c6066n;
        this.f26137b = bufferedSource;
    }

    /* renamed from: a */
    public C6067o mo6485a() {
        String a = this.f26136a.m26284a(ManagerWebServices.PARAM_CONTENT_TYPE);
        return a != null ? C6067o.m26289a(a) : null;
    }

    /* renamed from: b */
    public long mo6486b() {
        return C6053j.m26204a(this.f26136a);
    }

    /* renamed from: c */
    public BufferedSource mo6487c() {
        return this.f26137b;
    }
}
