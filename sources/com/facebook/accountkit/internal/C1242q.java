package com.facebook.accountkit.internal;

import android.content.Intent;
import java.util.HashSet;
import java.util.TreeSet;

/* renamed from: com.facebook.accountkit.internal.q */
abstract class C1242q {
    /* renamed from: a */
    private static final String f3337a = "q";
    /* renamed from: d */
    private static final HashSet<String> f3338d = C1242q.m4436e();
    /* renamed from: b */
    private TreeSet<Integer> f3339b;
    /* renamed from: c */
    private boolean f3340c;

    /* renamed from: a */
    protected abstract String mo1591a();

    /* renamed from: b */
    protected abstract Intent mo1592b();

    C1242q() {
    }

    /* renamed from: e */
    private static HashSet<String> m4436e() {
        HashSet<String> hashSet = new HashSet();
        hashSet.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
        hashSet.add("cc2751449a350f668590264ed76692694a80308a");
        hashSet.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
        hashSet.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
        hashSet.add("df6b721c8b4d3b6eb44c861d4415007e5a35fc95");
        return hashSet;
    }

    /* renamed from: a */
    public boolean m4439a(android.content.Context r6, java.lang.String r7) {
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
        r5 = this;
        r0 = android.os.Build.BRAND;
        r1 = r6.getApplicationInfo();
        r1 = r1.flags;
        r2 = "generic";
        r0 = r0.startsWith(r2);
        r2 = 1;
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r0 = r1 & 2;
        if (r0 == 0) goto L_0x0016;
    L_0x0015:
        return r2;
    L_0x0016:
        r0 = 0;
        r6 = r6.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0049 }
        r1 = 64;	 Catch:{ NameNotFoundException -> 0x0049 }
        r6 = r6.getPackageInfo(r7, r1);	 Catch:{ NameNotFoundException -> 0x0049 }
        r7 = r6.signatures;
        if (r7 == 0) goto L_0x0048;
    L_0x0025:
        r7 = r6.signatures;
        r7 = r7.length;
        if (r7 > 0) goto L_0x002b;
    L_0x002a:
        goto L_0x0048;
    L_0x002b:
        r6 = r6.signatures;
        r7 = r6.length;
        r1 = 0;
    L_0x002f:
        if (r1 >= r7) goto L_0x0047;
    L_0x0031:
        r3 = r6[r1];
        r3 = r3.toByteArray();
        r3 = com.facebook.accountkit.internal.C1251w.m4488a(r3);
        r4 = f3338d;
        r3 = r4.contains(r3);
        if (r3 != 0) goto L_0x0044;
    L_0x0043:
        return r0;
    L_0x0044:
        r1 = r1 + 1;
        goto L_0x002f;
    L_0x0047:
        return r2;
    L_0x0048:
        return r0;
    L_0x0049:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.q.a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: c */
    public boolean m4441c() {
        if (this.f3339b == null) {
            m4438a(false);
        }
        return this.f3340c;
    }

    /* renamed from: d */
    public TreeSet<Integer> m4442d() {
        if (this.f3339b == null) {
            m4438a(false);
        }
        return this.f3339b;
    }

    /* renamed from: a */
    public synchronized void m4438a(boolean r9) {
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
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f3339b;	 Catch:{ all -> 0x00a8 }
        if (r0 == 0) goto L_0x0009;
    L_0x0005:
        if (r9 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r8);
        return;
    L_0x0009:
        r9 = new java.util.TreeSet;	 Catch:{ all -> 0x00a8 }
        r9.<init>();	 Catch:{ all -> 0x00a8 }
        r0 = com.facebook.accountkit.internal.C1220c.m4288a();	 Catch:{ all -> 0x00a8 }
        r1 = r0.getContentResolver();	 Catch:{ all -> 0x00a8 }
        r0 = "version";	 Catch:{ all -> 0x00a8 }
        r3 = new java.lang.String[]{r0};	 Catch:{ all -> 0x00a8 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a8 }
        r0.<init>();	 Catch:{ all -> 0x00a8 }
        r2 = "content://";	 Catch:{ all -> 0x00a8 }
        r0.append(r2);	 Catch:{ all -> 0x00a8 }
        r2 = r8.mo1591a();	 Catch:{ all -> 0x00a8 }
        r0.append(r2);	 Catch:{ all -> 0x00a8 }
        r2 = ".provider.PlatformProvider/versions";	 Catch:{ all -> 0x00a8 }
        r0.append(r2);	 Catch:{ all -> 0x00a8 }
        r0 = r0.toString();	 Catch:{ all -> 0x00a8 }
        r2 = android.net.Uri.parse(r0);	 Catch:{ all -> 0x00a8 }
        r0 = 1;
        r7 = 0;
        r4 = com.facebook.accountkit.internal.C1220c.m4288a();	 Catch:{ all -> 0x009f }
        r4 = r4.getPackageManager();	 Catch:{ all -> 0x009f }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009f }
        r5.<init>();	 Catch:{ all -> 0x009f }
        r6 = r8.mo1591a();	 Catch:{ all -> 0x009f }
        r5.append(r6);	 Catch:{ all -> 0x009f }
        r6 = ".provider.PlatformProvider";	 Catch:{ all -> 0x009f }
        r5.append(r6);	 Catch:{ all -> 0x009f }
        r5 = r5.toString();	 Catch:{ all -> 0x009f }
        r6 = 0;
        r4 = r4.resolveContentProvider(r5, r6);	 Catch:{ RuntimeException -> 0x005f }
        goto L_0x0068;
    L_0x005f:
        r4 = move-exception;
        r5 = f3337a;	 Catch:{ all -> 0x009f }
        r6 = "Failed to query content resolver.";	 Catch:{ all -> 0x009f }
        android.util.Log.e(r5, r6, r4);	 Catch:{ all -> 0x009f }
        r4 = r7;
    L_0x0068:
        if (r4 == 0) goto L_0x0094;
    L_0x006a:
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r1 = r1.query(r2, r3, r4, r5, r6);	 Catch:{ NullPointerException -> 0x0073, NullPointerException -> 0x0073 }
        r7 = r1;
        goto L_0x007a;
    L_0x0073:
        r1 = f3337a;	 Catch:{ all -> 0x009f }
        r2 = "Failed to query content resolver.";	 Catch:{ all -> 0x009f }
        android.util.Log.e(r1, r2);	 Catch:{ all -> 0x009f }
    L_0x007a:
        if (r7 == 0) goto L_0x0094;	 Catch:{ all -> 0x009f }
    L_0x007c:
        r1 = r7.moveToNext();	 Catch:{ all -> 0x009f }
        if (r1 == 0) goto L_0x0094;	 Catch:{ all -> 0x009f }
    L_0x0082:
        r1 = "version";	 Catch:{ all -> 0x009f }
        r1 = r7.getColumnIndex(r1);	 Catch:{ all -> 0x009f }
        r1 = r7.getInt(r1);	 Catch:{ all -> 0x009f }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x009f }
        r9.add(r1);	 Catch:{ all -> 0x009f }
        goto L_0x007c;
    L_0x0094:
        if (r7 == 0) goto L_0x009b;
    L_0x0096:
        r8.f3340c = r0;	 Catch:{ all -> 0x00a8 }
        r7.close();	 Catch:{ all -> 0x00a8 }
    L_0x009b:
        r8.f3339b = r9;	 Catch:{ all -> 0x00a8 }
        monitor-exit(r8);
        return;
    L_0x009f:
        r9 = move-exception;
        if (r7 == 0) goto L_0x00a7;
    L_0x00a2:
        r8.f3340c = r0;	 Catch:{ all -> 0x00a8 }
        r7.close();	 Catch:{ all -> 0x00a8 }
    L_0x00a7:
        throw r9;	 Catch:{ all -> 0x00a8 }
    L_0x00a8:
        r9 = move-exception;
        monitor-exit(r8);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.q.a(boolean):void");
    }
}
