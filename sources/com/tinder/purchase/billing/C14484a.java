package com.tinder.purchase.billing;

import com.android.billingclient.api.C0883b;
import com.android.billingclient.api.C0883b.C0882a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006J&\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\nj\b\u0012\u0004\u0012\u00020\u0006`\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/purchase/billing/BillingFlowParamsFactory;", "", "()V", "createForPurchase", "Lcom/android/billingclient/api/BillingFlowParams;", "sku", "", "skuType", "createForUpgrade", "oldSkus", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.billing.a */
public final class C14484a {
    @NotNull
    /* renamed from: a */
    public final C0883b m55330a(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "sku");
        C2668g.b(str2, "skuType");
        C0882a h = C0883b.h();
        h.a(str);
        h.b(str2);
        str = h.a();
        C2668g.a(str, "BillingFlowParams.newBui…kuType)\n        }.build()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final C0883b m55331a(@NotNull String str, @NotNull ArrayList<String> arrayList) {
        C2668g.b(str, "sku");
        C2668g.b(arrayList, "oldSkus");
        C0882a h = C0883b.h();
        h.a(arrayList);
        h.a(str);
        h.b("subs");
        str = h.a();
        C2668g.a(str, "BillingFlowParams.newBui…e.SUBS)\n        }.build()");
        return str;
    }
}
