package com.tinder.ads.source.dfp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.C2343d;
import com.google.android.gms.ads.doubleclick.C2345a;
import com.google.android.gms.ads.doubleclick.C2345a.C2344a;
import com.google.android.gms.ads.doubleclick.C2346b;
import com.tinder.ads.AdSourceFetcher;
import com.tinder.ads.FillException;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.C2671a;
import rx.Single;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001BG\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0014\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0002H\u0003J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016J\b\u0010#\u001a\u00020$H\u0016R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/tinder/ads/source/dfp/BannerDfpAdSourceFetcher;", "Lcom/tinder/ads/AdSourceFetcher;", "Lcom/tinder/ads/source/dfp/BannerDfpAd;", "Lcom/google/android/gms/ads/doubleclick/PublisherAdView;", "Lcom/tinder/ads/source/dfp/BannerDfpSource;", "context", "Landroid/content/Context;", "source", "adsUnitId", "", "location", "Landroid/location/Location;", "customTargetingValues", "Lcom/tinder/ads/source/dfp/DfpCustomTargetingValues;", "adSize", "Lcom/google/android/gms/ads/AdSize;", "testDeviceId", "adFactory", "Lcom/tinder/ads/source/dfp/BannerAdFactory;", "(Landroid/content/Context;Lcom/tinder/ads/source/dfp/BannerDfpSource;Ljava/lang/String;Landroid/location/Location;Lcom/tinder/ads/source/dfp/DfpCustomTargetingValues;Lcom/google/android/gms/ads/AdSize;Ljava/lang/String;Lcom/tinder/ads/source/dfp/BannerAdFactory;)V", "cancel", "", "createDfpAd", "createPublisherAdRequest", "Lcom/google/android/gms/ads/doubleclick/PublisherAdRequest;", "exceptionForErrorCode", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCode", "", "loadAds", "Lrx/Single;", "publisherAdRequest", "ad", "loadNext", "scheduler", "Lrx/Scheduler;", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class BannerDfpAdSourceFetcher implements AdSourceFetcher<BannerDfpAd, C2346b, BannerDfpSource> {
    private final BannerAdFactory adFactory;
    private final C2343d adSize;
    private final String adsUnitId;
    private final Context context;
    private final DfpCustomTargetingValues customTargetingValues;
    private final Location location;
    private final BannerDfpSource source;
    private final String testDeviceId;

    public void cancel() {
    }

    public BannerDfpAdSourceFetcher(@NotNull Context context, @NotNull BannerDfpSource bannerDfpSource, @NotNull String str, @NotNull Location location, @NotNull DfpCustomTargetingValues dfpCustomTargetingValues, @NotNull C2343d c2343d, @Nullable String str2, @NotNull BannerAdFactory bannerAdFactory) {
        C2668g.b(context, "context");
        C2668g.b(bannerDfpSource, "source");
        C2668g.b(str, "adsUnitId");
        C2668g.b(location, "location");
        C2668g.b(dfpCustomTargetingValues, "customTargetingValues");
        C2668g.b(c2343d, "adSize");
        C2668g.b(bannerAdFactory, "adFactory");
        this.context = context;
        this.source = bannerDfpSource;
        this.adsUnitId = str;
        this.location = location;
        this.customTargetingValues = dfpCustomTargetingValues;
        this.adSize = c2343d;
        this.testDeviceId = str2;
        this.adFactory = bannerAdFactory;
    }

    @NotNull
    public Single<BannerDfpAd> loadNext() {
        Single<BannerDfpAd> a = Single.a(new BannerDfpAdSourceFetcher$loadNext$1(this)).b(Schedulers.io()).a(C19397a.a()).a(new BannerDfpAdSourceFetcher$loadNext$2(this));
        C2668g.a(a, "Single.fromCallable {\n  …air.first, pair.second) }");
        return a;
    }

    @NotNull
    public C2671a scheduler() {
        C2671a a = C19397a.a();
        C2668g.a(a, "AndroidSchedulers.mainThread()");
        return a;
    }

    private final C2345a createPublisherAdRequest() {
        C2344a a = new C2344a().a(DfpCustomTargetingValuesKt.ADS_TARGETING_AGE, this.customTargetingValues.getAge()).a("gender", this.customTargetingValues.getGenderId()).a(this.location);
        if (this.testDeviceId != null) {
            a.a(this.testDeviceId);
        }
        C2345a a2 = a.a();
        C2668g.a(a2, "builder.build()");
        return a2;
    }

    private final BannerDfpAd createDfpAd() {
        C2346b c2346b = new C2346b(this.context);
        c2346b.setAdSizes(new C2343d[]{this.adSize});
        c2346b.setAdUnitId(this.adsUnitId);
        return (BannerDfpAd) this.adFactory.createAd(this.source, c2346b);
    }

    @SuppressLint({"MissingPermission"})
    private final Single<BannerDfpAd> loadAds(C2345a c2345a, BannerDfpAd bannerDfpAd) {
        c2345a = Single.a(new BannerDfpAdSourceFetcher$loadAds$1(this, bannerDfpAd, c2345a));
        C2668g.a(c2345a, "Single.fromEmitter<Banne…isherAdRequest)\n        }");
        return c2345a;
    }

    private final Exception exceptionForErrorCode(int i) {
        if (i != 3) {
            return new BannerDfpException(i);
        }
        return (Exception) new FillException(this.source.type());
    }
}
