package com.tinder.addy.source.fan;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAd.MediaCacheFlag;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.NativeAdsManager.Listener;
import com.tinder.addy.Ad;
import com.tinder.addy.AdLoader;
import com.tinder.addy.LoaderPriority;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.SingleEmitter;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\f\rB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/addy/source/fan/FanAdLoader;", "Lcom/tinder/addy/AdLoader;", "nativeAdsManager", "Lcom/facebook/ads/NativeAdsManager;", "adFactory", "Lcom/tinder/addy/source/fan/FanAdLoader$AdFactory;", "priority", "Lcom/tinder/addy/LoaderPriority;", "(Lcom/facebook/ads/NativeAdsManager;Lcom/tinder/addy/source/fan/FanAdLoader$AdFactory;Lcom/tinder/addy/LoaderPriority;)V", "loadAd", "Lrx/Single;", "Lcom/tinder/addy/Ad;", "AdFactory", "Builder", "addy-source-fan_release"}, k = 1, mv = {1, 1, 10})
public final class FanAdLoader implements AdLoader {
    /* renamed from: a */
    private final NativeAdsManager f26410a;
    /* renamed from: b */
    private final AdFactory f26411b;
    /* renamed from: c */
    private final LoaderPriority f26412c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/addy/source/fan/FanAdLoader$AdFactory;", "", "create", "Lcom/tinder/addy/Ad;", "nativeAd", "Lcom/facebook/ads/NativeAd;", "addy-source-fan_release"}, k = 1, mv = {1, 1, 10})
    public interface AdFactory {
        @NotNull
        Ad create(@NotNull NativeAd nativeAd);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/addy/source/fan/FanAdLoader$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adFactory", "Lcom/tinder/addy/source/fan/FanAdLoader$AdFactory;", "adsCount", "", "placementId", "", "priority", "Lcom/tinder/addy/LoaderPriority;", "build", "Lcom/tinder/addy/source/fan/FanAdLoader;", "addy-source-fan_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.source.fan.FanAdLoader$a */
    public static final class C6190a {
        /* renamed from: a */
        private String f22744a;
        /* renamed from: b */
        private AdFactory f22745b;
        /* renamed from: c */
        private LoaderPriority f22746c;
        /* renamed from: d */
        private int f22747d = 1;
        /* renamed from: e */
        private final Context f22748e;

        public C6190a(@NotNull Context context) {
            C2668g.b(context, "context");
            this.f22748e = context;
        }

        @NotNull
        /* renamed from: a */
        public final C6190a m26806a(@NotNull String str) {
            C2668g.b(str, AudienceNetworkActivity.PLACEMENT_ID);
            this.f22744a = str;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C6190a m26803a(int i) {
            this.f22747d = i;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C6190a m26805a(@NotNull AdFactory adFactory) {
            C2668g.b(adFactory, "adFactory");
            this.f22745b = adFactory;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C6190a m26804a(@NotNull LoaderPriority loaderPriority) {
            C2668g.b(loaderPriority, "priority");
            this.f22746c = loaderPriority;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final FanAdLoader m26807a() {
            Context context = this.f22748e;
            String str = this.f22744a;
            if (str == null) {
                C2668g.b(AudienceNetworkActivity.PLACEMENT_ID);
            }
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            NativeAdsManager nativeAdsManager = new NativeAdsManager(context, str, this.f22747d);
            AdFactory adFactory = this.f22745b;
            if (adFactory == null) {
                C2668g.b("adFactory");
            }
            LoaderPriority loaderPriority = this.f22746c;
            if (loaderPriority == null) {
                C2668g.b("priority");
            }
            if (loaderPriority != null) {
                return new FanAdLoader(nativeAdsManager, adFactory, loaderPriority);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "emitter", "Lrx/SingleEmitter;", "Lcom/tinder/addy/Ad;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.addy.source.fan.FanAdLoader$b */
    static final class C8120b<T> implements Action1<SingleEmitter<T>> {
        /* renamed from: a */
        final /* synthetic */ FanAdLoader f29117a;

        C8120b(FanAdLoader fanAdLoader) {
            this.f29117a = fanAdLoader;
        }

        public /* synthetic */ void call(Object obj) {
            m34527a((SingleEmitter) obj);
        }

        /* renamed from: a */
        public final void m34527a(final SingleEmitter<Ad> singleEmitter) {
            this.f29117a.f26410a.setListener(new Listener() {
                public void onAdsLoaded() {
                    NativeAd nextNativeAd = this.f29117a.f26410a.nextNativeAd();
                    AdFactory b = this.f29117a.f26411b;
                    C2668g.a(nextNativeAd, "nativeAd");
                    singleEmitter.onSuccess(b.create(nextNativeAd));
                }

                public void onAdError(@NotNull AdError adError) {
                    C2668g.b(adError, "adError");
                    singleEmitter.onError(new FanException(adError));
                }
            });
            this.f29117a.f26410a.loadAds(MediaCacheFlag.ALL);
        }
    }

    public FanAdLoader(@NotNull NativeAdsManager nativeAdsManager, @NotNull AdFactory adFactory, @NotNull LoaderPriority loaderPriority) {
        C2668g.b(nativeAdsManager, "nativeAdsManager");
        C2668g.b(adFactory, "adFactory");
        C2668g.b(loaderPriority, "priority");
        this.f26410a = nativeAdsManager;
        this.f26411b = adFactory;
        this.f26412c = loaderPriority;
    }

    @NotNull
    public Single<Ad> loadAd() {
        Single<Ad> b = Single.a(new C8120b(this)).b(C19397a.a());
        C2668g.a(b, "Single.fromEmitter<Ad> {…dSchedulers.mainThread())");
        return b;
    }

    @NotNull
    public LoaderPriority priority() {
        return this.f26412c;
    }
}
