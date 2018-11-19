package com.tinder.api.model.auth;

import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.model.auth.$AutoValue_AccountKitValidateRequest */
abstract class C$AutoValue_AccountKitValidateRequest extends AccountKitValidateRequest {
    private final String token;

    C$AutoValue_AccountKitValidateRequest(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.token = str;
    }

    @Json(name = "token")
    public String token() {
        return this.token;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AccountKitValidateRequest{token=");
        stringBuilder.append(this.token);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountKitValidateRequest)) {
            return null;
        }
        return this.token.equals(((AccountKitValidateRequest) obj).token());
    }

    public int hashCode() {
        return this.token.hashCode() ^ 1000003;
    }
}
