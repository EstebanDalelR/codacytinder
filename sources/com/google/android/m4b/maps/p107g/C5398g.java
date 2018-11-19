package com.google.android.m4b.maps.p107g;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.p110j.C5439e;
import com.google.android.m4b.maps.p110j.C5442g;
import com.google.android.m4b.maps.p110j.C5443h;
import com.google.android.m4b.maps.p110j.C5454o;
import com.google.android.m4b.maps.p113m.C5475a;
import com.google.android.m4b.maps.p113m.C5479f;
import com.tinder.api.ManagerWebServices;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.m4b.maps.g.g */
public final class C5398g {
    @Deprecated
    /* renamed from: a */
    public static final int f20336a = C5439e.f20392b;
    /* renamed from: b */
    private static boolean f20337b = false;
    /* renamed from: c */
    private static boolean f20338c = false;
    /* renamed from: d */
    private static int f20339d = -1;
    /* renamed from: e */
    private static final Object f20340e = new Object();
    /* renamed from: f */
    private static String f20341f;
    /* renamed from: g */
    private static Integer f20342g;
    /* renamed from: h */
    private static AtomicBoolean f20343h = new AtomicBoolean();

    @Deprecated
    /* renamed from: b */
    public static boolean m23584b(int i) {
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

    @java.lang.Deprecated
    /* renamed from: a */
    public static int m23576a(android.content.Context r7) {
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
        r0 = com.google.android.m4b.maps.p110j.C5439e.f20393c;
        r1 = 0;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r7.getPackageManager();
        r2 = r7.getResources();	 Catch:{ Throwable -> 0x0014 }
        r3 = com.google.android.m4b.maps.C4513R.string.common_google_play_services_unknown_issue;	 Catch:{ Throwable -> 0x0014 }
        r2.getString(r3);	 Catch:{ Throwable -> 0x0014 }
        goto L_0x001b;
    L_0x0014:
        r2 = "GooglePlayServicesUtil";
        r3 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.";
        android.util.Log.e(r2, r3);
    L_0x001b:
        r2 = "com.google.android.gms";
        r3 = r7.getPackageName();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x012f;
    L_0x0027:
        r2 = f20340e;
        monitor-enter(r2);
        r3 = f20341f;	 Catch:{ all -> 0x012c }
        if (r3 != 0) goto L_0x0060;	 Catch:{ all -> 0x012c }
    L_0x002e:
        r3 = r7.getPackageName();	 Catch:{ all -> 0x012c }
        f20341f = r3;	 Catch:{ all -> 0x012c }
        r3 = r7.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0057 }
        r4 = r7.getPackageName();	 Catch:{ NameNotFoundException -> 0x0057 }
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0057 }
        r3 = r3.getApplicationInfo(r4, r5);	 Catch:{ NameNotFoundException -> 0x0057 }
        r3 = r3.metaData;	 Catch:{ NameNotFoundException -> 0x0057 }
        if (r3 == 0) goto L_0x0053;	 Catch:{ NameNotFoundException -> 0x0057 }
    L_0x0046:
        r4 = "com.google.android.gms.version";	 Catch:{ NameNotFoundException -> 0x0057 }
        r3 = r3.getInt(r4);	 Catch:{ NameNotFoundException -> 0x0057 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NameNotFoundException -> 0x0057 }
        f20342g = r3;	 Catch:{ NameNotFoundException -> 0x0057 }
        goto L_0x00ba;	 Catch:{ NameNotFoundException -> 0x0057 }
    L_0x0053:
        r3 = 0;	 Catch:{ NameNotFoundException -> 0x0057 }
        f20342g = r3;	 Catch:{ NameNotFoundException -> 0x0057 }
        goto L_0x00ba;
    L_0x0057:
        r3 = move-exception;
        r4 = "GooglePlayServicesUtil";	 Catch:{ all -> 0x012c }
        r5 = "This should never happen.";	 Catch:{ all -> 0x012c }
        android.util.Log.wtf(r4, r5, r3);	 Catch:{ all -> 0x012c }
        goto L_0x00ba;	 Catch:{ all -> 0x012c }
    L_0x0060:
        r3 = f20341f;	 Catch:{ all -> 0x012c }
        r4 = r7.getPackageName();	 Catch:{ all -> 0x012c }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x012c }
        if (r3 != 0) goto L_0x00ba;	 Catch:{ all -> 0x012c }
    L_0x006c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x012c }
        r1 = "isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '";	 Catch:{ all -> 0x012c }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x012c }
        r3 = f20341f;	 Catch:{ all -> 0x012c }
        r7 = r7.getPackageName();	 Catch:{ all -> 0x012c }
        r7 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x012c }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012c }
        r5 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x012c }
        r5 = r5.length();	 Catch:{ all -> 0x012c }
        r5 = r5 + 32;	 Catch:{ all -> 0x012c }
        r6 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x012c }
        r6 = r6.length();	 Catch:{ all -> 0x012c }
        r5 = r5 + r6;	 Catch:{ all -> 0x012c }
        r6 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x012c }
        r6 = r6.length();	 Catch:{ all -> 0x012c }
        r5 = r5 + r6;	 Catch:{ all -> 0x012c }
        r4.<init>(r5);	 Catch:{ all -> 0x012c }
        r4.append(r1);	 Catch:{ all -> 0x012c }
        r4.append(r3);	 Catch:{ all -> 0x012c }
        r1 = "' and this call used package '";	 Catch:{ all -> 0x012c }
        r4.append(r1);	 Catch:{ all -> 0x012c }
        r4.append(r7);	 Catch:{ all -> 0x012c }
        r7 = "'.";	 Catch:{ all -> 0x012c }
        r4.append(r7);	 Catch:{ all -> 0x012c }
        r7 = r4.toString();	 Catch:{ all -> 0x012c }
        r0.<init>(r7);	 Catch:{ all -> 0x012c }
        throw r0;	 Catch:{ all -> 0x012c }
    L_0x00ba:
        r3 = f20342g;	 Catch:{ all -> 0x012c }
        monitor-exit(r2);	 Catch:{ all -> 0x012c }
        if (r3 != 0) goto L_0x00c7;
    L_0x00bf:
        r7 = new java.lang.IllegalStateException;
        r0 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />";
        r7.<init>(r0);
        throw r7;
    L_0x00c7:
        r2 = r3.intValue();
        r4 = f20336a;
        if (r2 == r4) goto L_0x012f;
    L_0x00cf:
        r7 = new java.lang.IllegalStateException;
        r0 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ";
        r0 = java.lang.String.valueOf(r0);
        r1 = f20336a;
        r2 = java.lang.String.valueOf(r3);
        r3 = "com.google.android.gms.version";
        r3 = java.lang.String.valueOf(r3);
        r4 = new java.lang.StringBuilder;
        r5 = java.lang.String.valueOf(r0);
        r5 = r5.length();
        r5 = r5 + 186;
        r6 = java.lang.String.valueOf(r2);
        r6 = r6.length();
        r5 = r5 + r6;
        r6 = java.lang.String.valueOf(r3);
        r6 = r6.length();
        r5 = r5 + r6;
        r4.<init>(r5);
        r4.append(r0);
        r4.append(r1);
        r0 = " but found ";
        r4.append(r0);
        r4.append(r2);
        r0 = ".  You must have the following declaration within the <application> element: ";
        r4.append(r0);
        r0 = "    <meta-data android:name=\"";
        r4.append(r0);
        r4.append(r3);
        r0 = "\" android:value=\"@integer/google_play_services_version\" />";
        r4.append(r0);
        r0 = r4.toString();
        r7.<init>(r0);
        throw r7;
    L_0x012c:
        r7 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x012c }
        throw r7;
    L_0x012f:
        r2 = 1;
        r3 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x01fd }
        r4 = 64;	 Catch:{ NameNotFoundException -> 0x01fd }
        r3 = r0.getPackageInfo(r3, r4);	 Catch:{ NameNotFoundException -> 0x01fd }
        com.google.android.m4b.maps.p107g.C5399h.m23591a();
        r5 = r3.versionCode;
        r5 = com.google.android.m4b.maps.p113m.C5475a.m23831b(r5);
        r6 = 9;
        if (r5 != 0) goto L_0x019b;
    L_0x0145:
        r5 = com.google.android.m4b.maps.p113m.C5475a.m23830a(r7);
        if (r5 == 0) goto L_0x014c;
    L_0x014b:
        goto L_0x019b;
    L_0x014c:
        r5 = "com.android.vending";	 Catch:{ NameNotFoundException -> 0x0174 }
        r4 = r0.getPackageInfo(r5, r4);	 Catch:{ NameNotFoundException -> 0x0174 }
        r5 = com.google.android.m4b.maps.p107g.C5396e.bk.f20290a;	 Catch:{ NameNotFoundException -> 0x0174 }
        r4 = com.google.android.m4b.maps.p107g.C5399h.m23590a(r4, r5);	 Catch:{ NameNotFoundException -> 0x0174 }
        if (r4 != 0) goto L_0x0162;	 Catch:{ NameNotFoundException -> 0x0174 }
    L_0x015a:
        r4 = "GooglePlayServicesUtil";	 Catch:{ NameNotFoundException -> 0x0174 }
        r5 = "Google Play Store signature invalid.";	 Catch:{ NameNotFoundException -> 0x0174 }
        android.util.Log.w(r4, r5);	 Catch:{ NameNotFoundException -> 0x0174 }
        return r6;	 Catch:{ NameNotFoundException -> 0x0174 }
    L_0x0162:
        r5 = new com.google.android.m4b.maps.p107g.C5396e.C5372a[r2];	 Catch:{ NameNotFoundException -> 0x0174 }
        r5[r1] = r4;	 Catch:{ NameNotFoundException -> 0x0174 }
        r4 = com.google.android.m4b.maps.p107g.C5399h.m23590a(r3, r5);	 Catch:{ NameNotFoundException -> 0x0174 }
        if (r4 != 0) goto L_0x01ab;	 Catch:{ NameNotFoundException -> 0x0174 }
    L_0x016c:
        r4 = "GooglePlayServicesUtil";	 Catch:{ NameNotFoundException -> 0x0174 }
        r5 = "Google Play services signature invalid.";	 Catch:{ NameNotFoundException -> 0x0174 }
        android.util.Log.w(r4, r5);	 Catch:{ NameNotFoundException -> 0x0174 }
        return r6;
    L_0x0174:
        r4 = "com.android.vending";
        r7 = com.google.android.m4b.maps.p107g.C5398g.m23581a(r7, r4);
        if (r7 == 0) goto L_0x0193;
    L_0x017c:
        r7 = "GooglePlayServicesUtil";
        r4 = "Google Play Store is updating.";
        android.util.Log.w(r7, r4);
        r7 = com.google.android.m4b.maps.p107g.C5396e.bk.f20290a;
        r7 = com.google.android.m4b.maps.p107g.C5399h.m23590a(r3, r7);
        if (r7 != 0) goto L_0x01ab;
    L_0x018b:
        r7 = "GooglePlayServicesUtil";
        r0 = "Google Play services signature invalid.";
        android.util.Log.w(r7, r0);
        return r6;
    L_0x0193:
        r7 = "GooglePlayServicesUtil";
        r0 = "Google Play Store is neither installed nor updating.";
        android.util.Log.w(r7, r0);
        return r6;
    L_0x019b:
        r7 = com.google.android.m4b.maps.p107g.C5396e.bk.f20290a;
        r7 = com.google.android.m4b.maps.p107g.C5399h.m23590a(r3, r7);
        if (r7 != 0) goto L_0x01ab;
    L_0x01a3:
        r7 = "GooglePlayServicesUtil";
        r0 = "Google Play services signature invalid.";
        android.util.Log.w(r7, r0);
        return r6;
    L_0x01ab:
        r7 = f20336a;
        r7 = com.google.android.m4b.maps.p113m.C5475a.m23829a(r7);
        r4 = r3.versionCode;
        r4 = com.google.android.m4b.maps.p113m.C5475a.m23829a(r4);
        if (r4 >= r7) goto L_0x01df;
    L_0x01b9:
        r7 = "GooglePlayServicesUtil";
        r0 = f20336a;
        r1 = r3.versionCode;
        r2 = new java.lang.StringBuilder;
        r3 = 77;
        r2.<init>(r3);
        r3 = "Google Play services out of date.  Requires ";
        r2.append(r3);
        r2.append(r0);
        r0 = " but found ";
        r2.append(r0);
        r2.append(r1);
        r0 = r2.toString();
        android.util.Log.w(r7, r0);
        r7 = 2;
        return r7;
    L_0x01df:
        r7 = r3.applicationInfo;
        if (r7 != 0) goto L_0x01f6;
    L_0x01e3:
        r7 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x01ea }
        r7 = r0.getApplicationInfo(r7, r1);	 Catch:{ NameNotFoundException -> 0x01ea }
        goto L_0x01f6;
    L_0x01ea:
        r7 = move-exception;
        r0 = "GooglePlayServicesUtil";
        r1 = "Google Play services missing when getting application info.";
        android.util.Log.wtf(r0, r1);
        r7.printStackTrace();
        return r2;
    L_0x01f6:
        r7 = r7.enabled;
        if (r7 != 0) goto L_0x01fc;
    L_0x01fa:
        r7 = 3;
        return r7;
    L_0x01fc:
        return r1;
    L_0x01fd:
        r7 = "GooglePlayServicesUtil";
        r0 = "Google Play services is missing.";
        android.util.Log.w(r7, r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.g.g.a(android.content.Context):int");
    }

    /* renamed from: a */
    public static boolean m23579a(Context context, int i) {
        if (C5398g.m23580a(context, i, "com.google.android.gms") != 0) {
            if (C5399h.m23591a().m23593a(context.getPackageManager(), "com.google.android.gms") != null) {
                return true;
            }
        }
        return null;
    }

    @android.annotation.TargetApi(19)
    /* renamed from: a */
    private static boolean m23580a(android.content.Context r3, int r4, java.lang.String r5) {
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
        r0 = com.google.android.m4b.maps.p113m.C5479f.m23839d();
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0015;
    L_0x0008:
        r0 = "appops";
        r3 = r3.getSystemService(r0);
        r3 = (android.app.AppOpsManager) r3;
        r3.checkPackage(r4, r5);	 Catch:{ SecurityException -> 0x0014 }
        return r2;
    L_0x0014:
        return r1;
    L_0x0015:
        r3 = r3.getPackageManager();
        r3 = r3.getPackagesForUid(r4);
        if (r3 == 0) goto L_0x002f;
    L_0x001f:
        r4 = 0;
    L_0x0020:
        r0 = r3.length;
        if (r4 >= r0) goto L_0x002f;
    L_0x0023:
        r0 = r3[r4];
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x002c;
    L_0x002b:
        return r2;
    L_0x002c:
        r4 = r4 + 1;
        goto L_0x0020;
    L_0x002f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.g.g.a(android.content.Context, int, java.lang.String):boolean");
    }

    @Deprecated
    /* renamed from: a */
    public static Intent m23577a(int i) {
        if (i == 42) {
            return C5454o.m23712a();
        }
        switch (i) {
            case 1:
            case 2:
                return C5454o.m23714b("com.google.android.gms");
            case 3:
                return C5454o.m23713a("com.google.android.gms");
            default:
                return 0;
        }
    }

    /* renamed from: b */
    private static boolean m23586b(android.content.pm.PackageManager r5) {
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
        r0 = f20340e;
        monitor-enter(r0);
        r1 = f20339d;	 Catch:{ all -> 0x0032 }
        r2 = -1;
        r3 = 0;
        r4 = 1;
        if (r1 != r2) goto L_0x002b;
    L_0x000a:
        r1 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0029 }
        r2 = 64;	 Catch:{ NameNotFoundException -> 0x0029 }
        r5 = r5.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x0029 }
        com.google.android.m4b.maps.p107g.C5399h.m23591a();	 Catch:{ NameNotFoundException -> 0x0029 }
        r1 = new com.google.android.m4b.maps.p107g.C5396e.C5372a[r4];	 Catch:{ NameNotFoundException -> 0x0029 }
        r2 = com.google.android.m4b.maps.p107g.C5396e.f20331a;	 Catch:{ NameNotFoundException -> 0x0029 }
        r2 = r2[r4];	 Catch:{ NameNotFoundException -> 0x0029 }
        r1[r3] = r2;	 Catch:{ NameNotFoundException -> 0x0029 }
        r5 = com.google.android.m4b.maps.p107g.C5399h.m23590a(r5, r1);	 Catch:{ NameNotFoundException -> 0x0029 }
        if (r5 == 0) goto L_0x0026;	 Catch:{ NameNotFoundException -> 0x0029 }
    L_0x0023:
        f20339d = r4;	 Catch:{ NameNotFoundException -> 0x0029 }
        goto L_0x002b;	 Catch:{ NameNotFoundException -> 0x0029 }
    L_0x0026:
        f20339d = r3;	 Catch:{ NameNotFoundException -> 0x0029 }
        goto L_0x002b;
    L_0x0029:
        f20339d = r3;	 Catch:{ all -> 0x0032 }
    L_0x002b:
        r5 = f20339d;	 Catch:{ all -> 0x0032 }
        if (r5 == 0) goto L_0x0030;	 Catch:{ all -> 0x0032 }
    L_0x002f:
        r3 = 1;	 Catch:{ all -> 0x0032 }
    L_0x0030:
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        return r3;	 Catch:{ all -> 0x0032 }
    L_0x0032:
        r5 = move-exception;	 Catch:{ all -> 0x0032 }
        monitor-exit(r0);	 Catch:{ all -> 0x0032 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.g.g.b(android.content.pm.PackageManager):boolean");
    }

    /* renamed from: a */
    public static boolean m23582a(PackageManager packageManager) {
        if (C5398g.m23586b(packageManager) == null) {
            if (ManagerWebServices.PARAM_USER.equals(Build.TYPE) != null) {
                return null;
            }
        }
        return true;
    }

    @java.lang.Deprecated
    /* renamed from: b */
    public static void m23583b(android.content.Context r2) {
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
        r0 = f20343h;
        r1 = 1;
        r0 = r0.getAndSet(r1);
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        r0 = "notification";	 Catch:{ SecurityException -> 0x0018 }
        r2 = r2.getSystemService(r0);	 Catch:{ SecurityException -> 0x0018 }
        r2 = (android.app.NotificationManager) r2;	 Catch:{ SecurityException -> 0x0018 }
        r0 = 10436; // 0x28c4 float:1.4624E-41 double:5.156E-320;	 Catch:{ SecurityException -> 0x0018 }
        r2.cancel(r0);	 Catch:{ SecurityException -> 0x0018 }
        return;
    L_0x0018:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.g.g.b(android.content.Context):void");
    }

    /* renamed from: c */
    public static java.lang.String m23587c(android.content.Context r3) {
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
        r0 = r3.getApplicationInfo();
        r0 = r0.name;
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x002d;
    L_0x000c:
        r0 = r3.getPackageName();
        r1 = r3.getApplicationContext();
        r1 = r1.getPackageManager();
        r3 = r3.getPackageName();	 Catch:{ NameNotFoundException -> 0x0022 }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x0022 }
        r3 = r1.getApplicationInfo(r3, r2);	 Catch:{ NameNotFoundException -> 0x0022 }
        goto L_0x0023;
    L_0x0022:
        r3 = 0;
    L_0x0023:
        if (r3 == 0) goto L_0x002d;
    L_0x0025:
        r3 = r1.getApplicationLabel(r3);
        r0 = r3.toString();
    L_0x002d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.g.g.c(android.content.Context):java.lang.String");
    }

    @java.lang.Deprecated
    /* renamed from: d */
    public static int m23588d(android.content.Context r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.g.g.d(android.content.Context):int");
    }

    /* renamed from: e */
    public static boolean m23589e(Context context) {
        return (!C5479f.m23840e() || context.getPackageManager().hasSystemFeature("com.google.sidewinder") == null) ? null : true;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m23585b(Context context, int i) {
        if (i == 18) {
            return true;
        }
        return i == 1 ? C5398g.m23581a(context, "com.google.android.gms") : null;
    }

    @android.annotation.TargetApi(21)
    /* renamed from: a */
    private static boolean m23581a(android.content.Context r2, java.lang.String r3) {
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
        r0 = com.google.android.m4b.maps.p113m.C5479f.m23840e();
        r1 = 1;
        if (r0 == 0) goto L_0x002e;
    L_0x0007:
        r2 = r2.getPackageManager();
        r2 = r2.getPackageInstaller();
        r2 = r2.getAllSessions();
        r2 = r2.iterator();
    L_0x0017:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x003d;
    L_0x001d:
        r0 = r2.next();
        r0 = (android.content.pm.PackageInstaller.SessionInfo) r0;
        r0 = r0.getAppPackageName();
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0017;
    L_0x002d:
        return r1;
    L_0x002e:
        r2 = r2.getPackageManager();
        r0 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r2 = r2.getApplicationInfo(r3, r0);	 Catch:{ NameNotFoundException -> 0x003d }
        r2 = r2.enabled;	 Catch:{ NameNotFoundException -> 0x003d }
        if (r2 == 0) goto L_0x003d;
    L_0x003c:
        return r1;
    L_0x003d:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.g.g.a(android.content.Context, java.lang.String):boolean");
    }

    @TargetApi(11)
    /* renamed from: a */
    public static boolean m23578a(int i, Activity activity, Fragment fragment, int i2, OnCancelListener onCancelListener) {
        Dialog dialog = null;
        if (i != 0) {
            Builder builder;
            Intent a;
            CharSequence a2;
            CharSequence string;
            StringBuilder stringBuilder;
            if (C5475a.m23830a((Context) activity) && i == 2) {
                i = 42;
            }
            if (C5479f.m23838c()) {
                TypedValue typedValue = new TypedValue();
                activity.getTheme().resolveAttribute(16843529, typedValue, true);
                if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
                    builder = new Builder(activity, 5);
                    if (builder == null) {
                        builder = new Builder(activity);
                    }
                    builder.setMessage(C5442g.m23675a(activity, i, C5398g.m23587c(activity)));
                    if (onCancelListener != null) {
                        builder.setOnCancelListener(onCancelListener);
                    }
                    a = C5398g.m23577a(i);
                    if (fragment != null) {
                        fragment = new C5443h(activity, a, 2);
                    } else {
                        fragment = new C5443h(fragment, a, 2);
                    }
                    a2 = C5442g.m23674a(activity, i);
                    if (a2 != null) {
                        builder.setPositiveButton(a2, fragment);
                    }
                    fragment = activity.getResources();
                    if (i != 42) {
                        switch (i) {
                            case 1:
                                string = fragment.getString(C4513R.string.common_google_play_services_install_title);
                                break;
                            case 2:
                                string = fragment.getString(C4513R.string.common_google_play_services_update_title);
                                break;
                            case 3:
                                string = fragment.getString(C4513R.string.common_google_play_services_enable_title);
                                break;
                            case 4:
                            case 6:
                                break;
                            case 5:
                                Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
                                string = fragment.getString(C4513R.string.common_google_play_services_invalid_account_title);
                                break;
                            case 7:
                                Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
                                string = fragment.getString(C4513R.string.common_google_play_services_network_error_title);
                                break;
                            case 8:
                                Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
                                break;
                            case 9:
                                Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
                                string = fragment.getString(C4513R.string.common_google_play_services_unsupported_title);
                                break;
                            case 10:
                                Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
                                break;
                            case 11:
                                Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
                                break;
                            default:
                                switch (i) {
                                    case 16:
                                        Log.e("GooglePlayServicesUtil", "One of the API components you attempted to connect to is not available.");
                                        break;
                                    case 17:
                                        Log.e("GooglePlayServicesUtil", "The specified account could not be signed in.");
                                        string = fragment.getString(C4513R.string.common_google_play_services_sign_in_failed_title);
                                        break;
                                    case 18:
                                        string = fragment.getString(C4513R.string.common_google_play_services_updating_title);
                                        break;
                                    default:
                                        stringBuilder = new StringBuilder(33);
                                        stringBuilder.append("Unexpected error code ");
                                        stringBuilder.append(i);
                                        Log.e("GooglePlayServicesUtil", stringBuilder.toString());
                                        break;
                                }
                        }
                    }
                    string = fragment.getString(C4513R.string.common_android_wear_update_title);
                    if (string != null) {
                        builder.setTitle(string);
                    }
                    dialog = builder.create();
                }
            }
            builder = null;
            if (builder == null) {
                builder = new Builder(activity);
            }
            builder.setMessage(C5442g.m23675a(activity, i, C5398g.m23587c(activity)));
            if (onCancelListener != null) {
                builder.setOnCancelListener(onCancelListener);
            }
            a = C5398g.m23577a(i);
            if (fragment != null) {
                fragment = new C5443h(fragment, a, 2);
            } else {
                fragment = new C5443h(activity, a, 2);
            }
            a2 = C5442g.m23674a(activity, i);
            if (a2 != null) {
                builder.setPositiveButton(a2, fragment);
            }
            fragment = activity.getResources();
            if (i != 42) {
                switch (i) {
                    case 1:
                        string = fragment.getString(C4513R.string.common_google_play_services_install_title);
                        break;
                    case 2:
                        string = fragment.getString(C4513R.string.common_google_play_services_update_title);
                        break;
                    case 3:
                        string = fragment.getString(C4513R.string.common_google_play_services_enable_title);
                        break;
                    case 4:
                    case 6:
                        break;
                    case 5:
                        Log.e("GooglePlayServicesUtil", "An invalid account was specified when connecting. Please provide a valid account.");
                        string = fragment.getString(C4513R.string.common_google_play_services_invalid_account_title);
                        break;
                    case 7:
                        Log.e("GooglePlayServicesUtil", "Network error occurred. Please retry request later.");
                        string = fragment.getString(C4513R.string.common_google_play_services_network_error_title);
                        break;
                    case 8:
                        Log.e("GooglePlayServicesUtil", "Internal error occurred. Please see logs for detailed information");
                        break;
                    case 9:
                        Log.e("GooglePlayServicesUtil", "Google Play services is invalid. Cannot recover.");
                        string = fragment.getString(C4513R.string.common_google_play_services_unsupported_title);
                        break;
                    case 10:
                        Log.e("GooglePlayServicesUtil", "Developer error occurred. Please see logs for detailed information");
                        break;
                    case 11:
                        Log.e("GooglePlayServicesUtil", "The application is not licensed to the user.");
                        break;
                    default:
                        switch (i) {
                            case 16:
                                Log.e("GooglePlayServicesUtil", "One of the API components you attempted to connect to is not available.");
                                break;
                            case 17:
                                Log.e("GooglePlayServicesUtil", "The specified account could not be signed in.");
                                string = fragment.getString(C4513R.string.common_google_play_services_sign_in_failed_title);
                                break;
                            case 18:
                                string = fragment.getString(C4513R.string.common_google_play_services_updating_title);
                                break;
                            default:
                                stringBuilder = new StringBuilder(33);
                                stringBuilder.append("Unexpected error code ");
                                stringBuilder.append(i);
                                Log.e("GooglePlayServicesUtil", stringBuilder.toString());
                                break;
                        }
                }
            }
            string = fragment.getString(C4513R.string.common_android_wear_update_title);
            if (string != null) {
                builder.setTitle(string);
            }
            dialog = builder.create();
        }
        if (dialog == null) {
            return false;
        }
        if ((activity instanceof FragmentActivity) != 0) {
            C8087i.m34411a(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), GooglePlayServicesUtil.GMS_ERROR_DIALOG);
        } else if (C5479f.m23835a() != 0) {
            C5370c.m23568a(dialog, onCancelListener).show(activity.getFragmentManager(), GooglePlayServicesUtil.GMS_ERROR_DIALOG);
        } else {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
        return true;
    }
}
