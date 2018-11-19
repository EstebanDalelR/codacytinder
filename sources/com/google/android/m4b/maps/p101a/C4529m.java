package com.google.android.m4b.maps.p101a;

import com.google.android.m4b.maps.p101a.C4515b.C4514a;

/* renamed from: com.google.android.m4b.maps.a.m */
public final class C4529m<T> {
    /* renamed from: a */
    public final T f16833a;
    /* renamed from: b */
    public final C4514a f16834b;
    /* renamed from: c */
    public final C4532r f16835c;
    /* renamed from: d */
    public boolean f16836d;

    /* renamed from: com.google.android.m4b.maps.a.m$a */
    public interface C4527a {
        /* renamed from: a */
        void mo4905a(C4532r c4532r);
    }

    /* renamed from: com.google.android.m4b.maps.a.m$b */
    public interface C4528b<T> {
        /* renamed from: a */
        void mo4906a(T t);
    }

    /* renamed from: a */
    public static <T> C4529m<T> m20455a(T t, C4514a c4514a) {
        return new C4529m(t, c4514a);
    }

    /* renamed from: a */
    public static <T> C4529m<T> m20454a(C4532r c4532r) {
        return new C4529m(c4532r);
    }

    /* renamed from: a */
    public final boolean m20456a() {
        return this.f16835c == null;
    }

    private C4529m(T t, C4514a c4514a) {
        this.f16836d = false;
        this.f16833a = t;
        this.f16834b = c4514a;
        this.f16835c = null;
    }

    private C4529m(C4532r c4532r) {
        this.f16836d = false;
        this.f16833a = null;
        this.f16834b = null;
        this.f16835c = c4532r;
    }
}
