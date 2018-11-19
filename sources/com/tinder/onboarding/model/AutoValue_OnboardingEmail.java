package com.tinder.onboarding.model;

import android.support.annotation.Nullable;

final class AutoValue_OnboardingEmail extends OnboardingEmail {
    private final Boolean allowMarketing;
    private final boolean allowMarketingEditable;
    private final Boolean defaultAllowMarketing;
    private final String email;
    private final boolean emailEditable;
    private final boolean isEmailRequired;
    private final boolean skipped;

    static final class Builder extends com.tinder.onboarding.model.OnboardingEmail.Builder {
        private Boolean allowMarketing;
        private Boolean allowMarketingEditable;
        private Boolean defaultAllowMarketing;
        private String email;
        private Boolean emailEditable;
        private Boolean isEmailRequired;
        private Boolean skipped;

        Builder() {
        }

        Builder(OnboardingEmail onboardingEmail) {
            this.email = onboardingEmail.email();
            this.allowMarketing = onboardingEmail.allowMarketing();
            this.defaultAllowMarketing = onboardingEmail.defaultAllowMarketing();
            this.skipped = Boolean.valueOf(onboardingEmail.skipped());
            this.emailEditable = Boolean.valueOf(onboardingEmail.emailEditable());
            this.allowMarketingEditable = Boolean.valueOf(onboardingEmail.allowMarketingEditable());
            this.isEmailRequired = Boolean.valueOf(onboardingEmail.isEmailRequired());
        }

        public com.tinder.onboarding.model.OnboardingEmail.Builder email(@Nullable String str) {
            this.email = str;
            return this;
        }

        public com.tinder.onboarding.model.OnboardingEmail.Builder allowMarketing(@Nullable Boolean bool) {
            this.allowMarketing = bool;
            return this;
        }

        public com.tinder.onboarding.model.OnboardingEmail.Builder defaultAllowMarketing(@Nullable Boolean bool) {
            this.defaultAllowMarketing = bool;
            return this;
        }

        public com.tinder.onboarding.model.OnboardingEmail.Builder skipped(boolean z) {
            this.skipped = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.onboarding.model.OnboardingEmail.Builder emailEditable(boolean z) {
            this.emailEditable = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.onboarding.model.OnboardingEmail.Builder allowMarketingEditable(boolean z) {
            this.allowMarketingEditable = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.onboarding.model.OnboardingEmail.Builder isEmailRequired(boolean z) {
            this.isEmailRequired = Boolean.valueOf(z);
            return this;
        }

        public OnboardingEmail build() {
            String str = "";
            if (this.skipped == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" skipped");
                str = stringBuilder.toString();
            }
            if (this.emailEditable == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" emailEditable");
                str = stringBuilder.toString();
            }
            if (this.allowMarketingEditable == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" allowMarketingEditable");
                str = stringBuilder.toString();
            }
            if (this.isEmailRequired == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isEmailRequired");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_OnboardingEmail(this.email, this.allowMarketing, this.defaultAllowMarketing, this.skipped.booleanValue(), this.emailEditable.booleanValue(), this.allowMarketingEditable.booleanValue(), this.isEmailRequired.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_OnboardingEmail(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.email = str;
        this.allowMarketing = bool;
        this.defaultAllowMarketing = bool2;
        this.skipped = z;
        this.emailEditable = z2;
        this.allowMarketingEditable = z3;
        this.isEmailRequired = z4;
    }

    @Nullable
    public String email() {
        return this.email;
    }

    @Nullable
    public Boolean allowMarketing() {
        return this.allowMarketing;
    }

    @Nullable
    public Boolean defaultAllowMarketing() {
        return this.defaultAllowMarketing;
    }

    public boolean skipped() {
        return this.skipped;
    }

    public boolean emailEditable() {
        return this.emailEditable;
    }

    public boolean allowMarketingEditable() {
        return this.allowMarketingEditable;
    }

    public boolean isEmailRequired() {
        return this.isEmailRequired;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OnboardingEmail{email=");
        stringBuilder.append(this.email);
        stringBuilder.append(", allowMarketing=");
        stringBuilder.append(this.allowMarketing);
        stringBuilder.append(", defaultAllowMarketing=");
        stringBuilder.append(this.defaultAllowMarketing);
        stringBuilder.append(", skipped=");
        stringBuilder.append(this.skipped);
        stringBuilder.append(", emailEditable=");
        stringBuilder.append(this.emailEditable);
        stringBuilder.append(", allowMarketingEditable=");
        stringBuilder.append(this.allowMarketingEditable);
        stringBuilder.append(", isEmailRequired=");
        stringBuilder.append(this.isEmailRequired);
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
        r1 = r5 instanceof com.tinder.onboarding.model.OnboardingEmail;
        r2 = 0;
        if (r1 == 0) goto L_0x0073;
    L_0x0009:
        r5 = (com.tinder.onboarding.model.OnboardingEmail) r5;
        r1 = r4.email;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.email();
        if (r1 != 0) goto L_0x0071;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.email;
        r3 = r5.email();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0071;
    L_0x0022:
        r1 = r4.allowMarketing;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.allowMarketing();
        if (r1 != 0) goto L_0x0071;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.allowMarketing;
        r3 = r5.allowMarketing();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0071;
    L_0x0039:
        r1 = r4.defaultAllowMarketing;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.defaultAllowMarketing();
        if (r1 != 0) goto L_0x0071;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.defaultAllowMarketing;
        r3 = r5.defaultAllowMarketing();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0071;
    L_0x0050:
        r1 = r4.skipped;
        r3 = r5.skipped();
        if (r1 != r3) goto L_0x0071;
    L_0x0058:
        r1 = r4.emailEditable;
        r3 = r5.emailEditable();
        if (r1 != r3) goto L_0x0071;
    L_0x0060:
        r1 = r4.allowMarketingEditable;
        r3 = r5.allowMarketingEditable();
        if (r1 != r3) goto L_0x0071;
    L_0x0068:
        r1 = r4.isEmailRequired;
        r5 = r5.isEmailRequired();
        if (r1 != r5) goto L_0x0071;
    L_0x0070:
        goto L_0x0072;
    L_0x0071:
        r0 = 0;
    L_0x0072:
        return r0;
    L_0x0073:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.onboarding.model.AutoValue_OnboardingEmail.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.email == null ? 0 : this.email.hashCode()) ^ 1000003) * 1000003) ^ (this.allowMarketing == null ? 0 : this.allowMarketing.hashCode())) * 1000003;
        if (this.defaultAllowMarketing != null) {
            i = this.defaultAllowMarketing.hashCode();
        }
        int i2 = 1237;
        hashCode = (((((((hashCode ^ i) * 1000003) ^ (this.skipped ? 1231 : 1237)) * 1000003) ^ (this.emailEditable ? 1231 : 1237)) * 1000003) ^ (this.allowMarketingEditable ? 1231 : 1237)) * 1000003;
        if (this.isEmailRequired) {
            i2 = 1231;
        }
        return hashCode ^ i2;
    }
}
