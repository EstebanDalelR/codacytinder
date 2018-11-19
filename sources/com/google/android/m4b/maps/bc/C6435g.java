package com.google.android.m4b.maps.bc;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.m4b.maps.ax.C4699a.C7436c;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.cg.C5196z;
import com.google.android.m4b.maps.cg.C7521y;
import com.google.android.m4b.maps.cg.ac;
import com.google.android.m4b.maps.cg.ad;
import com.google.android.m4b.maps.cg.cb;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p124x.C5546n;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.m4b.maps.bc.g */
public final class C6435g implements ac {
    /* renamed from: a */
    private static long f23877a = -1;
    /* renamed from: b */
    private static final AtomicLong f23878b = new AtomicLong(0);
    /* renamed from: c */
    private final C6487i f23879c;
    /* renamed from: d */
    private final long f23880d = f23878b.getAndIncrement();
    /* renamed from: e */
    private C5546n f23881e;
    /* renamed from: f */
    private final Set<ad> f23882f = new HashSet();
    /* renamed from: g */
    private final ad f23883g = new C64341(this);
    /* renamed from: h */
    private final Handler f23884h;
    /* renamed from: i */
    private final cb f23885i;

    /* renamed from: com.google.android.m4b.maps.bc.g$1 */
    class C64341 implements ad {
        /* renamed from: a */
        final /* synthetic */ C6435g f23876a;

        /* renamed from: com.google.android.m4b.maps.bc.g$1$1 */
        class C47571 implements Runnable {
            /* renamed from: a */
            private /* synthetic */ C64341 f17427a;

            C47571(C64341 c64341) {
                this.f17427a = c64341;
            }

            public final void run() {
                synchronized (this.f17427a.f23876a) {
                    try {
                        if (this.f17427a.f23876a.f23881e != null) {
                            this.f17427a.f23876a.f23881e.mo5795a();
                        }
                        for (ad a : this.f17427a.f23876a.f23882f) {
                            a.mo4964a();
                        }
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                }
            }
        }

        C64341(C6435g c6435g) {
            this.f23876a = c6435g;
        }

        /* renamed from: a */
        public final void mo4964a() {
            if (this.f23876a.m28179d()) {
                this.f23876a.f23884h.post(new C47571(this));
            }
        }

        /* renamed from: a */
        public final void mo4965a(final C5196z c5196z) {
            if (this.f23876a.m28179d()) {
                this.f23876a.f23884h.post(new Runnable(this) {
                    /* renamed from: b */
                    private /* synthetic */ C64341 f17429b;

                    public final void run() {
                        synchronized (this.f17429b.f23876a) {
                            try {
                                if (this.f17429b.f23876a.f23881e != null) {
                                    this.f17429b.f23876a.f23881e.mo5796a(new C7521y(this.f17429b.f23876a, c5196z, this.f17429b.f23876a.f23885i));
                                }
                                for (ad a : this.f17429b.f23876a.f23882f) {
                                    a.mo4965a(c5196z);
                                }
                            } catch (RemoteException e) {
                                throw new RuntimeRemoteException(e);
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static C6435g m28162a(C6487i c6487i, Handler handler, cb cbVar) {
        C6435g c6435g = new C6435g(c6487i, handler, cbVar);
        c6435g.f23879c.m28494a(c6435g.f23883g);
        return c6435g;
    }

    private C6435g(C6487i c6487i, Handler handler, cb cbVar) {
        this.f23879c = (C6487i) C5571j.m24292a((Object) c6487i);
        this.f23884h = (Handler) C5571j.m24292a((Object) handler);
        this.f23885i = (cb) C5571j.m24292a((Object) cbVar);
    }

    /* renamed from: a */
    public final boolean m28172a() {
        if (f23877a != this.f23880d) {
            if (f23877a != -1) {
                return false;
            }
        }
        f23877a = this.f23880d;
        return true;
    }

    /* renamed from: b */
    public final void m28174b() {
        if (f23877a == this.f23880d) {
            f23877a = -1;
        }
    }

    /* renamed from: c */
    public final C5196z mo4973c() {
        return m28179d() ? this.f23879c.m28502c() : null;
    }

    /* renamed from: a */
    public final int mo4966a(C5196z c5196z) {
        if (!m28179d()) {
            return -1;
        }
        C4701c a = this.f23879c.m28488a(c5196z.mo5136a());
        if (a != null) {
            return c5196z.mo5137b(a);
        }
        return C6487i.m28482c(c5196z);
    }

    /* renamed from: b */
    public final int mo4971b(C5196z c5196z) {
        return m28179d() ? C6487i.m28482c(c5196z) : -1;
    }

    /* renamed from: c */
    public final boolean mo4974c(C5196z c5196z) {
        return m28179d() ? C6487i.m28483d(c5196z) : null;
    }

    /* renamed from: a */
    public final synchronized void mo4970a(C5546n c5546n) {
        this.f23881e = c5546n;
    }

    /* renamed from: d */
    public final boolean m28179d() {
        return this.f23880d == f23877a;
    }

    /* renamed from: e */
    public final C6487i m28180e() {
        return this.f23879c;
    }

    /* renamed from: a */
    public final void mo4969a(ad adVar) {
        this.f23882f.add(adVar);
    }

    /* renamed from: b */
    public final void mo4972b(ad adVar) {
        this.f23882f.remove(adVar);
    }

    /* renamed from: a */
    public final C4701c mo4967a(C7436c c7436c) {
        return m28179d() ? this.f23879c.m28488a(c7436c) : null;
    }

    /* renamed from: d */
    public final void mo4975d(C5196z c5196z) {
        if (m28179d()) {
            this.f23879c.m28495a(c5196z);
        }
    }

    /* renamed from: a */
    public final void mo4968a(C4701c c4701c) {
        if (m28179d()) {
            this.f23879c.m28491a(c4701c);
        }
    }
}
