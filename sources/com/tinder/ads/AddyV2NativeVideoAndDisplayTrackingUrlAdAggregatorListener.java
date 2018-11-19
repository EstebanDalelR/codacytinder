package com.tinder.ads;

import com.tinder.addy.tracker.AdUrlTracker;
import com.tinder.ads.source.dfp.NativeDfpAd;
import com.tinder.recsads.C16460j;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/ads/AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener;", "Lcom/tinder/ads/AdAggregator$Listener;", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "mapper", "Lcom/tinder/ads/AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener$AddyV2NativeDfpAdMapper;", "parser", "Lcom/tinder/recsads/NativeDfpVideoAndDisplayTrackingUrlParser;", "(Lcom/tinder/addy/tracker/AdUrlTracker;Lcom/tinder/ads/AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener$AddyV2NativeDfpAdMapper;Lcom/tinder/recsads/NativeDfpVideoAndDisplayTrackingUrlParser;)V", "onAdAdded", "", "ad", "Lcom/tinder/ads/Ad;", "onAdFailed", "source", "Lcom/tinder/ads/AdSource;", "exception", "", "onAdRequestSent", "AddyV2NativeDfpAdMapper", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Deprecated(message = "This uses the legacy AdAggregator.Listener", replaceWith = @ReplaceWith(expression = "NativeVideoAndDisplayTrackingUrlAdAggregatorListener", imports = {}))
public final class AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener implements AdAggregator$Listener {
    private final AdUrlTracker adUrlTracker;
    private final C6194x5aac58a0 mapper;
    private final C16460j parser;

    public void onAdFailed(@NotNull AdSource adSource, @NotNull Throwable th) {
        C2668g.m10309b(adSource, "source");
        C2668g.m10309b(th, "exception");
    }

    public void onAdRequestSent(@NotNull AdSource adSource) {
        C2668g.m10309b(adSource, "source");
    }

    @Inject
    public AddyV2NativeVideoAndDisplayTrackingUrlAdAggregatorListener(@NotNull AdUrlTracker adUrlTracker, @NotNull C6194x5aac58a0 c6194x5aac58a0, @NotNull C16460j c16460j) {
        C2668g.m10309b(adUrlTracker, "adUrlTracker");
        C2668g.m10309b(c6194x5aac58a0, "mapper");
        C2668g.m10309b(c16460j, "parser");
        this.adUrlTracker = adUrlTracker;
        this.mapper = c6194x5aac58a0;
        this.parser = c16460j;
    }

    public void onAdAdded(@NotNull Ad<?> ad) {
        C2668g.m10309b(ad, "ad");
        if (ad.adType() == TinderAdType.REC_NATIVE_DISPLAY_DFP || ad.adType() == TinderAdType.REC_NATIVE_VIDEO_DFP) {
            this.adUrlTracker.a(this.parser.parseTrackingUrls(this.mapper.map((NativeDfpAd) ad)));
            C0001a.m25b("Tracking Urls added to Addy V2 for Native DFP Display or Video ad", new Object[0]);
        }
    }
}
