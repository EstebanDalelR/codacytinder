package com.tinder.feed.view.tracker;

import com.tinder.common.tracker.recyclerview.p200c.C8577i;
import com.tinder.domain.feed.FeedCarouselItemSelectedRepository;
import com.tinder.feed.view.provider.C9545e;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.view.tracker.c */
public final class C13299c implements Factory<C9547b> {
    /* renamed from: a */
    private final Provider<C9545e> f42156a;
    /* renamed from: b */
    private final Provider<FeedCarouselItemSelectedRepository> f42157b;
    /* renamed from: c */
    private final Provider<C8577i> f42158c;

    public /* synthetic */ Object get() {
        return m51457a();
    }

    public C13299c(Provider<C9545e> provider, Provider<FeedCarouselItemSelectedRepository> provider2, Provider<C8577i> provider3) {
        this.f42156a = provider;
        this.f42157b = provider2;
        this.f42158c = provider3;
    }

    /* renamed from: a */
    public C9547b m51457a() {
        return C13299c.m51455a(this.f42156a, this.f42157b, this.f42158c);
    }

    /* renamed from: a */
    public static C9547b m51455a(Provider<C9545e> provider, Provider<FeedCarouselItemSelectedRepository> provider2, Provider<C8577i> provider3) {
        return new C9547b((C9545e) provider.get(), (FeedCarouselItemSelectedRepository) provider2.get(), (C8577i) provider3.get());
    }

    /* renamed from: b */
    public static C13299c m51456b(Provider<C9545e> provider, Provider<FeedCarouselItemSelectedRepository> provider2, Provider<C8577i> provider3) {
        return new C13299c(provider, provider2, provider3);
    }
}
