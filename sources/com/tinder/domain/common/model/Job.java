package com.tinder.domain.common.model;

import android.support.annotation.Nullable;

public abstract class Job {

    public static abstract class Builder {
        public abstract Job build();

        public abstract Builder companyDisplayed(boolean z);

        public abstract Builder companyId(String str);

        public abstract Builder companyName(String str);

        public abstract Builder titleDisplayed(boolean z);

        public abstract Builder titleId(String str);

        public abstract Builder titleName(String str);
    }

    public abstract boolean companyDisplayed();

    @Nullable
    public abstract String companyId();

    @Nullable
    public abstract String companyName();

    public abstract boolean titleDisplayed();

    @Nullable
    public abstract String titleId();

    @Nullable
    public abstract String titleName();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder();
    }
}
