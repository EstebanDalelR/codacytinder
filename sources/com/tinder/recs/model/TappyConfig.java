package com.tinder.recs.model;

public abstract class TappyConfig {

    public static abstract class Builder {
        public abstract TappyConfig build();

        public abstract Builder indicatorStartDelay(int i);

        public abstract Builder isTutorialShown(boolean z);
    }

    public abstract int indicatorStartDelay();

    public abstract boolean isTutorialShown();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder();
    }
}
