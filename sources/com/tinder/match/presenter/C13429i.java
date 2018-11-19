package com.tinder.match.presenter;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.common.provider.C8550g;
import com.tinder.domain.ads.SponsoredMessagePingTrackingUrls;
import com.tinder.domain.apprating.AppRatingRepository;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.home.p259b.C9695a;
import com.tinder.match.analytics.C12036c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.presenter.i */
public final class C13429i implements Factory<C9868e> {
    /* renamed from: a */
    private final Provider<FastMatchConfigProvider> f42601a;
    /* renamed from: b */
    private final Provider<C12036c> f42602b;
    /* renamed from: c */
    private final Provider<SponsoredMessagePingTrackingUrls> f42603c;
    /* renamed from: d */
    private final Provider<C9695a> f42604d;
    /* renamed from: e */
    private final Provider<C8550g> f42605e;
    /* renamed from: f */
    private final Provider<AppRatingRepository> f42606f;
    /* renamed from: g */
    private final Provider<TopPicksConfig> f42607g;
    /* renamed from: h */
    private final Provider<AdUrlTracker> f42608h;

    public /* synthetic */ Object get() {
        return m51909a();
    }

    /* renamed from: a */
    public C9868e m51909a() {
        return C13429i.m51908a(this.f42601a, this.f42602b, this.f42603c, this.f42604d, this.f42605e, this.f42606f, this.f42607g, this.f42608h);
    }

    /* renamed from: a */
    public static C9868e m51908a(Provider<FastMatchConfigProvider> provider, Provider<C12036c> provider2, Provider<SponsoredMessagePingTrackingUrls> provider3, Provider<C9695a> provider4, Provider<C8550g> provider5, Provider<AppRatingRepository> provider6, Provider<TopPicksConfig> provider7, Provider<AdUrlTracker> provider8) {
        return new C9868e((FastMatchConfigProvider) provider.get(), (C12036c) provider2.get(), (SponsoredMessagePingTrackingUrls) provider3.get(), (C9695a) provider4.get(), (C8550g) provider5.get(), (AppRatingRepository) provider6.get(), (TopPicksConfig) provider7.get(), (AdUrlTracker) provider8.get());
    }

    /* renamed from: a */
    public static C9868e m51907a(FastMatchConfigProvider fastMatchConfigProvider, C12036c c12036c, SponsoredMessagePingTrackingUrls sponsoredMessagePingTrackingUrls, C9695a c9695a, C8550g c8550g, AppRatingRepository appRatingRepository, TopPicksConfig topPicksConfig, AdUrlTracker adUrlTracker) {
        return new C9868e(fastMatchConfigProvider, c12036c, sponsoredMessagePingTrackingUrls, c9695a, c8550g, appRatingRepository, topPicksConfig, adUrlTracker);
    }
}
