package com.tinder.api.model.purchase;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.profile.Products.Sku.ProductType;
import com.tinder.api.model.profile.Products.Sku.PurchaseType;
import com.tinder.api.model.purchase.PurchaseValidation.Receipt;

/* renamed from: com.tinder.api.model.purchase.$AutoValue_PurchaseValidation_Receipt */
abstract class C$AutoValue_PurchaseValidation_Receipt extends Receipt {
    private final String createDate;
    private final String errorCode;
    private final String errorMessage;
    private final String productId;
    private final ProductType productType;
    private final PurchaseType purchaseType;
    private final String receiptId;

    C$AutoValue_PurchaseValidation_Receipt(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ProductType productType, @Nullable PurchaseType purchaseType, @Nullable String str4, @Nullable String str5) {
        this.errorMessage = str;
        this.errorCode = str2;
        this.receiptId = str3;
        this.productType = productType;
        this.purchaseType = purchaseType;
        this.productId = str4;
        this.createDate = str5;
    }

    @Nullable
    @Json(name = "error")
    public String errorMessage() {
        return this.errorMessage;
    }

    @Nullable
    @Json(name = "error_code")
    public String errorCode() {
        return this.errorCode;
    }

    @Nullable
    @Json(name = "receipt_id")
    public String receiptId() {
        return this.receiptId;
    }

    @Nullable
    @Json(name = "product_type")
    public ProductType productType() {
        return this.productType;
    }

    @Nullable
    @Json(name = "purchase_type")
    public PurchaseType purchaseType() {
        return this.purchaseType;
    }

    @Nullable
    @Json(name = "product_id")
    public String productId() {
        return this.productId;
    }

    @Nullable
    @Json(name = "create_date")
    public String createDate() {
        return this.createDate;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Receipt{errorMessage=");
        stringBuilder.append(this.errorMessage);
        stringBuilder.append(", errorCode=");
        stringBuilder.append(this.errorCode);
        stringBuilder.append(", receiptId=");
        stringBuilder.append(this.receiptId);
        stringBuilder.append(", productType=");
        stringBuilder.append(this.productType);
        stringBuilder.append(", purchaseType=");
        stringBuilder.append(this.purchaseType);
        stringBuilder.append(", productId=");
        stringBuilder.append(this.productId);
        stringBuilder.append(", createDate=");
        stringBuilder.append(this.createDate);
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
        r1 = r5 instanceof com.tinder.api.model.purchase.PurchaseValidation.Receipt;
        r2 = 0;
        if (r1 == 0) goto L_0x00af;
    L_0x0009:
        r5 = (com.tinder.api.model.purchase.PurchaseValidation.Receipt) r5;
        r1 = r4.errorMessage;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.errorMessage();
        if (r1 != 0) goto L_0x00ad;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.errorMessage;
        r3 = r5.errorMessage();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x0022:
        r1 = r4.errorCode;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.errorCode();
        if (r1 != 0) goto L_0x00ad;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.errorCode;
        r3 = r5.errorCode();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x0039:
        r1 = r4.receiptId;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.receiptId();
        if (r1 != 0) goto L_0x00ad;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.receiptId;
        r3 = r5.receiptId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x0050:
        r1 = r4.productType;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.productType();
        if (r1 != 0) goto L_0x00ad;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.productType;
        r3 = r5.productType();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x0067:
        r1 = r4.purchaseType;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.purchaseType();
        if (r1 != 0) goto L_0x00ad;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.purchaseType;
        r3 = r5.purchaseType();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x007e:
        r1 = r4.productId;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.productId();
        if (r1 != 0) goto L_0x00ad;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.productId;
        r3 = r5.productId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ad;
    L_0x0095:
        r1 = r4.createDate;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r5 = r5.createDate();
        if (r5 != 0) goto L_0x00ad;
    L_0x009f:
        goto L_0x00ae;
    L_0x00a0:
        r1 = r4.createDate;
        r5 = r5.createDate();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00ae;
    L_0x00ad:
        r0 = 0;
    L_0x00ae:
        return r0;
    L_0x00af:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.purchase.$AutoValue_PurchaseValidation_Receipt.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((this.errorMessage == null ? 0 : this.errorMessage.hashCode()) ^ 1000003) * 1000003) ^ (this.errorCode == null ? 0 : this.errorCode.hashCode())) * 1000003) ^ (this.receiptId == null ? 0 : this.receiptId.hashCode())) * 1000003) ^ (this.productType == null ? 0 : this.productType.hashCode())) * 1000003) ^ (this.purchaseType == null ? 0 : this.purchaseType.hashCode())) * 1000003) ^ (this.productId == null ? 0 : this.productId.hashCode())) * 1000003;
        if (this.createDate != null) {
            i = this.createDate.hashCode();
        }
        return hashCode ^ i;
    }
}
