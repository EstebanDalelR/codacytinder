package com.tinder.api.response;

import com.squareup.moshi.Json;
import com.tinder.api.response.ProfileResponse.ResponseData;

/* renamed from: com.tinder.api.response.$AutoValue_ProfileResponse */
abstract class C$AutoValue_ProfileResponse extends ProfileResponse {
    private final ResponseData responseData;

    C$AutoValue_ProfileResponse(ResponseData responseData) {
        if (responseData == null) {
            throw new NullPointerException("Null responseData");
        }
        this.responseData = responseData;
    }

    @Json(name = "data")
    public ResponseData responseData() {
        return this.responseData;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileResponse{responseData=");
        stringBuilder.append(this.responseData);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileResponse)) {
            return null;
        }
        return this.responseData.equals(((ProfileResponse) obj).responseData());
    }

    public int hashCode() {
        return this.responseData.hashCode() ^ 1000003;
    }
}
