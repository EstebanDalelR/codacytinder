package com.tinder.match.sponsoredmessage;

import com.tinder.addy.AdAggregator.Listener;
import com.tinder.ads.SponsoredMessageTrackingUrlsAdAggregatorListener;
import com.tinder.ads.analytics.SponsoredMessageAnalyticsAdAggregatorListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.match.sponsoredmessage.m */
public final class C13455m implements Factory<Set<Listener>> {
    /* renamed from: a */
    private final C9882h f42657a;
    /* renamed from: b */
    private final Provider<SponsoredMessageTrackingUrlsAdAggregatorListener> f42658b;
    /* renamed from: c */
    private final Provider<SponsoredMessageAnalyticsAdAggregatorListener> f42659c;

    public /* synthetic */ Object get() {
        return m51971a();
    }

    public C13455m(C9882h c9882h, Provider<SponsoredMessageTrackingUrlsAdAggregatorListener> provider, Provider<SponsoredMessageAnalyticsAdAggregatorListener> provider2) {
        this.f42657a = c9882h;
        this.f42658b = provider;
        this.f42659c = provider2;
    }

    /* renamed from: a */
    public Set<Listener> m51971a() {
        return C13455m.m51969a(this.f42657a, this.f42658b, this.f42659c);
    }

    /* renamed from: a */
    public static Set<Listener> m51969a(C9882h c9882h, Provider<SponsoredMessageTrackingUrlsAdAggregatorListener> provider, Provider<SponsoredMessageAnalyticsAdAggregatorListener> provider2) {
        return C13455m.m51968a(c9882h, (SponsoredMessageTrackingUrlsAdAggregatorListener) provider.get(), (SponsoredMessageAnalyticsAdAggregatorListener) provider2.get());
    }

    /* renamed from: b */
    public static C13455m m51970b(C9882h c9882h, Provider<SponsoredMessageTrackingUrlsAdAggregatorListener> provider, Provider<SponsoredMessageAnalyticsAdAggregatorListener> provider2) {
        return new C13455m(c9882h, provider, provider2);
    }

    /* renamed from: a */
    public static Set<Listener> m51968a(C9882h c9882h, SponsoredMessageTrackingUrlsAdAggregatorListener sponsoredMessageTrackingUrlsAdAggregatorListener, SponsoredMessageAnalyticsAdAggregatorListener sponsoredMessageAnalyticsAdAggregatorListener) {
        return (Set) C15521i.a(c9882h.m40667a(sponsoredMessageTrackingUrlsAdAggregatorListener, sponsoredMessageAnalyticsAdAggregatorListener), "Cannot return null from a non-@Nullable @Provides method");
    }
}
