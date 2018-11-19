package com.tinder.ads.source.dfp;

import com.google.android.gms.ads.C2338a;
import com.google.android.gms.ads.doubleclick.C2345a;
import com.google.android.gms.ads.doubleclick.C2346b;
import kotlin.Metadata;
import rx.SingleEmitter;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lrx/SingleEmitter;", "Lcom/tinder/ads/source/dfp/BannerDfpAd;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class BannerDfpAdSourceFetcher$loadAds$1<T> implements Action1<SingleEmitter<T>> {
    final /* synthetic */ BannerDfpAd $ad;
    final /* synthetic */ C2345a $publisherAdRequest;
    final /* synthetic */ BannerDfpAdSourceFetcher this$0;

    BannerDfpAdSourceFetcher$loadAds$1(BannerDfpAdSourceFetcher bannerDfpAdSourceFetcher, BannerDfpAd bannerDfpAd, C2345a c2345a) {
        this.this$0 = bannerDfpAdSourceFetcher;
        this.$ad = bannerDfpAd;
        this.$publisherAdRequest = c2345a;
    }

    public final void call(final SingleEmitter<BannerDfpAd> singleEmitter) {
        C2346b publisherAdView = this.$ad.getPublisherAdView();
        publisherAdView.setAdListener(new C2338a() {
            public void onAdLoaded() {
                singleEmitter.onSuccess(this.$ad);
            }

            public void onAdFailedToLoad(int i) {
                singleEmitter.onError(this.this$0.exceptionForErrorCode(i));
            }
        });
        publisherAdView.a(this.$publisherAdRequest);
    }
}
