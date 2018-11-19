package com.tinder.tindergold.p426a;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.etl.event.ig;
import com.tinder.etl.event.ig.C9114a;
import com.tinder.etl.event.ik;
import com.tinder.etl.event.ik.C9120a;
import com.tinder.etl.event.il;
import com.tinder.etl.event.il.C9122a;
import com.tinder.etl.event.im;
import com.tinder.etl.event.im.C9124a;
import com.tinder.etl.event.in;
import com.tinder.etl.event.in.C9126a;
import com.tinder.etl.event.io;
import com.tinder.etl.event.io.C9128a;
import com.tinder.paywall.legacy.GoldPaywallSource;
import com.tinder.paywall.paywallflow.C10076o.C10074a;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.providers.BillerVersionCodeProvider;
import com.tinder.utils.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002$%B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002J\b\u0010#\u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory;", "", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "billerVersionCodeProvider", "Lcom/tinder/purchase/providers/BillerVersionCodeProvider;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "(Lcom/tinder/purchase/domain/repository/OfferRepository;Lcom/tinder/purchase/providers/BillerVersionCodeProvider;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;)V", "createCancel", "Lcom/tinder/etl/event/GoldCancelEvent;", "options", "Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory$Options;", "createCommonFields", "Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory$CommonFields;", "createOptionsFromOfferAndConfig", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "config", "Lcom/tinder/paywall/paywallflow/PaywallFlow$Configuration;", "createPaywallView", "Lcom/tinder/etl/event/GoldPaywallEvent;", "createPurchase", "Lcom/tinder/etl/event/GoldPurchaseEvent;", "createRestore", "Lcom/tinder/etl/event/GoldRestoreEvent;", "createSelect", "Lcom/tinder/etl/event/GoldSelectEvent;", "createSkuOffered", "Lcom/tinder/etl/event/GoldSkuOfferedEvent;", "getGoldPaywallVersion", "", "fromSource", "getNumLikes", "CommonFields", "Options", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tindergold.a.k */
public final class C15183k {
    /* renamed from: a */
    private final OfferRepository f47222a;
    /* renamed from: b */
    private final BillerVersionCodeProvider f47223b;
    /* renamed from: c */
    private final SubscriptionProvider f47224c;
    /* renamed from: d */
    private final FastMatchStatusProvider f47225d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000f0\t¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u001b\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000f0\tHÆ\u0003J\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u00032\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000f0\tHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d¨\u00060"}, d2 = {"Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory$CommonFields;", "", "purchaseVersionCode", "", "currency", "", "basePrice", "", "skus", "", "locale", "paywallVersion", "from", "likesNum", "products", "", "(ILjava/lang/String;Ljava/lang/Number;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Number;ILjava/util/List;)V", "getBasePrice", "()Ljava/lang/Number;", "getCurrency", "()Ljava/lang/String;", "getFrom", "getLikesNum", "()I", "getLocale", "getPaywallVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProducts", "()Ljava/util/List;", "getPurchaseVersionCode", "getSkus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/Number;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Number;ILjava/util/List;)Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory$CommonFields;", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.k$a */
    private static final class C15181a {
        /* renamed from: a */
        private final int f47209a;
        @NotNull
        /* renamed from: b */
        private final String f47210b;
        @Nullable
        /* renamed from: c */
        private final Number f47211c;
        @NotNull
        /* renamed from: d */
        private final List<String> f47212d;
        @NotNull
        /* renamed from: e */
        private final String f47213e;
        @Nullable
        /* renamed from: f */
        private final Integer f47214f;
        @Nullable
        /* renamed from: g */
        private final Number f47215g;
        /* renamed from: h */
        private final int f47216h;
        @NotNull
        /* renamed from: i */
        private final List<Map<String, Object>> f47217i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15181a) {
                C15181a c15181a = (C15181a) obj;
                if ((this.f47209a == c15181a.f47209a ? 1 : null) != null && C2668g.a(this.f47210b, c15181a.f47210b) && C2668g.a(this.f47211c, c15181a.f47211c) && C2668g.a(this.f47212d, c15181a.f47212d) && C2668g.a(this.f47213e, c15181a.f47213e) && C2668g.a(this.f47214f, c15181a.f47214f) && C2668g.a(this.f47215g, c15181a.f47215g)) {
                    return (this.f47216h == c15181a.f47216h ? 1 : null) != null && C2668g.a(this.f47217i, c15181a.f47217i);
                }
            }
        }

        public int hashCode() {
            int i = this.f47209a * 31;
            String str = this.f47210b;
            int i2 = 0;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            Number number = this.f47211c;
            i = (i + (number != null ? number.hashCode() : 0)) * 31;
            List list = this.f47212d;
            i = (i + (list != null ? list.hashCode() : 0)) * 31;
            str = this.f47213e;
            i = (i + (str != null ? str.hashCode() : 0)) * 31;
            Integer num = this.f47214f;
            i = (i + (num != null ? num.hashCode() : 0)) * 31;
            number = this.f47215g;
            i = (((i + (number != null ? number.hashCode() : 0)) * 31) + this.f47216h) * 31;
            list = this.f47217i;
            if (list != null) {
                i2 = list.hashCode();
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CommonFields(purchaseVersionCode=");
            stringBuilder.append(this.f47209a);
            stringBuilder.append(", currency=");
            stringBuilder.append(this.f47210b);
            stringBuilder.append(", basePrice=");
            stringBuilder.append(this.f47211c);
            stringBuilder.append(", skus=");
            stringBuilder.append(this.f47212d);
            stringBuilder.append(", locale=");
            stringBuilder.append(this.f47213e);
            stringBuilder.append(", paywallVersion=");
            stringBuilder.append(this.f47214f);
            stringBuilder.append(", from=");
            stringBuilder.append(this.f47215g);
            stringBuilder.append(", likesNum=");
            stringBuilder.append(this.f47216h);
            stringBuilder.append(", products=");
            stringBuilder.append(this.f47217i);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15181a(int i, @NotNull String str, @Nullable Number number, @NotNull List<String> list, @NotNull String str2, @Nullable Integer num, @Nullable Number number2, int i2, @NotNull List<? extends Map<String, ? extends Object>> list2) {
            C2668g.b(str, "currency");
            C2668g.b(list, ManagerWebServices.PARAM_SKUS);
            C2668g.b(str2, ManagerWebServices.PARAM_LOCALE);
            C2668g.b(list2, ManagerWebServices.PARAM_PRODUCTS);
            this.f47209a = i;
            this.f47210b = str;
            this.f47211c = number;
            this.f47212d = list;
            this.f47213e = str2;
            this.f47214f = num;
            this.f47215g = number2;
            this.f47216h = i2;
            this.f47217i = list2;
        }

        /* renamed from: a */
        public final int m57074a() {
            return this.f47209a;
        }

        @NotNull
        /* renamed from: b */
        public final String m57075b() {
            return this.f47210b;
        }

        @Nullable
        /* renamed from: c */
        public final Number m57076c() {
            return this.f47211c;
        }

        @NotNull
        /* renamed from: d */
        public final List<String> m57077d() {
            return this.f47212d;
        }

        @NotNull
        /* renamed from: e */
        public final String m57078e() {
            return this.f47213e;
        }

        @Nullable
        /* renamed from: f */
        public final Integer m57079f() {
            return this.f47214f;
        }

        @Nullable
        /* renamed from: g */
        public final Number m57080g() {
            return this.f47215g;
        }

        /* renamed from: h */
        public final int m57081h() {
            return this.f47216h;
        }

        @NotNull
        /* renamed from: i */
        public final List<Map<String, Object>> m57082i() {
            return this.f47217i;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J:\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory$Options;", "", "paywallVersion", "", "from", "", "likesNum", "sku", "", "(Ljava/lang/Integer;Ljava/lang/Number;ILjava/lang/String;)V", "getFrom", "()Ljava/lang/Number;", "getLikesNum", "()I", "getPaywallVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSku", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Number;ILjava/lang/String;)Lcom/tinder/tindergold/analytics/TinderGoldEtlEventFactory$Options;", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.tindergold.a.k$b */
    public static final class C15182b {
        @Nullable
        /* renamed from: a */
        private final Integer f47218a;
        @Nullable
        /* renamed from: b */
        private final Number f47219b;
        /* renamed from: c */
        private final int f47220c;
        @NotNull
        /* renamed from: d */
        private final String f47221d;

        public C15182b() {
            this(null, null, 0, null, 15, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C15182b) {
                C15182b c15182b = (C15182b) obj;
                if (C2668g.a(this.f47218a, c15182b.f47218a) && C2668g.a(this.f47219b, c15182b.f47219b)) {
                    return (this.f47220c == c15182b.f47220c ? 1 : null) != null && C2668g.a(this.f47221d, c15182b.f47221d);
                }
            }
        }

        public int hashCode() {
            Integer num = this.f47218a;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            Number number = this.f47219b;
            hashCode = (((hashCode + (number != null ? number.hashCode() : 0)) * 31) + this.f47220c) * 31;
            String str = this.f47221d;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Options(paywallVersion=");
            stringBuilder.append(this.f47218a);
            stringBuilder.append(", from=");
            stringBuilder.append(this.f47219b);
            stringBuilder.append(", likesNum=");
            stringBuilder.append(this.f47220c);
            stringBuilder.append(", sku=");
            stringBuilder.append(this.f47221d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15182b(@Nullable Integer num, @Nullable Number number, int i, @NotNull String str) {
            C2668g.b(str, "sku");
            this.f47218a = num;
            this.f47219b = number;
            this.f47220c = i;
            this.f47221d = str;
        }

        public /* synthetic */ C15182b(Integer num, Number number, int i, String str, int i2, C15823e c15823e) {
            if ((i2 & 1) != null) {
                num = null;
            }
            if ((i2 & 2) != null) {
                number = null;
            }
            if ((i2 & 4) != null) {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                str = "";
            }
            this(num, number, i, str);
        }

        @Nullable
        /* renamed from: a */
        public final Integer m57083a() {
            return this.f47218a;
        }

        @Nullable
        /* renamed from: b */
        public final Number m57084b() {
            return this.f47219b;
        }

        /* renamed from: c */
        public final int m57085c() {
            return this.f47220c;
        }

        @NotNull
        /* renamed from: d */
        public final String m57086d() {
            return this.f47221d;
        }
    }

    @Inject
    public C15183k(@NotNull OfferRepository offerRepository, @NotNull BillerVersionCodeProvider billerVersionCodeProvider, @NotNull SubscriptionProvider subscriptionProvider, @NotNull FastMatchStatusProvider fastMatchStatusProvider) {
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(billerVersionCodeProvider, "billerVersionCodeProvider");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(fastMatchStatusProvider, "fastMatchStatusProvider");
        this.f47222a = offerRepository;
        this.f47223b = billerVersionCodeProvider;
        this.f47224c = subscriptionProvider;
        this.f47225d = fastMatchStatusProvider;
    }

    @NotNull
    /* renamed from: a */
    public final C15182b m57091a(@NotNull C14510e c14510e, @NotNull C10074a c10074a) {
        int i;
        C2668g.b(c14510e, "offer");
        C2668g.b(c10074a, "config");
        c14510e = c14510e.mo11839a();
        int analyticsSource = c10074a.a().getAnalyticsSource();
        if (analyticsSource != GoldPaywallSource.FASTMATCH_MATCHLIST_PREVIEW.getAnalyticsSource()) {
            i = 0;
        } else {
            i = m57087a();
        }
        Integer valueOf = Integer.valueOf(m57088a(analyticsSource));
        Number valueOf2 = Integer.valueOf(analyticsSource);
        C2668g.a(c14510e, "productId");
        return new C15182b(valueOf, valueOf2, i, c14510e);
    }

    @NotNull
    /* renamed from: a */
    public final ik m57090a(@NotNull C15182b c15182b) {
        C2668g.b(c15182b, "options");
        c15182b = m57089g(c15182b);
        C9120a a = ik.a();
        Number c = c15182b.m57076c();
        if (c != null) {
            a.a(c);
        }
        c15182b = a.a(c15182b.m57075b()).c(c15182b.m57080g()).b(c15182b.m57078e()).b(c15182b.m57077d()).e(Integer.valueOf(c15182b.m57074a())).b(Integer.valueOf(c15182b.m57081h())).d(c15182b.m57079f()).a(c15182b.m57082i()).a();
        C2668g.a(c15182b, "builder.currency(commonF…\n                .build()");
        return c15182b;
    }

    @NotNull
    /* renamed from: b */
    public final il m57092b(@NotNull C15182b c15182b) {
        C2668g.b(c15182b, "options");
        C15181a g = m57089g(c15182b);
        C9122a a = il.a();
        Number c = g.m57076c();
        if (c != null) {
            a.a(c);
        }
        c15182b = a.a(g.m57075b()).c(g.m57080g()).b(g.m57078e()).b(g.m57077d()).e(Integer.valueOf(g.m57074a())).b(Integer.valueOf(g.m57081h())).d(g.m57079f()).c(c15182b.m57086d()).a(g.m57082i()).a();
        C2668g.a(c15182b, "builder.currency(commonF…\n                .build()");
        return c15182b;
    }

    @NotNull
    /* renamed from: c */
    public final in m57093c(@NotNull C15182b c15182b) {
        C2668g.b(c15182b, "options");
        C15181a g = m57089g(c15182b);
        C9126a a = in.a();
        Number c = g.m57076c();
        if (c != null) {
            a.a(c);
        }
        c15182b = a.a(g.m57075b()).c(g.m57080g()).b(g.m57078e()).b(g.m57077d()).e(Integer.valueOf(g.m57074a())).b(Integer.valueOf(g.m57081h())).d(g.m57079f()).c(c15182b.m57086d()).a(g.m57082i()).a();
        C2668g.a(c15182b, "builder.currency(commonF…\n                .build()");
        return c15182b;
    }

    @NotNull
    /* renamed from: d */
    public final io m57094d(@NotNull C15182b c15182b) {
        C2668g.b(c15182b, "options");
        C15181a g = m57089g(c15182b);
        C9128a a = io.a();
        Number c = g.m57076c();
        if (c != null) {
            a.a(c);
        }
        c15182b = a.a(g.m57075b()).b(g.m57078e()).b(g.m57077d()).c(Integer.valueOf(g.m57074a())).b(Integer.valueOf(g.m57081h())).c(c15182b.m57086d()).a(g.m57082i()).a();
        C2668g.a(c15182b, "builder.currency(commonF…\n                .build()");
        return c15182b;
    }

    @NotNull
    /* renamed from: e */
    public final im m57095e(@NotNull C15182b c15182b) {
        C2668g.b(c15182b, "options");
        C15181a g = m57089g(c15182b);
        C9124a a = im.a();
        Number c = g.m57076c();
        if (c != null) {
            a.a(c);
        }
        c15182b = a.a(g.m57075b()).b(g.m57078e()).b(g.m57077d()).c(Integer.valueOf(g.m57074a())).b(Integer.valueOf(g.m57081h())).c(c15182b.m57086d()).a(g.m57082i()).a();
        C2668g.a(c15182b, "builder.currency(commonF…\n                .build()");
        return c15182b;
    }

    @NotNull
    /* renamed from: f */
    public final ig m57096f(@NotNull C15182b c15182b) {
        C2668g.b(c15182b, "options");
        C15181a g = m57089g(c15182b);
        C9114a a = ig.a();
        Number c = g.m57076c();
        if (c != null) {
            a.a(c);
        }
        c15182b = a.a(g.m57075b()).c(g.m57080g()).b(g.m57078e()).b(g.m57077d()).e(Integer.valueOf(g.m57074a())).b(Integer.valueOf(g.m57081h())).d(g.m57079f()).c(c15182b.m57086d()).a(g.m57082i()).a();
        C2668g.a(c15182b, "builder.currency(commonF…\n                .build()");
        return c15182b;
    }

    /* renamed from: a */
    private final int m57088a(int i) {
        return i == GoldPaywallSource.FASTMATCH_MATCHLIST_PREVIEW.getAnalyticsSource() ? this.f47224c.get().isPlus() != 0 ? 3 : 1 : this.f47224c.get().isPlus() != 0 ? 2 : 0;
    }

    /* renamed from: a */
    private final int m57087a() {
        FastMatchStatus fastMatchStatus = this.f47225d.get();
        int i = 0;
        if (fastMatchStatus.getCount() < 2) {
            return 0;
        }
        if (this.f47224c.get().isGold()) {
            return -1;
        }
        if (fastMatchStatus.getCount() >= 0) {
            i = fastMatchStatus.getCount();
        }
        return i;
    }

    /* renamed from: g */
    private final C15181a m57089g(C15182b c15182b) {
        Number number;
        int purchaseCodeVersion = this.f47223b.getPurchaseCodeVersion();
        String b = ab.m57609b();
        List offers = this.f47222a.getOffers(ProductType.GOLD);
        Number number2 = (Number) null;
        String str = "";
        List a = C17554o.m64195a();
        List arrayList = new ArrayList();
        if (offers.isEmpty()) {
            offers = a;
            number = number2;
        } else {
            C2668g.a(offers, "offers");
            Iterable<C14510e> iterable = offers;
            for (C14510e c14510e : iterable) {
                Map linkedHashMap = new LinkedHashMap();
                String a2 = c14510e.mo11839a();
                C2668g.a(a2, "offer.productId()");
                linkedHashMap.put("sku", a2);
                Double b2 = c14510e.mo11842d().mo11870b();
                C2668g.a(b2, "offer.price().amount()");
                linkedHashMap.put("price", b2);
                arrayList.add(linkedHashMap);
            }
            C14510e c14510e2 = (C14510e) C19299w.m68829f(offers);
            Number b3 = c14510e2.mo11848j().mo11870b();
            String a3 = c14510e2.mo11848j().mo11869a();
            C2668g.a(a3, "firstOffer.basePrice().currency()");
            Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (C14510e a4 : iterable) {
                arrayList2.add(a4.mo11839a());
            }
            List l = C19299w.m68840l((List) arrayList2);
            number = b3;
            str = a3;
            offers = l;
        }
        C2668g.a(b, ManagerWebServices.PARAM_LOCALE);
        return new C15181a(purchaseCodeVersion, str, number, offers, b, c15182b.m57083a(), c15182b.m57084b(), c15182b.m57085c(), C19299w.m68840l(arrayList));
    }
}
