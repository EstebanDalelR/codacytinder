package com.tinder.onboarding.model;

import android.support.annotation.Nullable;

public abstract class OnboardingEmail {

    public static abstract class Builder {
        public abstract Builder allowMarketing(@Nullable Boolean bool);

        public abstract Builder allowMarketingEditable(boolean z);

        public abstract OnboardingEmail build();

        public abstract Builder defaultAllowMarketing(@Nullable Boolean bool);

        public abstract Builder email(@Nullable String str);

        public abstract Builder emailEditable(boolean z);

        public abstract Builder isEmailRequired(boolean z);

        public abstract Builder skipped(boolean z);
    }

    @Nullable
    public abstract Boolean allowMarketing();

    public abstract boolean allowMarketingEditable();

    @Nullable
    public abstract Boolean defaultAllowMarketing();

    @Nullable
    public abstract String email();

    public abstract boolean emailEditable();

    public abstract boolean isEmailRequired();

    public abstract boolean skipped();

    public static Builder builder() {
        return new Builder().skipped(false).emailEditable(true).allowMarketingEditable(true).isEmailRequired(false);
    }
}
