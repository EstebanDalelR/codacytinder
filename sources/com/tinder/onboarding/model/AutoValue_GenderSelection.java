package com.tinder.onboarding.model;

import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Gender.Value;

final class AutoValue_GenderSelection extends GenderSelection {
    private final String customGender;
    private final Value gender;
    private final Boolean showGenderOnProfile;

    static final class Builder extends com.tinder.onboarding.model.GenderSelection.Builder {
        private String customGender;
        private Value gender;
        private Boolean showGenderOnProfile;

        Builder() {
        }

        Builder(GenderSelection genderSelection) {
            this.gender = genderSelection.gender();
            this.customGender = genderSelection.customGender();
            this.showGenderOnProfile = genderSelection.showGenderOnProfile();
        }

        public com.tinder.onboarding.model.GenderSelection.Builder gender(@Nullable Value value) {
            this.gender = value;
            return this;
        }

        public com.tinder.onboarding.model.GenderSelection.Builder customGender(@Nullable String str) {
            this.customGender = str;
            return this;
        }

        public com.tinder.onboarding.model.GenderSelection.Builder showGenderOnProfile(@Nullable Boolean bool) {
            this.showGenderOnProfile = bool;
            return this;
        }

        public GenderSelection build() {
            return new AutoValue_GenderSelection(this.gender, this.customGender, this.showGenderOnProfile);
        }
    }

    private AutoValue_GenderSelection(@Nullable Value value, @Nullable String str, @Nullable Boolean bool) {
        this.gender = value;
        this.customGender = str;
        this.showGenderOnProfile = bool;
    }

    @Nullable
    public Value gender() {
        return this.gender;
    }

    @Nullable
    public String customGender() {
        return this.customGender;
    }

    @Nullable
    public Boolean showGenderOnProfile() {
        return this.showGenderOnProfile;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GenderSelection{gender=");
        stringBuilder.append(this.gender);
        stringBuilder.append(", customGender=");
        stringBuilder.append(this.customGender);
        stringBuilder.append(", showGenderOnProfile=");
        stringBuilder.append(this.showGenderOnProfile);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.onboarding.model.GenderSelection;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.onboarding.model.GenderSelection) r5;
        r1 = r4.gender;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.gender();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.gender;
        r3 = r5.gender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.customGender;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.customGender();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.customGender;
        r3 = r5.customGender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.showGenderOnProfile;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.showGenderOnProfile();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.showGenderOnProfile;
        r5 = r5.showGenderOnProfile();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0052;
    L_0x0051:
        r0 = 0;
    L_0x0052:
        return r0;
    L_0x0053:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.onboarding.model.AutoValue_GenderSelection.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.gender == null ? 0 : this.gender.hashCode()) ^ 1000003) * 1000003) ^ (this.customGender == null ? 0 : this.customGender.hashCode())) * 1000003;
        if (this.showGenderOnProfile != null) {
            i = this.showGenderOnProfile.hashCode();
        }
        return hashCode ^ i;
    }
}
