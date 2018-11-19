package com.tinder.onboarding.model;

import android.support.annotation.NonNull;
import java.io.File;

public class OnboardingUserPhoto {
    @NonNull
    File mPhoto;

    public static class Builder {
        private final File mPhoto;

        public Builder(File file) {
            this.mPhoto = file;
        }

        public OnboardingUserPhoto build() {
            return new OnboardingUserPhoto();
        }
    }

    private OnboardingUserPhoto(Builder builder) {
        this.mPhoto = builder.mPhoto;
    }

    public File getPhoto() {
        return this.mPhoto;
    }
}
