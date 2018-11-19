package com.tinder.api.model.meta;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.meta.Meta.ProfileEditingConfig;

/* renamed from: com.tinder.api.model.meta.$AutoValue_Meta_ProfileEditingConfig */
abstract class C$AutoValue_Meta_ProfileEditingConfig extends ProfileEditingConfig {
    private final Integer companyNameMaxLength;
    private final Integer jobTitleMaxLength;
    private final Integer schoolNameMaxLength;

    C$AutoValue_Meta_ProfileEditingConfig(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.schoolNameMaxLength = num;
        this.jobTitleMaxLength = num2;
        this.companyNameMaxLength = num3;
    }

    @Nullable
    @Json(name = "school_name_max_length")
    public Integer schoolNameMaxLength() {
        return this.schoolNameMaxLength;
    }

    @Nullable
    @Json(name = "job_title_max_length")
    public Integer jobTitleMaxLength() {
        return this.jobTitleMaxLength;
    }

    @Nullable
    @Json(name = "company_name_max_length")
    public Integer companyNameMaxLength() {
        return this.companyNameMaxLength;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileEditingConfig{schoolNameMaxLength=");
        stringBuilder.append(this.schoolNameMaxLength);
        stringBuilder.append(", jobTitleMaxLength=");
        stringBuilder.append(this.jobTitleMaxLength);
        stringBuilder.append(", companyNameMaxLength=");
        stringBuilder.append(this.companyNameMaxLength);
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
        r1 = r5 instanceof com.tinder.api.model.meta.Meta.ProfileEditingConfig;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.model.meta.Meta.ProfileEditingConfig) r5;
        r1 = r4.schoolNameMaxLength;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.schoolNameMaxLength();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.schoolNameMaxLength;
        r3 = r5.schoolNameMaxLength();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.jobTitleMaxLength;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.jobTitleMaxLength();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.jobTitleMaxLength;
        r3 = r5.jobTitleMaxLength();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.companyNameMaxLength;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.companyNameMaxLength();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.companyNameMaxLength;
        r5 = r5.companyNameMaxLength();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.meta.$AutoValue_Meta_ProfileEditingConfig.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.schoolNameMaxLength == null ? 0 : this.schoolNameMaxLength.hashCode()) ^ 1000003) * 1000003) ^ (this.jobTitleMaxLength == null ? 0 : this.jobTitleMaxLength.hashCode())) * 1000003;
        if (this.companyNameMaxLength != null) {
            i = this.companyNameMaxLength.hashCode();
        }
        return hashCode ^ i;
    }
}
