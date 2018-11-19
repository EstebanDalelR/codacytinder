package com.google.android.m4b.maps.bc;

import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ba.C4743b;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bw.C4967a;
import com.google.android.m4b.maps.by.C5043a;
import com.google.android.m4b.maps.by.C5043a.C5042d;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cc.C6587q;
import com.google.android.m4b.maps.cc.C7505u;
import com.google.android.m4b.maps.cg.bz;
import com.google.android.m4b.maps.cg.bz.C5159a;
import com.google.android.m4b.maps.cg.bz.C5160b;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.bc.s */
public final class C6448s implements C5159a {
    /* renamed from: b */
    private static C6587q f23932b = new C7505u();
    /* renamed from: a */
    final Set<C5160b> f23933a = Collections.synchronizedSet(new HashSet());
    /* renamed from: c */
    private final C5042d f23934c;
    /* renamed from: d */
    private final bz f23935d;
    /* renamed from: e */
    private final Set<ba> f23936e = Collections.synchronizedSet(new HashSet());
    /* renamed from: f */
    private volatile C5052d f23937f;
    /* renamed from: g */
    private final C5043a f23938g;
    /* renamed from: h */
    private volatile C4767a f23939h;
    /* renamed from: i */
    private final C5203e f23940i;

    /* renamed from: com.google.android.m4b.maps.bc.s$a */
    public interface C4767a {
        /* renamed from: b */
        void mo5003b(boolean z);
    }

    public C6448s(bz bzVar, String str, C5203e c5203e) {
        this.f23935d = (bz) C5571j.m24292a((Object) bzVar);
        this.f23934c = new C5042d(bg.f17764t, null, C6448s.m28253a(Integer.valueOf(str.replaceAll("\\D", "")).intValue()));
        C5043a.m22550a(new C4712d());
        this.f23938g = C5043a.m22547a();
        this.f23940i = c5203e;
    }

    /* renamed from: a */
    private static C4967a m28253a(int i) {
        Object obj = new int[32];
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            if (((1 << i3) & i) != 0) {
                int i4 = i2 + 1;
                obj[i2] = i3;
                i2 = i4;
            }
        }
        int[] iArr = new int[i2];
        System.arraycopy(obj, 0, iArr, 0, i2);
        return C4967a.m22228a(iArr);
    }

    /* renamed from: a */
    public final void m28259a(C4767a c4767a) {
        boolean z = false;
        if (this.f23939h == null) {
            if (c4767a != null) {
                z = true;
            }
            C5571j.m24297a(z);
        } else {
            if (c4767a == null) {
                z = true;
            }
            C5571j.m24297a(z);
        }
        this.f23939h = c4767a;
    }

    /* renamed from: a */
    public final void m28260a(C5052d c5052d) {
        C5571j.m24293a((Object) c5052d, (Object) "state must not be null.");
        this.f23937f = c5052d;
    }

    /* renamed from: a */
    public final C6587q m28257a(ba baVar) {
        return m28254a(baVar, false);
    }

    /* renamed from: b */
    public final C6587q m28265b(ba baVar) {
        C6587q a = m28254a(baVar, true);
        if (a != null) {
            return a;
        }
        if (this.f23936e.add(baVar)) {
            this.f23935d.m23070a(baVar.m21620c(), baVar.m21621d(), baVar.m21619b(), this);
        }
        return null;
    }

    /* renamed from: a */
    private C6587q m28254a(ba baVar, boolean z) {
        if (this.f23937f == null) {
            return null;
        }
        return this.f23938g.m22555a(this.f23937f, this.f23934c, baVar, z);
    }

    /* renamed from: a */
    public final void m28258a() {
        C5571j.m24301b(this.f23937f != null);
        this.f23938g.m22567d(this.f23937f, this.f23934c);
    }

    /* renamed from: b */
    public final void m28266b() {
        C5571j.m24301b(this.f23937f != null);
        if (C4743b.f17387a) {
            this.f23938g.m22566c(this.f23937f, this.f23934c);
        }
    }

    /* renamed from: a */
    public final void m28263a(List<C6587q> list) {
        C5571j.m24301b(this.f23937f != null);
        List arrayList = new ArrayList(list.size());
        for (C6587q c6587q : list) {
            if (c6587q != f23932b) {
                arrayList.add(c6587q.mo7136b());
            }
        }
        this.f23938g.m22559a(this.f23937f, this.f23934c, arrayList);
    }

    /* renamed from: b */
    public final void m28267b(List<C6587q> list) {
        C5571j.m24301b(this.f23937f != null);
        List arrayList = new ArrayList(list.size());
        for (C6587q c6587q : list) {
            if (c6587q != f23932b) {
                arrayList.add(c6587q.mo7136b());
            }
        }
        this.f23938g.m22564b(this.f23937f, this.f23934c, arrayList);
    }

    /* renamed from: c */
    public final void m28269c() {
        if (this.f23937f != null) {
            this.f23938g.m22563b(this.f23937f, this.f23934c);
        }
    }

    /* renamed from: a */
    public final void m28264a(boolean z) {
        C5052d c5052d = this.f23937f;
        if (c5052d == true) {
            this.f23938g.m22557a(c5052d, this.f23934c);
        }
    }

    /* renamed from: b */
    public final void m28268b(boolean z) {
        this.f23938g.m22560a(z);
    }

    /* renamed from: d */
    public final void m28270d() {
        this.f23938g.m22561b();
    }

    /* renamed from: a */
    public final void mo5000a(com.google.android.m4b.maps.cg.bz.C5160b r13, com.google.android.m4b.maps.model.Tile r14) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r12 = this;
        r0 = r14.width;
        r1 = 0;
        r2 = 1;
        if (r0 <= 0) goto L_0x0008;
    L_0x0006:
        r0 = 1;
        goto L_0x0009;
    L_0x0008:
        r0 = 0;
    L_0x0009:
        r3 = "width of tile image must be positive";
        com.google.android.m4b.maps.p125y.C5571j.m24298a(r0, r3);
        r0 = r14.height;
        if (r0 <= 0) goto L_0x0014;
    L_0x0012:
        r0 = 1;
        goto L_0x0015;
    L_0x0014:
        r0 = 0;
    L_0x0015:
        r3 = "height of tile image must be positive";
        com.google.android.m4b.maps.p125y.C5571j.m24298a(r0, r3);
        r0 = new com.google.android.m4b.maps.bo.ba;
        r3 = r13.f19152c;
        r4 = r13.f19150a;
        r5 = r13.f19151b;
        r0.<init>(r3, r4, r5);
        r3 = new com.google.android.m4b.maps.bo.o;	 Catch:{ IOException -> 0x0051 }
        r6 = 0;	 Catch:{ IOException -> 0x0051 }
        r7 = r14.width;	 Catch:{ IOException -> 0x0051 }
        r8 = r14.height;	 Catch:{ IOException -> 0x0051 }
        r9 = r14.data;	 Catch:{ IOException -> 0x0051 }
        r10 = com.google.android.m4b.maps.bo.bg.f17764t;	 Catch:{ IOException -> 0x0051 }
        r11 = r12.f23940i;	 Catch:{ IOException -> 0x0051 }
        r4 = r3;	 Catch:{ IOException -> 0x0051 }
        r5 = r0;	 Catch:{ IOException -> 0x0051 }
        r4.<init>(r5, r6, r7, r8, r9, r10, r11);	 Catch:{ IOException -> 0x0051 }
        r14 = r12.f23933a;	 Catch:{ IOException -> 0x0051 }
        r14.remove(r13);	 Catch:{ IOException -> 0x0051 }
        r13 = r12.f23937f;	 Catch:{ IOException -> 0x0051 }
        if (r13 == 0) goto L_0x0041;	 Catch:{ IOException -> 0x0051 }
    L_0x0040:
        r1 = 1;	 Catch:{ IOException -> 0x0051 }
    L_0x0041:
        com.google.android.m4b.maps.p125y.C5571j.m24301b(r1);	 Catch:{ IOException -> 0x0051 }
        r13 = r12.f23937f;	 Catch:{ IOException -> 0x0051 }
        r14 = 0;	 Catch:{ IOException -> 0x0051 }
        if (r13 == 0) goto L_0x004d;	 Catch:{ IOException -> 0x0051 }
    L_0x0049:
        r14 = com.google.android.m4b.maps.cc.C7497f.m32621a(r3, r13);	 Catch:{ IOException -> 0x0051 }
    L_0x004d:
        r12.m28255a(r0, r14, r13);	 Catch:{ IOException -> 0x0051 }
        return;
    L_0x0051:
        r12.m28256c(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bc.s.a(com.google.android.m4b.maps.cg.bz$b, com.google.android.m4b.maps.model.Tile):void");
    }

    /* renamed from: a */
    public final void mo4999a(C5160b c5160b) {
        this.f23933a.remove(c5160b);
        m28256c(new ba(c5160b.f19152c, c5160b.f19150a, c5160b.f19151b));
    }

    /* renamed from: c */
    private void m28256c(ba baVar) {
        C5571j.m24301b(this.f23937f != null);
        m28255a(baVar, f23932b, this.f23937f);
    }

    /* renamed from: a */
    private void m28255a(ba baVar, C6587q c6587q, C5052d c5052d) {
        if (this.f23938g != null) {
            this.f23938g.m22558a(c5052d, this.f23934c, baVar, c6587q);
        }
        this.f23936e.remove(baVar);
        baVar = c6587q != null ? true : null;
        c6587q = this.f23939h;
        if (c6587q != null) {
            c6587q.mo5003b(baVar);
        }
    }
}
