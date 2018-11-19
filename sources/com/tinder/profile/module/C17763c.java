package com.tinder.profile.module;

import com.tinder.recs.model.TappyConfig;
import com.tinder.recs.provider.TappyConfigProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.module.c */
public final class C17763c implements Factory<TappyConfig> {
    /* renamed from: a */
    private final C14421a f55423a;
    /* renamed from: b */
    private final Provider<TappyConfigProvider> f55424b;

    public /* synthetic */ Object get() {
        return m64940a();
    }

    public C17763c(C14421a c14421a, Provider<TappyConfigProvider> provider) {
        this.f55423a = c14421a;
        this.f55424b = provider;
    }

    /* renamed from: a */
    public TappyConfig m64940a() {
        return C17763c.m64938a(this.f55423a, this.f55424b);
    }

    /* renamed from: a */
    public static TappyConfig m64938a(C14421a c14421a, Provider<TappyConfigProvider> provider) {
        return C17763c.m64937a(c14421a, (TappyConfigProvider) provider.get());
    }

    /* renamed from: b */
    public static C17763c m64939b(C14421a c14421a, Provider<TappyConfigProvider> provider) {
        return new C17763c(c14421a, provider);
    }

    /* renamed from: a */
    public static TappyConfig m64937a(C14421a c14421a, TappyConfigProvider tappyConfigProvider) {
        return (TappyConfig) C15521i.m58001a(c14421a.m54970a(tappyConfigProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
