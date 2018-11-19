package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.util.C2529n;
import com.google.android.gms.internal.pl;
import com.tinder.api.ManagerWebServices;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.p */
public class C2513p {
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 11910000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    private static boolean zzflj = false;
    private static boolean zzflk = false;
    private static boolean zzfll = false;
    private static boolean zzflm = false;
    static final AtomicBoolean zzfln = new AtomicBoolean();
    private static final AtomicBoolean zzflo = new AtomicBoolean();

    C2513p() {
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C2490g.m9021b().mo2567a(context, i, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return ConnectionResult.getStatusString(i);
    }

    public static android.content.Context getRemoteContext(android.content.Context r2) {
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
        r0 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0008 }
        r1 = 3;	 Catch:{ NameNotFoundException -> 0x0008 }
        r2 = r2.createPackageContext(r0, r1);	 Catch:{ NameNotFoundException -> 0x0008 }
        return r2;
    L_0x0008:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.p.getRemoteContext(android.content.Context):android.content.Context");
    }

    public static android.content.res.Resources getRemoteResource(android.content.Context r1) {
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
        r1 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x000b }
        r0 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x000b }
        r1 = r1.getResourcesForApplication(r0);	 Catch:{ NameNotFoundException -> 0x000b }
        return r1;
    L_0x000b:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.p.getRemoteResource(android.content.Context):android.content.res.Resources");
    }

    @java.lang.Deprecated
    public static int isGooglePlayServicesAvailable(android.content.Context r8) {
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
        r0 = r8.getPackageManager();
        r1 = r8.getResources();	 Catch:{ Throwable -> 0x000e }
        r2 = com.google.android.gms.C2335R.string.common_google_play_services_unknown_issue;	 Catch:{ Throwable -> 0x000e }
        r1.getString(r2);	 Catch:{ Throwable -> 0x000e }
        goto L_0x0015;
    L_0x000e:
        r1 = "GooglePlayServicesUtil";
        r2 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.";
        android.util.Log.e(r1, r2);
    L_0x0015:
        r1 = "com.google.android.gms";
        r2 = r8.getPackageName();
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0075;
    L_0x0021:
        r1 = zzflo;
        r1 = r1.get();
        if (r1 != 0) goto L_0x0075;
    L_0x0029:
        r1 = com.google.android.gms.common.internal.C2506v.m9170a(r8);
        if (r1 != 0) goto L_0x0037;
    L_0x002f:
        r8 = new java.lang.IllegalStateException;
        r0 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />";
        r8.<init>(r0);
        throw r8;
    L_0x0037:
        r2 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        if (r1 == r2) goto L_0x0075;
    L_0x003b:
        r8 = new java.lang.IllegalStateException;
        r0 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        r2 = "com.google.android.gms.version";
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 290;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ";
        r4.append(r3);
        r4.append(r0);
        r0 = " but found ";
        r4.append(r0);
        r4.append(r1);
        r0 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"";
        r4.append(r0);
        r4.append(r2);
        r0 = "\" android:value=\"@integer/google_play_services_version\" />";
        r4.append(r0);
        r0 = r4.toString();
        r8.<init>(r0);
        throw r8;
    L_0x0075:
        r1 = com.google.android.gms.common.util.C2521f.m9200b(r8);
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x0085;
    L_0x007d:
        r1 = com.google.android.gms.common.util.C2521f.m9202d(r8);
        if (r1 != 0) goto L_0x0085;
    L_0x0083:
        r1 = 1;
        goto L_0x0086;
    L_0x0085:
        r1 = 0;
    L_0x0086:
        r4 = 0;
        r5 = 9;
        if (r1 == 0) goto L_0x009c;
    L_0x008b:
        r4 = "com.android.vending";	 Catch:{ NameNotFoundException -> 0x0094 }
        r6 = 8256; // 0x2040 float:1.1569E-41 double:4.079E-320;	 Catch:{ NameNotFoundException -> 0x0094 }
        r4 = r0.getPackageInfo(r4, r6);	 Catch:{ NameNotFoundException -> 0x0094 }
        goto L_0x009c;
    L_0x0094:
        r8 = "GooglePlayServicesUtil";
        r0 = "Google Play Store is missing.";
    L_0x0098:
        android.util.Log.w(r8, r0);
        return r5;
    L_0x009c:
        r6 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0119 }
        r7 = 64;	 Catch:{ NameNotFoundException -> 0x0119 }
        r6 = r0.getPackageInfo(r6, r7);	 Catch:{ NameNotFoundException -> 0x0119 }
        com.google.android.gms.common.C2514q.m9178a(r8);
        if (r1 == 0) goto L_0x00c5;
    L_0x00a9:
        r8 = com.google.android.gms.common.C2511l.f7668a;
        r8 = com.google.android.gms.common.C2514q.m9177a(r4, r8);
        if (r8 != 0) goto L_0x00b6;
    L_0x00b1:
        r8 = "GooglePlayServicesUtil";
        r0 = "Google Play Store signature invalid.";
        goto L_0x0098;
    L_0x00b6:
        r1 = new com.google.android.gms.common.C4293i[r3];
        r1[r2] = r8;
        r8 = com.google.android.gms.common.C2514q.m9177a(r6, r1);
        if (r8 != 0) goto L_0x00ce;
    L_0x00c0:
        r8 = "GooglePlayServicesUtil";
        r0 = "Google Play services signature invalid.";
        goto L_0x0098;
    L_0x00c5:
        r8 = com.google.android.gms.common.C2511l.f7668a;
        r8 = com.google.android.gms.common.C2514q.m9177a(r6, r8);
        if (r8 != 0) goto L_0x00ce;
    L_0x00cd:
        goto L_0x00c0;
    L_0x00ce:
        r8 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        r8 = r8 / 1000;
        r1 = r6.versionCode;
        r1 = r1 / 1000;
        if (r1 >= r8) goto L_0x00fe;
    L_0x00d8:
        r8 = "GooglePlayServicesUtil";
        r0 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        r1 = r6.versionCode;
        r2 = 77;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Google Play services out of date.  Requires ";
        r3.append(r2);
        r3.append(r0);
        r0 = " but found ";
        r3.append(r0);
        r3.append(r1);
        r0 = r3.toString();
        android.util.Log.w(r8, r0);
        r8 = 2;
        return r8;
    L_0x00fe:
        r8 = r6.applicationInfo;
        if (r8 != 0) goto L_0x0112;
    L_0x0102:
        r8 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0109 }
        r8 = r0.getApplicationInfo(r8, r2);	 Catch:{ NameNotFoundException -> 0x0109 }
        goto L_0x0112;
    L_0x0109:
        r8 = move-exception;
        r0 = "GooglePlayServicesUtil";
        r1 = "Google Play services missing when getting application info.";
        android.util.Log.wtf(r0, r1, r8);
        return r3;
    L_0x0112:
        r8 = r8.enabled;
        if (r8 != 0) goto L_0x0118;
    L_0x0116:
        r8 = 3;
        return r8;
    L_0x0118:
        return r2;
    L_0x0119:
        r8 = "GooglePlayServicesUtil";
        r0 = "Google Play services is missing.";
        android.util.Log.w(r8, r0);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.p.isGooglePlayServicesAvailable(android.content.Context):int");
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        if (i != 9) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean zzb(Context context, int i, String str) {
        return C2529n.m9223a(context, i, str);
    }

    @Deprecated
    public static void zzbp(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int a = C2490g.m9021b().mo2566a(context);
        if (a != 0) {
            C2490g.m9021b();
            Intent a2 = C2490g.m9019a(context, a, "e");
            StringBuilder stringBuilder = new StringBuilder(57);
            stringBuilder.append("GooglePlayServices not available due to error ");
            stringBuilder.append(a);
            Log.e("GooglePlayServicesUtil", stringBuilder.toString());
            if (a2 == null) {
                throw new GooglePlayServicesNotAvailableException(a);
            }
            throw new GooglePlayServicesRepairableException(a, "Google Play Services not available", a2);
        }
    }

    @java.lang.Deprecated
    public static void zzce(android.content.Context r2) {
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
        r0 = zzfln;
        r1 = 1;
        r0 = r0.getAndSet(r1);
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        r0 = "notification";	 Catch:{ SecurityException -> 0x0019 }
        r2 = r2.getSystemService(r0);	 Catch:{ SecurityException -> 0x0019 }
        r2 = (android.app.NotificationManager) r2;	 Catch:{ SecurityException -> 0x0019 }
        if (r2 == 0) goto L_0x0019;	 Catch:{ SecurityException -> 0x0019 }
    L_0x0014:
        r0 = 10436; // 0x28c4 float:1.4624E-41 double:5.156E-320;	 Catch:{ SecurityException -> 0x0019 }
        r2.cancel(r0);	 Catch:{ SecurityException -> 0x0019 }
    L_0x0019:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.p.zzce(android.content.Context):void");
    }

    @java.lang.Deprecated
    public static int zzcf(android.content.Context r2) {
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
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x000e }
        r1 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x000e }
        r2 = r2.getPackageInfo(r1, r0);	 Catch:{ NameNotFoundException -> 0x000e }
        r2 = r2.versionCode;
        return r2;
    L_0x000e:
        r2 = "GooglePlayServicesUtil";
        r1 = "Google Play services is missing.";
        android.util.Log.w(r2, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.p.zzcf(android.content.Context):int");
    }

    public static boolean zzch(Context context) {
        if (!zzflm) {
            try {
                PackageInfo b = pl.a(context).b("com.google.android.gms", 64);
                if (b != null) {
                    C2514q.m9178a(context);
                    if (C2514q.m9177a(b, C2511l.f7668a[1]) != null) {
                        zzfll = true;
                        zzflm = true;
                    }
                }
                zzfll = false;
            } catch (Throwable e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } catch (Throwable th) {
                zzflm = true;
            }
            zzflm = true;
        }
        return zzfll || !ManagerWebServices.PARAM_USER.equals(Build.TYPE);
    }

    @Deprecated
    public static boolean zze(Context context, int i) {
        return i == 18 ? true : i == 1 ? C2513p.zzv(context, "com.google.android.gms") : false;
    }

    @Deprecated
    public static boolean zzf(Context context, int i) {
        return C2529n.m9222a(context, i);
    }

    @android.annotation.TargetApi(21)
    static boolean zzv(android.content.Context r5, java.lang.String r6) {
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
        r0 = "com.google.android.gms";
        r0 = r6.equals(r0);
        r1 = com.google.android.gms.common.util.C2526k.m9216g();
        r2 = 1;
        r3 = 0;
        if (r1 == 0) goto L_0x0036;
    L_0x000e:
        r1 = r5.getPackageManager();	 Catch:{ Exception -> 0x0035 }
        r1 = r1.getPackageInstaller();	 Catch:{ Exception -> 0x0035 }
        r1 = r1.getAllSessions();	 Catch:{ Exception -> 0x0035 }
        r1 = r1.iterator();
    L_0x001e:
        r4 = r1.hasNext();
        if (r4 == 0) goto L_0x0036;
    L_0x0024:
        r4 = r1.next();
        r4 = (android.content.pm.PackageInstaller.SessionInfo) r4;
        r4 = r4.getAppPackageName();
        r4 = r6.equals(r4);
        if (r4 == 0) goto L_0x001e;
    L_0x0034:
        return r2;
    L_0x0035:
        return r3;
    L_0x0036:
        r1 = r5.getPackageManager();
        r4 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r6 = r1.getApplicationInfo(r6, r4);	 Catch:{ NameNotFoundException -> 0x0075 }
        if (r0 == 0) goto L_0x0045;	 Catch:{ NameNotFoundException -> 0x0075 }
    L_0x0042:
        r5 = r6.enabled;	 Catch:{ NameNotFoundException -> 0x0075 }
        return r5;	 Catch:{ NameNotFoundException -> 0x0075 }
    L_0x0045:
        r6 = r6.enabled;	 Catch:{ NameNotFoundException -> 0x0075 }
        if (r6 == 0) goto L_0x0075;	 Catch:{ NameNotFoundException -> 0x0075 }
    L_0x0049:
        r6 = com.google.android.gms.common.util.C2526k.m9213d();	 Catch:{ NameNotFoundException -> 0x0075 }
        if (r6 == 0) goto L_0x0071;	 Catch:{ NameNotFoundException -> 0x0075 }
    L_0x004f:
        r6 = "user";	 Catch:{ NameNotFoundException -> 0x0075 }
        r6 = r5.getSystemService(r6);	 Catch:{ NameNotFoundException -> 0x0075 }
        r6 = (android.os.UserManager) r6;	 Catch:{ NameNotFoundException -> 0x0075 }
        r5 = r5.getPackageName();	 Catch:{ NameNotFoundException -> 0x0075 }
        r5 = r6.getApplicationRestrictions(r5);	 Catch:{ NameNotFoundException -> 0x0075 }
        if (r5 == 0) goto L_0x0071;	 Catch:{ NameNotFoundException -> 0x0075 }
    L_0x0061:
        r6 = "true";	 Catch:{ NameNotFoundException -> 0x0075 }
        r0 = "restricted_profile";	 Catch:{ NameNotFoundException -> 0x0075 }
        r5 = r5.getString(r0);	 Catch:{ NameNotFoundException -> 0x0075 }
        r5 = r6.equals(r5);	 Catch:{ NameNotFoundException -> 0x0075 }
        if (r5 == 0) goto L_0x0071;
    L_0x006f:
        r5 = 1;
        goto L_0x0072;
    L_0x0071:
        r5 = 0;
    L_0x0072:
        if (r5 != 0) goto L_0x0075;
    L_0x0074:
        return r2;
    L_0x0075:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.p.zzv(android.content.Context, java.lang.String):boolean");
    }
}
