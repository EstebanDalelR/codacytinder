package com.tinder.api.model.profile;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.profile.AutoValue_Purchase.MoshiJsonAdapter;
import javax.annotation.Nullable;

public abstract class Purchase {

    public enum Platform {
        ANDROID,
        IOS,
        TEST,
        WEB
    }

    @Nullable
    @Json(name = "platform")
    public abstract Platform platform();

    @Json(name = "product_id")
    public abstract String productId();

    @Json(name = "product_type")
    public abstract String productType();

    @Json(name = "purchase_type")
    public abstract String purchaseType();

    public static JsonAdapter<Purchase> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
