package com.google.android.m4b.maps.bv;

import android.opengl.GLU;
import com.google.android.m4b.maps.bv.C4937l.C4936a;
import com.google.android.m4b.maps.bv.C4952u.C4951c;
import com.google.android.m4b.maps.bv.C6552x.C4957c;
import com.google.android.m4b.maps.bv.C6552x.C4960f;
import com.google.android.m4b.maps.bv.C6552x.C4963i;
import com.google.android.m4b.maps.cg.bp;
import com.google.android.m4b.maps.cg.bw;
import com.google.android.m4b.maps.p125y.C5571j;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bv.d */
abstract class C6549d implements C4936a, C4957c {
    /* renamed from: a */
    protected C4944q f24340a;
    /* renamed from: b */
    private af f24341b;
    /* renamed from: c */
    private int f24342c;
    /* renamed from: d */
    private float f24343d;
    /* renamed from: e */
    private int f24344e;
    /* renamed from: f */
    private int f24345f;
    /* renamed from: g */
    private int f24346g;
    /* renamed from: h */
    private int f24347h;
    /* renamed from: i */
    private final C4952u f24348i;
    /* renamed from: j */
    private final C4951c f24349j;
    /* renamed from: k */
    private C4937l[] f24350k;
    /* renamed from: l */
    private final aj f24351l = new aj();
    /* renamed from: m */
    private int[] f24352m;
    /* renamed from: n */
    private int[] f24353n;
    /* renamed from: o */
    private C4960f f24354o;
    /* renamed from: p */
    private float f24355p;

    public C6549d(C4952u c4952u, C4951c c4951c) {
        this.f24348i = c4952u;
        this.f24349j = c4951c;
    }

    /* renamed from: a */
    protected final void m28934a(C4944q c4944q, af afVar, int i, int i2, float f, int i3) {
        C4944q c4944q2 = c4944q;
        int i4 = i2;
        this.f24340a = c4944q2;
        this.f24341b = afVar;
        this.f24342c = i4;
        this.f24343d = ((float) i) / ((float) i4);
        this.f24345f = c4944q2.f18266f;
        this.f24346g = c4944q2.f18267g;
        this.f24347h = c4944q2.f18268h;
        this.f24344e = bp.m22988a(c4944q2.f18265e, c4944q2.f18266f, c4944q2.f18267g, c4944q2.f18268h);
        int min = Math.min(c4944q2.f18258B, this.f24344e);
        this.f24350k = new C4937l[min];
        for (int i5 = 0; i5 < min; i5++) {
            r10.f24350k[i5] = new C4937l(i5, (r10.f24344e - 1) - i5, r10, c4944q2.f18265e, c4944q2.f18266f, r10.f24346g, r10.f24347h, 1.0f, i3);
        }
        r10.f24355p = bp.m22984a(-r10.f24340a.f18280t, 360.0f);
    }

    /* renamed from: a */
    public void mo5202a(GL10 gl10, bw bwVar, C4960f c4960f, C4963i c4963i) {
        GL10 gl102 = gl10;
        if (this.f24340a != null) {
            C4937l c4937l;
            int a;
            int i;
            int i2;
            int i3;
            int i4;
            C4960f c4960f2;
            r0.f24354o = c4960f;
            float f = bwVar.m23055f();
            float f2 = 0.125f * f;
            gl102.glMatrixMode(5889);
            gl10.glLoadIdentity();
            GLU.gluPerspective(gl102, C6552x.m28941a(r0.f24343d) * f, r0.f24343d, 0.1f, 400.0f);
            gl102.glMatrixMode(5888);
            gl10.glLoadIdentity();
            gl102.glMultMatrixf(bwVar.m23048a(), 0);
            double o = (double) bp.m23007o(180.0f - r0.f24340a.f18281u);
            float f3 = 0.0f;
            gl102.glRotatef(-r0.f24340a.f18282v, (float) Math.cos(o), 0.0f, -((float) Math.sin(o)));
            gl102.glRotatef(r0.f24355p, 0.0f, 1.0f, 0.0f);
            f2 *= 2.0f;
            float f4 = (float) r0.f24342c;
            float e = bwVar.m23054e();
            int a2 = bp.m22987a((r0.f24344e - 1) - ((int) Math.floor((double) (bp.m22995d((f2 * ((float) r0.f24345f)) / f4) + (r0.f24343d > 1.0f ? 1.0f : 2.0f)))), 0, r0.f24350k.length - 1);
            if (e == 0.0f) {
                a2 = Math.min(a2, 3);
            }
            gl102.glMatrixMode(5888);
            gl10.glPushMatrix();
            if (c4963i != null) {
                float a3 = bp.m22986a(0.0f, 0.1f, 0.95f, 1.0f, c4963i.m22216a());
                gl102.glTranslatef((-c4963i.m22219c()) * a3, 0.0f, c4963i.m22220d() * a3);
                gl102.glEnable(2929);
                gl102.glClear(256);
            } else {
                gl102.glDisable(2929);
            }
            r0.f24351l.m22050a(gl102);
            while (true) {
                c4937l = r0.f24350k[a2];
                a = c4937l.m22122a();
                if (r0.f24352m == null || a > r0.f24352m.length) {
                    r0.f24352m = new int[a];
                    r0.f24353n = new int[a];
                }
                a = r0.f24351l.m22048a(c4937l.m22126a(c4963i != null), 0, a, r0.f24352m, 0, r0.f24352m.length);
                i = 0;
                for (i2 = 0; i2 < a; i2++) {
                    i3 = r0.f24352m[i2];
                    if (c4937l.m22125a(i3, c4963i != null).m22079a(r0.f24351l) > 0) {
                        i4 = i + 1;
                        r0.f24353n[i] = i3;
                        if (i4 > 16) {
                            i = i4;
                            break;
                        }
                        i = i4;
                    }
                }
                if (i <= 16 || a2 <= 0) {
                    gl102.glColor4x(0, 0, 0, 0);
                    c4960f2 = r0.f24354o;
                    c4960f2.f18325a = 0.0f;
                    c4960f2.f18326b = 0;
                } else {
                    a2--;
                }
            }
            gl102.glColor4x(0, 0, 0, 0);
            c4960f2 = r0.f24354o;
            c4960f2.f18325a = 0.0f;
            c4960f2.f18326b = 0;
            for (C4946s c4946s : r0.f24340a.f18279s) {
                if (r0.f24341b.m22104a((Object) c4946s) == null) {
                    m28933a(c4946s);
                }
            }
            int i5 = c4937l.f18216a;
            a = c4937l.f18217b;
            i2 = 0;
            while (i2 < i) {
                int i6;
                int i7;
                boolean z;
                int i8 = r0.f24353n[i2];
                i3 = i5 * a;
                i4 = i8 / i3;
                int a4 = c4937l.m22123a(i4);
                i8 %= i3;
                i3 = i8 / i5;
                i8 %= i5;
                C5571j.m24301b(r0.f24353n[i2] == c4937l.m22124a(i8, i3, i4));
                int i9 = r0.f24353n[i2];
                boolean z2 = c4963i != null;
                C4937l c4937l2 = r0.f24350k[a2];
                gl102.glMatrixMode(5890);
                gl10.glPushMatrix();
                int i10 = i3;
                float f5 = 1.0f;
                float f6 = 0.0f;
                Object obj = null;
                i3 = i8;
                i8 = a2;
                while (i8 >= 0) {
                    i6 = i5;
                    i7 = a2;
                    C4946s c4946s2 = new C4946s(r0.f24340a.f18269i, i3, i10, a4, i8);
                    a2 = r0.f24341b.m28928a(c4946s2);
                    if (a2 != 0) {
                        gl102.glBindTexture(3553, a2);
                        gl10.glLoadIdentity();
                        gl102.glTranslatef(f6, f3, 0.0f);
                        gl102.glScalef(f5, f5, 1.0f);
                        r0.f24354o.m22213a(f5);
                        z = true;
                        break;
                    }
                    if (obj == null) {
                        m28933a(c4946s2);
                        f = 2.0f;
                        obj = 1;
                    } else {
                        f = 2.0f;
                    }
                    f6 = (f6 / f) + (((float) (i3 & 1)) * 0.5f);
                    f3 = (f3 / f) + (((float) (i10 & 1)) * 0.5f);
                    i3 >>= 1;
                    i10 >>= 1;
                    i8--;
                    f5 *= 0.5f;
                    i5 = i6;
                    a2 = i7;
                }
                i6 = i5;
                i7 = a2;
                r0.f24354o.m22213a(0.0f);
                z = false;
                c4937l2.m22125a(i9, z2).m22081a(gl102, z);
                gl102.glMatrixMode(5890);
                gl10.glPopMatrix();
                i2++;
                i5 = i6;
                a2 = i7;
                f3 = 0.0f;
            }
            gl102.glMatrixMode(5888);
            gl10.glPopMatrix();
        }
    }

    /* renamed from: a */
    private void m28933a(C4946s c4946s) {
        this.f24348i.m22198a(this.f24349j, c4946s, true);
    }
}
