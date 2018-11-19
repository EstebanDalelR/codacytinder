package com.tinder.session.analytics.p402a;

import com.tinder.domain.auth.usecase.MaskEmail;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.session.analytics.a.b */
public final class C18052b implements Factory<C18051a> {
    /* renamed from: a */
    private final Provider<MaskEmail> f56060a;

    public /* synthetic */ Object get() {
        return m65532a();
    }

    public C18052b(Provider<MaskEmail> provider) {
        this.f56060a = provider;
    }

    /* renamed from: a */
    public C18051a m65532a() {
        return C18052b.m65530a(this.f56060a);
    }

    /* renamed from: a */
    public static C18051a m65530a(Provider<MaskEmail> provider) {
        return new C18051a((MaskEmail) provider.get());
    }

    /* renamed from: b */
    public static C18052b m65531b(Provider<MaskEmail> provider) {
        return new C18052b(provider);
    }
}
