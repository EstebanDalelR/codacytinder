package com.tinder.api.model.purchase;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.profile.Products.Sku.ProductType;
import com.tinder.api.model.profile.Products.Sku.PurchaseType;
import com.tinder.api.model.purchase.AutoValue_PurchaseValidation_Receipt.MoshiJsonAdapter;
import java.util.List;

public abstract class PurchaseValidation {

    public static abstract class Receipt {
        @Nullable
        @Json(name = "create_date")
        public abstract String createDate();

        @Nullable
        @Json(name = "error_code")
        public abstract String errorCode();

        @Nullable
        @Json(name = "error")
        public abstract String errorMessage();

        @Nullable
        @Json(name = "product_id")
        public abstract String productId();

        @Nullable
        @Json(name = "product_type")
        public abstract ProductType productType();

        @Nullable
        @Json(name = "purchase_type")
        public abstract PurchaseType purchaseType();

        @Nullable
        @Json(name = "receipt_id")
        public abstract String receiptId();

        public static JsonAdapter<Receipt> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    @Json(name = "results")
    public abstract List<Receipt> receipts();

    @Nullable
    public abstract Integer status();

    public static JsonAdapter<PurchaseValidation> jsonAdapter(C5987p c5987p) {
        return new AutoValue_PurchaseValidation.MoshiJsonAdapter(c5987p);
    }
}
