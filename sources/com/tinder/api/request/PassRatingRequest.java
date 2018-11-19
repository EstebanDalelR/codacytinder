package com.tinder.api.request;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract class PassRatingRequest {

    public static abstract class Builder {
        public abstract PassRatingRequest build();

        public abstract Builder contentHash(String str);

        public abstract Builder didRecUserSuperlike(Boolean bool);

        public abstract Builder isCurrentUserBoosting(Boolean bool);

        public abstract Builder isFastMatch(Boolean bool);

        public abstract Builder isTopPicks(Boolean bool);

        public abstract Builder isUndo(Boolean bool);

        public abstract Builder photoId(String str);

        public abstract Builder recId(String str);

        public abstract Builder sNumber(Long l);
    }

    @Nullable
    public abstract String contentHash();

    @Nullable
    public abstract Boolean didRecUserSuperlike();

    @Nullable
    public abstract Boolean isCurrentUserBoosting();

    @Nullable
    public abstract Boolean isFastMatch();

    @Nullable
    public abstract Boolean isTopPicks();

    @Nullable
    public abstract Boolean isUndo();

    @Nullable
    public abstract String photoId();

    @NonNull
    public abstract String recId();

    @Nullable
    public abstract Long sNumber();

    public static Builder builder() {
        return new Builder();
    }
}
