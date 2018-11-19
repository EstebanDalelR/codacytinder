package com.tinder.api.request;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract class SuperLikeRatingRequest {

    public static abstract class Builder {
        public abstract SuperLikeRatingRequest build();

        public abstract Builder isCurrentUserBoosting(Boolean bool);

        public abstract Builder isCurrentUserPassporting(Boolean bool);

        public abstract Builder isFastMatch(Boolean bool);

        public abstract Builder isTopPicks(Boolean bool);

        public abstract Builder photoId(String str);

        public abstract Builder recId(String str);

        public abstract Builder sNumber(Long l);

        public abstract Builder wasRecUserPassporting(Boolean bool);
    }

    @Nullable
    public abstract Boolean isCurrentUserBoosting();

    @Nullable
    public abstract Boolean isCurrentUserPassporting();

    @Nullable
    public abstract Boolean isFastMatch();

    @Nullable
    public abstract Boolean isTopPicks();

    @Nullable
    public abstract String photoId();

    @NonNull
    public abstract String recId();

    @Nullable
    public abstract Long sNumber();

    @Nullable
    public abstract Boolean wasRecUserPassporting();

    public static Builder builder() {
        return new Builder();
    }
}
