package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.CommonConnection;
import com.tinder.api.model.common.Interest;
import com.tinder.api.model.profile.AutoValue_Facebook.MoshiJsonAdapter;
import java.util.List;

public abstract class Facebook {
    @Nullable
    @Json(name = "common_connections")
    public abstract List<CommonConnection> commonConnections();

    @Nullable
    @Json(name = "common_interests")
    public abstract List<Interest> commonInterests();

    @Nullable
    @Json(name = "connection_count")
    public abstract Integer connectionCount();

    public static JsonAdapter<Facebook> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
