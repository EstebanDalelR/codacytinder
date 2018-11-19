package com.tinder.match.analytics;

import com.tinder.domain.purchase.SubscriptionProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.analytics.i */
public final class C13407i implements Factory<C9842h> {
    /* renamed from: a */
    private final Provider<SubscriptionProvider> f42543a;

    public /* synthetic */ Object get() {
        return m51849a();
    }

    public C13407i(Provider<SubscriptionProvider> provider) {
        this.f42543a = provider;
    }

    /* renamed from: a */
    public C9842h m51849a() {
        return C13407i.m51847a(this.f42543a);
    }

    /* renamed from: a */
    public static C9842h m51847a(Provider<SubscriptionProvider> provider) {
        return new C9842h((SubscriptionProvider) provider.get());
    }

    /* renamed from: b */
    public static C13407i m51848b(Provider<SubscriptionProvider> provider) {
        return new C13407i(provider);
    }
}
