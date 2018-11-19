package com.tinder.purchase.usecase;

import com.tinder.api.TinderApi;
import com.tinder.api.model.purchase.PurchaseDiscountEligibility;
import com.tinder.api.model.purchase.PurchasedSkuInfo;
import com.tinder.api.model.purchase.PurchasedSkus;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.domain.common.reactivex.usecase.SingleResultUseCase;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.model.C14534d;
import com.tinder.purchase.model.PurchaseTransaction;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.C15756a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C15807n;
import kotlin.collections.C19291t;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/purchase/usecase/CheckPurchaseDiscountEligibility;", "Lcom/tinder/domain/common/reactivex/usecase/SingleResultUseCase;", "", "tinderApi", "Lcom/tinder/api/TinderApi;", "biller", "Lcom/tinder/purchase/billing/Biller;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/purchase/billing/Biller;)V", "convertPurchaseHistoryToRequest", "Lcom/tinder/api/model/purchase/PurchasedSkus;", "purchaseHistory", "Lcom/tinder/purchase/model/PurchaseHistory;", "execute", "Lio/reactivex/Single;", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.usecase.a */
public final class C16242a implements SingleResultUseCase<Boolean> {
    /* renamed from: a */
    private final TinderApi f50606a;
    /* renamed from: b */
    private final Biller f50607b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/purchase/model/PurchaseHistory;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.a$a */
    static final class C16241a<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C16242a f50605a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/api/response/v2/DataResponse;", "Lcom/tinder/api/model/purchase/PurchaseDiscountEligibility;", "kotlin.jvm.PlatformType", "apply", "(Lcom/tinder/api/response/v2/DataResponse;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.purchase.usecase.a$a$1 */
        static final class C162401<T, R> implements Function<T, R> {
            /* renamed from: a */
            public static final C162401 f50604a = new C162401();

            C162401() {
            }

            public /* synthetic */ Object apply(Object obj) {
                return m61374a((DataResponse) obj);
            }

            @Nullable
            /* renamed from: a */
            public final Boolean m61374a(@NotNull DataResponse<PurchaseDiscountEligibility> dataResponse) {
                C2668g.b(dataResponse, "it");
                PurchaseDiscountEligibility purchaseDiscountEligibility = (PurchaseDiscountEligibility) dataResponse.data();
                return purchaseDiscountEligibility != null ? purchaseDiscountEligibility.isEligible() : null;
            }
        }

        C16241a(C16242a c16242a) {
            this.f50605a = c16242a;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m61375a((C14534d) obj);
        }

        /* renamed from: a */
        public final C3960g<Boolean> m61375a(@NotNull C14534d c14534d) {
            C2668g.b(c14534d, "it");
            c14534d = this.f50605a.m61377a(c14534d);
            if (c14534d.getSkuInfoList().isEmpty()) {
                return C3960g.a(Boolean.valueOf(true));
            }
            return this.f50605a.f50606a.checkPurchaseDiscountEligibility(c14534d).b(C15756a.m59010b()).e(C162401.f50604a);
        }
    }

    @Inject
    public C16242a(@NotNull TinderApi tinderApi, @NotNull Biller biller) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(biller, "biller");
        this.f50606a = tinderApi;
        this.f50607b = biller;
    }

    @NotNull
    public C3960g<Boolean> execute() {
        C3960g<Boolean> d = RxJavaInteropExtKt.toV2Observable(this.f50607b.observeNetworkPurchaseHistory()).firstElement().d(new C16241a(this));
        C2668g.a(d, "biller\n            .obse…sEligible }\n            }");
        return d;
    }

    /* renamed from: a */
    private final PurchasedSkus m61377a(C14534d c14534d) {
        c14534d = c14534d.m55533b();
        C2668g.a(c14534d, "purchaseHistory.allTransactions");
        Collection arrayList = new ArrayList();
        for (PurchaseTransaction purchaseTransaction : (Iterable) c14534d) {
            C2668g.a(purchaseTransaction, "it");
            String a = purchaseTransaction.m55481a();
            C2668g.a(a, "it.productId");
            String d = purchaseTransaction.m55484d();
            C2668g.a(d, "it.purchaseToken");
            C19291t.m68635a(arrayList, (Iterable) C15807n.m59826a(new PurchasedSkuInfo(a, d)));
        }
        return new PurchasedSkus((List) arrayList);
    }
}
