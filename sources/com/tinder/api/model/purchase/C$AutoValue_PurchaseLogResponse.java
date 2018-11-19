package com.tinder.api.model.purchase;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import java.util.List;
import java.util.Map;

/* renamed from: com.tinder.api.model.purchase.$AutoValue_PurchaseLogResponse */
abstract class C$AutoValue_PurchaseLogResponse extends PurchaseLogResponse {
    private final Map<String, String> processItems;
    private final List<Integer> unprocessedIndices;

    C$AutoValue_PurchaseLogResponse(@Nullable Map<String, String> map, @Nullable List<Integer> list) {
        this.processItems = map;
        this.unprocessedIndices = list;
    }

    @Nullable
    @Json(name = "ProcessedItems")
    public Map<String, String> processItems() {
        return this.processItems;
    }

    @Nullable
    @Json(name = "UnprocessedIndices")
    public List<Integer> unprocessedIndices() {
        return this.unprocessedIndices;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PurchaseLogResponse{processItems=");
        stringBuilder.append(this.processItems);
        stringBuilder.append(", unprocessedIndices=");
        stringBuilder.append(this.unprocessedIndices);
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
        r1 = r5 instanceof com.tinder.api.model.purchase.PurchaseLogResponse;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.model.purchase.PurchaseLogResponse) r5;
        r1 = r4.processItems;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.processItems();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.processItems;
        r3 = r5.processItems();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.unprocessedIndices;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.unprocessedIndices();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.unprocessedIndices;
        r5 = r5.unprocessedIndices();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.purchase.$AutoValue_PurchaseLogResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.processItems == null ? 0 : this.processItems.hashCode()) ^ 1000003) * 1000003;
        if (this.unprocessedIndices != null) {
            i = this.unprocessedIndices.hashCode();
        }
        return hashCode ^ i;
    }
}
