package com.tinder.match.sponsoredmessage;

import com.tinder.ads.AdAggregator;
import com.tinder.domain.purchase.SubscriptionProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.sponsoredmessage.j */
public final class C13452j implements Factory<AdAggregator> {
    /* renamed from: a */
    private final C9882h f42648a;
    /* renamed from: b */
    private final Provider<SubscriptionProvider> f42649b;

    public /* synthetic */ Object get() {
        return m51959a();
    }

    public C13452j(C9882h c9882h, Provider<SubscriptionProvider> provider) {
        this.f42648a = c9882h;
        this.f42649b = provider;
    }

    /* renamed from: a */
    public AdAggregator m51959a() {
        return C13452j.m51957a(this.f42648a, this.f42649b);
    }

    /* renamed from: a */
    public static AdAggregator m51957a(C9882h c9882h, Provider<SubscriptionProvider> provider) {
        return C13452j.m51956a(c9882h, (SubscriptionProvider) provider.get());
    }

    /* renamed from: b */
    public static C13452j m51958b(C9882h c9882h, Provider<SubscriptionProvider> provider) {
        return new C13452j(c9882h, provider);
    }

    /* renamed from: a */
    public static AdAggregator m51956a(C9882h c9882h, SubscriptionProvider subscriptionProvider) {
        return (AdAggregator) C15521i.a(c9882h.m40660a(subscriptionProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
