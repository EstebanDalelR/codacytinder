package com.google.android.m4b.maps.bv;

import android.graphics.Bitmap;
import android.util.Pair;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.bv.C7475v.C4953a;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.HashSet;

/* renamed from: com.google.android.m4b.maps.bv.u */
public final class C4952u {
    /* renamed from: a */
    private static long f18303a = (C4944q.f18256a - 10000);
    /* renamed from: b */
    private final C4930h f18304b;
    /* renamed from: c */
    private Object f18305c;
    /* renamed from: d */
    private final HashSet<Object> f18306d = new HashSet();
    /* renamed from: e */
    private final C6413m f18307e;

    /* renamed from: com.google.android.m4b.maps.bv.u$a */
    class C4949a implements Runnable {
        /* renamed from: a */
        private final C4950b f18299a;
        /* renamed from: b */
        private final String f18300b;
        /* renamed from: c */
        private boolean f18301c;
        /* renamed from: d */
        private /* synthetic */ C4952u f18302d;

        public C4949a(C4952u c4952u, C4950b c4950b, String str, boolean z) {
            this.f18302d = c4952u;
            this.f18299a = c4950b;
            this.f18300b = str;
            C5571j.m24293a((Object) str, (Object) "persistentKey");
            this.f18301c = z;
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r11 = this;
            r0 = java.lang.Thread.currentThread();
            r0.getName();
            r0 = 0;
            r1 = 0;
            r2 = r11.f18302d;	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
            r3 = r2.f18304b;	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
            r4 = 0;	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
            r5 = 0;	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
            r6 = 0;	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
            r7 = r11.f18300b;	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
            r8 = com.google.android.m4b.maps.bv.C4944q.f18256a;	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
            r2 = r3.m22100a(r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
            r3 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
            r3.<init>(r2);	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
            r2 = com.google.android.m4b.maps.bv.C4944q.m22171a(r3);	 Catch:{ all -> 0x004e }
            com.google.android.m4b.maps.bv.C4930h.m22093a(r3);	 Catch:{ IOException -> 0x0049, InterruptedException -> 0x0056 }
            r1 = r11.f18302d;
            r1 = com.google.android.m4b.maps.bv.C4952u.m22193b(r1);
            r3 = r11.f18300b;
            if (r3 == 0) goto L_0x0041;
        L_0x0030:
            r3 = r11.f18300b;
            r1 = r3.equals(r1);
            if (r1 == 0) goto L_0x0041;
        L_0x0038:
            r1 = r11.f18301c;
            r2.f18276p = r1;
            r1 = r11.f18299a;
            r1.mo5186a(r0, r2);
        L_0x0041:
            r0 = r11.f18302d;
            r1 = r11.f18300b;
            r0.m22194b(r1);
            return;
        L_0x0049:
            r1 = move-exception;
            r10 = r2;
            r2 = r1;
            r1 = r10;
            goto L_0x0085;
        L_0x004e:
            r2 = move-exception;
            com.google.android.m4b.maps.bv.C4930h.m22093a(r3);	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
            throw r2;	 Catch:{ IOException -> 0x0084, InterruptedException -> 0x0055 }
        L_0x0053:
            r2 = move-exception;
            goto L_0x00a6;
        L_0x0055:
            r2 = r1;
        L_0x0056:
            r3 = "PM was interrupted loading config";	 Catch:{ all -> 0x007f }
            com.google.android.m4b.maps.bv.ac.m22038b(r3);	 Catch:{ all -> 0x007f }
            r3 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x007f }
            r3.interrupt();	 Catch:{ all -> 0x007f }
            r0 = r11.f18302d;
            r0 = com.google.android.m4b.maps.bv.C4952u.m22193b(r0);
            r2 = r11.f18300b;
            if (r2 == 0) goto L_0x0041;
        L_0x006c:
            r2 = r11.f18300b;
            r0 = r2.equals(r0);
            if (r0 == 0) goto L_0x0041;
        L_0x0074:
            r0 = r11.f18301c;
            r1.f18276p = r0;
            r0 = r11.f18299a;
            r2 = 1;
            r0.mo5186a(r2, r1);
            goto L_0x0041;
        L_0x007f:
            r1 = move-exception;
            r10 = r2;
            r2 = r1;
            r1 = r10;
            goto L_0x00a6;
        L_0x0084:
            r2 = move-exception;
        L_0x0085:
            r3 = "PM failed to load config";	 Catch:{ all -> 0x0053 }
            com.google.android.m4b.maps.bv.ac.m22037a(r3, r2);	 Catch:{ all -> 0x0053 }
            r2 = r11.f18302d;
            r2 = com.google.android.m4b.maps.bv.C4952u.m22193b(r2);
            r3 = r11.f18300b;
            if (r3 == 0) goto L_0x0041;
        L_0x0094:
            r3 = r11.f18300b;
            r2 = r3.equals(r2);
            if (r2 == 0) goto L_0x0041;
        L_0x009c:
            r2 = r11.f18301c;
            r1.f18276p = r2;
            r2 = r11.f18299a;
            r2.mo5186a(r0, r1);
            goto L_0x0041;
        L_0x00a6:
            r3 = r11.f18302d;
            r3 = com.google.android.m4b.maps.bv.C4952u.m22193b(r3);
            r4 = r11.f18300b;
            if (r4 == 0) goto L_0x00c1;
        L_0x00b0:
            r4 = r11.f18300b;
            r3 = r4.equals(r3);
            if (r3 == 0) goto L_0x00c1;
        L_0x00b8:
            r3 = r11.f18301c;
            r1.f18276p = r3;
            r3 = r11.f18299a;
            r3.mo5186a(r0, r1);
        L_0x00c1:
            r0 = r11.f18302d;
            r1 = r11.f18300b;
            r0.m22194b(r1);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.u.a.run():void");
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.u$b */
    public interface C4950b {
        /* renamed from: a */
        void mo5186a(boolean z, C4944q c4944q);
    }

    /* renamed from: com.google.android.m4b.maps.bv.u$c */
    public interface C4951c {
        /* renamed from: a */
        void mo5206a(C4946s c4946s, Bitmap bitmap);
    }

    /* renamed from: com.google.android.m4b.maps.bv.u$d */
    class C6551d implements C4953a {
        /* renamed from: a */
        private final C4950b f24356a;
        /* renamed from: b */
        private final C4951c f24357b;
        /* renamed from: c */
        private final Object f24358c;
        /* renamed from: d */
        private int f24359d = null;
        /* renamed from: e */
        private boolean f24360e;
        /* renamed from: f */
        private /* synthetic */ C4952u f24361f;

        public C6551d(C4952u c4952u, C4950b c4950b, C4951c c4951c, Object obj, boolean z) {
            this.f24361f = c4952u;
            this.f24356a = c4950b;
            this.f24357b = c4951c;
            this.f24358c = obj;
            this.f24360e = z;
        }

        /* renamed from: a */
        public final void mo5204a(com.google.android.m4b.maps.bv.C4944q r3, com.google.android.m4b.maps.ar.C4662a r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.f24359d;
            r0 = r0 + 1;
            r2.f24359d = r0;
            r0 = r2.f24356a;
            if (r0 == 0) goto L_0x0026;
        L_0x000a:
            r0 = r2.f24358c;
            if (r0 == 0) goto L_0x0026;
        L_0x000e:
            r0 = r2.f24358c;
            r1 = r2.f24361f;
            r1 = r1.f18305c;
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0026;
        L_0x001c:
            r0 = r2.f24360e;
            r3.f18276p = r0;
            r0 = r2.f24356a;
            r1 = 0;
            r0.mo5186a(r1, r3);
        L_0x0026:
            r3 = r3.f18269i;
            r3 = com.google.android.m4b.maps.bv.C4944q.m22172a(r3);
            android.os.SystemClock.uptimeMillis();	 Catch:{ IOException -> 0x004a, InterruptedException -> 0x003d }
            r4 = r4.m20837d();	 Catch:{ IOException -> 0x004a, InterruptedException -> 0x003d }
            r0 = r2.f24361f;	 Catch:{ IOException -> 0x004a, InterruptedException -> 0x003d }
            r0 = r0.f18304b;	 Catch:{ IOException -> 0x004a, InterruptedException -> 0x003d }
            r0.m22098a(r4, r3);	 Catch:{ IOException -> 0x004a, InterruptedException -> 0x003d }
            return;
        L_0x003d:
            r3 = "PM was interrupted caching config";
            com.google.android.m4b.maps.bv.ac.m22038b(r3);
            r3 = java.lang.Thread.currentThread();
            r3.interrupt();
            return;
        L_0x004a:
            r3 = move-exception;
            r4 = "PM failed to cache config";
            com.google.android.m4b.maps.bv.ac.m22037a(r4, r3);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.u.d.a(com.google.android.m4b.maps.bv.q, com.google.android.m4b.maps.ar.a):void");
        }

        /* renamed from: a */
        public final void mo5205a(java.lang.String r8, int r9, int r10, int r11, int r12, byte[] r13) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r7 = this;
            r6 = new com.google.android.m4b.maps.bv.s;
            r0 = r6;
            r1 = r8;
            r2 = r10;
            r3 = r11;
            r4 = r12;
            r5 = r9;
            r0.<init>(r1, r2, r3, r4, r5);
            r8 = r7.f24357b;
            if (r8 == 0) goto L_0x0028;
        L_0x000f:
            r8 = new android.graphics.BitmapFactory$Options;
            r8.<init>();
            r9 = 1;
            r8.inDither = r9;
            r10 = android.graphics.Bitmap.Config.RGB_565;
            r8.inPreferredConfig = r10;
            r8.inPurgeable = r9;
            r9 = 0;
            r10 = r13.length;
            r8 = android.graphics.BitmapFactory.decodeByteArray(r13, r9, r10, r8);
            r9 = r7.f24357b;
            r9.mo5206a(r6, r8);
        L_0x0028:
            r8 = r7.f24361f;	 Catch:{ InterruptedException -> 0x0060, IOException -> 0x0036 }
            r8 = r8.f18304b;	 Catch:{ InterruptedException -> 0x0060, IOException -> 0x0036 }
            r9 = r6.m22182a();	 Catch:{ InterruptedException -> 0x0060, IOException -> 0x0036 }
            r8.m22098a(r13, r9);	 Catch:{ InterruptedException -> 0x0060, IOException -> 0x0036 }
            return;
        L_0x0036:
            r8 = java.lang.String.valueOf(r6);
            r9 = new java.lang.StringBuilder;
            r10 = java.lang.String.valueOf(r8);
            r10 = r10.length();
            r10 = r10 + 32;
            r9.<init>(r10);
            r10 = "PM was interrupted caching tile ";
            r9.append(r10);
            r9.append(r8);
            r8 = r9.toString();
            com.google.android.m4b.maps.bv.ac.m22038b(r8);
            r8 = java.lang.Thread.currentThread();
            r8.interrupt();
            return;
        L_0x0060:
            r8 = move-exception;
            r9 = java.lang.String.valueOf(r6);
            r10 = new java.lang.StringBuilder;
            r11 = java.lang.String.valueOf(r9);
            r11 = r11.length();
            r11 = r11 + 24;
            r10.<init>(r11);
            r11 = "PM failed to cache tile ";
            r10.append(r11);
            r10.append(r9);
            r9 = r10.toString();
            com.google.android.m4b.maps.bv.ac.m22037a(r9, r8);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.u.d.a(java.lang.String, int, int, int, int, byte[]):void");
        }

        /* renamed from: a */
        public final void mo5203a() {
            if (!(this.f24356a == null || this.f24359d == 1 || this.f24358c == null || !this.f24358c.equals(this.f24361f.f18305c))) {
                this.f24356a.mo5186a(true, null);
            }
            this.f24361f.m22194b(this.f24358c);
        }
    }

    public C4952u(C4930h c4930h, C6413m c6413m) {
        this.f18304b = c4930h;
        this.f18307e = c6413m;
    }

    /* renamed from: a */
    private synchronized boolean m22192a(Object obj) {
        if (this.f18306d.contains(obj)) {
            return true;
        }
        this.f18306d.add(obj);
        return null;
    }

    /* renamed from: b */
    private synchronized void m22194b(Object obj) {
        this.f18306d.remove(obj);
    }

    /* renamed from: a */
    public final boolean m22198a(C4951c c4951c, C4946s c4946s, boolean z) {
        if (m22192a((Object) c4946s)) {
            return null;
        }
        new C7475v(new C6551d(this, null, c4951c, c4946s, false), c4946s.m22183b(), this.f18307e).m32404a(c4946s.m22187f()).m32405a(c4946s.m22184c(), c4946s.m22185d(), c4946s.m22186e()).m32406a(z).m32412i();
        return true;
    }

    /* renamed from: a */
    public final boolean m22199a(C4951c c4951c, String str, int i, int i2, int i3, int i4, boolean z) {
        C5571j.m24293a((Object) c4951c, (Object) "listener");
        C5571j.m24293a((Object) str, (Object) "panoId");
        return m22198a(c4951c, new C4946s(str, 0, 0, i4, 0), z);
    }

    /* renamed from: a */
    final void m22196a(String str) {
        this.f18305c = str;
    }

    /* renamed from: a */
    public final boolean m22197a(C4950b c4950b, String str, C4938m c4938m, Integer num, boolean z, boolean z2) {
        if (str != null) {
            C5571j.m24293a((Object) c4950b, (Object) "listener");
            C5571j.m24293a((Object) str, (Object) "panoId");
            String a = C4944q.m22172a(str);
            this.f18305c = str;
            if (m22192a((Object) a) != null) {
                return false;
            }
            if (this.f18304b.m22099a(a, f18303a) != null) {
                new Thread(new C4949a(this, c4950b, a, z2), "Config-loader").start();
                return true;
            }
            new C7475v(new C6551d(this, c4950b, null, str, z2), str, this.f18307e).mo7075h().m32406a(z).m32412i();
            return true;
        } else if (num != null) {
            str = num.intValue();
            C5571j.m24293a((Object) c4950b, (Object) "listener");
            C5571j.m24293a((Object) c4938m, (Object) "mapPoint");
            Object pair = new Pair(c4938m, Integer.valueOf(str));
            this.f18305c = pair;
            if (m22192a(pair) != null) {
                return false;
            }
            new C7475v(new C6551d(this, c4950b, null, pair, true), c4938m, str, this.f18307e).mo7075h().m32406a(z).m32412i();
            return true;
        } else {
            C5571j.m24293a((Object) c4950b, (Object) "listener");
            C5571j.m24293a((Object) c4938m, (Object) "mapPoint");
            this.f18305c = c4938m;
            if (m22192a((Object) c4938m) != null) {
                return false;
            }
            new C7475v(new C6551d(this, c4950b, null, c4938m, true), c4938m, this.f18307e).mo7075h().m32406a(z).m32412i();
            return true;
        }
    }

    /* renamed from: b */
    static /* synthetic */ Object m22193b(C4952u c4952u) {
        if (c4952u.f18305c instanceof String) {
            return C4944q.m22172a((String) c4952u.f18305c);
        }
        return c4952u.f18305c;
    }
}
