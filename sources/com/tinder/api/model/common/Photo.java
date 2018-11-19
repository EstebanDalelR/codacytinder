package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_Photo.MoshiJsonAdapter;
import java.util.List;

public abstract class Photo {
    @Nullable
    @Json(name = "crop")
    public abstract String crop();

    @Nullable
    @Json(name = "extension")
    public abstract String extension();

    @Nullable
    @Json(name = "fbid")
    public abstract String fbId();

    @Nullable
    @Json(name = "fileName")
    public abstract String fileName();

    @Nullable
    @Json(name = "id")
    public abstract String id();

    @Nullable
    @Json(name = "processedFiles")
    public abstract List<ProcessedFile> processedFiles();

    @Nullable
    @Json(name = "processedVideos")
    public abstract List<ProcessedVideo> processedVideos();

    @Nullable
    @Json(name = "selectRate")
    public abstract Float selectRate();

    @Nullable
    @Json(name = "success_rate")
    public abstract Double successRate();

    @Nullable
    @Json(name = "url")
    public abstract String url();

    @Nullable
    @Json(name = "xdistance_percent")
    public abstract Double xdistancePercent();

    @Nullable
    @Json(name = "xoffset_percent")
    public abstract Double xoffsetPercent();

    @Nullable
    @Json(name = "ydistance_percent")
    public abstract Double ydistancePercent();

    @Nullable
    @Json(name = "yoffset_percent")
    public abstract Double yoffsetPercent();

    public static JsonAdapter<Photo> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
