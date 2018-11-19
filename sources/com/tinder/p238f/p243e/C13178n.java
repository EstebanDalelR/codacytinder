package com.tinder.p238f.p243e;

import com.tinder.common.logger.Logger;
import com.tinder.passport.p093d.C3945a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.f.e.n */
public final class C13178n implements Factory<C11609m> {
    /* renamed from: a */
    private final Provider<C3945a> f41862a;
    /* renamed from: b */
    private final Provider<Logger> f41863b;

    public /* synthetic */ Object get() {
        return m51118a();
    }

    public C13178n(Provider<C3945a> provider, Provider<Logger> provider2) {
        this.f41862a = provider;
        this.f41863b = provider2;
    }

    /* renamed from: a */
    public C11609m m51118a() {
        return C13178n.m51116a(this.f41862a, this.f41863b);
    }

    /* renamed from: a */
    public static C11609m m51116a(Provider<C3945a> provider, Provider<Logger> provider2) {
        return new C11609m((C3945a) provider.get(), (Logger) provider2.get());
    }

    /* renamed from: b */
    public static C13178n m51117b(Provider<C3945a> provider, Provider<Logger> provider2) {
        return new C13178n(provider, provider2);
    }
}
