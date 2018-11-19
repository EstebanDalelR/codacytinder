package com.evernote.android.job;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.evernote.android.job.gcm.PlatformGcmService;
import com.evernote.android.job.util.C3142c;
import java.util.List;

/* renamed from: com.evernote.android.job.a */
final class C1130a {
    /* renamed from: a */
    private static final C3142c f2965a = new C3142c("GcmAvailableHelper");
    /* renamed from: b */
    private static final boolean f2966b;
    /* renamed from: c */
    private static int f2967c = -1;
    /* renamed from: d */
    private static boolean f2968d;

    static {
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
        r0 = new com.evernote.android.job.util.c;
        r1 = "GcmAvailableHelper";
        r0.<init>(r1);
        f2965a = r0;
        r0 = "com.google.android.gms.gcm.a";	 Catch:{ Throwable -> 0x0010 }
        java.lang.Class.forName(r0);	 Catch:{ Throwable -> 0x0010 }
        r0 = 1;
        goto L_0x0011;
    L_0x0010:
        r0 = 0;
    L_0x0011:
        f2966b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.a.<clinit>():void");
    }

    /* renamed from: a */
    public static boolean m3790a(android.content.Context r3) {
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
        r1 = f2968d;	 Catch:{ Throwable -> 0x0023 }
        r2 = 1;	 Catch:{ Throwable -> 0x0023 }
        if (r1 != 0) goto L_0x000d;	 Catch:{ Throwable -> 0x0023 }
    L_0x0006:
        f2968d = r2;	 Catch:{ Throwable -> 0x0023 }
        r1 = f2966b;	 Catch:{ Throwable -> 0x0023 }
        com.evernote.android.job.C1130a.m3789a(r3, r1);	 Catch:{ Throwable -> 0x0023 }
    L_0x000d:
        r1 = f2966b;	 Catch:{ Throwable -> 0x0023 }
        if (r1 == 0) goto L_0x0022;	 Catch:{ Throwable -> 0x0023 }
    L_0x0011:
        r1 = com.google.android.gms.common.C3813b.m14425a();	 Catch:{ Throwable -> 0x0023 }
        r1 = r1.mo2566a(r3);	 Catch:{ Throwable -> 0x0023 }
        if (r1 != 0) goto L_0x0022;	 Catch:{ Throwable -> 0x0023 }
    L_0x001b:
        r3 = com.evernote.android.job.C1130a.m3792b(r3);	 Catch:{ Throwable -> 0x0023 }
        if (r3 != 0) goto L_0x0022;
    L_0x0021:
        r0 = 1;
    L_0x0022:
        return r0;
    L_0x0023:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.a.a(android.content.Context):boolean");
    }

    /* renamed from: b */
    private static int m3792b(Context context) {
        if (f2967c < 0) {
            synchronized (JobApi.class) {
                if (f2967c < 0) {
                    if (C1130a.m3791a(context.getPackageManager().queryIntentServices(new Intent(context, PlatformGcmService.class), 0))) {
                        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY");
                        intent.setPackage(context.getPackageName());
                        if (C1130a.m3791a(context.getPackageManager().queryIntentServices(intent, 0)) == null) {
                            f2967c = 1;
                            context = f2967c;
                            return context;
                        }
                        f2967c = 0;
                    } else {
                        f2967c = 1;
                        context = f2967c;
                        return context;
                    }
                }
            }
        }
        return f2967c;
    }

    /* renamed from: a */
    private static boolean m3791a(List<ResolveInfo> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                for (ResolveInfo resolveInfo : list) {
                    if (resolveInfo.serviceInfo != null && "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE".equals(resolveInfo.serviceInfo.permission) && resolveInfo.serviceInfo.exported) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m3789a(android.content.Context r3, boolean r4) {
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
        r0 = r3.getPackageManager();	 Catch:{ Throwable -> 0x0047 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0047 }
        r1.<init>();	 Catch:{ Throwable -> 0x0047 }
        r2 = com.evernote.android.job.gcm.C3140a.class;	 Catch:{ Throwable -> 0x0047 }
        r2 = r2.getPackage();	 Catch:{ Throwable -> 0x0047 }
        r2 = r2.getName();	 Catch:{ Throwable -> 0x0047 }
        r1.append(r2);	 Catch:{ Throwable -> 0x0047 }
        r2 = ".PlatformGcmService";	 Catch:{ Throwable -> 0x0047 }
        r1.append(r2);	 Catch:{ Throwable -> 0x0047 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x0047 }
        r2 = new android.content.ComponentName;	 Catch:{ Throwable -> 0x0047 }
        r2.<init>(r3, r1);	 Catch:{ Throwable -> 0x0047 }
        r3 = r0.getComponentEnabledSetting(r2);	 Catch:{ Throwable -> 0x0047 }
        r1 = 1;	 Catch:{ Throwable -> 0x0047 }
        switch(r3) {
            case 0: goto L_0x003b;
            case 1: goto L_0x002d;
            case 2: goto L_0x003b;
            default: goto L_0x002c;
        };	 Catch:{ Throwable -> 0x0047 }
    L_0x002c:
        goto L_0x0047;	 Catch:{ Throwable -> 0x0047 }
    L_0x002d:
        if (r4 != 0) goto L_0x0047;	 Catch:{ Throwable -> 0x0047 }
    L_0x002f:
        r3 = 2;	 Catch:{ Throwable -> 0x0047 }
        r0.setComponentEnabledSetting(r2, r3, r1);	 Catch:{ Throwable -> 0x0047 }
        r3 = f2965a;	 Catch:{ Throwable -> 0x0047 }
        r4 = "GCM service disabled";	 Catch:{ Throwable -> 0x0047 }
        r3.m12115a(r4);	 Catch:{ Throwable -> 0x0047 }
        goto L_0x0047;	 Catch:{ Throwable -> 0x0047 }
    L_0x003b:
        if (r4 == 0) goto L_0x0047;	 Catch:{ Throwable -> 0x0047 }
    L_0x003d:
        r0.setComponentEnabledSetting(r2, r1, r1);	 Catch:{ Throwable -> 0x0047 }
        r3 = f2965a;	 Catch:{ Throwable -> 0x0047 }
        r4 = "GCM service enabled";	 Catch:{ Throwable -> 0x0047 }
        r3.m12115a(r4);	 Catch:{ Throwable -> 0x0047 }
    L_0x0047:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.a.a(android.content.Context, boolean):void");
    }
}
