package com.tinder.domain.meta.model;

public abstract class ProfileSettings {

    public static abstract class Builder {
        public abstract ProfileSettings build();

        public abstract Builder photoOptimizerEnabled(boolean z);

        public abstract Builder photoOptimizerHasResult(boolean z);

        public abstract Builder showGender(boolean z);
    }

    public abstract boolean isPhotoOptimizerEnabled();

    public abstract boolean isPhotoOptimizerHasResult();

    public abstract boolean isShowGender();

    public static Builder builder() {
        return new Builder();
    }
}
