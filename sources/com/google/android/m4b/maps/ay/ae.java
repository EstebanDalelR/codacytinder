package com.google.android.m4b.maps.ay;

import android.util.Log;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.de.af;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class ae {
    /* renamed from: a */
    private static final String f17308a = "ae";
    /* renamed from: b */
    private static final HashSet<Short> f17309b;
    /* renamed from: c */
    private static C4712d f17310c = new C4712d();
    /* renamed from: d */
    private static long f17311d = TimeUnit.DAYS.toMillis(30);
    /* renamed from: e */
    private C4706a f17312e;
    /* renamed from: f */
    private C6413m f17313f;
    /* renamed from: g */
    private volatile int f17314g;
    /* renamed from: h */
    private int f17315h = 0;

    /* renamed from: com.google.android.m4b.maps.ay.ae$2 */
    class C47052 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ ae f17307a;

        C47052(ae aeVar) {
            this.f17307a = aeVar;
        }

        public final void run() {
            this.f17307a.m20930b(false);
        }
    }

    /* renamed from: com.google.android.m4b.maps.ay.ae$a */
    public interface C4706a {
        /* renamed from: a */
        C4662a mo5318a();

        /* renamed from: a */
        void mo5319a(C4662a c4662a);

        /* renamed from: b */
        void mo5320b();
    }

    /* renamed from: com.google.android.m4b.maps.ay.ae$3 */
    class C80623 extends C7441y {
        /* renamed from: a */
        private /* synthetic */ ae f28872a;

        C80623(ae aeVar, int i, byte[] bArr, boolean z, Object obj) {
            this.f28872a = aeVar;
            super(125, bArr, z, 0);
        }

        /* renamed from: e */
        public final void mo4882e() {
            this.f28872a.m20937b();
        }

        /* renamed from: d */
        public final synchronized void mo4881d() {
            if (this.f28872a.f17312e.mo5318a() != null) {
                this.f28872a.f17312e.mo5319a(ae.m20920a(this.f28872a.f17312e.mo5318a(), this.f28872a.f17314g));
            } else if (C4728u.m21050a(ae.f17308a, 5)) {
                Log.w(ae.f17308a, "Could not find events in the store.");
            }
            this.f28872a.m20937b();
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f17309b = hashSet;
        hashSet.add(Short.valueOf((short) 18));
        f17309b.add(Short.valueOf((short) 81));
        f17309b.add(Short.valueOf((short) 91));
        f17309b.add(Short.valueOf((short) 92));
        f17309b.add(Short.valueOf((short) 1));
        f17309b.add(Short.valueOf((short) 4));
        f17309b.add(Short.valueOf((short) 61));
        f17309b.add(Short.valueOf((short) 104));
        f17309b.add(Short.valueOf((short) 67));
        f17309b.add(Short.valueOf((short) 16));
        f17309b.add(Short.valueOf((short) 69));
        f17309b.add(Short.valueOf((short) 101));
        f17309b.add(Short.valueOf((short) 84));
        f17309b.add(Short.valueOf((short) 87));
        f17309b.add(Short.valueOf((short) 55));
        f17309b.add(Short.valueOf((short) 85));
        f17309b.add(Short.valueOf((short) 97));
        f17309b.add(Short.valueOf((short) 5));
        f17309b.add(Short.valueOf((short) 79));
        f17309b.add(Short.valueOf((short) 57));
        f17309b.add(Short.valueOf((short) 112));
        f17309b.add(Short.valueOf((short) 114));
        f17309b.add(Short.valueOf((short) 118));
        f17309b.add(Short.valueOf((short) 115));
    }

    public ae(C4706a c4706a, C6413m c6413m) {
        this.f17312e = c4706a;
        this.f17313f = c6413m;
    }

    /* renamed from: a */
    public final void m20936a(int i, String str, String str2) {
        final long b = C4712d.m20956b();
        final String str3 = str;
        final String str4 = str2;
        new Thread(new Runnable(this, 113) {
            /* renamed from: e */
            private /* synthetic */ ae f17306e;

            public final void run() {
                this.f17306e.m20922a(113, str3, str4, b);
            }
        }).start();
    }

    /* renamed from: d */
    private synchronized void m20933d() {
        C4662a b = m20929b(this.f17312e.mo5318a());
        int k = b.m20846k(2);
        b = m20931c(b);
        this.f17314g -= k - b.m20846k(2);
        if (this.f17314g < 0) {
            this.f17314g = 0;
        }
        this.f17312e.mo5319a(b);
    }

    /* renamed from: a */
    private synchronized void m20922a(int i, String str, String str2, long j) {
        if (C4728u.m21050a(f17308a, 3)) {
            String str3 = f17308a;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 41) + String.valueOf(str2).length());
            stringBuilder.append("Event: type=");
            stringBuilder.append(i);
            stringBuilder.append(", status: ");
            stringBuilder.append(str);
            stringBuilder.append(", data: ");
            stringBuilder.append(str2);
            Log.d(str3, stringBuilder.toString());
        }
        C4662a a = this.f17312e.mo5318a();
        if (a == null) {
            m20934e();
            a = this.f17312e.mo5318a();
        }
        C4662a c4662a = new C4662a(af.f19892b);
        c4662a.m20841f(1, i);
        c4662a.m20815a(7, j);
        c4662a.m20828b(3, str);
        c4662a.m20828b(4, str2);
        c4662a.m20816a(6, false);
        a.m20821a(2, c4662a);
        this.f17312e.mo5319a(a);
        if (a.m20832c() > 1200) {
            m20925a(false);
            if (this.f17315h > 1) {
                m20933d();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m20935a() {
        this.f17312e.mo5320b();
    }

    /* renamed from: a */
    private synchronized void m20925a(boolean z) {
        this.f17315h += true;
        if (this.f17315h) {
            m20930b(false);
        }
    }

    /* renamed from: b */
    private synchronized void m20930b(boolean z) {
        C4662a a = this.f17312e.mo5318a();
        if (a != null) {
            m20926a(z, a);
        }
    }

    /* renamed from: b */
    public final synchronized void m20937b() {
        if (this.f17315h > 1) {
            this.f17315h = 1;
            new Thread(new C47052(this)).start();
            return;
        }
        this.f17315h = 0;
    }

    /* renamed from: a */
    private static byte[] m20927a(com.google.android.m4b.maps.ar.C4662a r17) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = r17;
        r1 = 2;
        r2 = r0.m20846k(r1);
        r3 = new com.google.android.m4b.maps.ar.a;
        r4 = com.google.android.m4b.maps.de.af.f19891a;
        r3.<init>(r4);
        r4 = 3;
        r5 = r0.m20845j(r4);
        if (r5 == 0) goto L_0x001c;
    L_0x0015:
        r5 = r0.m20838e(r4);
        r3.m20815a(r4, r5);
    L_0x001c:
        r4 = 0;
        r6 = 0;
        r8 = r4;
        r7 = 0;
    L_0x0021:
        if (r7 >= r2) goto L_0x0055;
    L_0x0023:
        r10 = r0.m20833c(r1, r7);
        r11 = 7;
        r12 = r10.m20844i(r11);
        if (r12 == 0) goto L_0x0052;
    L_0x002e:
        r12 = r10.m20838e(r11);
        r14 = r12 - r8;
        if (r7 <= 0) goto L_0x004e;
    L_0x0036:
        r8 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1));
        if (r8 < 0) goto L_0x004e;
    L_0x003a:
        r8 = 6553500; // 0x63ff9c float:9.18341E-39 double:3.237859E-317;
        r16 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1));
        if (r16 > 0) goto L_0x004e;
    L_0x0041:
        r10 = r10.m20812a();
        r10.m20839e(r11, r6);
        r8 = 100;
        r14 = r14 / r8;
        r10.m20815a(r1, r14);
    L_0x004e:
        r3.m20821a(r1, r10);
        r8 = r12;
    L_0x0052:
        r7 = r7 + 1;
        goto L_0x0021;
    L_0x0055:
        r0 = new java.io.ByteArrayOutputStream;
        r0.<init>();
        r1 = new java.io.DataOutputStream;
        r1.<init>(r0);
        r2 = r3.m20837d();	 Catch:{ IOException -> 0x006f }
        r3 = r2.length;	 Catch:{ IOException -> 0x006f }
        r1.writeInt(r3);	 Catch:{ IOException -> 0x006f }
        r1.write(r2);	 Catch:{ IOException -> 0x006f }
        r0 = r0.toByteArray();
        return r0;
    L_0x006f:
        r0 = 1;
        r0 = new byte[r0];
        r0[r6] = r6;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.ae.a(com.google.android.m4b.maps.ar.a):byte[]");
    }

    /* renamed from: a */
    static C4662a m20920a(C4662a c4662a, int i) {
        int k = c4662a.m20846k(2);
        C4662a c4662a2 = new C4662a(af.f19891a);
        for (i = Math.min(i, k); i < k; i++) {
            c4662a2.m20821a(2, c4662a.m20833c(2, i));
        }
        if (c4662a.m20845j(3) && c4662a2.m20845j(2)) {
            c4662a2.m20815a(3, c4662a.m20838e(3));
        }
        return c4662a2;
    }

    /* renamed from: b */
    private static C4662a m20929b(C4662a c4662a) {
        C4662a c4662a2 = new C4662a(af.f19891a);
        for (int i = 0; i < c4662a.m20846k(2); i++) {
            C4662a c = c4662a.m20833c(2, i);
            if (c.m20831b(6)) {
                c4662a2.m20821a(2, c);
            }
        }
        if (c4662a2.m20845j(2) && c4662a.m20845j(3)) {
            c4662a2.m20815a(3, c4662a.m20838e(3));
        }
        return c4662a2;
    }

    /* renamed from: c */
    private static C4662a m20931c(C4662a c4662a) {
        int c = c4662a.m20832c() - 800;
        if (c > 0) {
            for (int i = 0; i < c4662a.m20846k(2); i++) {
                c -= c4662a.m20833c(2, i).m20832c() + 2;
                if (c <= 0) {
                    return m20920a(c4662a, i + 1);
                }
            }
        }
        return c4662a;
    }

    /* renamed from: a */
    private synchronized void m20926a(boolean z, C4662a c4662a) {
        if (c4662a.m20846k(2) == 0) {
            this.f17315h = 0;
            return;
        }
        c4662a.m20815a(3, C4712d.m20956b());
        C4662a c4662a2 = new C4662a(af.f19891a);
        for (int i = 0; i < c4662a.m20846k(2); i++) {
            C4662a c = c4662a.m20833c(2, i);
            if (c.m20845j(7)) {
                if ((C4712d.m20956b() - c.m20838e(7) > f17311d ? 1 : null) == null) {
                    c4662a2.m20821a(2, c);
                }
            }
        }
        if (c4662a2.m20845j(2) && c4662a.m20845j(3)) {
            c4662a2.m20815a(3, c4662a.m20838e(3));
        }
        c4662a = m20927a(c4662a2);
        C4662a b = m20929b(c4662a2);
        if (b.m20845j(2)) {
            this.f17312e.mo5319a(m20931c(b));
        } else {
            m20934e();
        }
        this.f17314g = b.m20846k(2);
        this.f17313f.mo4893c(new C80623(this, 125, c4662a, z, null));
    }

    /* renamed from: e */
    private synchronized void m20934e() {
        this.f17312e.mo5319a(new C4662a(af.f19891a));
    }
}
