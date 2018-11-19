package com.tinder.toppicks.domain.worker;

import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.toppicks.usecase.ResetTopPickSession;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.domain.worker.d */
public final class C18228d implements Factory<C17010c> {
    /* renamed from: a */
    private final Provider<SubscriptionProvider> f56509a;
    /* renamed from: b */
    private final Provider<ResetTopPickSession> f56510b;

    public /* synthetic */ Object get() {
        return m66072a();
    }

    public C18228d(Provider<SubscriptionProvider> provider, Provider<ResetTopPickSession> provider2) {
        this.f56509a = provider;
        this.f56510b = provider2;
    }

    /* renamed from: a */
    public C17010c m66072a() {
        return C18228d.m66070a(this.f56509a, this.f56510b);
    }

    /* renamed from: a */
    public static C17010c m66070a(Provider<SubscriptionProvider> provider, Provider<ResetTopPickSession> provider2) {
        return new C17010c((SubscriptionProvider) provider.get(), (ResetTopPickSession) provider2.get());
    }

    /* renamed from: b */
    public static C18228d m66071b(Provider<SubscriptionProvider> provider, Provider<ResetTopPickSession> provider2) {
        return new C18228d(provider, provider2);
    }
}
