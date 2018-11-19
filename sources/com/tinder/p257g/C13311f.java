package com.tinder.p257g;

import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.tinderplus.C2657a;
import com.tinder.tinderplus.p428a.C15193i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.g.f */
public final class C13311f implements Factory<C9648e> {
    /* renamed from: a */
    private final Provider<C15193i> f42253a;
    /* renamed from: b */
    private final Provider<C2657a> f42254b;
    /* renamed from: c */
    private final Provider<SubscriptionProvider> f42255c;

    public /* synthetic */ Object get() {
        return m51545a();
    }

    public C13311f(Provider<C15193i> provider, Provider<C2657a> provider2, Provider<SubscriptionProvider> provider3) {
        this.f42253a = provider;
        this.f42254b = provider2;
        this.f42255c = provider3;
    }

    /* renamed from: a */
    public C9648e m51545a() {
        return C13311f.m51543a(this.f42253a, this.f42254b, this.f42255c);
    }

    /* renamed from: a */
    public static C9648e m51543a(Provider<C15193i> provider, Provider<C2657a> provider2, Provider<SubscriptionProvider> provider3) {
        return new C9648e((C15193i) provider.get(), (C2657a) provider2.get(), (SubscriptionProvider) provider3.get());
    }

    /* renamed from: b */
    public static C13311f m51544b(Provider<C15193i> provider, Provider<C2657a> provider2, Provider<SubscriptionProvider> provider3) {
        return new C13311f(provider, provider2, provider3);
    }
}
