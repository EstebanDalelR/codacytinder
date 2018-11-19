package com.tinder.api.response;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.response.AutoValue_FastMatchCountResponse_Data.MoshiJsonAdapter;

public abstract class FastMatchCountResponse {

    public static abstract class Data {
        @Nullable
        public abstract Integer count();

        @Nullable
        @Json(name = "is_range")
        public abstract Boolean isRange();

        public static JsonAdapter<Data> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Meta {
        @Nullable
        public abstract Integer status();

        public static JsonAdapter<Meta> jsonAdapter(C5987p c5987p) {
            return new AutoValue_FastMatchCountResponse_Meta.MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    public abstract Data data();

    @Nullable
    public abstract Meta meta();

    public static JsonAdapter<FastMatchCountResponse> jsonAdapter(C5987p c5987p) {
        return new AutoValue_FastMatchCountResponse.MoshiJsonAdapter(c5987p);
    }
}
