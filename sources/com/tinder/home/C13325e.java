package com.tinder.home;

import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.home.p342a.C11862a;
import com.tinder.main.C11991a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.home.e */
public final class C13325e implements Factory<C9697c> {
    /* renamed from: a */
    private final Provider<SubscriptionProvider> f42276a;
    /* renamed from: b */
    private final Provider<C11991a> f42277b;
    /* renamed from: c */
    private final Provider<C11865f> f42278c;
    /* renamed from: d */
    private final Provider<C11862a> f42279d;

    public /* synthetic */ Object get() {
        return m51567a();
    }

    public C13325e(Provider<SubscriptionProvider> provider, Provider<C11991a> provider2, Provider<C11865f> provider3, Provider<C11862a> provider4) {
        this.f42276a = provider;
        this.f42277b = provider2;
        this.f42278c = provider3;
        this.f42279d = provider4;
    }

    /* renamed from: a */
    public C9697c m51567a() {
        return C13325e.m51565a(this.f42276a, this.f42277b, this.f42278c, this.f42279d);
    }

    /* renamed from: a */
    public static C9697c m51565a(Provider<SubscriptionProvider> provider, Provider<C11991a> provider2, Provider<C11865f> provider3, Provider<C11862a> provider4) {
        return new C9697c((SubscriptionProvider) provider.get(), (C11991a) provider2.get(), (C11865f) provider3.get(), (C11862a) provider4.get());
    }

    /* renamed from: b */
    public static C13325e m51566b(Provider<SubscriptionProvider> provider, Provider<C11991a> provider2, Provider<C11865f> provider3, Provider<C11862a> provider4) {
        return new C13325e(provider, provider2, provider3, provider4);
    }
}
