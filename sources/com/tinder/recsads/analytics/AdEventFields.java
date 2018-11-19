package com.tinder.recsads.analytics;

import com.tinder.addy.Ad;
import com.tinder.api.ManagerWebServices;
import com.tinder.recsads.analytics.C16442v.C16441a;
import com.tinder.recsads.model.C16468f;
import com.tinder.recsads.model.C16469h;
import com.tinder.recsads.model.RecsAdType;
import com.tinder.recsads.model.RecsAdsConfig;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 \u00122\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\b\u001a\u00020\tH&J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0017"}, d2 = {"Lcom/tinder/recsads/analytics/AdEventFields;", "", "()V", "adCadence", "", "campaignId", "", "creativeId", "from", "Lcom/tinder/recsads/analytics/AdEventFields$From;", "mute", "", "()Ljava/lang/Boolean;", "provider", "Lcom/tinder/recsads/analytics/Provider;", "type", "Lcom/tinder/recsads/analytics/AdEventFields$Type;", "Builder", "Companion", "Factory", "From", "Style", "Type", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public abstract class AdEventFields {
    /* renamed from: a */
    public static final C14728b f46304a = new C14728b();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/recsads/analytics/AdEventFields$From;", "", "key", "", "(Ljava/lang/String;ILjava/lang/Number;)V", "RECS", "POST_MATCH", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
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

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/recsads/analytics/AdEventFields$Style;", "", "key", "", "(Ljava/lang/String;II)V", "OLD_STYLE_TEMPLATE", "NEW_STYLE_SQUARE_TEMPLATE_WITH_BLUR_BELOW", "NEW_STYLE_PORTRAIT_TEMPLATE", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
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

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/recsads/analytics/AdEventFields$Type;", "", "key", "", "(Ljava/lang/String;II)V", "VIDEO", "STATIC", "CAROUSEL", "INDETERMINATE", "MESSAGE", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
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

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH&J\u0017\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rH&¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/tinder/recsads/analytics/AdEventFields$Builder;", "", "()V", "adCadence", "", "build", "Lcom/tinder/recsads/analytics/AdEventFields;", "campaignId", "", "creativeId", "from", "Lcom/tinder/recsads/analytics/AdEventFields$From;", "mute", "", "(Ljava/lang/Boolean;)Lcom/tinder/recsads/analytics/AdEventFields$Builder;", "provider", "Lcom/tinder/recsads/analytics/Provider;", "type", "Lcom/tinder/recsads/analytics/AdEventFields$Type;", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.analytics.AdEventFields$a */
    public static abstract class C14727a {
        @NotNull
        /* renamed from: a */
        public abstract C14727a mo12156a(@NotNull From from);

        @NotNull
        /* renamed from: a */
        public abstract C14727a mo12157a(@NotNull Type type);

        @NotNull
        /* renamed from: a */
        public abstract C14727a mo12158a(@NotNull Provider provider);

        @NotNull
        /* renamed from: a */
        public abstract C14727a mo12159a(@Nullable Number number);

        @NotNull
        /* renamed from: a */
        public abstract C14727a mo12160a(@Nullable String str);

        @NotNull
        /* renamed from: a */
        public abstract AdEventFields mo12161a();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/recsads/analytics/AdEventFields$Companion;", "", "()V", "builder", "Lcom/tinder/recsads/analytics/AdEventFields$Builder;", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.analytics.AdEventFields$b */
    public static final class C14728b {
        private C14728b() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/recsads/analytics/AdEventFields$Factory;", "", "recsAdsConfig", "Lcom/tinder/recsads/model/RecsAdsConfig;", "(Lcom/tinder/recsads/model/RecsAdsConfig;)V", "campaignIdForAd", "", "ad", "Lcom/tinder/addy/Ad;", "create", "Lcom/tinder/recsads/analytics/AdEventFields;", "from", "Lcom/tinder/recsads/analytics/AdEventFields$From;", "provider", "Lcom/tinder/recsads/analytics/Provider;", "creativeIdForAd", "typeForAd", "Lcom/tinder/recsads/analytics/AdEventFields$Type;", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.analytics.AdEventFields$c */
    public static final class C14729c {
        /* renamed from: a */
        private final RecsAdsConfig f46303a;

        /* renamed from: b */
        private final String m55975b(Ad ad) {
            return null;
        }

        @Inject
        public C14729c(@NotNull RecsAdsConfig recsAdsConfig) {
            C2668g.b(recsAdsConfig, "recsAdsConfig");
            this.f46303a = recsAdsConfig;
        }

        @NotNull
        /* renamed from: a */
        public final AdEventFields m55978a(@NotNull Ad ad) {
            C2668g.b(ad, "ad");
            return new C16441a().m61842b(m55976c(ad)).mo12160a(m55975b(ad)).mo12158a(Provider.Companion.m55992a(ad)).mo12157a(m55977d(ad)).mo12156a(From.RECS).mo12159a((Number) Integer.valueOf(this.f46303a.cadence())).mo12161a();
        }

        @NotNull
        /* renamed from: a */
        public final AdEventFields m55979a(@NotNull Ad ad, @NotNull From from, @NotNull Provider provider) {
            C2668g.b(ad, "ad");
            C2668g.b(from, ManagerWebServices.PARAM_FROM);
            C2668g.b(provider, "provider");
            return new C16441a().m61842b(m55976c(ad)).mo12160a(m55975b(ad)).mo12158a(provider).mo12157a(m55977d(ad)).mo12156a(from).mo12159a((Number) Integer.valueOf(this.f46303a.cadence())).mo12161a();
        }

        /* renamed from: c */
        private final String m55976c(Ad ad) {
            if (ad instanceof C16468f) {
                ad = ((C16468f) ad).getNativeCustomTemplateAd().getText("creative_id");
                return ad != null ? ad.toString() : null;
            } else if (!(ad instanceof C16469h)) {
                return ad.id();
            } else {
                ad = ((C16469h) ad).m61880a().getText("creative_id");
                if (ad != null) {
                    return ad.toString();
                }
                return null;
            }
        }

        /* renamed from: d */
        private final Type m55977d(Ad ad) {
            if (ad.adType() == RecsAdType.FAN) {
                return Type.STATIC;
            }
            return Type.INDETERMINATE;
        }
    }

    @Nullable
    /* renamed from: a */
    public abstract Number mo12162a();

    @Nullable
    /* renamed from: b */
    public abstract String mo12163b();

    @Nullable
    /* renamed from: c */
    public abstract String mo12164c();

    @NotNull
    /* renamed from: d */
    public abstract Provider mo12165d();

    @NotNull
    /* renamed from: e */
    public abstract Type mo12166e();

    @NotNull
    /* renamed from: f */
    public abstract From mo12167f();

    @Nullable
    /* renamed from: g */
    public abstract Boolean mo12168g();
}
