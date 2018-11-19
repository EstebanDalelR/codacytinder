package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_CommonConnection_Photo.MoshiJsonAdapter;

public abstract class CommonConnection {

    public static abstract class Photo {
        @Nullable
        public abstract String large();

        @Nullable
        public abstract String medium();

        @Nullable
        public abstract String small();

        public static JsonAdapter<Photo> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    public abstract Integer degree();

    @Nullable
    public abstract String id();

    @Nullable
    public abstract String name();

    @Nullable
    public abstract Photo photo();

    public static JsonAdapter<CommonConnection> jsonAdapter(C5987p c5987p) {
        return new AutoValue_CommonConnection.MoshiJsonAdapter(c5987p);
    }
}
