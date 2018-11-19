package com.google.android.m4b.maps.bu;

import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4718l;
import com.google.android.m4b.maps.ay.C4724o;
import com.google.android.m4b.maps.ay.C6407a;
import com.google.android.m4b.maps.ay.C6409f;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.bs.C4880b;
import com.google.android.m4b.maps.bw.C4976e;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.de.C5350x;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.bu.c */
public final class C7472c extends C6407a {
    /* renamed from: a */
    private static C7472c f27429a;
    /* renamed from: h */
    private static long f27430h = TimeUnit.DAYS.toMillis(1);
    /* renamed from: b */
    private final C6413m f27431b;
    /* renamed from: c */
    private final C4712d f27432c;
    /* renamed from: d */
    private final C4976e<String, C4910a> f27433d;
    /* renamed from: e */
    private final C4976e<String, SoftReference<C4910a>> f27434e;
    /* renamed from: f */
    private volatile C4880b f27435f;
    /* renamed from: g */
    private final CountDownLatch f27436g;

    /* renamed from: com.google.android.m4b.maps.bu.c$1 */
    class C49121 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ File f18066a;
        /* renamed from: b */
        private /* synthetic */ C5203e f18067b;

        C49121(File file, C5203e c5203e) {
            this.f18066a = file;
            this.f18067b = c5203e;
        }

        public final void run() {
            C7472c.m32367a(C7472c.m32365a(), this.f18066a, this.f18067b);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bu.c$a */
    class C7471a extends C6409f {
        /* renamed from: a */
        C4910a f27426a;
        /* renamed from: b */
        private C4662a f27427b;
        /* renamed from: c */
        private /* synthetic */ C7472c f27428c;

        /* renamed from: g */
        public final int mo7034g() {
            return 39;
        }

        private C7471a(C7472c c7472c, C4662a c4662a, C4910a c4910a) {
            this.f27428c = c7472c;
            this.f27427b = c4662a;
            this.f27426a = c4910a;
        }

        /* renamed from: a */
        public final boolean mo7033a(DataInput dataInput) {
            dataInput = C4665c.m20858a(C5350x.f20104b, dataInput);
            if (dataInput.m20846k(1) == 0) {
                return false;
            }
            C4662a c = dataInput.m20833c(1, 0);
            boolean a = this.f27426a.m22020a(c);
            if (this.f27428c.f27435f != null && a && this.f27426a.m22019a()) {
                this.f27428c.f27435f.m21845a(c);
            }
            return true;
        }

        /* renamed from: a */
        public final void mo7032a(DataOutput dataOutput) {
            byte[] d = this.f27427b.m20837d();
            dataOutput.writeInt(d.length);
            dataOutput.write(d);
        }
    }

    private C7472c(C6413m c6413m) {
        this.f27431b = c6413m;
        if (this.f27431b != null) {
            this.f27431b.mo4892a((C4724o) this);
        }
        this.f27432c = C4712d.m20955a();
        this.f27433d = new C4976e(64);
        this.f27434e = new C4976e(32);
        this.f27435f = null;
        this.f27436g = new CountDownLatch(1);
    }

    C7472c() {
        this.f27431b = null;
        this.f27432c = null;
        this.f27433d = null;
        this.f27434e = null;
        this.f27435f = null;
        this.f27436g = null;
    }

    /* renamed from: a */
    public final C4910a m32368a(String str, C4911b c4911b, boolean z) {
        C4910a c4910a;
        synchronized (this.f27433d) {
            c4910a = (C4910a) this.f27433d.m22251b((Object) str);
            if (c4910a == null && this.f27435f != null) {
                c4910a = this.f27435f.m21843a(str);
            }
            if (c4910a == null) {
                c4910a = new C4910a();
                c4910a.m22018a(true);
            }
            this.f27433d.m22255c(str, c4910a);
        }
        synchronized (c4910a) {
            long b = C4712d.m20956b();
            if (c4910a.m22025f() + f27430h < b) {
                z = new C4662a(C5350x.f20103a);
                z.m20828b(4, str);
                if (c4910a.m22021b() != null) {
                    z.m20815a(2, c4910a.m22024e());
                }
                this.f27431b.mo4893c(new C7471a(z, c4910a));
                c4910a.m22016a(b);
            }
        }
        if (c4911b != null && c4910a.m22021b() == null) {
            c4910a.m22017a(c4911b);
        }
        return c4910a;
    }

    /* renamed from: a */
    public final void m32370a(boolean r3) {
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
        r2 = this;
        r0 = r2.f27434e;
        monitor-enter(r0);
        r1 = r2.f27434e;	 Catch:{ all -> 0x0027 }
        r1.m22247a();	 Catch:{ all -> 0x0027 }
        monitor-exit(r0);	 Catch:{ all -> 0x0027 }
        r1 = r2.f27433d;
        monitor-enter(r1);
        r0 = r2.f27433d;	 Catch:{ all -> 0x0024 }
        r0.m22247a();	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        if (r3 == 0) goto L_0x0023;
    L_0x0014:
        r3 = r2.f27435f;
        if (r3 != 0) goto L_0x001e;
    L_0x0018:
        r3 = r2.f27436g;	 Catch:{ InterruptedException -> 0x0014 }
        r3.await();	 Catch:{ InterruptedException -> 0x0014 }
        goto L_0x0014;
    L_0x001e:
        r3 = r2.f27435f;
        r3.m21844a();
    L_0x0023:
        return;
    L_0x0024:
        r3 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        throw r3;
    L_0x0027:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0027 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bu.c.a(boolean):void");
    }

    /* renamed from: a */
    public final void mo4873a(C4718l c4718l) {
        if (c4718l instanceof C7471a) {
            ((C7471a) c4718l).f27426a.m22026g();
        }
    }

    /* renamed from: a */
    public static C7472c m32366a(C6413m c6413m, File file, C5203e c5203e) {
        if (f27429a != null) {
            return f27429a;
        }
        f27429a = new C7472c(c6413m);
        new Thread(new C49121(file, c5203e)).start();
        return f27429a;
    }

    /* renamed from: a */
    public static C7472c m32365a() {
        return f27429a;
    }

    /* renamed from: a */
    static /* synthetic */ void m32367a(C7472c c7472c, File file, C5203e c5203e) {
        c7472c.f27435f = C4880b.m21842a(file, c5203e);
        c7472c.f27436g.countDown();
    }
}
