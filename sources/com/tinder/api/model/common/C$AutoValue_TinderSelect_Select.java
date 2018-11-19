package com.tinder.api.model.common;

import com.squareup.moshi.Json;
import com.tinder.api.model.common.TinderSelect.Select;
import javax.annotation.Nullable;

/* renamed from: com.tinder.api.model.common.$AutoValue_TinderSelect_Select */
abstract class C$AutoValue_TinderSelect_Select extends Select {
    private final String dateAdded;
    private final Integer invitationCount;
    private final Boolean recsEnabled;

    static final class Builder extends com.tinder.api.model.common.TinderSelect.Select.Builder {
        private String dateAdded;
        private Integer invitationCount;
        private Boolean recsEnabled;

        Builder() {
        }

        Builder(Select select) {
            this.dateAdded = select.dateAdded();
            this.invitationCount = select.invitationCount();
            this.recsEnabled = select.recsEnabled();
        }

        public com.tinder.api.model.common.TinderSelect.Select.Builder setDateAdded(@Nullable String str) {
            this.dateAdded = str;
            return this;
        }

        public com.tinder.api.model.common.TinderSelect.Select.Builder setInvitationCount(@Nullable Integer num) {
            this.invitationCount = num;
            return this;
        }

        public com.tinder.api.model.common.TinderSelect.Select.Builder setRecsEnabled(@Nullable Boolean bool) {
            this.recsEnabled = bool;
            return this;
        }

        public Select build() {
            return new AutoValue_TinderSelect_Select(this.dateAdded, this.invitationCount, this.recsEnabled);
        }
    }

    C$AutoValue_TinderSelect_Select(@Nullable String str, @Nullable Integer num, @Nullable Boolean bool) {
        this.dateAdded = str;
        this.invitationCount = num;
        this.recsEnabled = bool;
    }

    @Nullable
    @Json(name = "date_added")
    public String dateAdded() {
        return this.dateAdded;
    }

    @Nullable
    @Json(name = "invitation_count")
    public Integer invitationCount() {
        return this.invitationCount;
    }

    @Nullable
    @Json(name = "select_recs_enabled")
    public Boolean recsEnabled() {
        return this.recsEnabled;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Select{dateAdded=");
        stringBuilder.append(this.dateAdded);
        stringBuilder.append(", invitationCount=");
        stringBuilder.append(this.invitationCount);
        stringBuilder.append(", recsEnabled=");
        stringBuilder.append(this.recsEnabled);
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
        r1 = r5 instanceof com.tinder.api.model.common.TinderSelect.Select;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.model.common.TinderSelect.Select) r5;
        r1 = r4.dateAdded;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.dateAdded();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.dateAdded;
        r3 = r5.dateAdded();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.invitationCount;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.invitationCount();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.invitationCount;
        r3 = r5.invitationCount();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.recsEnabled;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.recsEnabled();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.recsEnabled;
        r5 = r5.recsEnabled();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_TinderSelect_Select.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.dateAdded == null ? 0 : this.dateAdded.hashCode()) ^ 1000003) * 1000003) ^ (this.invitationCount == null ? 0 : this.invitationCount.hashCode())) * 1000003;
        if (this.recsEnabled != null) {
            i = this.recsEnabled.hashCode();
        }
        return hashCode ^ i;
    }
}
