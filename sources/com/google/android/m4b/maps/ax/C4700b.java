package com.google.android.m4b.maps.ax;

/* renamed from: com.google.android.m4b.maps.ax.b */
public final class C4700b {
    /* renamed from: a */
    private final int f17285a;
    /* renamed from: b */
    private final int f17286b;

    public C4700b(int i, int i2) {
        if (i2 == -180000000) {
            i2 *= -1;
        }
        this.f17285a = i;
        this.f17286b = i2;
    }

    /* renamed from: a */
    public final int m20900a() {
        return this.f17285a;
    }

    /* renamed from: b */
    public final int m20901b() {
        return this.f17286b;
    }

    public final String toString() {
        String valueOf = String.valueOf(String.valueOf(this.f17285a));
        String valueOf2 = String.valueOf(String.valueOf(this.f17286b));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(",");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4700b)) {
            return false;
        }
        C4700b c4700b = (C4700b) obj;
        return c4700b.f17285a == this.f17285a && c4700b.f17286b == this.f17286b;
    }

    public final int hashCode() {
        return (this.f17285a * 29) + this.f17286b;
    }
}
