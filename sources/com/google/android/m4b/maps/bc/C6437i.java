package com.google.android.m4b.maps.bc;

import android.os.Handler;
import android.os.Looper;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ar.C4665c;
import com.google.android.m4b.maps.ay.C4715g;
import com.google.android.m4b.maps.ay.C4718l;
import com.google.android.m4b.maps.ay.C4723n;
import com.google.android.m4b.maps.ay.C4724o;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.de.ad;
import com.google.android.m4b.maps.p110j.C5462v;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.m4b.maps.bc.i */
public final class C6437i implements C4723n {
    /* renamed from: a */
    private static final C4662a f23893a;
    /* renamed from: b */
    private final Collection<C4724o> f23894b = new ArrayList();
    /* renamed from: c */
    private final ScheduledExecutorService f23895c;
    /* renamed from: d */
    private final C6413m f23896d;
    /* renamed from: e */
    private final Handler f23897e;

    /* renamed from: com.google.android.m4b.maps.bc.i$a */
    class C4760a implements Runnable {
        /* renamed from: a */
        private C4718l f17432a;
        /* renamed from: b */
        private C4662a f17433b;
        /* renamed from: c */
        private int f17434c = null;
        /* renamed from: d */
        private /* synthetic */ C6437i f17435d;

        public C4760a(C6437i c6437i, C4718l c4718l) {
            this.f17435d = c6437i;
            this.f17432a = c4718l;
            this.f17433b = C6437i.m28196d(c4718l);
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r14 = this;
            r0 = new com.google.android.m4b.maps.ar.a;
            r1 = com.google.android.m4b.maps.de.ad.f19860f;
            r0.<init>(r1);
            r1 = 0;
            r2 = 0;
        L_0x0009:
            r3 = r14.f17433b;
            r4 = 9;
            r3 = r3.m20846k(r4);
            r5 = 1;
            if (r2 >= r3) goto L_0x0101;
        L_0x0014:
            r3 = r14.f17433b;
            r3 = r3.m20833c(r4, r2);
            r6 = new com.google.android.m4b.maps.bo.be;	 Catch:{ IOException -> 0x00d4 }
            r6.<init>();	 Catch:{ IOException -> 0x00d4 }
            r7 = com.google.android.m4b.maps.bo.bd.C4839a.MAPS_ENGINE;	 Catch:{ IOException -> 0x00d4 }
            r7 = r7.mo5117a(r3);	 Catch:{ IOException -> 0x00d4 }
            r6.m21645a(r7);	 Catch:{ IOException -> 0x00d4 }
            r7 = 30;	 Catch:{ IOException -> 0x00d4 }
            r7 = r3.m20838e(r7);	 Catch:{ IOException -> 0x00d4 }
            r7 = com.google.android.m4b.maps.bo.bk.m21697a(r7);	 Catch:{ IOException -> 0x00d4 }
            r8 = new com.google.android.m4b.maps.bo.ba;	 Catch:{ IOException -> 0x00d4 }
            r9 = 4;	 Catch:{ IOException -> 0x00d4 }
            r10 = r7.m20835d(r9);	 Catch:{ IOException -> 0x00d4 }
            r10 = r10 - r5;	 Catch:{ IOException -> 0x00d4 }
            r11 = 2;	 Catch:{ IOException -> 0x00d4 }
            r12 = r7.m20835d(r11);	 Catch:{ IOException -> 0x00d4 }
            r13 = 3;	 Catch:{ IOException -> 0x00d4 }
            r7 = r7.m20835d(r13);	 Catch:{ IOException -> 0x00d4 }
            r8.<init>(r10, r12, r7, r6);	 Catch:{ IOException -> 0x00d4 }
            r6 = com.google.android.m4b.maps.bo.bd.C4839a.MAPS_ENGINE;	 Catch:{ IOException -> 0x00d4 }
            r6 = r8.m21616a(r6);	 Catch:{ IOException -> 0x00d4 }
            r6 = (com.google.android.m4b.maps.bo.C6529z) r6;	 Catch:{ IOException -> 0x00d4 }
            r6 = r6.m28792b();	 Catch:{ IOException -> 0x00d4 }
            r7 = "https://mapsengine.google.com/%s/maptile/maps?v=%s&authToken=%s&x=%d&y=%d&z=%d&s=";	 Catch:{ IOException -> 0x00d4 }
            r10 = 6;	 Catch:{ IOException -> 0x00d4 }
            r10 = new java.lang.Object[r10];	 Catch:{ IOException -> 0x00d4 }
            r12 = r6.m20843h(r5);	 Catch:{ IOException -> 0x00d4 }
            r10[r1] = r12;	 Catch:{ IOException -> 0x00d4 }
            r12 = "v";	 Catch:{ IOException -> 0x00d4 }
            r12 = com.google.android.m4b.maps.bc.C6437i.C4760a.m21102a(r6, r12);	 Catch:{ IOException -> 0x00d4 }
            r12 = com.google.android.m4b.maps.p125y.C5579p.m24318a(r12);	 Catch:{ IOException -> 0x00d4 }
            r10[r5] = r12;	 Catch:{ IOException -> 0x00d4 }
            r12 = "authToken";	 Catch:{ IOException -> 0x00d4 }
            r6 = com.google.android.m4b.maps.bc.C6437i.C4760a.m21102a(r6, r12);	 Catch:{ IOException -> 0x00d4 }
            r6 = com.google.android.m4b.maps.p125y.C5579p.m24318a(r6);	 Catch:{ IOException -> 0x00d4 }
            r10[r11] = r6;	 Catch:{ IOException -> 0x00d4 }
            r6 = r8.m21620c();	 Catch:{ IOException -> 0x00d4 }
            r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IOException -> 0x00d4 }
            r10[r13] = r6;	 Catch:{ IOException -> 0x00d4 }
            r6 = r8.m21621d();	 Catch:{ IOException -> 0x00d4 }
            r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IOException -> 0x00d4 }
            r10[r9] = r6;	 Catch:{ IOException -> 0x00d4 }
            r6 = 5;	 Catch:{ IOException -> 0x00d4 }
            r8 = r8.m21619b();	 Catch:{ IOException -> 0x00d4 }
            r8 = java.lang.Integer.valueOf(r8);	 Catch:{ IOException -> 0x00d4 }
            r10[r6] = r8;	 Catch:{ IOException -> 0x00d4 }
            r6 = java.lang.String.format(r7, r10);	 Catch:{ IOException -> 0x00d4 }
            r7 = new org.apache.http.client.methods.HttpGet;	 Catch:{ IOException -> 0x00d4 }
            r7.<init>(r6);	 Catch:{ IOException -> 0x00d4 }
            r6 = new org.apache.http.impl.client.DefaultHttpClient;	 Catch:{ IOException -> 0x00d4 }
            r6.<init>();	 Catch:{ IOException -> 0x00d4 }
            r6 = r6.execute(r7);	 Catch:{ IOException -> 0x00d4 }
            r7 = r6.getStatusLine();	 Catch:{ IOException -> 0x00d4 }
            r7 = r7.getStatusCode();	 Catch:{ IOException -> 0x00d4 }
            r8 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ IOException -> 0x00d4 }
            if (r7 != r8) goto L_0x00d0;	 Catch:{ IOException -> 0x00d4 }
        L_0x00b3:
            r6 = r6.getEntity();	 Catch:{ IOException -> 0x00d4 }
            r6 = r6.getContent();	 Catch:{ IOException -> 0x00d4 }
            r6 = com.google.android.m4b.maps.ac.C4593b.m20687a(r6);	 Catch:{ IOException -> 0x00d4 }
            r7 = new com.google.android.m4b.maps.ar.a;	 Catch:{ IOException -> 0x00d4 }
            r8 = com.google.android.m4b.maps.de.ad.f19859e;	 Catch:{ IOException -> 0x00d4 }
            r7.<init>(r8);	 Catch:{ IOException -> 0x00d4 }
            r7.m20821a(r5, r3);	 Catch:{ IOException -> 0x00d4 }
            r7.m20823a(r11, r6);	 Catch:{ IOException -> 0x00d4 }
            r0.m20821a(r4, r7);	 Catch:{ IOException -> 0x00d4 }
            goto L_0x00fd;	 Catch:{ IOException -> 0x00d4 }
        L_0x00d0:
            com.google.android.m4b.maps.bc.C6437i.C4760a.m21103a(r0, r3);	 Catch:{ IOException -> 0x00d4 }
            goto L_0x00fd;
        L_0x00d4:
            r6 = 4641240890982006784; // 0x4069000000000000 float:0.0 double:200.0;
            r8 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
            r4 = r14.f17434c;
            r10 = (double) r4;
            r8 = java.lang.Math.pow(r8, r10);
            r8 = r8 * r6;
            r6 = (long) r8;
            r8 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
            r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
            if (r4 >= 0) goto L_0x00fa;
        L_0x00e9:
            r0 = r14.f17435d;
            r0 = r0.f23895c;
            r1 = java.util.concurrent.TimeUnit.MILLISECONDS;
            r0.schedule(r14, r6, r1);
            r0 = r14.f17434c;
            r0 = r0 + r5;
            r14.f17434c = r0;
            return;
        L_0x00fa:
            com.google.android.m4b.maps.bc.C6437i.C4760a.m21103a(r0, r3);
        L_0x00fd:
            r2 = r2 + 1;
            goto L_0x0009;
        L_0x0101:
            r1 = com.google.android.m4b.maps.bc.C6437i.f23893a;
            r0.m20821a(r5, r1);
            r1 = r14.f17432a;	 Catch:{ IOException -> 0x0112 }
            r0 = com.google.android.m4b.maps.ar.C4665c.m20862b(r0);	 Catch:{ IOException -> 0x0112 }
            r1.mo7033a(r0);	 Catch:{ IOException -> 0x0112 }
            goto L_0x0119;
        L_0x0112:
            r0 = r14.f17435d;
            r1 = r14.f17432a;
            r0.m28192b(r1);
        L_0x0119:
            r0 = r14.f17435d;
            r1 = r14.f17432a;
            r0.f23897e.post(new com.google.android.m4b.maps.bc.C6437i.C47591(r0, r1));
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bc.i.a.run():void");
        }

        /* renamed from: a */
        private static void m21103a(C4662a c4662a, C4662a c4662a2) {
            C4662a c4662a3 = new C4662a(ad.f19859e);
            c4662a3.m20821a(1, c4662a2);
            c4662a.m20821a(9, c4662a3);
        }

        /* renamed from: a */
        private static String m21102a(C4662a c4662a, String str) {
            int k = c4662a.m20846k(2);
            for (int i = 0; i < k; i++) {
                C4662a c = c4662a.m20833c(2, i);
                if (c.m20843h(1).equals(str)) {
                    return c.m20843h(2);
                }
            }
            return null;
        }
    }

    static {
        C4662a c4662a = new C4662a(ad.f19858d);
        f23893a = c4662a;
        c4662a.m20820a(1, 0);
        f23893a.m20820a(2, 0);
    }

    public C6437i(C6413m c6413m, ScheduledExecutorService scheduledExecutorService) {
        this.f23896d = (C6413m) C5462v.m23767a((Object) c6413m);
        this.f23895c = (ScheduledExecutorService) C5462v.m23767a((Object) scheduledExecutorService);
        this.f23897e = new Handler(Looper.getMainLooper());
    }

    /* renamed from: b */
    private synchronized C4724o[] m28194b() {
        C4724o[] c4724oArr;
        c4724oArr = new C4724o[this.f23894b.size()];
        this.f23894b.toArray(c4724oArr);
        return c4724oArr;
    }

    /* renamed from: b */
    private void m28192b(C4718l c4718l) {
        for (C4724o b : m28194b()) {
            b.mo4874b(c4718l);
        }
    }

    /* renamed from: c */
    public final void mo4893c(com.google.android.m4b.maps.ay.C4718l r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r5.mo7034g();
        r1 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        if (r0 == r1) goto L_0x0031;
    L_0x0008:
        r0 = "MapsEngineDataRequestDispatcher";
        r1 = 4;
        r0 = com.google.android.m4b.maps.ay.C4728u.m21050a(r0, r1);
        if (r0 == 0) goto L_0x002d;
    L_0x0011:
        r0 = "MapsEngineDataRequestDispatcher";
        r1 = r5.mo7034g();
        r2 = new java.lang.StringBuilder;
        r3 = 62;
        r2.<init>(r3);
        r3 = "Can only handle Map Tile requests. Request type is ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        android.util.Log.i(r0, r1);
    L_0x002d:
        r4.m28192b(r5);
        return;
    L_0x0031:
        r0 = com.google.android.m4b.maps.bc.C6437i.m28196d(r5);	 Catch:{ IOException -> 0x006e }
        r1 = 9;	 Catch:{ IOException -> 0x006e }
        r2 = 0;	 Catch:{ IOException -> 0x006e }
        r0 = r0.m20833c(r1, r2);	 Catch:{ IOException -> 0x006e }
        r1 = 29;	 Catch:{ IOException -> 0x006e }
        r0 = r0.m20842g(r1);	 Catch:{ IOException -> 0x006e }
        r1 = 1;	 Catch:{ IOException -> 0x006e }
        r0 = r0.m20843h(r1);	 Catch:{ IOException -> 0x006e }
        if (r0 == 0) goto L_0x005a;	 Catch:{ IOException -> 0x006e }
    L_0x0049:
        r3 = "ft:cw:";	 Catch:{ IOException -> 0x006e }
        r3 = r0.startsWith(r3);	 Catch:{ IOException -> 0x006e }
        if (r3 != 0) goto L_0x005b;	 Catch:{ IOException -> 0x006e }
    L_0x0051:
        r3 = "vdb:";	 Catch:{ IOException -> 0x006e }
        r0 = r0.startsWith(r3);	 Catch:{ IOException -> 0x006e }
        if (r0 == 0) goto L_0x005a;	 Catch:{ IOException -> 0x006e }
    L_0x0059:
        goto L_0x005b;	 Catch:{ IOException -> 0x006e }
    L_0x005a:
        r1 = 0;	 Catch:{ IOException -> 0x006e }
    L_0x005b:
        if (r1 == 0) goto L_0x0063;	 Catch:{ IOException -> 0x006e }
    L_0x005d:
        r0 = r4.f23896d;	 Catch:{ IOException -> 0x006e }
        r0.mo4893c(r5);	 Catch:{ IOException -> 0x006e }
        goto L_0x0071;	 Catch:{ IOException -> 0x006e }
    L_0x0063:
        r0 = r4.f23895c;	 Catch:{ IOException -> 0x006e }
        r1 = new com.google.android.m4b.maps.bc.i$a;	 Catch:{ IOException -> 0x006e }
        r1.<init>(r4, r5);	 Catch:{ IOException -> 0x006e }
        r0.execute(r1);	 Catch:{ IOException -> 0x006e }
        return;
    L_0x006e:
        r4.m28192b(r5);
    L_0x0071:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bc.i.c(com.google.android.m4b.maps.ay.l):void");
    }

    /* renamed from: d */
    private static C4662a m28196d(C4718l c4718l) {
        DataOutput c4715g = new C4715g();
        c4718l.mo7032a(c4715g);
        return C4665c.m20858a(ad.f19857c, new DataInputStream(new ByteArrayInputStream(c4715g.m20962a())));
    }

    /* renamed from: a */
    public final void mo4892a(C4724o c4724o) {
        this.f23894b.add(c4724o);
        this.f23896d.mo4892a(c4724o);
    }

    /* renamed from: a */
    public final void mo4890a(int i, byte[] bArr, boolean z, boolean z2, boolean z3) {
        this.f23896d.mo4890a(i, bArr, z, z2, z3);
    }

    /* renamed from: j */
    public final String mo4895j() {
        return this.f23896d.mo4895j();
    }

    /* renamed from: f */
    public final void mo4894f() {
        this.f23896d.mo4894f();
    }
}
