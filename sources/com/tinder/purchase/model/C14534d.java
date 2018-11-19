package com.tinder.purchase.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.purchase.BillingReceipt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tinder.purchase.model.d */
public class C14534d {
    /* renamed from: a */
    private final Map<String, PurchaseTransaction> f45937a = new HashMap();

    /* renamed from: com.tinder.purchase.model.d$a */
    public static class C14533a {
        /* renamed from: a */
        private final C14534d f45936a = new C14534d();

        /* renamed from: a */
        public C14533a m55528a(@NonNull String str, @Nullable PurchaseTransaction purchaseTransaction) {
            if (purchaseTransaction != null) {
                this.f45936a.f45937a.put(str, purchaseTransaction);
            }
            return this;
        }

        /* renamed from: a */
        public C14534d m55529a() {
            return this.f45936a;
        }
    }

    @NonNull
    /* renamed from: a */
    public List<String> m55532a() {
        return new ArrayList(this.f45937a.keySet());
    }

    @Nullable
    /* renamed from: a */
    public BillingReceipt m55531a(String str) {
        return this.f45937a.containsKey(str) ? ((PurchaseTransaction) this.f45937a.get(str)).m55485e() : null;
    }

    @NonNull
    /* renamed from: b */
    public List<PurchaseTransaction> m55533b() {
        return new ArrayList(this.f45937a.values());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PurchaseHistory{transactionMap=");
        stringBuilder.append(this.f45937a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
