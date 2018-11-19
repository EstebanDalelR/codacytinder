package com.tinder.ads.source.dfp;

import com.google.android.gms.ads.doubleclick.C2346b;
import com.tinder.ads.Ad;
import com.tinder.ads.SourcePriority;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/ads/source/dfp/BannerDfpAd;", "Lcom/tinder/ads/Ad;", "Lcom/tinder/ads/source/dfp/BannerDfpSource;", "source", "publisherAdView", "Lcom/google/android/gms/ads/doubleclick/PublisherAdView;", "(Lcom/tinder/ads/source/dfp/BannerDfpSource;Lcom/google/android/gms/ads/doubleclick/PublisherAdView;)V", "eventListener", "Lcom/tinder/ads/source/dfp/BannerDfpAd$EventListener;", "getPublisherAdView", "()Lcom/google/android/gms/ads/doubleclick/PublisherAdView;", "id", "", "notifyViewClicked", "", "adUrl", "priority", "Lcom/tinder/ads/SourcePriority;", "setEventListener", "EventListener", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public abstract class BannerDfpAd implements Ad<BannerDfpSource> {
    private EventListener eventListener;
    @NotNull
    private final C2346b publisherAdView;
    private final BannerDfpSource source;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/ads/source/dfp/BannerDfpAd$EventListener;", "", "onAdClicked", "", "url", "", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public interface EventListener {
        void onAdClicked(@NotNull String str);
    }

    public BannerDfpAd(@NotNull BannerDfpSource bannerDfpSource, @NotNull C2346b c2346b) {
        C2668g.b(bannerDfpSource, "source");
        C2668g.b(c2346b, "publisherAdView");
        this.source = bannerDfpSource;
        this.publisherAdView = c2346b;
    }

    @NotNull
    public final C2346b getPublisherAdView() {
        return this.publisherAdView;
    }

    @NotNull
    public String id() {
        String adUnitId = this.publisherAdView.getAdUnitId();
        C2668g.a(adUnitId, "publisherAdView.adUnitId");
        return adUnitId;
    }

    @NotNull
    public SourcePriority priority() {
        return SourcePriority.MEDIUM;
    }

    @NotNull
    public BannerDfpSource source() {
        return this.source;
    }

    public final void notifyViewClicked(@NotNull String str) {
        C2668g.b(str, "adUrl");
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.onAdClicked(str);
        }
    }

    public final void setEventListener(@Nullable EventListener eventListener) {
        this.eventListener = eventListener;
    }
}
