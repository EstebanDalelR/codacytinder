package com.tinder.domain.meta.model;

import android.support.annotation.Nullable;
import org.joda.time.DateTime;

final class AutoValue_Configuration extends Configuration {
    private final boolean isPhotoInProcessing;
    private final Location location;
    private final DateTime pingTime;

    static final class Builder extends com.tinder.domain.meta.model.Configuration.Builder {
        private Boolean isPhotoInProcessing;
        private Location location;
        private DateTime pingTime;

        Builder() {
        }

        Builder(Configuration configuration) {
            this.isPhotoInProcessing = Boolean.valueOf(configuration.isPhotoInProcessing());
            this.pingTime = configuration.pingTime();
            this.location = configuration.location();
        }

        public com.tinder.domain.meta.model.Configuration.Builder isPhotoInProcessing(boolean z) {
            this.isPhotoInProcessing = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.meta.model.Configuration.Builder pingTime(@Nullable DateTime dateTime) {
            this.pingTime = dateTime;
            return this;
        }

        public com.tinder.domain.meta.model.Configuration.Builder location(@Nullable Location location) {
            this.location = location;
            return this;
        }

        public Configuration build() {
            String str = "";
            if (this.isPhotoInProcessing == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isPhotoInProcessing");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_Configuration(this.isPhotoInProcessing.booleanValue(), this.pingTime, this.location);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_Configuration(boolean z, @Nullable DateTime dateTime, @Nullable Location location) {
        this.isPhotoInProcessing = z;
        this.pingTime = dateTime;
        this.location = location;
    }

    public boolean isPhotoInProcessing() {
        return this.isPhotoInProcessing;
    }

    @Nullable
    public DateTime pingTime() {
        return this.pingTime;
    }

    @Nullable
    public Location location() {
        return this.location;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Configuration{isPhotoInProcessing=");
        stringBuilder.append(this.isPhotoInProcessing);
        stringBuilder.append(", pingTime=");
        stringBuilder.append(this.pingTime);
        stringBuilder.append(", location=");
        stringBuilder.append(this.location);
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
        r1 = r5 instanceof com.tinder.domain.meta.model.Configuration;
        r2 = 0;
        if (r1 == 0) goto L_0x0044;
    L_0x0009:
        r5 = (com.tinder.domain.meta.model.Configuration) r5;
        r1 = r4.isPhotoInProcessing;
        r3 = r5.isPhotoInProcessing();
        if (r1 != r3) goto L_0x0042;
    L_0x0013:
        r1 = r4.pingTime;
        if (r1 != 0) goto L_0x001e;
    L_0x0017:
        r1 = r5.pingTime();
        if (r1 != 0) goto L_0x0042;
    L_0x001d:
        goto L_0x002a;
    L_0x001e:
        r1 = r4.pingTime;
        r3 = r5.pingTime();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0042;
    L_0x002a:
        r1 = r4.location;
        if (r1 != 0) goto L_0x0035;
    L_0x002e:
        r5 = r5.location();
        if (r5 != 0) goto L_0x0042;
    L_0x0034:
        goto L_0x0043;
    L_0x0035:
        r1 = r4.location;
        r5 = r5.location();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0043;
    L_0x0042:
        r0 = 0;
    L_0x0043:
        return r0;
    L_0x0044:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.meta.model.AutoValue_Configuration.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.isPhotoInProcessing ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.pingTime == null ? 0 : this.pingTime.hashCode())) * 1000003;
        if (this.location != null) {
            i = this.location.hashCode();
        }
        return hashCode ^ i;
    }
}
