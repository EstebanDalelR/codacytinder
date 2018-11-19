package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ay.C6409f;
import com.google.android.m4b.maps.de.C5338l;
import com.google.android.m4b.maps.de.C5351y;
import com.google.android.m4b.maps.model.LatLng;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.OutputStream;

public final class bn extends C6409f {
    /* renamed from: a */
    private final LatLng f27975a;
    /* renamed from: b */
    private final double f27976b;
    /* renamed from: c */
    private final double f27977c;
    /* renamed from: d */
    private final float f27978d;
    /* renamed from: e */
    private volatile boolean f27979e = false;
    /* renamed from: f */
    private C5151a f27980f;
    /* renamed from: g */
    private int f27981g;
    /* renamed from: h */
    private C5152b[] f27982h = null;

    /* renamed from: com.google.android.m4b.maps.cg.bn$a */
    public interface C5151a {
        /* renamed from: a */
        void mo5169a(bn bnVar);
    }

    /* renamed from: com.google.android.m4b.maps.cg.bn$b */
    public static class C5152b {
        /* renamed from: a */
        private final String[] f19123a;
        /* renamed from: b */
        private final int f19124b;
        /* renamed from: c */
        private final C4662a f19125c;

        public C5152b(int i, String[] strArr, C4662a c4662a) {
            this.f19124b = i;
            this.f19123a = strArr;
            this.f19125c = c4662a;
        }

        /* renamed from: a */
        public final String m22981a() {
            String str = this.f19123a.length > 0 ? this.f19123a[0] : "";
            String str2 = this.f19123a.length > 1 ? this.f19123a[1] : "";
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(str2).length());
            stringBuilder.append(str);
            stringBuilder.append(", ");
            stringBuilder.append(str2);
            return stringBuilder.toString();
        }
    }

    /* renamed from: g */
    public final int mo7034g() {
        return 50;
    }

    public bn(LatLng latLng, float f) {
        this.f27975a = latLng;
        this.f27976b = 1.0E-6d;
        this.f27977c = 1.0E-6d;
        this.f27978d = f;
    }

    /* renamed from: a */
    public final C5152b m32938a(int i) {
        if (this.f27982h.length <= 0) {
            return 0;
        }
        return this.f27982h[0];
    }

    /* renamed from: h */
    public final int mo7075h() {
        return this.f27982h != null ? this.f27982h.length : 0;
    }

    /* renamed from: a */
    public final void mo7032a(DataOutput dataOutput) {
        C4662a c4662a = new C4662a(C5351y.f20106a);
        c4662a.m20827b(1, m32936a(this.f27975a));
        LatLng latLng = this.f27975a;
        float f = this.f27978d;
        C4662a c4662a2 = new C4662a(C5338l.f20038e);
        c4662a2.m20827b(1, m32936a(latLng));
        c4662a2.m20841f(2, m32935a(1.0E-6d));
        c4662a2.m20841f(3, m32935a(1.0E-6d));
        if (f > 0.0f) {
            c4662a2.m20841f(4, (int) f);
        }
        c4662a.m20827b(3, c4662a2);
        c4662a.m20816a(4, true);
        c4662a.m20824a((OutputStream) dataOutput);
    }

    /* renamed from: a */
    private static C4662a m32936a(LatLng latLng) {
        C4662a c4662a = new C4662a(C5338l.f20037d);
        c4662a.m20841f(1, 1);
        C4662a c4662a2 = new C4662a(C5338l.f20034a);
        c4662a2.m20841f(1, m32935a(latLng.latitude));
        c4662a2.m20841f(2, m32935a(latLng.longitude));
        c4662a.m20827b(2, c4662a2);
        return c4662a;
    }

    /* renamed from: a */
    private static int m32935a(double d) {
        return (int) Math.round(d * 1000000.0d);
    }

    /* renamed from: a */
    public final boolean mo7033a(DataInput dataInput) {
        dataInput = C4665c.m20858a(C5351y.f20107b, dataInput);
        this.f27981g = dataInput.m20835d(1);
        if (this.f27981g == 0) {
            int k = dataInput.m20846k(2);
            this.f27982h = new C5152b[k];
            for (int i = 0; i < k; i++) {
                C4662a c = dataInput.m20833c(2, i);
                int d = c.m20842g(1).m20835d(1);
                String a = m32937a(2, 0, c);
                String a2 = m32937a(2, 1, c);
                this.f27982h[i] = new C5152b(d, new String[]{a, a2}, c.m20845j(3) ? c.m20842g(3) : null);
            }
        }
        this.f27979e = true;
        return true;
    }

    /* renamed from: d */
    public final void mo4881d() {
        super.mo4881d();
        if (this.f27980f != null) {
            this.f27980f.mo5169a(this);
        }
    }

    /* renamed from: a */
    private static String m32937a(int i, int i2, C4662a c4662a) {
        if (c4662a == null) {
            return "";
        }
        return c4662a.m20846k(2) > i2 ? c4662a.m20836d(2, i2) : "";
    }

    /* renamed from: a */
    public final void m32939a(C5151a c5151a) {
        this.f27980f = c5151a;
    }
}
