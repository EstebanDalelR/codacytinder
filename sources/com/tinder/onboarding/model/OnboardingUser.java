package com.tinder.onboarding.model;

import android.support.annotation.NonNull;
import com.tinder.domain.common.model.Photo;
import java.util.List;
import java8.util.Optional;
import org.joda.time.LocalDate;

public class OnboardingUser {
    @NonNull
    private final Field<LocalDate> birthday;
    @NonNull
    private final Field<OnboardingEmail> email;
    @NonNull
    private final Field<GenderSelection> genderSelection;
    private final boolean isUnderage;
    @NonNull
    private final Field<String> name;
    @NonNull
    private final Field<OnboardingPassword> password;
    @NonNull
    private final Field<List<Photo>> photos;

    public static class Builder {
        @NonNull
        private Field<LocalDate> birthday = Field.ofOptional();
        @NonNull
        private Field<OnboardingEmail> email = Field.ofOptional();
        @NonNull
        private Field<GenderSelection> genderSelection = Field.ofOptional();
        private boolean isUnderage;
        @NonNull
        private Field<String> name = Field.ofOptional();
        @NonNull
        private Field<OnboardingPassword> password = Field.ofOptional();
        @NonNull
        private Field<List<Photo>> photos = Field.ofOptional();

        public Builder addName(@NonNull Optional<String> optional) {
            this.name = Field.ofRequired(optional);
            return this;
        }

        public Builder addBirthday(@NonNull Optional<LocalDate> optional) {
            this.birthday = Field.ofRequired(optional);
            return this;
        }

        public Builder addGenderSelection(@NonNull Optional<GenderSelection> optional) {
            this.genderSelection = Field.ofRequired(optional);
            return this;
        }

        public Builder addPhotos(@NonNull Optional<List<Photo>> optional) {
            this.photos = Field.ofRequired(optional);
            return this;
        }

        public Builder addEmail(@NonNull Optional<OnboardingEmail> optional) {
            this.email = Field.ofRequired(optional);
            return this;
        }

        public Builder addPassword(@NonNull Optional<OnboardingPassword> optional) {
            this.password = Field.ofRequired(optional);
            return this;
        }

        public Builder setUnderage(boolean z) {
            this.isUnderage = z;
            return this;
        }

        public OnboardingUser build() {
            return new OnboardingUser();
        }
    }

    private static class Field<T> {
        @NonNull
        private final Optional<T> mData;
        private final boolean mIsRequired;

        static <T> Field<T> ofRequired(@NonNull Optional<T> optional) {
            return new Field(true, optional);
        }

        static <T> Field<T> ofOptional() {
            return new Field(false, Optional.a());
        }

        private Field(boolean z, @NonNull Optional<T> optional) {
            this.mIsRequired = z;
            this.mData = optional;
        }

        public boolean isRequired() {
            return this.mIsRequired;
        }

        @NonNull
        public Optional<T> getData() {
            return this.mData;
        }
    }

    private OnboardingUser(Builder builder) {
        this.name = builder.name;
        this.birthday = builder.birthday;
        this.genderSelection = builder.genderSelection;
        this.photos = builder.photos;
        this.email = builder.email;
        this.password = builder.password;
        this.isUnderage = builder.isUnderage;
    }

    public boolean isNameRequired() {
        return this.name.isRequired();
    }

    @NonNull
    public Optional<String> getName() {
        return this.name.getData();
    }

    public boolean isBirthdayRequired() {
        return this.birthday.isRequired();
    }

    @NonNull
    public Optional<LocalDate> getBirthday() {
        return this.birthday.getData();
    }

    @NonNull
    public Optional<GenderSelection> getGenderSelection() {
        return this.genderSelection.getData();
    }

    public boolean isGenderSelectionRequired() {
        return this.genderSelection.isRequired();
    }

    public boolean isPhotosRequired() {
        return this.photos.isRequired();
    }

    @NonNull
    public Optional<List<Photo>> getPhotos() {
        return this.photos.getData();
    }

    @NonNull
    public Optional<OnboardingEmail> getEmail() {
        return this.email.getData();
    }

    public boolean isEmailRequired() {
        return this.email.isRequired();
    }

    @NonNull
    public Optional<OnboardingPassword> getPassword() {
        return this.password.getData();
    }

    public boolean isPasswordRequired() {
        return this.password.isRequired();
    }

    public boolean isUnderage() {
        return this.isUnderage;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                OnboardingUser onboardingUser = (OnboardingUser) obj;
                if (this.isUnderage != onboardingUser.isUnderage || !this.name.equals(onboardingUser.name) || !this.birthday.equals(onboardingUser.birthday) || !this.genderSelection.equals(onboardingUser.genderSelection) || !this.photos.equals(onboardingUser.photos)) {
                    return false;
                }
                if (!this.email.equals(onboardingUser.email) || this.password.equals(onboardingUser.password) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.name.hashCode() * 31) + this.birthday.hashCode()) * 31) + this.genderSelection.hashCode()) * 31) + this.photos.hashCode()) * 31) + this.email.hashCode()) * 31) + this.password.hashCode()) * 31) + this.isUnderage;
    }
}
