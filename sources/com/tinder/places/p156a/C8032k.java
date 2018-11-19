package com.tinder.places.p156a;

import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.fireboarding.domain.C11806k;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.a.k */
public final class C8032k implements Factory<C7353j> {
    /* renamed from: a */
    private final Provider<PlacesConfigProvider> f28691a;
    /* renamed from: b */
    private final Provider<C7343b> f28692b;
    /* renamed from: c */
    private final Provider<SwipeCountRepository> f28693c;
    /* renamed from: d */
    private final Provider<C11806k> f28694d;

    public /* synthetic */ Object get() {
        return m33959a();
    }

    public C8032k(Provider<PlacesConfigProvider> provider, Provider<C7343b> provider2, Provider<SwipeCountRepository> provider3, Provider<C11806k> provider4) {
        this.f28691a = provider;
        this.f28692b = provider2;
        this.f28693c = provider3;
        this.f28694d = provider4;
    }

    /* renamed from: a */
    public C7353j m33959a() {
        return C8032k.m33957a(this.f28691a, this.f28692b, this.f28693c, this.f28694d);
    }

    /* renamed from: a */
    public static C7353j m33957a(Provider<PlacesConfigProvider> provider, Provider<C7343b> provider2, Provider<SwipeCountRepository> provider3, Provider<C11806k> provider4) {
        return new C7353j((PlacesConfigProvider) provider.get(), (C7343b) provider2.get(), (SwipeCountRepository) provider3.get(), (C11806k) provider4.get());
    }

    /* renamed from: b */
    public static C8032k m33958b(Provider<PlacesConfigProvider> provider, Provider<C7343b> provider2, Provider<SwipeCountRepository> provider3, Provider<C11806k> provider4) {
        return new C8032k(provider, provider2, provider3, provider4);
    }
}
