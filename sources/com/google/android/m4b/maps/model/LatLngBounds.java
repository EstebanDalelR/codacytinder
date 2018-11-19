package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p110j.C5462v;
import com.google.android.m4b.maps.p111k.C5468c;
import java.util.Arrays;

public final class LatLngBounds implements C5468c {
    public static final LatLngBoundsCreator CREATOR = new LatLngBoundsCreator();
    /* renamed from: a */
    private final int f25150a;
    public final LatLng northeast;
    public final LatLng southwest;

    public static final class Builder {
        /* renamed from: a */
        private double f20486a = Double.POSITIVE_INFINITY;
        /* renamed from: b */
        private double f20487b = Double.NEGATIVE_INFINITY;
        /* renamed from: c */
        private double f20488c = Double.NaN;
        /* renamed from: d */
        private double f20489d = Double.NaN;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public final com.google.android.m4b.maps.model.LatLngBounds.Builder m23861a(com.google.android.m4b.maps.model.LatLng r7) {
            /*
            r6 = this;
            r0 = r6.f20486a;
            r2 = r7.latitude;
            r0 = java.lang.Math.min(r0, r2);
            r6.f20486a = r0;
            r0 = r6.f20487b;
            r2 = r7.latitude;
            r0 = java.lang.Math.max(r0, r2);
            r6.f20487b = r0;
            r0 = r7.longitude;
            r2 = r6.f20488c;
            r7 = java.lang.Double.isNaN(r2);
            if (r7 == 0) goto L_0x0021;
        L_0x001e:
            r6.f20488c = r0;
            goto L_0x005a;
        L_0x0021:
            r2 = r6.f20488c;
            r4 = r6.f20489d;
            r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            r2 = 0;
            r3 = 1;
            if (r7 > 0) goto L_0x0038;
        L_0x002b:
            r4 = r6.f20488c;
            r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
            if (r7 > 0) goto L_0x0045;
        L_0x0031:
            r4 = r6.f20489d;
            r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
            if (r7 > 0) goto L_0x0045;
        L_0x0037:
            goto L_0x0044;
        L_0x0038:
            r4 = r6.f20488c;
            r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
            if (r7 <= 0) goto L_0x0044;
        L_0x003e:
            r4 = r6.f20489d;
            r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
            if (r7 > 0) goto L_0x0045;
        L_0x0044:
            r2 = 1;
        L_0x0045:
            if (r2 != 0) goto L_0x005c;
        L_0x0047:
            r2 = r6.f20488c;
            r2 = com.google.android.m4b.maps.model.LatLngBounds.m29994c(r2, r0);
            r4 = r6.f20489d;
            r4 = com.google.android.m4b.maps.model.LatLngBounds.m29995d(r4, r0);
            r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
            if (r7 >= 0) goto L_0x005a;
        L_0x0057:
            r6.f20488c = r0;
            goto L_0x005c;
        L_0x005a:
            r6.f20489d = r0;
        L_0x005c:
            return r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.model.LatLngBounds.Builder.a(com.google.android.m4b.maps.model.LatLng):com.google.android.m4b.maps.model.LatLngBounds$Builder");
        }

        /* renamed from: a */
        public final LatLngBounds m23862a() {
            C5462v.m23771a(Double.isNaN(this.f20488c) ^ 1, (Object) "no included points");
            return new LatLngBounds(new LatLng(this.f20486a, this.f20488c), new LatLng(this.f20487b, this.f20489d));
        }
    }

    /* renamed from: c */
    private static double m29994c(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    /* renamed from: d */
    private static double m29995d(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    public final int describeContents() {
        return 0;
    }

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        C5462v.m23768a((Object) latLng, (Object) "null southwest");
        C5462v.m23768a((Object) latLng2, (Object) "null northeast");
        C5462v.m23772a(latLng2.latitude >= latLng.latitude, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.latitude), Double.valueOf(latLng2.latitude));
        this.f25150a = i;
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this(1, latLng, latLng2);
    }

    /* renamed from: a */
    final int m29996a() {
        return this.f25150a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        LatLngBoundsCreator.m23863a(this, parcel, i);
    }

    public static Builder builder() {
        return new Builder();
    }

    public final boolean contains(LatLng latLng) {
        double d = latLng.latitude;
        Object obj = (this.southwest.latitude > d || d > this.northeast.latitude) ? null : 1;
        return (obj == null || m29992a(latLng.longitude) == null) ? false : true;
    }

    public final LatLngBounds including(LatLng latLng) {
        double min = Math.min(this.southwest.latitude, latLng.latitude);
        double max = Math.max(this.northeast.latitude, latLng.latitude);
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        double d3 = latLng.longitude;
        if (m29992a(d3) == null) {
            if (m29994c(d2, d3) < m29995d(d, d3)) {
                d2 = d3;
            } else {
                d = d3;
            }
        }
        return new LatLngBounds(new LatLng(min, d2), new LatLng(max, d));
    }

    public final LatLng getCenter() {
        double d = (this.southwest.latitude + this.northeast.latitude) / 2.0d;
        double d2 = this.northeast.longitude;
        double d3 = this.southwest.longitude;
        return new LatLng(d, d3 <= d2 ? (d2 + d3) / 2.0d : ((d2 + 360.0d) + d3) / 2.0d);
    }

    /* renamed from: a */
    private boolean m29992a(double d) {
        if (this.southwest.longitude <= this.northeast.longitude) {
            return this.southwest.longitude <= d && d <= this.northeast.longitude;
        } else {
            if (this.southwest.longitude > d) {
                if (d > this.northeast.longitude) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.southwest, this.northeast});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast) != null;
    }

    public final String toString() {
        return C5461u.m23765a(this).m23764a("southwest", this.southwest).m23764a("northeast", this.northeast).toString();
    }
}
