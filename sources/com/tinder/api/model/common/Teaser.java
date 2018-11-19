package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_Teaser.MoshiJsonAdapter;

public abstract class Teaser {
    @Nullable
    public abstract String string();

    @Nullable
    public abstract String type();

    public static JsonAdapter<Teaser> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
