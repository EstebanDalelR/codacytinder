package com.tinder.api.giphy;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.giphy.AutoValue_GiphyApiResponse_Giphy.MoshiJsonAdapter;
import java.util.List;

public abstract class GiphyApiResponse {

    public static abstract class Giphy {
        @Nullable
        public abstract String id();

        @Nullable
        public abstract Images images();

        @Nullable
        public abstract String type();

        public static JsonAdapter<Giphy> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Image {
        public abstract int height();

        @Nullable
        public abstract String url();

        public abstract int width();

        public static JsonAdapter<Image> jsonAdapter(C5987p c5987p) {
            return new AutoValue_GiphyApiResponse_Image.MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Images {
        @Nullable
        @Json(name = "fixed_height")
        public abstract Image fixedHeightImage();

        public static JsonAdapter<Images> jsonAdapter(C5987p c5987p) {
            return new AutoValue_GiphyApiResponse_Images.MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    public abstract List<Giphy> data();

    public static JsonAdapter<GiphyApiResponse> jsonAdapter(C5987p c5987p) {
        return new AutoValue_GiphyApiResponse.MoshiJsonAdapter(c5987p);
    }
}
