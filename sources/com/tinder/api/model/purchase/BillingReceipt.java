package com.tinder.api.model.purchase;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.purchase.AutoValue_BillingReceipt.MoshiJsonAdapter;

public abstract class BillingReceipt {

    public static abstract class Builder {
        public abstract BillingReceipt build();

        public abstract Builder previousReceipt(String str);

        public abstract Builder purchaseToken(String str);

        public abstract Builder receipt(String str);

        public abstract Builder signature(String str);
    }

    @Nullable
    @Json(name = "prev_receipt")
    public abstract String previousReceipt();

    @Nullable
    public abstract String purchaseToken();

    public abstract String receipt();

    public abstract String signature();

    public static JsonAdapter<BillingReceipt> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static BillingReceipt from(@NonNull BillingReceipt billingReceipt, @NonNull String str) {
        return builder().signature(billingReceipt.signature()).receipt(billingReceipt.receipt()).previousReceipt(str).build();
    }

    public static BillingReceipt toApiRequest(BillingReceipt billingReceipt) {
        return builder().receipt(billingReceipt.receipt()).previousReceipt(billingReceipt.previousReceipt()).signature(billingReceipt.signature()).build();
    }

    public static Builder builder() {
        return new Builder();
    }
}
