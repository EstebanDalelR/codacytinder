package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.Photo;
import com.tinder.api.model.profile.AutoValue_ProfilePhotosResponse.MoshiJsonAdapter;
import java.util.List;

public abstract class ProfilePhotosResponse {
    @Nullable
    @Json(name = "photos_processing")
    public abstract Boolean arePhotosProcessing();

    @Nullable
    @Json(name = "photos")
    public abstract List<Photo> photos();

    public static JsonAdapter<ProfilePhotosResponse> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
