package com.tinder.domain.meta.model;

final class AutoValue_ProfileSettings extends ProfileSettings {
    private final boolean photoOptimizerEnabled;
    private final boolean photoOptimizerHasResult;
    private final boolean showGender;

    static final class Builder extends com.tinder.domain.meta.model.ProfileSettings.Builder {
        private Boolean photoOptimizerEnabled;
        private Boolean photoOptimizerHasResult;
        private Boolean showGender;

        Builder() {
        }

        Builder(ProfileSettings profileSettings) {
            this.showGender = Boolean.valueOf(profileSettings.isShowGender());
            this.photoOptimizerEnabled = Boolean.valueOf(profileSettings.isPhotoOptimizerEnabled());
            this.photoOptimizerHasResult = Boolean.valueOf(profileSettings.isPhotoOptimizerHasResult());
        }

        public com.tinder.domain.meta.model.ProfileSettings.Builder showGender(boolean z) {
            this.showGender = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.meta.model.ProfileSettings.Builder photoOptimizerEnabled(boolean z) {
            this.photoOptimizerEnabled = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.meta.model.ProfileSettings.Builder photoOptimizerHasResult(boolean z) {
            this.photoOptimizerHasResult = Boolean.valueOf(z);
            return this;
        }

        public ProfileSettings build() {
            String str = "";
            if (this.showGender == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" showGender");
                str = stringBuilder.toString();
            }
            if (this.photoOptimizerEnabled == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" photoOptimizerEnabled");
                str = stringBuilder.toString();
            }
            if (this.photoOptimizerHasResult == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" photoOptimizerHasResult");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_ProfileSettings(this.showGender.booleanValue(), this.photoOptimizerEnabled.booleanValue(), this.photoOptimizerHasResult.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_ProfileSettings(boolean z, boolean z2, boolean z3) {
        this.showGender = z;
        this.photoOptimizerEnabled = z2;
        this.photoOptimizerHasResult = z3;
    }

    public boolean isShowGender() {
        return this.showGender;
    }

    public boolean isPhotoOptimizerEnabled() {
        return this.photoOptimizerEnabled;
    }

    public boolean isPhotoOptimizerHasResult() {
        return this.photoOptimizerHasResult;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileSettings{showGender=");
        stringBuilder.append(this.showGender);
        stringBuilder.append(", photoOptimizerEnabled=");
        stringBuilder.append(this.photoOptimizerEnabled);
        stringBuilder.append(", photoOptimizerHasResult=");
        stringBuilder.append(this.photoOptimizerHasResult);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileSettings)) {
            return false;
        }
        ProfileSettings profileSettings = (ProfileSettings) obj;
        if (this.showGender != profileSettings.isShowGender() || this.photoOptimizerEnabled != profileSettings.isPhotoOptimizerEnabled() || this.photoOptimizerHasResult != profileSettings.isPhotoOptimizerHasResult()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 1237;
        int i2 = ((((this.showGender ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.photoOptimizerEnabled ? 1231 : 1237)) * 1000003;
        if (this.photoOptimizerHasResult) {
            i = 1231;
        }
        return i2 ^ i;
    }
}
