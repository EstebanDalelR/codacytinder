package com.tinder.match.provider;

import com.tinder.domain.fastmatch.usecase.ObserveHasFastMatches;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.match.p293e.C9864c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.provider.e */
public final class C13435e implements Factory<C9877d> {
    /* renamed from: a */
    private final Provider<C9880i> f42621a;
    /* renamed from: b */
    private final Provider<ObserveHasFastMatches> f42622b;
    /* renamed from: c */
    private final Provider<SubscriptionProvider> f42623c;
    /* renamed from: d */
    private final Provider<C9864c> f42624d;

    public /* synthetic */ Object get() {
        return m51930a();
    }

    public C13435e(Provider<C9880i> provider, Provider<ObserveHasFastMatches> provider2, Provider<SubscriptionProvider> provider3, Provider<C9864c> provider4) {
        this.f42621a = provider;
        this.f42622b = provider2;
        this.f42623c = provider3;
        this.f42624d = provider4;
    }

    /* renamed from: a */
    public C9877d m51930a() {
        return C13435e.m51928a(this.f42621a, this.f42622b, this.f42623c, this.f42624d);
    }

    /* renamed from: a */
    public static C9877d m51928a(Provider<C9880i> provider, Provider<ObserveHasFastMatches> provider2, Provider<SubscriptionProvider> provider3, Provider<C9864c> provider4) {
        return new C9877d((C9880i) provider.get(), (ObserveHasFastMatches) provider2.get(), (SubscriptionProvider) provider3.get(), (C9864c) provider4.get());
    }

    /* renamed from: b */
    public static C13435e m51929b(Provider<C9880i> provider, Provider<ObserveHasFastMatches> provider2, Provider<SubscriptionProvider> provider3, Provider<C9864c> provider4) {
        return new C13435e(provider, provider2, provider3, provider4);
    }
}
