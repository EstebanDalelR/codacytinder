package com.tinder.places.p156a;

import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.fireboarding.domain.C11806k;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.a.m */
public final class C8033m implements Factory<C7357l> {
    /* renamed from: a */
    private final Provider<CheckTutorialViewed> f28695a;
    /* renamed from: b */
    private final Provider<C7343b> f28696b;
    /* renamed from: c */
    private final Provider<C11806k> f28697c;
    /* renamed from: d */
    private final Provider<SwipeCountRepository> f28698d;

    public /* synthetic */ Object get() {
        return m33962a();
    }

    public C8033m(Provider<CheckTutorialViewed> provider, Provider<C7343b> provider2, Provider<C11806k> provider3, Provider<SwipeCountRepository> provider4) {
        this.f28695a = provider;
        this.f28696b = provider2;
        this.f28697c = provider3;
        this.f28698d = provider4;
    }

    /* renamed from: a */
    public C7357l m33962a() {
        return C8033m.m33960a(this.f28695a, this.f28696b, this.f28697c, this.f28698d);
    }

    /* renamed from: a */
    public static C7357l m33960a(Provider<CheckTutorialViewed> provider, Provider<C7343b> provider2, Provider<C11806k> provider3, Provider<SwipeCountRepository> provider4) {
        return new C7357l((CheckTutorialViewed) provider.get(), (C7343b) provider2.get(), (C11806k) provider3.get(), (SwipeCountRepository) provider4.get());
    }

    /* renamed from: b */
    public static C8033m m33961b(Provider<CheckTutorialViewed> provider, Provider<C7343b> provider2, Provider<C11806k> provider3, Provider<SwipeCountRepository> provider4) {
        return new C8033m(provider, provider2, provider3, provider4);
    }
}
