package com.google.android.m4b.maps.cc;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.m4b.maps.ax.C4700b;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.ay.C4725p;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.bp;
import com.google.android.m4b.maps.bx.C5003c;
import com.google.android.m4b.maps.bx.C8076q;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C7490k;
import com.google.android.m4b.maps.cb.C6579g;
import com.google.android.m4b.maps.cg.az;

/* renamed from: com.google.android.m4b.maps.cc.m */
public final class C6586m implements C5003c, Comparable<C6586m> {
    /* renamed from: H */
    private static float[] f24675H = new float[8];
    /* renamed from: I */
    private static af f24676I = new af();
    /* renamed from: J */
    private static int f24677J;
    /* renamed from: A */
    private int f24678A;
    /* renamed from: B */
    private final int f24679B;
    /* renamed from: C */
    private final int f24680C;
    /* renamed from: D */
    private final int f24681D;
    /* renamed from: E */
    private final int f24682E;
    /* renamed from: F */
    private boolean f24683F;
    /* renamed from: G */
    private bp f24684G;
    /* renamed from: K */
    private final af f24685K = new af();
    /* renamed from: L */
    private int f24686L;
    /* renamed from: M */
    private int f24687M;
    /* renamed from: N */
    private int f24688N;
    /* renamed from: O */
    private int f24689O;
    /* renamed from: P */
    private int f24690P;
    /* renamed from: Q */
    private Rect f24691Q;
    /* renamed from: R */
    private az f24692R;
    /* renamed from: a */
    private af f24693a;
    /* renamed from: b */
    private Bitmap f24694b;
    /* renamed from: c */
    private final Bitmap f24695c;
    /* renamed from: d */
    private int f24696d;
    /* renamed from: e */
    private int f24697e;
    /* renamed from: f */
    private String f24698f;
    /* renamed from: g */
    private String f24699g;
    /* renamed from: h */
    private String f24700h = null;
    /* renamed from: i */
    private C8076q f24701i;
    /* renamed from: j */
    private C7490k f24702j;
    /* renamed from: k */
    private C7490k f24703k;
    /* renamed from: l */
    private C6579g f24704l;
    /* renamed from: m */
    private C6579g f24705m;
    /* renamed from: n */
    private float f24706n;
    /* renamed from: o */
    private int f24707o;
    /* renamed from: p */
    private boolean f24708p;
    /* renamed from: q */
    private boolean f24709q;
    /* renamed from: r */
    private boolean f24710r;
    /* renamed from: s */
    private boolean f24711s;
    /* renamed from: t */
    private boolean f24712t = true;
    /* renamed from: u */
    private final boolean f24713u;
    /* renamed from: v */
    private boolean f24714v = true;
    /* renamed from: w */
    private float f24715w = null;
    /* renamed from: x */
    private float f24716x = 1.0f;
    /* renamed from: y */
    private final float f24717y;
    /* renamed from: z */
    private int f24718z;

    /* renamed from: f */
    public final C4701c mo5284f() {
        return null;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C6586m c6586m = (C6586m) obj;
        if (this.f24707o == c6586m.f24707o) {
            return this.f24690P - c6586m.f24690P;
        }
        return this.f24707o - c6586m.f24707o;
    }

    public C6586m(af afVar, Bitmap bitmap, Bitmap bitmap2, int i, int i2, String str, String str2, boolean z) {
        this.f24693a = afVar;
        this.f24694b = bitmap;
        this.f24695c = null;
        this.f24696d = i;
        this.f24697e = i2;
        this.f24698f = null;
        this.f24699g = null;
        this.f24710r = true;
        this.f24713u = false;
        bitmap = f24677J;
        f24677J = bitmap + 1;
        this.f24690P = bitmap;
        if (this.f24713u == null || C4725p.m21031h() != null) {
            this.f24717y = 1.0f;
        } else {
            this.f24717y = ((float) C4725p.m21027d()) / 1131413504;
        }
        this.f24718z = m29392a(this.f24696d);
        m29409b(this.f24696d / 2, 0);
        if (this.f24694b != null) {
            this.f24679B = m29392a(this.f24694b.getWidth());
            this.f24680C = m29392a(this.f24694b.getHeight());
        } else {
            this.f24679B = 0;
            this.f24680C = 0;
        }
        if (this.f24695c != null) {
            this.f24681D = m29392a(this.f24695c.getWidth());
            this.f24682E = m29392a(this.f24695c.getHeight());
        } else {
            this.f24681D = 0;
            this.f24682E = 0;
        }
        this.f24678A = m29392a(this.f24697e);
    }

    /* renamed from: a */
    private int m29392a(int i) {
        return (!this.f24713u || C4725p.m21031h()) ? i : Math.round(((float) i) * this.f24717y);
    }

    /* renamed from: i */
    public final boolean mo5286i() {
        return this.f24710r;
    }

    /* renamed from: a */
    public final void m29405a(boolean z) {
        this.f24711s = z;
    }

    /* renamed from: b */
    public final boolean m29412b() {
        return this.f24711s;
    }

    /* renamed from: a */
    public final synchronized void m29398a(float f) {
        this.f24715w = f;
    }

    /* renamed from: b */
    public final synchronized void m29411b(boolean z) {
        this.f24714v = z;
    }

    /* renamed from: c */
    public final synchronized void m29416c(boolean z) {
        this.f24712t = z;
    }

    /* renamed from: d */
    public final synchronized boolean m29418d() {
        return this.f24712t;
    }

    /* renamed from: b */
    public final synchronized void m29408b(float f) {
        this.f24716x = f;
    }

    /* renamed from: a */
    public final synchronized void m29400a(af afVar) {
        if (afVar != null) {
            this.f24693a = afVar;
        }
    }

    /* renamed from: a */
    public final void m29399a(int i, int i2) {
        this.f24696d = i;
        this.f24697e = i2;
        this.f24718z = m29392a(this.f24696d);
        this.f24678A = m29392a(this.f24697e);
    }

    /* renamed from: b */
    public final void m29409b(int i, int i2) {
        this.f24686L = i;
        this.f24687M = i2;
        this.f24688N = m29392a(this.f24686L);
        this.f24689O = m29392a(this.f24687M);
    }

    /* renamed from: e */
    public final synchronized C4700b m29419e() {
        return new C4700b(this.f24693a.m21473a(), this.f24693a.m21484c());
    }

    /* renamed from: a */
    public final void m29401a(C8076q c8076q) {
        this.f24701i = c8076q;
    }

    /* renamed from: g */
    public final Bitmap m29421g() {
        return this.f24694b;
    }

    /* renamed from: j */
    public final Bitmap m29424j() {
        return this.f24695c;
    }

    public final void l_() {
        this.f24708p = false;
        if (this.f24709q) {
            this.f24709q = false;
            this.f24701i.m34340c(this);
        }
    }

    /* renamed from: a */
    public final void mo5281a() {
        this.f24708p = true;
    }

    /* renamed from: k */
    public final boolean m29425k() {
        return this.f24708p;
    }

    /* renamed from: c */
    public final synchronized af mo5283c() {
        return this.f24693a;
    }

    public final af m_() {
        return this.f24685K;
    }

    /* renamed from: h */
    public final String mo5285h() {
        return this.f24698f;
    }

    /* renamed from: a */
    public final void m29404a(String str) {
        this.f24698f = str;
    }

    /* renamed from: b */
    public final void m29410b(String str) {
        this.f24699g = str;
    }

    /* renamed from: l */
    public final String m29426l() {
        return this.f24700h;
    }

    /* renamed from: c */
    public final void m29415c(String str) {
        this.f24700h = str;
    }

    /* renamed from: d */
    public final void m29417d(boolean z) {
        this.f24709q = false;
    }

    /* renamed from: m */
    public final int m29427m() {
        if (this.f24702j == null) {
            return 0;
        }
        this.f24702j.m32557f();
        int g = this.f24702j.m32558g();
        this.f24702j = null;
        return g;
    }

    /* renamed from: n */
    public final int m29428n() {
        if (this.f24703k == null) {
            return 0;
        }
        this.f24703k.m32557f();
        int g = this.f24703k.m32558g();
        this.f24703k = null;
        return g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final synchronized boolean m29407a(com.google.android.m4b.maps.bz.C6570b r19) {
        /*
        r18 = this;
        r1 = r18;
        r2 = r19;
        monitor-enter(r18);
        r3 = r1.f24712t;	 Catch:{ all -> 0x0097 }
        r4 = 1;
        if (r3 != 0) goto L_0x000c;
    L_0x000a:
        monitor-exit(r18);
        return r4;
    L_0x000c:
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = r19.m29253i();	 Catch:{ all -> 0x0097 }
        r3 = r2.m29231a(r3, r5);	 Catch:{ all -> 0x0097 }
        r1.f24706n = r3;	 Catch:{ all -> 0x0097 }
        r3 = r1.f24693a;	 Catch:{ all -> 0x0097 }
        r5 = f24675H;	 Catch:{ all -> 0x0097 }
        r2.m29238a(r3, r5);	 Catch:{ all -> 0x0097 }
        r3 = f24675H;	 Catch:{ all -> 0x0097 }
        r3 = r3[r4];	 Catch:{ all -> 0x0097 }
        r5 = 1199570944; // 0x47800000 float:65536.0 double:5.92666793E-315;
        r3 = r3 * r5;
        r3 = (int) r3;	 Catch:{ all -> 0x0097 }
        r1.f24707o = r3;	 Catch:{ all -> 0x0097 }
        r18.m29395c(r19);	 Catch:{ all -> 0x0097 }
        r3 = r1.f24715w;	 Catch:{ all -> 0x0097 }
        r3 = -r3;
        r5 = (double) r3;	 Catch:{ all -> 0x0097 }
        r5 = java.lang.Math.toRadians(r5);	 Catch:{ all -> 0x0097 }
        r5 = java.lang.Math.cos(r5);	 Catch:{ all -> 0x0097 }
        r3 = r1.f24715w;	 Catch:{ all -> 0x0097 }
        r3 = -r3;
        r7 = (double) r3;	 Catch:{ all -> 0x0097 }
        r7 = java.lang.Math.toRadians(r7);	 Catch:{ all -> 0x0097 }
        r7 = java.lang.Math.sin(r7);	 Catch:{ all -> 0x0097 }
        r3 = r1.f24688N;	 Catch:{ all -> 0x0097 }
        r9 = r1.f24718z;	 Catch:{ all -> 0x0097 }
        r3 = r3 - r9;
        r9 = r1.f24689O;	 Catch:{ all -> 0x0097 }
        r10 = r1.f24678A;	 Catch:{ all -> 0x0097 }
        r9 = r9 - r10;
        r9 = -r9;
        r10 = (double) r3;	 Catch:{ all -> 0x0097 }
        r12 = r10 * r5;
        r14 = (double) r9;	 Catch:{ all -> 0x0097 }
        r16 = r14 * r7;
        r12 = r12 - r16;
        r10 = r10 * r7;
        r14 = r14 * r5;
        r10 = r10 + r14;
        r3 = r1.f24714v;	 Catch:{ all -> 0x0097 }
        if (r3 == 0) goto L_0x006d;
    L_0x0061:
        r3 = r18.mo5283c();	 Catch:{ all -> 0x0097 }
        r5 = (int) r12;	 Catch:{ all -> 0x0097 }
        r6 = (int) r10;	 Catch:{ all -> 0x0097 }
        r7 = r1.f24685K;	 Catch:{ all -> 0x0097 }
        com.google.android.m4b.maps.bx.C7481o.m32471a(r2, r3, r5, r6, r7);	 Catch:{ all -> 0x0097 }
        goto L_0x0095;
    L_0x006d:
        r19.m29253i();	 Catch:{ all -> 0x0097 }
        r2 = r1.f24685K;	 Catch:{ all -> 0x0097 }
        r3 = r1.f24693a;	 Catch:{ all -> 0x0097 }
        r3 = r3.m21490f();	 Catch:{ all -> 0x0097 }
        r5 = r1.f24706n;	 Catch:{ all -> 0x0097 }
        r5 = (double) r5;	 Catch:{ all -> 0x0097 }
        r5 = r5 * r12;
        r5 = (int) r5;	 Catch:{ all -> 0x0097 }
        r3 = r3 + r5;
        r5 = r1.f24693a;	 Catch:{ all -> 0x0097 }
        r5 = r5.m21492g();	 Catch:{ all -> 0x0097 }
        r6 = r1.f24706n;	 Catch:{ all -> 0x0097 }
        r6 = (double) r6;	 Catch:{ all -> 0x0097 }
        r6 = r6 * r10;
        r6 = (int) r6;	 Catch:{ all -> 0x0097 }
        r5 = r5 + r6;
        r6 = r1.f24693a;	 Catch:{ all -> 0x0097 }
        r6 = r6.m21494h();	 Catch:{ all -> 0x0097 }
        r2.m21477a(r3, r5, r6);	 Catch:{ all -> 0x0097 }
    L_0x0095:
        monitor-exit(r18);
        return r4;
    L_0x0097:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r18);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cc.m.a(com.google.android.m4b.maps.bz.b):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m29402a(com.google.android.m4b.maps.ca.C5052d r12, com.google.android.m4b.maps.bz.C6570b r13, com.google.android.m4b.maps.bx.C5009j r14) {
        /*
        r11 = this;
        r0 = r14.m22388b();
        r1 = 1;
        if (r0 > r1) goto L_0x013a;
    L_0x0007:
        r0 = r11.f24701i;
        if (r0 == 0) goto L_0x013a;
    L_0x000b:
        r0 = r11.f24706n;
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x013a;
    L_0x0012:
        r0 = r11.f24694b;
        if (r0 == 0) goto L_0x013a;
    L_0x0016:
        r0 = r11.f24712t;
        if (r0 != 0) goto L_0x001c;
    L_0x001a:
        goto L_0x013a;
    L_0x001c:
        monitor-enter(r11);
        r0 = r11.f24715w;	 Catch:{ all -> 0x0137 }
        r3 = r11.f24714v;	 Catch:{ all -> 0x0137 }
        r4 = r11.f24716x;	 Catch:{ all -> 0x0137 }
        monitor-exit(r11);	 Catch:{ all -> 0x0137 }
        r5 = r12.m22635x();
        r6 = r11.f24695c;
        r7 = r11.f24694b;
        r8 = r14.m22388b();
        if (r8 != 0) goto L_0x0048;
    L_0x0032:
        r8 = r11.f24703k;
        if (r8 != 0) goto L_0x005a;
    L_0x0036:
        if (r6 != 0) goto L_0x0039;
    L_0x0038:
        return;
    L_0x0039:
        r8 = r11.m29393a(r12, r6);
        r11.f24703k = r8;
        r8 = r11.f24703k;
        r8 = com.google.android.m4b.maps.cc.C6586m.m29394a(r8);
        r11.f24705m = r8;
        goto L_0x005a;
    L_0x0048:
        r8 = r11.f24702j;
        if (r8 != 0) goto L_0x005a;
    L_0x004c:
        r8 = r11.m29393a(r12, r7);
        r11.f24702j = r8;
        r8 = r11.f24702j;
        r8 = com.google.android.m4b.maps.cc.C6586m.m29394a(r8);
        r11.f24704l = r8;
    L_0x005a:
        r8 = f24676I;
        r9 = r11.f24693a;
        r8.m21482b(r9);
        r8 = r13.m29248d();
        r9 = 0;
        if (r8 != 0) goto L_0x0087;
    L_0x0068:
        r8 = r13.m29255k();
        r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r8 != 0) goto L_0x0087;
    L_0x0070:
        r8 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        if (r3 == 0) goto L_0x007c;
    L_0x0074:
        r8 = r0 % r8;
        r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r8 != 0) goto L_0x0087;
    L_0x007a:
        r8 = 1;
        goto L_0x0088;
    L_0x007c:
        r10 = r13.m29254j();
        r10 = r10 - r0;
        r10 = r10 % r8;
        r8 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r8 != 0) goto L_0x0087;
    L_0x0086:
        goto L_0x007a;
    L_0x0087:
        r8 = 0;
    L_0x0088:
        if (r8 == 0) goto L_0x00a9;
    L_0x008a:
        r8 = f24676I;
        r10 = f24675H;
        r13.m29238a(r8, r10);
        r8 = f24675H;
        r8 = r8[r9];
        r8 = java.lang.Math.round(r8);
        r8 = (float) r8;
        r10 = f24675H;
        r10 = r10[r1];
        r10 = java.lang.Math.round(r10);
        r10 = (float) r10;
        r8 = r13.m29247d(r8, r10);
        f24676I = r8;
    L_0x00a9:
        r8 = r11.f24693a;
        if (r8 != 0) goto L_0x00ae;
    L_0x00ad:
        return;
    L_0x00ae:
        r5.glPushMatrix();
        monitor-enter(r11);
        r8 = f24676I;	 Catch:{ all -> 0x0134 }
        r10 = r11.f24706n;	 Catch:{ all -> 0x0134 }
        com.google.android.m4b.maps.bx.an.m22324a(r12, r13, r8, r10);	 Catch:{ all -> 0x0134 }
        monitor-exit(r11);	 Catch:{ all -> 0x0134 }
        r14 = r14.m22388b();
        r8 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r14 != 0) goto L_0x00db;
    L_0x00c2:
        r13 = -2949120; // 0xffffffffffd30000 float:NaN double:NaN;
        r5.glRotatex(r13, r9, r9, r8);
        r13 = -5898240; // 0xffffffffffa60000 float:NaN double:NaN;
        r5.glRotatex(r13, r8, r9, r9);
        r13 = r11.f24705m;
        r13.mo7118d(r12);
        r12 = r11.f24703k;
        r12.m32544a(r5);
        r12 = r11.f24681D;
        r13 = r11.f24682E;
        goto L_0x010b;
    L_0x00db:
        r14 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r3 == 0) goto L_0x00e3;
    L_0x00df:
        com.google.android.m4b.maps.bx.an.m22327a(r5, r13);
        goto L_0x00e8;
    L_0x00e3:
        r13 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;
        r5.glRotatef(r13, r14, r2, r2);
    L_0x00e8:
        r5.glRotatef(r0, r2, r14, r2);
        r13 = r11.f24704l;
        r13.mo7118d(r12);
        r12 = r11.f24702j;
        r12.m32544a(r5);
        r12 = r11.f24679B;
        r13 = r11.f24680C;
        r14 = 771; // 0x303 float:1.08E-42 double:3.81E-321;
        r5.glBlendFunc(r1, r14);
        r14 = 8960; // 0x2300 float:1.2556E-41 double:4.427E-320;
        r0 = 8704; // 0x2200 float:1.2197E-41 double:4.3003E-320;
        r1 = 8448; // 0x2100 float:1.1838E-41 double:4.174E-320;
        r5.glTexEnvx(r14, r0, r1);
        r5.glColor4f(r4, r4, r4, r4);
        r6 = r7;
    L_0x010b:
        r12 = r12 << 16;
        r13 = r13 << 16;
        r14 = r11.f24696d;
        r14 = r14 << 16;
        r14 = -r14;
        r0 = r6.getWidth();
        r14 = r14 / r0;
        r0 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r1 = r11.f24697e;
        r1 = r1 << 16;
        r2 = r6.getHeight();
        r1 = r1 / r2;
        r1 = r1 + r0;
        r5.glScalex(r12, r8, r13);
        r5.glTranslatex(r14, r9, r1);
        r12 = 5;
        r13 = 4;
        r5.glDrawArrays(r12, r9, r13);
        r5.glPopMatrix();
        return;
    L_0x0134:
        r12 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x0134 }
        throw r12;
    L_0x0137:
        r12 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x0137 }
        throw r12;
    L_0x013a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cc.m.a(com.google.android.m4b.maps.ca.d, com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.bx.j):void");
    }

    /* renamed from: a */
    public final synchronized int mo5280a(float f, float f2, C6570b c6570b) {
        int[] b = c6570b.m29243b(this.f24693a);
        if (this.f24714v) {
            c6570b = this.f24715w;
        } else {
            c6570b = this.f24715w - c6570b.m29254j();
        }
        if (c6570b != 0.0f) {
            double toRadians = Math.toRadians((double) c6570b);
            c6570b = (float) Math.sin(toRadians);
            float cos = (float) Math.cos(toRadians);
            f -= (float) b[0];
            f2 = -(f2 - ((float) b[1]));
            float f3 = (f * cos) - (f2 * c6570b);
            f = (f * c6570b) + (f2 * cos);
            float f4 = ((float) b[0]) + f3;
            f2 = ((float) b[1]) - f;
            f = f4;
        }
        c6570b = (b[0] - this.f24718z) + (this.f24679B / 2);
        int i = (b[1] - this.f24678A) + (this.f24680C / 2);
        f = Math.max(((int) Math.abs(f - ((float) c6570b))) - (this.f24679B / 2), 0);
        f2 = Math.max(((int) Math.abs(f2 - ((float) i))) - (this.f24680C / 2), 0);
        return (f * f) + (f2 * f2);
    }

    /* renamed from: a */
    public final synchronized boolean m29406a(float f, float f2, af afVar, C6570b c6570b) {
        if (this.f24694b == null) {
            return false;
        }
        if (mo5280a(f, f2, c6570b) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private synchronized void m29395c(C6570b c6570b) {
        c6570b = c6570b.m29243b(this.f24693a);
        int i = c6570b[0] - this.f24718z;
        int i2 = this.f24679B + i;
        c6570b = c6570b[1] - this.f24678A;
        int i3 = this.f24680C + c6570b;
        if (this.f24695c != null) {
            i2 = Math.max(i2, this.f24681D + i);
            i3 = Math.max(i3, this.f24682E + c6570b);
        }
        this.f24691Q = new Rect(i, c6570b, i2, i3);
    }

    /* renamed from: o */
    public final synchronized Rect m29429o() {
        return this.f24691Q;
    }

    /* renamed from: a */
    public final void m29403a(az azVar) {
        this.f24692R = azVar;
    }

    /* renamed from: p */
    public final az m29430p() {
        return this.f24692R;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final synchronized boolean mo5282b(com.google.android.m4b.maps.bz.C6570b r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.f24712t;	 Catch:{ all -> 0x0051 }
        r1 = 0;
        if (r0 == 0) goto L_0x004f;
    L_0x0006:
        r0 = r3.f24694b;	 Catch:{ all -> 0x0051 }
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x004f;
    L_0x000b:
        r0 = r3.f24691Q;	 Catch:{ all -> 0x0051 }
        if (r0 != 0) goto L_0x0012;
    L_0x000f:
        r3.m29395c(r4);	 Catch:{ all -> 0x0051 }
    L_0x0012:
        r0 = r4.m29265u();	 Catch:{ all -> 0x0051 }
        r2 = r3.f24684G;	 Catch:{ all -> 0x0051 }
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0051 }
        if (r0 == 0) goto L_0x0022;
    L_0x001e:
        r4 = r3.f24683F;	 Catch:{ all -> 0x0051 }
        monitor-exit(r3);
        return r4;
    L_0x0022:
        r0 = r3.f24691Q;	 Catch:{ all -> 0x0051 }
        r0 = r0.left;	 Catch:{ all -> 0x0051 }
        r2 = r4.m29249e();	 Catch:{ all -> 0x0051 }
        if (r0 >= r2) goto L_0x0043;
    L_0x002c:
        r0 = r3.f24691Q;	 Catch:{ all -> 0x0051 }
        r0 = r0.right;	 Catch:{ all -> 0x0051 }
        if (r0 < 0) goto L_0x0043;
    L_0x0032:
        r0 = r3.f24691Q;	 Catch:{ all -> 0x0051 }
        r0 = r0.top;	 Catch:{ all -> 0x0051 }
        r2 = r4.m29250f();	 Catch:{ all -> 0x0051 }
        if (r0 >= r2) goto L_0x0043;
    L_0x003c:
        r0 = r3.f24691Q;	 Catch:{ all -> 0x0051 }
        r0 = r0.bottom;	 Catch:{ all -> 0x0051 }
        if (r0 < 0) goto L_0x0043;
    L_0x0042:
        r1 = 1;
    L_0x0043:
        r3.f24683F = r1;	 Catch:{ all -> 0x0051 }
        r4 = r4.m29265u();	 Catch:{ all -> 0x0051 }
        r3.f24684G = r4;	 Catch:{ all -> 0x0051 }
        r4 = r3.f24683F;	 Catch:{ all -> 0x0051 }
        monitor-exit(r3);
        return r4;
    L_0x004f:
        monitor-exit(r3);
        return r1;
    L_0x0051:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cc.m.b(com.google.android.m4b.maps.bz.b):boolean");
    }

    /* renamed from: a */
    private C7490k m29393a(C5052d c5052d, Bitmap bitmap) {
        C7490k c7490k = (C7490k) this.f24701i.m34345l().get(bitmap);
        if (c7490k != null) {
            c7490k.m32556e();
            return c7490k;
        }
        c7490k = new C7490k(c5052d);
        c7490k.m32552c(true);
        c7490k.m32548b(bitmap);
        this.f24701i.m34345l().put(bitmap, c7490k);
        return c7490k;
    }

    /* renamed from: a */
    private static C6579g m29394a(C7490k c7490k) {
        C6579g c6579g = new C6579g(8);
        float b = c7490k.m32546b();
        float c = c7490k.m32550c();
        c6579g.mo5251a(0.0f, 0.0f);
        c6579g.mo5251a(0.0f, c);
        c6579g.mo5251a(b, 0.0f);
        c6579g.mo5251a(b, c);
        return c6579g;
    }
}
