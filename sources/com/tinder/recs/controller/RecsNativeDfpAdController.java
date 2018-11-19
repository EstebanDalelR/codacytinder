package com.tinder.recs.controller;

import com.tinder.ads.RecsNativeAd;
import com.tinder.ads.RecsNativeVideoAd;
import com.tinder.ads.analytics.AddAdCompleteEvent;
import com.tinder.ads.analytics.AddAdPlayEvent;
import com.tinder.ads.analytics.AddAdPlayEvent.Request;
import com.tinder.ads.analytics.AddAdSelectEvent;
import com.tinder.ads.analytics.AddAdToggleAudioEvent;
import com.tinder.ads.analytics.AddAdViewEvent;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0017\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/recs/controller/RecsNativeDfpAdController;", "", "addAdPlayEvent", "Lcom/tinder/ads/analytics/AddAdPlayEvent;", "addAdToggleAudioEvent", "Lcom/tinder/ads/analytics/AddAdToggleAudioEvent;", "addAdCompleteEvent", "Lcom/tinder/ads/analytics/AddAdCompleteEvent;", "addAdViewEvent", "Lcom/tinder/ads/analytics/AddAdViewEvent;", "addAdSelectEvent", "Lcom/tinder/ads/analytics/AddAdSelectEvent;", "(Lcom/tinder/ads/analytics/AddAdPlayEvent;Lcom/tinder/ads/analytics/AddAdToggleAudioEvent;Lcom/tinder/ads/analytics/AddAdCompleteEvent;Lcom/tinder/ads/analytics/AddAdViewEvent;Lcom/tinder/ads/analytics/AddAdSelectEvent;)V", "onCardMovedToTop", "", "ad", "Lcom/tinder/ads/RecsNativeAd;", "onClickthroughClicked", "action", "", "onVideoEnd", "Lcom/tinder/ads/RecsNativeVideoAd;", "onVideoMuted", "onVideoPlay", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsNativeDfpAdController {
    private final AddAdCompleteEvent addAdCompleteEvent;
    private final AddAdPlayEvent addAdPlayEvent;
    private final AddAdSelectEvent addAdSelectEvent;
    private final AddAdToggleAudioEvent addAdToggleAudioEvent;
    private final AddAdViewEvent addAdViewEvent;

    @Inject
    public RecsNativeDfpAdController(@NotNull AddAdPlayEvent addAdPlayEvent, @NotNull AddAdToggleAudioEvent addAdToggleAudioEvent, @NotNull AddAdCompleteEvent addAdCompleteEvent, @NotNull AddAdViewEvent addAdViewEvent, @NotNull AddAdSelectEvent addAdSelectEvent) {
        C2668g.b(addAdPlayEvent, "addAdPlayEvent");
        C2668g.b(addAdToggleAudioEvent, "addAdToggleAudioEvent");
        C2668g.b(addAdCompleteEvent, "addAdCompleteEvent");
        C2668g.b(addAdViewEvent, "addAdViewEvent");
        C2668g.b(addAdSelectEvent, "addAdSelectEvent");
        this.addAdPlayEvent = addAdPlayEvent;
        this.addAdToggleAudioEvent = addAdToggleAudioEvent;
        this.addAdCompleteEvent = addAdCompleteEvent;
        this.addAdViewEvent = addAdViewEvent;
        this.addAdSelectEvent = addAdSelectEvent;
    }

    public final void onVideoPlay(@Nullable RecsNativeVideoAd recsNativeVideoAd) {
        if (recsNativeVideoAd != null) {
            this.addAdPlayEvent.execute(Request.builder().build(), recsNativeVideoAd).b(Schedulers.io()).b(RxUtils.b());
        }
    }

    public final void onVideoMuted(@Nullable RecsNativeVideoAd recsNativeVideoAd) {
        if (recsNativeVideoAd != null) {
            this.addAdToggleAudioEvent.execute(AddAdToggleAudioEvent.Request.builder().build(), recsNativeVideoAd).b(Schedulers.io()).b(RxUtils.b());
        }
    }

    public final void onVideoEnd(@Nullable RecsNativeVideoAd recsNativeVideoAd) {
        if (recsNativeVideoAd != null) {
            this.addAdCompleteEvent.execute(AddAdCompleteEvent.Request.builder().build(), recsNativeVideoAd).b(Schedulers.io()).b(RxUtils.b());
        }
    }

    public final void onCardMovedToTop(@NotNull RecsNativeAd recsNativeAd) {
        C2668g.b(recsNativeAd, "ad");
        this.addAdViewEvent.execute(AddAdViewEvent.Request.builder().build(), recsNativeAd).b(Schedulers.io()).b(RxUtils.b());
    }

    public final void onClickthroughClicked(@NotNull RecsNativeAd recsNativeAd, int i) {
        C2668g.b(recsNativeAd, "ad");
        this.addAdSelectEvent.execute(AddAdSelectEvent.Request.builder().action(i).build(), recsNativeAd).b(Schedulers.io()).b(RxUtils.b());
    }
}
