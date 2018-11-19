package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.tinder.api.model.common.Job.Company;

/* renamed from: com.tinder.api.model.common.$AutoValue_Job_Company */
abstract class C$AutoValue_Job_Company extends Company {
    private final Boolean displayed;
    private final String id;
    private final String name;

    static final class Builder extends com.tinder.api.model.common.Job.Company.Builder {
        private Boolean displayed;
        private String id;
        private String name;

        Builder() {
        }

        Builder(Company company) {
            this.id = company.id();
            this.name = company.name();
            this.displayed = company.displayed();
        }

        public com.tinder.api.model.common.Job.Company.Builder setId(@Nullable String str) {
            this.id = str;
            return this;
        }

        public com.tinder.api.model.common.Job.Company.Builder setName(@Nullable String str) {
            this.name = str;
            return this;
        }

        public com.tinder.api.model.common.Job.Company.Builder setDisplayed(@Nullable Boolean bool) {
            this.displayed = bool;
            return this;
        }

        public Company build() {
            return new AutoValue_Job_Company(this.id, this.name, this.displayed);
        }
    }

    C$AutoValue_Job_Company(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.id = str;
        this.name = str2;
        this.displayed = bool;
    }

    @Nullable
    public String id() {
        return this.id;
    }

    @Nullable
    public String name() {
        return this.name;
    }

    @Nullable
    public Boolean displayed() {
        return this.displayed;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Company{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", displayed=");
        stringBuilder.append(this.displayed);
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
        r1 = r5 instanceof com.tinder.api.model.common.Job.Company;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.model.common.Job.Company) r5;
        r1 = r4.id;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.id();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.name;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.name();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.displayed;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.displayed();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.displayed;
        r5 = r5.displayed();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_Job_Company.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.id == null ? 0 : this.id.hashCode()) ^ 1000003) * 1000003) ^ (this.name == null ? 0 : this.name.hashCode())) * 1000003;
        if (this.displayed != null) {
            i = this.displayed.hashCode();
        }
        return hashCode ^ i;
    }
}
