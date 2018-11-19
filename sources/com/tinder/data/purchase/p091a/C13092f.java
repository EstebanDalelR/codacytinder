package com.tinder.data.purchase.p091a;

import com.tinder.domain.purchase.SubscriptionProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.purchase.a.f */
public final class C13092f implements Factory<C3927e> {
    /* renamed from: a */
    private final Provider<SubscriptionProvider> f41695a;

    public /* synthetic */ Object get() {
        return m50935a();
    }

    public C13092f(Provider<SubscriptionProvider> provider) {
        this.f41695a = provider;
    }

    /* renamed from: a */
    public C3927e m50935a() {
        return C13092f.m50933a(this.f41695a);
    }

    /* renamed from: a */
    public static C3927e m50933a(Provider<SubscriptionProvider> provider) {
        return new C3927e((SubscriptionProvider) provider.get());
    }

    /* renamed from: b */
    public static C13092f m50934b(Provider<SubscriptionProvider> provider) {
        return new C13092f(provider);
    }
}
