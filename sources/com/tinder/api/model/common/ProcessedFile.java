package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_ProcessedFile.MoshiJsonAdapter;

public abstract class ProcessedFile {
    @Nullable
    public abstract Integer height();

    @Nullable
    public abstract String url();

    @Nullable
    public abstract Integer width();

    public static JsonAdapter<ProcessedFile> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
