package com.tinder.smsauth.data.p412a;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import okhttp3.Interceptor;

/* renamed from: com.tinder.smsauth.data.a.c */
public final class C18086c implements Factory<Interceptor> {
    /* renamed from: a */
    private final C14966b f56176a;

    public /* synthetic */ Object get() {
        return m65670a();
    }

    /* renamed from: a */
    public Interceptor m65670a() {
        return C18086c.m65668a(this.f56176a);
    }

    /* renamed from: a */
    public static Interceptor m65668a(C14966b c14966b) {
        return C18086c.m65669b(c14966b);
    }

    /* renamed from: b */
    public static Interceptor m65669b(C14966b c14966b) {
        return (Interceptor) C15521i.m58001a(c14966b.m56551c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
