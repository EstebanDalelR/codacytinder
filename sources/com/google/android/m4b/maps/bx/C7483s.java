package com.google.android.m4b.maps.bx;

import android.graphics.Color;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.bk.C4803f;
import com.google.android.m4b.maps.bk.C4805k;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5051c;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cb.C5067l;
import com.google.android.m4b.maps.cb.C6577c;
import com.google.android.m4b.maps.cb.C6580k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bx.s */
public final class C7483s extends C6561r {
    /* renamed from: a */
    private static final af f27588a = new af(-1073741824, 0);
    /* renamed from: b */
    private static final af f27589b = new af(1073741824, 0);
    /* renamed from: c */
    private final List<aj> f27590c = new ArrayList();
    /* renamed from: d */
    private final al f27591d;
    /* renamed from: e */
    private final List<aj> f27592e = new ArrayList();
    /* renamed from: f */
    private final Object f27593f = new Object();
    /* renamed from: g */
    private C4805k f27594g = C4805k.m21268a();
    /* renamed from: h */
    private boolean f27595h = false;
    /* renamed from: i */
    private al f27596i;
    /* renamed from: j */
    private float f27597j;
    /* renamed from: k */
    private float f27598k;
    /* renamed from: l */
    private byte f27599l;
    /* renamed from: m */
    private boolean f27600m;
    /* renamed from: n */
    private boolean f27601n;
    /* renamed from: o */
    private C6580k f27602o;
    /* renamed from: p */
    private C6577c f27603p;
    /* renamed from: q */
    private al f27604q;
    /* renamed from: r */
    private int f27605r;
    /* renamed from: s */
    private final Object f27606s = new Object();
    /* renamed from: t */
    private int f27607t;
    /* renamed from: u */
    private int f27608u;
    /* renamed from: v */
    private final List<C7482p> f27609v;
    /* renamed from: w */
    private boolean f27610w = false;
    /* renamed from: x */
    private aj f27611x;

    /* renamed from: com.google.android.m4b.maps.bx.s$a */
    class C5017a implements Runnable {
        /* renamed from: a */
        private /* synthetic */ C7483s f18541a;

        private C5017a(C7483s c7483s) {
            this.f18541a = c7483s;
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r5 = this;
            r0 = r5.f18541a;
            r0 = r0.f27593f;
            monitor-enter(r0);
            r1 = r5.f18541a;	 Catch:{ all -> 0x007c }
            r1 = r1.f27592e;	 Catch:{ all -> 0x007c }
            r1 = com.google.android.m4b.maps.aa.au.m20525a(r1);	 Catch:{ all -> 0x007c }
            monitor-exit(r0);	 Catch:{ all -> 0x007c }
            r0 = 0;
            r2 = com.google.android.m4b.maps.bk.C4803f.C4802a.AREA_VERIFICATION;	 Catch:{ b -> 0x001a }
            r1 = com.google.android.m4b.maps.bk.C4803f.m21252a(r1, r2);	 Catch:{ b -> 0x001a }
            goto L_0x004f;
        L_0x001a:
            r1 = r5.f18541a;	 Catch:{ b -> 0x004b }
            r1 = r1.f27590c;	 Catch:{ b -> 0x004b }
            r1 = com.google.android.m4b.maps.aa.au.m20525a(r1);	 Catch:{ b -> 0x004b }
            r2 = r1.iterator();	 Catch:{ b -> 0x004b }
            r3 = 0;	 Catch:{ b -> 0x004b }
        L_0x0029:
            r4 = r2.hasNext();	 Catch:{ b -> 0x004b }
            if (r4 == 0) goto L_0x003b;	 Catch:{ b -> 0x004b }
        L_0x002f:
            r4 = r2.next();	 Catch:{ b -> 0x004b }
            r4 = (com.google.android.m4b.maps.bo.aj) r4;	 Catch:{ b -> 0x004b }
            r4 = r4.m21528b();	 Catch:{ b -> 0x004b }
            r3 = r3 + r4;	 Catch:{ b -> 0x004b }
            goto L_0x0029;	 Catch:{ b -> 0x004b }
        L_0x003b:
            r2 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;	 Catch:{ b -> 0x004b }
            if (r3 >= r2) goto L_0x0046;	 Catch:{ b -> 0x004b }
        L_0x003f:
            r2 = com.google.android.m4b.maps.bk.C4803f.C4802a.AREA_VERIFICATION_WITH_REASON;	 Catch:{ b -> 0x004b }
            r1 = com.google.android.m4b.maps.bk.C4803f.m21252a(r1, r2);	 Catch:{ b -> 0x004b }
            goto L_0x004f;	 Catch:{ b -> 0x004b }
        L_0x0046:
            r1 = com.google.android.m4b.maps.bk.C4805k.m21268a();	 Catch:{ b -> 0x004b }
            goto L_0x004f;
        L_0x004b:
            r1 = com.google.android.m4b.maps.bk.C4805k.m21268a();
        L_0x004f:
            r2 = r5.f18541a;
            r2 = r2.f27593f;
            monitor-enter(r2);
            r3 = r5.f18541a;	 Catch:{ all -> 0x0079 }
            r3.f27594g = r1;	 Catch:{ all -> 0x0079 }
            r1 = r5.f18541a;	 Catch:{ all -> 0x0079 }
            r3 = 1;	 Catch:{ all -> 0x0079 }
            r1.f27601n = true;	 Catch:{ all -> 0x0079 }
            r1 = r5.f18541a;	 Catch:{ all -> 0x0079 }
            r1.f27595h = false;	 Catch:{ all -> 0x0079 }
            r1 = r5.f18541a;	 Catch:{ all -> 0x0079 }
            r1 = r1.f27611x;	 Catch:{ all -> 0x0079 }
            if (r1 == 0) goto L_0x0077;	 Catch:{ all -> 0x0079 }
        L_0x006e:
            r1 = r5.f18541a;	 Catch:{ all -> 0x0079 }
            r1 = r1.f27611x;	 Catch:{ all -> 0x0079 }
            r1.mo5221a(r3, r0);	 Catch:{ all -> 0x0079 }
        L_0x0077:
            monitor-exit(r2);	 Catch:{ all -> 0x0079 }
            return;	 Catch:{ all -> 0x0079 }
        L_0x0079:
            r0 = move-exception;	 Catch:{ all -> 0x0079 }
            monitor-exit(r2);	 Catch:{ all -> 0x0079 }
            throw r0;
        L_0x007c:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x007c }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.s.a.run():void");
        }
    }

    public C7483s(aj ajVar, List<aj> list, int i, int i2, int i3, boolean z) {
        int g = ajVar.m21538g();
        this.f27590c.add(ajVar.m21533c(g));
        for (aj c : list) {
            this.f27590c.add(c.m21533c(g));
        }
        this.f27591d = ((aj) this.f27590c.get(0)).m21523a();
        this.f27608u = i;
        this.f27607t = i2;
        this.f27609v = new ArrayList();
        for (aj c7482p : this.f27590c) {
            this.f27609v.add(new C7482p(c7482p, (float) this.f27608u, this.f27607t, null, true));
        }
        this.f27605r = i3;
        this.f27610w = true;
        this.f27594g = C4805k.m21268a();
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return C5016a.UNUSED;
    }

    /* renamed from: a */
    public final void mo7041a(C5052d c5052d, aj ajVar) {
        synchronized (this.f27593f) {
            this.f27611x = ajVar;
        }
    }

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        if (m32511f()) {
            boolean z;
            synchronized (this.f27606s) {
                z = this.f27600m;
                this.f27600m = false;
            }
            m32502a(c6570b, z);
        }
        synchronized (this.f27609v) {
            for (C7482p a : this.f27609v) {
                a.mo7044a(c6570b, c5052d);
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo7040a(C5052d c5052d) {
        mo5223b(c5052d);
    }

    /* renamed from: b */
    public final void mo5223b(C5052d c5052d) {
        if (this.f27602o != null) {
            this.f27602o.m29354c(c5052d);
            this.f27603p.m29319c(c5052d);
        }
    }

    /* renamed from: a */
    public final void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        C7483s c7483s = this;
        C5052d c5052d2 = c5052d;
        C6570b c6570b2 = c6570b;
        if (c5009j.m22388b() == 0) {
            if (m32511f()) {
                boolean z;
                int i;
                synchronized (c7483s.f27606s) {
                    try {
                        z = c7483s.f27600m;
                        i = 0;
                        c7483s.f27600m = false;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                if (c7483s.f27596i == null) {
                    m32502a(c6570b2, z);
                }
                if (m32504a(c6570b2)) {
                    C4805k c4805k;
                    al b = C7483s.m32505b(c6570b);
                    synchronized (c7483s.f27593f) {
                        try {
                            c4805k = c7483s.f27594g;
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                            }
                        }
                    }
                    byte a = C7483s.m32498a(c7483s.f27591d, b);
                    int i2 = (a & 1) != 0 ? 1 : 0;
                    Object obj = (a & 2) != 0 ? 1 : null;
                    int i3 = obj != null ? i2 + 1 : i2;
                    Object obj2 = (a & 4) != 0 ? 1 : null;
                    if (obj2 != null) {
                        i3++;
                    }
                    int e = c4805k.mo5041e();
                    C5067l c6580k = new C6580k(e * i3);
                    Object c6577c = new C6577c(i3 * (c4805k.mo5040d() * 3));
                    af c = b.m32212c();
                    int f = b.m32215f();
                    if (i2 != 0) {
                        C4803f.m21253a(c4805k, c6577c, 0);
                        C4803f.m21254a(c4805k, c6580k, c, f);
                        i = 1;
                    }
                    if (obj != null) {
                        C4803f.m21253a(c4805k, c6577c, e * i);
                        C4803f.m21254a(c4805k, c6580k, c.m21489e(f27588a), f);
                        i++;
                    }
                    if (obj2 != null) {
                        C4803f.m21253a(c4805k, c6577c, e * i);
                        C4803f.m21254a(c4805k, c6580k, c.m21489e(f27589b), f);
                    }
                    c7483s.f27602o = c6580k;
                    c7483s.f27603p = c6577c;
                    c7483s.f27604q = new al(b.m32212c(), b.m32213d());
                    c7483s.f27598k = c6570b.m29253i();
                    c7483s.f27599l = a;
                }
                GL10 x = c5052d.m22635x();
                x.glPushMatrix();
                if (c7483s.f27602o != null && c7483s.f27602o.mo5250a() > 0) {
                    GL10 x2 = c5052d.m22635x();
                    an.m22329b(c5052d2, c6570b2, c7483s.f27604q.m32212c(), (float) c7483s.f27604q.m32215f());
                    x2.glBlendFunc(1, 771);
                    c7483s.f27602o.mo7123d(c5052d2);
                    synchronized (c7483s.f27606s) {
                        try {
                            C5051c.m22593a(x2, c7483s.f27605r);
                        } catch (Throwable th22) {
                            while (true) {
                                throw th22;
                            }
                        }
                    }
                    c7483s.f27603p.mo7110a(c5052d2, 4);
                }
                x.glPopMatrix();
            }
            c5052d.m22597A();
            synchronized (c7483s.f27609v) {
                try {
                    for (C7482p c7482p : c7483s.f27609v) {
                        c5052d.m22637z();
                        c7482p.mo5222a(c5052d2, c6570b2, c5009j);
                        c5052d.m22597A();
                    }
                } catch (Throwable th222) {
                    while (true) {
                        throw th222;
                    }
                }
            }
            c5052d.m22637z();
        }
    }

    public final boolean e_() {
        Iterator it = this.f27609v.iterator();
        do {
            boolean z = false;
            if (!it.hasNext()) {
                synchronized (this.f27593f) {
                    if (!(this.f27595h || this.f27601n)) {
                        z = true;
                    }
                }
                return z;
            }
        } while (((C7482p) it.next()).e_());
        return false;
    }

    /* renamed from: e */
    private static boolean m32510e(int i) {
        return Color.alpha(i) == 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private boolean m32504a(com.google.android.m4b.maps.bz.C6570b r6) {
        /*
        r5 = this;
        r0 = r5.f27593f;
        monitor-enter(r0);
        r1 = r5.f27601n;	 Catch:{ all -> 0x0034 }
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x000d;
    L_0x0009:
        r5.f27601n = r3;	 Catch:{ all -> 0x0034 }
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        return r2;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        r0 = r6.m29253i();
        r1 = r5.f27599l;
        r4 = r5.f27591d;
        r6 = com.google.android.m4b.maps.bx.C7483s.m32505b(r6);
        r6 = com.google.android.m4b.maps.bx.C7483s.m32498a(r4, r6);
        if (r1 != r6) goto L_0x0033;
    L_0x0020:
        r6 = r5.f27598k;
        r1 = 1067450368; // 0x3fa00000 float:1.25 double:5.273905555E-315;
        r6 = r6 * r1;
        r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r6 > 0) goto L_0x0033;
    L_0x002a:
        r6 = r5.f27598k;
        r6 = r6 / r1;
        r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r6 >= 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0033;
    L_0x0032:
        return r3;
    L_0x0033:
        return r2;
    L_0x0034:
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0034 }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.s.a(com.google.android.m4b.maps.bz.b):boolean");
    }

    /* renamed from: f */
    private boolean m32511f() {
        boolean e;
        synchronized (this.f27606s) {
            e = C7483s.m32510e(this.f27605r) ^ 1;
        }
        return e;
    }

    /* renamed from: a */
    private static byte m32498a(al alVar, al alVar2) {
        byte a = alVar2.mo5091a((am) alVar);
        af afVar = f27589b;
        if (new al(alVar2.m32212c().m21489e(afVar), alVar2.m32213d().m21489e(afVar)).mo5091a((am) alVar)) {
            a = (byte) (a | 4);
        }
        return new al(alVar2.m32212c().m21491f(afVar), alVar2.m32213d().m21491f(afVar)).mo5091a((am) alVar) != null ? (byte) (a | 2) : a;
    }

    /* renamed from: b */
    private static al m32505b(C6570b c6570b) {
        af f;
        c6570b = c6570b.m29265u().m28662b();
        int f2 = c6570b.m32215f();
        int g = c6570b.m32216g();
        if (f2 <= 119304647) {
            if (g <= 119304647) {
                af afVar = new af(f2 * 4, g * 4);
                f = c6570b.m32212c().m21491f(afVar);
                c6570b = c6570b.m32213d().m21489e(afVar);
                return new al(f, c6570b);
            }
        }
        f = new af(c6570b.m32214e().m21490f() - 536870912, -536870912);
        c6570b = new af((c6570b.m32214e().m21490f() + 536870912) - 1, 536870911);
        return new al(f, c6570b);
    }

    /* renamed from: a */
    static int m32499a(int i, boolean z) {
        if (z) {
            return ((true << (30 - i)) / 256) / 2;
        }
        return (2 << (30 - i)) / 256;
    }

    /* renamed from: b */
    public final void m32516b(int i) {
        this.f27607t = i;
        synchronized (this.f27609v) {
            for (C7482p b : this.f27609v) {
                b.m32495b(i);
            }
        }
    }

    /* renamed from: c */
    public final void m32518c(int i) {
        synchronized (this.f27606s) {
            if (C7483s.m32510e(this.f27605r) && !C7483s.m32510e(i)) {
                synchronized (this.f27593f) {
                    this.f27594g = C4805k.m21268a();
                    this.f27601n = true;
                }
                this.f27600m = true;
            }
            this.f27605r = i;
        }
    }

    /* renamed from: d */
    public final void m32520d(int i) {
        this.f27608u = i;
        synchronized (this.f27609v) {
            for (C7482p a : this.f27609v) {
                a.m32491a((float) i);
            }
        }
    }

    /* renamed from: a */
    private void m32502a(C6570b c6570b, boolean z) {
        al b;
        Collection a;
        int size;
        int i;
        if (!z) {
            if (this.f27596i) {
                if ((!C7483s.m32498a(this.f27591d, this.f27596i)) == (C7483s.m32498a(this.f27591d, C7483s.m32505b(c6570b)) == (byte) 0)) {
                    z = false;
                    if (!z) {
                        if (c6570b.m29253i() >= this.f27597j / 2.0f) {
                            z = false;
                            if (z) {
                                b = C7483s.m32505b(c6570b);
                                synchronized (this.f27593f) {
                                    this.f27592e.clear();
                                    if (C7483s.m32498a(this.f27591d, b) != (byte) 0) {
                                        this.f27592e.addAll(this.f27590c);
                                    }
                                    this.f27596i = b;
                                }
                            }
                            if (!z) {
                                z = c6570b.m29253i();
                                if (z <= this.f27597j * 2.0f) {
                                    if (z < this.f27597j / 2.0f) {
                                        z = false;
                                        if (!z) {
                                            return;
                                        }
                                    }
                                }
                                z = true;
                                if (z) {
                                    return;
                                }
                            }
                            synchronized (this.f27593f) {
                                a = au.m20525a(this.f27592e);
                            }
                            z = C7483s.m32499a(((int) c6570b.m29256l()) + true, this.f27610w);
                            size = a.size();
                            for (i = 0; i < size; i++) {
                                a.set(i, ((aj) a.get(i)).m21529b((float) z));
                            }
                            synchronized (this.f27593f) {
                                this.f27592e.clear();
                                this.f27592e.addAll(a);
                            }
                            this.f27597j = c6570b.m29253i();
                            synchronized (this.f27593f) {
                                this.f27595h = true;
                            }
                            new Thread(new C5017a()).start();
                        }
                    }
                }
            }
            z = true;
            if (z) {
                if (c6570b.m29253i() >= this.f27597j / 2.0f) {
                }
                if (c6570b.m29253i() >= this.f27597j / 2.0f) {
                    z = false;
                    if (z) {
                        b = C7483s.m32505b(c6570b);
                        synchronized (this.f27593f) {
                            this.f27592e.clear();
                            if (C7483s.m32498a(this.f27591d, b) != (byte) 0) {
                                this.f27592e.addAll(this.f27590c);
                            }
                            this.f27596i = b;
                        }
                    }
                    if (z) {
                        z = c6570b.m29253i();
                        if (z <= this.f27597j * 2.0f) {
                            if (z < this.f27597j / 2.0f) {
                                z = false;
                                if (z) {
                                    return;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                            return;
                        }
                    }
                    synchronized (this.f27593f) {
                        a = au.m20525a(this.f27592e);
                    }
                    z = C7483s.m32499a(((int) c6570b.m29256l()) + true, this.f27610w);
                    size = a.size();
                    for (i = 0; i < size; i++) {
                        a.set(i, ((aj) a.get(i)).m21529b((float) z));
                    }
                    synchronized (this.f27593f) {
                        this.f27592e.clear();
                        this.f27592e.addAll(a);
                    }
                    this.f27597j = c6570b.m29253i();
                    synchronized (this.f27593f) {
                        this.f27595h = true;
                    }
                    new Thread(new C5017a()).start();
                }
            }
        }
        z = true;
        if (z) {
            b = C7483s.m32505b(c6570b);
            synchronized (this.f27593f) {
                this.f27592e.clear();
                if (C7483s.m32498a(this.f27591d, b) != (byte) 0) {
                    this.f27592e.addAll(this.f27590c);
                }
                this.f27596i = b;
            }
        }
        if (z) {
            z = c6570b.m29253i();
            if (z <= this.f27597j * 2.0f) {
                if (z < this.f27597j / 2.0f) {
                    z = false;
                    if (z) {
                        return;
                    }
                }
            }
            z = true;
            if (z) {
                return;
            }
        }
        synchronized (this.f27593f) {
            a = au.m20525a(this.f27592e);
        }
        z = C7483s.m32499a(((int) c6570b.m29256l()) + true, this.f27610w);
        size = a.size();
        for (i = 0; i < size; i++) {
            a.set(i, ((aj) a.get(i)).m21529b((float) z));
        }
        synchronized (this.f27593f) {
            this.f27592e.clear();
            this.f27592e.addAll(a);
        }
        this.f27597j = c6570b.m29253i();
        synchronized (this.f27593f) {
            this.f27595h = true;
        }
        new Thread(new C5017a()).start();
    }
}
