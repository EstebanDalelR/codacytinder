package com.tinder.profile.p363b;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.b.d */
public final class C17751d implements Factory<C14377c> {
    /* renamed from: a */
    private final Provider<C2630h> f55391a;

    public /* synthetic */ Object get() {
        return m64906a();
    }

    public C17751d(Provider<C2630h> provider) {
        this.f55391a = provider;
    }

    /* renamed from: a */
    public C14377c m64906a() {
        return C17751d.m64904a(this.f55391a);
    }

    /* renamed from: a */
    public static C14377c m64904a(Provider<C2630h> provider) {
        return new C14377c((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C17751d m64905b(Provider<C2630h> provider) {
        return new C17751d(provider);
    }
}
