package com.google.android.m4b.maps.p117q;

import android.os.Parcel;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Locale;

/* renamed from: com.google.android.m4b.maps.q.n */
public final class C6763n implements C5468c {
    public static final C5515o CREATOR = new C5515o();
    /* renamed from: a */
    private final int f25323a;
    /* renamed from: b */
    private final String f25324b;
    /* renamed from: c */
    private final long f25325c;
    /* renamed from: d */
    private final short f25326d;
    /* renamed from: e */
    private final double f25327e;
    /* renamed from: f */
    private final double f25328f;
    /* renamed from: g */
    private final float f25329g;
    /* renamed from: h */
    private final int f25330h;
    /* renamed from: i */
    private final int f25331i;
    /* renamed from: j */
    private final int f25332j;

    public final int describeContents() {
        return 0;
    }

    public C6763n(int i, String str, int i2, short s, double d, double d2, float f, long j, int i3, int i4) {
        C6763n c6763n = this;
        String str2 = str;
        int i5 = i2;
        double d3 = d;
        double d4 = d2;
        float f2 = f;
        if (str2 != null) {
            if (str2.length() <= 100) {
                StringBuilder stringBuilder;
                if (f2 <= 0.0f) {
                    stringBuilder = new StringBuilder(31);
                    stringBuilder.append("invalid radius: ");
                    stringBuilder.append(f2);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                if (d3 <= 90.0d) {
                    if (d3 >= -90.0d) {
                        if (d4 <= 180.0d) {
                            if (d4 >= -180.0d) {
                                int i6 = i5 & 7;
                                if (i6 == 0) {
                                    StringBuilder stringBuilder2 = new StringBuilder(46);
                                    stringBuilder2.append("No supported transition specified: ");
                                    stringBuilder2.append(i5);
                                    throw new IllegalArgumentException(stringBuilder2.toString());
                                }
                                c6763n.f25323a = i;
                                c6763n.f25326d = s;
                                c6763n.f25324b = str2;
                                c6763n.f25327e = d3;
                                c6763n.f25328f = d4;
                                c6763n.f25329g = f2;
                                c6763n.f25325c = j;
                                c6763n.f25330h = i6;
                                c6763n.f25331i = i3;
                                c6763n.f25332j = i4;
                                return;
                            }
                        }
                        stringBuilder = new StringBuilder(43);
                        stringBuilder.append("invalid longitude: ");
                        stringBuilder.append(d4);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                stringBuilder = new StringBuilder(42);
                stringBuilder.append("invalid latitude: ");
                stringBuilder.append(d3);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        String str3 = "requestId is null or too long: ";
        str2 = String.valueOf(str2);
        throw new IllegalArgumentException(str2.length() != 0 ? str3.concat(str2) : new String(str3));
    }

    /* renamed from: a */
    public final int m30121a() {
        return this.f25323a;
    }

    /* renamed from: b */
    public final short m30122b() {
        return this.f25326d;
    }

    /* renamed from: c */
    public final double m30123c() {
        return this.f25327e;
    }

    /* renamed from: d */
    public final double m30124d() {
        return this.f25328f;
    }

    /* renamed from: e */
    public final float m30125e() {
        return this.f25329g;
    }

    /* renamed from: f */
    public final String m30126f() {
        return this.f25324b;
    }

    /* renamed from: g */
    public final long m30127g() {
        return this.f25325c;
    }

    /* renamed from: h */
    public final int m30128h() {
        return this.f25330h;
    }

    /* renamed from: i */
    public final int m30129i() {
        return this.f25331i;
    }

    /* renamed from: j */
    public final int m30130j() {
        return this.f25332j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C5515o.m24021a(this, parcel);
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]";
        Object[] objArr = new Object[9];
        objArr[0] = this.f25326d != (short) 1 ? null : "CIRCLE";
        objArr[1] = this.f25324b;
        objArr[2] = Integer.valueOf(this.f25330h);
        objArr[3] = Double.valueOf(this.f25327e);
        objArr[4] = Double.valueOf(this.f25328f);
        objArr[5] = Float.valueOf(this.f25329g);
        objArr[6] = Integer.valueOf(this.f25331i / AdError.NETWORK_ERROR_CODE);
        objArr[7] = Integer.valueOf(this.f25332j);
        objArr[8] = Long.valueOf(this.f25325c);
        return String.format(locale, str, objArr);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f25327e);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f25328f);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f25329g)) * 31) + this.f25326d) * 31) + this.f25330h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6763n)) {
            return false;
        }
        C6763n c6763n = (C6763n) obj;
        return this.f25329g == c6763n.f25329g && this.f25327e == c6763n.f25327e && this.f25328f == c6763n.f25328f && this.f25326d == c6763n.f25326d;
    }
}
