package com.tinder.api.model.rating;

import android.support.annotation.Nullable;

/* renamed from: com.tinder.api.model.rating.$AutoValue_PassRatingResponse */
abstract class C$AutoValue_PassRatingResponse extends PassRatingResponse {
    private final Integer status;

    C$AutoValue_PassRatingResponse(@Nullable Integer num) {
        this.status = num;
    }

    @Nullable
    public Integer status() {
        return this.status;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PassRatingResponse{status=");
        stringBuilder.append(this.status);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PassRatingResponse)) {
            return false;
        }
        PassRatingResponse passRatingResponse = (PassRatingResponse) obj;
        if (this.status != null) {
            z = this.status.equals(passRatingResponse.status());
        } else if (passRatingResponse.status() != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.status == null ? 0 : this.status.hashCode()) ^ 1000003;
    }
}
