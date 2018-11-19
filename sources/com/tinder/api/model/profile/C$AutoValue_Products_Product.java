package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.profile.Products.Product;
import com.tinder.api.model.profile.Products.Sku;
import java.util.List;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Products_Product */
abstract class C$AutoValue_Products_Product extends Product {
    private final String campaign;
    private final String campaignVariantName;
    private final Long expiredAt;
    private final List<Sku> skus;
    private final Long viewAt;

    C$AutoValue_Products_Product(List<Sku> list, @Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable String str2) {
        if (list == null) {
            throw new NullPointerException("Null skus");
        }
        this.skus = list;
        this.viewAt = l;
        this.expiredAt = l2;
        this.campaignVariantName = str;
        this.campaign = str2;
    }

    @Json(name = "skus")
    public List<Sku> skus() {
        return this.skus;
    }

    @Nullable
    @Json(name = "viewed_at")
    public Long viewAt() {
        return this.viewAt;
    }

    @Nullable
    @Json(name = "expires_at")
    public Long expiredAt() {
        return this.expiredAt;
    }

    @Nullable
    @Json(name = "campaign_variant_name")
    public String campaignVariantName() {
        return this.campaignVariantName;
    }

    @Nullable
    @Json(name = "campaign")
    public String campaign() {
        return this.campaign;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Product{skus=");
        stringBuilder.append(this.skus);
        stringBuilder.append(", viewAt=");
        stringBuilder.append(this.viewAt);
        stringBuilder.append(", expiredAt=");
        stringBuilder.append(this.expiredAt);
        stringBuilder.append(", campaignVariantName=");
        stringBuilder.append(this.campaignVariantName);
        stringBuilder.append(", campaign=");
        stringBuilder.append(this.campaign);
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
        r1 = r5 instanceof com.tinder.api.model.profile.Products.Product;
        r2 = 0;
        if (r1 == 0) goto L_0x0076;
    L_0x0009:
        r5 = (com.tinder.api.model.profile.Products.Product) r5;
        r1 = r4.skus;
        r3 = r5.skus();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x0017:
        r1 = r4.viewAt;
        if (r1 != 0) goto L_0x0022;
    L_0x001b:
        r1 = r5.viewAt();
        if (r1 != 0) goto L_0x0074;
    L_0x0021:
        goto L_0x002e;
    L_0x0022:
        r1 = r4.viewAt;
        r3 = r5.viewAt();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x002e:
        r1 = r4.expiredAt;
        if (r1 != 0) goto L_0x0039;
    L_0x0032:
        r1 = r5.expiredAt();
        if (r1 != 0) goto L_0x0074;
    L_0x0038:
        goto L_0x0045;
    L_0x0039:
        r1 = r4.expiredAt;
        r3 = r5.expiredAt();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x0045:
        r1 = r4.campaignVariantName;
        if (r1 != 0) goto L_0x0050;
    L_0x0049:
        r1 = r5.campaignVariantName();
        if (r1 != 0) goto L_0x0074;
    L_0x004f:
        goto L_0x005c;
    L_0x0050:
        r1 = r4.campaignVariantName;
        r3 = r5.campaignVariantName();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0074;
    L_0x005c:
        r1 = r4.campaign;
        if (r1 != 0) goto L_0x0067;
    L_0x0060:
        r5 = r5.campaign();
        if (r5 != 0) goto L_0x0074;
    L_0x0066:
        goto L_0x0075;
    L_0x0067:
        r1 = r4.campaign;
        r5 = r5.campaign();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x0075;
    L_0x0074:
        r0 = 0;
    L_0x0075:
        return r0;
    L_0x0076:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.profile.$AutoValue_Products_Product.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((this.skus.hashCode() ^ 1000003) * 1000003) ^ (this.viewAt == null ? 0 : this.viewAt.hashCode())) * 1000003) ^ (this.expiredAt == null ? 0 : this.expiredAt.hashCode())) * 1000003) ^ (this.campaignVariantName == null ? 0 : this.campaignVariantName.hashCode())) * 1000003;
        if (this.campaign != null) {
            i = this.campaign.hashCode();
        }
        return hashCode ^ i;
    }
}
