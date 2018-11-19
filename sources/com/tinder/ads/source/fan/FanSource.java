package com.tinder.ads.source.fan;

import android.content.Context;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdsManager;
import com.tinder.ads.AdSource;
import com.tinder.ads.AdSource.Type;
import com.tinder.ads.AdSourceFetcher;
import com.tinder.ads.SourcePriority;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00000\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/ads/source/fan/FanSource;", "Lcom/tinder/ads/AdSource;", "context", "Landroid/content/Context;", "placementId", "", "adFactory", "Lcom/tinder/ads/source/fan/FanAdFactory;", "(Landroid/content/Context;Ljava/lang/String;Lcom/tinder/ads/source/fan/FanAdFactory;)V", "nativeAdsManager", "Lcom/facebook/ads/NativeAdsManager;", "createSourceFetcher", "Lcom/tinder/ads/AdSourceFetcher;", "Lcom/tinder/ads/source/fan/FanAd;", "Lcom/facebook/ads/NativeAd;", "isConfigured", "", "priority", "Lcom/tinder/ads/SourcePriority;", "Builder", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class FanSource extends AdSource {
    private final FanAdFactory adFactory;
    private final NativeAdsManager nativeAdsManager;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/ads/source/fan/FanSource$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adFactory", "Lcom/tinder/ads/source/fan/FanAdFactory;", "placementId", "", "build", "Lcom/tinder/ads/source/fan/FanSource;", "aggregator_release"}, k = 1, mv = {1, 1, 7})
    public static final class Builder {
        private FanAdFactory adFactory;
        private final Context context;
        private String placementId;

        public Builder(@NotNull Context context) {
            C2668g.b(context, "context");
            this.context = context;
        }

        @NotNull
        public final Builder placementId(@NotNull String str) {
            C2668g.b(str, AudienceNetworkActivity.PLACEMENT_ID);
            this.placementId = str;
            return this;
        }

        @NotNull
        public final Builder adFactory(@NotNull FanAdFactory fanAdFactory) {
            C2668g.b(fanAdFactory, "adFactory");
            this.adFactory = fanAdFactory;
            return this;
        }

        @NotNull
        public final FanSource build() {
            Context context = this.context;
            String str = this.placementId;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            FanAdFactory fanAdFactory = this.adFactory;
            if (fanAdFactory != null) {
                return new FanSource(context, str, fanAdFactory);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public boolean isConfigured() {
        return true;
    }

    private FanSource(Context context, String str, FanAdFactory fanAdFactory) {
        super(context, Type.FACEBOOK_AUDIENCE_NETWORK, null, 4, null);
        this.adFactory = fanAdFactory;
        this.nativeAdsManager = new NativeAdsManager(context, str, 1);
    }

    @NotNull
    public AdSourceFetcher<FanAd, NativeAd, FanSource> createSourceFetcher() {
        return new FanAdSourceFetcher(this.nativeAdsManager, this, this.adFactory);
    }

    @NotNull
    public SourcePriority priority() {
        return SourcePriority.LOW;
    }
}
