package com.tinder.api.model.purchase;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.purchase.PurchaseValidation.Receipt;
import java.util.List;

/* renamed from: com.tinder.api.model.purchase.$AutoValue_PurchaseValidation */
abstract class C$AutoValue_PurchaseValidation extends PurchaseValidation {
    private final List<Receipt> receipts;
    private final Integer status;

    C$AutoValue_PurchaseValidation(@Nullable Integer num, @Nullable List<Receipt> list) {
        this.status = num;
        this.receipts = list;
    }

    @Nullable
    public Integer status() {
        return this.status;
    }

    @Nullable
    @Json(name = "results")
    public List<Receipt> receipts() {
        return this.receipts;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PurchaseValidation{status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", receipts=");
        stringBuilder.append(this.receipts);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.api.model.purchase.PurchaseValidation;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.model.purchase.PurchaseValidation) r5;
        r1 = r4.status;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.status();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.status;
        r3 = r5.status();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.receipts;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.receipts();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.receipts;
        r5 = r5.receipts();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.purchase.$AutoValue_PurchaseValidation.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.status == null ? 0 : this.status.hashCode()) ^ 1000003) * 1000003;
        if (this.receipts != null) {
            i = this.receipts.hashCode();
        }
        return hashCode ^ i;
    }
}
