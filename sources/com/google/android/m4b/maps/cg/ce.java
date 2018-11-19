package com.google.android.m4b.maps.cg;

public class ce {
    /* renamed from: a */
    private static final String f19231a = "ce";
    /* renamed from: b */
    private static final String[] f19232b = new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"};
    /* renamed from: c */
    private final boolean f19233c;
    /* renamed from: d */
    private final int f19234d;
    /* renamed from: e */
    private final boolean f19235e = false;

    public ce(int i, boolean z, boolean z2) {
        this.f19234d = i;
        this.f19233c = z;
    }

    /* renamed from: a */
    public final int m23093a() {
        return this.f19234d;
    }

    /* renamed from: a */
    final boolean m23095a(int i) {
        if (!(this.f19235e || this.f19233c)) {
            if (this.f19234d < i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m23096b() {
        return m23095a(6600000);
    }

    /* renamed from: a */
    public final void m23094a(android.content.Context r9) {
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
        r8 = this;
        r0 = r8.f19234d;
        r1 = 4000000; // 0x3d0900 float:5.605194E-39 double:1.9762626E-317;
        if (r0 >= r1) goto L_0x0008;
    L_0x0007:
        return;
    L_0x0008:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r9.getPackageManager();
        r2 = f19232b;
        r3 = 0;
    L_0x0014:
        r4 = 2;
        if (r3 >= r4) goto L_0x0059;
    L_0x0017:
        r4 = r2[r3];
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r1.getPermissionInfo(r4, r5);	 Catch:{ NameNotFoundException -> 0x0028 }
        r5 = r9.checkCallingOrSelfPermission(r4);	 Catch:{ NameNotFoundException -> 0x0028 }
        if (r5 == 0) goto L_0x0056;	 Catch:{ NameNotFoundException -> 0x0028 }
    L_0x0024:
        r0.add(r4);	 Catch:{ NameNotFoundException -> 0x0028 }
        goto L_0x0056;
    L_0x0028:
        r5 = f19231a;
        r6 = 6;
        r5 = com.google.android.m4b.maps.ay.C4728u.m21050a(r5, r6);
        if (r5 == 0) goto L_0x0056;
    L_0x0031:
        r5 = f19231a;
        r6 = new java.lang.StringBuilder;
        r7 = java.lang.String.valueOf(r4);
        r7 = r7.length();
        r7 = r7 + 114;
        r6.<init>(r7);
        r7 = "Permission \"";
        r6.append(r7);
        r6.append(r4);
        r4 = "\" has not been found on the system. If this occurs on an emulator, you can probably ignore this error.";
        r6.append(r4);
        r4 = r6.toString();
        android.util.Log.e(r5, r4);
    L_0x0056:
        r3 = r3 + 1;
        goto L_0x0014;
    L_0x0059:
        r9 = r0.size();
        if (r9 == 0) goto L_0x00a4;
    L_0x005f:
        r9 = new java.lang.StringBuilder;
        r1 = "The Maps API requires the additional following permissions to be set in the AndroidManifest.xml to ensure a correct behavior:";
        r9.<init>(r1);
        r0 = r0.iterator();
    L_0x006a:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x009a;
    L_0x0070:
        r1 = r0.next();
        r1 = (java.lang.String) r1;
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r3 = r3 + 35;
        r2.<init>(r3);
        r3 = "\n<uses-permission android:name=\"";
        r2.append(r3);
        r2.append(r1);
        r1 = "\"/>";
        r2.append(r1);
        r1 = r2.toString();
        r9.append(r1);
        goto L_0x006a;
    L_0x009a:
        r0 = new java.lang.SecurityException;
        r9 = r9.toString();
        r0.<init>(r9);
        throw r0;
    L_0x00a4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.ce.a(android.content.Context):void");
    }
}
