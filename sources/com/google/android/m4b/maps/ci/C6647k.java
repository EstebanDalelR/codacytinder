package com.google.android.m4b.maps.ci;

import android.graphics.Point;
import com.google.android.m4b.maps.cg.bj.C5149a;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.VisibleRegion;
import com.google.android.m4b.maps.p110j.C5461u;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.ci.k */
public final class C6647k implements C5149a {
    /* renamed from: a */
    public final int f24918a;
    /* renamed from: b */
    public final int f24919b;
    /* renamed from: c */
    public final int f24920c;
    /* renamed from: d */
    public final int f24921d;
    /* renamed from: e */
    public final CameraPosition f24922e;
    /* renamed from: f */
    public final int f24923f;
    /* renamed from: g */
    public final int f24924g;
    /* renamed from: h */
    public final double f24925h;
    /* renamed from: i */
    private final double f24926i;
    /* renamed from: j */
    private final Point f24927j;

    /* renamed from: com.google.android.m4b.maps.ci.k$a */
    public static class C5211a {
        /* renamed from: a */
        public long f19408a;
        /* renamed from: b */
        public long f19409b;

        public C5211a(long j, long j2) {
            this.f19408a = j;
            this.f19409b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C5211a)) {
                return false;
            }
            C5211a c5211a = (C5211a) obj;
            return C5461u.m23766a(Long.valueOf(this.f19408a), Long.valueOf(c5211a.f19408a)) && C5461u.m23766a(Long.valueOf(this.f19409b), Long.valueOf(c5211a.f19409b)) != null;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f19408a), Long.valueOf(this.f19409b)});
        }
    }

    /* renamed from: a */
    public static C5211a m29668a(LatLng latLng, double d, double d2) {
        C5571j.m24297a(d >= 0.0d);
        C5571j.m24292a((Object) latLng);
        double d3 = latLng.longitude;
        d = C6647k.m29667a(d, d2);
        d2 = d / 2.0d;
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        return new C5211a((long) (((d3 / 360.0d) * d) + d2), (long) (d2 - (((Math.log((sin + 1.0d) / (1.0d - sin)) / 4.0d) / 3.141592653589793d) * d)));
    }

    /* renamed from: a */
    public static double m29667a(double d, double d2) {
        return (Math.pow(2.0d, d) * 256.0d) * d2;
    }

    public C6647k(CameraPosition cameraPosition, int i, int i2, double d, int i3, int i4, int i5, int i6) {
        C5571j.m24292a((Object) cameraPosition);
        this.f24918a = i3;
        this.f24919b = i4;
        this.f24920c = i5;
        this.f24921d = i6;
        this.f24922e = cameraPosition;
        this.f24923f = i;
        this.f24924g = i2;
        this.f24925h = d;
        this.f24926i = (double) cameraPosition.zoom;
        this.f24927j = new Point(i3 + (((i - i3) - i5) / 2), i4 + (((i2 - i4) - i6) / 2));
    }

    /* renamed from: a */
    public final LatLng mo4987a(Point point) {
        C5211a a = C6647k.m29668a(this.f24922e.target, this.f24926i, this.f24925h);
        C5211a c5211a = new C5211a((a.f19408a - ((long) this.f24927j.x)) + ((long) point.x), (a.f19409b - ((long) this.f24927j.y)) + ((long) point.y));
        double a2 = C6647k.m29667a(this.f24926i, this.f24925h);
        return new LatLng(Math.toDegrees((Math.atan(Math.exp(((((double) (-c5211a.f19409b)) / a2) + 0.5d) * 6.283185307179586d)) * 2.0d) - 1.5707963267948966d), Math.toDegrees(((((double) c5211a.f19408a) / a2) - 0.5d) * 6.283185307179586d));
    }

    /* renamed from: a */
    public final Point mo4986a(LatLng latLng) {
        latLng = C6647k.m29668a(latLng, this.f24926i, this.f24925h);
        C5211a a = C6647k.m29668a(this.f24922e.target, this.f24926i, this.f24925h);
        long j = latLng.f19408a - a.f19408a;
        long b = m29672b();
        if (j > b / 2) {
            j -= b;
        }
        return new Point((int) (((long) this.f24927j.x) + (j < (-b) / 2 ? j + b : j)), (int) (((long) this.f24927j.y) + (latLng.f19409b - a.f19409b)));
    }

    /* renamed from: a */
    public final VisibleRegion mo4988a() {
        LatLng a = mo4987a(new Point(this.f24918a, this.f24919b));
        LatLng a2 = mo4987a(new Point(this.f24923f - this.f24920c, this.f24919b));
        LatLng a3 = mo4987a(new Point(this.f24918a, this.f24924g - this.f24921d));
        return new VisibleRegion(a3, mo4987a(new Point(this.f24923f - this.f24920c, this.f24924g - this.f24921d)), a, a2, new LatLngBounds(a3, a2));
    }

    /* renamed from: b */
    public final long m29672b() {
        return (long) C6647k.m29667a(this.f24926i, this.f24925h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24922e, Integer.valueOf(this.f24923f), Integer.valueOf(this.f24924g), Double.valueOf(this.f24925h), Integer.valueOf(this.f24918a), Integer.valueOf(this.f24919b), Integer.valueOf(this.f24920c), Integer.valueOf(this.f24921d)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6647k)) {
            return false;
        }
        C6647k c6647k = (C6647k) obj;
        return C5461u.m23766a(this.f24922e, c6647k.f24922e) && C5461u.m23766a(Integer.valueOf(this.f24923f), Integer.valueOf(c6647k.f24923f)) && C5461u.m23766a(Integer.valueOf(this.f24924g), Integer.valueOf(c6647k.f24924g)) && C5461u.m23766a(Double.valueOf(this.f24925h), Double.valueOf(c6647k.f24925h)) && C5461u.m23766a(Integer.valueOf(this.f24918a), Integer.valueOf(c6647k.f24918a)) && C5461u.m23766a(Integer.valueOf(this.f24919b), Integer.valueOf(c6647k.f24919b)) && C5461u.m23766a(Integer.valueOf(this.f24920c), Integer.valueOf(c6647k.f24920c)) && C5461u.m23766a(Integer.valueOf(this.f24921d), Integer.valueOf(c6647k.f24921d)) != null;
    }
}
