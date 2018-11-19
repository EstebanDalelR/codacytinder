package com.tinder.api.response.v2;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.recs.Rec;
import com.tinder.api.response.v2.AutoValue_FastMatchRecsResponse_Data.MoshiJsonAdapter;
import java.util.List;

public abstract class FastMatchRecsResponse {

    public static abstract class Data {
        @Nullable
        @Json(name = "new_count_token")
        public abstract String newCountToken();

        @Nullable
        @Json(name = "next_page_token")
        public abstract String nextPageToken();

        @Nullable
        public abstract List<Rec> results();

        public static JsonAdapter<Data> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Meta {
        @Nullable
        public abstract Integer status();

        public static JsonAdapter<Meta> jsonAdapter(C5987p c5987p) {
            return new AutoValue_FastMatchRecsResponse_Meta.MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    public abstract Data data();

    @Nullable
    public abstract Meta meta();

    public static JsonAdapter<FastMatchRecsResponse> jsonAdapter(C5987p c5987p) {
        return new AutoValue_FastMatchRecsResponse.MoshiJsonAdapter(c5987p);
    }
}
