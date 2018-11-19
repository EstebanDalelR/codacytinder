package com.tinder.domain.common.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import org.joda.time.DateTime;

final class AutoValue_Interest extends Interest {
    private final DateTime createdTime;
    private final String id;
    private final String name;

    static final class Builder extends com.tinder.domain.common.model.Interest.Builder {
        private DateTime createdTime;
        private String id;
        private String name;

        Builder() {
        }

        Builder(Interest interest) {
            this.id = interest.id();
            this.createdTime = interest.createdTime();
            this.name = interest.name();
        }

        public com.tinder.domain.common.model.Interest.Builder id(String str) {
            this.id = str;
            return this;
        }

        public com.tinder.domain.common.model.Interest.Builder createdTime(@Nullable DateTime dateTime) {
            this.createdTime = dateTime;
            return this;
        }

        public com.tinder.domain.common.model.Interest.Builder name(String str) {
            this.name = str;
            return this;
        }

        public Interest build() {
            String str = "";
            if (this.id == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.name == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" name");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_Interest(this.id, this.createdTime, this.name);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_Interest(String str, @Nullable DateTime dateTime, String str2) {
        this.id = str;
        this.createdTime = dateTime;
        this.name = str2;
    }

    @NonNull
    public String id() {
        return this.id;
    }

    @Nullable
    public DateTime createdTime() {
        return this.createdTime;
    }

    @NonNull
    public String name() {
        return this.name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Interest{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", createdTime=");
        stringBuilder.append(this.createdTime);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
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
        r1 = r5 instanceof com.tinder.domain.common.model.Interest;
        r2 = 0;
        if (r1 == 0) goto L_0x003d;
    L_0x0009:
        r5 = (com.tinder.domain.common.model.Interest) r5;
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003b;
    L_0x0017:
        r1 = r4.createdTime;
        if (r1 != 0) goto L_0x0022;
    L_0x001b:
        r1 = r5.createdTime();
        if (r1 != 0) goto L_0x003b;
    L_0x0021:
        goto L_0x002e;
    L_0x0022:
        r1 = r4.createdTime;
        r3 = r5.createdTime();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003b;
    L_0x002e:
        r1 = r4.name;
        r5 = r5.name();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003c;
    L_0x003b:
        r0 = 0;
    L_0x003c:
        return r0;
    L_0x003d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.common.model.AutoValue_Interest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((this.id.hashCode() ^ 1000003) * 1000003) ^ (this.createdTime == null ? 0 : this.createdTime.hashCode())) * 1000003) ^ this.name.hashCode();
    }
}
