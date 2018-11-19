package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.profile.Products.Product;
import com.tinder.api.model.profile.Products.Variant;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Products_Variant */
abstract class C$AutoValue_Products_Variant extends Variant {
    private final Product discount;
    private final Product regular;

    C$AutoValue_Products_Variant(Product product, @Nullable Product product2) {
        if (product == null) {
            throw new NullPointerException("Null regular");
        }
        this.regular = product;
        this.discount = product2;
    }

    @Json(name = "regular")
    public Product regular() {
        return this.regular;
    }

    @Nullable
    @Json(name = "discount")
    public Product discount() {
        return this.discount;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Variant{regular=");
        stringBuilder.append(this.regular);
        stringBuilder.append(", discount=");
        stringBuilder.append(this.discount);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Variant)) {
            return false;
        }
        Variant variant = (Variant) obj;
        if (this.regular.equals(variant.regular())) {
            if (this.discount == null) {
                if (variant.discount() == null) {
                    return z;
                }
            } else if (this.discount.equals(variant.discount()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((this.regular.hashCode() ^ 1000003) * 1000003) ^ (this.discount == null ? 0 : this.discount.hashCode());
    }
}
