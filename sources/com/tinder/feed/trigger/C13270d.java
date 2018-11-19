package com.tinder.feed.trigger;

import com.tinder.domain.feed.usecase.ObserveHasNewFeedItems;
import com.tinder.domain.profile.usecase.IsUserDueForFeedTooltip;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.trigger.d */
public final class C13270d implements Factory<C11705c> {
    /* renamed from: a */
    private final Provider<IsUserDueForFeedTooltip> f42033a;
    /* renamed from: b */
    private final Provider<ObserveHasNewFeedItems> f42034b;

    public /* synthetic */ Object get() {
        return m51328a();
    }

    public C13270d(Provider<IsUserDueForFeedTooltip> provider, Provider<ObserveHasNewFeedItems> provider2) {
        this.f42033a = provider;
        this.f42034b = provider2;
    }

    /* renamed from: a */
    public C11705c m51328a() {
        return C13270d.m51326a(this.f42033a, this.f42034b);
    }

    /* renamed from: a */
    public static C11705c m51326a(Provider<IsUserDueForFeedTooltip> provider, Provider<ObserveHasNewFeedItems> provider2) {
        return new C11705c((IsUserDueForFeedTooltip) provider.get(), (ObserveHasNewFeedItems) provider2.get());
    }

    /* renamed from: b */
    public static C13270d m51327b(Provider<IsUserDueForFeedTooltip> provider, Provider<ObserveHasNewFeedItems> provider2) {
        return new C13270d(provider, provider2);
    }
}
