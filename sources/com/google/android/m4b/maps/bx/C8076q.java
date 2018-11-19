package com.google.android.m4b.maps.bx;

import android.graphics.Bitmap;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.bm.C6482f;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.bp;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C7490k;
import com.google.android.m4b.maps.cc.C6586m;
import com.google.android.m4b.maps.cg.az;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bx.q */
public final class C8076q extends C7478d {
    /* renamed from: b */
    private final LinkedList<C6586m> f28966b = new LinkedList();
    /* renamed from: c */
    private boolean f28967c;
    /* renamed from: d */
    private final HashMap<Object, C6586m> f28968d = new HashMap();
    /* renamed from: e */
    private final HashMap<Bitmap, C7490k> f28969e = new HashMap();
    /* renamed from: f */
    private bp f28970f;
    /* renamed from: g */
    private List<C6586m> f28971g = new ArrayList();
    /* renamed from: h */
    private final C5016a f28972h;
    /* renamed from: i */
    private int f28973i = 0;
    /* renamed from: j */
    private boolean f28974j = false;
    /* renamed from: k */
    private C6586m f28975k;
    /* renamed from: l */
    private C5015a f28976l;

    /* renamed from: com.google.android.m4b.maps.bx.q$a */
    public interface C5015a {
        /* renamed from: c */
        void mo4936c(C6586m c6586m);

        /* renamed from: d */
        void mo4938d(C6586m c6586m);

        /* renamed from: e */
        void mo4939e(C6586m c6586m);
    }

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        return true;
    }

    public C8076q(C5016a c5016a, C7481o c7481o) {
        super(c7481o);
        this.f28972h = c5016a;
    }

    /* renamed from: a */
    public final synchronized void m34335a(C6586m c6586m) {
        if (!this.f28968d.containsKey(c6586m)) {
            c6586m.m29401a(this);
            this.f28966b.add(c6586m);
            this.f28968d.put(c6586m, c6586m);
            m34329n();
        }
    }

    /* renamed from: n */
    private void m34329n() {
        this.f28971g.clear();
        this.f28967c = true;
    }

    /* renamed from: b */
    public final void m34338b(C6586m c6586m) {
        synchronized (this.a) {
            synchronized (this) {
                if (this.f28968d.containsKey(c6586m)) {
                    this.f28968d.remove(c6586m);
                    this.f28966b.remove(c6586m);
                    if (c6586m.m29425k()) {
                        c6586m.m29417d(false);
                        this.a.m32486f();
                    }
                    m34328d(c6586m);
                    m34329n();
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m34340c(C6586m c6586m) {
        if (this.f28968d.containsKey(c6586m)) {
            this.f28968d.remove(c6586m);
            this.f28966b.remove(c6586m);
            m34328d(c6586m);
            m34329n();
        }
    }

    /* renamed from: d */
    private void m34328d(C6586m c6586m) {
        if (c6586m.m29427m() == 0) {
            this.f28969e.remove(c6586m.m29421g());
        }
        if (c6586m.m29428n() == 0) {
            this.f28969e.remove(c6586m.m29424j());
        }
    }

    /* renamed from: f */
    public final synchronized void m34344f() {
        m34329n();
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return this.f28972h;
    }

    /* renamed from: a */
    public final void mo7040a(C5052d c5052d) {
        synchronized (this.a) {
            synchronized (this) {
                m34330o();
            }
        }
    }

    /* renamed from: d */
    private void m34327d(float f, float f2, C6570b c6570b) {
        this.f28975k.m29400a(c6570b.m29247d(f, f2 - 70.0f));
    }

    public final boolean f_() {
        return this.f28974j;
    }

    /* renamed from: a */
    public final void m34331a(C5015a c5015a) {
        this.f28976l = c5015a;
    }

    /* renamed from: c */
    public final boolean mo7145c(float f, float f2, C6570b c6570b) {
        if (!this.f28974j) {
            return false;
        }
        m34327d(f, f2, c6570b);
        if (this.f28976l != null) {
            this.f28976l.mo4938d(this.f28975k);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public final boolean mo7104b(float r4, float r5, com.google.android.m4b.maps.bo.af r6, com.google.android.m4b.maps.bz.C6570b r7) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.f28971g;	 Catch:{ all -> 0x0037 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0037 }
    L_0x0007:
        r1 = r0.hasNext();	 Catch:{ all -> 0x0037 }
        if (r1 == 0) goto L_0x0034;
    L_0x000d:
        r1 = r0.next();	 Catch:{ all -> 0x0037 }
        r1 = (com.google.android.m4b.maps.cc.C6586m) r1;	 Catch:{ all -> 0x0037 }
        r2 = r1.m29412b();	 Catch:{ all -> 0x0037 }
        if (r2 == 0) goto L_0x0007;
    L_0x0019:
        r2 = r1.m29406a(r4, r5, r6, r7);	 Catch:{ all -> 0x0037 }
        if (r2 == 0) goto L_0x0007;
    L_0x001f:
        r6 = 1;
        r3.f28974j = r6;	 Catch:{ all -> 0x0037 }
        r3.f28975k = r1;	 Catch:{ all -> 0x0037 }
        r3.m34327d(r4, r5, r7);	 Catch:{ all -> 0x0037 }
        r4 = r3.f28976l;	 Catch:{ all -> 0x0037 }
        if (r4 == 0) goto L_0x0032;
    L_0x002b:
        r4 = r3.f28976l;	 Catch:{ all -> 0x0037 }
        r5 = r3.f28975k;	 Catch:{ all -> 0x0037 }
        r4.mo4936c(r5);	 Catch:{ all -> 0x0037 }
    L_0x0032:
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        return r6;
    L_0x0034:
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        r4 = 0;
        return r4;
    L_0x0037:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0037 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.q.b(float, float, com.google.android.m4b.maps.bo.af, com.google.android.m4b.maps.bz.b):boolean");
    }

    /* renamed from: c */
    public final boolean mo7144c(float f, float f2, af afVar, C6570b c6570b) {
        if (this.f28974j == null) {
            return false;
        }
        m34327d(f, f2, c6570b);
        f = this.f28975k;
        if (this.f28976l != null) {
            this.f28976l.mo4939e(this.f28975k);
        }
        this.f28975k = 0.0f;
        this.f28974j = false;
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo5222a(com.google.android.m4b.maps.ca.C5052d r6, com.google.android.m4b.maps.bz.C6570b r7, com.google.android.m4b.maps.bx.C5009j r8) {
        /*
        r5 = this;
        r0 = r8.m22388b();
        if (r0 != 0) goto L_0x008e;
    L_0x0006:
        r0 = r5.f28966b;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x008e;
    L_0x000e:
        monitor-enter(r5);
        r5.m34332a(r7);	 Catch:{ all -> 0x008b }
        r5.m34325b(r7);	 Catch:{ all -> 0x008b }
        r5.m34326c(r7);	 Catch:{ all -> 0x008b }
        r0 = r5.f28971g;	 Catch:{ all -> 0x008b }
        r0 = r0.size();	 Catch:{ all -> 0x008b }
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r5);	 Catch:{ all -> 0x008b }
        return;
    L_0x0022:
        r0 = r6.m22635x();	 Catch:{ all -> 0x008b }
        r6.m22627p();	 Catch:{ all -> 0x008b }
        r1 = 771; // 0x303 float:1.08E-42 double:3.81E-321;
        r2 = 1;
        r0.glBlendFunc(r2, r1);	 Catch:{ all -> 0x008b }
        r1 = 8960; // 0x2300 float:1.2556E-41 double:4.427E-320;
        r3 = 8704; // 0x2200 float:1.2197E-41 double:4.3003E-320;
        r4 = 7681; // 0x1e01 float:1.0763E-41 double:3.795E-320;
        r0.glTexEnvx(r1, r3, r4);	 Catch:{ all -> 0x008b }
        r0 = r6.f18688f;	 Catch:{ all -> 0x008b }
        r0.mo7123d(r6);	 Catch:{ all -> 0x008b }
        r0 = new com.google.android.m4b.maps.bx.j;	 Catch:{ all -> 0x008b }
        r0.<init>(r8);	 Catch:{ all -> 0x008b }
        r8 = 0;
        r0.m22386a(r8);	 Catch:{ all -> 0x008b }
        r8 = r5.f28971g;	 Catch:{ all -> 0x008b }
        r8 = r8.iterator();	 Catch:{ all -> 0x008b }
    L_0x004c:
        r1 = r8.hasNext();	 Catch:{ all -> 0x008b }
        if (r1 == 0) goto L_0x0062;
    L_0x0052:
        r1 = r8.next();	 Catch:{ all -> 0x008b }
        r1 = (com.google.android.m4b.maps.cc.C6586m) r1;	 Catch:{ all -> 0x008b }
        r3 = r1.m29424j();	 Catch:{ all -> 0x008b }
        if (r3 == 0) goto L_0x004c;
    L_0x005e:
        r1.m29402a(r6, r7, r0);	 Catch:{ all -> 0x008b }
        goto L_0x004c;
    L_0x0062:
        r0.m22386a(r2);	 Catch:{ all -> 0x008b }
        r8 = 0;
        r1 = r5.f28971g;	 Catch:{ all -> 0x008b }
        r1 = r1.iterator();	 Catch:{ all -> 0x008b }
    L_0x006c:
        r2 = r1.hasNext();	 Catch:{ all -> 0x008b }
        if (r2 == 0) goto L_0x0084;
    L_0x0072:
        r2 = r1.next();	 Catch:{ all -> 0x008b }
        r2 = (com.google.android.m4b.maps.cc.C6586m) r2;	 Catch:{ all -> 0x008b }
        r3 = r2.m29425k();	 Catch:{ all -> 0x008b }
        if (r3 == 0) goto L_0x0080;
    L_0x007e:
        r8 = r2;
        goto L_0x006c;
    L_0x0080:
        r2.m29402a(r6, r7, r0);	 Catch:{ all -> 0x008b }
        goto L_0x006c;
    L_0x0084:
        if (r8 == 0) goto L_0x0089;
    L_0x0086:
        r8.m29402a(r6, r7, r0);	 Catch:{ all -> 0x008b }
    L_0x0089:
        monitor-exit(r5);	 Catch:{ all -> 0x008b }
        return;
    L_0x008b:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x008b }
        throw r6;
    L_0x008e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.q.a(com.google.android.m4b.maps.ca.d, com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.bx.j):void");
    }

    /* renamed from: a */
    public final synchronized void mo7563a(List<C5011l> list, float f, float f2, af afVar, C6570b c6570b, int i) {
        m34332a(c6570b);
        for (C5003c c5003c : this.f28971g) {
            if (c5003c.mo5286i()) {
                int a = c5003c.mo5280a(f, f2, c6570b);
                if (a < i) {
                    list.add(new C5011l(c5003c, this, a));
                }
            }
        }
    }

    /* renamed from: l */
    public final HashMap<Bitmap, C7490k> m34345l() {
        return this.f28969e;
    }

    /* renamed from: b */
    private void m34325b(C6570b c6570b) {
        C6487i a = C6487i.m28476a();
        for (C6586m c6586m : this.f28971g) {
            C4701c f = c6586m.mo5284f();
            if (f != null) {
                C6482f d = a.m28504d(f.m20902a());
                if (d != null) {
                    synchronized (c6586m) {
                        af c = c6586m.mo5283c();
                        c.m21476a((int) d.m28449a(c6570b, c));
                        c6586m.m29400a(c);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: a */
    final void m34332a(com.google.android.m4b.maps.bz.C6570b r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = r8.m29265u();
        r1 = r7.f28967c;
        if (r1 != 0) goto L_0x0011;
    L_0x0008:
        r1 = r7.f28970f;
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r1 = r7.f28971g;
        if (r1 != 0) goto L_0x001d;
    L_0x0015:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r7.f28971g = r1;
        goto L_0x0022;
    L_0x001d:
        r1 = r7.f28971g;
        r1.clear();
    L_0x0022:
        r1 = r0.mo5129a();
        r2 = r8.m29242b();
        r3 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r2 = com.google.android.m4b.maps.bo.bp.m28655a(r0, r2, r3);
        r3 = r7.f28966b;
        r3 = r3.iterator();
    L_0x0037:
        r4 = r3.hasNext();	 Catch:{ RuntimeException -> 0x0079 }
        if (r4 == 0) goto L_0x0079;	 Catch:{ RuntimeException -> 0x0079 }
    L_0x003d:
        r4 = r3.next();	 Catch:{ RuntimeException -> 0x0079 }
        r4 = (com.google.android.m4b.maps.cc.C6586m) r4;	 Catch:{ RuntimeException -> 0x0079 }
        r5 = r4.m29418d();	 Catch:{ RuntimeException -> 0x0079 }
        if (r5 == 0) goto L_0x0037;	 Catch:{ RuntimeException -> 0x0079 }
    L_0x0049:
        r5 = r4.m29421g();	 Catch:{ RuntimeException -> 0x0079 }
        if (r5 == 0) goto L_0x0037;	 Catch:{ RuntimeException -> 0x0079 }
    L_0x004f:
        r5 = new com.google.android.m4b.maps.bo.af;	 Catch:{ RuntimeException -> 0x0079 }
        r5.<init>();	 Catch:{ RuntimeException -> 0x0079 }
        r6 = r4.mo5283c();	 Catch:{ RuntimeException -> 0x0079 }
        r6.m21497i(r5);	 Catch:{ RuntimeException -> 0x0079 }
        r6 = r1.mo5131a(r5);	 Catch:{ RuntimeException -> 0x0079 }
        if (r6 == 0) goto L_0x0067;	 Catch:{ RuntimeException -> 0x0079 }
    L_0x0061:
        r6 = r0.mo5131a(r5);	 Catch:{ RuntimeException -> 0x0079 }
        if (r6 != 0) goto L_0x0073;	 Catch:{ RuntimeException -> 0x0079 }
    L_0x0067:
        r5 = r2.mo5131a(r5);	 Catch:{ RuntimeException -> 0x0079 }
        if (r5 == 0) goto L_0x0037;	 Catch:{ RuntimeException -> 0x0079 }
    L_0x006d:
        r5 = r4.mo5282b(r8);	 Catch:{ RuntimeException -> 0x0079 }
        if (r5 == 0) goto L_0x0037;	 Catch:{ RuntimeException -> 0x0079 }
    L_0x0073:
        r5 = r7.f28971g;	 Catch:{ RuntimeException -> 0x0079 }
        r5.add(r4);	 Catch:{ RuntimeException -> 0x0079 }
        goto L_0x0037;
    L_0x0079:
        r7.f28970f = r0;
        r8 = 0;
        r7.f28967c = r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.q.a(com.google.android.m4b.maps.bz.b):void");
    }

    /* renamed from: c */
    private void m34326c(C6570b c6570b) {
        for (C6586m a : this.f28971g) {
            a.m29407a(c6570b);
        }
        if (this.f28971g.size() > 1) {
            Collections.sort(this.f28971g);
        }
    }

    /* renamed from: o */
    private synchronized void m34330o() {
        Iterator it = this.f28966b.iterator();
        while (it.hasNext()) {
            C6586m c6586m = (C6586m) it.next();
            c6586m.m29427m();
            c6586m.m29428n();
        }
        this.f28969e.clear();
    }

    /* renamed from: m */
    public final synchronized List<az> m34346m() {
        List<az> arrayList;
        arrayList = new ArrayList();
        for (C6586m p : this.f28971g) {
            arrayList.add(p.m29430p());
        }
        return arrayList;
    }
}
