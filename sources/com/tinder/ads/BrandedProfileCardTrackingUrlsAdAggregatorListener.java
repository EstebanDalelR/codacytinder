package com.tinder.ads;

import com.tinder.addy.Ad;
import com.tinder.addy.AdAggregator.Listener;
import com.tinder.addy.AdLoader;
import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.recsads.C16457d;
import com.tinder.recsads.model.C16469h;
import com.tinder.recsads.model.RecsAdType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/ads/BrandedProfileCardTrackingUrlsAdAggregatorListener;", "Lcom/tinder/addy/AdAggregator$Listener;", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "trackingUrlParser", "Lcom/tinder/recsads/BrandedProfileCardTrackingUrlParser;", "(Lcom/tinder/addy/tracker/AdUrlTracker;Lcom/tinder/recsads/BrandedProfileCardTrackingUrlParser;)V", "onAdAdded", "", "ad", "Lcom/tinder/addy/Ad;", "onAdRequestFailed", "adLoader", "Lcom/tinder/addy/AdLoader;", "exception", "", "onAdRequestSent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class BrandedProfileCardTrackingUrlsAdAggregatorListener implements Listener {
    private final AdUrlTracker adUrlTracker;
    private final C16457d trackingUrlParser;

    public void onAdRequestFailed(@NotNull AdLoader adLoader, @NotNull Throwable th) {
        C2668g.b(adLoader, "adLoader");
        C2668g.b(th, "exception");
    }

    public void onAdRequestSent(@NotNull AdLoader adLoader) {
        C2668g.b(adLoader, "adLoader");
    }

    @Inject
    public BrandedProfileCardTrackingUrlsAdAggregatorListener(@NotNull AdUrlTracker adUrlTracker, @NotNull C16457d c16457d) {
        C2668g.b(adUrlTracker, "adUrlTracker");
        C2668g.b(c16457d, "trackingUrlParser");
        this.adUrlTracker = adUrlTracker;
        this.trackingUrlParser = c16457d;
    }

    public void onAdAdded(@NotNull Ad ad) {
        C2668g.b(ad, "ad");
        if (ad.adType() == RecsAdType.BRANDED_PROFILE_CARD) {
            this.adUrlTracker.m26827a(this.trackingUrlParser.parseTrackingUrls((C16469h) ad));
        }
    }
}
