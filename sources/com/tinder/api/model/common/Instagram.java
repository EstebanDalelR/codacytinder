package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_Instagram_Photo.MoshiJsonAdapter;
import java.util.List;

public abstract class Instagram {

    public static abstract class Photo {
        @Nullable
        public abstract String image();

        @Nullable
        public abstract String link();

        @Nullable
        public abstract String thumbnail();

        public abstract long ts();

        public static JsonAdapter<Photo> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    @Json(name = "completed_initial_fetch")
    public abstract Boolean completedInitialFetch();

    @Nullable
    @Json(name = "last_fetch_time")
    public abstract String lastFetchTime();

    @Nullable
    @Json(name = "media_count")
    public abstract Integer mediaCount();

    @Nullable
    public abstract List<Photo> photos();

    @Nullable
    @Json(name = "profile_picture")
    public abstract String profilePicture();

    @Nullable
    public abstract String username();

    public static JsonAdapter<Instagram> jsonAdapter(C5987p c5987p) {
        return new AutoValue_Instagram.MoshiJsonAdapter(c5987p);
    }

    public static Instagram newInstance(String str, String str2, int i, List<Photo> list, boolean z, String str3) {
        return new AutoValue_Instagram(str, str2, Integer.valueOf(i), list, Boolean.valueOf(z), str3);
    }
}
