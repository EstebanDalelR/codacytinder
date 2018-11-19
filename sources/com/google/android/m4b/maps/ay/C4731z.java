package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.content.pm.FeatureInfo;

/* renamed from: com.google.android.m4b.maps.ay.z */
public final class C4731z {
    /* renamed from: a */
    private static final String f17368a = "z";

    private C4731z() {
    }

    /* renamed from: a */
    public static boolean m21055a(android.app.Activity r4) {
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
        r0 = r4.getWindow();
        r0 = r0.getAttributes();
        r0 = r0.flags;
        r1 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r0 = r0 & r1;
        r1 = 1;
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        return r1;
    L_0x0011:
        r0 = 0;
        r2 = r4.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0028 }
        r4 = r4.getComponentName();	 Catch:{ NameNotFoundException -> 0x0028 }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0028 }
        r4 = r2.getActivityInfo(r4, r3);	 Catch:{ NameNotFoundException -> 0x0028 }
        r4 = r4.flags;	 Catch:{ NameNotFoundException -> 0x0028 }
        r4 = r4 & 512;
        if (r4 == 0) goto L_0x0027;
    L_0x0026:
        return r1;
    L_0x0027:
        return r0;
    L_0x0028:
        r4 = f17368a;
        r1 = 3;
        r4 = com.google.android.m4b.maps.ay.C4728u.m21050a(r4, r1);
        if (r4 == 0) goto L_0x0038;
    L_0x0031:
        r4 = f17368a;
        r1 = "No hardware acceleration detected!";
        android.util.Log.d(r4, r1);
    L_0x0038:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.z.a(android.app.Activity):boolean");
    }

    /* renamed from: a */
    public static boolean m21057a(boolean r3) {
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
        r1 = 3;
        if (r3 != 0) goto L_0x0014;
    L_0x0004:
        r3 = f17368a;
        r3 = com.google.android.m4b.maps.ay.C4728u.m21050a(r3, r1);
        if (r3 == 0) goto L_0x0013;
    L_0x000c:
        r3 = f17368a;
        r1 = "Not using TextureView: No hardware acceleration";
        android.util.Log.d(r3, r1);
    L_0x0013:
        return r0;
    L_0x0014:
        r3 = android.os.Build.VERSION.SDK_INT;
        r2 = 14;
        if (r3 >= r2) goto L_0x002a;
    L_0x001a:
        r3 = f17368a;
        r3 = com.google.android.m4b.maps.ay.C4728u.m21050a(r3, r1);
        if (r3 == 0) goto L_0x0029;
    L_0x0022:
        r3 = f17368a;
        r1 = "Not using TextureView: Android version < ICS";
        android.util.Log.d(r3, r1);
    L_0x0029:
        return r0;
    L_0x002a:
        r3 = com.google.android.m4b.maps.p103c.C5047a.m22575a();	 Catch:{ Exception -> 0x0040 }
        if (r3 == 0) goto L_0x0040;	 Catch:{ Exception -> 0x0040 }
    L_0x0030:
        r3 = f17368a;	 Catch:{ Exception -> 0x0040 }
        r3 = com.google.android.m4b.maps.ay.C4728u.m21050a(r3, r1);	 Catch:{ Exception -> 0x0040 }
        if (r3 == 0) goto L_0x003f;	 Catch:{ Exception -> 0x0040 }
    L_0x0038:
        r3 = f17368a;	 Catch:{ Exception -> 0x0040 }
        r2 = "Not using TextureView: Emulator";	 Catch:{ Exception -> 0x0040 }
        android.util.Log.d(r3, r2);	 Catch:{ Exception -> 0x0040 }
    L_0x003f:
        return r0;
    L_0x0040:
        r3 = android.os.Build.VERSION.SDK_INT;
        r2 = 16;
        if (r3 >= r2) goto L_0x0056;
    L_0x0046:
        r3 = f17368a;
        r3 = com.google.android.m4b.maps.ay.C4728u.m21050a(r3, r1);
        if (r3 == 0) goto L_0x0055;
    L_0x004e:
        r3 = f17368a;
        r1 = "Not using TextureView: Android version < JB";
        android.util.Log.d(r3, r1);
    L_0x0055:
        return r0;
    L_0x0056:
        r3 = f17368a;
        r3 = com.google.android.m4b.maps.ay.C4728u.m21050a(r3, r1);
        if (r3 == 0) goto L_0x0065;
    L_0x005e:
        r3 = f17368a;
        r0 = "Using texture view!";
        android.util.Log.d(r3, r0);
    L_0x0065:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.z.a(boolean):boolean");
    }

    /* renamed from: a */
    public static boolean m21056a(Context context) {
        context = context.getPackageManager().getSystemAvailableFeatures();
        if (context != null && context.length > 0) {
            for (FeatureInfo featureInfo : context) {
                if (featureInfo.name == null && featureInfo.reqGlEsVersion >= 131072) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static com.google.android.m4b.maps.p125y.C5570i<java.lang.String> m21053a(java.lang.String r4) {
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
        r0 = java.lang.System.getProperty(r4);
        r0 = com.google.android.m4b.maps.p125y.C5570i.m24288c(r0);
        r1 = r0.mo5814b();
        if (r1 != 0) goto L_0x005e;
    L_0x000e:
        r0 = java.lang.Runtime.getRuntime();	 Catch:{ IOException -> 0x0049 }
        r1 = 2;	 Catch:{ IOException -> 0x0049 }
        r1 = new java.lang.String[r1];	 Catch:{ IOException -> 0x0049 }
        r2 = 0;	 Catch:{ IOException -> 0x0049 }
        r3 = "/system/bin/getprop";	 Catch:{ IOException -> 0x0049 }
        r1[r2] = r3;	 Catch:{ IOException -> 0x0049 }
        r2 = 1;	 Catch:{ IOException -> 0x0049 }
        r1[r2] = r4;	 Catch:{ IOException -> 0x0049 }
        r4 = r0.exec(r1);	 Catch:{ IOException -> 0x0049 }
        r0 = new java.util.Scanner;
        r4 = r4.getInputStream();
        r1 = "UTF-8";
        r0.<init>(r4, r1);
        r4 = "\n";
        r4 = r0.useDelimiter(r4);
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0041;
    L_0x0038:
        r0 = r4.next();
        r0 = com.google.android.m4b.maps.p125y.C5570i.m24286b(r0);
        goto L_0x0045;
    L_0x0041:
        r0 = com.google.android.m4b.maps.p125y.C5570i.m24287c();
    L_0x0045:
        r4.close();
        goto L_0x005e;
    L_0x0049:
        r4 = f17368a;
        r0 = 5;
        r4 = com.google.android.m4b.maps.ay.C4728u.m21050a(r4, r0);
        if (r4 == 0) goto L_0x0059;
    L_0x0052:
        r4 = f17368a;
        r0 = "Unable to retrieve system property.";
        android.util.Log.w(r4, r0);
    L_0x0059:
        r4 = com.google.android.m4b.maps.p125y.C5570i.m24287c();
        return r4;
    L_0x005e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.z.a(java.lang.String):com.google.android.m4b.maps.y.i<java.lang.String>");
    }

    /* renamed from: a */
    public static boolean m21054a() {
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
        r0 = com.google.android.m4b.maps.p103c.C5047a.m22575a();	 Catch:{ Exception -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.z.a():boolean");
    }
}
