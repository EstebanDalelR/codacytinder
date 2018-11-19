package com.appsflyer.p022a;

import android.content.Context;
import android.util.Log;
import java.io.File;

/* renamed from: com.appsflyer.a.a */
public class C0917a {
    /* renamed from: a */
    private static C0917a f2401a = new C0917a();

    /* renamed from: a */
    public static C0917a m3104a() {
        return f2401a;
    }

    private C0917a() {
    }

    /* renamed from: c */
    private File m3106c(Context context) {
        return new File(context.getFilesDir(), "AFRequestCache");
    }

    /* renamed from: a */
    public void m3107a(android.content.Context r2) {
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
        r1 = this;
        r0 = r1.m3106c(r2);	 Catch:{ Exception -> 0x0012 }
        r0 = r0.exists();	 Catch:{ Exception -> 0x0012 }
        if (r0 != 0) goto L_0x0011;	 Catch:{ Exception -> 0x0012 }
    L_0x000a:
        r2 = r1.m3106c(r2);	 Catch:{ Exception -> 0x0012 }
        r2.mkdir();	 Catch:{ Exception -> 0x0012 }
    L_0x0011:
        return;
    L_0x0012:
        r2 = "AppsFlyer_4.8.7";
        r0 = "Could not create cache directory";
        android.util.Log.i(r2, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.a.a.a(android.content.Context):void");
    }

    /* renamed from: a */
    public void m3108a(com.appsflyer.p022a.C0918b r5, android.content.Context r6) {
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
        r4 = this;
        r0 = 0;
        r1 = r4.m3106c(r6);	 Catch:{ Exception -> 0x008a }
        r2 = r1.exists();	 Catch:{ Exception -> 0x008a }
        if (r2 != 0) goto L_0x000f;	 Catch:{ Exception -> 0x008a }
    L_0x000b:
        r1.mkdir();	 Catch:{ Exception -> 0x008a }
        return;	 Catch:{ Exception -> 0x008a }
    L_0x000f:
        r1 = r1.listFiles();	 Catch:{ Exception -> 0x008a }
        if (r1 == 0) goto L_0x0022;	 Catch:{ Exception -> 0x008a }
    L_0x0015:
        r1 = r1.length;	 Catch:{ Exception -> 0x008a }
        r2 = 40;	 Catch:{ Exception -> 0x008a }
        if (r1 <= r2) goto L_0x0022;	 Catch:{ Exception -> 0x008a }
    L_0x001a:
        r5 = "AppsFlyer_4.8.7";	 Catch:{ Exception -> 0x008a }
        r6 = "reached cache limit, not caching request";	 Catch:{ Exception -> 0x008a }
        android.util.Log.i(r5, r6);	 Catch:{ Exception -> 0x008a }
        return;	 Catch:{ Exception -> 0x008a }
    L_0x0022:
        r1 = "AppsFlyer_4.8.7";	 Catch:{ Exception -> 0x008a }
        r2 = "caching request...";	 Catch:{ Exception -> 0x008a }
        android.util.Log.i(r1, r2);	 Catch:{ Exception -> 0x008a }
        r1 = new java.io.File;	 Catch:{ Exception -> 0x008a }
        r6 = r4.m3106c(r6);	 Catch:{ Exception -> 0x008a }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x008a }
        r2 = java.lang.Long.toString(r2);	 Catch:{ Exception -> 0x008a }
        r1.<init>(r6, r2);	 Catch:{ Exception -> 0x008a }
        r1.createNewFile();	 Catch:{ Exception -> 0x008a }
        r6 = new java.io.OutputStreamWriter;	 Catch:{ Exception -> 0x008a }
        r2 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x008a }
        r1 = r1.getPath();	 Catch:{ Exception -> 0x008a }
        r3 = 1;	 Catch:{ Exception -> 0x008a }
        r2.<init>(r1, r3);	 Catch:{ Exception -> 0x008a }
        r6.<init>(r2);	 Catch:{ Exception -> 0x008a }
        r0 = "version=";	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r6.write(r0);	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r0 = r5.m3111a();	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r6.write(r0);	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r0 = 10;	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r6.write(r0);	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r1 = "url=";	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r6.write(r1);	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r1 = r5.m3114c();	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r6.write(r1);	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r6.write(r0);	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r1 = "data=";	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r6.write(r1);	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r5 = r5.m3113b();	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r6.write(r5);	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r6.write(r0);	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r6.flush();	 Catch:{ Exception -> 0x0086, all -> 0x0083 }
        r6.close();	 Catch:{ IOException -> 0x0082 }
        return;
    L_0x0082:
        return;
    L_0x0083:
        r5 = move-exception;
        r0 = r6;
        goto L_0x0099;
    L_0x0086:
        r0 = r6;
        goto L_0x008a;
    L_0x0088:
        r5 = move-exception;
        goto L_0x0099;
    L_0x008a:
        r5 = "AppsFlyer_4.8.7";	 Catch:{ all -> 0x0088 }
        r6 = "Could not cache request";	 Catch:{ all -> 0x0088 }
        android.util.Log.i(r5, r6);	 Catch:{ all -> 0x0088 }
        if (r0 == 0) goto L_0x0098;
    L_0x0093:
        r0.close();	 Catch:{ IOException -> 0x0097 }
        goto L_0x0098;
    L_0x0097:
        return;
    L_0x0098:
        return;
    L_0x0099:
        if (r0 == 0) goto L_0x009e;
    L_0x009b:
        r0.close();	 Catch:{ IOException -> 0x009e }
    L_0x009e:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.a.a.a(com.appsflyer.a.b, android.content.Context):void");
    }

    /* renamed from: b */
    public java.util.List<com.appsflyer.p022a.C0918b> m3110b(android.content.Context r8) {
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
        r7 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r8 = r7.m3106c(r8);	 Catch:{ Exception -> 0x003e }
        r1 = r8.exists();	 Catch:{ Exception -> 0x003e }
        if (r1 != 0) goto L_0x0013;	 Catch:{ Exception -> 0x003e }
    L_0x000f:
        r8.mkdir();	 Catch:{ Exception -> 0x003e }
        goto L_0x0045;	 Catch:{ Exception -> 0x003e }
    L_0x0013:
        r8 = r8.listFiles();	 Catch:{ Exception -> 0x003e }
        r1 = r8.length;	 Catch:{ Exception -> 0x003e }
        r2 = 0;	 Catch:{ Exception -> 0x003e }
    L_0x0019:
        if (r2 >= r1) goto L_0x0045;	 Catch:{ Exception -> 0x003e }
    L_0x001b:
        r3 = r8[r2];	 Catch:{ Exception -> 0x003e }
        r4 = "AppsFlyer_4.8.7";	 Catch:{ Exception -> 0x003e }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x003e }
        r6 = "Found cached request";	 Catch:{ Exception -> 0x003e }
        r5.<init>(r6);	 Catch:{ Exception -> 0x003e }
        r6 = r3.getName();	 Catch:{ Exception -> 0x003e }
        r5.append(r6);	 Catch:{ Exception -> 0x003e }
        r5 = r5.toString();	 Catch:{ Exception -> 0x003e }
        android.util.Log.i(r4, r5);	 Catch:{ Exception -> 0x003e }
        r3 = r7.m3105a(r3);	 Catch:{ Exception -> 0x003e }
        r0.add(r3);	 Catch:{ Exception -> 0x003e }
        r2 = r2 + 1;
        goto L_0x0019;
    L_0x003e:
        r8 = "AppsFlyer_4.8.7";
        r1 = "Could not cache request";
        android.util.Log.i(r8, r1);
    L_0x0045:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.a.a.b(android.content.Context):java.util.List<com.appsflyer.a.b>");
    }

    /* renamed from: a */
    private com.appsflyer.p022a.C0918b m3105a(java.io.File r5) {
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
        r4 = this;
        r0 = 0;
        r1 = new java.io.FileReader;	 Catch:{ Exception -> 0x002a, all -> 0x0022 }
        r1.<init>(r5);	 Catch:{ Exception -> 0x002a, all -> 0x0022 }
        r2 = r5.length();	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r2 = (int) r2;	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r2 = new char[r2];	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r1.read(r2);	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r3 = new com.appsflyer.a.b;	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r3.<init>(r2);	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r5 = r5.getName();	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r3.m3112a(r5);	 Catch:{ Exception -> 0x002b, all -> 0x0020 }
        r1.close();	 Catch:{ IOException -> 0x001f }
    L_0x001f:
        return r3;
    L_0x0020:
        r5 = move-exception;
        goto L_0x0024;
    L_0x0022:
        r5 = move-exception;
        r1 = r0;
    L_0x0024:
        if (r1 == 0) goto L_0x0029;
    L_0x0026:
        r1.close();	 Catch:{ IOException -> 0x0029 }
    L_0x0029:
        throw r5;
    L_0x002a:
        r1 = r0;
    L_0x002b:
        if (r1 == 0) goto L_0x0030;
    L_0x002d:
        r1.close();	 Catch:{ IOException -> 0x0030 }
    L_0x0030:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.a.a.a(java.io.File):com.appsflyer.a.b");
    }

    /* renamed from: a */
    public void m3109a(String str, Context context) {
        File file = new File(m3106c(context), str);
        StringBuilder stringBuilder = new StringBuilder("Deleting ");
        stringBuilder.append(str);
        stringBuilder.append(" from cache");
        Log.i("AppsFlyer_4.8.7", stringBuilder.toString());
        if (file.exists() != null) {
            try {
                file.delete();
            } catch (Context context2) {
                stringBuilder = new StringBuilder("Could not delete ");
                stringBuilder.append(str);
                stringBuilder.append(" from cache");
                Log.i("AppsFlyer_4.8.7", stringBuilder.toString(), context2);
            }
        }
    }
}
