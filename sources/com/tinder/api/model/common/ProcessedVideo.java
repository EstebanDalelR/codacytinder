package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_ProcessedVideo.MoshiJsonAdapter;

public abstract class ProcessedVideo {
    @Nullable
    public abstract Integer height();

    @Nullable
    public abstract String url();

    @Nullable
    public abstract Integer width();

    public static JsonAdapter<ProcessedVideo> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
