package com.tinder.api.request;

import android.support.annotation.Nullable;

/* renamed from: com.tinder.api.request.$AutoValue_UpdateProfileRequest */
abstract class C$AutoValue_UpdateProfileRequest extends UpdateProfileRequest {
    private final Integer ageMax;
    private final Integer ageMin;
    private final String bio;
    private final String customGender;
    private final Float distanceFilterInMiles;
    private final Integer gender;
    private final Boolean interestedInFemales;
    private final Boolean interestedInMales;

    static final class Builder extends com.tinder.api.request.UpdateProfileRequest.Builder {
        private Integer ageMax;
        private Integer ageMin;
        private String bio;
        private String customGender;
        private Float distanceFilterInMiles;
        private Integer gender;
        private Boolean interestedInFemales;
        private Boolean interestedInMales;

        Builder() {
        }

        Builder(UpdateProfileRequest updateProfileRequest) {
            this.interestedInMales = updateProfileRequest.interestedInMales();
            this.interestedInFemales = updateProfileRequest.interestedInFemales();
            this.distanceFilterInMiles = updateProfileRequest.distanceFilterInMiles();
            this.ageMin = updateProfileRequest.ageMin();
            this.ageMax = updateProfileRequest.ageMax();
            this.bio = updateProfileRequest.bio();
            this.gender = updateProfileRequest.gender();
            this.customGender = updateProfileRequest.customGender();
        }

        public com.tinder.api.request.UpdateProfileRequest.Builder interestedInMales(@Nullable Boolean bool) {
            this.interestedInMales = bool;
            return this;
        }

        public com.tinder.api.request.UpdateProfileRequest.Builder interestedInFemales(@Nullable Boolean bool) {
            this.interestedInFemales = bool;
            return this;
        }

        public com.tinder.api.request.UpdateProfileRequest.Builder distanceFilterInMiles(@Nullable Float f) {
            this.distanceFilterInMiles = f;
            return this;
        }

        public com.tinder.api.request.UpdateProfileRequest.Builder ageMin(@Nullable Integer num) {
            this.ageMin = num;
            return this;
        }

        public com.tinder.api.request.UpdateProfileRequest.Builder ageMax(@Nullable Integer num) {
            this.ageMax = num;
            return this;
        }

        public com.tinder.api.request.UpdateProfileRequest.Builder bio(@Nullable String str) {
            this.bio = str;
            return this;
        }

        public com.tinder.api.request.UpdateProfileRequest.Builder gender(@Nullable Integer num) {
            this.gender = num;
            return this;
        }

        public com.tinder.api.request.UpdateProfileRequest.Builder customGender(@Nullable String str) {
            this.customGender = str;
            return this;
        }

        public UpdateProfileRequest build() {
            return new AutoValue_UpdateProfileRequest(this.interestedInMales, this.interestedInFemales, this.distanceFilterInMiles, this.ageMin, this.ageMax, this.bio, this.gender, this.customGender);
        }
    }

    C$AutoValue_UpdateProfileRequest(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Float f, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, @Nullable String str2) {
        this.interestedInMales = bool;
        this.interestedInFemales = bool2;
        this.distanceFilterInMiles = f;
        this.ageMin = num;
        this.ageMax = num2;
        this.bio = str;
        this.gender = num3;
        this.customGender = str2;
    }

    @Nullable
    public Boolean interestedInMales() {
        return this.interestedInMales;
    }

    @Nullable
    public Boolean interestedInFemales() {
        return this.interestedInFemales;
    }

    @Nullable
    public Float distanceFilterInMiles() {
        return this.distanceFilterInMiles;
    }

    @Nullable
    public Integer ageMin() {
        return this.ageMin;
    }

    @Nullable
    public Integer ageMax() {
        return this.ageMax;
    }

    @Nullable
    public String bio() {
        return this.bio;
    }

    @Nullable
    public Integer gender() {
        return this.gender;
    }

    @Nullable
    public String customGender() {
        return this.customGender;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UpdateProfileRequest{interestedInMales=");
        stringBuilder.append(this.interestedInMales);
        stringBuilder.append(", interestedInFemales=");
        stringBuilder.append(this.interestedInFemales);
        stringBuilder.append(", distanceFilterInMiles=");
        stringBuilder.append(this.distanceFilterInMiles);
        stringBuilder.append(", ageMin=");
        stringBuilder.append(this.ageMin);
        stringBuilder.append(", ageMax=");
        stringBuilder.append(this.ageMax);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.bio);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.gender);
        stringBuilder.append(", customGender=");
        stringBuilder.append(this.customGender);
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
        r1 = r5 instanceof com.tinder.api.request.UpdateProfileRequest;
        r2 = 0;
        if (r1 == 0) goto L_0x00c6;
    L_0x0009:
        r5 = (com.tinder.api.request.UpdateProfileRequest) r5;
        r1 = r4.interestedInMales;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.interestedInMales();
        if (r1 != 0) goto L_0x00c4;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.interestedInMales;
        r3 = r5.interestedInMales();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0022:
        r1 = r4.interestedInFemales;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.interestedInFemales();
        if (r1 != 0) goto L_0x00c4;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.interestedInFemales;
        r3 = r5.interestedInFemales();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0039:
        r1 = r4.distanceFilterInMiles;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.distanceFilterInMiles();
        if (r1 != 0) goto L_0x00c4;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.distanceFilterInMiles;
        r3 = r5.distanceFilterInMiles();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0050:
        r1 = r4.ageMin;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.ageMin();
        if (r1 != 0) goto L_0x00c4;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.ageMin;
        r3 = r5.ageMin();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0067:
        r1 = r4.ageMax;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.ageMax();
        if (r1 != 0) goto L_0x00c4;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.ageMax;
        r3 = r5.ageMax();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x007e:
        r1 = r4.bio;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.bio();
        if (r1 != 0) goto L_0x00c4;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.bio;
        r3 = r5.bio();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0095:
        r1 = r4.gender;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r5.gender();
        if (r1 != 0) goto L_0x00c4;
    L_0x009f:
        goto L_0x00ac;
    L_0x00a0:
        r1 = r4.gender;
        r3 = r5.gender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x00ac:
        r1 = r4.customGender;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b0:
        r5 = r5.customGender();
        if (r5 != 0) goto L_0x00c4;
    L_0x00b6:
        goto L_0x00c5;
    L_0x00b7:
        r1 = r4.customGender;
        r5 = r5.customGender();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00c5;
    L_0x00c4:
        r0 = 0;
    L_0x00c5:
        return r0;
    L_0x00c6:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.request.$AutoValue_UpdateProfileRequest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((this.interestedInMales == null ? 0 : this.interestedInMales.hashCode()) ^ 1000003) * 1000003) ^ (this.interestedInFemales == null ? 0 : this.interestedInFemales.hashCode())) * 1000003) ^ (this.distanceFilterInMiles == null ? 0 : this.distanceFilterInMiles.hashCode())) * 1000003) ^ (this.ageMin == null ? 0 : this.ageMin.hashCode())) * 1000003) ^ (this.ageMax == null ? 0 : this.ageMax.hashCode())) * 1000003) ^ (this.bio == null ? 0 : this.bio.hashCode())) * 1000003) ^ (this.gender == null ? 0 : this.gender.hashCode())) * 1000003;
        if (this.customGender != null) {
            i = this.customGender.hashCode();
        }
        return hashCode ^ i;
    }
}
