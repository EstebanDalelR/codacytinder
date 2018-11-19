package com.tinder.domain.common.model;

import android.support.annotation.Nullable;

final class AutoValue_Job extends Job {
    private final boolean companyDisplayed;
    private final String companyId;
    private final String companyName;
    private final boolean titleDisplayed;
    private final String titleId;
    private final String titleName;

    static final class Builder extends com.tinder.domain.common.model.Job.Builder {
        private Boolean companyDisplayed;
        private String companyId;
        private String companyName;
        private Boolean titleDisplayed;
        private String titleId;
        private String titleName;

        Builder() {
        }

        Builder(Job job) {
            this.companyId = job.companyId();
            this.companyName = job.companyName();
            this.companyDisplayed = Boolean.valueOf(job.companyDisplayed());
            this.titleId = job.titleId();
            this.titleName = job.titleName();
            this.titleDisplayed = Boolean.valueOf(job.titleDisplayed());
        }

        public com.tinder.domain.common.model.Job.Builder companyId(@Nullable String str) {
            this.companyId = str;
            return this;
        }

        public com.tinder.domain.common.model.Job.Builder companyName(@Nullable String str) {
            this.companyName = str;
            return this;
        }

        public com.tinder.domain.common.model.Job.Builder companyDisplayed(boolean z) {
            this.companyDisplayed = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.common.model.Job.Builder titleId(@Nullable String str) {
            this.titleId = str;
            return this;
        }

        public com.tinder.domain.common.model.Job.Builder titleName(@Nullable String str) {
            this.titleName = str;
            return this;
        }

        public com.tinder.domain.common.model.Job.Builder titleDisplayed(boolean z) {
            this.titleDisplayed = Boolean.valueOf(z);
            return this;
        }

        public Job build() {
            String str = "";
            if (this.companyDisplayed == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" companyDisplayed");
                str = stringBuilder.toString();
            }
            if (this.titleDisplayed == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" titleDisplayed");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_Job(this.companyId, this.companyName, this.companyDisplayed.booleanValue(), this.titleId, this.titleName, this.titleDisplayed.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_Job(@Nullable String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable String str4, boolean z2) {
        this.companyId = str;
        this.companyName = str2;
        this.companyDisplayed = z;
        this.titleId = str3;
        this.titleName = str4;
        this.titleDisplayed = z2;
    }

    @Nullable
    public String companyId() {
        return this.companyId;
    }

    @Nullable
    public String companyName() {
        return this.companyName;
    }

    public boolean companyDisplayed() {
        return this.companyDisplayed;
    }

    @Nullable
    public String titleId() {
        return this.titleId;
    }

    @Nullable
    public String titleName() {
        return this.titleName;
    }

    public boolean titleDisplayed() {
        return this.titleDisplayed;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Job{companyId=");
        stringBuilder.append(this.companyId);
        stringBuilder.append(", companyName=");
        stringBuilder.append(this.companyName);
        stringBuilder.append(", companyDisplayed=");
        stringBuilder.append(this.companyDisplayed);
        stringBuilder.append(", titleId=");
        stringBuilder.append(this.titleId);
        stringBuilder.append(", titleName=");
        stringBuilder.append(this.titleName);
        stringBuilder.append(", titleDisplayed=");
        stringBuilder.append(this.titleDisplayed);
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
        r1 = r5 instanceof com.tinder.domain.common.model.Job;
        r2 = 0;
        if (r1 == 0) goto L_0x007a;
    L_0x0009:
        r5 = (com.tinder.domain.common.model.Job) r5;
        r1 = r4.companyId;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.companyId();
        if (r1 != 0) goto L_0x0078;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.companyId;
        r3 = r5.companyId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0078;
    L_0x0022:
        r1 = r4.companyName;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.companyName();
        if (r1 != 0) goto L_0x0078;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.companyName;
        r3 = r5.companyName();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0078;
    L_0x0039:
        r1 = r4.companyDisplayed;
        r3 = r5.companyDisplayed();
        if (r1 != r3) goto L_0x0078;
    L_0x0041:
        r1 = r4.titleId;
        if (r1 != 0) goto L_0x004c;
    L_0x0045:
        r1 = r5.titleId();
        if (r1 != 0) goto L_0x0078;
    L_0x004b:
        goto L_0x0058;
    L_0x004c:
        r1 = r4.titleId;
        r3 = r5.titleId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0078;
    L_0x0058:
        r1 = r4.titleName;
        if (r1 != 0) goto L_0x0063;
    L_0x005c:
        r1 = r5.titleName();
        if (r1 != 0) goto L_0x0078;
    L_0x0062:
        goto L_0x006f;
    L_0x0063:
        r1 = r4.titleName;
        r3 = r5.titleName();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0078;
    L_0x006f:
        r1 = r4.titleDisplayed;
        r5 = r5.titleDisplayed();
        if (r1 != r5) goto L_0x0078;
    L_0x0077:
        goto L_0x0079;
    L_0x0078:
        r0 = 0;
    L_0x0079:
        return r0;
    L_0x007a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.common.model.AutoValue_Job.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int i2 = 1237;
        int hashCode = ((((((((this.companyId == null ? 0 : this.companyId.hashCode()) ^ 1000003) * 1000003) ^ (this.companyName == null ? 0 : this.companyName.hashCode())) * 1000003) ^ (this.companyDisplayed ? 1231 : 1237)) * 1000003) ^ (this.titleId == null ? 0 : this.titleId.hashCode())) * 1000003;
        if (this.titleName != null) {
            i = this.titleName.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        if (this.titleDisplayed) {
            i2 = 1231;
        }
        return hashCode ^ i2;
    }

    public com.tinder.domain.common.model.Job.Builder toBuilder() {
        return new Builder(this);
    }
}
