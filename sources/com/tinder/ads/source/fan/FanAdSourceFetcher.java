package com.tinder.ads.source.fan;

import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdsManager;
import com.tinder.ads.AdSourceFetcher;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.C2671a;
import rx.Single;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/ads/source/fan/FanAdSourceFetcher;", "Lcom/tinder/ads/AdSourceFetcher;", "Lcom/tinder/ads/source/fan/FanAd;", "Lcom/facebook/ads/NativeAd;", "Lcom/tinder/ads/source/fan/FanSource;", "nativeAdsManager", "Lcom/facebook/ads/NativeAdsManager;", "source", "adFactory", "Lcom/tinder/ads/source/fan/FanAdFactory;", "(Lcom/facebook/ads/NativeAdsManager;Lcom/tinder/ads/source/fan/FanSource;Lcom/tinder/ads/source/fan/FanAdFactory;)V", "cancel", "", "loadNext", "Lrx/Single;", "scheduler", "Lrx/Scheduler;", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class FanAdSourceFetcher implements AdSourceFetcher<FanAd, NativeAd, FanSource> {
    private final FanAdFactory adFactory;
    private final NativeAdsManager nativeAdsManager;
    private final FanSource source;

    public void cancel() {
    }

    public FanAdSourceFetcher(@NotNull NativeAdsManager nativeAdsManager, @NotNull FanSource fanSource, @NotNull FanAdFactory fanAdFactory) {
        C2668g.b(nativeAdsManager, "nativeAdsManager");
        C2668g.b(fanSource, "source");
        C2668g.b(fanAdFactory, "adFactory");
        this.nativeAdsManager = nativeAdsManager;
        this.source = fanSource;
        this.adFactory = fanAdFactory;
    }

    @NotNull
    public Single<FanAd> loadNext() {
        Single<FanAd> a = Single.a(new FanAdSourceFetcher$loadNext$1(this));
        C2668g.a(a, "Single.fromEmitter<FanAd…aCacheFlag.ALL)\n        }");
        return a;
    }

    @NotNull
    public C2671a scheduler() {
        C2671a a = C19397a.a();
        C2668g.a(a, "AndroidSchedulers.mainThread()");
        return a;
    }
}
