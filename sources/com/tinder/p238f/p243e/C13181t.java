package com.tinder.p238f.p243e;

import com.tinder.common.logger.Logger;
import com.tinder.tinderplus.provider.C15220b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.f.e.t */
public final class C13181t implements Factory<C11612s> {
    /* renamed from: a */
    private final Provider<C15220b> f41871a;
    /* renamed from: b */
    private final Provider<Logger> f41872b;

    public /* synthetic */ Object get() {
        return m51127a();
    }

    public C13181t(Provider<C15220b> provider, Provider<Logger> provider2) {
        this.f41871a = provider;
        this.f41872b = provider2;
    }

    /* renamed from: a */
    public C11612s m51127a() {
        return C13181t.m51125a(this.f41871a, this.f41872b);
    }

    /* renamed from: a */
    public static C11612s m51125a(Provider<C15220b> provider, Provider<Logger> provider2) {
        return new C11612s((C15220b) provider.get(), (Logger) provider2.get());
    }

    /* renamed from: b */
    public static C13181t m51126b(Provider<C15220b> provider, Provider<Logger> provider2) {
        return new C13181t(provider, provider2);
    }
}
