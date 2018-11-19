package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.profile.AutoValue_Notification.MoshiJsonAdapter;
import java.util.List;

public abstract class Notification {
    @Nullable
    @Json(name = "reasons")
    public abstract List<Integer> reasons();

    @Json(name = "tier")
    public abstract int tier();

    @Json(name = "type")
    public abstract String type();

    public static JsonAdapter<Notification> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
