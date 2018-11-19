package com.google.android.m4b.maps.bv;

import android.os.SystemClock;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ay.C6409f;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.bf.C4781c;
import com.google.android.m4b.maps.de.C5332f;
import com.google.android.m4b.maps.de.ab;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.OutputStream;

/* renamed from: com.google.android.m4b.maps.bv.v */
public final class C7475v extends C6409f {
    /* renamed from: a */
    private static int f27481a;
    /* renamed from: b */
    private final C4953a f27482b;
    /* renamed from: c */
    private final C4662a f27483c;
    /* renamed from: d */
    private String f27484d;
    /* renamed from: e */
    private int f27485e;
    /* renamed from: f */
    private C4662a f27486f;
    /* renamed from: g */
    private boolean f27487g;
    /* renamed from: h */
    private boolean f27488h;
    /* renamed from: i */
    private StringBuilder f27489i;
    /* renamed from: j */
    private final C6413m f27490j;

    /* renamed from: com.google.android.m4b.maps.bv.v$a */
    public interface C4953a {
        /* renamed from: a */
        void mo5203a();

        /* renamed from: a */
        void mo5204a(C4944q c4944q, C4662a c4662a);

        /* renamed from: a */
        void mo5205a(String str, int i, int i2, int i3, int i4, byte[] bArr);
    }

    /* renamed from: g */
    public final int mo7034g() {
        return 40;
    }

    public C7475v(C4953a c4953a, String str, C6413m c6413m) {
        this(c4953a, c6413m);
        C7475v.m32403a(str, "panoId");
        this.f27484d = str;
        this.f27483c.m20822a(1, str);
        this.f27489i.append(str);
    }

    public C7475v(C4953a c4953a, C4938m c4938m, C6413m c6413m) {
        this(c4953a, c6413m);
        C7475v.m32403a(c4938m, "mapPoint");
        this.f27483c.m20821a(2, c4938m.m22127a());
        c4953a = this.f27489i;
        c4953a.append("@ ");
        c4953a.append(c4938m);
    }

    public C7475v(C4953a c4953a, C4938m c4938m, int i, C6413m c6413m) {
        this(c4953a, c6413m);
        C7475v.m32403a(c4938m, "mapPoint");
        this.f27483c.m20821a(2, c4938m.m22127a());
        this.f27483c.m20820a(63, i);
        c4953a = this.f27489i;
        c4953a.append("@ ");
        c4953a.append(c4938m);
    }

    private C7475v(C4953a c4953a, C6413m c6413m) {
        this.f27485e = -1;
        this.f27487g = true;
        C7475v.m32403a(c4953a, "listener");
        this.f27482b = c4953a;
        this.f27483c = new C4662a(ab.f19824b);
        this.f27483c.m20816a(51, true);
        this.f27483c.m20841f(58, 4);
        this.f27483c.m20820a(59, 3);
        this.f27483c.m20820a(59, 4);
        this.f27489i = new StringBuilder("PR sending request ");
        this.f27490j = c6413m;
    }

    /* renamed from: a */
    private static void m32403a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public final C7475v m32406a(boolean z) {
        this.f27487g = z;
        return this;
    }

    /* renamed from: h */
    public final C7475v mo7075h() {
        this.f27489i.append(" config");
        C4662a b = C4665c.m20861b(this.f27483c, 17);
        b.m20816a(56, true);
        b.m20816a(57, true);
        return this;
    }

    /* renamed from: a */
    public final C7475v m32404a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("zoom < 0");
        } else if (this.f27486f != null) {
            throw new IllegalStateException("already requested tiles");
        } else {
            StringBuilder stringBuilder = this.f27489i;
            stringBuilder.append(" tiles @ zoom ");
            stringBuilder.append(i);
            this.f27485e = i;
            this.f27486f = C4665c.m20861b(this.f27483c, 33);
            C4662a c4662a = new C4662a(C5332f.f19919a);
            c4662a.m20841f(16, 3);
            this.f27486f.m20827b(34, c4662a);
            this.f27486f.m20841f(35, 512);
            this.f27486f.m20841f(36, i);
            return this;
        }
    }

    /* renamed from: a */
    public final C7475v m32405a(int i, int i2, int i3) {
        if (this.f27486f == null) {
            throw new IllegalStateException("must call addTilesRequest first");
        }
        StringBuilder stringBuilder = this.f27489i;
        StringBuilder stringBuilder2 = new StringBuilder(44);
        stringBuilder2.append(" (");
        stringBuilder2.append(i);
        stringBuilder2.append(", ");
        stringBuilder2.append(i2);
        stringBuilder2.append(") face ");
        stringBuilder2.append(i3);
        stringBuilder.append(stringBuilder2.toString());
        C4662a c = C4665c.m20863c(this.f27486f, 37);
        c.m20841f(39, i);
        c.m20841f(40, i2);
        if (i3 != -1) {
            c.m20841f(60, i3);
        }
        return this;
    }

    /* renamed from: i */
    public final void m32412i() {
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
        r0 = r2.f27488h;
        if (r0 == 0) goto L_0x000c;
    L_0x0004:
        r0 = new java.lang.IllegalStateException;
        r1 = "already queued";
        r0.<init>(r1);
        throw r0;
    L_0x000c:
        r0 = 1;
        r2.f27488h = r0;
        r0 = r2.f27489i;
        r0 = r0.toString();
        com.google.android.m4b.maps.bv.ac.m22036a(r0);
        r0 = 0;
        r2.f27489i = r0;
        r0 = f27481a;
        if (r0 <= 0) goto L_0x0032;
    L_0x001f:
        r0 = r2.f27483c;
        r1 = 17;
        r0 = r0.m20845j(r1);
        if (r0 == 0) goto L_0x0032;
    L_0x0029:
        r0 = f27481a;	 Catch:{ InterruptedException -> 0x002f }
        r0 = (long) r0;	 Catch:{ InterruptedException -> 0x002f }
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x002f }
    L_0x002f:
        r0 = 0;
        f27481a = r0;
    L_0x0032:
        r0 = r2.f27490j;
        r0.mo4893c(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.v.i():void");
    }

    /* renamed from: a */
    public final boolean mo4878a() {
        return this.f27487g;
    }

    /* renamed from: a */
    public final boolean mo7033a(DataInput dataInput) {
        C7475v c7475v = this;
        SystemClock.uptimeMillis();
        C4662a a = C4665c.m20858a(ab.f19825c, dataInput);
        String h = a.m20843h(2);
        C4662a g = a.m20842g(3);
        if (g != null) {
            C4944q c4944q = new C4944q(g);
            String str = c4944q.f18269i;
            int i = ((2 & c4944q.f18263c) != 0 ? 1 : null) == null ? 0 : c4944q.f18264d == 0 ? 2000 : c4944q.f18264d;
            f27481a = i;
            if (!str.equals(h)) {
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(h).length());
                stringBuilder.append("PR received config ");
                stringBuilder.append(str);
                stringBuilder.append(" != response ");
                stringBuilder.append(h);
                ac.m22038b(stringBuilder.toString());
            }
            if (!(c7475v.f27484d == null || str.equals(c7475v.f27484d))) {
                String str2 = c7475v.f27484d;
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 31) + String.valueOf(str2).length());
                stringBuilder2.append("PR received config ");
                stringBuilder2.append(str);
                stringBuilder2.append(" != request ");
                stringBuilder2.append(str2);
                ac.m22038b(stringBuilder2.toString());
            }
            c7475v.f27482b.mo5204a(c4944q, g);
        }
        C4662a g2 = a.m20842g(17);
        if (g2 != null) {
            int d = g2.m20835d(19);
            if (d != c7475v.f27485e) {
                int i2 = c7475v.f27485e;
                StringBuilder stringBuilder3 = new StringBuilder(51);
                stringBuilder3.append("PR received zoom ");
                stringBuilder3.append(d);
                stringBuilder3.append(" != request ");
                stringBuilder3.append(i2);
                ac.m22038b(stringBuilder3.toString());
            }
            int k = g2.m20846k(22);
            int i3 = 0;
            while (i3 < k) {
                g = g2.m20833c(22, i3);
                int d2 = g.m20835d(23);
                int d3 = g.m20835d(24);
                int d4 = g.m20845j(26) ? g.m20835d(26) : -1;
                byte[] c = g.m20834c(25);
                if (c.length > 1 && c[0] == (byte) 67) {
                    c = C4781c.m21175a(c);
                }
                int i4 = i3;
                c7475v.f27482b.mo5205a(h, d, d2, d3, d4, c);
                i3 = i4 + 1;
            }
        }
        a.m20831b(34);
        c7475v.f27482b.mo5203a();
        return true;
    }

    /* renamed from: a */
    public final void mo7032a(DataOutput dataOutput) {
        this.f27483c.m20824a((OutputStream) dataOutput);
    }
}
