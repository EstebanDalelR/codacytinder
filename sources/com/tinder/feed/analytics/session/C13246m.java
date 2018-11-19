package com.tinder.feed.analytics.session;

import com.tinder.domain.feed.FeedRangeRepository;
import dagger.internal.Factory;
import java.util.concurrent.CyclicBarrier;
import javax.inject.Provider;
import rx.C2671a;

/* renamed from: com.tinder.feed.analytics.session.m */
public final class C13246m implements Factory<C9453j> {
    /* renamed from: a */
    private final Provider<FeedPositionRequestProvider> f41977a;
    /* renamed from: b */
    private final Provider<CyclicBarrier> f41978b;
    /* renamed from: c */
    private final Provider<CyclicBarrier> f41979c;
    /* renamed from: d */
    private final Provider<FeedRangeRepository> f41980d;
    /* renamed from: e */
    private final Provider<C2671a> f41981e;

    public /* synthetic */ Object get() {
        return m51260a();
    }

    public C13246m(Provider<FeedPositionRequestProvider> provider, Provider<CyclicBarrier> provider2, Provider<CyclicBarrier> provider3, Provider<FeedRangeRepository> provider4, Provider<C2671a> provider5) {
        this.f41977a = provider;
        this.f41978b = provider2;
        this.f41979c = provider3;
        this.f41980d = provider4;
        this.f41981e = provider5;
    }

    /* renamed from: a */
    public C9453j m51260a() {
        return C13246m.m51258a(this.f41977a, this.f41978b, this.f41979c, this.f41980d, this.f41981e);
    }

    /* renamed from: a */
    public static C9453j m51258a(Provider<FeedPositionRequestProvider> provider, Provider<CyclicBarrier> provider2, Provider<CyclicBarrier> provider3, Provider<FeedRangeRepository> provider4, Provider<C2671a> provider5) {
        return new C9453j((FeedPositionRequestProvider) provider.get(), (CyclicBarrier) provider2.get(), (CyclicBarrier) provider3.get(), (FeedRangeRepository) provider4.get(), (C2671a) provider5.get());
    }

    /* renamed from: b */
    public static C13246m m51259b(Provider<FeedPositionRequestProvider> provider, Provider<CyclicBarrier> provider2, Provider<CyclicBarrier> provider3, Provider<FeedRangeRepository> provider4, Provider<C2671a> provider5) {
        return new C13246m(provider, provider2, provider3, provider4, provider5);
    }
}
