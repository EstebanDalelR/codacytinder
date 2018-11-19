package com.tinder.ads.source.dfp;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.C2343d;
import com.google.android.gms.ads.doubleclick.C2346b;
import com.tinder.ads.AdSource;
import com.tinder.ads.AdSource.Type;
import com.tinder.ads.AdSourceFetcher;
import com.tinder.ads.SourcePriority;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001cB/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00000\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/ads/source/dfp/BannerDfpSource;", "Lcom/tinder/ads/AdSource;", "context", "Landroid/content/Context;", "adsUnitId", "", "adFactory", "Lcom/tinder/ads/source/dfp/BannerAdFactory;", "location", "Landroid/location/Location;", "targetingValues", "Lcom/tinder/ads/source/dfp/DfpCustomTargetingValues;", "(Landroid/content/Context;Ljava/lang/String;Lcom/tinder/ads/source/dfp/BannerAdFactory;Landroid/location/Location;Lcom/tinder/ads/source/dfp/DfpCustomTargetingValues;)V", "adSize", "Lcom/google/android/gms/ads/AdSize;", "testDeviceId", "createSourceFetcher", "Lcom/tinder/ads/AdSourceFetcher;", "Lcom/tinder/ads/source/dfp/BannerDfpAd;", "Lcom/google/android/gms/ads/doubleclick/PublisherAdView;", "initializeMobileAdsSdk", "", "isConfigured", "", "priority", "Lcom/tinder/ads/SourcePriority;", "setAdSize", "setTestDeviceId", "Builder", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class BannerDfpSource extends AdSource {
    private final BannerAdFactory adFactory;
    private C2343d adSize;
    private final String adsUnitId;
    private final Location location;
    private final DfpCustomTargetingValues targetingValues;
    private String testDeviceId;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/ads/source/dfp/BannerDfpSource$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adFactory", "Lcom/tinder/ads/source/dfp/BannerAdFactory;", "adsUnitId", "", "location", "Landroid/location/Location;", "targetingValues", "Lcom/tinder/ads/source/dfp/DfpCustomTargetingValues;", "unitId", "build", "Lcom/tinder/ads/source/dfp/BannerDfpSource;", "customTargetingValues", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public static final class Builder {
        private BannerAdFactory adFactory;
        private String adsUnitId;
        private final Context context;
        private Location location;
        private DfpCustomTargetingValues targetingValues;

        public Builder(@NotNull Context context) {
            C2668g.b(context, "context");
            this.context = context;
        }

        @NotNull
        public final Builder adsUnitId(@NotNull String str) {
            C2668g.b(str, "unitId");
            this.adsUnitId = str;
            return this;
        }

        @NotNull
        public final Builder adFactory(@NotNull BannerAdFactory bannerAdFactory) {
            C2668g.b(bannerAdFactory, "adFactory");
            this.adFactory = bannerAdFactory;
            return this;
        }

        @NotNull
        public final Builder location(@NotNull Location location) {
            C2668g.b(location, "location");
            this.location = location;
            return this;
        }

        @NotNull
        public final Builder customTargetingValues(@NotNull DfpCustomTargetingValues dfpCustomTargetingValues) {
            C2668g.b(dfpCustomTargetingValues, "targetingValues");
            this.targetingValues = dfpCustomTargetingValues;
            return this;
        }

        @NotNull
        public final BannerDfpSource build() {
            Context context = this.context;
            String str = this.adsUnitId;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            BannerAdFactory bannerAdFactory = this.adFactory;
            if (bannerAdFactory == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Location location = this.location;
            if (location == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            DfpCustomTargetingValues dfpCustomTargetingValues = this.targetingValues;
            if (dfpCustomTargetingValues != null) {
                return new BannerDfpSource(context, str, bannerAdFactory, location, dfpCustomTargetingValues);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private BannerDfpSource(Context context, String str, BannerAdFactory bannerAdFactory, Location location, DfpCustomTargetingValues dfpCustomTargetingValues) {
        super(context, Type.GOOGLE_DFP_BANNER, null, 4, null);
        this.adsUnitId = str;
        this.adFactory = bannerAdFactory;
        this.location = location;
        this.targetingValues = dfpCustomTargetingValues;
        initializeMobileAdsSdk();
    }

    @NotNull
    public AdSourceFetcher<BannerDfpAd, C2346b, BannerDfpSource> createSourceFetcher() {
        if (isConfigured()) {
            Context context = getContext();
            String str = this.adsUnitId;
            Location location = this.location;
            if (location == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            DfpCustomTargetingValues dfpCustomTargetingValues = this.targetingValues;
            if (dfpCustomTargetingValues == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C2343d c2343d = this.adSize;
            if (c2343d != null) {
                return new BannerDfpAdSourceFetcher(context, this, str, location, dfpCustomTargetingValues, c2343d, this.testDeviceId, this.adFactory);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalStateException("Source is not configured to serve ads yet");
    }

    @NotNull
    public SourcePriority priority() {
        return SourcePriority.HIGH;
    }

    public boolean isConfigured() {
        return this.adSize != null;
    }

    public final void setAdSize(@Nullable C2343d c2343d) {
        this.adSize = c2343d;
    }

    public final void setTestDeviceId(@NotNull String str) {
        C2668g.b(str, "testDeviceId");
        this.testDeviceId = str;
    }

    private final void initializeMobileAdsSdk() {
        Completable.a(new BannerDfpSource$initializeMobileAdsSdk$1(this)).b(Schedulers.io()).a(BannerDfpSource$initializeMobileAdsSdk$2.INSTANCE, BannerDfpSource$initializeMobileAdsSdk$3.INSTANCE);
    }
}
