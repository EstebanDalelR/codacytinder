package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.C1649a;
import com.facebook.internal.C1712j;
import com.facebook.internal.C1738r;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AppEventsLogger {
    /* renamed from: a */
    private static final String f4504a = AppEventsLogger.class.getCanonicalName();
    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f4505d;
    /* renamed from: e */
    private static FlushBehavior f4506e = FlushBehavior.AUTO;
    /* renamed from: f */
    private static Object f4507f = new Object();
    /* renamed from: g */
    private static String f4508g;
    /* renamed from: h */
    private static boolean f4509h;
    /* renamed from: i */
    private static String f4510i;
    /* renamed from: b */
    private final String f4511b;
    /* renamed from: c */
    private final AccessTokenAppIdPair f4512c;

    /* renamed from: com.facebook.appevents.AppEventsLogger$2 */
    static class C16282 implements Runnable {
        C16282() {
        }

        public void run() {
            Set<String> hashSet = new HashSet();
            for (AccessTokenAppIdPair b : C1638c.m5561b()) {
                hashSet.add(b.m5510b());
            }
            for (String a : hashSet) {
                C1712j.m5909a(a, true);
            }
        }
    }

    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    /* renamed from: a */
    public static void m5522a(Application application, String str) {
        if (FacebookSdk.isInitialized()) {
            C1631a.m5543a();
            if (str == null) {
                str = FacebookSdk.m3998i();
            }
            FacebookSdk.m3982a((Context) application, str);
            C1649a.m5584a(application, str);
            return;
        }
        throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
    }

    /* renamed from: a */
    public static void m5524a(Context context, String str) {
        final AppEventsLogger appEventsLogger = new AppEventsLogger(context, str, null);
        f4505d.execute(new Runnable() {
            public void run() {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r4 = this;
                r0 = new android.os.Bundle;
                r0.<init>();
                r1 = 1;
                r2 = "com.facebook.core.Core";	 Catch:{ ClassNotFoundException -> 0x0010 }
                java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x0010 }
                r2 = "core_lib_included";	 Catch:{ ClassNotFoundException -> 0x0010 }
                r0.putInt(r2, r1);	 Catch:{ ClassNotFoundException -> 0x0010 }
            L_0x0010:
                r2 = "com.facebook.login.Login";	 Catch:{ ClassNotFoundException -> 0x001a }
                java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x001a }
                r2 = "login_lib_included";	 Catch:{ ClassNotFoundException -> 0x001a }
                r0.putInt(r2, r1);	 Catch:{ ClassNotFoundException -> 0x001a }
            L_0x001a:
                r2 = "com.facebook.share.Share";	 Catch:{ ClassNotFoundException -> 0x0024 }
                java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x0024 }
                r2 = "share_lib_included";	 Catch:{ ClassNotFoundException -> 0x0024 }
                r0.putInt(r2, r1);	 Catch:{ ClassNotFoundException -> 0x0024 }
            L_0x0024:
                r2 = "com.facebook.places.Places";	 Catch:{ ClassNotFoundException -> 0x002e }
                java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x002e }
                r2 = "places_lib_included";	 Catch:{ ClassNotFoundException -> 0x002e }
                r0.putInt(r2, r1);	 Catch:{ ClassNotFoundException -> 0x002e }
            L_0x002e:
                r2 = "com.facebook.messenger.Messenger";	 Catch:{ ClassNotFoundException -> 0x0038 }
                java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x0038 }
                r2 = "messenger_lib_included";	 Catch:{ ClassNotFoundException -> 0x0038 }
                r0.putInt(r2, r1);	 Catch:{ ClassNotFoundException -> 0x0038 }
            L_0x0038:
                r2 = "com.facebook.applinks.AppLinks";	 Catch:{ ClassNotFoundException -> 0x0042 }
                java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x0042 }
                r2 = "applinks_lib_included";	 Catch:{ ClassNotFoundException -> 0x0042 }
                r0.putInt(r2, r1);	 Catch:{ ClassNotFoundException -> 0x0042 }
            L_0x0042:
                r2 = "com.facebook.all.All";	 Catch:{ ClassNotFoundException -> 0x004c }
                java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x004c }
                r2 = "all_lib_included";	 Catch:{ ClassNotFoundException -> 0x004c }
                r0.putInt(r2, r1);	 Catch:{ ClassNotFoundException -> 0x004c }
            L_0x004c:
                r1 = r0;
                r2 = "fb_sdk_initialize";
                r3 = 0;
                r1.logSdkEvent(r2, r3, r0);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEventsLogger.1.run():void");
            }
        });
    }

    public static AppEventsLogger newLogger(Context context) {
        return new AppEventsLogger(context, null, null);
    }

    /* renamed from: b */
    public static AppEventsLogger m5528b(Context context, String str) {
        return new AppEventsLogger(context, str, null);
    }

    /* renamed from: a */
    public static FlushBehavior m5520a() {
        FlushBehavior flushBehavior;
        synchronized (f4507f) {
            flushBehavior = f4506e;
        }
        return flushBehavior;
    }

    /* renamed from: a */
    public void m5536a(String str, Bundle bundle) {
        m5526a(str, null, bundle, false, C1649a.m5581a());
    }

    /* renamed from: a */
    public void m5535a(String str, double d, Bundle bundle) {
        m5526a(str, Double.valueOf(d), bundle, false, C1649a.m5581a());
    }

    /* renamed from: a */
    public void m5537a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        m5527a(bigDecimal, currency, bundle, true);
    }

    /* renamed from: a */
    private void m5527a(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (bigDecimal == null) {
            m5525a("purchaseAmount cannot be null");
        } else if (currency == null) {
            m5525a("currency cannot be null");
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m5526a("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, C1649a.m5581a());
            m5532f();
        }
    }

    /* renamed from: b */
    public void m5538b() {
        C1638c.m5560a(FlushReason.EXPLICIT);
    }

    /* renamed from: c */
    public static void m5529c() {
        C1638c.m5557a();
    }

    /* renamed from: d */
    static String m5530d() {
        String str;
        synchronized (f4507f) {
            str = f4510i;
        }
        return str;
    }

    /* renamed from: e */
    public static String m5531e() {
        return C1631a.m5544b();
    }

    public void logSdkEvent(String str, Double d, Bundle bundle) {
        m5526a(str, d, bundle, true, C1649a.m5581a());
    }

    private AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this(Utility.m5796c(context), str, accessToken);
    }

    protected AppEventsLogger(String str, String str2, AccessToken accessToken) {
        C1749x.m6061a();
        this.f4511b = str;
        if (accessToken == null) {
            accessToken = AccessToken.getCurrentAccessToken();
        }
        if (AccessToken.isCurrentAccessTokenActive() == null || (str2 != null && str2.equals(accessToken.getApplicationId()) == null)) {
            if (str2 == null) {
                str2 = Utility.m5755a(FacebookSdk.m3994e());
            }
            this.f4512c = new AccessTokenAppIdPair(null, str2);
        } else {
            this.f4512c = new AccessTokenAppIdPair(accessToken);
        }
        m5534h();
    }

    /* renamed from: h */
    private static void m5534h() {
        synchronized (f4507f) {
            if (f4505d != null) {
                return;
            }
            f4505d = new ScheduledThreadPoolExecutor(1);
            f4505d.scheduleAtFixedRate(new C16282(), 0, 86400, TimeUnit.SECONDS);
        }
    }

    /* renamed from: a */
    private void m5526a(String str, Double d, Bundle bundle, boolean z, @Nullable UUID uuid) {
        try {
            m5523a(FacebookSdk.m3994e(), new AppEvent(this.f4511b, str, d, bundle, z, uuid), this.f4512c);
        } catch (String str2) {
            C1738r.m5979a(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", str2.toString());
        } catch (String str22) {
            C1738r.m5979a(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", str22.toString());
        }
    }

    /* renamed from: a */
    private static void m5523a(Context context, AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
        C1638c.m5559a(accessTokenAppIdPair, appEvent);
        if (appEvent.m5517b() != null || f4509h != null) {
            return;
        }
        if (appEvent.m5516a() == "fb_mobile_activate_app") {
            f4509h = true;
        } else {
            C1738r.m5978a(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
        }
    }

    /* renamed from: f */
    static void m5532f() {
        if (m5520a() != FlushBehavior.EXPLICIT_ONLY) {
            C1638c.m5560a(FlushReason.EAGER_FLUSHING_EVENT);
        }
    }

    /* renamed from: a */
    private static void m5525a(String str) {
        C1738r.m5978a(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", str);
    }

    /* renamed from: g */
    static Executor m5533g() {
        if (f4505d == null) {
            m5534h();
        }
        return f4505d;
    }

    /* renamed from: a */
    public static String m5521a(Context context) {
        if (f4508g == null) {
            synchronized (f4507f) {
                if (f4508g == null) {
                    f4508g = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (f4508g == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("XZ");
                        stringBuilder.append(UUID.randomUUID().toString());
                        f4508g = stringBuilder.toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f4508g).apply();
                    }
                }
            }
        }
        return f4508g;
    }
}
