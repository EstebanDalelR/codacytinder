package com.tinder.feed.analytics.session;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import java.util.concurrent.CyclicBarrier;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.analytics.session.l */
public final class C13245l implements Factory<C9454k> {
    /* renamed from: a */
    private final Provider<C9453j> f41973a;
    /* renamed from: b */
    private final Provider<C2642a> f41974b;
    /* renamed from: c */
    private final Provider<CyclicBarrier> f41975c;
    /* renamed from: d */
    private final Provider<CyclicBarrier> f41976d;

    public /* synthetic */ Object get() {
        return m51257a();
    }

    public C13245l(Provider<C9453j> provider, Provider<C2642a> provider2, Provider<CyclicBarrier> provider3, Provider<CyclicBarrier> provider4) {
        this.f41973a = provider;
        this.f41974b = provider2;
        this.f41975c = provider3;
        this.f41976d = provider4;
    }

    /* renamed from: a */
    public C9454k m51257a() {
        return C13245l.m51255a(this.f41973a, this.f41974b, this.f41975c, this.f41976d);
    }

    /* renamed from: a */
    public static C9454k m51255a(Provider<C9453j> provider, Provider<C2642a> provider2, Provider<CyclicBarrier> provider3, Provider<CyclicBarrier> provider4) {
        return new C9454k((C9453j) provider.get(), (C2642a) provider2.get(), (CyclicBarrier) provider3.get(), (CyclicBarrier) provider4.get());
    }

    /* renamed from: b */
    public static C13245l m51256b(Provider<C9453j> provider, Provider<C2642a> provider2, Provider<CyclicBarrier> provider3, Provider<CyclicBarrier> provider4) {
        return new C13245l(provider, provider2, provider3, provider4);
    }
}
