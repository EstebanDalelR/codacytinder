package com.facebook.ads.internal.p047k;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.view.p050a.C3325d;

/* renamed from: com.facebook.ads.internal.k.ak */
public class ak {
    /* renamed from: a */
    private Intent m5190a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setComponent(null);
        if (VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    /* renamed from: a */
    private boolean m5191a(Context context) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/")), 0)) {
            if (resolveInfo.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m5192b(Context context, Uri uri) {
        context.startActivity(m5194c(context, uri));
    }

    /* renamed from: b */
    private void m5193b(android.content.Context r4, android.net.Uri r5, java.lang.String r6) {
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
        r3 = this;
        r0 = new android.content.Intent;
        r1 = com.facebook.ads.AudienceNetworkActivity.class;
        r0.<init>(r4, r1);
        r1 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.addFlags(r1);
        r1 = "viewType";
        r2 = com.facebook.ads.AudienceNetworkActivity.Type.BROWSER;
        r0.putExtra(r1, r2);
        r1 = "browserURL";
        r2 = r5.toString();
        r0.putExtra(r1, r2);
        r1 = "clientToken";
        r0.putExtra(r1, r6);
        r6 = "handlerTime";
        r1 = java.lang.System.currentTimeMillis();
        r0.putExtra(r6, r1);
        r4.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x002e }
        return;
    L_0x002e:
        r6 = com.facebook.ads.InterstitialAdActivity.class;
        r0.setClass(r4, r6);
        r4.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0037 }
        return;
    L_0x0037:
        r3.m5192b(r4, r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.ak.b(android.content.Context, android.net.Uri, java.lang.String):void");
    }

    /* renamed from: c */
    private Intent m5194c(Context context, Uri uri) {
        Intent a = m5190a(uri);
        a.addCategory("android.intent.category.BROWSABLE");
        a.addFlags(268435456);
        a.putExtra("com.android.browser.application_id", context.getPackageName());
        a.putExtra("create_new_tab", false);
        return a;
    }

    /* renamed from: a */
    void m5195a(Context context, Uri uri) {
        if (m5191a(context)) {
            Intent c = m5194c(context, uri);
            c.setPackage("com.android.vending");
            context.startActivity(c);
            return;
        }
        throw new C1508u();
    }

    /* renamed from: a */
    void m5196a(Context context, Uri uri, String str) {
        if (C3325d.m12836a(uri.getScheme()) && C1418g.m4934e(context)) {
            m5193b(context, uri, str);
        } else {
            m5192b(context, uri);
        }
    }
}
