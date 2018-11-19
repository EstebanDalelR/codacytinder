package com.google.android.m4b.maps.bx;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.bb.C4749e;
import com.google.android.m4b.maps.bb.C4749e.C4748a;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C7490k;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.cb.C6580k;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bx.o */
public final class C7481o extends C6561r {
    /* renamed from: a */
    private final C5016a f27554a;
    /* renamed from: b */
    private final float[] f27555b;
    /* renamed from: c */
    private C5003c f27556c;
    /* renamed from: d */
    private final af f27557d;
    /* renamed from: e */
    private Bitmap f27558e;
    /* renamed from: f */
    private C5006e f27559f;
    /* renamed from: g */
    private Bitmap f27560g;
    /* renamed from: h */
    private C7490k f27561h;
    /* renamed from: i */
    private C5014a f27562i;
    /* renamed from: j */
    private int f27563j;
    /* renamed from: k */
    private int f27564k;
    /* renamed from: l */
    private int f27565l;
    /* renamed from: m */
    private int f27566m;
    /* renamed from: n */
    private float f27567n;
    /* renamed from: o */
    private final int f27568o;
    /* renamed from: p */
    private final C4749e f27569p;

    /* renamed from: com.google.android.m4b.maps.bx.o$a */
    public interface C5014a {
        /* renamed from: b */
        void mo4935b(C5003c c5003c);
    }

    public C7481o(Resources resources) {
        this(C5016a.BUBBLE, resources);
    }

    private C7481o(C5016a c5016a, Resources resources) {
        this.f27555b = new float[8];
        this.f27557d = new af();
        this.f27569p = new C4749e(3000, 10000, C4748a.FADE_BETWEEN, 65536, 32768);
        this.f27554a = c5016a;
        if (resources == null) {
            c5016a = 16776960;
        } else {
            c5016a = resources.getColor(C4513R.color.maps_bubble_highlight);
        }
        this.f27568o = c5016a;
    }

    /* renamed from: a */
    public final synchronized void m32477a(C5014a c5014a) {
        this.f27562i = c5014a;
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return this.f27554a;
    }

    /* renamed from: a */
    public final synchronized void mo7040a(C5052d c5052d) {
        m32474j();
    }

    /* renamed from: a */
    public final synchronized void mo7041a(C5052d c5052d, aj ajVar) {
        if (this.f27556c != null) {
            this.f27560g = m32475l();
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        this.f27567n = c6570b.m29231a(1.0f, c6570b.m29253i());
        if (!(c6570b.m29249e() == this.f27563j && c6570b.m29250f() == this.f27564k)) {
            this.f27563j = c6570b.m29249e();
            this.f27564k = c6570b.m29250f();
            if (this.f27560g != null) {
                m32474j();
                this.f27560g = m32475l();
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"WrongCall"})
    /* renamed from: a */
    public final void mo5222a(com.google.android.m4b.maps.ca.C5052d r9, com.google.android.m4b.maps.bz.C6570b r10, com.google.android.m4b.maps.bx.C5009j r11) {
        /*
        r8 = this;
        r11 = r11.m22388b();
        if (r11 != 0) goto L_0x015a;
    L_0x0006:
        monitor-enter(r8);
        r11 = r8.f27556c;	 Catch:{ all -> 0x0157 }
        if (r11 == 0) goto L_0x0155;
    L_0x000b:
        r11 = r8.f27560g;	 Catch:{ all -> 0x0157 }
        if (r11 != 0) goto L_0x0011;
    L_0x000f:
        goto L_0x0155;
    L_0x0011:
        r11 = r8.f27556c;	 Catch:{ all -> 0x0157 }
        r11 = r11.m_();	 Catch:{ all -> 0x0157 }
        r0 = r8.f27556c;	 Catch:{ all -> 0x0157 }
        r0 = r0.mo5284f();	 Catch:{ all -> 0x0157 }
        if (r0 == 0) goto L_0x0040;
    L_0x001f:
        if (r11 == 0) goto L_0x0040;
    L_0x0021:
        r1 = com.google.android.m4b.maps.bm.C6487i.m28476a();	 Catch:{ all -> 0x0157 }
        r0 = r0.m20902a();	 Catch:{ all -> 0x0157 }
        r0 = r1.m28504d(r0);	 Catch:{ all -> 0x0157 }
        if (r0 == 0) goto L_0x0040;
    L_0x002f:
        r1 = r8.f27557d;	 Catch:{ all -> 0x0157 }
        r1.m21482b(r11);	 Catch:{ all -> 0x0157 }
        r1 = r8.f27557d;	 Catch:{ all -> 0x0157 }
        r11 = r0.m28449a(r10, r11);	 Catch:{ all -> 0x0157 }
        r11 = (int) r11;	 Catch:{ all -> 0x0157 }
        r1.m21476a(r11);	 Catch:{ all -> 0x0157 }
        r11 = r8.f27557d;	 Catch:{ all -> 0x0157 }
    L_0x0040:
        r0 = r10.m29265u();	 Catch:{ all -> 0x0157 }
        r1 = r0.mo5129a();	 Catch:{ all -> 0x0157 }
        if (r11 != 0) goto L_0x004c;
    L_0x004a:
        monitor-exit(r8);	 Catch:{ all -> 0x0157 }
        return;
    L_0x004c:
        r1 = r1.mo5131a(r11);	 Catch:{ all -> 0x0157 }
        r2 = 0;
        r3 = 1;
        if (r1 == 0) goto L_0x005a;
    L_0x0054:
        r0 = r0.mo5131a(r11);	 Catch:{ all -> 0x0157 }
        if (r0 != 0) goto L_0x00a1;
    L_0x005a:
        r0 = r8.f27556c;	 Catch:{ all -> 0x0157 }
        r0 = r0.mo5282b(r10);	 Catch:{ all -> 0x0157 }
        if (r0 != 0) goto L_0x00a1;
    L_0x0062:
        r0 = r8.f27560g;	 Catch:{ all -> 0x0157 }
        if (r0 == 0) goto L_0x009c;
    L_0x0066:
        r0 = r8.f27556c;	 Catch:{ all -> 0x0157 }
        r0 = r0.m_();	 Catch:{ all -> 0x0157 }
        r0 = r10.m29243b(r0);	 Catch:{ all -> 0x0157 }
        r1 = r8.f27560g;	 Catch:{ all -> 0x0157 }
        r1 = r1.getWidth();	 Catch:{ all -> 0x0157 }
        r1 = r1 / 2;
        r4 = r8.f27560g;	 Catch:{ all -> 0x0157 }
        r4 = r4.getHeight();	 Catch:{ all -> 0x0157 }
        r5 = r0[r2];	 Catch:{ all -> 0x0157 }
        r5 = r5 - r1;
        r6 = r0[r2];	 Catch:{ all -> 0x0157 }
        r6 = r6 + r1;
        r1 = r0[r3];	 Catch:{ all -> 0x0157 }
        r1 = r1 - r4;
        r0 = r0[r3];	 Catch:{ all -> 0x0157 }
        r0 = r0 + r4;
        r4 = r10.m29249e();	 Catch:{ all -> 0x0157 }
        r7 = r10.m29250f();	 Catch:{ all -> 0x0157 }
        if (r6 < 0) goto L_0x009c;
    L_0x0094:
        if (r5 >= r4) goto L_0x009c;
    L_0x0096:
        if (r0 < 0) goto L_0x009c;
    L_0x0098:
        if (r1 >= r7) goto L_0x009c;
    L_0x009a:
        r0 = 1;
        goto L_0x009d;
    L_0x009c:
        r0 = 0;
    L_0x009d:
        if (r0 != 0) goto L_0x00a1;
    L_0x009f:
        monitor-exit(r8);	 Catch:{ all -> 0x0157 }
        return;
    L_0x00a1:
        r0 = r10.m29248d();	 Catch:{ all -> 0x0157 }
        if (r0 != 0) goto L_0x00c2;
    L_0x00a7:
        r0 = r8.f27555b;	 Catch:{ all -> 0x0157 }
        r10.m29238a(r11, r0);	 Catch:{ all -> 0x0157 }
        r11 = r8.f27555b;	 Catch:{ all -> 0x0157 }
        r11 = r11[r2];	 Catch:{ all -> 0x0157 }
        r11 = java.lang.Math.round(r11);	 Catch:{ all -> 0x0157 }
        r11 = (float) r11;	 Catch:{ all -> 0x0157 }
        r0 = r8.f27555b;	 Catch:{ all -> 0x0157 }
        r0 = r0[r3];	 Catch:{ all -> 0x0157 }
        r0 = java.lang.Math.round(r0);	 Catch:{ all -> 0x0157 }
        r0 = (float) r0;	 Catch:{ all -> 0x0157 }
        r11 = r10.m29247d(r11, r0);	 Catch:{ all -> 0x0157 }
    L_0x00c2:
        if (r11 != 0) goto L_0x00c6;
    L_0x00c4:
        monitor-exit(r8);	 Catch:{ all -> 0x0157 }
        return;
    L_0x00c6:
        r0 = r9.m22635x();	 Catch:{ all -> 0x0157 }
        r9.m22627p();	 Catch:{ all -> 0x0157 }
        r1 = 771; // 0x303 float:1.08E-42 double:3.81E-321;
        r0.glBlendFunc(r3, r1);	 Catch:{ all -> 0x0157 }
        r1 = 7681; // 0x1e01 float:1.0763E-41 double:3.795E-320;
        r2 = 8704; // 0x2200 float:1.2197E-41 double:4.3003E-320;
        r3 = 8960; // 0x2300 float:1.2556E-41 double:4.427E-320;
        r0.glTexEnvx(r3, r2, r1);	 Catch:{ all -> 0x0157 }
        r1 = r8.f27561h;	 Catch:{ all -> 0x0157 }
        if (r1 != 0) goto L_0x00ed;
    L_0x00df:
        r1 = new com.google.android.m4b.maps.ca.k;	 Catch:{ all -> 0x0157 }
        r1.<init>(r9);	 Catch:{ all -> 0x0157 }
        r8.f27561h = r1;	 Catch:{ all -> 0x0157 }
        r1 = r8.f27561h;	 Catch:{ all -> 0x0157 }
        r4 = r8.f27560g;	 Catch:{ all -> 0x0157 }
        r1.m32548b(r4);	 Catch:{ all -> 0x0157 }
    L_0x00ed:
        r0.glPushMatrix();	 Catch:{ all -> 0x0157 }
        r1 = r8.f27567n;	 Catch:{ all -> 0x0157 }
        com.google.android.m4b.maps.bx.an.m22324a(r9, r10, r11, r1);	 Catch:{ all -> 0x0157 }
        com.google.android.m4b.maps.bx.an.m22327a(r0, r10);	 Catch:{ all -> 0x0157 }
        r1 = r10.m29258n();	 Catch:{ all -> 0x0157 }
        r10 = r10.m29242b();	 Catch:{ all -> 0x0157 }
        r10 = com.google.android.m4b.maps.bo.af.m21470c(r1, r10, r11);	 Catch:{ all -> 0x0157 }
        r11 = r8.f27560g;	 Catch:{ all -> 0x0157 }
        r11 = r11.getWidth();	 Catch:{ all -> 0x0157 }
        r11 = (float) r11;	 Catch:{ all -> 0x0157 }
        r11 = r11 * r10;
        r1 = r8.f27560g;	 Catch:{ all -> 0x0157 }
        r1 = r1.getHeight();	 Catch:{ all -> 0x0157 }
        r1 = (float) r1;	 Catch:{ all -> 0x0157 }
        r1 = r1 * r10;
        r10 = -r11;
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r10 = r10 * r4;
        r4 = 0;
        r0.glTranslatef(r10, r4, r4);	 Catch:{ all -> 0x0157 }
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.glScalef(r11, r10, r1);	 Catch:{ all -> 0x0157 }
        r10 = r8.f27559f;	 Catch:{ all -> 0x0157 }
        r10 = r10.m22380a();	 Catch:{ all -> 0x0157 }
        if (r10 == 0) goto L_0x0144;
    L_0x012c:
        r10 = 8448; // 0x2100 float:1.1838E-41 double:4.174E-320;
        r0.glTexEnvx(r3, r2, r10);	 Catch:{ all -> 0x0157 }
        r10 = r8.f27568o;	 Catch:{ all -> 0x0157 }
        r11 = r10 >> 16;
        r1 = 65280; // 0xff00 float:9.1477E-41 double:3.22526E-319;
        r11 = r11 & r1;
        r2 = r10 >> 8;
        r2 = r2 & r1;
        r3 = r10 & r1;
        r10 = r10 << 8;
        r10 = r10 & r1;
        r0.glColor4x(r2, r3, r10, r11);	 Catch:{ all -> 0x0157 }
    L_0x0144:
        r10 = r9.f18688f;	 Catch:{ all -> 0x0157 }
        r11 = r9.f18685c;	 Catch:{ all -> 0x0157 }
        r8.m32472a(r0, r9, r10, r11);	 Catch:{ all -> 0x0157 }
        r0.glPopMatrix();	 Catch:{ all -> 0x0157 }
        monitor-exit(r8);	 Catch:{ all -> 0x0157 }
        r9 = r8.f27559f;
        r9.m22382c();
        goto L_0x015a;
    L_0x0155:
        monitor-exit(r8);	 Catch:{ all -> 0x0157 }
        return;
    L_0x0157:
        r9 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0157 }
        throw r9;
    L_0x015a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.o.a(com.google.android.m4b.maps.ca.d, com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.bx.j):void");
    }

    /* renamed from: a */
    private void m32472a(GL10 gl10, C5052d c5052d, C6580k c6580k, C6579g c6579g) {
        c6580k.mo7123d(c5052d);
        c6579g.mo7118d(c5052d);
        this.f27561h.m32544a(gl10);
        gl10.glDrawArrays(5, null, 4);
    }

    /* renamed from: d */
    private boolean m32473d(float f, float f2, C6570b c6570b) {
        if (this.f27556c != null) {
            if (this.f27556c.mo5283c() != null) {
                c6570b = c6570b.m29243b(this.f27556c.m_());
                int i = c6570b[0] - (this.f27565l / 2);
                int i2 = this.f27565l + i;
                if (f >= ((float) i)) {
                    if (f <= ((float) i2)) {
                        c6570b = c6570b[1];
                        if (f2 >= ((float) (c6570b - this.f27566m))) {
                            if (f2 <= ((float) c6570b)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final boolean mo7043a(float r1, float r2, com.google.android.m4b.maps.bo.af r3, com.google.android.m4b.maps.bz.C6570b r4) {
        /*
        r0 = this;
        monitor-enter(r0);
        r1 = r0.m32473d(r1, r2, r4);	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x000d;
    L_0x0007:
        r0.i_();	 Catch:{ all -> 0x001a }
        r1 = 1;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return r1;
    L_0x000d:
        r1 = r0.f27556c;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0017;
    L_0x0011:
        r0.m32486f();	 Catch:{ all -> 0x001a }
        r0.i_();	 Catch:{ all -> 0x001a }
    L_0x0017:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        r1 = 0;
        return r1;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.o.a(float, float, com.google.android.m4b.maps.bo.af, com.google.android.m4b.maps.bz.b):boolean");
    }

    public final boolean a_(float f, float f2, C6570b c6570b) {
        synchronized (this) {
            if (m32473d(f, f2, c6570b) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo7104b(float f, float f2, af afVar, C6570b c6570b) {
        synchronized (this) {
            if (m32473d(f, f2, c6570b) != null) {
                a_();
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo7105b(float f, float f2, C6570b c6570b) {
        if (m32473d(f, f2, c6570b) == null) {
            return false;
        }
        this.f27569p.m21088a();
        return true;
    }

    public final synchronized void a_() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final synchronized void m32476a(com.google.android.m4b.maps.bx.C5003c r3, com.google.android.m4b.maps.bx.C5006e r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r2.f27559f = r4;	 Catch:{ all -> 0x0053 }
        r0 = r2.f27569p;	 Catch:{ all -> 0x0053 }
        r0.m21088a();	 Catch:{ all -> 0x0053 }
        r0 = r2.f27556c;	 Catch:{ all -> 0x0053 }
        if (r0 != r3) goto L_0x002c;
    L_0x000c:
        r0 = r2.f27558e;	 Catch:{ all -> 0x0053 }
        r1 = r4.m22381b();	 Catch:{ all -> 0x0053 }
        if (r0 != r1) goto L_0x002c;
    L_0x0014:
        r3 = r2.f27556c;	 Catch:{ all -> 0x0053 }
        if (r3 == 0) goto L_0x001d;
    L_0x0018:
        r3 = r2.f27556c;	 Catch:{ all -> 0x0053 }
        r3.mo5281a();	 Catch:{ all -> 0x0053 }
    L_0x001d:
        r3 = r2.f27558e;	 Catch:{ all -> 0x0053 }
        if (r3 == 0) goto L_0x002a;
    L_0x0021:
        r2.m32474j();	 Catch:{ all -> 0x0053 }
        r3 = r2.m32475l();	 Catch:{ all -> 0x0053 }
        r2.f27560g = r3;	 Catch:{ all -> 0x0053 }
    L_0x002a:
        monitor-exit(r2);
        return;
    L_0x002c:
        r0 = r2.f27556c;	 Catch:{ all -> 0x0053 }
        if (r0 == 0) goto L_0x0035;
    L_0x0030:
        r0 = r2.f27556c;	 Catch:{ all -> 0x0053 }
        r0.l_();	 Catch:{ all -> 0x0053 }
    L_0x0035:
        r2.f27556c = r3;	 Catch:{ all -> 0x0053 }
        r3 = r2.f27556c;	 Catch:{ all -> 0x0053 }
        r3.mo5281a();	 Catch:{ all -> 0x0053 }
        if (r4 == 0) goto L_0x0044;
    L_0x003e:
        r3 = r4.m22381b();	 Catch:{ all -> 0x0053 }
        r2.f27558e = r3;	 Catch:{ all -> 0x0053 }
    L_0x0044:
        r3 = r2.f27558e;	 Catch:{ all -> 0x0053 }
        if (r3 == 0) goto L_0x0051;
    L_0x0048:
        r2.m32474j();	 Catch:{ all -> 0x0053 }
        r3 = r2.m32475l();	 Catch:{ all -> 0x0053 }
        r2.f27560g = r3;	 Catch:{ all -> 0x0053 }
    L_0x0051:
        monitor-exit(r2);
        return;
    L_0x0053:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.o.a(com.google.android.m4b.maps.bx.c, com.google.android.m4b.maps.bx.e):void");
    }

    /* renamed from: f */
    public final synchronized void m32486f() {
        if (this.f27556c != null) {
            this.f27556c.l_();
        }
        this.f27556c = null;
    }

    /* renamed from: j */
    private void m32474j() {
        if (this.f27561h != null) {
            this.f27561h.m32557f();
            this.f27561h = null;
        }
        if (this.f27560g != null) {
            this.f27560g.recycle();
            this.f27560g = null;
        }
    }

    protected final boolean i_() {
        boolean i_ = super.i_();
        if (this.f27562i == null) {
            return i_;
        }
        this.f27562i.mo4935b(this.f27556c);
        return true;
    }

    /* renamed from: l */
    private Bitmap m32475l() {
        this.f27565l = this.f27558e.getWidth();
        this.f27566m = this.f27558e.getHeight();
        int a = C7490k.m32534a(this.f27565l, 64);
        int a2 = C7490k.m32534a(this.f27566m, 32);
        Bitmap createBitmap = Bitmap.createBitmap(a, a2, Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate((float) ((a - this.f27565l) / 2), (float) (a2 - this.f27566m));
        canvas.drawBitmap(this.f27558e, 0.0f, 0.0f, new Paint());
        return createBitmap;
    }

    /* renamed from: a */
    public static void m32471a(C6570b c6570b, af afVar, int i, int i2, af afVar2) {
        C6570b c6570b2 = c6570b;
        float a = c6570b2.m29231a((float) i2, c6570b.m29253i());
        float a2 = c6570b2.m29231a((float) i, c6570b.m29253i());
        double cos = Math.cos(Math.toRadians((double) c6570b.m29255k()));
        double sin = Math.sin(Math.toRadians((double) c6570b.m29255k()));
        double cos2 = Math.cos(Math.toRadians((double) c6570b.m29254j()));
        double sin2 = Math.sin(Math.toRadians((double) c6570b.m29254j()));
        double d = (double) a;
        cos *= d;
        double d2 = (double) a2;
        afVar2.m21477a(afVar.m21490f() + ((int) ((cos * sin2) + (d2 * cos2))), afVar.m21492g() + ((int) ((cos * cos2) - (d2 * sin2))), afVar.m21494h() + ((int) (d * sin)));
    }
}
