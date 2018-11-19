package com.google.android.m4b.maps.bw;

import android.content.Context;
import android.util.Log;
import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ay.C4718l;
import com.google.android.m4b.maps.ay.C4724o;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C6409f;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.az.C4733b;
import com.google.android.m4b.maps.bx.at;
import com.google.android.m4b.maps.cg.C5184n;
import com.google.android.m4b.maps.cg.C5184n.C5183b;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.de.C5333g;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.bw.g */
public class C4981g {
    /* renamed from: a */
    private static final String f18370a = "g";
    /* renamed from: b */
    private volatile at f18371b;
    /* renamed from: c */
    private volatile boolean f18372c;
    /* renamed from: d */
    private final C5203e f18373d;
    /* renamed from: e */
    private final Set<C4980b> f18374e = new HashSet();

    /* renamed from: com.google.android.m4b.maps.bw.g$b */
    public interface C4980b {
        /* renamed from: a */
        void mo5210a();
    }

    /* renamed from: com.google.android.m4b.maps.bw.g$a */
    class C6554a implements C4724o {
        /* renamed from: a */
        private final C6413m f24406a;
        /* renamed from: b */
        private final Runnable f24407b;
        /* renamed from: c */
        private /* synthetic */ C4981g f24408c;

        public C6554a(C4981g c4981g, C6413m c6413m, Runnable runnable) {
            this.f24408c = c4981g;
            this.f24406a = c6413m;
            this.f24407b = runnable;
        }

        /* renamed from: a */
        public final void mo4873a(C4718l c4718l) {
            if ((c4718l instanceof C7476c) != null) {
                this.f24406a.m28013b((C4724o) this);
            }
        }

        /* renamed from: a */
        public final void mo4872a(int i, String str) {
            if (i != 3) {
                m28985a();
            }
        }

        /* renamed from: b */
        public final void mo4874b(C4718l c4718l) {
            if (c4718l.mo7034g() == 75) {
                m28985a();
            }
        }

        /* renamed from: a */
        private void m28985a() {
            if (this.f24408c.f18371b == null) {
                this.f24406a.m28013b((C4724o) this);
                if (this.f24407b != null) {
                    this.f24407b.run();
                }
                synchronized (this.f24408c) {
                    this.f24408c.f18372c = true;
                    this.f24408c.notifyAll();
                }
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bw.g$c */
    class C7476c extends C6409f {
        /* renamed from: a */
        private final Context f27491a;
        /* renamed from: b */
        private final Long f27492b;
        /* renamed from: c */
        private final String f27493c;
        /* renamed from: d */
        private /* synthetic */ C4981g f27494d;

        /* renamed from: b */
        public final boolean mo4879b() {
            return true;
        }

        /* renamed from: g */
        public final int mo7034g() {
            return 75;
        }

        private C7476c(C4981g c4981g, Context context, Long l, String str) {
            this.f27494d = c4981g;
            this.f27491a = context;
            this.f27492b = l;
            this.f27493c = str;
        }

        /* renamed from: a */
        public final boolean mo7033a(DataInput dataInput) {
            dataInput = C4665c.m20858a(C5333g.f19948c, dataInput);
            int k = dataInput.m20846k(1);
            for (int i = 0; i < k; i++) {
                C4662a c = dataInput.m20833c(1, i);
                if (c.m20835d(1) == 5 && c.m20845j(2) && c.m20845j(7)) {
                    synchronized (C4981g.class) {
                        C4733b.m21067a(this.f27491a, c, this.f27493c);
                    }
                    dataInput = c.m20842g(7);
                    if (C4728u.m21050a(C4981g.f18370a, 3)) {
                        String c2 = C4981g.f18370a;
                        long e = c.m20838e(2);
                        StringBuilder stringBuilder = new StringBuilder(58);
                        stringBuilder.append("Updating tile zoom progression. Hash: ");
                        stringBuilder.append(e);
                        Log.d(c2, stringBuilder.toString());
                    }
                    this.f27494d.f18371b = at.m22368a(dataInput);
                    this.f27494d.m22273d();
                    return true;
                }
            }
            this.f27494d.m22273d();
            return true;
        }

        /* renamed from: a */
        public final void mo7032a(DataOutput dataOutput) {
            C4662a c4662a = new C4662a(C5333g.f19949d);
            c4662a.m20841f(1, 1);
            C4662a c4662a2 = new C4662a(C5333g.f19946a);
            c4662a2.m20821a(1, c4662a);
            c4662a = new C4662a(C5333g.f19949d);
            c4662a.m20841f(1, 5);
            if (this.f27492b != null) {
                c4662a.m20815a(2, this.f27492b.longValue());
            }
            c4662a2.m20821a(1, c4662a);
            this.f27494d.f18373d.m23224a(this.f27491a, c4662a2);
            dataOutput.writeInt(c4662a2.m20832c());
            c4662a2.m20830b((OutputStream) dataOutput);
        }
    }

    public C4981g(Context context, C6413m c6413m, Runnable runnable, C5203e c5203e, C5184n c5184n) {
        this.f18373d = c5203e;
        final Context context2 = context;
        final C6413m c6413m2 = c6413m;
        final Runnable runnable2 = runnable;
        final C5184n c5184n2 = c5184n;
        new Thread(this, "ZoomTableManager") {
            /* renamed from: e */
            private /* synthetic */ C4981g f18369e;

            public final void run() {
                C4981g.m22267a(this.f18369e, context2, c6413m2, runnable2, "ZoomTables.data", c5184n2);
            }
        }.start();
    }

    /* renamed from: a */
    public final synchronized com.google.android.m4b.maps.bx.at m22274a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        monitor-enter(r1);
    L_0x0001:
        r0 = r1.f18371b;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x000d;	 Catch:{ all -> 0x0011 }
    L_0x0005:
        r0 = r1.f18372c;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x000d;
    L_0x0009:
        r1.wait();	 Catch:{ InterruptedException -> 0x0001 }
        goto L_0x0001;
    L_0x000d:
        r0 = r1.f18371b;	 Catch:{ all -> 0x0011 }
        monitor-exit(r1);
        return r0;
    L_0x0011:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bw.g.a():com.google.android.m4b.maps.bx.at");
    }

    /* renamed from: b */
    public final boolean m22276b() {
        return this.f18371b != null;
    }

    /* renamed from: a */
    public final void m22275a(C4980b c4980b) {
        if (m22276b()) {
            c4980b.mo5210a();
            return;
        }
        synchronized (this) {
            this.f18374e.add(c4980b);
        }
    }

    /* renamed from: d */
    private void m22273d() {
        synchronized (this) {
            notifyAll();
            Set<C4980b> a = bo.m20652a(this.f18374e);
            this.f18374e.clear();
        }
        for (C4980b a2 : a) {
            a2.mo5210a();
        }
    }

    /* renamed from: a */
    private void m22266a(Context context, C5184n c5184n, C6413m c6413m, Runnable runnable, Long l, String str) {
        C5184n c5184n2 = c5184n;
        final C6413m c6413m2 = c6413m;
        if (c5184n2.m23169a(true)) {
            if (C4728u.m21050a(f18370a, 3)) {
                Log.d(f18370a, "Connection OK, sending zoom table request to DRD.");
            }
            c6413m2.mo4892a(new C6554a(this, c6413m2, runnable));
            c6413m2.mo4893c(new C7476c(context, l, str));
            return;
        }
        C4981g c4981g = this;
        final Runnable runnable2 = runnable;
        if (C4728u.m21050a(f18370a, 3)) {
            Log.d(f18370a, "Waiting for active connection to request zoom tables.");
        }
        final Context context2 = context;
        final C5184n c5184n3 = c5184n2;
        final Long l2 = l;
        final String str2 = str;
        c5184n2.m23168a(new C5183b(c4981g) {
            /* renamed from: g */
            private /* synthetic */ C4981g f24405g;

            /* renamed from: a */
            public final void mo5207a() {
                this.f24405g.m22266a(context2, c5184n3, c6413m2, runnable2, l2, str2);
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ void m22267a(C4981g c4981g, Context context, C6413m c6413m, Runnable runnable, String str, C5184n c5184n) {
        ab.m27952e();
        synchronized (C4981g.class) {
            try {
                C4662a a = C4733b.m21063a(context, str, C5333g.f19949d);
            } catch (Throwable th) {
                while (true) {
                    Throwable th2 = th;
                }
            }
        }
        Long l = null;
        if (a != null && a.m20845j(7)) {
            c4981g.f18371b = at.m22368a(a.m20842g(7));
            if (a.m20845j(2)) {
                l = Long.valueOf(a.m20838e(2));
            }
            if (C4728u.m21050a(f18370a, 3)) {
                Log.d(f18370a, "Zoom tables loaded from cache.");
            }
            c4981g.m22273d();
        }
        Long l2 = l;
        if (c4981g.f18371b == null && c6413m != null) {
            if (c6413m.m28019e()) {
                if (C4728u.m21050a(f18370a, 3)) {
                    Log.d(f18370a, "Network error mode, cannot fetch zoom tables.");
                }
                if (runnable != null) {
                    runnable.run();
                }
                synchronized (c4981g) {
                    try {
                        c4981g.f18372c = true;
                        c4981g.notifyAll();
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                    }
                }
                return;
            }
            if (C4728u.m21050a(f18370a, 3)) {
                Log.d(f18370a, "Zoom tables not found in cache. Requesting from server.");
            }
            c4981g.m22266a(context, c5184n, c6413m, runnable, l2, str);
        }
    }
}
