package com.tinder.match.analytics;

import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.analytics.r */
public final class C13413r implements Factory<C9846q> {
    /* renamed from: a */
    private final Provider<FastMatchConfigProvider> f42553a;
    /* renamed from: b */
    private final Provider<FastMatchStatusProvider> f42554b;
    /* renamed from: c */
    private final Provider<C9844j> f42555c;
    /* renamed from: d */
    private final Provider<C9842h> f42556d;

    public /* synthetic */ Object get() {
        return m51858a();
    }

    public C13413r(Provider<FastMatchConfigProvider> provider, Provider<FastMatchStatusProvider> provider2, Provider<C9844j> provider3, Provider<C9842h> provider4) {
        this.f42553a = provider;
        this.f42554b = provider2;
        this.f42555c = provider3;
        this.f42556d = provider4;
    }

    /* renamed from: a */
    public C9846q m51858a() {
        return C13413r.m51856a(this.f42553a, this.f42554b, this.f42555c, this.f42556d);
    }

    /* renamed from: a */
    public static C9846q m51856a(Provider<FastMatchConfigProvider> provider, Provider<FastMatchStatusProvider> provider2, Provider<C9844j> provider3, Provider<C9842h> provider4) {
        return new C9846q((FastMatchConfigProvider) provider.get(), (FastMatchStatusProvider) provider2.get(), (C9844j) provider3.get(), (C9842h) provider4.get());
    }

    /* renamed from: b */
    public static C13413r m51857b(Provider<FastMatchConfigProvider> provider, Provider<FastMatchStatusProvider> provider2, Provider<C9844j> provider3, Provider<C9842h> provider4) {
        return new C13413r(provider, provider2, provider3, provider4);
    }
}
