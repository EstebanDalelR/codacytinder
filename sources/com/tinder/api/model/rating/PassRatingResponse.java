package com.tinder.api.model.rating;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.rating.AutoValue_PassRatingResponse.MoshiJsonAdapter;

public abstract class PassRatingResponse {
    @Nullable
    public abstract Integer status();

    @NonNull
    public static JsonAdapter<PassRatingResponse> jsonAdapter(@NonNull C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
