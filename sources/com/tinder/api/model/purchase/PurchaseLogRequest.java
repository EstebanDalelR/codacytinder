package com.tinder.api.model.purchase;

import android.support.annotation.NonNull;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.purchase.AutoValue_PurchaseLogRequest.MoshiJsonAdapter;
import java.util.List;

public abstract class PurchaseLogRequest {

    public static abstract class Builder {
        public abstract PurchaseLogRequest build();

        public abstract Builder setPurchaseLogs(@NonNull List<PurchaseLog> list);
    }

    public static class Factory {
        @NonNull
        public PurchaseLogRequest create(@NonNull List<PurchaseLog> list) {
            return PurchaseLogRequest.builder().setPurchaseLogs(list).build();
        }
    }

    @Json(name = "errors")
    public abstract List<PurchaseLog> purchaseLogs();

    public static JsonAdapter<PurchaseLogRequest> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
