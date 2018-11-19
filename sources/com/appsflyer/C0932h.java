package com.appsflyer;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.support.v4.content.C0432b;
import com.appsflyer.C0940m.C0939a;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.C3813b;
import com.google.android.gms.iid.InstanceIDListenerService;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.appsflyer.h */
class C0932h {
    /* renamed from: b */
    private static String f2477b;
    /* renamed from: c */
    private static String f2478c;
    /* renamed from: a */
    final IntentFilter f2479a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.h$a */
    static final class C0930a {
        /* renamed from: a */
        private final float f2474a;
        /* renamed from: b */
        private final String f2475b;

        C0930a(float f, String str) {
            this.f2474a = f;
            this.f2475b = str;
        }

        /* renamed from: a */
        final float m3170a() {
            return this.f2474a;
        }

        /* renamed from: b */
        final String m3171b() {
            return this.f2475b;
        }
    }

    /* renamed from: com.appsflyer.h$b */
    static final class C0931b {
        /* renamed from: a */
        static final C0932h f2476a = new C0932h();
    }

    C0932h() {
    }

    /* renamed from: a */
    static C0932h m3172a() {
        return C0931b.f2476a;
    }

    @android.support.annotation.NonNull
    /* renamed from: a */
    final com.appsflyer.C0932h.C0930a m3191a(android.content.Context r6) {
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
        r5 = this;
        r0 = 0;
        r1 = 0;
        r2 = r5.f2479a;	 Catch:{ Throwable -> 0x004c }
        r6 = r6.registerReceiver(r0, r2);	 Catch:{ Throwable -> 0x004c }
        if (r6 == 0) goto L_0x004c;	 Catch:{ Throwable -> 0x004c }
    L_0x000a:
        r2 = 2;	 Catch:{ Throwable -> 0x004c }
        r3 = "status";	 Catch:{ Throwable -> 0x004c }
        r4 = -1;	 Catch:{ Throwable -> 0x004c }
        r3 = r6.getIntExtra(r3, r4);	 Catch:{ Throwable -> 0x004c }
        if (r2 != r3) goto L_0x0016;	 Catch:{ Throwable -> 0x004c }
    L_0x0014:
        r2 = 1;	 Catch:{ Throwable -> 0x004c }
        goto L_0x0017;	 Catch:{ Throwable -> 0x004c }
    L_0x0016:
        r2 = 0;	 Catch:{ Throwable -> 0x004c }
    L_0x0017:
        if (r2 == 0) goto L_0x0031;	 Catch:{ Throwable -> 0x004c }
    L_0x0019:
        r2 = "plugged";	 Catch:{ Throwable -> 0x004c }
        r2 = r6.getIntExtra(r2, r4);	 Catch:{ Throwable -> 0x004c }
        r3 = 4;	 Catch:{ Throwable -> 0x004c }
        if (r2 == r3) goto L_0x002e;	 Catch:{ Throwable -> 0x004c }
    L_0x0022:
        switch(r2) {
            case 1: goto L_0x002b;
            case 2: goto L_0x0028;
            default: goto L_0x0025;
        };	 Catch:{ Throwable -> 0x004c }
    L_0x0025:
        r2 = "other";	 Catch:{ Throwable -> 0x004c }
        goto L_0x0033;	 Catch:{ Throwable -> 0x004c }
    L_0x0028:
        r2 = "usb";	 Catch:{ Throwable -> 0x004c }
        goto L_0x0033;	 Catch:{ Throwable -> 0x004c }
    L_0x002b:
        r2 = "ac";	 Catch:{ Throwable -> 0x004c }
        goto L_0x0033;	 Catch:{ Throwable -> 0x004c }
    L_0x002e:
        r2 = "wireless";	 Catch:{ Throwable -> 0x004c }
        goto L_0x0033;	 Catch:{ Throwable -> 0x004c }
    L_0x0031:
        r2 = "no";	 Catch:{ Throwable -> 0x004c }
    L_0x0033:
        r0 = r2;	 Catch:{ Throwable -> 0x004c }
        r2 = "level";	 Catch:{ Throwable -> 0x004c }
        r2 = r6.getIntExtra(r2, r4);	 Catch:{ Throwable -> 0x004c }
        r3 = "scale";	 Catch:{ Throwable -> 0x004c }
        r6 = r6.getIntExtra(r3, r4);	 Catch:{ Throwable -> 0x004c }
        if (r4 == r2) goto L_0x004c;
    L_0x0042:
        if (r4 == r6) goto L_0x004c;
    L_0x0044:
        r1 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r2 = (float) r2;
        r2 = r2 * r1;
        r6 = (float) r6;
        r2 = r2 / r6;
        r1 = r2;
    L_0x004c:
        r6 = new com.appsflyer.h$a;
        r6.<init>(r1, r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.h.a(android.content.Context):com.appsflyer.h$a");
    }

    /* renamed from: b */
    static void m3182b(Context context) {
        AFLogger.m3083d("onBecameForeground");
        C3010d.m11689c().m11728a();
        C3010d.m11689c().m11743b(context, null, null);
        AFLogger.m3071a();
    }

    /* renamed from: c */
    static void m3186c(Context context) {
        context = context.getApplicationContext();
        AFLogger.m3083d("onBecameBackground");
        C3010d.m11689c().m11741b();
        AFLogger.m3083d("callStatsBackground background call");
        C3010d.m11689c().m11737a(new WeakReference(context));
        aa a = aa.m3121a();
        if (a.m3142f()) {
            a.m3139c();
            if (context != null) {
                a.m3133a(context.getPackageName(), context.getPackageManager());
            }
            a.m3140d();
        } else {
            AFLogger.m3080c("RD status is OFF");
        }
        C0919a.m3116a().m3120d();
    }

    /* renamed from: d */
    static C0948r m3187d(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            ServiceConnection c0949s = new C0949s();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, c0949s, 1)) {
                    C0954u c0954u = new C0954u(c0949s.m3244a());
                    C0948r c0948r = new C0948r(c0954u.m3255a(), c0954u.m3256a(true));
                    if (context != null) {
                        context.unbindService(c0949s);
                    }
                    return c0948r;
                }
                if (context != null) {
                    context.unbindService(c0949s);
                }
                throw new IOException("Google Play connection failed");
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                if (context != null) {
                    context.unbindService(c0949s);
                }
            }
        } catch (Context context2) {
            throw context2;
        }
    }

    /* renamed from: a */
    static C0940m m3173a(ContentResolver contentResolver) {
        C0940m c0940m = null;
        if (contentResolver == null) {
            return null;
        }
        if (AppsFlyerProperties.m3086a().m3090a("amazon_aid") == null && "Amazon".equals(Build.MANUFACTURER)) {
            int i = Secure.getInt(contentResolver, "limit_ad_tracking", 2);
            if (i == 0) {
                c0940m = new C0940m(C0939a.AMAZON, Secure.getString(contentResolver, "advertising_id"), false);
            } else if (i != 2) {
                String str = "";
                try {
                    contentResolver = Secure.getString(contentResolver, "advertising_id");
                } catch (Throwable th) {
                    AFLogger.m3073a("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                    contentResolver = str;
                }
                c0940m = new C0940m(C0939a.AMAZON, contentResolver, true);
            }
        }
        return c0940m;
    }

    /* renamed from: a */
    static void m3176a(Context context, Map<String, Object> map) {
        String id;
        String bool;
        String str;
        Throwable th;
        C0948r d;
        String str2;
        StringBuilder stringBuilder;
        AFLogger.m3083d("Trying to fetch GAID..");
        String str3 = null;
        boolean z = true;
        boolean z2 = false;
        int i = -1;
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (advertisingIdInfo != null) {
                id = advertisingIdInfo.getId();
                try {
                    bool = Boolean.toString(advertisingIdInfo.isLimitAdTrackingEnabled() ^ true);
                    if (id != null) {
                        try {
                            if (id.length() == 0) {
                            }
                        } catch (Throwable th2) {
                            z2 = true;
                            str = bool;
                            th = th2;
                            str3 = str;
                            AFLogger.m3073a(th.getMessage(), th);
                            try {
                                i = C3813b.m14425a().mo2566a(context);
                            } catch (Throwable th3) {
                                AFLogger.m3073a(th3.getMessage(), th3);
                            }
                            bool = th.getClass().getSimpleName();
                            AFLogger.m3083d("WARNING: Google Play Services is missing.");
                            if (AppsFlyerProperties.m3086a().m3098b("enableGpsFallback", true)) {
                                try {
                                    d = C0932h.m3187d(context);
                                    if (d != null) {
                                        id = d.m3242a();
                                        str3 = Boolean.toString(d.m3243b() ^ true);
                                        str2 = "emptyOrNull (bypass)";
                                    } else {
                                        str2 = "gpsAdInfo-null (bypass)";
                                    }
                                    bool = str3;
                                } catch (Throwable th22) {
                                    AFLogger.m3073a(th22.getMessage(), th22);
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(bool);
                                    stringBuilder.append("/");
                                    stringBuilder.append(th22.getClass().getSimpleName());
                                    str2 = stringBuilder.toString();
                                    id = AppsFlyerProperties.m3086a().m3090a("advertiserId");
                                    bool = AppsFlyerProperties.m3086a().m3090a("advertiserIdEnabled");
                                    if (th22.getLocalizedMessage() != null) {
                                        AFLogger.m3083d(th22.getLocalizedMessage());
                                    } else {
                                        AFLogger.m3083d(th22.toString());
                                    }
                                }
                                str3 = str2;
                                if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext") != null) {
                                    id = AppsFlyerProperties.m3086a().m3090a("advertiserId");
                                    bool = AppsFlyerProperties.m3086a().m3090a("advertiserIdEnabled");
                                    str3 = "context = android.app.ReceiverRestrictedContext";
                                }
                                if (str3 != null) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append(i);
                                    stringBuilder.append(": ");
                                    stringBuilder.append(str3);
                                    map.put("gaidError", stringBuilder.toString());
                                }
                                if (id != null) {
                                }
                            }
                            str = bool;
                            bool = str3;
                            str3 = str;
                            if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext") != null) {
                                id = AppsFlyerProperties.m3086a().m3090a("advertiserId");
                                bool = AppsFlyerProperties.m3086a().m3090a("advertiserIdEnabled");
                                str3 = "context = android.app.ReceiverRestrictedContext";
                            }
                            if (str3 != null) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(i);
                                stringBuilder.append(": ");
                                stringBuilder.append(str3);
                                map.put("gaidError", stringBuilder.toString());
                            }
                            if (id != null) {
                            }
                        }
                    }
                    str3 = "emptyOrNull";
                    z2 = true;
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.m3073a(th.getMessage(), th);
                    i = C3813b.m14425a().mo2566a(context);
                    bool = th.getClass().getSimpleName();
                    AFLogger.m3083d("WARNING: Google Play Services is missing.");
                    if (AppsFlyerProperties.m3086a().m3098b("enableGpsFallback", true)) {
                        d = C0932h.m3187d(context);
                        if (d != null) {
                            str2 = "gpsAdInfo-null (bypass)";
                        } else {
                            id = d.m3242a();
                            str3 = Boolean.toString(d.m3243b() ^ true);
                            str2 = "emptyOrNull (bypass)";
                        }
                        bool = str3;
                        str3 = str2;
                        if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext") != null) {
                            id = AppsFlyerProperties.m3086a().m3090a("advertiserId");
                            bool = AppsFlyerProperties.m3086a().m3090a("advertiserIdEnabled");
                            str3 = "context = android.app.ReceiverRestrictedContext";
                        }
                        if (str3 != null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(i);
                            stringBuilder.append(": ");
                            stringBuilder.append(str3);
                            map.put("gaidError", stringBuilder.toString());
                        }
                        if (id != null) {
                        }
                    }
                    str = bool;
                    bool = str3;
                    str3 = str;
                    if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext") != null) {
                        id = AppsFlyerProperties.m3086a().m3090a("advertiserId");
                        bool = AppsFlyerProperties.m3086a().m3090a("advertiserIdEnabled");
                        str3 = "context = android.app.ReceiverRestrictedContext";
                    }
                    if (str3 != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(i);
                        stringBuilder.append(": ");
                        stringBuilder.append(str3);
                        map.put("gaidError", stringBuilder.toString());
                    }
                    if (id != null) {
                    }
                }
                if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext") != null) {
                    id = AppsFlyerProperties.m3086a().m3090a("advertiserId");
                    bool = AppsFlyerProperties.m3086a().m3090a("advertiserIdEnabled");
                    str3 = "context = android.app.ReceiverRestrictedContext";
                }
                if (str3 != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(i);
                    stringBuilder.append(": ");
                    stringBuilder.append(str3);
                    map.put("gaidError", stringBuilder.toString());
                }
                if (id != null && bool != null) {
                    map.put("advertiserId", id);
                    map.put("advertiserIdEnabled", bool);
                    AppsFlyerProperties.m3086a().m3092a("advertiserId", id);
                    AppsFlyerProperties.m3086a().m3092a("advertiserIdEnabled", bool);
                    map.put("isGaidWithGps", String.valueOf(z2));
                    return;
                }
            }
            id = null;
            z = false;
            str3 = "gpsAdInfo-null";
            bool = id;
            z2 = z;
        } catch (Throwable th5) {
            th = th5;
            id = null;
            AFLogger.m3073a(th.getMessage(), th);
            i = C3813b.m14425a().mo2566a(context);
            bool = th.getClass().getSimpleName();
            AFLogger.m3083d("WARNING: Google Play Services is missing.");
            if (AppsFlyerProperties.m3086a().m3098b("enableGpsFallback", true)) {
                d = C0932h.m3187d(context);
                if (d != null) {
                    id = d.m3242a();
                    str3 = Boolean.toString(d.m3243b() ^ true);
                    if (id == null || id.length() == 0) {
                        str2 = "emptyOrNull (bypass)";
                    }
                } else {
                    str2 = "gpsAdInfo-null (bypass)";
                }
                bool = str3;
                str3 = str2;
                if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext") != null) {
                    id = AppsFlyerProperties.m3086a().m3090a("advertiserId");
                    bool = AppsFlyerProperties.m3086a().m3090a("advertiserIdEnabled");
                    str3 = "context = android.app.ReceiverRestrictedContext";
                }
                if (str3 != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(i);
                    stringBuilder.append(": ");
                    stringBuilder.append(str3);
                    map.put("gaidError", stringBuilder.toString());
                }
                if (id != null) {
                }
            }
            str = bool;
            bool = str3;
            str3 = str;
            if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext") != null) {
                id = AppsFlyerProperties.m3086a().m3090a("advertiserId");
                bool = AppsFlyerProperties.m3086a().m3090a("advertiserIdEnabled");
                str3 = "context = android.app.ReceiverRestrictedContext";
            }
            if (str3 != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(i);
                stringBuilder.append(": ");
                stringBuilder.append(str3);
                map.put("gaidError", stringBuilder.toString());
            }
            if (id != null) {
            }
        }
        if (context.getClass().getName().equals("android.app.ReceiverRestrictedContext") != null) {
            id = AppsFlyerProperties.m3086a().m3090a("advertiserId");
            bool = AppsFlyerProperties.m3086a().m3090a("advertiserIdEnabled");
            str3 = "context = android.app.ReceiverRestrictedContext";
        }
        if (str3 != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(i);
            stringBuilder.append(": ");
            stringBuilder.append(str3);
            map.put("gaidError", stringBuilder.toString());
        }
        if (id != null) {
        }
    }

    /* renamed from: a */
    static boolean m3179a(Context context, Intent intent) {
        if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    static boolean m3185b(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentServices(intent, 0).size() > null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static boolean m3180a(Context context, String str) {
        context = C0432b.m1645b(context, str);
        StringBuilder stringBuilder = new StringBuilder("is Permission Available: ");
        stringBuilder.append(str);
        stringBuilder.append("; res: ");
        stringBuilder.append(context);
        AFLogger.m3072a(stringBuilder.toString());
        return context == null ? true : null;
    }

    /* renamed from: b */
    static boolean m3184b() {
        return "OPPO".equals(Build.BRAND);
    }

    /* renamed from: a */
    static void m3177a(String str) {
        f2477b = str;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i != 0) {
                if (i != str.length() - 1) {
                    stringBuilder.append("*");
                }
            }
            stringBuilder.append(str.charAt(i));
        }
        f2478c = stringBuilder.toString();
    }

    /* renamed from: b */
    static void m3183b(String str) {
        if (f2477b == null) {
            C0932h.m3177a(AppsFlyerProperties.m3086a().m3090a("AppsFlyerKey"));
        }
        if (f2477b != null && str.contains(f2477b)) {
            AFLogger.m3083d(str.replace(f2477b, f2478c));
        }
    }

    /* renamed from: e */
    static boolean m3188e(Context context) {
        return C0932h.m3190g(context) | C0932h.m3189f(context);
    }

    /* renamed from: f */
    private static boolean m3189f(Context context) {
        if (C3010d.m11689c().m11750e()) {
            return false;
        }
        try {
            Class.forName("com.google.android.gms.iid.InstanceIDListenerService");
            Intent intent = new Intent("com.google.android.gms.iid.a", null, context, GcmInstanceIdListener.class);
            Intent intent2 = new Intent("com.google.android.gms.iid.a", null, context, InstanceIDListenerService.class);
            if (C0932h.m3185b(context, intent) || C0932h.m3185b(context, intent2)) {
                if (C0932h.m3179a(context, new Intent("com.google.android.c2dm.intent.RECEIVE", null, context, Class.forName("com.google.android.gms.gcm.GcmReceiver")))) {
                    String packageName = context.getPackageName();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(packageName);
                    stringBuilder.append(".permission.C2D_MESSAGE");
                    if (C0932h.m3180a(context, stringBuilder.toString()) != null) {
                        return true;
                    }
                    AFLogger.m3084e("Cannot verify existence of the app's \"permission.C2D_MESSAGE\" permission in the manifest. Please refer to documentation.");
                } else {
                    AFLogger.m3084e("Cannot verify existence of GcmReceiver receiver in the manifest. Please refer to documentation.");
                }
            }
        } catch (Context context2) {
            AFLogger.m3072a(context2.getMessage());
        } catch (Throwable th) {
            AFLogger.m3073a("An error occurred while trying to verify manifest declarations: ", th);
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m3190g(android.content.Context r6) {
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
        r0 = com.appsflyer.C3010d.m11689c();
        r0 = r0.m11750e();
        r1 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        r0 = "com.google.firebase.iid.FirebaseInstanceIdService";	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        r0 = new android.content.Intent;	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        r2 = "com.google.firebase.INSTANCE_ID_EVENT";	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        r3 = com.appsflyer.C0926e.class;	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        r4 = 0;	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        r0.<init>(r2, r4, r6, r3);	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        r2 = new android.content.Intent;	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        r3 = "com.google.firebase.INSTANCE_ID_EVENT";	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        r5 = com.google.firebase.iid.FirebaseInstanceIdService.class;	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        r2.<init>(r3, r4, r6, r5);	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        r0 = com.appsflyer.C0932h.m3185b(r6, r0);	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        if (r0 != 0) goto L_0x0037;	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
    L_0x002a:
        r6 = com.appsflyer.C0932h.m3185b(r6, r2);	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        if (r6 == 0) goto L_0x0031;	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
    L_0x0030:
        goto L_0x0037;	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
    L_0x0031:
        r6 = "Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.";	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        com.appsflyer.AFLogger.m3084e(r6);	 Catch:{ ClassNotFoundException -> 0x003f, Throwable -> 0x0039 }
        goto L_0x003f;
    L_0x0037:
        r6 = 1;
        return r6;
    L_0x0039:
        r6 = move-exception;
        r0 = "An error occurred while trying to verify manifest declarations: ";
        com.appsflyer.AFLogger.m3073a(r0, r6);
    L_0x003f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.h.g(android.content.Context):boolean");
    }

    /* renamed from: b */
    private static java.lang.String m3181b(java.lang.ref.WeakReference<android.content.Context> r8, java.lang.String r9) {
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
        r1 = "com.google.android.gms.iid.a";	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r2 = "com.google.android.gms.gcm.GcmReceiver";	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r2 = "getInstance";	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r3 = 1;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r4 = new java.lang.Class[r3];	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r5 = android.content.Context.class;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r6 = 0;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r4[r6] = r5;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r2 = r1.getDeclaredMethod(r2, r4);	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r4 = new java.lang.Object[r3];	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r8 = r8.get();	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r4[r6] = r8;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r8 = r2.invoke(r1, r4);	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r2 = "getToken";	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r4 = 2;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r5 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r7 = java.lang.String.class;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r5[r6] = r7;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r7 = java.lang.String.class;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r5[r3] = r7;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r1 = r1.getDeclaredMethod(r2, r5);	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r2 = new java.lang.Object[r4];	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r2[r6] = r9;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r9 = "GCM";	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r2[r3] = r9;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r8 = r1.invoke(r8, r2);	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        r8 = (java.lang.String) r8;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        if (r8 != 0) goto L_0x004d;	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
    L_0x0047:
        r8 = "Couldn't get token using reflection.";	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        com.appsflyer.AFLogger.m3084e(r8);	 Catch:{ ClassNotFoundException -> 0x0054, Throwable -> 0x004e }
        return r0;
    L_0x004d:
        return r8;
    L_0x004e:
        r8 = move-exception;
        r9 = "Couldn't get token using GoogleCloudMessaging. ";
        com.appsflyer.AFLogger.m3073a(r9, r8);
    L_0x0054:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.h.b(java.lang.ref.WeakReference, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    static void m3178a(WeakReference<Context> weakReference) {
        new ab(weakReference).execute(new Void[null]);
    }

    /* renamed from: a */
    static void m3175a(Context context, C0947q c0947q) {
        StringBuilder stringBuilder = new StringBuilder("updateServerUninstallToken called with: ");
        stringBuilder.append(c0947q.toString());
        AFLogger.m3083d(stringBuilder.toString());
        AppsFlyerProperties.m3086a().m3092a("afUninstallToken", c0947q.toString());
        C3010d.m11689c().m11742b(context, c0947q.m3240a());
    }
}
