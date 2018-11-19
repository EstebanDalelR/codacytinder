package com.tinder.recs.model;

import android.support.annotation.Nullable;
import com.tinder.model.User;

public abstract class DeepLinkReferralInfo {

    public static abstract class Builder {
        public abstract Builder activityType(String str);

        public abstract DeepLinkReferralInfo build();

        public abstract Builder from(String str);

        public abstract Builder referralString(String str);

        public abstract Builder referralUrl(String str);

        public abstract Builder referrer(User user);
    }

    @Nullable
    public abstract String activityType();

    @Nullable
    public abstract String from();

    @Nullable
    public abstract String referralString();

    @Nullable
    public abstract String referralUrl();

    @Nullable
    public abstract User referrer();

    public static Builder builder() {
        return new Builder();
    }
}
