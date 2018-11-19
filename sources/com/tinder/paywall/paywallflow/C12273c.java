package com.tinder.paywall.paywallflow;

import com.tinder.paywall.paywallflow.C10076o.C10075b;

/* renamed from: com.tinder.paywall.paywallflow.c */
final class C12273c extends C10075b {
    /* renamed from: a */
    private final String f39711a;
    /* renamed from: b */
    private final String f39712b;

    C12273c(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f39711a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f39712b = str2;
    }

    /* renamed from: a */
    public String mo10728a() {
        return this.f39711a;
    }

    /* renamed from: b */
    public String mo10729b() {
        return this.f39712b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IntendedUser{name=");
        stringBuilder.append(this.f39711a);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(this.f39712b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10075b)) {
            return false;
        }
        C10075b c10075b = (C10075b) obj;
        if (!this.f39711a.equals(c10075b.mo10728a()) || this.f39712b.equals(c10075b.mo10729b()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f39711a.hashCode() ^ 1000003) * 1000003) ^ this.f39712b.hashCode();
    }
}
