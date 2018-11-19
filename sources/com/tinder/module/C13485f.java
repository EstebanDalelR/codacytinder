package com.tinder.module;

import com.tinder.addy.AdAggregator.Listener;
import com.tinder.ads.BrandedProfileCardTrackingUrlsAdAggregatorListener;
import com.tinder.ads.NativeVideoAndDisplayTrackingUrlAdAggregatorListener;
import com.tinder.ads.analytics.AnalyticsAdAggregatorListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.module.f */
public final class C13485f implements Factory<Set<Listener>> {
    /* renamed from: a */
    private final C9940d f43004a;
    /* renamed from: b */
    private final Provider<AnalyticsAdAggregatorListener> f43005b;
    /* renamed from: c */
    private final Provider<BrandedProfileCardTrackingUrlsAdAggregatorListener> f43006c;
    /* renamed from: d */
    private final Provider<NativeVideoAndDisplayTrackingUrlAdAggregatorListener> f43007d;

    public /* synthetic */ Object get() {
        return m52506a();
    }

    public C13485f(C9940d c9940d, Provider<AnalyticsAdAggregatorListener> provider, Provider<BrandedProfileCardTrackingUrlsAdAggregatorListener> provider2, Provider<NativeVideoAndDisplayTrackingUrlAdAggregatorListener> provider3) {
        this.f43004a = c9940d;
        this.f43005b = provider;
        this.f43006c = provider2;
        this.f43007d = provider3;
    }

    /* renamed from: a */
    public Set<Listener> m52506a() {
        return C13485f.m52504a(this.f43004a, this.f43005b, this.f43006c, this.f43007d);
    }

    /* renamed from: a */
    public static Set<Listener> m52504a(C9940d c9940d, Provider<AnalyticsAdAggregatorListener> provider, Provider<BrandedProfileCardTrackingUrlsAdAggregatorListener> provider2, Provider<NativeVideoAndDisplayTrackingUrlAdAggregatorListener> provider3) {
        return C13485f.m52503a(c9940d, (AnalyticsAdAggregatorListener) provider.get(), (BrandedProfileCardTrackingUrlsAdAggregatorListener) provider2.get(), (NativeVideoAndDisplayTrackingUrlAdAggregatorListener) provider3.get());
    }

    /* renamed from: b */
    public static C13485f m52505b(C9940d c9940d, Provider<AnalyticsAdAggregatorListener> provider, Provider<BrandedProfileCardTrackingUrlsAdAggregatorListener> provider2, Provider<NativeVideoAndDisplayTrackingUrlAdAggregatorListener> provider3) {
        return new C13485f(c9940d, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static Set<Listener> m52503a(C9940d c9940d, AnalyticsAdAggregatorListener analyticsAdAggregatorListener, BrandedProfileCardTrackingUrlsAdAggregatorListener brandedProfileCardTrackingUrlsAdAggregatorListener, NativeVideoAndDisplayTrackingUrlAdAggregatorListener nativeVideoAndDisplayTrackingUrlAdAggregatorListener) {
        return (Set) C15521i.a(c9940d.m40866a(analyticsAdAggregatorListener, brandedProfileCardTrackingUrlsAdAggregatorListener, nativeVideoAndDisplayTrackingUrlAdAggregatorListener), "Cannot return null from a non-@Nullable @Provides method");
    }
}
