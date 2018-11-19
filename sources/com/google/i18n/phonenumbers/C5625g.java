package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import java.util.Arrays;

/* renamed from: com.google.i18n.phonenumbers.g */
public final class C5625g {
    /* renamed from: a */
    private final int f20892a;
    /* renamed from: b */
    private final String f20893b;
    /* renamed from: c */
    private final PhoneNumber f20894c;

    C5625g(int i, String str, PhoneNumber phoneNumber) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        }
        if (str != null) {
            if (phoneNumber != null) {
                this.f20892a = i;
                this.f20893b = str;
                this.f20894c = phoneNumber;
                return;
            }
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public int m24675a() {
        return this.f20892a;
    }

    /* renamed from: b */
    public int m24676b() {
        return this.f20892a + this.f20893b.length();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20892a), this.f20893b, this.f20894c});
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5625g)) {
            return false;
        }
        C5625g c5625g = (C5625g) obj;
        if (!this.f20893b.equals(c5625g.f20893b) || this.f20892a != c5625g.f20892a || this.f20894c.equals(c5625g.f20894c) == null) {
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PhoneNumberMatch [");
        stringBuilder.append(m24675a());
        stringBuilder.append(",");
        stringBuilder.append(m24676b());
        stringBuilder.append(") ");
        stringBuilder.append(this.f20893b);
        return stringBuilder.toString();
    }
}
