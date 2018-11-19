package com.tinder.api.response;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.response.AutoValue_EmptyResponse.MoshiJsonAdapter;

public abstract class EmptyResponse {

    public static abstract class Builder {
        public abstract EmptyResponse build();

        public abstract Builder code(Integer num);

        public abstract Builder message(String str);
    }

    public abstract Integer code();

    public abstract String message();

    public static JsonAdapter<EmptyResponse> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
