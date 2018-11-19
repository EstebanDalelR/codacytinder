package com.tinder.purchase.logging.p376a;

import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.telephony.TelephonyManager;
import com.tinder.api.model.purchase.PurchaseLog;
import com.tinder.api.model.purchase.PurchaseLog.MetaData;
import com.tinder.api.model.purchase.PurchaseLog.Source;
import com.tinder.api.model.purchase.PurchaseLog.Subscription;
import com.tinder.boost.p178a.C10400d;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.superlike.SuperlikeStatus;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.bk;
import com.tinder.passport.p093d.C3945a;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.domain.exception.PurchaseLoggableException;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.C14514j;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.model.C14534d;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.utils.C15364o;
import com.tinder.utils.C15376y;
import com.tinder.utils.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002%&BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/purchase/logging/model/PurchaseLogFactory;", "", "sharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "managerPassport", "Lcom/tinder/passport/manager/ManagerPassport;", "superlikeInteractor", "Lcom/tinder/superlike/interactors/SuperlikeInteractor;", "boostInteractor", "Lcom/tinder/boost/interactor/BoostInteractor;", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "telephonyManager", "Landroid/telephony/TelephonyManager;", "connectivityManager", "Landroid/net/ConnectivityManager;", "biller", "Lcom/tinder/purchase/billing/Biller;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "(Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/passport/manager/ManagerPassport;Lcom/tinder/superlike/interactors/SuperlikeInteractor;Lcom/tinder/boost/interactor/BoostInteractor;Lcom/tinder/purchase/domain/repository/OfferRepository;Landroid/telephony/TelephonyManager;Landroid/net/ConnectivityManager;Lcom/tinder/purchase/billing/Biller;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/core/experiment/AbTestUtility;)V", "metaDataFactory", "Lcom/tinder/purchase/logging/model/PurchaseLogFactory$MetaDataFactory;", "create", "Lcom/tinder/api/model/purchase/PurchaseLog;", "purchaseException", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "source", "Lcom/tinder/api/model/purchase/PurchaseLog$Source;", "createPurchaseLogSubscription", "Lcom/tinder/api/model/purchase/PurchaseLog$Subscription;", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "purchaseCodeVersion", "", "MetaDataFactory", "PurchaseData", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.logging.a.a */
public final class C14521a {
    /* renamed from: a */
    private final C14519a f45910a = new C14519a(this);
    /* renamed from: b */
    private final bk f45911b;
    /* renamed from: c */
    private final C3945a f45912c;
    /* renamed from: d */
    private final C15071e f45913d;
    /* renamed from: e */
    private final C10400d f45914e;
    /* renamed from: f */
    private final OfferRepository f45915f;
    /* renamed from: g */
    private final TelephonyManager f45916g;
    /* renamed from: h */
    private final ConnectivityManager f45917h;
    /* renamed from: i */
    private final Biller f45918i;
    /* renamed from: j */
    private final SubscriptionProvider f45919j;
    /* renamed from: k */
    private final AbTestUtility f45920k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J'\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/purchase/logging/model/PurchaseLogFactory$MetaDataFactory;", "", "(Lcom/tinder/purchase/logging/model/PurchaseLogFactory;)V", "addPurchaseInfo", "Lcom/tinder/purchase/logging/model/PurchaseLogFactory$PurchaseData;", "purchaseError", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "productId", "", "create", "Lcom/tinder/api/model/purchase/PurchaseLog$MetaData;", "purchaseException", "source", "Lcom/tinder/api/model/purchase/PurchaseLog$Source;", "create$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.logging.a.a$a */
    private final class C14519a {
        /* renamed from: a */
        final /* synthetic */ C14521a f45902a;

        public C14519a(C14521a c14521a) {
            this.f45902a = c14521a;
        }

        @NotNull
        /* renamed from: a */
        public final MetaData m55448a(@NotNull PurchaseLoggableException purchaseLoggableException, @Nullable String str, @NotNull Source source) {
            C2668g.b(purchaseLoggableException, "purchaseException");
            C2668g.b(source, "source");
            C14520b a = m55447a(purchaseLoggableException, str);
            String str2 = Build.DEVICE;
            String str3 = Build.MANUFACTURER;
            String str4 = VERSION.RELEASE;
            String networkOperatorName = this.f45902a.f45916g.getNetworkOperatorName();
            String niceName = C15364o.m57673a(this.f45902a.f45917h).getNiceName();
            String locale = Locale.getDefault().toString();
            String b = ab.m57609b();
            Boolean valueOf = Boolean.valueOf(this.f45902a.f45912c.f());
            Locale locale2 = Locale.getDefault();
            C2668g.a(locale2, "Locale.getDefault()");
            String displayLanguage = locale2.getDisplayLanguage();
            Boolean valueOf2 = Boolean.valueOf(this.f45902a.f45918i.isConnected());
            List k = purchaseLoggableException.m55350k();
            Integer c = purchaseLoggableException.mo11822c();
            String i = purchaseLoggableException.mo11826i();
            Subscription a2 = this.f45902a.m55463a(this.f45902a.f45919j.get());
            Boolean valueOf3 = Boolean.valueOf(this.f45902a.f45914e.a());
            String j = purchaseLoggableException.mo13496j();
            String f = j != null ? j : purchaseLoggableException.mo11825f();
            Integer a3 = a.m55449a();
            Integer b2 = a.m55453b();
            Double c2 = a.m55456c();
            List d = a.m55457d();
            String e = a.m55458e();
            return new MetaData(c, displayLanguage, k, valueOf2, b, locale, valueOf, a2, a3, b2, valueOf3, null, d, a.m55460g(), f, a.m55459f(), e, source, c2, i, Integer.valueOf(r0.f45902a.m55461a()), str2, str3, str4, networkOperatorName, niceName, Boolean.valueOf(r0.f45902a.f45920k.profileV2EnabledForRevenue()), ItemAnimator.FLAG_MOVED, null);
        }

        /* renamed from: a */
        private final C14520b m55447a(PurchaseLoggableException purchaseLoggableException, String str) {
            SuperlikeStatus b = this.f45902a.f45913d.m56818b();
            Integer valueOf = b != null ? Integer.valueOf(b.remainingCount()) : Integer.valueOf(0);
            BoostStatus e = this.f45902a.f45914e.e();
            C14520b c14520b = new C14520b(valueOf, e != null ? Integer.valueOf(e.getRemaining()) : Integer.valueOf(0), null, null, null, null, null, 124, null);
            List list = (List) this.f45902a.f45915f.observeAllOffers().u().a(C17554o.m64195a());
            if (list != null) {
                Object obj;
                Double d;
                Iterable<C14510e> iterable = list;
                Iterator it = iterable.iterator();
                do {
                    d = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                } while (!C2668g.a(((C14510e) obj).mo11839a(), str));
                C14510e c14510e = (C14510e) obj;
                if (c14510e != null) {
                    C14514j d2 = c14510e.mo11842d();
                    if (d2 != null) {
                        d = d2.mo11870b();
                    }
                }
                c14520b.m55450a(d);
                Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                for (C14510e c14510e2 : iterable) {
                    arrayList.add(c14510e2.mo11839a());
                }
                c14520b.m55452a((List) arrayList);
            }
            if (str != null) {
                c14520b.m55451a(str);
            }
            purchaseLoggableException = purchaseLoggableException.w_();
            if (purchaseLoggableException != null) {
                c14520b.m55454b(C15376y.m57708a(purchaseLoggableException));
            }
            purchaseLoggableException = this.f45902a.f45918i.observePurchaseHistory().u().a();
            C2668g.a(purchaseLoggableException, "biller.observePurchaseHi…ry().toBlocking().first()");
            c14520b.m55455b(((C14534d) purchaseLoggableException).m55532a());
            return c14520b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003Jn\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\tHÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011¨\u00064"}, d2 = {"Lcom/tinder/purchase/logging/model/PurchaseLogFactory$PurchaseData;", "", "superlikeCount", "", "boostCount", "price", "", "skusOffered", "", "", "purchasedSku", "receipt", "skusOwned", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBoostCount", "()Ljava/lang/Integer;", "setBoostCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPrice", "()Ljava/lang/Double;", "setPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getPurchasedSku", "()Ljava/lang/String;", "setPurchasedSku", "(Ljava/lang/String;)V", "getReceipt", "setReceipt", "getSkusOffered", "()Ljava/util/List;", "setSkusOffered", "(Ljava/util/List;)V", "getSkusOwned", "setSkusOwned", "getSuperlikeCount", "setSuperlikeCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/tinder/purchase/logging/model/PurchaseLogFactory$PurchaseData;", "equals", "", "other", "hashCode", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.logging.a.a$b */
    public static final class C14520b {
        @Nullable
        /* renamed from: a */
        private Integer f45903a;
        @Nullable
        /* renamed from: b */
        private Integer f45904b;
        @Nullable
        /* renamed from: c */
        private Double f45905c;
        @Nullable
        /* renamed from: d */
        private List<String> f45906d;
        @Nullable
        /* renamed from: e */
        private String f45907e;
        @Nullable
        /* renamed from: f */
        private String f45908f;
        @Nullable
        /* renamed from: g */
        private List<String> f45909g;

        public C14520b() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14520b) {
                    C14520b c14520b = (C14520b) obj;
                    if (C2668g.a(this.f45903a, c14520b.f45903a) && C2668g.a(this.f45904b, c14520b.f45904b) && C2668g.a(this.f45905c, c14520b.f45905c) && C2668g.a(this.f45906d, c14520b.f45906d) && C2668g.a(this.f45907e, c14520b.f45907e) && C2668g.a(this.f45908f, c14520b.f45908f) && C2668g.a(this.f45909g, c14520b.f45909g)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Integer num = this.f45903a;
            int i = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            Integer num2 = this.f45904b;
            hashCode = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
            Double d = this.f45905c;
            hashCode = (hashCode + (d != null ? d.hashCode() : 0)) * 31;
            List list = this.f45906d;
            hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            String str = this.f45907e;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.f45908f;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            list = this.f45909g;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PurchaseData(superlikeCount=");
            stringBuilder.append(this.f45903a);
            stringBuilder.append(", boostCount=");
            stringBuilder.append(this.f45904b);
            stringBuilder.append(", price=");
            stringBuilder.append(this.f45905c);
            stringBuilder.append(", skusOffered=");
            stringBuilder.append(this.f45906d);
            stringBuilder.append(", purchasedSku=");
            stringBuilder.append(this.f45907e);
            stringBuilder.append(", receipt=");
            stringBuilder.append(this.f45908f);
            stringBuilder.append(", skusOwned=");
            stringBuilder.append(this.f45909g);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14520b(@Nullable Integer num, @Nullable Integer num2, @Nullable Double d, @Nullable List<String> list, @Nullable String str, @Nullable String str2, @Nullable List<String> list2) {
            this.f45903a = num;
            this.f45904b = num2;
            this.f45905c = d;
            this.f45906d = list;
            this.f45907e = str;
            this.f45908f = str2;
            this.f45909g = list2;
        }

        public /* synthetic */ C14520b(Integer num, Integer num2, Double d, List list, String str, String str2, List list2, int i, C15823e c15823e) {
            Number valueOf;
            if ((i & 1) != null) {
                valueOf = Integer.valueOf(0);
            }
            if ((i & 2) != null) {
                num2 = Integer.valueOf(0);
            }
            List list3 = num2;
            if ((i & 4) != null) {
                d = null;
            }
            Double d2 = d;
            if ((i & 8) != null) {
                list = null;
            }
            List list4 = list;
            if ((i & 16) != null) {
                str = null;
            }
            String str3 = str;
            if ((i & 32) != null) {
                str2 = null;
            }
            String str4 = str2;
            if ((i & 64) != null) {
                list2 = null;
            }
            this(valueOf, list3, d2, list4, str3, str4, list2);
        }

        @Nullable
        /* renamed from: a */
        public final Integer m55449a() {
            return this.f45903a;
        }

        @Nullable
        /* renamed from: b */
        public final Integer m55453b() {
            return this.f45904b;
        }

        /* renamed from: a */
        public final void m55450a(@Nullable Double d) {
            this.f45905c = d;
        }

        @Nullable
        /* renamed from: c */
        public final Double m55456c() {
            return this.f45905c;
        }

        /* renamed from: a */
        public final void m55452a(@Nullable List<String> list) {
            this.f45906d = list;
        }

        @Nullable
        /* renamed from: d */
        public final List<String> m55457d() {
            return this.f45906d;
        }

        /* renamed from: a */
        public final void m55451a(@Nullable String str) {
            this.f45907e = str;
        }

        @Nullable
        /* renamed from: e */
        public final String m55458e() {
            return this.f45907e;
        }

        /* renamed from: b */
        public final void m55454b(@Nullable String str) {
            this.f45908f = str;
        }

        @Nullable
        /* renamed from: f */
        public final String m55459f() {
            return this.f45908f;
        }

        /* renamed from: b */
        public final void m55455b(@Nullable List<String> list) {
            this.f45909g = list;
        }

        @Nullable
        /* renamed from: g */
        public final List<String> m55460g() {
            return this.f45909g;
        }
    }

    /* renamed from: a */
    private final int m55461a() {
        return 2;
    }

    @Inject
    public C14521a(@NotNull bk bkVar, @NotNull C3945a c3945a, @NotNull C15071e c15071e, @NotNull C10400d c10400d, @NotNull OfferRepository offerRepository, @NotNull TelephonyManager telephonyManager, @NotNull ConnectivityManager connectivityManager, @NotNull Biller biller, @NotNull SubscriptionProvider subscriptionProvider, @NotNull AbTestUtility abTestUtility) {
        C2668g.b(bkVar, "sharedPreferences");
        C2668g.b(c3945a, "managerPassport");
        C2668g.b(c15071e, "superlikeInteractor");
        C2668g.b(c10400d, "boostInteractor");
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(telephonyManager, "telephonyManager");
        C2668g.b(connectivityManager, "connectivityManager");
        C2668g.b(biller, "biller");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(abTestUtility, "abTestUtility");
        this.f45911b = bkVar;
        this.f45912c = c3945a;
        this.f45913d = c15071e;
        this.f45914e = c10400d;
        this.f45915f = offerRepository;
        this.f45916g = telephonyManager;
        this.f45917h = connectivityManager;
        this.f45918i = biller;
        this.f45919j = subscriptionProvider;
        this.f45920k = abTestUtility;
    }

    @Nullable
    /* renamed from: a */
    public final PurchaseLog m55474a(@NotNull PurchaseLoggableException purchaseLoggableException, @NotNull Source source) {
        C2668g.b(purchaseLoggableException, "purchaseException");
        C2668g.b(source, "source");
        String K = this.f45911b.K();
        if (K == null) {
            return null;
        }
        return new PurchaseLog(purchaseLoggableException.mo11820a(), purchaseLoggableException.mo11821b(), purchaseLoggableException.mo11824e().getTypeName(), "android", K, ManagerApp.f12346b, Long.valueOf(System.currentTimeMillis()), this.f45910a.m55448a(purchaseLoggableException, purchaseLoggableException.mo11825f(), source));
    }

    /* renamed from: a */
    private final Subscription m55463a(com.tinder.domain.common.model.Subscription subscription) {
        return new Subscription(subscription.getProductId(), subscription.isGold(), subscription.isPlus(), subscription.getPlatform().getPlatformName());
    }
}
