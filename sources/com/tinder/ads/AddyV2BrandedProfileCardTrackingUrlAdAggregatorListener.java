package com.tinder.ads;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.recsads.C16457d;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/ads/AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener;", "Lcom/tinder/ads/AdAggregator$Listener;", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "addyV2BrandedProfileCardAdMapper", "Lcom/tinder/ads/AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener$AddyV2BrandedProfileCardAdMapper;", "brandedProfileCardTrackingUrlParser", "Lcom/tinder/recsads/BrandedProfileCardTrackingUrlParser;", "(Lcom/tinder/addy/tracker/AdUrlTracker;Lcom/tinder/ads/AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener$AddyV2BrandedProfileCardAdMapper;Lcom/tinder/recsads/BrandedProfileCardTrackingUrlParser;)V", "onAdAdded", "", "ad", "Lcom/tinder/ads/Ad;", "onAdFailed", "source", "Lcom/tinder/ads/AdSource;", "exception", "", "onAdRequestSent", "AddyV2BrandedProfileCardAdMapper", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "This classes uses the legacy AdAggregator.Listener", replaceWith = @ReplaceWith(expression = "BrandedProfileCardTrackingUrlsAdAggregatorListener", imports = {}))
public final class AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener implements AdAggregator$Listener {
    private final AdUrlTracker adUrlTracker;
    private final C6193x7293fe addyV2BrandedProfileCardAdMapper;
    private final C16457d brandedProfileCardTrackingUrlParser;

    public void onAdFailed(@NotNull AdSource adSource, @NotNull Throwable th) {
        C2668g.m10309b(adSource, "source");
        C2668g.m10309b(th, "exception");
    }

    public void onAdRequestSent(@NotNull AdSource adSource) {
        C2668g.m10309b(adSource, "source");
    }

    @Inject
    public AddyV2BrandedProfileCardTrackingUrlAdAggregatorListener(@NotNull AdUrlTracker adUrlTracker, @NotNull C6193x7293fe c6193x7293fe, @NotNull C16457d c16457d) {
        C2668g.m10309b(adUrlTracker, "adUrlTracker");
        C2668g.m10309b(c6193x7293fe, "addyV2BrandedProfileCardAdMapper");
        C2668g.m10309b(c16457d, "brandedProfileCardTrackingUrlParser");
        this.adUrlTracker = adUrlTracker;
        this.addyV2BrandedProfileCardAdMapper = c6193x7293fe;
        this.brandedProfileCardTrackingUrlParser = c16457d;
    }

    public void onAdAdded(@NotNull Ad<?> ad) {
        C2668g.m10309b(ad, "ad");
        if (ad.adType() == TinderAdType.BRANDED_PROFILE_CARD) {
            this.adUrlTracker.a(this.brandedProfileCardTrackingUrlParser.parseTrackingUrls(this.addyV2BrandedProfileCardAdMapper.map((V1BrandedProfileCardAd) ad)));
        }
    }
}
