package com.tinder.feed.analytics.p247a;

import com.tinder.domain.feed.FeedCarouselItemSelectedRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.analytics.a.k */
public final class C13223k implements Factory<C9427h> {
    /* renamed from: a */
    private final Provider<FeedCarouselItemSelectedRepository> f41940a;

    public /* synthetic */ Object get() {
        return m51219a();
    }

    public C13223k(Provider<FeedCarouselItemSelectedRepository> provider) {
        this.f41940a = provider;
    }

    /* renamed from: a */
    public C9427h m51219a() {
        return C13223k.m51217a(this.f41940a);
    }

    /* renamed from: a */
    public static C9427h m51217a(Provider<FeedCarouselItemSelectedRepository> provider) {
        return new C9427h((FeedCarouselItemSelectedRepository) provider.get());
    }

    /* renamed from: b */
    public static C13223k m51218b(Provider<FeedCarouselItemSelectedRepository> provider) {
        return new C13223k(provider);
    }
}
