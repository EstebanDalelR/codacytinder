package com.google.android.m4b.maps.ch;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.m4b.maps.aa.af;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ay.C4725p;
import com.google.android.m4b.maps.ay.C4727s;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C4731z;
import com.google.android.m4b.maps.ay.C6409f;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.cl.C5220e;
import com.google.android.m4b.maps.de.C5333g;
import com.google.android.m4b.maps.p125y.C5579p;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.ch.e */
public class C5203e {
    /* renamed from: a */
    private static final String f19349a = "e";
    /* renamed from: b */
    private static final ScheduledExecutorService f19350b = Executors.newSingleThreadScheduledExecutor();
    /* renamed from: s */
    private static final Map<Integer, Integer> f19351s = af.m20493e().mo4792a(Integer.valueOf(2), Integer.valueOf(4)).mo4792a(Integer.valueOf(3), Integer.valueOf(5)).mo4792a(Integer.valueOf(6), Integer.valueOf(8)).mo4792a(Integer.valueOf(8), Integer.valueOf(10)).mo4792a(Integer.valueOf(12), Integer.valueOf(14)).mo4792a(Integer.valueOf(13), Integer.valueOf(15)).mo4792a(Integer.valueOf(37), Integer.valueOf(39)).mo4792a(Integer.valueOf(45), Integer.valueOf(47)).mo4795a();
    /* renamed from: c */
    private volatile C4662a f19352c;
    /* renamed from: d */
    private volatile C5198b f19353d;
    /* renamed from: e */
    private volatile C5200d f19354e;
    /* renamed from: f */
    private volatile C5205g f19355f;
    /* renamed from: g */
    private volatile C5197a f19356g;
    /* renamed from: h */
    private volatile C4662a f19357h;
    /* renamed from: i */
    private volatile C5204f f19358i;
    /* renamed from: j */
    private volatile C5199c f19359j;
    /* renamed from: k */
    private volatile ScheduledFuture f19360k = null;
    /* renamed from: l */
    private volatile boolean f19361l = false;
    /* renamed from: m */
    private volatile boolean f19362m = false;
    /* renamed from: n */
    private final Object f19363n = new Object();
    /* renamed from: o */
    private boolean f19364o = false;
    /* renamed from: p */
    private boolean f19365p = false;
    /* renamed from: q */
    private final Context f19366q;
    /* renamed from: r */
    private final C6413m f19367r;
    /* renamed from: t */
    private final List<C5201a> f19368t = new ArrayList();
    /* renamed from: u */
    private final C4662a f19369u;

    /* renamed from: com.google.android.m4b.maps.ch.e$a */
    public interface C5201a {
        /* renamed from: a */
        void mo5330a();
    }

    /* renamed from: com.google.android.m4b.maps.ch.e$b */
    class C7522b extends C6409f {
        /* renamed from: a */
        final /* synthetic */ C5203e f28120a;
        /* renamed from: b */
        private final String f28121b;
        /* renamed from: c */
        private final C6413m f28122c;

        /* renamed from: com.google.android.m4b.maps.ch.e$b$1 */
        class C52021 implements Runnable {
            /* renamed from: a */
            private /* synthetic */ C7522b f19348a;

            C52021(C7522b c7522b) {
                this.f19348a = c7522b;
            }

            public final void run() {
                this.f19348a.f28120a.m23206a(this.f19348a.f28122c, this.f19348a.f28121b);
            }
        }

        /* renamed from: a */
        public final boolean mo4878a() {
            return false;
        }

        /* renamed from: b */
        public final boolean mo4879b() {
            return true;
        }

        /* renamed from: g */
        public final int mo7034g() {
            return 75;
        }

        public C7522b(C5203e c5203e, String str, C6413m c6413m) {
            this.f28120a = c5203e;
            this.f28121b = str;
            this.f28122c = c6413m;
        }

        /* renamed from: a */
        public final boolean mo7033a(DataInput dataInput) {
            dataInput = C4665c.m20858a(C5333g.f19948c, dataInput);
            int k = dataInput.m20846k(1);
            synchronized (this.f28120a) {
                Object obj = null;
                for (int i = 0; i < k; i++) {
                    C4662a c = dataInput.m20833c(1, i);
                    if (c.m20845j(2) && this.f28120a.m23208a(c)) {
                        this.f28120a.m23212b(c);
                        obj = 1;
                    }
                }
                if (obj != null) {
                    C5203e.m23216b(this.f28120a.f19352c, this.f28121b);
                }
                this.f28120a.f19364o = true;
            }
            this.f28120a.m23222g();
            synchronized (this.f28120a.f19363n) {
                this.f28120a.f19362m = false;
                if (this.f28120a.f19361l) {
                    this.f28120a.m23206a(this.f28122c, this.f28121b);
                } else {
                    this.f28120a.f19360k = C5203e.f19350b.schedule(new C52021(this), 3, TimeUnit.HOURS);
                }
            }
            return true;
        }

        /* renamed from: a */
        public final void mo7032a(DataOutput dataOutput) {
            C4662a c4662a = new C4662a(C5333g.f19946a);
            synchronized (this.f28120a) {
                int k = this.f28120a.f19352c.m20846k(1);
                for (int i = 0; i < k; i++) {
                    C4662a c = this.f28120a.f19352c.m20833c(1, i);
                    C4662a c4662a2 = new C4662a(C5333g.f19949d);
                    int a = C4665c.m20854a(c, 1, -1);
                    if (a != -1) {
                        c4662a2.m20841f(1, a);
                    }
                    if (c.m20845j(2)) {
                        c4662a2.m20815a(2, c.m20838e(2));
                    }
                    c4662a.m20821a(1, c4662a2);
                }
            }
            this.f28120a.m23224a(this.f28120a.f19366q, c4662a);
            c4662a.m20824a((OutputStream) dataOutput);
        }
    }

    public C5203e(Context context, String str, C6413m c6413m) {
        this.f19366q = context;
        this.f19367r = c6413m;
        C4662a c4662a = new C4662a(C5220e.f19439a);
        c4662a.m20828b(1, C4725p.m21025b());
        c4662a.m20828b(2, C4725p.m21033j());
        c4662a.m20828b(4, com.google.android.m4b.maps.ay.af.m20940b(context));
        c4662a.m20828b(5, String.valueOf(VERSION.SDK_INT));
        c4662a.m20828b(6, str);
        c4662a.m20828b(12, String.valueOf(C4725p.m21021a(context, str).versionCode));
        c4662a.m20828b(13, "2.17.0");
        String e = C4727s.m21043e(C4725p.m21022a());
        String i = this.f19367r.m28023i();
        if (!C5579p.m24319b(i)) {
            e = i;
        }
        c4662a.m20828b(8, e);
        c4662a.m20814a(9, (float) C4725p.m21030g());
        c4662a.m20816a(11, C4725p.m21034k());
        this.f19369u = c4662a;
        context = String.valueOf("ServerControlledParametersManager.data.");
        str = String.valueOf(str);
        m23213b(c6413m, str.length() != 0 ? context.concat(str) : new String(context));
    }

    /* renamed from: a */
    public final C5198b m23223a() {
        return this.f19353d;
    }

    /* renamed from: b */
    public final C5200d m23226b() {
        return this.f19354e;
    }

    /* renamed from: c */
    public final C5205g m23227c() {
        return this.f19355f;
    }

    /* renamed from: d */
    public final C5197a m23228d() {
        return this.f19356g;
    }

    /* renamed from: e */
    public final C4662a m23229e() {
        return this.f19357h;
    }

    /* renamed from: a */
    public final void m23225a(C5201a c5201a) {
        synchronized (this) {
            if (!this.f19364o) {
                if (!this.f19365p) {
                    this.f19368t.add(c5201a);
                    c5201a = null;
                }
            }
        }
        if (c5201a != null) {
            c5201a.mo5330a();
        }
    }

    /* renamed from: a */
    private synchronized void m23206a(C6413m c6413m, String str) {
        if (c6413m != null) {
            synchronized (this.f19363n) {
                if (this.f19360k != null) {
                    this.f19360k.cancel(false);
                    this.f19360k = null;
                }
                if (this.f19362m) {
                    this.f19361l = true;
                } else {
                    this.f19362m = true;
                    this.f19361l = false;
                    c6413m.mo4893c(new C7522b(this, str, c6413m));
                }
            }
        }
    }

    /* renamed from: b */
    private void m23213b(C6413m c6413m, String str) {
        if (this.f19352c == null) {
            int k;
            C4662a c4662a = new C4662a(C5333g.f19948c);
            for (Entry entry : f19351s.entrySet()) {
                C4662a c4662a2 = new C4662a(C5333g.f19949d);
                int intValue = ((Integer) entry.getKey()).intValue();
                int intValue2 = ((Integer) entry.getValue()).intValue();
                c4662a2.m20841f(1, intValue);
                if (intValue == 6) {
                    c4662a2.m20827b(intValue2, new C4662a(C5333g.f19956k));
                } else if (intValue == 8) {
                    c4662a2.m20827b(intValue2, new C4662a(C5333g.f19957l));
                } else if (intValue == 37) {
                    c4662a2.m20827b(intValue2, new C4662a(C5220e.f19440b));
                } else if (intValue != 45) {
                    switch (intValue) {
                        case 2:
                            c4662a2.m20827b(intValue2, new C4662a(C5333g.f19950e));
                            break;
                        case 3:
                            c4662a2.m20827b(intValue2, new C4662a(C5333g.f19955j));
                            break;
                        default:
                            switch (intValue) {
                                case 11:
                                    c4662a2.m20827b(intValue2, new C4662a(C5333g.f19951f));
                                    break;
                                case 12:
                                    c4662a2.m20827b(intValue2, new C4662a(C5333g.f19952g));
                                    break;
                                case 13:
                                    c4662a2.m20827b(intValue2, new C4662a(C5333g.f19953h));
                                    break;
                                default:
                                    c4662a2 = null;
                                    break;
                            }
                    }
                } else {
                    c4662a2.m20827b(intValue2, new C4662a(C5333g.f19954i));
                }
                if (c4662a2 != null) {
                    c4662a.m20821a(1, c4662a2);
                }
            }
            this.f19352c = c4662a;
            try {
                byte[] b = C4725p.m21026c().mo7029b(str);
                if (b != null) {
                    C4662a c4662a3 = new C4662a(C5333g.f19948c);
                    c4662a3.m20819a(b);
                    k = c4662a3.m20846k(1);
                    synchronized (this) {
                        for (int i = 0; i < k; i++) {
                            m23212b(c4662a3.m20833c(1, i));
                        }
                        this.f19365p = true;
                    }
                    m23222g();
                }
            } catch (IOException e) {
                if (C4728u.m21050a(f19349a, 3)) {
                    String str2 = f19349a;
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 70);
                    stringBuilder.append("Can't parse the CLIENT_PARAMETERS_RESPONSE_PROTO read from the cache: ");
                    stringBuilder.append(valueOf);
                    Log.d(str2, stringBuilder.toString());
                }
            }
            k = this.f19352c.m20846k(1);
            for (int i2 = 0; i2 < k; i2++) {
                m23208a(this.f19352c.m20833c(1, i2));
            }
            m23206a(c6413m, str);
        }
    }

    /* renamed from: a */
    private boolean m23208a(com.google.android.m4b.maps.ar.C4662a r7) {
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
        r6 = this;
        r0 = 1;
        r1 = -1;
        r1 = com.google.android.m4b.maps.ar.C4665c.m20854a(r7, r0, r1);
        r2 = f19351s;
        r3 = java.lang.Integer.valueOf(r1);
        r2 = r2.containsKey(r3);
        r3 = 3;
        r4 = 0;
        if (r2 != 0) goto L_0x003a;
    L_0x0014:
        r7 = f19349a;
        r7 = com.google.android.m4b.maps.ay.C4728u.m21050a(r7, r3);
        if (r7 == 0) goto L_0x0039;
    L_0x001c:
        r7 = f19349a;
        r0 = new java.lang.StringBuilder;
        r2 = 58;
        r0.<init>(r2);
        r2 = "ParameterGroupProto with type ";
        r0.append(r2);
        r0.append(r1);
        r1 = " is not supported";
        r0.append(r1);
        r0 = r0.toString();
        android.util.Log.d(r7, r0);
    L_0x0039:
        return r4;
    L_0x003a:
        r2 = f19351s;
        r5 = java.lang.Integer.valueOf(r1);
        r2 = r2.get(r5);
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r5 = r7.m20845j(r2);
        if (r5 == 0) goto L_0x00d2;
    L_0x0050:
        r7 = r7.m20842g(r2);
        r2 = 6;
        if (r1 == r2) goto L_0x00ca;
    L_0x0057:
        r2 = 8;
        if (r1 == r2) goto L_0x00c2;
    L_0x005b:
        r2 = 12;
        if (r1 == r2) goto L_0x00ba;
    L_0x005f:
        r2 = 37;
        if (r1 == r2) goto L_0x00b2;
    L_0x0063:
        r2 = 45;
        if (r1 == r2) goto L_0x00aa;
    L_0x0067:
        switch(r1) {
            case 2: goto L_0x0098;
            case 3: goto L_0x0090;
            default: goto L_0x006a;
        };
    L_0x006a:
        r7 = f19349a;
        r7 = com.google.android.m4b.maps.ay.C4728u.m21050a(r7, r3);
        if (r7 == 0) goto L_0x008f;
    L_0x0072:
        r7 = f19349a;
        r0 = new java.lang.StringBuilder;
        r2 = 57;
        r0.<init>(r2);
        r2 = "ParameterGroupProto with type ";
        r0.append(r2);
        r0.append(r1);
        r1 = " isn't supported";
        r0.append(r1);
        r0 = r0.toString();
        android.util.Log.d(r7, r0);
    L_0x008f:
        return r4;
    L_0x0090:
        r1 = new com.google.android.m4b.maps.ch.f;
        r1.<init>(r7);
        r6.f19358i = r1;
        return r0;
    L_0x0098:
        r1 = r6.f19353d;
        if (r1 == 0) goto L_0x00a2;
    L_0x009c:
        r1 = r6.f19353d;
        r1.m23200a(r7);
        goto L_0x00a9;
    L_0x00a2:
        r1 = new com.google.android.m4b.maps.ch.b;
        r1.<init>(r7);
        r6.f19353d = r1;
    L_0x00a9:
        return r0;
    L_0x00aa:
        r1 = new com.google.android.m4b.maps.ch.c;
        r1.<init>(r7);
        r6.f19359j = r1;
        return r0;
    L_0x00b2:
        r7 = com.google.android.m4b.maps.ar.C4665c.m20857a(r7);	 Catch:{ IOException -> 0x00b9 }
        r6.f19357h = r7;	 Catch:{ IOException -> 0x00b9 }
        return r0;
    L_0x00b9:
        return r4;
    L_0x00ba:
        r1 = new com.google.android.m4b.maps.ch.a;
        r1.<init>(r7);
        r6.f19356g = r1;
        return r0;
    L_0x00c2:
        r1 = new com.google.android.m4b.maps.ch.g;
        r1.<init>(r7);
        r6.f19355f = r1;
        return r0;
    L_0x00ca:
        r1 = new com.google.android.m4b.maps.ch.d;
        r1.<init>(r7);
        r6.f19354e = r1;
        return r0;
    L_0x00d2:
        r7 = f19349a;
        r7 = com.google.android.m4b.maps.ay.C4728u.m21050a(r7, r3);
        if (r7 == 0) goto L_0x00f7;
    L_0x00da:
        r7 = f19349a;
        r0 = new java.lang.StringBuilder;
        r2 = 56;
        r0.<init>(r2);
        r2 = "ParameterGroupProto with type ";
        r0.append(r2);
        r0.append(r1);
        r1 = " is not updated";
        r0.append(r1);
        r0 = r0.toString();
        android.util.Log.d(r7, r0);
    L_0x00f7:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ch.e.a(com.google.android.m4b.maps.ar.a):boolean");
    }

    /* renamed from: b */
    private void m23212b(C4662a c4662a) {
        int d = c4662a.m20835d(1);
        if (f19351s.containsKey(Integer.valueOf(d))) {
            int k = this.f19352c.m20846k(1);
            for (int i = 0; i < k; i++) {
                if (d == this.f19352c.m20833c(1, i).m20835d(1)) {
                    this.f19352c.m20839e(1, i);
                    break;
                }
            }
            this.f19352c.m20821a(1, c4662a);
        }
    }

    /* renamed from: b */
    private static boolean m23216b(C4662a c4662a, String str) {
        try {
            C4725p.m21026c().mo7027a(c4662a.m20837d(), str);
            return true;
        } catch (C4662a c4662a2) {
            if (C4728u.m21050a(f19349a, 3) != null) {
                str = f19349a;
                c4662a2 = String.valueOf(c4662a2);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(c4662a2).length() + 63);
                stringBuilder.append("Can't write the CLIENT_PARAMETERS_RESPONSE_PROTO to the cache: ");
                stringBuilder.append(c4662a2);
                Log.d(str, stringBuilder.toString());
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void m23224a(Context context, C4662a c4662a) {
        C4662a c4662a2 = new C4662a(C5333g.f19947b);
        boolean z = true;
        c4662a2.m20816a(1, true);
        if (C4731z.m21056a(context) == null) {
            if (C4731z.m21054a() == null) {
                z = false;
            }
        }
        c4662a2.m20816a(2, z);
        c4662a2.m20827b(4, this.f19369u);
        c4662a.m20821a(2, c4662a2);
    }

    /* renamed from: g */
    private void m23222g() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            List<C5201a> a = au.m20525a(this.f19368t);
            this.f19368t.clear();
        }
        for (C5201a a2 : a) {
            a2.mo5330a();
        }
    }
}
