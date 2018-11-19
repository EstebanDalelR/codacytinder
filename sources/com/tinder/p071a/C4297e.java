package com.tinder.p071a;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.a.e */
public final class C4297e implements Factory<C2602d> {
    /* renamed from: a */
    private final Provider<Context> f13997a;

    public /* synthetic */ Object get() {
        return m17265a();
    }

    public C4297e(Provider<Context> provider) {
        this.f13997a = provider;
    }

    /* renamed from: a */
    public C2602d m17265a() {
        return C4297e.m17263a(this.f13997a);
    }

    /* renamed from: a */
    public static C2602d m17263a(Provider<Context> provider) {
        return new C2602d((Context) provider.get());
    }

    /* renamed from: b */
    public static C4297e m17264b(Provider<Context> provider) {
        return new C4297e(provider);
    }
}
