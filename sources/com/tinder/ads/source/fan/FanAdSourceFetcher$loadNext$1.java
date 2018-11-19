package com.tinder.ads.source.fan;

import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAd.MediaCacheFlag;
import com.facebook.ads.NativeAdsManager.Listener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.SingleEmitter;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lrx/SingleEmitter;", "Lcom/tinder/ads/source/fan/FanAd;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class FanAdSourceFetcher$loadNext$1<T> implements Action1<SingleEmitter<T>> {
    final /* synthetic */ FanAdSourceFetcher this$0;

    FanAdSourceFetcher$loadNext$1(FanAdSourceFetcher fanAdSourceFetcher) {
        this.this$0 = fanAdSourceFetcher;
    }

    public final void call(final SingleEmitter<FanAd> singleEmitter) {
        this.this$0.nativeAdsManager.setListener(new Listener() {
            public void onAdsLoaded() {
                NativeAd nextNativeAd = this.this$0.nativeAdsManager.nextNativeAd();
                FanAdFactory access$getAdFactory$p = this.this$0.adFactory;
                FanSource access$getSource$p = this.this$0.source;
                C2668g.a(nextNativeAd, "nativeAd");
                singleEmitter.onSuccess((FanAd) access$getAdFactory$p.createAd(access$getSource$p, nextNativeAd));
            }

            public void onAdError(@NotNull AdError adError) {
                C2668g.b(adError, "adError");
                singleEmitter.onError(new FanException(adError));
            }
        });
        this.this$0.nativeAdsManager.loadAds(MediaCacheFlag.ALL);
    }
}
