package com.tinder.ads.analytics;

import com.tinder.ads.Ad;
import com.tinder.ads.AdSource;
import com.tinder.ads.source.dfp.NativeDfpAd;
import com.tinder.recsads.model.RecsAdsConfig;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 \u00122\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\b\u001a\u00020\tH&J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0018"}, d2 = {"Lcom/tinder/ads/analytics/AdEventFields;", "", "()V", "adCadence", "", "campaignId", "", "creativeId", "from", "Lcom/tinder/ads/analytics/AdEventFields$From;", "mute", "", "()Ljava/lang/Boolean;", "provider", "Lcom/tinder/ads/analytics/AdEventFields$Provider;", "type", "Lcom/tinder/ads/analytics/AdEventFields$Type;", "Builder", "Companion", "Factory", "From", "Provider", "Style", "Type", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class AdEventFields {
    public static final Companion Companion = new Companion();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH&J\u0017\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rH&¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/tinder/ads/analytics/AdEventFields$Builder;", "", "()V", "adCadence", "", "build", "Lcom/tinder/ads/analytics/AdEventFields;", "campaignId", "", "creativeId", "from", "Lcom/tinder/ads/analytics/AdEventFields$From;", "mute", "", "(Ljava/lang/Boolean;)Lcom/tinder/ads/analytics/AdEventFields$Builder;", "provider", "Lcom/tinder/ads/analytics/AdEventFields$Provider;", "type", "Lcom/tinder/ads/analytics/AdEventFields$Type;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static abstract class Builder {
        @NotNull
        public abstract Builder adCadence(@Nullable Number number);

        @NotNull
        public abstract AdEventFields build();

        @NotNull
        public abstract Builder campaignId(@Nullable String str);

        @NotNull
        public abstract Builder creativeId(@Nullable String str);

        @NotNull
        public abstract Builder from(@NotNull From from);

        @NotNull
        public abstract Builder mute(@Nullable Boolean bool);

        @NotNull
        public abstract Builder provider(@NotNull Provider provider);

        @NotNull
        public abstract Builder type(@NotNull Type type);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/ads/analytics/AdEventFields$Companion;", "", "()V", "builder", "Lcom/tinder/ads/analytics/AdEventFields$Builder;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Builder builder() {
            return new Builder();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0012\u0010\t\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bJ\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0014\u0010\f\u001a\u00020\r2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/ads/analytics/AdEventFields$Factory;", "", "recsAdsConfig", "Lcom/tinder/recsads/model/RecsAdsConfig;", "(Lcom/tinder/recsads/model/RecsAdsConfig;)V", "campaignIdForAd", "", "ad", "Lcom/tinder/ads/Ad;", "create", "Lcom/tinder/ads/analytics/AdEventFields;", "creativeIdForAd", "typeForAd", "Lcom/tinder/ads/analytics/AdEventFields$Type;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Factory {
        private final RecsAdsConfig recsAdsConfig;

        private final String campaignIdForAd(Ad<?> ad) {
            return null;
        }

        @Inject
        public Factory(@NotNull RecsAdsConfig recsAdsConfig) {
            C2668g.b(recsAdsConfig, "recsAdsConfig");
            this.recsAdsConfig = recsAdsConfig;
        }

        @NotNull
        public final AdEventFields create(@NotNull Ad<?> ad) {
            C2668g.b(ad, "ad");
            return new Builder().creativeId(creativeIdForAd(ad)).campaignId(campaignIdForAd(ad)).provider(Provider.Companion.forSource(ad.source())).type(typeForAd(ad)).from(From.RECS).adCadence(Integer.valueOf(this.recsAdsConfig.cadence())).build();
        }

        private final String creativeIdForAd(Ad<?> ad) {
            if (!(ad instanceof NativeDfpAd)) {
                return ad.id();
            }
            ad = ((NativeDfpAd) ad).getNativeCustomTemplateAd().getText("creative_id");
            return ad != null ? ad.toString() : null;
        }

        private final Type typeForAd(Ad<?> ad) {
            if (ad.source().type() == com.tinder.ads.AdSource.Type.FACEBOOK_AUDIENCE_NETWORK) {
                return Type.STATIC;
            }
            return Type.INDETERMINATE;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/analytics/AdEventFields$From;", "", "key", "", "(Ljava/lang/String;ILjava/lang/Number;)V", "RECS", "POST_MATCH", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum From {
        ;
        
        private final Number key;

        protected From(Number number) {
            C2668g.b(number, "key");
            this.key = number;
        }

        @NotNull
        public final Number key() {
            return this.key;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0006\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/ads/analytics/AdEventFields$Provider;", "", "key", "", "(Ljava/lang/String;ILjava/lang/Number;)V", "DIRECT_SALE", "FACEBOOK_AD_NETWORK", "OTHER", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Provider {
        ;
        
        public static final Companion Companion = null;
        private final Number key;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/ads/analytics/AdEventFields$Provider$Companion;", "", "()V", "forSource", "Lcom/tinder/ads/analytics/AdEventFields$Provider;", "adSource", "Lcom/tinder/ads/AdSource;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final Provider forSource(@NotNull AdSource adSource) {
                C2668g.b(adSource, "adSource");
                adSource = adSource.type();
                if (adSource == com.tinder.ads.AdSource.Type.FACEBOOK_AUDIENCE_NETWORK) {
                    return Provider.FACEBOOK_AD_NETWORK;
                }
                if (adSource == com.tinder.ads.AdSource.Type.GOOGLE_DFP_BANNER) {
                    return Provider.DIRECT_SALE;
                }
                return Provider.OTHER;
            }
        }

        protected Provider(Number number) {
            C2668g.b(number, "key");
            this.key = number;
        }

        static {
            Companion = new Companion();
        }

        @NotNull
        public final Number key() {
            return this.key;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/ads/analytics/AdEventFields$Style;", "", "key", "", "(Ljava/lang/String;II)V", "OLD_STYLE_TEMPLATE", "NEW_STYLE_SQUARE_TEMPLATE_WITH_BLUR_BELOW", "NEW_STYLE_PORTRAIT_TEMPLATE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Style {
        ;
        
        private final int key;

        protected Style(int i) {
            this.key = i;
        }

        public final int key() {
            return this.key;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/ads/analytics/AdEventFields$Type;", "", "key", "", "(Ljava/lang/String;II)V", "VIDEO", "STATIC", "CAROUSEL", "INDETERMINATE", "MESSAGE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Type {
        ;
        
        private final int key;

        protected Type(int i) {
            this.key = i;
        }

        public final int key() {
            return this.key;
        }
    }

    @Nullable
    public abstract Number adCadence();

    @Nullable
    public abstract String campaignId();

    @Nullable
    public abstract String creativeId();

    @NotNull
    public abstract From from();

    @Nullable
    public abstract Boolean mute();

    @NotNull
    public abstract Provider provider();

    @NotNull
    public abstract Type type();
}
