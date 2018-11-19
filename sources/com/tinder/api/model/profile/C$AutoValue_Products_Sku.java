package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.profile.Products.Sku;
import com.tinder.api.model.profile.Products.Sku.ProductType;
import com.tinder.api.model.profile.Products.Sku.PurchaseType;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Products_Sku */
abstract class C$AutoValue_Products_Sku extends Sku {
    private final Integer amount;
    private final Integer discountPercentage;
    private final Boolean isBaseGroup;
    private final Boolean isIntroPricing;
    private final Boolean isPrimary;
    private final String originalProductId;
    private final String productId;
    private final ProductType productType;
    private final PurchaseType purchaseType;
    private final Integer term;

    C$AutoValue_Products_Sku(ProductType productType, PurchaseType purchaseType, String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool3) {
        if (productType == null) {
            throw new NullPointerException("Null productType");
        }
        this.productType = productType;
        if (purchaseType == null) {
            throw new NullPointerException("Null purchaseType");
        }
        this.purchaseType = purchaseType;
        if (str == null) {
            throw new NullPointerException("Null productId");
        }
        this.productId = str;
        this.isBaseGroup = bool;
        this.isPrimary = bool2;
        this.originalProductId = str2;
        this.amount = num;
        this.term = num2;
        this.discountPercentage = num3;
        this.isIntroPricing = bool3;
    }

    @Json(name = "product_type")
    public ProductType productType() {
        return this.productType;
    }

    @Json(name = "purchase_type")
    public PurchaseType purchaseType() {
        return this.purchaseType;
    }

    @Json(name = "product_id")
    public String productId() {
        return this.productId;
    }

    @Nullable
    @Json(name = "is_base_group")
    public Boolean isBaseGroup() {
        return this.isBaseGroup;
    }

    @Nullable
    @Json(name = "is_primary")
    public Boolean isPrimary() {
        return this.isPrimary;
    }

    @Nullable
    @Json(name = "original_product_id")
    public String originalProductId() {
        return this.originalProductId;
    }

    @Nullable
    @Json(name = "amount")
    public Integer amount() {
        return this.amount;
    }

    @Nullable
    @Json(name = "terms")
    public Integer term() {
        return this.term;
    }

    @Nullable
    @Json(name = "discount_percentage")
    public Integer discountPercentage() {
        return this.discountPercentage;
    }

    @Nullable
    @Json(name = "is_intro_price")
    public Boolean isIntroPricing() {
        return this.isIntroPricing;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sku{productType=");
        stringBuilder.append(this.productType);
        stringBuilder.append(", purchaseType=");
        stringBuilder.append(this.purchaseType);
        stringBuilder.append(", productId=");
        stringBuilder.append(this.productId);
        stringBuilder.append(", isBaseGroup=");
        stringBuilder.append(this.isBaseGroup);
        stringBuilder.append(", isPrimary=");
        stringBuilder.append(this.isPrimary);
        stringBuilder.append(", originalProductId=");
        stringBuilder.append(this.originalProductId);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.amount);
        stringBuilder.append(", term=");
        stringBuilder.append(this.term);
        stringBuilder.append(", discountPercentage=");
        stringBuilder.append(this.discountPercentage);
        stringBuilder.append(", isIntroPricing=");
        stringBuilder.append(this.isIntroPricing);
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
        r1 = r5 instanceof com.tinder.api.model.profile.Products.Sku;
        r2 = 0;
        if (r1 == 0) goto L_0x00d3;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.Products.Sku) r5;
        r1 = r4.productType;
        r3 = r5.productType();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d1;
    L_0x0017:
        r1 = r4.purchaseType;
        r3 = r5.purchaseType();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d1;
    L_0x0023:
        r1 = r4.productId;
        r3 = r5.productId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d1;
    L_0x002f:
        r1 = r4.isBaseGroup;
        if (r1 != 0) goto L_0x003a;
    L_0x0033:
        r1 = r5.isBaseGroup();
        if (r1 != 0) goto L_0x00d1;
    L_0x0039:
        goto L_0x0046;
    L_0x003a:
        r1 = r4.isBaseGroup;
        r3 = r5.isBaseGroup();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d1;
    L_0x0046:
        r1 = r4.isPrimary;
        if (r1 != 0) goto L_0x0051;
    L_0x004a:
        r1 = r5.isPrimary();
        if (r1 != 0) goto L_0x00d1;
    L_0x0050:
        goto L_0x005d;
    L_0x0051:
        r1 = r4.isPrimary;
        r3 = r5.isPrimary();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d1;
    L_0x005d:
        r1 = r4.originalProductId;
        if (r1 != 0) goto L_0x0068;
    L_0x0061:
        r1 = r5.originalProductId();
        if (r1 != 0) goto L_0x00d1;
    L_0x0067:
        goto L_0x0074;
    L_0x0068:
        r1 = r4.originalProductId;
        r3 = r5.originalProductId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d1;
    L_0x0074:
        r1 = r4.amount;
        if (r1 != 0) goto L_0x007f;
    L_0x0078:
        r1 = r5.amount();
        if (r1 != 0) goto L_0x00d1;
    L_0x007e:
        goto L_0x008b;
    L_0x007f:
        r1 = r4.amount;
        r3 = r5.amount();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d1;
    L_0x008b:
        r1 = r4.term;
        if (r1 != 0) goto L_0x0096;
    L_0x008f:
        r1 = r5.term();
        if (r1 != 0) goto L_0x00d1;
    L_0x0095:
        goto L_0x00a2;
    L_0x0096:
        r1 = r4.term;
        r3 = r5.term();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d1;
    L_0x00a2:
        r1 = r4.discountPercentage;
        if (r1 != 0) goto L_0x00ad;
    L_0x00a6:
        r1 = r5.discountPercentage();
        if (r1 != 0) goto L_0x00d1;
    L_0x00ac:
        goto L_0x00b9;
    L_0x00ad:
        r1 = r4.discountPercentage;
        r3 = r5.discountPercentage();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d1;
    L_0x00b9:
        r1 = r4.isIntroPricing;
        if (r1 != 0) goto L_0x00c4;
    L_0x00bd:
        r5 = r5.isIntroPricing();
        if (r5 != 0) goto L_0x00d1;
    L_0x00c3:
        goto L_0x00d2;
    L_0x00c4:
        r1 = r4.isIntroPricing;
        r5 = r5.isIntroPricing();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00d1;
    L_0x00d0:
        goto L_0x00d2;
    L_0x00d1:
        r0 = 0;
    L_0x00d2:
        return r0;
    L_0x00d3:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.$AutoValue_Products_Sku.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((this.productType.hashCode() ^ 1000003) * 1000003) ^ this.purchaseType.hashCode()) * 1000003) ^ this.productId.hashCode()) * 1000003) ^ (this.isBaseGroup == null ? 0 : this.isBaseGroup.hashCode())) * 1000003) ^ (this.isPrimary == null ? 0 : this.isPrimary.hashCode())) * 1000003) ^ (this.originalProductId == null ? 0 : this.originalProductId.hashCode())) * 1000003) ^ (this.amount == null ? 0 : this.amount.hashCode())) * 1000003) ^ (this.term == null ? 0 : this.term.hashCode())) * 1000003) ^ (this.discountPercentage == null ? 0 : this.discountPercentage.hashCode())) * 1000003;
        if (this.isIntroPricing != null) {
            i = this.isIntroPricing.hashCode();
        }
        return hashCode ^ i;
    }
}
