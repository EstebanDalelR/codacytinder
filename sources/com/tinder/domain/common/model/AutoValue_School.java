package com.tinder.domain.common.model;

import android.support.annotation.Nullable;

final class AutoValue_School extends School {
    private final boolean displayed;
    private final String id;
    private final String name;

    static final class Builder extends com.tinder.domain.common.model.School.Builder {
        private Boolean displayed;
        private String id;
        private String name;

        Builder() {
        }

        Builder(School school) {
            this.name = school.name();
            this.id = school.id();
            this.displayed = Boolean.valueOf(school.displayed());
        }

        public com.tinder.domain.common.model.School.Builder name(String str) {
            this.name = str;
            return this;
        }

        public com.tinder.domain.common.model.School.Builder id(@Nullable String str) {
            this.id = str;
            return this;
        }

        public com.tinder.domain.common.model.School.Builder displayed(boolean z) {
            this.displayed = Boolean.valueOf(z);
            return this;
        }

        public School build() {
            String str = "";
            if (this.name == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" name");
                str = stringBuilder.toString();
            }
            if (this.displayed == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" displayed");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_School(this.name, this.id, this.displayed.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_School(String str, @Nullable String str2, boolean z) {
        this.name = str;
        this.id = str2;
        this.displayed = z;
    }

    public String name() {
        return this.name;
    }

    @Nullable
    public String id() {
        return this.id;
    }

    public boolean displayed() {
        return this.displayed;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("School{name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
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
        r1 = r5 instanceof com.tinder.domain.common.model.School;
        r2 = 0;
        if (r1 == 0) goto L_0x0039;
    L_0x0009:
        r5 = (com.tinder.domain.common.model.School) r5;
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0037;
    L_0x0017:
        r1 = r4.id;
        if (r1 != 0) goto L_0x0022;
    L_0x001b:
        r1 = r5.id();
        if (r1 != 0) goto L_0x0037;
    L_0x0021:
        goto L_0x002e;
    L_0x0022:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0037;
    L_0x002e:
        r1 = r4.displayed;
        r5 = r5.displayed();
        if (r1 != r5) goto L_0x0037;
    L_0x0036:
        goto L_0x0038;
    L_0x0037:
        r0 = 0;
    L_0x0038:
        return r0;
    L_0x0039:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.common.model.AutoValue_School.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((this.name.hashCode() ^ 1000003) * 1000003) ^ (this.id == null ? 0 : this.id.hashCode())) * 1000003) ^ (this.displayed ? 1231 : 1237);
    }

    public com.tinder.domain.common.model.School.Builder toBuilder() {
        return new Builder(this);
    }
}
