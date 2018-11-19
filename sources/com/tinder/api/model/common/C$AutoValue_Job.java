package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.tinder.api.model.common.Job.Company;
import com.tinder.api.model.common.Job.Title;

/* renamed from: com.tinder.api.model.common.$AutoValue_Job */
abstract class C$AutoValue_Job extends Job {
    private final Company company;
    private final Title title;

    static final class Builder extends com.tinder.api.model.common.Job.Builder {
        private Company company;
        private Title title;

        Builder() {
        }

        Builder(Job job) {
            this.company = job.company();
            this.title = job.title();
        }

        public com.tinder.api.model.common.Job.Builder setCompany(@Nullable Company company) {
            this.company = company;
            return this;
        }

        public com.tinder.api.model.common.Job.Builder setTitle(@Nullable Title title) {
            this.title = title;
            return this;
        }

        public Job build() {
            return new AutoValue_Job(this.company, this.title);
        }
    }

    C$AutoValue_Job(@Nullable Company company, @Nullable Title title) {
        this.company = company;
        this.title = title;
    }

    @Nullable
    protected Company company() {
        return this.company;
    }

    @Nullable
    protected Title title() {
        return this.title;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Job{company=");
        stringBuilder.append(this.company);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
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
        r1 = r5 instanceof com.tinder.api.model.common.Job;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.model.common.Job) r5;
        r1 = r4.company;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.company();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.company;
        r3 = r5.company();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.title;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.title();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.title;
        r5 = r5.title();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_Job.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.company == null ? 0 : this.company.hashCode()) ^ 1000003) * 1000003;
        if (this.title != null) {
            i = this.title.hashCode();
        }
        return hashCode ^ i;
    }
}
