package com.tinder.domain.recs;

import android.support.annotation.Nullable;
import com.tinder.domain.common.model.User;

final class AutoValue_DeepLinkReferralInfo extends DeepLinkReferralInfo {
    private final String activityType;
    private final String from;
    private final String referralString;
    private final String referralUrl;
    private final User referrer;

    static final class Builder extends com.tinder.domain.recs.DeepLinkReferralInfo.Builder {
        private String activityType;
        private String from;
        private String referralString;
        private String referralUrl;
        private User referrer;

        Builder() {
        }

        Builder(DeepLinkReferralInfo deepLinkReferralInfo) {
            this.activityType = deepLinkReferralInfo.activityType();
            this.from = deepLinkReferralInfo.from();
            this.referralString = deepLinkReferralInfo.referralString();
            this.referralUrl = deepLinkReferralInfo.referralUrl();
            this.referrer = deepLinkReferralInfo.referrer();
        }

        public com.tinder.domain.recs.DeepLinkReferralInfo.Builder activityType(@Nullable String str) {
            this.activityType = str;
            return this;
        }

        public com.tinder.domain.recs.DeepLinkReferralInfo.Builder from(@Nullable String str) {
            this.from = str;
            return this;
        }

        public com.tinder.domain.recs.DeepLinkReferralInfo.Builder referralString(@Nullable String str) {
            this.referralString = str;
            return this;
        }

        public com.tinder.domain.recs.DeepLinkReferralInfo.Builder referralUrl(@Nullable String str) {
            this.referralUrl = str;
            return this;
        }

        public com.tinder.domain.recs.DeepLinkReferralInfo.Builder referrer(@Nullable User user) {
            this.referrer = user;
            return this;
        }

        public DeepLinkReferralInfo build() {
            return new AutoValue_DeepLinkReferralInfo(this.activityType, this.from, this.referralString, this.referralUrl, this.referrer);
        }
    }

    private AutoValue_DeepLinkReferralInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable User user) {
        this.activityType = str;
        this.from = str2;
        this.referralString = str3;
        this.referralUrl = str4;
        this.referrer = user;
    }

    @Nullable
    public String activityType() {
        return this.activityType;
    }

    @Nullable
    public String from() {
        return this.from;
    }

    @Nullable
    public String referralString() {
        return this.referralString;
    }

    @Nullable
    public String referralUrl() {
        return this.referralUrl;
    }

    @Nullable
    public User referrer() {
        return this.referrer;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeepLinkReferralInfo{activityType=");
        stringBuilder.append(this.activityType);
        stringBuilder.append(", from=");
        stringBuilder.append(this.from);
        stringBuilder.append(", referralString=");
        stringBuilder.append(this.referralString);
        stringBuilder.append(", referralUrl=");
        stringBuilder.append(this.referralUrl);
        stringBuilder.append(", referrer=");
        stringBuilder.append(this.referrer);
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
        r1 = r5 instanceof com.tinder.domain.recs.DeepLinkReferralInfo;
        r2 = 0;
        if (r1 == 0) goto L_0x0081;
    L_0x0009:
        r5 = (com.tinder.domain.recs.DeepLinkReferralInfo) r5;
        r1 = r4.activityType;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.activityType();
        if (r1 != 0) goto L_0x007f;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.activityType;
        r3 = r5.activityType();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0022:
        r1 = r4.from;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.from();
        if (r1 != 0) goto L_0x007f;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.from;
        r3 = r5.from();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0039:
        r1 = r4.referralString;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.referralString();
        if (r1 != 0) goto L_0x007f;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.referralString;
        r3 = r5.referralString();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0050:
        r1 = r4.referralUrl;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.referralUrl();
        if (r1 != 0) goto L_0x007f;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.referralUrl;
        r3 = r5.referralUrl();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x007f;
    L_0x0067:
        r1 = r4.referrer;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r5 = r5.referrer();
        if (r5 != 0) goto L_0x007f;
    L_0x0071:
        goto L_0x0080;
    L_0x0072:
        r1 = r4.referrer;
        r5 = r5.referrer();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x007f;
    L_0x007e:
        goto L_0x0080;
    L_0x007f:
        r0 = 0;
    L_0x0080:
        return r0;
    L_0x0081:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.recs.AutoValue_DeepLinkReferralInfo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.activityType == null ? 0 : this.activityType.hashCode()) ^ 1000003) * 1000003) ^ (this.from == null ? 0 : this.from.hashCode())) * 1000003) ^ (this.referralString == null ? 0 : this.referralString.hashCode())) * 1000003) ^ (this.referralUrl == null ? 0 : this.referralUrl.hashCode())) * 1000003;
        if (this.referrer != null) {
            i = this.referrer.hashCode();
        }
        return hashCode ^ i;
    }
}
