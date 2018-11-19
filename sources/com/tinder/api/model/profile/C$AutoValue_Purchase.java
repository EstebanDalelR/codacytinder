package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import com.tinder.api.model.profile.Purchase.Platform;
import javax.annotation.Nullable;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Purchase */
abstract class C$AutoValue_Purchase extends Purchase {
    private final Platform platform;
    private final String productId;
    private final String productType;
    private final String purchaseType;

    C$AutoValue_Purchase(String str, String str2, String str3, @Nullable Platform platform) {
        if (str == null) {
            throw new NullPointerException("Null productType");
        }
        this.productType = str;
        if (str2 == null) {
            throw new NullPointerException("Null purchaseType");
        }
        this.purchaseType = str2;
        if (str3 == null) {
            throw new NullPointerException("Null productId");
        }
        this.productId = str3;
        this.platform = platform;
    }

    @Json(name = "product_type")
    public String productType() {
        return this.productType;
    }

    @Json(name = "purchase_type")
    public String purchaseType() {
        return this.purchaseType;
    }

    @Json(name = "product_id")
    public String productId() {
        return this.productId;
    }

    @Nullable
    @Json(name = "platform")
    public Platform platform() {
        return this.platform;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Purchase{productType=");
        stringBuilder.append(this.productType);
        stringBuilder.append(", purchaseType=");
        stringBuilder.append(this.purchaseType);
        stringBuilder.append(", productId=");
        stringBuilder.append(this.productId);
        stringBuilder.append(", platform=");
        stringBuilder.append(this.platform);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (this.productType.equals(purchase.productType()) && this.purchaseType.equals(purchase.purchaseType()) && this.productId.equals(purchase.productId())) {
            if (this.platform == null) {
                if (purchase.platform() == null) {
                    return z;
                }
            } else if (this.platform.equals(purchase.platform()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((((((this.productType.hashCode() ^ 1000003) * 1000003) ^ this.purchaseType.hashCode()) * 1000003) ^ this.productId.hashCode()) * 1000003) ^ (this.platform == null ? 0 : this.platform.hashCode());
    }
}
