package com.tinder.match.p292c;

import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.match.viewmodel.C9889e;
import com.tinder.match.viewmodel.C9891i;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.c.j */
public final class C13423j implements Factory<C9891i> {
    /* renamed from: a */
    private final C9851g f42572a;
    /* renamed from: b */
    private final Provider<C9889e> f42573b;
    /* renamed from: c */
    private final Provider<FastMatchConfigProvider> f42574c;
    /* renamed from: d */
    private final Provider<SubscriptionProvider> f42575d;

    public /* synthetic */ Object get() {
        return m51895a();
    }

    public C13423j(C9851g c9851g, Provider<C9889e> provider, Provider<FastMatchConfigProvider> provider2, Provider<SubscriptionProvider> provider3) {
        this.f42572a = c9851g;
        this.f42573b = provider;
        this.f42574c = provider2;
        this.f42575d = provider3;
    }

    /* renamed from: a */
    public C9891i m51895a() {
        return C13423j.m51893a(this.f42572a, this.f42573b, this.f42574c, this.f42575d);
    }

    /* renamed from: a */
    public static C9891i m51893a(C9851g c9851g, Provider<C9889e> provider, Provider<FastMatchConfigProvider> provider2, Provider<SubscriptionProvider> provider3) {
        return C13423j.m51892a(c9851g, (C9889e) provider.get(), (FastMatchConfigProvider) provider2.get(), (SubscriptionProvider) provider3.get());
    }

    /* renamed from: b */
    public static C13423j m51894b(C9851g c9851g, Provider<C9889e> provider, Provider<FastMatchConfigProvider> provider2, Provider<SubscriptionProvider> provider3) {
        return new C13423j(c9851g, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static C9891i m51892a(C9851g c9851g, C9889e c9889e, FastMatchConfigProvider fastMatchConfigProvider, SubscriptionProvider subscriptionProvider) {
        return (C9891i) C15521i.a(c9851g.m40547a(c9889e, fastMatchConfigProvider, subscriptionProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
