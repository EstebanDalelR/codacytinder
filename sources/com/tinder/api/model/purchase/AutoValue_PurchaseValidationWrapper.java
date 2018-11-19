package com.tinder.api.model.purchase;

import android.support.annotation.NonNull;

final class AutoValue_PurchaseValidationWrapper extends PurchaseValidationWrapper {
    private final PurchaseValidation purchaseValidation;
    private final String responseBody;

    static final class Builder extends com.tinder.api.model.purchase.PurchaseValidationWrapper.Builder {
        private PurchaseValidation purchaseValidation;
        private String responseBody;

        Builder() {
        }

        Builder(PurchaseValidationWrapper purchaseValidationWrapper) {
            this.purchaseValidation = purchaseValidationWrapper.purchaseValidation();
            this.responseBody = purchaseValidationWrapper.responseBody();
        }

        public com.tinder.api.model.purchase.PurchaseValidationWrapper.Builder purchaseValidation(PurchaseValidation purchaseValidation) {
            this.purchaseValidation = purchaseValidation;
            return this;
        }

        public com.tinder.api.model.purchase.PurchaseValidationWrapper.Builder responseBody(String str) {
            this.responseBody = str;
            return this;
        }

        public PurchaseValidationWrapper build() {
            String str = "";
            if (this.purchaseValidation == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" purchaseValidation");
                str = stringBuilder.toString();
            }
            if (this.responseBody == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" responseBody");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PurchaseValidationWrapper(this.purchaseValidation, this.responseBody);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_PurchaseValidationWrapper(PurchaseValidation purchaseValidation, String str) {
        this.purchaseValidation = purchaseValidation;
        this.responseBody = str;
    }

    @NonNull
    public PurchaseValidation purchaseValidation() {
        return this.purchaseValidation;
    }

    @NonNull
    public String responseBody() {
        return this.responseBody;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PurchaseValidationWrapper{purchaseValidation=");
        stringBuilder.append(this.purchaseValidation);
        stringBuilder.append(", responseBody=");
        stringBuilder.append(this.responseBody);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PurchaseValidationWrapper)) {
            return false;
        }
        PurchaseValidationWrapper purchaseValidationWrapper = (PurchaseValidationWrapper) obj;
        if (!this.purchaseValidation.equals(purchaseValidationWrapper.purchaseValidation()) || this.responseBody.equals(purchaseValidationWrapper.responseBody()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.purchaseValidation.hashCode() ^ 1000003) * 1000003) ^ this.responseBody.hashCode();
    }
}
