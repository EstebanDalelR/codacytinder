package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ay.C4714e;
import com.google.android.m4b.maps.ay.C4714e.C4713a;
import com.google.android.m4b.maps.ay.C6413m;

public final class ag {
    /* renamed from: a */
    private static boolean f19038a = false;

    /* renamed from: com.google.android.m4b.maps.cg.ag$1 */
    class C66001 implements C4713a {
        /* renamed from: a */
        private /* synthetic */ C6413m f24754a;

        C66001(C6413m c6413m) {
            this.f24754a = c6413m;
        }

        /* renamed from: a */
        public final void mo4891a(C4714e c4714e) {
            this.f24754a.m28021g();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static synchronized void m22842a(com.google.android.m4b.maps.cg.C5173d r6) {
        /*
        r0 = com.google.android.m4b.maps.cg.ag.class;
        monitor-enter(r0);
        r1 = f19038a;	 Catch:{ all -> 0x0077 }
        if (r1 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);
        return;
    L_0x0009:
        r1 = 1;
        f19038a = r1;	 Catch:{ all -> 0x0077 }
        r2 = r6.m23113c();	 Catch:{ all -> 0x0077 }
        r3 = r6.m23112b();	 Catch:{ all -> 0x0077 }
        r3.m23094a(r2);	 Catch:{ all -> 0x0077 }
        r3 = r6.m23111a();	 Catch:{ all -> 0x0077 }
        r3 = r3.m23167a();	 Catch:{ all -> 0x0077 }
        r4 = com.google.android.m4b.maps.ay.C4731z.m21054a();	 Catch:{ all -> 0x0077 }
        r5 = 0;
        if (r4 != 0) goto L_0x0032;
    L_0x0026:
        r4 = com.google.android.m4b.maps.ay.C4731z.m21056a(r2);	 Catch:{ all -> 0x0077 }
        if (r4 != 0) goto L_0x0032;
    L_0x002c:
        r4 = "Google Maps Android API v2 only supports devices with OpenGL ES 2.0 and above";
        com.google.android.m4b.maps.ay.C4728u.m21049a(r4);	 Catch:{ all -> 0x0077 }
        goto L_0x003f;
    L_0x0032:
        r4 = m22843a(r2);	 Catch:{ all -> 0x0077 }
        if (r4 != 0) goto L_0x003e;
    L_0x0038:
        r4 = "Google Play services is not present on this device.";
        com.google.android.m4b.maps.ay.C4728u.m21049a(r4);	 Catch:{ all -> 0x0077 }
        goto L_0x003f;
    L_0x003e:
        r5 = 1;
    L_0x003f:
        if (r5 == 0) goto L_0x004d;
    L_0x0041:
        r4 = r6.m23120j();	 Catch:{ all -> 0x0077 }
        r5 = new com.google.android.m4b.maps.cg.ag$1;	 Catch:{ all -> 0x0077 }
        r5.<init>(r3);	 Catch:{ all -> 0x0077 }
        r4.mo4865a(r5);	 Catch:{ all -> 0x0077 }
    L_0x004d:
        r3 = r6.m23115e();	 Catch:{ all -> 0x0077 }
        com.google.android.m4b.maps.ay.C4717k.m20982a(r2, r3);	 Catch:{ all -> 0x0077 }
        r3 = r6.m23119i();	 Catch:{ all -> 0x0077 }
        r3 = r3.m23228d();	 Catch:{ all -> 0x0077 }
        r6 = r6.m23114d();	 Catch:{ all -> 0x0077 }
        if (r3 == 0) goto L_0x0075;
    L_0x0062:
        r3 = r3.m23197a();	 Catch:{ all -> 0x0077 }
        if (r3 == 0) goto L_0x0075;
    L_0x0068:
        r3 = com.google.android.m4b.maps.C4513R.string.maps_API_OUTDATED_WARNING;	 Catch:{ all -> 0x0077 }
        r6 = r6.getString(r3);	 Catch:{ all -> 0x0077 }
        r6 = android.widget.Toast.makeText(r2, r6, r1);	 Catch:{ all -> 0x0077 }
        r6.show();	 Catch:{ all -> 0x0077 }
    L_0x0075:
        monitor-exit(r0);
        return;
    L_0x0077:
        r6 = move-exception;
        monitor-exit(r0);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.ag.a(com.google.android.m4b.maps.cg.d):void");
    }

    /* renamed from: a */
    private static boolean m22843a(android.content.Context r2) {
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
        r2 = r2.getPackageManager();
        r0 = 0;
        r1 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x000c }
        r2.getPackageInfo(r1, r0);	 Catch:{ NameNotFoundException -> 0x000c }
        r2 = 1;
        return r2;
    L_0x000c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.ag.a(android.content.Context):boolean");
    }
}
