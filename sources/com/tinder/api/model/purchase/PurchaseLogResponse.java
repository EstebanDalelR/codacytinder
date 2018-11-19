package com.tinder.api.model.purchase;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.purchase.AutoValue_PurchaseLogResponse.MoshiJsonAdapter;
import java.util.List;
import java.util.Map;

public abstract class PurchaseLogResponse {
    @Nullable
    @Json(name = "ProcessedItems")
    public abstract Map<String, String> processItems();

    @Nullable
    @Json(name = "UnprocessedIndices")
    public abstract List<Integer> unprocessedIndices();

    public static JsonAdapter<PurchaseLogResponse> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
