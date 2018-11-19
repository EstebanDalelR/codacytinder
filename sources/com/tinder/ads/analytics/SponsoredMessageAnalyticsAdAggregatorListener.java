package com.tinder.ads.analytics;

import com.tinder.addy.Ad;
import com.tinder.addy.AdAggregator.Listener;
import com.tinder.addy.AdLoader;
import com.tinder.ads.analytics.SponsoredMessageAddAdRequestReceiveEvent.Request;
import com.tinder.messageads.model.C12131a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/ads/analytics/SponsoredMessageAnalyticsAdAggregatorListener;", "Lcom/tinder/addy/AdAggregator$Listener;", "addAdRequestSendEvent", "Lcom/tinder/ads/analytics/SponsoredMessageAddAdRequestSendEvent;", "addAdRequestReceiveEvent", "Lcom/tinder/ads/analytics/SponsoredMessageAddAdRequestReceiveEvent;", "(Lcom/tinder/ads/analytics/SponsoredMessageAddAdRequestSendEvent;Lcom/tinder/ads/analytics/SponsoredMessageAddAdRequestReceiveEvent;)V", "onAdAdded", "", "ad", "Lcom/tinder/addy/Ad;", "onAdRequestFailed", "adLoader", "Lcom/tinder/addy/AdLoader;", "exception", "", "onAdRequestSent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SponsoredMessageAnalyticsAdAggregatorListener implements Listener {
    private final SponsoredMessageAddAdRequestReceiveEvent addAdRequestReceiveEvent;
    private final SponsoredMessageAddAdRequestSendEvent addAdRequestSendEvent;

    public void onAdRequestFailed(@NotNull AdLoader adLoader, @NotNull Throwable th) {
        C2668g.b(adLoader, "adLoader");
        C2668g.b(th, "exception");
    }

    @Inject
    public SponsoredMessageAnalyticsAdAggregatorListener(@NotNull SponsoredMessageAddAdRequestSendEvent sponsoredMessageAddAdRequestSendEvent, @NotNull SponsoredMessageAddAdRequestReceiveEvent sponsoredMessageAddAdRequestReceiveEvent) {
        C2668g.b(sponsoredMessageAddAdRequestSendEvent, "addAdRequestSendEvent");
        C2668g.b(sponsoredMessageAddAdRequestReceiveEvent, "addAdRequestReceiveEvent");
        this.addAdRequestSendEvent = sponsoredMessageAddAdRequestSendEvent;
        this.addAdRequestReceiveEvent = sponsoredMessageAddAdRequestReceiveEvent;
    }

    public void onAdAdded(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        C12131a c12131a = (C12131a) (!(ad instanceof C12131a) ? null : ad);
        if (c12131a != null) {
            this.addAdRequestReceiveEvent.execute(new Request(ad, c12131a.g(), c12131a.f())).b(C15756a.b()).a(SponsoredMessageAnalyticsAdAggregatorListener$onAdAdded$1.INSTANCE, SponsoredMessageAnalyticsAdAggregatorListener$onAdAdded$2.INSTANCE);
        }
    }

    public void onAdRequestSent(@NotNull AdLoader adLoader) {
        C2668g.b(adLoader, "adLoader");
        this.addAdRequestSendEvent.execute(new SponsoredMessageAddAdRequestSendEvent.Request(adLoader)).b(C15756a.b()).a(SponsoredMessageAnalyticsAdAggregatorListener$onAdRequestSent$1.INSTANCE, SponsoredMessageAnalyticsAdAggregatorListener$onAdRequestSent$2.INSTANCE);
    }
}
