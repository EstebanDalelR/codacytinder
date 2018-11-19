package com.tinder.home.p342a;

import com.tinder.domain.feed.usecase.ObserveFeed;
import com.tinder.domain.feed.usecase.ObserveHasNewFeedItems;
import com.tinder.domain.feed.usecase.PollForNewFeedItems;
import com.tinder.feed.analytics.events.C11692g;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.home.a.b */
public final class C13323b implements Factory<C11862a> {
    /* renamed from: a */
    private final Provider<ObserveHasNewFeedItems> f42271a;
    /* renamed from: b */
    private final Provider<PollForNewFeedItems> f42272b;
    /* renamed from: c */
    private final Provider<ObserveFeed> f42273c;
    /* renamed from: d */
    private final Provider<C11692g> f42274d;

    public /* synthetic */ Object get() {
        return m51561a();
    }

    public C13323b(Provider<ObserveHasNewFeedItems> provider, Provider<PollForNewFeedItems> provider2, Provider<ObserveFeed> provider3, Provider<C11692g> provider4) {
        this.f42271a = provider;
        this.f42272b = provider2;
        this.f42273c = provider3;
        this.f42274d = provider4;
    }

    /* renamed from: a */
    public C11862a m51561a() {
        return C13323b.m51559a(this.f42271a, this.f42272b, this.f42273c, this.f42274d);
    }

    /* renamed from: a */
    public static C11862a m51559a(Provider<ObserveHasNewFeedItems> provider, Provider<PollForNewFeedItems> provider2, Provider<ObserveFeed> provider3, Provider<C11692g> provider4) {
        return new C11862a((ObserveHasNewFeedItems) provider.get(), (PollForNewFeedItems) provider2.get(), (ObserveFeed) provider3.get(), (C11692g) provider4.get());
    }

    /* renamed from: b */
    public static C13323b m51560b(Provider<ObserveHasNewFeedItems> provider, Provider<PollForNewFeedItems> provider2, Provider<ObserveFeed> provider3, Provider<C11692g> provider4) {
        return new C13323b(provider, provider2, provider3, provider4);
    }
}
