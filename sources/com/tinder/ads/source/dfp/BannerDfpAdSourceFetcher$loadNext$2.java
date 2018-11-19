package com.tinder.ads.source.dfp;

import android.util.Pair;
import com.google.android.gms.ads.doubleclick.C2345a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012F\u0010\u0003\u001aB\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002 \u0006* \u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/ads/source/dfp/BannerDfpAd;", "pair", "Landroid/util/Pair;", "Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class BannerDfpAdSourceFetcher$loadNext$2<T, R> implements Func1<T, Single<? extends R>> {
    final /* synthetic */ BannerDfpAdSourceFetcher this$0;

    BannerDfpAdSourceFetcher$loadNext$2(BannerDfpAdSourceFetcher bannerDfpAdSourceFetcher) {
        this.this$0 = bannerDfpAdSourceFetcher;
    }

    @NotNull
    public final Single<BannerDfpAd> call(Pair<C2345a, BannerDfpAd> pair) {
        BannerDfpAdSourceFetcher bannerDfpAdSourceFetcher = this.this$0;
        Object obj = pair.first;
        C2668g.a(obj, "pair.first");
        C2345a c2345a = (C2345a) obj;
        pair = pair.second;
        C2668g.a(pair, "pair.second");
        return bannerDfpAdSourceFetcher.loadAds(c2345a, (BannerDfpAd) pair);
    }
}
