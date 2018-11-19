package com.tinder.module;

import com.tinder.ads.AdAggregator$Listener;
import com.tinder.ads.AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener;
import com.tinder.ads.AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener;
import com.tinder.ads.analytics.V1AnalyticsAdAggregatorListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.module.r */
public final class C13497r implements Factory<Set<AdAggregator$Listener>> {
    /* renamed from: a */
    private final C9940d f43068a;
    /* renamed from: b */
    private final Provider<V1AnalyticsAdAggregatorListener> f43069b;
    /* renamed from: c */
    private final Provider<AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener> f43070c;
    /* renamed from: d */
    private final Provider<AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener> f43071d;

    public /* synthetic */ Object get() {
        return m52579a();
    }

    public C13497r(C9940d c9940d, Provider<V1AnalyticsAdAggregatorListener> provider, Provider<AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener> provider2, Provider<AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener> provider3) {
        this.f43068a = c9940d;
        this.f43069b = provider;
        this.f43070c = provider2;
        this.f43071d = provider3;
    }

    /* renamed from: a */
    public Set<AdAggregator$Listener> m52579a() {
        return C13497r.m52577a(this.f43068a, this.f43069b, this.f43070c, this.f43071d);
    }

    /* renamed from: a */
    public static Set<AdAggregator$Listener> m52577a(C9940d c9940d, Provider<V1AnalyticsAdAggregatorListener> provider, Provider<AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener> provider2, Provider<AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener> provider3) {
        return C13497r.m52576a(c9940d, (V1AnalyticsAdAggregatorListener) provider.get(), (AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener) provider2.get(), (AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener) provider3.get());
    }

    /* renamed from: b */
    public static C13497r m52578b(C9940d c9940d, Provider<V1AnalyticsAdAggregatorListener> provider, Provider<AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener> provider2, Provider<AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener> provider3) {
        return new C13497r(c9940d, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static Set<AdAggregator$Listener> m52576a(C9940d c9940d, V1AnalyticsAdAggregatorListener v1AnalyticsAdAggregatorListener, AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener addyV2BrandedProfileCardTrackingUrlAdAggregatorListener, AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener addyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener) {
        return (Set) C15521i.a(c9940d.m40867a(v1AnalyticsAdAggregatorListener, addyV2BrandedProfileCardTrackingUrlAdAggregatorListener, addyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener), "Cannot return null from a non-@Nullable @Provides method");
    }
}
