package com.tinder.purchase.register;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.tinder.api.model.purchase.BillingReceipt;
import com.tinder.api.model.purchase.PurchaseLog.Source;
import com.tinder.boost.p178a.C10400d;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.fastmatch.usecase.C10771d;
import com.tinder.data.purchase.p091a.C3926a;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.profile.model.ProfileDataRequest;
import com.tinder.domain.profile.model.ProfileOption.Likes;
import com.tinder.domain.profile.model.ProfileOption.PlusControl;
import com.tinder.domain.profile.model.ProfileOption.Products;
import com.tinder.domain.profile.model.ProfileOption.Purchase;
import com.tinder.domain.profile.model.ProfileOption.SuperLikes;
import com.tinder.domain.profile.model.PurchaseType;
import com.tinder.domain.profile.usecase.SyncProfileData;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.domain.exception.GooglePurchaseBillingException.ItemAlreadyOwnedException;
import com.tinder.purchase.domain.exception.PurchaseClientException.EmptyBillingReceiptException;
import com.tinder.purchase.domain.exception.PurchaseClientException.EmptyOfferException;
import com.tinder.purchase.domain.exception.PurchaseClientException.EmptyPurchasesException;
import com.tinder.purchase.domain.exception.PurchaseClientException.SubscriptionIsActiveException;
import com.tinder.purchase.domain.exception.PurchaseClientException.TooRecentPurchaseException;
import com.tinder.purchase.domain.exception.PurchaseHttpException;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.logging.C14522a;
import com.tinder.purchase.model.C14534d;
import com.tinder.purchase.model.PurchaseTransaction;
import com.tinder.purchase.model.PurchaseTransaction.State;
import com.tinder.purchase.p373c.C14488a;
import com.tinder.purchase.providers.BillerVersionCodeProvider;
import com.tinder.purchase.register.Register.RestoreType;
import com.tinder.purchase.register.p378a.p379a.C14537a;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.usecase.C17225j;
import com.tinder.usecase.C17225j.C15345a;
import com.tinder.usecase.C17226m;
import com.tinder.utils.RxUtils;
import hu.akarnokd.rxjava.interop.C15551e;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p000a.p001a.C0001a;
import retrofit2.HttpException;
import rx.Notification;
import rx.Observable;
import rx.Observable$Transformer;
import rx.Single;
import rx.schedulers.Schedulers;

@Singleton
public class RegisterImpl implements BillerVersionCodeProvider, Register {
    /* renamed from: a */
    private final Biller f50586a;
    /* renamed from: b */
    private final OfferRepository f50587b;
    /* renamed from: c */
    private final C14488a f50588c;
    /* renamed from: d */
    private final C10400d f50589d;
    /* renamed from: e */
    private final C15071e f50590e;
    /* renamed from: f */
    private final C14522a f50591f;
    /* renamed from: g */
    private final C15193i f50592g;
    /* renamed from: h */
    private final SubscriptionProvider f50593h;
    /* renamed from: i */
    private final C3926a f50594i;
    /* renamed from: j */
    private final FastMatchConfigProvider f50595j;
    /* renamed from: k */
    private final C10771d f50596k;
    /* renamed from: l */
    private final C17225j f50597l;
    /* renamed from: m */
    private final C17226m f50598m;
    /* renamed from: n */
    private final SyncProfileData f50599n;
    /* renamed from: o */
    private final AbTestUtility f50600o;
    /* renamed from: p */
    private final MetaGateway f50601p;
    /* renamed from: q */
    private boolean f50602q;

    /* renamed from: com.tinder.purchase.register.RegisterImpl$1 */
    static /* synthetic */ class C145361 {
        /* renamed from: a */
        static final /* synthetic */ int[] f45939a = new int[PurchaseType.values().length];
        /* renamed from: b */
        static final /* synthetic */ int[] f45940b = new int[ProductType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.domain.profile.model.ProductType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f45940b = r0;
            r0 = 1;
            r1 = f45940b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.tinder.domain.profile.model.ProductType.PLUS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = f45940b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = com.tinder.domain.profile.model.ProductType.SUPERLIKE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r1 = f45940b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = com.tinder.domain.profile.model.ProductType.BOOST;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r1 = f45940b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = com.tinder.domain.profile.model.ProductType.GOLD;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r1 = com.tinder.domain.profile.model.PurchaseType.values();
            r1 = r1.length;
            r1 = new int[r1];
            f45939a = r1;
            r1 = f45939a;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r2 = com.tinder.domain.profile.model.PurchaseType.CONSUMABLE;	 Catch:{ NoSuchFieldError -> 0x0048 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0048 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0048 }
        L_0x0048:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.purchase.register.RegisterImpl.1.<clinit>():void");
        }
    }

    private enum RestorePurchaseType {
        CONSUMABLE,
        SUBSCRIPTION
    }

    /* renamed from: a */
    static final /* synthetic */ PurchaseTransaction m61313a(PurchaseTransaction purchaseTransaction, String str) {
        return purchaseTransaction;
    }

    /* renamed from: a */
    static final /* synthetic */ String m61314a(@NonNull String str, BillingReceipt billingReceipt) {
        return str;
    }

    /* renamed from: a */
    static final /* synthetic */ void m61323a() {
    }

    /* renamed from: a */
    static final /* synthetic */ void m61326a(Boolean bool) {
    }

    /* renamed from: b */
    static final /* synthetic */ BillingReceipt m61330b(BillingReceipt billingReceipt, String str) {
        return billingReceipt;
    }

    /* renamed from: b */
    static final /* synthetic */ void m61334b(Boolean bool) {
    }

    /* renamed from: a */
    final /* synthetic */ Observable m61351a(C14534d c14534d) {
        return m61331b(c14534d);
    }

    /* renamed from: a */
    final /* synthetic */ Observable m61355a(List list) {
        return m61332b(list);
    }

    /* renamed from: b */
    final /* synthetic */ void m61367b(PurchaseTransaction purchaseTransaction) {
        m61338c(purchaseTransaction);
    }

    /* renamed from: b */
    final /* synthetic */ void m61369b(Throwable th) {
        m61342d(th);
    }

    public int getPurchaseCodeVersion() {
        return 2;
    }

    @Inject
    public RegisterImpl(Biller biller, OfferRepository offerRepository, C14488a c14488a, C10400d c10400d, C15071e c15071e, C14522a c14522a, C15193i c15193i, SubscriptionProvider subscriptionProvider, C3926a c3926a, FastMatchConfigProvider fastMatchConfigProvider, C10771d c10771d, C17225j c17225j, C17226m c17226m, SyncProfileData syncProfileData, AbTestUtility abTestUtility, MetaGateway metaGateway) {
        this.f50586a = biller;
        this.f50587b = offerRepository;
        this.f50588c = c14488a;
        this.f50589d = c10400d;
        this.f50590e = c15071e;
        this.f50591f = c14522a;
        this.f50592g = c15193i;
        this.f50593h = subscriptionProvider;
        this.f50594i = c3926a;
        this.f50595j = fastMatchConfigProvider;
        this.f50596k = c10771d;
        this.f50597l = c17225j;
        this.f50598m = c17226m;
        this.f50599n = syncProfileData;
        this.f50600o = abTestUtility;
        this.f50601p = metaGateway;
    }

    public Single<String> purchase(@NonNull Activity activity, @NonNull String str) {
        this.f50597l.m63114a(new C15345a("", Source.PURCHASE));
        return m61317a(activity, str, DateTime.a()).a(Schedulers.io()).h(new C17851a(this, str)).k(new C17852b(this, str)).b(C18636m.f58091a).h(new C17862x(this, str)).a(RxUtils.a()).o(new af(this, str)).b(new ag(this, str)).a(m61316a(str, null, Source.PURCHASE)).a(new ah(this)).k(new ai(str)).a();
    }

    /* renamed from: e */
    final /* synthetic */ Observable m61373e(@NonNull String str, BillingReceipt billingReceipt) {
        return m61336c(billingReceipt, str);
    }

    /* renamed from: d */
    final /* synthetic */ BillingReceipt m61372d(@NonNull String str, BillingReceipt billingReceipt) {
        return m61343d(str) ? m61347a(billingReceipt, str) : billingReceipt;
    }

    /* renamed from: a */
    static final /* synthetic */ void m61324a(BillingReceipt billingReceipt) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("purchase billing receipt = ");
        stringBuilder.append(billingReceipt);
        C0001a.b(stringBuilder.toString(), new Object[0]);
    }

    /* renamed from: c */
    final /* synthetic */ Observable m61370c(@NonNull String str, BillingReceipt billingReceipt) {
        return m61318a(str, billingReceipt, Source.PURCHASE).a(m61316a(str, billingReceipt.receipt(), Source.PURCHASE)).k(new ae(billingReceipt));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m61354a(@NonNull String str, Observable observable) {
        return m61322a(observable, str);
    }

    /* renamed from: b */
    final /* synthetic */ void m61368b(@NonNull String str, BillingReceipt billingReceipt) {
        this.f50598m.execute();
        m61327a(str, billingReceipt.receipt(), Source.PURCHASE, billingReceipt.purchaseToken());
    }

    /* renamed from: a */
    final /* synthetic */ void m61363a(Throwable th) {
        this.f50598m.execute();
        C0001a.c(th);
    }

    public Single<List<String>> restorePurchase(RestoreType restoreType) {
        this.f50597l.m63114a(new C15345a("", Source.RESTORE));
        if (restoreType == RestoreType.FROM_NETWORK) {
            restoreType = this.f50586a.observeNetworkPurchaseHistory();
        } else {
            restoreType = this.f50586a.observePurchaseHistory();
        }
        Observable r = restoreType.b(Schedulers.io()).h().h(new aj(this)).r();
        return Observable.c(m61321a(r, RestorePurchaseType.SUBSCRIPTION), m61321a(r, RestorePurchaseType.CONSUMABLE)).b(Schedulers.io()).a(m61341d()).b(new ak(this)).a(new C18631c(this)).k(C17853d.f55715a).v().a();
    }

    public void initialize() {
        if (!this.f50602q) {
            this.f50602q = true;
            this.f50591f.mo11892a();
            this.f50586a.connect();
        }
    }

    public void destroy() {
        this.f50586a.disconnect();
    }

    @Nullable
    /* renamed from: a */
    PurchaseTransaction m61348a(String str) {
        PurchaseTransaction purchaseTransaction = null;
        for (PurchaseTransaction purchaseTransaction2 : ((C14534d) this.f50586a.observePurchaseHistory().u().a()).m55533b()) {
            String a = purchaseTransaction2.m55481a();
            if (m61343d(a)) {
                if (!a.equals(str)) {
                    Date b = purchaseTransaction2.m55482b();
                    if (purchaseTransaction == null || b.compareTo(purchaseTransaction.m55482b()) > 0) {
                        purchaseTransaction = purchaseTransaction2;
                    }
                }
            }
        }
        return purchaseTransaction;
    }

    /* renamed from: a */
    BillingReceipt m61347a(BillingReceipt billingReceipt, String str) {
        if (!this.f50595j.get().isEnabled()) {
            return billingReceipt;
        }
        if (billingReceipt.previousReceipt() != null && !billingReceipt.previousReceipt().isEmpty()) {
            return billingReceipt;
        }
        str = m61348a(str);
        if (str != null && m61343d(str.m55481a())) {
            return BillingReceipt.from(billingReceipt, str.m55485e().receipt());
        }
        return billingReceipt;
    }

    /* renamed from: a */
    private void m61327a(@NonNull String str, @Nullable String str2, @NonNull Source source, @Nullable String str3) {
        C14510e offer = this.f50587b.getOffer(str);
        if (offer == null) {
            if (m61343d(str)) {
                m61344e();
            } else {
                this.f50586a.consumePurchase(str, str3).a(RxUtils.a().m67518a()).a(C18632e.f58081a, new C18633f(this, source, str, str2));
            }
            return;
        }
        if (C145361.f45939a[offer.mo11841c().ordinal()] == 1) {
            this.f50586a.consumePurchase(str, str3).a(RxUtils.a().m67518a()).a(C18634g.f58086a, new C18635h(this, source, str, str2));
        }
        m61325a(offer);
    }

    /* renamed from: c */
    final /* synthetic */ void m61371c(@NonNull Source source, @NonNull String str, @Nullable String str2, Throwable th) {
        this.f50591f.mo11893a(source, th, str, str2);
    }

    /* renamed from: b */
    final /* synthetic */ void m61366b(@NonNull Source source, @NonNull String str, @Nullable String str2, Throwable th) {
        this.f50591f.mo11893a(source, th, str, str2);
    }

    /* renamed from: a */
    private void m61325a(C14510e c14510e) {
        switch (C145361.f45940b[c14510e.mo11840b().ordinal()]) {
            case 1:
                m61335b(c14510e.mo11839a());
                return;
            case 2:
                m61333b();
                return;
            case 3:
                this.f50589d.j();
                return;
            case 4:
                m61339c(c14510e.mo11839a());
                return;
            default:
                return;
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    Observable<BillingReceipt> m61349a(@NonNull Activity activity, @NonNull String str) {
        C14510e offer = this.f50587b.getOffer(str);
        if (offer == null) {
            return Observable.a(new EmptyOfferException(str));
        }
        if (offer.mo11840b() == ProductType.PLUS && this.f50592g.m57121a()) {
            return Observable.a(new SubscriptionIsActiveException(str));
        }
        if (offer.mo11840b() == ProductType.GOLD && this.f50593h.get().isGold()) {
            return Observable.a(new SubscriptionIsActiveException(str));
        }
        if (this.f50595j.get().isEnabled()) {
            return m61358a(activity, str, offer).a();
        }
        return this.f50586a.purchase(activity, str, offer.mo11841c()).a();
    }

    /* renamed from: c */
    private boolean m61340c(Throwable th) {
        return (th instanceof EmptyPurchasesException) == null ? true : null;
    }

    /* renamed from: a */
    Single<BillingReceipt> m61358a(Activity activity, String str, C14510e c14510e) {
        Subscription subscription = this.f50593h.get();
        PurchaseTransaction a = m61348a("");
        Object obj = 1;
        Object obj2 = (a != null || subscription.isPlus() || subscription.isGold()) ? null : 1;
        if (a == null || a.m55483c() != State.SUBSCRIPTION_EXPIRED) {
            obj = null;
        }
        if (c14510e.mo11841c() != PurchaseType.CONSUMABLE && obj2 == null) {
            if (obj == null) {
                if (a != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("attemptToUpgrade latestTransaction = ");
                    stringBuilder.append(a);
                    C0001a.b(stringBuilder.toString(), new Object[0]);
                }
                String str2 = "";
                if (a != null && c14510e.mo11841c() == PurchaseType.SUBSCRIPTION && a.m55483c() == State.PURCHASED_SUCCESSFULLY) {
                    String a2 = a.m55481a();
                    if ((C14537a.m55535b(a2) || C14537a.m55534a(a2)) && !a2.equals(c14510e.mo11839a())) {
                        str2 = a2;
                    }
                }
                if (str2.isEmpty()) {
                    return this.f50586a.purchase(activity, str, c14510e.mo11841c());
                }
                return this.f50586a.upgrade(activity, str2, str);
            }
        }
        return this.f50586a.purchase(activity, str, c14510e.mo11841c());
    }

    /* renamed from: a */
    private Observable<PurchaseTransaction> m61321a(Observable<PurchaseTransaction> observable, RestorePurchaseType restorePurchaseType) {
        return observable.f(new C17854i(this, restorePurchaseType)).b(Schedulers.io()).d(new C17855j(this, restorePurchaseType));
    }

    /* renamed from: b */
    final /* synthetic */ Boolean m61365b(RestorePurchaseType restorePurchaseType, PurchaseTransaction purchaseTransaction) {
        return Boolean.valueOf(m61328a(purchaseTransaction, restorePurchaseType));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m61352a(RestorePurchaseType restorePurchaseType, PurchaseTransaction purchaseTransaction) {
        purchaseTransaction = m61318a(purchaseTransaction.m55481a(), purchaseTransaction.m55485e(), Source.RESTORE).k(new ad(purchaseTransaction));
        return restorePurchaseType == RestorePurchaseType.SUBSCRIPTION ? purchaseTransaction.h() : purchaseTransaction;
    }

    /* renamed from: a */
    private boolean m61328a(PurchaseTransaction purchaseTransaction, RestorePurchaseType restorePurchaseType) {
        purchaseTransaction = m61343d(purchaseTransaction.m55481a());
        return restorePurchaseType == RestorePurchaseType.CONSUMABLE ? purchaseTransaction ^ 1 : purchaseTransaction;
    }

    /* renamed from: c */
    private Observable<BillingReceipt> m61336c(BillingReceipt billingReceipt, String str) {
        if (billingReceipt != null) {
            return Observable.a(billingReceipt);
        }
        return Observable.a(new EmptyBillingReceiptException(str));
    }

    /* renamed from: a */
    private Observable<BillingReceipt> m61317a(Activity activity, String str, DateTime dateTime) {
        if (m61343d(str)) {
            return this.f50586a.getPastTransactions().a().h(new C17856k(this, dateTime, activity, str));
        }
        return m61349a(activity, str);
    }

    /* renamed from: a */
    final /* synthetic */ Observable m61356a(DateTime dateTime, Activity activity, String str, List list) {
        return m61320a(dateTime, list, activity, str);
    }

    /* renamed from: a */
    private Observable<BillingReceipt> m61320a(DateTime dateTime, List<PurchaseTransaction> list, Activity activity, String str) {
        for (PurchaseTransaction purchaseTransaction : list) {
            boolean isBefore = dateTime.isBefore(LocalDateTime.a(purchaseTransaction.m55482b()).c().a(24));
            if (!m61329a(str, purchaseTransaction) && isBefore) {
                return Observable.a(new TooRecentPurchaseException(str, purchaseTransaction.m55481a()));
            }
        }
        return m61349a(activity, str);
    }

    /* renamed from: a */
    private Observable<String> m61318a(@NonNull String str, @Nullable BillingReceipt billingReceipt, @NonNull Source source) {
        if (billingReceipt == null) {
            return Observable.a(new EmptyBillingReceiptException(str));
        }
        return this.f50588c.m55335a(str, billingReceipt).a().h(C17857l.f55724a).k(C17858n.f55725a).a(m61316a(str, billingReceipt.receipt(), source));
    }

    /* renamed from: a */
    private <T> Observable$Transformer<T, T> m61316a(@Nullable String str, @Nullable String str2, @NonNull Source source) {
        return new C18637o(this, source, str, str2);
    }

    /* renamed from: a */
    final /* synthetic */ Observable m61350a(@NonNull Source source, @Nullable String str, @Nullable String str2, Observable observable) {
        return observable.a(new ac(this, source, str, str2));
    }

    /* renamed from: a */
    final /* synthetic */ void m61360a(@NonNull Source source, @Nullable String str, @Nullable String str2, Throwable th) {
        this.f50591f.m55476a(source, m61315a(th, str, str2));
    }

    /* renamed from: b */
    private void m61333b() {
        if (this.f50600o.profileV2EnabledForRevenue()) {
            C15551e.m58076a(this.f50599n.execute(ProfileDataRequest.builder().with(SuperLikes.INSTANCE).build())).b(Schedulers.io()).b(RxUtils.b());
            return;
        }
        this.f50590e.m56821d();
    }

    /* renamed from: b */
    private void m61335b(String str) {
        if (!this.f50600o.profileV2EnabledForRevenue()) {
            this.f50592g.m57120a(str);
        }
        m61337c();
    }

    /* renamed from: c */
    private void m61339c(String str) {
        if (!this.f50600o.profileV2EnabledForRevenue()) {
            this.f50594i.a(str).d();
        }
        m61337c();
        this.f50596k.execute().b(Schedulers.io()).b(RxUtils.b());
    }

    /* renamed from: c */
    private void m61337c() {
        if (this.f50600o.profileV2EnabledForRevenue()) {
            C15551e.m58076a(this.f50599n.execute(ProfileDataRequest.builder().with(Purchase.INSTANCE).with(Likes.INSTANCE).with(SuperLikes.INSTANCE).with(PlusControl.INSTANCE).with(Products.INSTANCE).build())).b(Schedulers.io()).b(RxUtils.b());
        } else {
            this.f50590e.m56821d();
        }
        m61344e();
        this.f50589d.j();
    }

    /* renamed from: d */
    private boolean m61343d(String str) {
        C14510e offer = this.f50587b.getOffer(str);
        boolean z = true;
        if (offer == null) {
            if (!C14537a.m55535b(str)) {
                if (C14537a.m55534a(str) == null) {
                    z = false;
                }
            }
            return z;
        }
        if (offer.mo11841c() != PurchaseType.SUBSCRIPTION) {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    private boolean m61345e(String str) {
        if (m61343d(str)) {
            C14510e offer = this.f50587b.getOffer(str);
            Subscription subscription = this.f50593h.get();
            str = ((offer == null || offer.mo11840b() != ProductType.PLUS) && C14537a.m55534a(str) == null) ? null : true;
            if (subscription.isGold()) {
                return true;
            }
            if (!subscription.isPlus() || str == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m61329a(String str, PurchaseTransaction purchaseTransaction) {
        if (m61343d(str)) {
            if (m61343d(purchaseTransaction.m55481a())) {
                C14510e offer = this.f50587b.getOffer(str);
                C14510e offer2 = this.f50587b.getOffer(purchaseTransaction.m55481a());
                if (offer != null) {
                    str = offer.mo11840b();
                } else {
                    str = m61346f(str);
                }
                if (offer2 != null) {
                    purchaseTransaction = offer2.mo11840b();
                } else {
                    purchaseTransaction = m61346f(purchaseTransaction.m55481a());
                }
                boolean z = false;
                if (str != null) {
                    if (purchaseTransaction != null) {
                        if (str == ProductType.GOLD && purchaseTransaction == ProductType.PLUS) {
                            z = true;
                        }
                        return z;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: f */
    private ProductType m61346f(String str) {
        if (C14537a.m55534a(str)) {
            return ProductType.PLUS;
        }
        return C14537a.m55535b(str) != null ? ProductType.GOLD : null;
    }

    /* renamed from: a */
    private Throwable m61315a(Throwable th, @Nullable String str, @Nullable String str2) {
        return th instanceof HttpException ? new PurchaseHttpException((HttpException) th, str, str2) : th;
    }

    /* renamed from: d */
    private void m61342d(Throwable th) {
        this.f50598m.execute();
        C0001a.c(th);
        if (m61340c(th)) {
            this.f50591f.m55478a(th);
        }
    }

    /* renamed from: c */
    private void m61338c(PurchaseTransaction purchaseTransaction) {
        this.f50598m.execute();
        if (purchaseTransaction != null) {
            String receipt = purchaseTransaction.m55485e().receipt();
            m61327a(purchaseTransaction.m55481a(), receipt, Source.RESTORE, purchaseTransaction.m55485e().purchaseToken());
        }
    }

    /* renamed from: b */
    private Observable<PurchaseTransaction> m61331b(C14534d c14534d) {
        List list = (List) StreamSupport.m59708a(c14534d.m55533b()).filter(new C16239p(this)).sorted(C14538q.f45944a).collect(Collectors.m59434a());
        if (list.isEmpty()) {
            return Observable.a(new EmptyPurchasesException());
        }
        return Observable.a(list);
    }

    /* renamed from: a */
    final /* synthetic */ boolean m61364a(PurchaseTransaction purchaseTransaction) {
        return m61345e(purchaseTransaction.m55481a()) ^ 1;
    }

    /* renamed from: a */
    static final /* synthetic */ int m61311a(PurchaseTransaction purchaseTransaction, PurchaseTransaction purchaseTransaction2) {
        return purchaseTransaction.m55482b().after(purchaseTransaction2.m55482b()) != null ? -1 : 1;
    }

    /* renamed from: d */
    private Observable$Transformer<PurchaseTransaction, PurchaseTransaction> m61341d() {
        return new C18638r(this);
    }

    /* renamed from: a */
    final /* synthetic */ Observable m61357a(Observable observable) {
        return observable.j().v().h(new ab(this));
    }

    /* renamed from: b */
    private Observable<PurchaseTransaction> m61332b(List<Notification<PurchaseTransaction>> list) {
        Iterable arrayList = new ArrayList();
        for (Notification notification : list) {
            if (notification.i()) {
                arrayList.add(notification.c());
            }
        }
        if (arrayList.isEmpty()) {
            return Observable.a(((Notification) list.get(0)).b());
        }
        return Observable.a(arrayList);
    }

    /* renamed from: a */
    private Observable<Boolean> m61322a(Observable<? extends Throwable> observable, String str) {
        return observable.h(new C17859s(this, str));
    }

    /* renamed from: a */
    final /* synthetic */ Observable m61353a(String str, Throwable th) {
        if ((th instanceof ItemAlreadyOwnedException) && !m61343d(str)) {
            BillingReceipt billingReceipt = (BillingReceipt) this.f50586a.observePurchaseHistory().k(new C17860v(str)).u().a(null);
            if (!(billingReceipt == null || billingReceipt.purchaseToken() == null)) {
                return this.f50588c.m55335a(str, billingReceipt).a().j(new C17861w(this, str, billingReceipt)).b(new C18641y(this, str)).h(new C17863z(th)).a(new aa(this, str, billingReceipt));
            }
        }
        return Observable.a(th);
    }

    /* renamed from: a */
    final /* synthetic */ Single m61359a(String str, BillingReceipt billingReceipt, List list) {
        return this.f50586a.consumePurchase(str, billingReceipt.purchaseToken());
    }

    /* renamed from: a */
    final /* synthetic */ void m61362a(String str, Boolean bool) {
        if (bool.booleanValue() != null) {
            C14510e offer = this.f50587b.getOffer(str);
            if (offer != null) {
                m61325a(offer);
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Observable m61319a(Throwable th, Boolean bool) {
        if (bool.booleanValue() == null) {
            return Observable.a(th);
        }
        return Observable.a(Boolean.valueOf(true));
    }

    /* renamed from: a */
    final /* synthetic */ void m61361a(String str, BillingReceipt billingReceipt, Throwable th) {
        this.f50591f.mo11893a(Source.PURCHASE, th, str, billingReceipt.receipt());
    }

    /* renamed from: e */
    private void m61344e() {
        this.f50601p.fetchMeta().b(Schedulers.io()).a(C18639t.f58097a, C18640u.f58098a);
    }
}
