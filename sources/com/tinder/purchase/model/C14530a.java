package com.tinder.purchase.model;

import com.android.billingclient.api.C0889d;
import com.android.billingclient.api.C0889d.C0888a;
import com.android.billingclient.api.C0891e;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.purchase.BillingReceipt;
import com.tinder.purchase.domain.model.C14514j;
import com.tinder.purchase.domain.model.C14516k;
import com.tinder.purchase.domain.model.C14516k.C14515a;
import com.tinder.purchase.model.C14534d.C14533a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fJ\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/purchase/model/GoogleBillerAdapter;", "", "transactionAdapter", "Lcom/tinder/purchase/model/GoogleBillerTransactionAdapter;", "(Lcom/tinder/purchase/model/GoogleBillerTransactionAdapter;)V", "buildReceipt", "Lcom/tinder/api/model/purchase/BillingReceipt;", "purchase", "Lcom/android/billingclient/api/Purchase;", "createPriceListing", "Lcom/tinder/purchase/domain/model/PriceListing;", "detailsList", "", "Lcom/android/billingclient/api/SkuDetails;", "createPurchaseHistory", "Lcom/tinder/purchase/model/PurchaseHistory;", "purchasesResults", "Lcom/android/billingclient/api/Purchase$PurchasesResult;", "createPurchaseTransactionList", "Lcom/tinder/purchase/model/PurchaseTransaction;", "purchases", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.model.a */
public final class C14530a {
    /* renamed from: a */
    private final C14531b f45933a;

    public C14530a(@NotNull C14531b c14531b) {
        C2668g.b(c14531b, "transactionAdapter");
        this.f45933a = c14531b;
    }

    @NotNull
    /* renamed from: a */
    public final C14516k m55522a(@NotNull List<? extends C0891e> list) {
        C2668g.b(list, "detailsList");
        C14515a c14515a = new C14515a();
        for (C0891e c0891e : list) {
            c14515a.m55434a(c0891e.a(), C14514j.m55431a(c0891e.c(), Double.valueOf(((double) c0891e.b()) / 1000000.0d)));
        }
        list = c14515a.m55435a();
        C2668g.a(list, "builder.build()");
        return list;
    }

    @NotNull
    /* renamed from: b */
    public final List<PurchaseTransaction> m55523b(@NotNull List<? extends C0889d> list) {
        C2668g.b(list, ManagerWebServices.PARAM_PURCHASES);
        Iterable<C0889d> iterable = list;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (C0889d c0889d : iterable) {
            arrayList.add(this.f45933a.m55526a(c0889d, m55521a(c0889d)));
        }
        return (List) arrayList;
    }

    @NotNull
    /* renamed from: c */
    public final C14534d m55524c(@NotNull List<? extends C0888a> list) {
        C2668g.b(list, "purchasesResults");
        C14533a c14533a = new C14533a();
        for (C0888a b : list) {
            List<C0889d> b2 = b.b();
            C2668g.a(b2, "result.purchasesList");
            for (C0889d c0889d : b2) {
                C14531b c14531b = this.f45933a;
                C2668g.a(c0889d, "purchase");
                c14533a.m55528a(c0889d.a(), c14531b.m55526a(c0889d, m55521a(c0889d)));
            }
        }
        list = c14533a.m55529a();
        C2668g.a(list, "builder.build()");
        return list;
    }

    /* renamed from: a */
    private final BillingReceipt m55521a(C0889d c0889d) {
        c0889d = BillingReceipt.builder().signature(c0889d.e()).receipt(c0889d.d()).purchaseToken(c0889d.c()).build();
        C2668g.a(c0889d, "BillingReceipt.builder()…\n                .build()");
        return c0889d;
    }
}
