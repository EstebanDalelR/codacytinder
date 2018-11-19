package com.squareup.okhttp;

import okio.C18549c;

/* renamed from: com.squareup.okhttp.l */
public final class C6062l {
    /* renamed from: a */
    private static final C6067o f22217a = C6067o.m26289a("application/x-www-form-urlencoded");
    /* renamed from: b */
    private final C18549c f22218b = new C18549c();

    /* renamed from: a */
    public C6062l m26266a(String str, String str2) {
        if (this.f22218b.a() > 0) {
            this.f22218b.b(38);
        }
        HttpUrl.m25729a(this.f22218b, str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true, true);
        this.f22218b.b(61);
        HttpUrl.m25729a(this.f22218b, str2, 0, str2.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, true, true);
        return this;
    }

    /* renamed from: a */
    public C6072r m26267a() {
        return C6072r.m26354a(f22217a, this.f22218b.f());
    }
}
