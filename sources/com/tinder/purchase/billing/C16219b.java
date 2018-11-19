package com.tinder.purchase.billing;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.C0889d;
import com.android.billingclient.api.C0889d.C0888a;
import com.android.billingclient.api.C0891e;
import com.android.billingclient.api.C0894f;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.purchase.BillingReceipt;
import com.tinder.domain.profile.model.PurchaseType;
import com.tinder.purchase.domain.exception.GooglePurchaseBillingException;
import com.tinder.purchase.domain.exception.GooglePurchaseBillingException.C14492a;
import com.tinder.purchase.domain.exception.OfferException.CannotGetPriceFromSkuException;
import com.tinder.purchase.domain.model.C14516k;
import com.tinder.purchase.model.C14530a;
import com.tinder.purchase.model.C14534d;
import com.tinder.purchase.model.C14534d.C14533a;
import com.tinder.purchase.model.PurchaseTransaction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Single;
import rx.SingleEmitter;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0018H\u0016J\u0014\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\u001dH\u0016J\b\u0010(\u001a\u00020\u0013H\u0016J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0&H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016J \u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u001a2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020#\u0018\u000103H\u0016J&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u00104\u001a\u0002052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00106\u001a\u000207H\u0016J,\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090&0\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001f0&2\b\b\u0001\u0010:\u001a\u00020\u001fH\u0002J&\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u00104\u001a\u0002052\u0006\u0010<\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\"\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0&0\u001d*\u00020\r2\b\b\u0001\u0010>\u001a\u00020\u001fH\u0002J\u0016\u0010?\u001a\u00020\u0014*\u00020\r2\b\b\u0001\u0010:\u001a\u00020\u001fH\u0002J \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090&0\u001d*\u00020\r2\u0006\u0010A\u001a\u00020BH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006C"}, d2 = {"Lcom/tinder/purchase/billing/GoogleBiller;", "Lcom/tinder/purchase/billing/Biller;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "context", "Landroid/content/Context;", "adapter", "Lcom/tinder/purchase/model/GoogleBillerAdapter;", "billingFlowParamsFactory", "Lcom/tinder/purchase/billing/BillingFlowParamsFactory;", "(Landroid/content/Context;Lcom/tinder/purchase/model/GoogleBillerAdapter;Lcom/tinder/purchase/billing/BillingFlowParamsFactory;)V", "billerConnectSubscription", "Lrx/Subscription;", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "kotlin.jvm.PlatformType", "purchaseUpdateSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/api/model/purchase/BillingReceipt;", "hasError", "", "Lcom/android/billingclient/api/Purchase$PurchasesResult;", "getHasError", "(Lcom/android/billingclient/api/Purchase$PurchasesResult;)Z", "attemptToConnectToPlayServices", "", "runCount", "", "connect", "consumePurchase", "Lrx/Single;", "productId", "", "purchaseToken", "convertPurchaseToReceipt", "purchase", "Lcom/android/billingclient/api/Purchase;", "disconnect", "getPastTransactions", "", "Lcom/tinder/purchase/model/PurchaseTransaction;", "isConnected", "loadPriceListing", "Lcom/tinder/purchase/domain/model/PriceListing;", "productIds", "observeNetworkPurchaseHistory", "Lrx/Observable;", "Lcom/tinder/purchase/model/PurchaseHistory;", "observePurchaseHistory", "onPurchasesUpdated", "responseCode", "purchases", "", "activity", "Landroid/app/Activity;", "purchaseType", "Lcom/tinder/domain/profile/model/PurchaseType;", "querySkuDetailsForType", "Lcom/android/billingclient/api/SkuDetails;", "type", "upgrade", "ownedProductId", "queryPurchaseHistory", "skuType", "queryPurchasesOrFail", "querySkuDetails", "params", "Lcom/android/billingclient/api/SkuDetailsParams;", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.billing.b */
public final class C16219b implements PurchasesUpdatedListener, Biller {
    /* renamed from: a */
    private Subscription f50456a;
    /* renamed from: b */
    private PublishSubject<BillingReceipt> f50457b;
    /* renamed from: c */
    private final BillingClient f50458c;
    /* renamed from: d */
    private final C14530a f50459d;
    /* renamed from: e */
    private final C14484a f50460e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/purchase/model/PurchaseHistory;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.billing.b$f */
    static final class C14485f<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C16219b f45869a;

        C14485f(C16219b c16219b) {
            this.f45869a = c16219b;
        }

        public /* synthetic */ Object call() {
            return m55332a();
        }

        @NotNull
        /* renamed from: a */
        public final C14534d m55332a() {
            Iterable<String> b = C17554o.m64199b((Object[]) new String[]{"inapp", "subs"});
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) b, 10));
            for (String str : b) {
                C16219b c16219b = this.f45869a;
                BillingClient a = this.f45869a.f50458c;
                C2668g.a(a, "billingClient");
                arrayList.add(c16219b.m61173b(a, str));
            }
            return this.f45869a.f50459d.m55524c((List) arrayList);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.billing.b$g */
    static final class C14486g<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C16219b f45870a;
        /* renamed from: b */
        final /* synthetic */ PurchaseType f45871b;
        /* renamed from: c */
        final /* synthetic */ Activity f45872c;
        /* renamed from: d */
        final /* synthetic */ String f45873d;

        C14486g(C16219b c16219b, PurchaseType purchaseType, Activity activity, String str) {
            this.f45870a = c16219b;
            this.f45871b = purchaseType;
            this.f45872c = activity;
            this.f45873d = str;
        }

        public /* synthetic */ Object call() {
            return m55333a();
        }

        @NotNull
        /* renamed from: a */
        public final Pair<Integer, String> m55333a() {
            String str;
            switch (C14487c.f45874a[this.f45871b.ordinal()]) {
                case 1:
                    str = "inapp";
                    break;
                case 2:
                    str = "subs";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return C15811g.m59834a(Integer.valueOf(this.f45870a.f50458c.a(this.f45872c, this.f45870a.f50460e.m55330a(this.f45873d, str))), str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/purchase/model/PurchaseTransaction;", "it", "Lcom/android/billingclient/api/Purchase;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.billing.b$c */
    static final class C17805c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16219b f55530a;

        C17805c(C16219b c16219b) {
            this.f55530a = c16219b;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65013a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<PurchaseTransaction> m65013a(List<? extends C0889d> list) {
            C14530a d = this.f55530a.f50459d;
            C2668g.a(list, "it");
            return d.m55523b(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/purchase/domain/model/PriceListing;", "inApp", "", "Lcom/android/billingclient/api/SkuDetails;", "kotlin.jvm.PlatformType", "subs", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.billing.b$d */
    static final class C17806d<T1, T2, R> implements Func2<T1, T2, R> {
        /* renamed from: a */
        final /* synthetic */ C16219b f55531a;

        C17806d(C16219b c16219b) {
            this.f55531a = c16219b;
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            return m65014a((List) obj, (List) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final C14516k m65014a(List<? extends C0891e> list, List<? extends C0891e> list2) {
            C14530a d = this.f55531a.f50459d;
            C2668g.a(list, "inApp");
            Collection collection = list;
            C2668g.a(list2, "subs");
            return d.m55522a(C19299w.m68809b(collection, (Iterable) list2));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/purchase/model/PurchaseHistory;", "kotlin.jvm.PlatformType", "transactions", "", "Lcom/tinder/purchase/model/PurchaseTransaction;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.billing.b$e */
    static final class C17807e<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16219b f55532a;

        C17807e(C16219b c16219b) {
            this.f55532a = c16219b;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65015a((List) obj);
        }

        /* renamed from: a */
        public final C14534d m65015a(List<? extends PurchaseTransaction> list) {
            C14533a c14533a = new C14533a();
            C2668g.a(list, "transactions");
            for (PurchaseTransaction purchaseTransaction : list) {
                c14533a.m55528a(purchaseTransaction.m55481a(), purchaseTransaction);
            }
            list = this.f55532a.observePurchaseHistory().u().a();
            C2668g.a(list, "observePurchaseHistory().toBlocking().first()");
            list = ((C14534d) list).m55533b();
            C2668g.a(list, "observePurchaseHistory()…).first().allTransactions");
            for (PurchaseTransaction purchaseTransaction2 : list) {
                C2668g.a(purchaseTransaction2, "it");
                c14533a.m55528a(purchaseTransaction2.m55481a(), purchaseTransaction2);
            }
            return c14533a.m55529a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 \u0003*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/api/model/purchase/BillingReceipt;", "kotlin.jvm.PlatformType", "it", "Lkotlin/Pair;", "", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.billing.b$h */
    static final class C17808h<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C16219b f55533a;
        /* renamed from: b */
        final /* synthetic */ String f55534b;

        C17808h(C16219b c16219b, String str) {
            this.f55533a = c16219b;
            this.f55534b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65016a((Pair) obj);
        }

        /* renamed from: a */
        public final Single<BillingReceipt> m65016a(Pair<Integer, String> pair) {
            if (((Number) pair.m59803a()).intValue() != 0) {
                return Single.a(GooglePurchaseBillingException.f50461a.m55341a(((Number) pair.m59803a()).intValue(), (String) pair.m59804b(), this.f55534b));
            }
            C16219b c16219b = this.f55533a;
            PublishSubject w = PublishSubject.w();
            C2668g.a(w, "PublishSubject.create()");
            c16219b.f50457b = w;
            return this.f55533a.f50457b.e().c(1).a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/api/model/purchase/BillingReceipt;", "kotlin.jvm.PlatformType", "it", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.billing.b$k */
    static final class C17809k<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ BillingReceipt f55535a;

        C17809k(BillingReceipt billingReceipt) {
            this.f55535a = billingReceipt;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65017a((BillingReceipt) obj);
        }

        /* renamed from: a */
        public final BillingReceipt m65017a(BillingReceipt billingReceipt) {
            return this.f55535a != null ? BillingReceipt.from(billingReceipt, this.f55535a.receipt()) : billingReceipt;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.billing.b$a */
    static final class C18618a<T> implements Action1<Long> {
        /* renamed from: a */
        final /* synthetic */ C16219b f58049a;
        /* renamed from: b */
        final /* synthetic */ int f58050b;

        C18618a(C16219b c16219b, int i) {
            this.f58049a = c16219b;
            this.f58050b = i;
        }

        public /* synthetic */ void call(Object obj) {
            m67070a((Long) obj);
        }

        /* renamed from: a */
        public final void m67070a(Long l) {
            this.f58049a.f50458c.a(new BillingClientStateListener() {
                public void onBillingServiceDisconnected() {
                    Subscription e = this.f58049a.f50456a;
                    if (e != null) {
                        e.unsubscribe();
                    }
                }

                public void onBillingSetupFinished(int i) {
                    Subscription e = this.f58049a.f50456a;
                    if (e != null) {
                        e.unsubscribe();
                    }
                    if (i != 0) {
                        this.f58049a.m61168a(this.f58050b + 1);
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "producer", "Lrx/SingleEmitter;", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.billing.b$b */
    static final class C18619b<T> implements Action1<SingleEmitter<T>> {
        /* renamed from: a */
        final /* synthetic */ C16219b f58051a;
        /* renamed from: b */
        final /* synthetic */ String f58052b;
        /* renamed from: c */
        final /* synthetic */ String f58053c;

        C18619b(C16219b c16219b, String str, String str2) {
            this.f58051a = c16219b;
            this.f58052b = str;
            this.f58053c = str2;
        }

        public /* synthetic */ void call(Object obj) {
            m67071a((SingleEmitter) obj);
        }

        /* renamed from: a */
        public final void m67071a(final SingleEmitter<Boolean> singleEmitter) {
            this.f58051a.f50458c.a(this.f58052b, new ConsumeResponseListener() {
                public final void onConsumeResponse(int i, String str) {
                    if (i == 0) {
                        singleEmitter.onSuccess(Boolean.valueOf(true));
                        return;
                    }
                    singleEmitter.onError(C14492a.m55340a(GooglePurchaseBillingException.f50461a, i, null, this.f58053c, 2, null));
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "producer", "Lrx/SingleEmitter;", "", "Lcom/android/billingclient/api/Purchase;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.billing.b$i */
    static final class C18620i<T> implements Action1<SingleEmitter<T>> {
        /* renamed from: a */
        final /* synthetic */ BillingClient f58054a;
        /* renamed from: b */
        final /* synthetic */ String f58055b;

        C18620i(BillingClient billingClient, String str) {
            this.f58054a = billingClient;
            this.f58055b = str;
        }

        public /* synthetic */ void call(Object obj) {
            m67072a((SingleEmitter) obj);
        }

        /* renamed from: a */
        public final void m67072a(final SingleEmitter<List<C0889d>> singleEmitter) {
            this.f58054a.a(this.f58055b, new PurchaseHistoryResponseListener() {
                public final void onPurchaseHistoryResponse(int i, List<C0889d> list) {
                    if (i == 0) {
                        singleEmitter.onSuccess(list);
                        return;
                    }
                    singleEmitter.onError(C14492a.m55340a(GooglePurchaseBillingException.f50461a, i, this.f58055b, null, 4, null));
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "producer", "Lrx/SingleEmitter;", "", "Lcom/android/billingclient/api/SkuDetails;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.billing.b$j */
    static final class C18621j<T> implements Action1<SingleEmitter<T>> {
        /* renamed from: a */
        final /* synthetic */ BillingClient f58056a;
        /* renamed from: b */
        final /* synthetic */ C0894f f58057b;

        C18621j(BillingClient billingClient, C0894f c0894f) {
            this.f58056a = billingClient;
            this.f58057b = c0894f;
        }

        public /* synthetic */ void call(Object obj) {
            m67073a((SingleEmitter) obj);
        }

        /* renamed from: a */
        public final void m67073a(final SingleEmitter<List<C0891e>> singleEmitter) {
            this.f58056a.a(this.f58057b, new SkuDetailsResponseListener() {
                public final void onSkuDetailsResponse(int i, List<C0891e> list) {
                    if (i == 0) {
                        singleEmitter.onSuccess(list);
                        return;
                    }
                    i = singleEmitter;
                    List b = this.f58057b.b();
                    C2668g.a(b, "params.skusList");
                    i.onError((Throwable) new CannotGetPriceFromSkuException(b));
                }
            });
        }
    }

    public C16219b(@NotNull Context context, @NotNull C14530a c14530a, @NotNull C14484a c14484a) {
        C2668g.b(context, "context");
        C2668g.b(c14530a, "adapter");
        C2668g.b(c14484a, "billingFlowParamsFactory");
        this.f50459d = c14530a;
        this.f50460e = c14484a;
        c14530a = PublishSubject.w();
        C2668g.a(c14530a, "PublishSubject.create()");
        this.f50457b = c14530a;
        this.f50458c = BillingClient.a(context).a(this).a();
    }

    @NotNull
    public Single<BillingReceipt> purchase(@NotNull Activity activity, @NotNull String str, @NotNull PurchaseType purchaseType) {
        C2668g.b(activity, "activity");
        C2668g.b(str, "productId");
        C2668g.b(purchaseType, "purchaseType");
        activity = Single.a(new C14486g(this, purchaseType, activity, str)).a((Func1) new C17808h(this, str));
        C2668g.a(activity, "Single.fromCallable {\n  …e(1).toSingle()\n        }");
        return activity;
    }

    @NotNull
    public Single<BillingReceipt> upgrade(@NotNull Activity activity, @NotNull String str, @NotNull String str2) {
        C2668g.b(activity, "activity");
        C2668g.b(str, "ownedProductId");
        C2668g.b(str2, "productId");
        int a = this.f50458c.a(activity, this.f50460e.m55331a(str2, C17554o.m64201d(str)));
        if (a != 0) {
            activity = Single.a(C14492a.m55340a(GooglePurchaseBillingException.f50461a, a, null, str2, 2, null));
            C2668g.a(activity, "Single.error(GooglePurch…, productId = productId))");
            return activity;
        }
        activity = ((C14534d) observePurchaseHistory().u().a()).m55531a(str);
        str = PublishSubject.w();
        C2668g.a(str, "PublishSubject.create()");
        this.f50457b = str;
        activity = this.f50457b.e().c(1).k((Func1) new C17809k(activity)).a();
        C2668g.a(activity, "purchaseUpdateSubject.as…              .toSingle()");
        return activity;
    }

    @NotNull
    public Single<Boolean> consumePurchase(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "productId");
        C2668g.b(str2, "purchaseToken");
        str = Single.a(new C18619b(this, str2, str));
        C2668g.a(str, "Single.fromEmitter<Boole…\n            })\n        }");
        return str;
    }

    @NotNull
    public Observable<C14534d> observePurchaseHistory() {
        Observable<C14534d> a = Observable.a(new C14485f(this));
        C2668g.a(a, "Observable.fromCallable …istory(results)\n        }");
        return a;
    }

    @NotNull
    public Observable<C14534d> observeNetworkPurchaseHistory() {
        Observable<C14534d> k = getPastTransactions().a().k(new C17807e(this));
        C2668g.a(k, "getPastTransactions().to…build()\n                }");
        return k;
    }

    @NotNull
    public Single<List<PurchaseTransaction>> getPastTransactions() {
        BillingClient billingClient = this.f50458c;
        C2668g.a(billingClient, "billingClient");
        Single<List<PurchaseTransaction>> d = m61166a(billingClient, "subs").d(new C17805c(this));
        C2668g.a(d, "billingClient.queryPurch…haseTransactionList(it) }");
        return d;
    }

    @NotNull
    public Single<C14516k> loadPriceListing(@NotNull List<String> list) {
        C2668g.b(list, "productIds");
        list = Single.a(m61167a((List) list, "inapp"), m61167a((List) list, "subs"), new C17806d(this));
        C2668g.a(list, "Single.zip(\n            …inApp + subs) }\n        )");
        return list;
    }

    public void connect() {
        C16219b.m61170a(this, 0, 1, null);
    }

    public boolean isConnected() {
        BillingClient billingClient = this.f50458c;
        C2668g.a(billingClient, "billingClient");
        return billingClient.a();
    }

    public void disconnect() {
        this.f50458c.b();
    }

    public void onPurchasesUpdated(int i, @Nullable List<C0889d> list) {
        if (i == 0 && list != null && (list.isEmpty() ^ 1) == 1) {
            this.f50457b.onNext(m61164a((C0889d) C19299w.m68829f((List) list)));
            return;
        }
        String str = null;
        list = list != null ? (C0889d) C19299w.m68831g((List) list) : null;
        PublishSubject publishSubject = this.f50457b;
        C14492a c14492a = GooglePurchaseBillingException.f50461a;
        if (list != null) {
            str = list.a();
        }
        publishSubject.onError(C14492a.m55340a(c14492a, i, null, str, 2, null));
    }

    /* renamed from: a */
    private final BillingReceipt m61164a(C0889d c0889d) {
        c0889d = BillingReceipt.builder().signature(c0889d.e()).receipt(c0889d.d()).purchaseToken(c0889d.c()).build();
        C2668g.a(c0889d, "BillingReceipt.builder()…                 .build()");
        return c0889d;
    }

    /* renamed from: a */
    static /* synthetic */ void m61170a(C16219b c16219b, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        c16219b.m61168a(i);
    }

    /* renamed from: a */
    private final void m61168a(int i) {
        if (i <= 10) {
            if (this.f50456a != null) {
                Subscription subscription = this.f50456a;
                if (!(subscription == null || subscription.isUnsubscribed())) {
                }
            }
            this.f50456a = Observable.b((long) Math.pow(2.0d, (double) i), TimeUnit.SECONDS).b(Schedulers.io()).d(new C18618a(this, i));
        }
    }

    /* renamed from: a */
    private final Single<List<C0891e>> m61167a(List<String> list, String str) {
        C0894f a = C0894f.c().a(C19299w.m68840l(list)).a(str).a();
        BillingClient billingClient = this.f50458c;
        C2668g.a(billingClient, "billingClient");
        C2668g.a(a, "params");
        return m61165a(billingClient, a);
    }

    /* renamed from: a */
    private final Single<List<C0889d>> m61166a(@NotNull BillingClient billingClient, String str) {
        billingClient = Single.a(new C18620i(billingClient, str));
        C2668g.a(billingClient, "Single.fromEmitter { pro…}\n            }\n        }");
        return billingClient;
    }

    /* renamed from: a */
    private final Single<List<C0891e>> m61165a(@NotNull BillingClient billingClient, C0894f c0894f) {
        billingClient = Single.a(new C18621j(billingClient, c0894f));
        C2668g.a(billingClient, "Single.fromEmitter { pro…}\n            }\n        }");
        return billingClient;
    }

    /* renamed from: b */
    private final C0888a m61173b(@NotNull BillingClient billingClient, String str) {
        C0888a a = billingClient.a(str);
        C2668g.a(a, ManagerWebServices.PARAM_PURCHASES);
        if (!m61172a(a)) {
            return a;
        }
        throw C14492a.m55340a(GooglePurchaseBillingException.f50461a, a.a(), str, null, 4, null);
    }

    /* renamed from: a */
    private final boolean m61172a(@NotNull C0888a c0888a) {
        return c0888a.a() != null ? true : null;
    }
}
