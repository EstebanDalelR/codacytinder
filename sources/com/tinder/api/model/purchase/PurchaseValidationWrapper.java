package com.tinder.api.model.purchase;

import android.support.annotation.NonNull;

public abstract class PurchaseValidationWrapper {

    public static abstract class Builder {
        public abstract PurchaseValidationWrapper build();

        public abstract Builder purchaseValidation(PurchaseValidation purchaseValidation);

        public abstract Builder responseBody(String str);
    }

    @NonNull
    public abstract PurchaseValidation purchaseValidation();

    @NonNull
    public abstract String responseBody();

    public static Builder builder() {
        return new Builder();
    }
}
