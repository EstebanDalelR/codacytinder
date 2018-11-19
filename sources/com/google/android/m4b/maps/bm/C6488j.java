package com.google.android.m4b.maps.bm;

import android.util.Log;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bm.C4824c.C4823a;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.al;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bq;
import com.google.android.m4b.maps.bu.C4910a;
import com.google.android.m4b.maps.bu.C4911b;
import com.google.android.m4b.maps.bu.C7472c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.m4b.maps.bm.j */
public final class C6488j implements C4824c, C4911b {
    /* renamed from: b */
    private final String f24057b;
    /* renamed from: c */
    private final af f24058c;
    /* renamed from: d */
    private final af f24059d;
    /* renamed from: e */
    private volatile boolean f24060e;
    /* renamed from: f */
    private volatile af f24061f;
    /* renamed from: g */
    private final CopyOnWriteArrayList<C4823a> f24062g;
    /* renamed from: h */
    private volatile C4830a f24063h;

    /* renamed from: com.google.android.m4b.maps.bm.j$1 */
    class C48291 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ C6488j f17617a;

        C48291(C6488j c6488j) {
            this.f17617a = c6488j;
        }

        public final void run() {
            C6488j.m28510a(this.f17617a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bm.j$a */
    static class C4830a {
        /* renamed from: a */
        final C6481e f17618a;
        /* renamed from: b */
        final bq f17619b;
        /* renamed from: c */
        final bq f17620c;

        C4830a() {
            this.f17618a = new C6481e();
            this.f17619b = bq.m28669a(new al(new af(), new af()));
            this.f17620c = bq.m28669a(new al(new af(), new af()));
        }

        C4830a(C6481e c6481e, bq bqVar, bq bqVar2) {
            this.f17618a = c6481e;
            this.f17619b = bqVar;
            this.f17620c = bqVar2;
        }
    }

    private C6488j(String str, af afVar, af afVar2) {
        this.f24057b = str;
        this.f24058c = afVar;
        if (afVar.m21490f() < afVar2.m21490f() || afVar.m21492g() < afVar2.m21492g()) {
            this.f24059d = this.f24058c;
        } else {
            this.f24059d = afVar2;
        }
        this.f24062g = new CopyOnWriteArrayList();
        this.f24061f = new af();
        this.f24063h = new C4830a();
    }

    public C6488j(String str) {
        this(str, new af(5000000, 5000000), new af(4000000, 4000000));
    }

    /* renamed from: a */
    private static bq m28509a(af afVar, af afVar2) {
        af g = ba.m21609b(15, afVar.m21491f(afVar2)).m21624g();
        afVar = ba.m21609b(15, afVar.m21489e(afVar2)).m21625h();
        if (g.m21490f() > afVar.m21490f()) {
            afVar = afVar.m21489e(new af(1073741824, 0));
        }
        return bq.m28669a(new al(g, afVar));
    }

    /* renamed from: a */
    public final Collection<C4820a> mo5082a(ba baVar) {
        if (baVar.m21619b() < 15) {
            return com.google.android.m4b.maps.aa.al.m27704f();
        }
        am i = baVar.m21626i();
        C4830a c4830a = this.f24063h;
        if (!(this.f24060e || c4830a.f17620c.mo5132a(i))) {
            af e = i.m32214e();
            synchronized (this) {
                if (this.f24060e) {
                } else {
                    this.f24060e = true;
                    this.f24061f = e;
                    if (C4728u.m21050a("LazyBuildingBoundProvider", 3)) {
                        Log.d("LazyBuildingBoundProvider", "fetch thread is scheduled");
                    }
                    new Thread(new C48291(this)).start();
                }
            }
        }
        if (c4830a.f17619b.mo5132a(i)) {
            return c4830a.f17618a.mo5082a(baVar);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo5084a(C4699a c4699a) {
        return this.f24063h.f17618a.mo5084a(c4699a);
    }

    /* renamed from: a */
    public final void mo5083a(C4823a c4823a) {
        if (c4823a != null) {
            this.f24062g.add(c4823a);
        }
    }

    /* renamed from: b */
    public final void mo5085b(C4823a c4823a) {
        if (c4823a != null) {
            this.f24062g.remove(c4823a);
        }
    }

    /* renamed from: a */
    public final void mo5094a(C4910a c4910a) {
        IOException iOException;
        IOException e;
        Iterator it;
        Throwable th;
        Throwable th2;
        C6488j c6488j = this;
        if (c4910a != null) {
            synchronized (c4910a) {
                try {
                    if (!c6488j.f24060e) {
                    } else if (c4910a.m22021b()) {
                        if (C4728u.m21050a("LazyBuildingBoundProvider", 3)) {
                            String valueOf = String.valueOf(c6488j.f24061f);
                            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
                            stringBuilder.append("start fetchBuildingBoundMap : center = ");
                            stringBuilder.append(valueOf);
                            Log.d("LazyBuildingBoundProvider", stringBuilder.toString());
                        }
                        byte[] d = c4910a.m22023d();
                        if (d != null && d.length > 0) {
                            try {
                                StringBuilder stringBuilder2;
                                bq a = C6488j.m28509a(c6488j.f24061f, c6488j.f24058c);
                                bq a2 = C6488j.m28509a(c6488j.f24061f, c6488j.f24059d);
                                if (C4728u.m21050a("LazyBuildingBoundProvider", 3)) {
                                    String str = "LazyBuildingBoundProvider";
                                    double b = a.m28680f().m21481b();
                                    double d2 = a.m28680f().m21485d();
                                    double b2 = a.m28681g().m21481b();
                                    double d3 = a.m28681g().m21485d();
                                    try {
                                        stringBuilder2 = new StringBuilder(119);
                                        stringBuilder2.append("Active Area: (");
                                        stringBuilder2.append(b);
                                        stringBuilder2.append(", ");
                                        stringBuilder2.append(d2);
                                        stringBuilder2.append("), (");
                                        stringBuilder2.append(b2);
                                        stringBuilder2.append(", ");
                                        stringBuilder2.append(d3);
                                        stringBuilder2.append(")");
                                        Log.d(str, stringBuilder2.toString());
                                    } catch (IOException e2) {
                                        iOException = e2;
                                        c6488j = this;
                                        iOException.printStackTrace();
                                        c6488j.f24060e = false;
                                        it = c6488j.f24062g.iterator();
                                        while (it.hasNext()) {
                                            ((C4823a) it.next()).mo7553a();
                                        }
                                        return;
                                    } catch (Throwable th22) {
                                        th = th22;
                                        c6488j = this;
                                        throw th;
                                    }
                                }
                                try {
                                    if (C4728u.m21050a("LazyBuildingBoundProvider", 3)) {
                                        double b3 = a2.m28680f().m21481b();
                                        double d4 = a2.m28680f().m21485d();
                                        double b4 = a2.m28681g().m21481b();
                                        double d5 = a2.m28681g().m21485d();
                                        stringBuilder2 = new StringBuilder(123);
                                        stringBuilder2.append("No Refetch Area: (");
                                        stringBuilder2.append(b3);
                                        stringBuilder2.append(", ");
                                        stringBuilder2.append(d4);
                                        stringBuilder2.append("), (");
                                        stringBuilder2.append(b4);
                                        stringBuilder2.append(", ");
                                        stringBuilder2.append(d5);
                                        stringBuilder2.append(")");
                                        Log.d("LazyBuildingBoundProvider", stringBuilder2.toString());
                                    }
                                    this.f24063h = new C4830a(C6481e.m28441a(new InputStreamReader(new ByteArrayInputStream(d), "UTF-8"), a), a, a2);
                                } catch (IOException e3) {
                                    e2 = e3;
                                    c6488j = this;
                                    iOException = e2;
                                    iOException.printStackTrace();
                                    c6488j.f24060e = false;
                                    it = c6488j.f24062g.iterator();
                                    while (it.hasNext()) {
                                        ((C4823a) it.next()).mo7553a();
                                    }
                                    return;
                                } catch (Throwable th3) {
                                    th22 = th3;
                                    c6488j = this;
                                    th = th22;
                                    throw th;
                                }
                            } catch (IOException e4) {
                                e2 = e4;
                                iOException = e2;
                                iOException.printStackTrace();
                                c6488j.f24060e = false;
                                it = c6488j.f24062g.iterator();
                                while (it.hasNext()) {
                                    ((C4823a) it.next()).mo7553a();
                                }
                                return;
                            }
                        }
                        c6488j.f24060e = false;
                        it = c6488j.f24062g.iterator();
                        while (it.hasNext()) {
                            ((C4823a) it.next()).mo7553a();
                        }
                    }
                } catch (Throwable th4) {
                    th22 = th4;
                    th = th22;
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m28510a(C6488j c6488j) {
        C7472c a = C7472c.m32365a();
        if (a != null) {
            c6488j.mo5094a(a.m32368a(c6488j.f24057b, (C4911b) c6488j, false));
        }
    }
}
