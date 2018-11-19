package com.tinder.model;

import android.support.annotation.Nullable;

public final class Country {
    @Nullable
    private final String mCallingCode;
    @Nullable
    private final String mName;

    public static Country newInstance(@Nullable String str, @Nullable String str2) {
        return new Country(str, str2);
    }

    private Country(@Nullable String str, @Nullable String str2) {
        this.mCallingCode = str;
        this.mName = str2;
    }

    @Nullable
    public String getCallingCode() {
        return this.mCallingCode;
    }

    @Nullable
    public String getName() {
        return this.mName;
    }

    public boolean isCodeOrNameEmpty() {
        if (!(this.mCallingCode == null || this.mCallingCode.length() == 0 || this.mName == null)) {
            if (this.mName.length() != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x003c;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x003c;
    L_0x0012:
        r5 = (com.tinder.model.Country) r5;
        r2 = r4.mCallingCode;
        if (r2 == 0) goto L_0x0023;
    L_0x0018:
        r2 = r4.mCallingCode;
        r3 = r5.mCallingCode;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0028;
    L_0x0022:
        goto L_0x0027;
    L_0x0023:
        r2 = r5.mCallingCode;
        if (r2 == 0) goto L_0x0028;
    L_0x0027:
        return r1;
    L_0x0028:
        r2 = r4.mName;
        if (r2 == 0) goto L_0x0035;
    L_0x002c:
        r0 = r4.mName;
        r5 = r5.mName;
        r0 = r0.equals(r5);
        goto L_0x003b;
    L_0x0035:
        r5 = r5.mName;
        if (r5 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.model.Country.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.mCallingCode != null ? this.mCallingCode.hashCode() : 0) * 31;
        if (this.mName != null) {
            i = this.mName.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Country{mCallingCode='");
        stringBuilder.append(this.mCallingCode);
        stringBuilder.append('\'');
        stringBuilder.append(", mName='");
        stringBuilder.append(this.mName);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
