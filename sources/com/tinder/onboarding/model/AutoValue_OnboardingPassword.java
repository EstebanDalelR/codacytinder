package com.tinder.onboarding.model;

import android.support.annotation.Nullable;

final class AutoValue_OnboardingPassword extends OnboardingPassword {
    private final boolean changed;
    private final boolean exists;
    private final String text;

    static final class Builder extends com.tinder.onboarding.model.OnboardingPassword.Builder {
        private Boolean changed;
        private Boolean exists;
        private String text;

        Builder() {
        }

        Builder(OnboardingPassword onboardingPassword) {
            this.text = onboardingPassword.text();
            this.exists = Boolean.valueOf(onboardingPassword.exists());
            this.changed = Boolean.valueOf(onboardingPassword.changed());
        }

        public com.tinder.onboarding.model.OnboardingPassword.Builder text(@Nullable String str) {
            this.text = str;
            return this;
        }

        public com.tinder.onboarding.model.OnboardingPassword.Builder exists(boolean z) {
            this.exists = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.onboarding.model.OnboardingPassword.Builder changed(boolean z) {
            this.changed = Boolean.valueOf(z);
            return this;
        }

        public OnboardingPassword build() {
            String str = "";
            if (this.exists == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" exists");
                str = stringBuilder.toString();
            }
            if (this.changed == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" changed");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_OnboardingPassword(this.text, this.exists.booleanValue(), this.changed.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_OnboardingPassword(@Nullable String str, boolean z, boolean z2) {
        this.text = str;
        this.exists = z;
        this.changed = z2;
    }

    @Nullable
    public String text() {
        return this.text;
    }

    public boolean exists() {
        return this.exists;
    }

    public boolean changed() {
        return this.changed;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OnboardingPassword{text=");
        stringBuilder.append(this.text);
        stringBuilder.append(", exists=");
        stringBuilder.append(this.exists);
        stringBuilder.append(", changed=");
        stringBuilder.append(this.changed);
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
        r1 = r5 instanceof com.tinder.onboarding.model.OnboardingPassword;
        r2 = 0;
        if (r1 == 0) goto L_0x0035;
    L_0x0009:
        r5 = (com.tinder.onboarding.model.OnboardingPassword) r5;
        r1 = r4.text;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.text();
        if (r1 != 0) goto L_0x0033;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.text;
        r3 = r5.text();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0033;
    L_0x0022:
        r1 = r4.exists;
        r3 = r5.exists();
        if (r1 != r3) goto L_0x0033;
    L_0x002a:
        r1 = r4.changed;
        r5 = r5.changed();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.onboarding.model.AutoValue_OnboardingPassword.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 1237;
        int hashCode = ((((this.text == null ? 0 : this.text.hashCode()) ^ 1000003) * 1000003) ^ (this.exists ? 1231 : 1237)) * 1000003;
        if (this.changed) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public com.tinder.onboarding.model.OnboardingPassword.Builder toBuilder() {
        return new Builder(this);
    }
}
