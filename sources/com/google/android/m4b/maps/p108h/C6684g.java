package com.google.android.m4b.maps.p108h;

import android.os.Bundle;
import com.google.android.m4b.maps.p107g.C6676a;
import com.google.android.m4b.maps.p108h.C5406b.C5401a;
import com.google.android.m4b.maps.p108h.C5407c.C7690a;
import com.google.android.m4b.maps.p108h.C6689h.C5421e;

/* renamed from: com.google.android.m4b.maps.h.g */
public final class C6684g implements C5422i {
    /* renamed from: a */
    private final C6689h f25007a;

    /* renamed from: a */
    public final void mo5405a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo5406a(C6676a c6676a, C5406b<?> c5406b, int i) {
    }

    /* renamed from: b */
    public final void mo5409b(int i) {
    }

    /* renamed from: c */
    public final String mo5410c() {
        return "DISCONNECTED";
    }

    public C6684g(C6689h c6689h) {
        this.f25007a = c6689h;
    }

    /* renamed from: a */
    public final void mo5403a() {
        for (C5401a d : this.f25007a.f25017d.values()) {
            d.mo5432d();
        }
    }

    /* renamed from: a */
    public final <A extends C5401a, R extends C5427m, T extends C7690a<R, A>> T mo5402a(T t) {
        this.f25007a.f25015b.add(t);
        return t;
    }

    /* renamed from: b */
    public final <A extends C5401a, T extends C7690a<? extends C5427m, A>> T mo5407b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: a */
    public final void mo5404a(int i) {
        if ((i == -1 ? 1 : 0) != 0) {
            for (C5421e a : this.f25007a.f25015b) {
                a.m23630a();
            }
            this.f25007a.f25015b.clear();
            this.f25007a.m29842f();
            this.f25007a.f25018e.clear();
        }
    }

    /* renamed from: b */
    public final void mo5408b() {
        this.f25007a.m29843g();
    }
}
