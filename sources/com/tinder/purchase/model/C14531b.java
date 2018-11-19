package com.tinder.purchase.model;

import com.android.billingclient.api.C0889d;
import com.tinder.api.model.purchase.BillingReceipt;
import com.tinder.purchase.model.PurchaseTransaction.State;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/purchase/model/GoogleBillerTransactionAdapter;", "", "()V", "purchaseInfoAdapter", "Lcom/tinder/purchase/model/PurchaseInfoAdapter;", "create", "Lcom/tinder/purchase/model/PurchaseTransaction;", "purchase", "Lcom/android/billingclient/api/Purchase;", "billingReceipt", "Lcom/tinder/api/model/purchase/BillingReceipt;", "getStateFrom", "Lcom/tinder/purchase/model/PurchaseTransaction$State;", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.model.b */
public final class C14531b {
    /* renamed from: a */
    private final C16237e f45934a = new C16237e();

    @NotNull
    /* renamed from: a */
    public final PurchaseTransaction m55526a(@NotNull C0889d c0889d, @NotNull BillingReceipt billingReceipt) {
        C2668g.b(c0889d, "purchase");
        C2668g.b(billingReceipt, "billingReceipt");
        return new PurchaseTransaction(c0889d.a(), new Date(c0889d.b()), m55525a(c0889d), c0889d.c(), billingReceipt);
    }

    /* renamed from: a */
    private final State m55525a(C0889d c0889d) {
        PurchaseInfo purchaseInfo = (PurchaseInfo) this.f45934a.fromJson(c0889d.d());
        c0889d = State.fromPurchaseState(purchaseInfo != null ? purchaseInfo.m55480a() : C14532c.f45935a.purchaseState);
        C2668g.a(c0889d, "PurchaseTransaction.Stat…chaseState(purchaseState)");
        return c0889d;
    }
}
