package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.profile.AutoValue_Share.MoshiJsonAdapter;

public abstract class Share {
    @Nullable
    @Json(name = "link")
    public abstract String link();

    @Nullable
    @Json(name = "share_text_v2")
    public abstract String shareText();

    public static JsonAdapter<Share> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
