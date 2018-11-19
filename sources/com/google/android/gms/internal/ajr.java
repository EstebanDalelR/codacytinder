package com.google.android.gms.internal;

import android.text.TextUtils;

public final class ajr {
    /* renamed from: a */
    private final String f15331a;
    /* renamed from: b */
    private final String f15332b;

    public ajr(String str, String str2) {
        this.f15331a = str;
        this.f15332b = str2;
    }

    /* renamed from: a */
    public final String m19223a() {
        return this.f15331a;
    }

    /* renamed from: b */
    public final String m19224b() {
        return this.f15332b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ajr ajr = (ajr) obj;
        return TextUtils.equals(this.f15331a, ajr.f15331a) && TextUtils.equals(this.f15332b, ajr.f15332b);
    }

    public final int hashCode() {
        return (this.f15331a.hashCode() * 31) + this.f15332b.hashCode();
    }

    public final String toString() {
        String str = this.f15331a;
        String str2 = this.f15332b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 20) + String.valueOf(str2).length());
        stringBuilder.append("Header[name=");
        stringBuilder.append(str);
        stringBuilder.append(",value=");
        stringBuilder.append(str2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
