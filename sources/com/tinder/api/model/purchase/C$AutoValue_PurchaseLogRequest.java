package com.tinder.api.model.purchase;

import com.squareup.moshi.Json;
import java.util.List;

/* renamed from: com.tinder.api.model.purchase.$AutoValue_PurchaseLogRequest */
abstract class C$AutoValue_PurchaseLogRequest extends PurchaseLogRequest {
    private final List<PurchaseLog> purchaseLogs;

    static final class Builder extends com.tinder.api.model.purchase.PurchaseLogRequest.Builder {
        private List<PurchaseLog> purchaseLogs;

        Builder() {
        }

        Builder(PurchaseLogRequest purchaseLogRequest) {
            this.purchaseLogs = purchaseLogRequest.purchaseLogs();
        }

        public com.tinder.api.model.purchase.PurchaseLogRequest.Builder setPurchaseLogs(List<PurchaseLog> list) {
            this.purchaseLogs = list;
            return this;
        }

        public PurchaseLogRequest build() {
            String str = "";
            if (this.purchaseLogs == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" purchaseLogs");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PurchaseLogRequest(this.purchaseLogs);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    C$AutoValue_PurchaseLogRequest(List<PurchaseLog> list) {
        if (list == null) {
            throw new NullPointerException("Null purchaseLogs");
        }
        this.purchaseLogs = list;
    }

    @Json(name = "errors")
    public List<PurchaseLog> purchaseLogs() {
        return this.purchaseLogs;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PurchaseLogRequest{purchaseLogs=");
        stringBuilder.append(this.purchaseLogs);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PurchaseLogRequest)) {
            return null;
        }
        return this.purchaseLogs.equals(((PurchaseLogRequest) obj).purchaseLogs());
    }

    public int hashCode() {
        return this.purchaseLogs.hashCode() ^ 1000003;
    }
}
