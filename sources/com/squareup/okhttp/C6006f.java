package com.squareup.okhttp;

import com.squareup.okhttp.internal.C6058i;

/* renamed from: com.squareup.okhttp.f */
public final class C6006f {
    /* renamed from: a */
    private final String f21956a;
    /* renamed from: b */
    private final String f21957b;

    public C6006f(String str, String str2) {
        this.f21956a = str;
        this.f21957b = str2;
    }

    /* renamed from: a */
    public String m25820a() {
        return this.f21956a;
    }

    /* renamed from: b */
    public String m25821b() {
        return this.f21957b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6006f) {
            C6006f c6006f = (C6006f) obj;
            if (C6058i.m26251a(this.f21956a, c6006f.f21956a) && C6058i.m26251a(this.f21957b, c6006f.f21957b) != null) {
                return true;
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (899 + (this.f21957b != null ? this.f21957b.hashCode() : 0)) * 31;
        if (this.f21956a != null) {
            i = this.f21956a.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f21956a);
        stringBuilder.append(" realm=\"");
        stringBuilder.append(this.f21957b);
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }
}
