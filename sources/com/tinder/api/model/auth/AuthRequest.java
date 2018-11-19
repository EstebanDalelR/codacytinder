package com.tinder.api.model.auth;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.auth.AutoValue_AuthRequest.MoshiJsonAdapter;

public abstract class AuthRequest {

    public static abstract class Builder {
        public abstract Builder accessToken(String str);

        public abstract AuthRequest build();

        public abstract Builder clientVersion(String str);

        public abstract Builder id(String str);
    }

    @Json(name = "token")
    public abstract String accessToken();

    @Json(name = "client_version")
    public abstract String clientVersion();

    @Json(name = "id")
    public abstract String id();

    public static JsonAdapter<AuthRequest> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
