package com.tinder.feed.analytics.session;

import dagger.internal.Factory;
import javax.inject.Provider;
import rx.C2671a;

/* renamed from: com.tinder.feed.analytics.session.g */
public final class C13241g implements Factory<C9450f> {
    /* renamed from: a */
    private final Provider<C9455n> f41967a;
    /* renamed from: b */
    private final Provider<C9451h> f41968b;
    /* renamed from: c */
    private final Provider<C2671a> f41969c;

    public /* synthetic */ Object get() {
        return m51249a();
    }

    public C13241g(Provider<C9455n> provider, Provider<C9451h> provider2, Provider<C2671a> provider3) {
        this.f41967a = provider;
        this.f41968b = provider2;
        this.f41969c = provider3;
    }

    /* renamed from: a */
    public C9450f m51249a() {
        return C13241g.m51247a(this.f41967a, this.f41968b, this.f41969c);
    }

    /* renamed from: a */
    public static C9450f m51247a(Provider<C9455n> provider, Provider<C9451h> provider2, Provider<C2671a> provider3) {
        return new C9450f((C9455n) provider.get(), (C9451h) provider2.get(), (C2671a) provider3.get());
    }

    /* renamed from: b */
    public static C13241g m51248b(Provider<C9455n> provider, Provider<C9451h> provider2, Provider<C2671a> provider3) {
        return new C13241g(provider, provider2, provider3);
    }
}
