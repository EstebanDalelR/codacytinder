package com.tinder.model;

import android.support.annotation.Nullable;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;

public final class PhoneNumber {
    @Nullable
    private final Country mCountry;
    @Nullable
    private final String mLocalNumber;

    public static PhoneNumber newInstance(@Nullable Country country, @Nullable String str) {
        return new PhoneNumber(country, str);
    }

    private PhoneNumber(@Nullable Country country, @Nullable String str) {
        this.mCountry = country;
        this.mLocalNumber = str;
    }

    @Nullable
    public Country getCountry() {
        return this.mCountry;
    }

    @Nullable
    public String getLocalNumber() {
        return this.mLocalNumber;
    }

    public String getFullNumber() {
        Object obj = null;
        Object obj2 = (this.mCountry == null || this.mCountry.getCallingCode() == null) ? null : 1;
        if (this.mLocalNumber != null) {
            obj = 1;
        }
        if (obj2 == null || obj == null) {
            return obj != null ? this.mLocalNumber : "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("+");
            stringBuilder.append(this.mCountry.getCallingCode());
            stringBuilder.append(this.mLocalNumber);
            return stringBuilder.toString();
        }
    }

    public boolean isValid(PhoneNumberUtil phoneNumberUtil) throws NumberParseException {
        return phoneNumberUtil.b(phoneNumberUtil.a(getFullNumber(), null));
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
        r5 = (com.tinder.model.PhoneNumber) r5;
        r2 = r4.mCountry;
        if (r2 == 0) goto L_0x0023;
    L_0x0018:
        r2 = r4.mCountry;
        r3 = r5.mCountry;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0028;
    L_0x0022:
        goto L_0x0027;
    L_0x0023:
        r2 = r5.mCountry;
        if (r2 == 0) goto L_0x0028;
    L_0x0027:
        return r1;
    L_0x0028:
        r2 = r4.mLocalNumber;
        if (r2 == 0) goto L_0x0035;
    L_0x002c:
        r0 = r4.mLocalNumber;
        r5 = r5.mLocalNumber;
        r0 = r0.equals(r5);
        goto L_0x003b;
    L_0x0035:
        r5 = r5.mLocalNumber;
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.model.PhoneNumber.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.mCountry != null ? this.mCountry.hashCode() : 0) * 31;
        if (this.mLocalNumber != null) {
            i = this.mLocalNumber.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PhoneNumber{mCountry=");
        stringBuilder.append(this.mCountry);
        stringBuilder.append(", mLocalNumber='");
        stringBuilder.append(this.mLocalNumber);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
