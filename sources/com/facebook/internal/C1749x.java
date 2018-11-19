package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import com.tinder.api.ManagerWebServices;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.internal.x */
public final class C1749x {
    /* renamed from: a */
    private static final String f4829a = "com.facebook.internal.x";

    /* renamed from: a */
    public static void m6064a(Object obj, String str) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Argument '");
            stringBuilder.append(str);
            stringBuilder.append("' cannot be null");
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static <T> void m6066a(Collection<T> collection, String str) {
        if (collection.isEmpty() != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Container '");
            stringBuilder.append(str);
            stringBuilder.append("' cannot be empty");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    public static <T> void m6070b(Collection<T> collection, String str) {
        C1749x.m6064a((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Container '");
                stringBuilder.append(str);
                stringBuilder.append("' cannot contain null values");
                throw new NullPointerException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: c */
    public static <T> void m6072c(Collection<T> collection, String str) {
        C1749x.m6070b((Collection) collection, str);
        C1749x.m6066a((Collection) collection, str);
    }

    /* renamed from: a */
    public static void m6065a(String str, String str2) {
        if (Utility.m5785a(str) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Argument '");
            stringBuilder.append(str2);
            stringBuilder.append("' cannot be null or empty");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static void m6061a() {
        if (!FacebookSdk.isInitialized()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    /* renamed from: b */
    public static String m6067b() {
        String i = FacebookSdk.m3998i();
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    /* renamed from: c */
    public static String m6071c() {
        String k = FacebookSdk.m4000k();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    /* renamed from: a */
    public static void m6062a(Context context) {
        C1749x.m6063a(context, true);
    }

    /* renamed from: a */
    public static void m6063a(Context context, boolean z) {
        C1749x.m6064a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != -1) {
            return;
        }
        if (z) {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
        Log.w(f4829a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
    }

    /* renamed from: b */
    public static void m6068b(Context context) {
        C1749x.m6069b(context, true);
    }

    /* renamed from: b */
    public static void m6069b(android.content.Context r3, boolean r4) {
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
        r0 = "context";
        com.facebook.internal.C1749x.m6064a(r3, r0);
        r0 = r3.getPackageManager();
        if (r0 == 0) goto L_0x0018;
    L_0x000b:
        r1 = new android.content.ComponentName;
        r2 = "com.facebook.FacebookActivity";
        r1.<init>(r3, r2);
        r3 = 1;
        r3 = r0.getActivityInfo(r1, r3);	 Catch:{ NameNotFoundException -> 0x0018 }
        goto L_0x0019;
    L_0x0018:
        r3 = 0;
    L_0x0019:
        if (r3 != 0) goto L_0x002c;
    L_0x001b:
        if (r4 == 0) goto L_0x0025;
    L_0x001d:
        r3 = new java.lang.IllegalStateException;
        r4 = "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
        r3.<init>(r4);
        throw r3;
    L_0x0025:
        r3 = f4829a;
        r4 = "FacebookActivity is not declared in the AndroidManifest.xml, please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
        android.util.Log.w(r3, r4);
    L_0x002c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.x.b(android.content.Context, boolean):void");
    }

    /* renamed from: c */
    public static boolean m6073c(Context context) {
        C1749x.m6064a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        List queryIntentActivities;
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ManagerWebServices.PARAM_PHOTOS_SOURCE);
            stringBuilder.append(FacebookSdk.m3998i());
            stringBuilder.append("://authorize");
            intent.setData(Uri.parse(stringBuilder.toString()));
            queryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            queryIntentActivities = null;
        }
        boolean z = false;
        if (r0 != null) {
            boolean z2 = false;
            for (ResolveInfo resolveInfo : r0) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                    return false;
                }
                z2 = true;
            }
            z = z2;
        }
        return z;
    }

    /* renamed from: d */
    public static void m6074d(Context context) {
        C1749x.m6064a((Object) context, "context");
        String b = C1749x.m6067b();
        context = context.getPackageManager();
        if (context != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com.facebook.app.FacebookContentProvider");
            stringBuilder.append(b);
            if (context.resolveContentProvider(stringBuilder.toString(), 0) == null) {
                throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[]{stringBuilder.toString()}));
            }
        }
    }
}
