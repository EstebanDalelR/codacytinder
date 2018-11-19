package com.tinder.api.request;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.request.$AutoValue_GenderSettingsRequest */
abstract class C$AutoValue_GenderSettingsRequest extends GenderSettingsRequest {
    private final String customGender;
    private final Integer gender;
    private final Boolean showGenderOnProfile;
    private final Integer showMe;

    static final class Builder extends com.tinder.api.request.GenderSettingsRequest.Builder {
        private String customGender;
        private Integer gender;
        private Boolean showGenderOnProfile;
        private Integer showMe;

        Builder() {
        }

        Builder(GenderSettingsRequest genderSettingsRequest) {
            this.showGenderOnProfile = genderSettingsRequest.showGenderOnProfile();
            this.gender = genderSettingsRequest.gender();
            this.customGender = genderSettingsRequest.customGender();
            this.showMe = genderSettingsRequest.showMe();
        }

        public com.tinder.api.request.GenderSettingsRequest.Builder showGenderOnProfile(@Nullable Boolean bool) {
            this.showGenderOnProfile = bool;
            return this;
        }

        public com.tinder.api.request.GenderSettingsRequest.Builder gender(@Nullable Integer num) {
            this.gender = num;
            return this;
        }

        public com.tinder.api.request.GenderSettingsRequest.Builder customGender(@Nullable String str) {
            this.customGender = str;
            return this;
        }

        public com.tinder.api.request.GenderSettingsRequest.Builder showMe(@Nullable Integer num) {
            this.showMe = num;
            return this;
        }

        public GenderSettingsRequest build() {
            return new AutoValue_GenderSettingsRequest(this.showGenderOnProfile, this.gender, this.customGender, this.showMe);
        }
    }

    C$AutoValue_GenderSettingsRequest(@Nullable Boolean bool, @Nullable Integer num, @Nullable String str, @Nullable Integer num2) {
        this.showGenderOnProfile = bool;
        this.gender = num;
        this.customGender = str;
        this.showMe = num2;
    }

    @Nullable
    @Json(name = "show_gender_on_profile")
    public Boolean showGenderOnProfile() {
        return this.showGenderOnProfile;
    }

    @Nullable
    @Json(name = "gender")
    public Integer gender() {
        return this.gender;
    }

    @Nullable
    @Json(name = "custom_gender")
    public String customGender() {
        return this.customGender;
    }

    @Nullable
    @Json(name = "gender_filter")
    public Integer showMe() {
        return this.showMe;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GenderSettingsRequest{showGenderOnProfile=");
        stringBuilder.append(this.showGenderOnProfile);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.gender);
        stringBuilder.append(", customGender=");
        stringBuilder.append(this.customGender);
        stringBuilder.append(", showMe=");
        stringBuilder.append(this.showMe);
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
        r1 = r5 instanceof com.tinder.api.request.GenderSettingsRequest;
        r2 = 0;
        if (r1 == 0) goto L_0x006a;
    L_0x0009:
        r5 = (com.tinder.api.request.GenderSettingsRequest) r5;
        r1 = r4.showGenderOnProfile;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.showGenderOnProfile();
        if (r1 != 0) goto L_0x0068;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.showGenderOnProfile;
        r3 = r5.showGenderOnProfile();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0022:
        r1 = r4.gender;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.gender();
        if (r1 != 0) goto L_0x0068;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.gender;
        r3 = r5.gender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0039:
        r1 = r4.customGender;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.customGender();
        if (r1 != 0) goto L_0x0068;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.customGender;
        r3 = r5.customGender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0050:
        r1 = r4.showMe;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r5 = r5.showMe();
        if (r5 != 0) goto L_0x0068;
    L_0x005a:
        goto L_0x0069;
    L_0x005b:
        r1 = r4.showMe;
        r5 = r5.showMe();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0069;
    L_0x0068:
        r0 = 0;
    L_0x0069:
        return r0;
    L_0x006a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.request.$AutoValue_GenderSettingsRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((this.showGenderOnProfile == null ? 0 : this.showGenderOnProfile.hashCode()) ^ 1000003) * 1000003) ^ (this.gender == null ? 0 : this.gender.hashCode())) * 1000003) ^ (this.customGender == null ? 0 : this.customGender.hashCode())) * 1000003;
        if (this.showMe != null) {
            i = this.showMe.hashCode();
        }
        return hashCode ^ i;
    }
}
