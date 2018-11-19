package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.profile.AutoValue_Products_Product.MoshiJsonAdapter;
import java.util.List;

public abstract class Products {

    public static abstract class Product {
        @Nullable
        @Json(name = "campaign")
        public abstract String campaign();

        @Nullable
        @Json(name = "campaign_variant_name")
        public abstract String campaignVariantName();

        @Nullable
        @Json(name = "expires_at")
        public abstract Long expiredAt();

        @Json(name = "skus")
        public abstract List<Sku> skus();

        @Nullable
        @Json(name = "viewed_at")
        public abstract Long viewAt();

        public static JsonAdapter<Product> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Sku {

        public enum ProductType {
            PLUS,
            BOOST,
            SUPERLIKE,
            GOLD,
            TOP_PICKS
        }

        public enum PurchaseType {
            SUBSCRIPTION,
            CONSUMABLE
        }

        @Nullable
        @Json(name = "amount")
        public abstract Integer amount();

        @Nullable
        @Json(name = "discount_percentage")
        public abstract Integer discountPercentage();

        @Nullable
        @Json(name = "is_base_group")
        public abstract Boolean isBaseGroup();

        @Nullable
        @Json(name = "is_intro_price")
        public abstract Boolean isIntroPricing();

        @Nullable
        @Json(name = "is_primary")
        public abstract Boolean isPrimary();

        @Nullable
        @Json(name = "original_product_id")
        public abstract String originalProductId();

        @Json(name = "product_id")
        public abstract String productId();

        @Json(name = "product_type")
        public abstract ProductType productType();

        @Json(name = "purchase_type")
        public abstract PurchaseType purchaseType();

        @Nullable
        @Json(name = "terms")
        public abstract Integer term();

        public static JsonAdapter<Sku> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Products_Sku.MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Variant {
        @Nullable
        @Json(name = "discount")
        public abstract Product discount();

        @Json(name = "regular")
        public abstract Product regular();

        public static JsonAdapter<Variant> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Products_Variant.MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    @Json(name = "boost")
    public abstract Variant boost();

    @Nullable
    @Json(name = "gold")
    public abstract Variant gold();

    @Nullable
    @Json(name = "plus")
    public abstract Variant plus();

    @Nullable
    @Json(name = "superlike")
    public abstract Variant superlike();

    @Nullable
    @Json(name = "toppicks")
    public abstract Variant topPicks();

    public static JsonAdapter<Products> jsonAdapter(C5987p c5987p) {
        return new AutoValue_Products.MoshiJsonAdapter(c5987p);
    }
}
