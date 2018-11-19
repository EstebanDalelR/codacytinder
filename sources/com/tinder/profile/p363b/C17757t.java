package com.tinder.profile.p363b;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.b.t */
public final class C17757t implements Factory<C14392s> {
    /* renamed from: a */
    private final Provider<C2630h> f55397a;
    /* renamed from: b */
    private final Provider<bk> f55398b;

    public /* synthetic */ Object get() {
        return m64924a();
    }

    public C17757t(Provider<C2630h> provider, Provider<bk> provider2) {
        this.f55397a = provider;
        this.f55398b = provider2;
    }

    /* renamed from: a */
    public C14392s m64924a() {
        return C17757t.m64922a(this.f55397a, this.f55398b);
    }

    /* renamed from: a */
    public static C14392s m64922a(Provider<C2630h> provider, Provider<bk> provider2) {
        return new C14392s((C2630h) provider.get(), (bk) provider2.get());
    }

    /* renamed from: b */
    public static C17757t m64923b(Provider<C2630h> provider, Provider<bk> provider2) {
        return new C17757t(provider, provider2);
    }
}
