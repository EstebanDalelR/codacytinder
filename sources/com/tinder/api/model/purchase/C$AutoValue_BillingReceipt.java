package com.tinder.api.model.purchase;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.model.purchase.$AutoValue_BillingReceipt */
abstract class C$AutoValue_BillingReceipt extends BillingReceipt {
    private final String previousReceipt;
    private final String purchaseToken;
    private final String receipt;
    private final String signature;

    static final class Builder extends com.tinder.api.model.purchase.BillingReceipt.Builder {
        private String previousReceipt;
        private String purchaseToken;
        private String receipt;
        private String signature;

        Builder() {
        }

        Builder(BillingReceipt billingReceipt) {
            this.signature = billingReceipt.signature();
            this.receipt = billingReceipt.receipt();
            this.purchaseToken = billingReceipt.purchaseToken();
            this.previousReceipt = billingReceipt.previousReceipt();
        }

        public com.tinder.api.model.purchase.BillingReceipt.Builder signature(String str) {
            this.signature = str;
            return this;
        }

        public com.tinder.api.model.purchase.BillingReceipt.Builder receipt(String str) {
            this.receipt = str;
            return this;
        }

        public com.tinder.api.model.purchase.BillingReceipt.Builder purchaseToken(@Nullable String str) {
            this.purchaseToken = str;
            return this;
        }

        public com.tinder.api.model.purchase.BillingReceipt.Builder previousReceipt(@Nullable String str) {
            this.previousReceipt = str;
            return this;
        }

        public BillingReceipt build() {
            String str = "";
            if (this.signature == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" signature");
                str = stringBuilder.toString();
            }
            if (this.receipt == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" receipt");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_BillingReceipt(this.signature, this.receipt, this.purchaseToken, this.previousReceipt);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    C$AutoValue_BillingReceipt(String str, String str2, @Nullable String str3, @Nullable String str4) {
        if (str == null) {
            throw new NullPointerException("Null signature");
        }
        this.signature = str;
        if (str2 == null) {
            throw new NullPointerException("Null receipt");
        }
        this.receipt = str2;
        this.purchaseToken = str3;
        this.previousReceipt = str4;
    }

    public String signature() {
        return this.signature;
    }

    public String receipt() {
        return this.receipt;
    }

    @Nullable
    public String purchaseToken() {
        return this.purchaseToken;
    }

    @Nullable
    @Json(name = "prev_receipt")
    public String previousReceipt() {
        return this.previousReceipt;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BillingReceipt{signature=");
        stringBuilder.append(this.signature);
        stringBuilder.append(", receipt=");
        stringBuilder.append(this.receipt);
        stringBuilder.append(", purchaseToken=");
        stringBuilder.append(this.purchaseToken);
        stringBuilder.append(", previousReceipt=");
        stringBuilder.append(this.previousReceipt);
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
        r1 = r5 instanceof com.tinder.api.model.purchase.BillingReceipt;
        r2 = 0;
        if (r1 == 0) goto L_0x0054;
    L_0x0009:
        r5 = (com.tinder.api.model.purchase.BillingReceipt) r5;
        r1 = r4.signature;
        r3 = r5.signature();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0052;
    L_0x0017:
        r1 = r4.receipt;
        r3 = r5.receipt();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0052;
    L_0x0023:
        r1 = r4.purchaseToken;
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = r5.purchaseToken();
        if (r1 != 0) goto L_0x0052;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r1 = r4.purchaseToken;
        r3 = r5.purchaseToken();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0052;
    L_0x003a:
        r1 = r4.previousReceipt;
        if (r1 != 0) goto L_0x0045;
    L_0x003e:
        r5 = r5.previousReceipt();
        if (r5 != 0) goto L_0x0052;
    L_0x0044:
        goto L_0x0053;
    L_0x0045:
        r1 = r4.previousReceipt;
        r5 = r5.previousReceipt();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0053;
    L_0x0052:
        r0 = 0;
    L_0x0053:
        return r0;
    L_0x0054:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.purchase.$AutoValue_BillingReceipt.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((this.signature.hashCode() ^ 1000003) * 1000003) ^ this.receipt.hashCode()) * 1000003) ^ (this.purchaseToken == null ? 0 : this.purchaseToken.hashCode())) * 1000003;
        if (this.previousReceipt != null) {
            i = this.previousReceipt.hashCode();
        }
        return hashCode ^ i;
    }
}
