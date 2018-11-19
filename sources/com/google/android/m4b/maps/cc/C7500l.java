package com.google.android.m4b.maps.cc;

import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C6527u;
import com.google.android.m4b.maps.bo.C6528w;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bo.C4843b;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5049a;
import com.google.android.m4b.maps.ca.C5050b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cb.C6580k;
import com.google.android.m4b.maps.cb.C7493m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.cc.l */
public final class C7500l extends C6581d {
    /* renamed from: b */
    private static int f27731b = 16384;
    /* renamed from: c */
    private static int f27732c = 1;
    /* renamed from: d */
    private static float f27733d = 1.0f;
    /* renamed from: e */
    private static float f27734e = 1.0f;
    /* renamed from: f */
    private final C6580k f27735f;
    /* renamed from: g */
    private final C5050b f27736g;
    /* renamed from: h */
    private final int f27737h;
    /* renamed from: i */
    private final af f27738i = new af();

    /* renamed from: a */
    public static C7500l m32680a(ba baVar, String[] strArr, C4843b c4843b, C5052d c5052d) {
        String[] strArr2 = strArr;
        al i = baVar.m21626i();
        Set hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = -1;
        int i4 = 0;
        while (c4843b.hasNext()) {
            int b;
            int b2;
            C4848k a = c4843b.mo5104a();
            if (!(a instanceof C6528w)) {
                if (!(a instanceof C6527u)) {
                    break;
                }
                C6527u c6527u = (C6527u) a;
                if (!C7500l.m32685a(c6527u)) {
                    break;
                }
                b = C7500l.m32686b(a.mo5108e().m21558b(0).m21547c());
                if (b != i3) {
                    if (i3 > 0) {
                        break;
                    }
                    i3 = b;
                }
                b2 = (c6527u.m28772b().m21528b() - 1) * 2;
                if (b2 <= f27731b) {
                    b2 += i4;
                    if (b2 > f27731b) {
                        break;
                    }
                    arrayList.add(a);
                    i4 = b2;
                } else {
                    if (C4728u.m21050a("GLLineMesh", 3)) {
                        String valueOf = String.valueOf(baVar);
                        b = f27731b;
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 86);
                        stringBuilder.append("unable to handle the Line with ");
                        stringBuilder.append(b2);
                        stringBuilder.append(" vertices in ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" since the limit is ");
                        stringBuilder.append(b);
                        Log.d("GLLineMesh", stringBuilder.toString());
                    }
                    c4843b.next();
                }
            } else if (i3 > 1) {
                break;
            } else {
                i3 = ((C6528w) a).m28782b().m21528b();
                if (i3 <= f27731b) {
                    i3 += i4;
                    if (i3 > f27731b) {
                        i3 = 1;
                        break;
                    }
                    arrayList.add(a);
                    i4 = i3;
                    i3 = 1;
                } else {
                    if (C4728u.m21050a("GLLineMesh", 3)) {
                        String valueOf2 = String.valueOf(baVar);
                        int i5 = f27731b;
                        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 90);
                        stringBuilder2.append("unable to handle the LineMesh with ");
                        stringBuilder2.append(i3);
                        stringBuilder2.append(" vertices in ");
                        stringBuilder2.append(valueOf2);
                        stringBuilder2.append(" since the limit is ");
                        stringBuilder2.append(i5);
                        Log.d("GLLineMesh", stringBuilder2.toString());
                    }
                    c4843b.next();
                    i3 = 1;
                }
            }
            for (int b3 : a.mo5111l()) {
                if (b3 >= 0 && b3 < strArr2.length) {
                    hashSet.add(strArr2[b3]);
                }
            }
            c4843b.next();
        }
        if (i3 >= 0) {
            i2 = i3;
        }
        C7500l c7500l = new C7500l(i4, i2, hashSet, c5052d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4848k c4848k = (C4848k) it.next();
            if (c4848k.mo5109h() == 5) {
                c7500l.m32684a(i, (C6528w) c4848k);
            } else if (c4848k.mo5109h() == 8) {
                c7500l.m32683a(i, (C6527u) c4848k);
            }
        }
        return c7500l;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static synchronized boolean m32685a(com.google.android.m4b.maps.bo.C6527u r5) {
        /*
        r0 = com.google.android.m4b.maps.cc.C7500l.class;
        monitor-enter(r0);
        r5 = r5.mo5108e();	 Catch:{ all -> 0x0037 }
        r1 = r5.m21560d();	 Catch:{ all -> 0x0037 }
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x001c;
    L_0x000f:
        r1 = r5.m21558b(r3);	 Catch:{ all -> 0x0037 }
        r1 = r1.m21548d();	 Catch:{ all -> 0x0037 }
        r1 = r1.length;	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x001c;
    L_0x001a:
        r1 = 1;
        goto L_0x001d;
    L_0x001c:
        r1 = 0;
    L_0x001d:
        r4 = r5.m21557b();	 Catch:{ all -> 0x0037 }
        if (r4 != r2) goto L_0x0035;
    L_0x0023:
        r5 = r5.m21558b(r3);	 Catch:{ all -> 0x0037 }
        r5 = r5.m21547c();	 Catch:{ all -> 0x0037 }
        r4 = f27733d;	 Catch:{ all -> 0x0037 }
        r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r5 > 0) goto L_0x0035;
    L_0x0031:
        if (r1 != 0) goto L_0x0035;
    L_0x0033:
        monitor-exit(r0);
        return r2;
    L_0x0035:
        monitor-exit(r0);
        return r3;
    L_0x0037:
        r5 = move-exception;
        monitor-exit(r0);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cc.l.a(com.google.android.m4b.maps.bo.u):boolean");
    }

    /* renamed from: a */
    public static synchronized void m32682a(int i) {
        synchronized (C7500l.class) {
            f27732c = i;
            f27733d = Math.max(1065353216, ((float) Math.min(5, f27732c)) / f27734e);
        }
    }

    /* renamed from: a */
    public static synchronized void m32681a(float f) {
        synchronized (C7500l.class) {
            f27734e = f;
            f27733d = Math.max(1.0f, ((float) Math.min(5, f27732c)) / f27734e);
        }
    }

    /* renamed from: b */
    private static synchronized int m32686b(float f) {
        synchronized (C7500l.class) {
            f = Math.max(1, Math.min(f27732c, Math.round(f * f27734e)));
        }
        return f;
    }

    private C7500l(int i, int i2, Set<String> set, C5052d c5052d) {
        super(set);
        this.f27735f = new C7493m(i);
        this.f27736g = new C5050b(i, c5052d.m22601E());
        this.f27737h = i2 * 65536;
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        this.f27735f.mo7121b(c5052d);
        this.f27736g.m22588b(c5052d);
    }

    /* renamed from: c */
    public final void mo5224c(C5052d c5052d) {
        this.f27735f.m29354c(c5052d);
        this.f27736g.m22589c(c5052d);
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (this.f27735f.mo5250a() != null) {
            c6570b = c5052d.m22635x();
            if (this.f27737h > 65536) {
                c6570b.glLineWidthx(this.f27737h);
            }
            this.f27735f.mo7123d(c5052d);
            this.f27736g.m22586a(c5052d);
            C5049a.m22577c(c5052d);
            c6570b.glDrawArrays(1, 0, this.f27735f.mo5250a());
            c6570b.glLineWidthx(65536);
            C5049a.m22578d(c5052d);
        }
    }

    /* renamed from: a */
    private void m32684a(al alVar, C6528w c6528w) {
        as e = c6528w.mo5108e();
        if (!(e.m21557b() == 0 || e.m21558b(0).m21547c() == 0.0f)) {
            if (e.m21558b(0).m21546b() != 0) {
                c6528w = c6528w.m28782b();
                int b = c6528w.m21528b();
                af c = alVar.m32212c();
                alVar = alVar.m32215f();
                for (int i = 0; i < b; i++) {
                    c6528w.m21524a(i, this.f27738i);
                    af.m21468b(this.f27738i, c, this.f27738i);
                    this.f27735f.mo5257a(this.f27738i, alVar);
                }
                this.f27736g.m22585a(e.m21558b(0).m21546b(), b);
            }
        }
    }

    /* renamed from: a */
    private void m32683a(al alVar, C6527u c6527u) {
        as e = c6527u.mo5108e();
        if (!(e.m21557b() == 0 || e.m21558b(0).m21547c() == 0.0f)) {
            if (e.m21558b(0).m21546b() != 0) {
                c6527u = c6527u.m28772b();
                int b = c6527u.m21528b() - 1;
                int i = b * 2;
                af c = alVar.m32212c();
                alVar = alVar.m32215f();
                int i2 = 0;
                while (i2 <= b) {
                    c6527u.m21524a(i2, this.f27738i);
                    af.m21468b(this.f27738i, c, this.f27738i);
                    this.f27735f.mo5257a(this.f27738i, alVar);
                    if (i2 > 0 && i2 < b) {
                        this.f27735f.mo5257a(this.f27738i, alVar);
                    }
                    i2++;
                }
                this.f27736g.m22585a(e.m21558b(0).m21546b(), i);
            }
        }
    }

    /* renamed from: a */
    public final int mo7125a() {
        return this.f27735f.m29353c() + this.f27736g.m22584a();
    }

    /* renamed from: b */
    public final int mo7126b() {
        return (this.f27735f.mo7122d() + 120) + this.f27736g.m22587b();
    }
}
