package com.facebook.internal;

import com.facebook.internal.C1724k.C1720d;
import java.io.IOException;

/* renamed from: com.facebook.internal.w */
class C1748w {
    /* renamed from: a */
    static final String f4826a = "w";
    /* renamed from: b */
    private static final String f4827b;
    /* renamed from: c */
    private static C1724k f4828c;

    C1748w() {
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f4826a);
        stringBuilder.append("_Redirect");
        f4827b = stringBuilder.toString();
    }

    /* renamed from: a */
    static synchronized C1724k m6059a() throws IOException {
        C1724k c1724k;
        synchronized (C1748w.class) {
            if (f4828c == null) {
                f4828c = new C1724k(f4826a, new C1720d());
            }
            c1724k = f4828c;
        }
        return c1724k;
    }

    /* renamed from: a */
    static android.net.Uri m6058a(android.net.Uri r8) {
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
        r0 = 0;
        if (r8 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r8 = r8.toString();
        r1 = com.facebook.internal.C1748w.m6059a();	 Catch:{ IOException -> 0x0059, all -> 0x0051 }
        r2 = 0;
        r4 = r0;
        r3 = 0;
    L_0x000f:
        r5 = f4827b;	 Catch:{ IOException -> 0x004f, all -> 0x004c }
        r5 = r1.m5942a(r8, r5);	 Catch:{ IOException -> 0x004f, all -> 0x004c }
        if (r5 == 0) goto L_0x003e;	 Catch:{ IOException -> 0x004f, all -> 0x004c }
    L_0x0017:
        r3 = 1;	 Catch:{ IOException -> 0x004f, all -> 0x004c }
        r8 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x004f, all -> 0x004c }
        r8.<init>(r5);	 Catch:{ IOException -> 0x004f, all -> 0x004c }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r4 = new char[r4];	 Catch:{ IOException -> 0x005a, all -> 0x003c }
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x005a, all -> 0x003c }
        r5.<init>();	 Catch:{ IOException -> 0x005a, all -> 0x003c }
    L_0x0026:
        r6 = r4.length;	 Catch:{ IOException -> 0x005a, all -> 0x003c }
        r6 = r8.read(r4, r2, r6);	 Catch:{ IOException -> 0x005a, all -> 0x003c }
        if (r6 <= 0) goto L_0x0031;	 Catch:{ IOException -> 0x005a, all -> 0x003c }
    L_0x002d:
        r5.append(r4, r2, r6);	 Catch:{ IOException -> 0x005a, all -> 0x003c }
        goto L_0x0026;	 Catch:{ IOException -> 0x005a, all -> 0x003c }
    L_0x0031:
        com.facebook.internal.Utility.m5774a(r8);	 Catch:{ IOException -> 0x005a, all -> 0x003c }
        r4 = r5.toString();	 Catch:{ IOException -> 0x005a, all -> 0x003c }
        r7 = r4;
        r4 = r8;
        r8 = r7;
        goto L_0x000f;
    L_0x003c:
        r0 = move-exception;
        goto L_0x0055;
    L_0x003e:
        if (r3 == 0) goto L_0x0048;
    L_0x0040:
        r8 = android.net.Uri.parse(r8);	 Catch:{ IOException -> 0x004f, all -> 0x004c }
        com.facebook.internal.Utility.m5774a(r4);
        return r8;
    L_0x0048:
        com.facebook.internal.Utility.m5774a(r4);
        goto L_0x005d;
    L_0x004c:
        r0 = move-exception;
        r8 = r4;
        goto L_0x0055;
    L_0x004f:
        r8 = r4;
        goto L_0x005a;
    L_0x0051:
        r8 = move-exception;
        r7 = r0;
        r0 = r8;
        r8 = r7;
    L_0x0055:
        com.facebook.internal.Utility.m5774a(r8);
        throw r0;
    L_0x0059:
        r8 = r0;
    L_0x005a:
        com.facebook.internal.Utility.m5774a(r8);
    L_0x005d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.w.a(android.net.Uri):android.net.Uri");
    }

    /* renamed from: a */
    static void m6060a(android.net.Uri r3, android.net.Uri r4) {
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
        if (r3 == 0) goto L_0x0031;
    L_0x0002:
        if (r4 != 0) goto L_0x0005;
    L_0x0004:
        goto L_0x0031;
    L_0x0005:
        r0 = 0;
        r1 = com.facebook.internal.C1748w.m6059a();	 Catch:{ IOException -> 0x002d, all -> 0x0028 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x002d, all -> 0x0028 }
        r2 = f4827b;	 Catch:{ IOException -> 0x002d, all -> 0x0028 }
        r3 = r1.m5945b(r3, r2);	 Catch:{ IOException -> 0x002d, all -> 0x0028 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x0026, all -> 0x0023 }
        r4 = r4.getBytes();	 Catch:{ IOException -> 0x0026, all -> 0x0023 }
        r3.write(r4);	 Catch:{ IOException -> 0x0026, all -> 0x0023 }
        com.facebook.internal.Utility.m5774a(r3);
        goto L_0x0030;
    L_0x0023:
        r4 = move-exception;
        r0 = r3;
        goto L_0x0029;
    L_0x0026:
        r0 = r3;
        goto L_0x002d;
    L_0x0028:
        r4 = move-exception;
    L_0x0029:
        com.facebook.internal.Utility.m5774a(r0);
        throw r4;
    L_0x002d:
        com.facebook.internal.Utility.m5774a(r0);
    L_0x0030:
        return;
    L_0x0031:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.w.a(android.net.Uri, android.net.Uri):void");
    }
}
