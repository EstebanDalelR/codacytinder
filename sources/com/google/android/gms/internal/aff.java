package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class aff {
    /* renamed from: a */
    private static String f15151a;

    /* renamed from: a */
    public static String m19099a(Context context) {
        if (f15151a != null) {
            return f15151a;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        Object obj = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        List arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f15151a = null;
        } else {
            String str;
            if (arrayList.size() == 1) {
                str = (String) arrayList.get(0);
            } else if (!TextUtils.isEmpty(obj) && !m19100a(context, intent) && arrayList.contains(obj)) {
                f15151a = obj;
            } else if (arrayList.contains("com.android.chrome")) {
                str = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                str = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                str = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                str = "com.google.android.apps.chrome";
            }
            f15151a = str;
        }
        return f15151a;
    }

    /* renamed from: a */
    private static boolean m19100a(android.content.Context r3, android.content.Intent r4) {
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
        r0 = 0;
        r3 = r3.getPackageManager();	 Catch:{ RuntimeException -> 0x003b }
        r1 = 64;	 Catch:{ RuntimeException -> 0x003b }
        r3 = r3.queryIntentActivities(r4, r1);	 Catch:{ RuntimeException -> 0x003b }
        if (r3 == 0) goto L_0x003a;	 Catch:{ RuntimeException -> 0x003b }
    L_0x000d:
        r4 = r3.size();	 Catch:{ RuntimeException -> 0x003b }
        if (r4 != 0) goto L_0x0014;	 Catch:{ RuntimeException -> 0x003b }
    L_0x0013:
        return r0;	 Catch:{ RuntimeException -> 0x003b }
    L_0x0014:
        r3 = r3.iterator();	 Catch:{ RuntimeException -> 0x003b }
    L_0x0018:
        r4 = r3.hasNext();	 Catch:{ RuntimeException -> 0x003b }
        if (r4 == 0) goto L_0x0042;	 Catch:{ RuntimeException -> 0x003b }
    L_0x001e:
        r4 = r3.next();	 Catch:{ RuntimeException -> 0x003b }
        r4 = (android.content.pm.ResolveInfo) r4;	 Catch:{ RuntimeException -> 0x003b }
        r1 = r4.filter;	 Catch:{ RuntimeException -> 0x003b }
        if (r1 == 0) goto L_0x0018;	 Catch:{ RuntimeException -> 0x003b }
    L_0x0028:
        r2 = r1.countDataAuthorities();	 Catch:{ RuntimeException -> 0x003b }
        if (r2 == 0) goto L_0x0018;	 Catch:{ RuntimeException -> 0x003b }
    L_0x002e:
        r1 = r1.countDataPaths();	 Catch:{ RuntimeException -> 0x003b }
        if (r1 == 0) goto L_0x0018;	 Catch:{ RuntimeException -> 0x003b }
    L_0x0034:
        r4 = r4.activityInfo;	 Catch:{ RuntimeException -> 0x003b }
        if (r4 == 0) goto L_0x0018;
    L_0x0038:
        r3 = 1;
        return r3;
    L_0x003a:
        return r0;
    L_0x003b:
        r3 = "CustomTabsHelper";
        r4 = "Runtime exception while getting specialized handlers";
        android.util.Log.e(r3, r4);
    L_0x0042:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aff.a(android.content.Context, android.content.Intent):boolean");
    }
}
