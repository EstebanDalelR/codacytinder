package com.tinder.p238f.p243e;

import com.tinder.common.logger.Logger;
import com.tinder.fireboarding.domain.C11824u;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.f.e.j */
public final class C13176j implements Factory<C11607i> {
    /* renamed from: a */
    private final Provider<C11824u> f41855a;
    /* renamed from: b */
    private final Provider<Logger> f41856b;

    public /* synthetic */ Object get() {
        return m51112a();
    }

    public C13176j(Provider<C11824u> provider, Provider<Logger> provider2) {
        this.f41855a = provider;
        this.f41856b = provider2;
    }

    /* renamed from: a */
    public C11607i m51112a() {
        return C13176j.m51110a(this.f41855a, this.f41856b);
    }

    /* renamed from: a */
    public static C11607i m51110a(Provider<C11824u> provider, Provider<Logger> provider2) {
        return new C11607i((C11824u) provider.get(), (Logger) provider2.get());
    }

    /* renamed from: b */
    public static C13176j m51111b(Provider<C11824u> provider, Provider<Logger> provider2) {
        return new C13176j(provider, provider2);
    }
}
