package com.tinder.ads.source.dfp;

import android.util.Pair;
import com.google.android.gms.ads.doubleclick.C2345a;
import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/util/Pair;", "Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;", "kotlin.jvm.PlatformType", "Lcom/tinder/ads/source/dfp/BannerDfpAd;", "call"}, k = 3, mv = {1, 1, 7})
final class BannerDfpAdSourceFetcher$loadNext$1<V> implements Callable<T> {
    final /* synthetic */ BannerDfpAdSourceFetcher this$0;

    BannerDfpAdSourceFetcher$loadNext$1(BannerDfpAdSourceFetcher bannerDfpAdSourceFetcher) {
        this.this$0 = bannerDfpAdSourceFetcher;
    }

    public final Pair<C2345a, BannerDfpAd> call() {
        return Pair.create(this.this$0.createPublisherAdRequest(), this.this$0.createDfpAd());
    }
}
