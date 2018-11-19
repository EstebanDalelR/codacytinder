package com.google.android.gms.gcm;

import android.os.Bundle;

/* renamed from: com.google.android.gms.gcm.j */
public final class C2552j {
    /* renamed from: a */
    public static final C2552j f7751a = new C2552j(0, 30, 3600);
    /* renamed from: b */
    private static C2552j f7752b = new C2552j(1, 30, 3600);
    /* renamed from: c */
    private final int f7753c;
    /* renamed from: d */
    private final int f7754d = 30;
    /* renamed from: e */
    private final int f7755e = 3600;

    private C2552j(int i, int i2, int i3) {
        this.f7753c = i;
    }

    /* renamed from: a */
    public final int m9287a() {
        return this.f7753c;
    }

    /* renamed from: a */
    public final Bundle m9288a(Bundle bundle) {
        bundle.putInt("retry_policy", this.f7753c);
        bundle.putInt("initial_backoff_seconds", this.f7754d);
        bundle.putInt("maximum_backoff_seconds", this.f7755e);
        return bundle;
    }

    /* renamed from: b */
    public final int m9289b() {
        return this.f7754d;
    }

    /* renamed from: c */
    public final int m9290c() {
        return this.f7755e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2552j)) {
            return false;
        }
        C2552j c2552j = (C2552j) obj;
        return c2552j.f7753c == this.f7753c && c2552j.f7754d == this.f7754d && c2552j.f7755e == this.f7755e;
    }

    public final int hashCode() {
        return (((((this.f7753c + 1) ^ 1000003) * 1000003) ^ this.f7754d) * 1000003) ^ this.f7755e;
    }

    public final String toString() {
        int i = this.f7753c;
        int i2 = this.f7754d;
        int i3 = this.f7755e;
        StringBuilder stringBuilder = new StringBuilder(74);
        stringBuilder.append("policy=");
        stringBuilder.append(i);
        stringBuilder.append(" initial_backoff=");
        stringBuilder.append(i2);
        stringBuilder.append(" maximum_backoff=");
        stringBuilder.append(i3);
        return stringBuilder.toString();
    }
}
