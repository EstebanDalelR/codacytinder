package com.tinder.p238f.p243e;

import com.tinder.boost.provider.C8349a;
import com.tinder.common.logger.Logger;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.f.e.h */
public final class C13175h implements Factory<C11604g> {
    /* renamed from: a */
    private final Provider<C8349a> f41853a;
    /* renamed from: b */
    private final Provider<Logger> f41854b;

    public /* synthetic */ Object get() {
        return m51109a();
    }

    public C13175h(Provider<C8349a> provider, Provider<Logger> provider2) {
        this.f41853a = provider;
        this.f41854b = provider2;
    }

    /* renamed from: a */
    public C11604g m51109a() {
        return C13175h.m51107a(this.f41853a, this.f41854b);
    }

    /* renamed from: a */
    public static C11604g m51107a(Provider<C8349a> provider, Provider<Logger> provider2) {
        return new C11604g((C8349a) provider.get(), (Logger) provider2.get());
    }

    /* renamed from: b */
    public static C13175h m51108b(Provider<C8349a> provider, Provider<Logger> provider2) {
        return new C13175h(provider, provider2);
    }
}
