package com.tinder.domain.meta.model;

import android.support.annotation.Nullable;
import org.joda.time.DateTime;

final class AutoValue_SelectSettings extends SelectSettings {
    private final DateTime dateAdded;
    private final int invitationCount;
    private final boolean isSelectedRecsEnabled;

    static final class Builder extends com.tinder.domain.meta.model.SelectSettings.Builder {
        private DateTime dateAdded;
        private Integer invitationCount;
        private Boolean isSelectedRecsEnabled;

        Builder() {
        }

        Builder(SelectSettings selectSettings) {
            this.dateAdded = selectSettings.dateAdded();
            this.invitationCount = Integer.valueOf(selectSettings.invitationCount());
            this.isSelectedRecsEnabled = Boolean.valueOf(selectSettings.isSelectedRecsEnabled());
        }

        public com.tinder.domain.meta.model.SelectSettings.Builder dateAdded(@Nullable DateTime dateTime) {
            this.dateAdded = dateTime;
            return this;
        }

        public com.tinder.domain.meta.model.SelectSettings.Builder invitationCount(int i) {
            this.invitationCount = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.meta.model.SelectSettings.Builder isSelectedRecsEnabled(boolean z) {
            this.isSelectedRecsEnabled = Boolean.valueOf(z);
            return this;
        }

        public SelectSettings build() {
            String str = "";
            if (this.invitationCount == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" invitationCount");
                str = stringBuilder.toString();
            }
            if (this.isSelectedRecsEnabled == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isSelectedRecsEnabled");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_SelectSettings(this.dateAdded, this.invitationCount.intValue(), this.isSelectedRecsEnabled.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_SelectSettings(@Nullable DateTime dateTime, int i, boolean z) {
        this.dateAdded = dateTime;
        this.invitationCount = i;
        this.isSelectedRecsEnabled = z;
    }

    @Nullable
    public DateTime dateAdded() {
        return this.dateAdded;
    }

    public int invitationCount() {
        return this.invitationCount;
    }

    public boolean isSelectedRecsEnabled() {
        return this.isSelectedRecsEnabled;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SelectSettings{dateAdded=");
        stringBuilder.append(this.dateAdded);
        stringBuilder.append(", invitationCount=");
        stringBuilder.append(this.invitationCount);
        stringBuilder.append(", isSelectedRecsEnabled=");
        stringBuilder.append(this.isSelectedRecsEnabled);
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
        r1 = r5 instanceof com.tinder.domain.meta.model.SelectSettings;
        r2 = 0;
        if (r1 == 0) goto L_0x0035;
    L_0x0009:
        r5 = (com.tinder.domain.meta.model.SelectSettings) r5;
        r1 = r4.dateAdded;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.dateAdded();
        if (r1 != 0) goto L_0x0033;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.dateAdded;
        r3 = r5.dateAdded();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0033;
    L_0x0022:
        r1 = r4.invitationCount;
        r3 = r5.invitationCount();
        if (r1 != r3) goto L_0x0033;
    L_0x002a:
        r1 = r4.isSelectedRecsEnabled;
        r5 = r5.isSelectedRecsEnabled();
        if (r1 != r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0034;
    L_0x0033:
        r0 = 0;
    L_0x0034:
        return r0;
    L_0x0035:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.meta.model.AutoValue_SelectSettings.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((((this.dateAdded == null ? 0 : this.dateAdded.hashCode()) ^ 1000003) * 1000003) ^ this.invitationCount) * 1000003) ^ (this.isSelectedRecsEnabled ? 1231 : 1237);
    }
}
