package com.tinder.profile.p363b;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.b.q */
public final class C17756q implements Factory<C16081p> {
    /* renamed from: a */
    private final Provider<C2630h> f55396a;

    public /* synthetic */ Object get() {
        return m64921a();
    }

    public C17756q(Provider<C2630h> provider) {
        this.f55396a = provider;
    }

    /* renamed from: a */
    public C16081p m64921a() {
        return C17756q.m64919a(this.f55396a);
    }

    /* renamed from: a */
    public static C16081p m64919a(Provider<C2630h> provider) {
        return new C16081p((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C17756q m64920b(Provider<C2630h> provider) {
        return new C17756q(provider);
    }
}
