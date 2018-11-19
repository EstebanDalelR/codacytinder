package com.tinder.api.request;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.request.AutoValue_ReportUserRequest.MoshiJsonAdapter;

public abstract class ReportUserRequest {

    public static abstract class Builder {
        public abstract ReportUserRequest build();

        public abstract Builder cause(Integer num);

        public abstract Builder text(String str);
    }

    @NonNull
    public abstract Integer cause();

    @Nullable
    public abstract String text();

    public static JsonAdapter<ReportUserRequest> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
