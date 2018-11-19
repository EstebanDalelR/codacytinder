package com.appsflyer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Process;
import android.support.annotation.Nullable;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.text.TextUtils;
import com.appsflyer.C0928f.C0927a;
import com.appsflyer.C0958w.C0957b;
import com.appsflyer.C3013x.C0959a;
import com.appsflyer.p022a.C0917a;
import com.appsflyer.p022a.C0918b;
import com.google.android.gms.common.C3813b;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.networkperf.InstrumentationConstantsKt;
import com.tinder.domain.config.model.ProfileEditingConfig;
import io.fabric.sdk.android.services.common.C15616a;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.appsflyer.d */
public class C3010d implements C0933j {
    /* renamed from: a */
    static final String f9351a = "4.8.7".substring(0, "4.8.7".indexOf("."));
    /* renamed from: b */
    static final String f9352b;
    /* renamed from: c */
    static final String f9353c;
    /* renamed from: d */
    static final String f9354d;
    /* renamed from: e */
    static final String f9355e;
    /* renamed from: f */
    static AppsFlyerInAppPurchaseValidatorListener f9356f;
    /* renamed from: j */
    private static final String f9357j;
    /* renamed from: m */
    private static final List<String> f9358m = Arrays.asList(new String[]{"is_cache"});
    /* renamed from: n */
    private static final List<String> f9359n = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});
    /* renamed from: p */
    private static AppsFlyerConversionListener f9360p;
    /* renamed from: x */
    private static C3010d f9361x = new C3010d();
    /* renamed from: A */
    private long f9362A;
    /* renamed from: B */
    private boolean f9363B = false;
    /* renamed from: C */
    private boolean f9364C = false;
    /* renamed from: D */
    private String f9365D;
    /* renamed from: E */
    private boolean f9366E;
    /* renamed from: F */
    private boolean f9367F;
    /* renamed from: G */
    private C0953t f9368G = new C0953t();
    /* renamed from: H */
    private boolean f9369H = false;
    /* renamed from: I */
    private boolean f9370I = false;
    /* renamed from: g */
    String f9371g;
    /* renamed from: h */
    String f9372h;
    /* renamed from: i */
    private String f9373i = "appsflyer.com";
    /* renamed from: k */
    private long f9374k = -1;
    /* renamed from: l */
    private long f9375l = -1;
    /* renamed from: o */
    private long f9376o = TimeUnit.SECONDS.toMillis(5);
    /* renamed from: q */
    private C3011i f9377q = null;
    /* renamed from: r */
    private Map<String, String> f9378r;
    /* renamed from: s */
    private boolean f9379s = false;
    /* renamed from: t */
    private long f9380t;
    /* renamed from: u */
    private ScheduledExecutorService f9381u = null;
    /* renamed from: v */
    private long f9382v;
    /* renamed from: w */
    private long f9383w;
    /* renamed from: y */
    private C0957b f9384y;
    /* renamed from: z */
    private Uri f9385z = null;

    /* renamed from: com.appsflyer.d$a */
    abstract class C0922a implements Runnable {
        /* renamed from: a */
        WeakReference<Context> f2448a = null;
        /* renamed from: b */
        final /* synthetic */ C3010d f2449b;
        /* renamed from: c */
        private String f2450c;
        /* renamed from: d */
        private ScheduledExecutorService f2451d;
        /* renamed from: e */
        private AtomicInteger f2452e = new AtomicInteger(0);

        /* renamed from: a */
        public abstract String mo1223a();

        /* renamed from: a */
        protected abstract void mo1224a(String str, int i);

        /* renamed from: a */
        protected abstract void mo1225a(Map<String, String> map);

        C0922a(C3010d c3010d, Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            this.f2449b = c3010d;
            this.f2448a = new WeakReference(context);
            this.f2450c = str;
            if (scheduledExecutorService == null) {
                this.f2451d = C0919a.m3116a().m3119c();
            } else {
                this.f2451d = scheduledExecutorService;
            }
        }

        public void run() {
            Throwable e;
            Throwable th;
            if (this.f2450c != null) {
                if (this.f2450c.length() != 0) {
                    if (!this.f2449b.m11750e()) {
                        this.f2452e.incrementAndGet();
                        HttpURLConnection httpURLConnection = null;
                        try {
                            Context context = (Context) this.f2448a.get();
                            if (context == null) {
                                this.f2452e.decrementAndGet();
                                return;
                            }
                            StringBuilder stringBuilder;
                            long currentTimeMillis = System.currentTimeMillis();
                            String a = this.f2449b.m11697e(context, this.f2449b.m11684b(new WeakReference(context)));
                            String str = "";
                            if (a != null) {
                                if (C3010d.f9359n.contains(a.toLowerCase())) {
                                    AFLogger.m3084e(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", new Object[]{a}));
                                } else {
                                    stringBuilder = new StringBuilder("-");
                                    stringBuilder.append(a);
                                    str = stringBuilder.toString();
                                }
                            }
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append(mo1223a());
                            stringBuilder2.append(context.getPackageName());
                            stringBuilder2.append(str);
                            stringBuilder2.append("?devkey=");
                            stringBuilder2.append(this.f2450c);
                            stringBuilder2.append("&device_id=");
                            stringBuilder2.append(C0961z.m3280a(new WeakReference(context)));
                            aa.m3121a().m3134a(stringBuilder2.toString(), "");
                            stringBuilder = new StringBuilder("Calling server for attribution url: ");
                            stringBuilder.append(stringBuilder2.toString());
                            C0932h.m3183b(stringBuilder.toString());
                            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(stringBuilder2.toString()).openConnection();
                            try {
                                httpURLConnection2.setRequestMethod("GET");
                                httpURLConnection2.setConnectTimeout(10000);
                                httpURLConnection2.setRequestProperty("Connection", "close");
                                httpURLConnection2.connect();
                                int responseCode = httpURLConnection2.getResponseCode();
                                String a2 = this.f2449b.m11726a(httpURLConnection2);
                                aa.m3121a().m3132a(stringBuilder2.toString(), responseCode, a2);
                                if (responseCode == Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                                    this.f2449b.m11659a(context, "appsflyerGetConversionDataTiming", (System.currentTimeMillis() - currentTimeMillis) / 1000);
                                    StringBuilder stringBuilder3 = new StringBuilder("Attribution data: ");
                                    stringBuilder3.append(a2);
                                    C0932h.m3183b(stringBuilder3.toString());
                                    if (a2.length() > 0 && context != null) {
                                        StringBuilder stringBuilder4;
                                        Map a3 = this.f2449b.m11700f(a2);
                                        String str2 = (String) a3.get("iscache");
                                        if (str2 != null && Boolean.toString(false).equals(str2)) {
                                            this.f2449b.m11659a(context, "appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                                        }
                                        if (a3.containsKey("af_siteid")) {
                                            if (a3.containsKey("af_channel")) {
                                                stringBuilder4 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                                stringBuilder4.append((String) a3.get("af_channel"));
                                                AFLogger.m3080c(stringBuilder4.toString());
                                            } else {
                                                AFLogger.m3080c(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", new Object[]{a3.get("af_siteid")}));
                                            }
                                        }
                                        if (a3.containsKey("af_siteid")) {
                                            stringBuilder4 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                            stringBuilder4.append((String) a3.get("af_channel"));
                                            AFLogger.m3080c(stringBuilder4.toString());
                                        }
                                        a3.put("is_first_launch", Boolean.toString(false));
                                        String jSONObject = new JSONObject(a3).toString();
                                        if (jSONObject != null) {
                                            this.f2449b.m11661a(context, "attributionId", jSONObject);
                                        } else {
                                            this.f2449b.m11661a(context, "attributionId", a2);
                                        }
                                        stringBuilder4 = new StringBuilder("iscache=");
                                        stringBuilder4.append(str2);
                                        stringBuilder4.append(" caching conversion data");
                                        AFLogger.m3080c(stringBuilder4.toString());
                                        if (C3010d.f9360p != null && this.f2452e.intValue() <= 1) {
                                            try {
                                                a3 = this.f2449b.m11707h(context);
                                            } catch (Throwable e2) {
                                                AFLogger.m3073a("Exception while trying to fetch attribution data. ", e2);
                                            }
                                            mo1225a(a3);
                                        }
                                    }
                                } else {
                                    StringBuilder stringBuilder5;
                                    if (C3010d.f9360p != null) {
                                        stringBuilder5 = new StringBuilder("Error connection to server: ");
                                        stringBuilder5.append(responseCode);
                                        mo1224a(stringBuilder5.toString(), responseCode);
                                    }
                                    stringBuilder5 = new StringBuilder("AttributionIdFetcher response code: ");
                                    stringBuilder5.append(responseCode);
                                    stringBuilder5.append("  url: ");
                                    stringBuilder5.append(stringBuilder2);
                                    C0932h.m3183b(stringBuilder5.toString());
                                }
                                this.f2452e.decrementAndGet();
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                this.f2452e.decrementAndGet();
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                                throw th;
                            }
                            this.f2451d.shutdown();
                        } catch (Throwable th3) {
                            e2 = th3;
                            if (C3010d.f9360p != null) {
                                mo1224a(e2.getMessage(), 0);
                            }
                            AFLogger.m3073a(e2.getMessage(), e2);
                            this.f2452e.decrementAndGet();
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            this.f2451d.shutdown();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.appsflyer.d$b */
    class C0923b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3010d f2453a;
        /* renamed from: b */
        private WeakReference<Context> f2454b = null;

        public C0923b(C3010d c3010d, Context context) {
            this.f2453a = c3010d;
            this.f2454b = new WeakReference(context);
        }

        public final void run() {
            if (!this.f2453a.f9379s) {
                this.f2453a.f9380t = System.currentTimeMillis();
                if (this.f2454b != null) {
                    this.f2453a.f9379s = true;
                    try {
                        String b = this.f2453a.m11694d("AppsFlyerKey");
                        synchronized (this.f2454b) {
                            for (C0918b c0918b : C0917a.m3104a().m3110b((Context) this.f2454b.get())) {
                                StringBuilder stringBuilder = new StringBuilder("resending request: ");
                                stringBuilder.append(c0918b.m3114c());
                                AFLogger.m3083d(stringBuilder.toString());
                                try {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long parseLong = Long.parseLong(c0918b.m3115d(), 10);
                                    C3010d c3010d = this.f2453a;
                                    StringBuilder stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append(c0918b.m3114c());
                                    stringBuilder2.append("&isCachedRequest=true&timeincache=");
                                    stringBuilder2.append(Long.toString((currentTimeMillis - parseLong) / 1000));
                                    c3010d.m11676a(stringBuilder2.toString(), c0918b.m3113b(), b, this.f2454b, c0918b.m3115d(), false);
                                } catch (Throwable e) {
                                    AFLogger.m3073a("Failed to resend cached request", e);
                                }
                            }
                        }
                    } catch (Throwable e2) {
                        try {
                            AFLogger.m3073a("failed to check cache. ", e2);
                        } catch (Throwable th) {
                            this.f2453a.f9379s = false;
                        }
                    }
                    this.f2453a.f9379s = false;
                    this.f2453a.f9381u.shutdown();
                    this.f2453a.f9381u = null;
                }
            }
        }
    }

    /* renamed from: com.appsflyer.d$c */
    class C0924c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3010d f2455a;
        /* renamed from: b */
        private final Intent f2456b;
        /* renamed from: c */
        private WeakReference<Context> f2457c;
        /* renamed from: d */
        private String f2458d;
        /* renamed from: e */
        private String f2459e;
        /* renamed from: f */
        private String f2460f;
        /* renamed from: g */
        private String f2461g;
        /* renamed from: h */
        private ExecutorService f2462h;
        /* renamed from: i */
        private boolean f2463i;
        /* renamed from: j */
        private boolean f2464j;

        private C0924c(C3010d c3010d, WeakReference<Context> weakReference, String str, String str2, String str3, String str4, boolean z, ExecutorService executorService, boolean z2, Intent intent) {
            this.f2455a = c3010d;
            this.f2457c = weakReference;
            this.f2458d = str;
            this.f2459e = str2;
            this.f2460f = str3;
            this.f2461g = str4;
            this.f2463i = z;
            this.f2462h = executorService;
            this.f2464j = z2;
            this.f2456b = intent;
        }

        public final void run() {
            this.f2455a.m11663a((Context) this.f2457c.get(), this.f2458d, this.f2459e, this.f2460f, this.f2461g, this.f2463i, this.f2464j, this.f2456b);
        }
    }

    /* renamed from: com.appsflyer.d$e */
    class C0925e implements Runnable {
        /* renamed from: a */
        Map<String, Object> f2465a;
        /* renamed from: b */
        boolean f2466b;
        /* renamed from: c */
        final /* synthetic */ C3010d f2467c;
        /* renamed from: d */
        private String f2468d;
        /* renamed from: e */
        private WeakReference<Context> f2469e;
        /* renamed from: f */
        private int f2470f;

        private C0925e(C3010d c3010d, String str, Map<String, Object> map, Context context, boolean z, int i) {
            this.f2467c = c3010d;
            this.f2469e = null;
            this.f2468d = str;
            this.f2465a = map;
            this.f2469e = new WeakReference(context);
            this.f2466b = z;
            this.f2470f = i;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            r10 = this;
            r0 = r10.f2467c;
            r0 = r0.m11750e();
            if (r0 == 0) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r0 = 0;
            r1 = r10.f2466b;
            if (r1 == 0) goto L_0x0028;
        L_0x000e:
            r1 = r10.f2470f;
            r2 = 2;
            if (r1 > r2) goto L_0x0028;
        L_0x0013:
            r1 = r10.f2467c;
            r1 = r1.m11717m();
            if (r1 == 0) goto L_0x0028;
        L_0x001b:
            r1 = r10.f2465a;
            r2 = "rfr";
            r3 = r10.f2467c;
            r3 = r3.f9378r;
            r1.put(r2, r3);
        L_0x0028:
            r1 = r10.f2465a;	 Catch:{ IOException -> 0x0059, Throwable -> 0x0050 }
            r2 = "appsflyerKey";
            r1 = r1.get(r2);	 Catch:{ IOException -> 0x0059, Throwable -> 0x0050 }
            r5 = r1;
            r5 = (java.lang.String) r5;	 Catch:{ IOException -> 0x0059, Throwable -> 0x0050 }
            r1 = r10.f2465a;	 Catch:{ IOException -> 0x0059, Throwable -> 0x0050 }
            r1 = com.appsflyer.C0920b.m3146a(r1);	 Catch:{ IOException -> 0x0059, Throwable -> 0x0050 }
            r1 = r1.toString();	 Catch:{ IOException -> 0x0059, Throwable -> 0x0050 }
            r2 = r10.f2467c;	 Catch:{ IOException -> 0x004b, Throwable -> 0x0050 }
            r3 = r10.f2468d;	 Catch:{ IOException -> 0x004b, Throwable -> 0x0050 }
            r6 = r10.f2469e;	 Catch:{ IOException -> 0x004b, Throwable -> 0x0050 }
            r7 = 0;
            r8 = r10.f2466b;	 Catch:{ IOException -> 0x004b, Throwable -> 0x0050 }
            r4 = r1;
            r2.m11676a(r3, r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x004b, Throwable -> 0x0050 }
            return;
        L_0x004b:
            r0 = move-exception;
            r9 = r1;
            r1 = r0;
            r0 = r9;
            goto L_0x005a;
        L_0x0050:
            r0 = move-exception;
            r1 = r0.getMessage();
            com.appsflyer.AFLogger.m3073a(r1, r0);
            return;
        L_0x0059:
            r1 = move-exception;
        L_0x005a:
            r2 = "Exception while sending request to server. ";
            com.appsflyer.AFLogger.m3073a(r2, r1);
            if (r0 == 0) goto L_0x008e;
        L_0x0061:
            r2 = r10.f2469e;
            if (r2 == 0) goto L_0x008e;
        L_0x0065:
            r2 = r10.f2468d;
            r3 = "&isCachedRequest=true&timeincache=";
            r2 = r2.contains(r3);
            if (r2 != 0) goto L_0x008e;
        L_0x006f:
            r2 = com.appsflyer.p022a.C0917a.m3104a();
            r3 = new com.appsflyer.a.b;
            r4 = r10.f2468d;
            r5 = "4.8.7";
            r3.<init>(r4, r0, r5);
            r0 = r10.f2469e;
            r0 = r0.get();
            r0 = (android.content.Context) r0;
            r2.m3108a(r3, r0);
            r0 = r1.getMessage();
            com.appsflyer.AFLogger.m3073a(r0, r1);
        L_0x008e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.d.e.run():void");
        }
    }

    /* renamed from: com.appsflyer.d$1 */
    class C30071 implements C0957b {
        /* renamed from: a */
        final /* synthetic */ C3010d f9346a;

        C30071(C3010d c3010d) {
            this.f9346a = c3010d;
        }

        /* renamed from: a */
        public final void mo1219a(Activity activity) {
            if (2 > this.f9346a.m11722a(this.f9346a.m11746c((Context) activity), false)) {
                C0946p.m3226a((Context) activity).m3230a();
            }
            C0932h.m3182b((Context) activity);
        }

        /* renamed from: a */
        public final void mo1220a(WeakReference<Context> weakReference) {
            C0932h.m3186c((Context) weakReference.get());
            C0946p.m3226a((Context) weakReference.get()).m3231b();
        }
    }

    /* renamed from: com.appsflyer.d$d */
    class C3009d extends C0922a {
        /* renamed from: c */
        final /* synthetic */ C3010d f9350c;

        public C3009d(C3010d c3010d, Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            this.f9350c = c3010d;
            super(c3010d, context, str, scheduledExecutorService);
        }

        /* renamed from: a */
        public final String mo1223a() {
            return C0929g.m3169b("https://api.%s/install_data/v3/");
        }

        /* renamed from: a */
        protected final void mo1225a(Map<String, String> map) {
            map.put("is_first_launch", Boolean.toString(true));
            C3010d.f9360p.onInstallConversionDataLoaded(map);
            this.f9350c.m11658a((Context) this.a.get(), "appsflyerConversionDataRequestRetries", 0);
        }

        /* renamed from: a */
        protected final void mo1224a(String str, int i) {
            C3010d.f9360p.onInstallConversionFailure(str);
            if (i >= 400 && i < 500) {
                this.f9350c.m11658a((Context) this.a.get(), "appsflyerConversionDataRequestRetries", this.f9350c.m11746c((Context) this.a.get()).getInt("appsflyerConversionDataRequestRetries", 0) + 1);
            }
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f9351a);
        stringBuilder.append("/androidevent?buildnumber=4.8.7");
        stringBuilder.append("&app_id=");
        f9357j = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://attr.%s/api/v");
        stringBuilder.append(f9357j);
        f9352b = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://t.%s/api/v");
        stringBuilder.append(f9357j);
        f9353c = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://events.%s/api/v");
        stringBuilder.append(f9357j);
        f9354d = stringBuilder.toString();
        stringBuilder = new StringBuilder("https://register.%s/api/v");
        stringBuilder.append(f9357j);
        f9355e = stringBuilder.toString();
    }

    /* renamed from: a */
    void m11728a() {
        this.f9382v = System.currentTimeMillis();
    }

    /* renamed from: b */
    void m11741b() {
        this.f9383w = System.currentTimeMillis();
    }

    /* renamed from: a */
    void m11731a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("shouldMonitor");
        if (stringExtra != null) {
            AFLogger.m3083d("Turning on monitoring.");
            AppsFlyerProperties.m3086a().m3093a("shouldMonitor", stringExtra.equals("true"));
            m11662a(context, (String) null, "START_TRACKING", context.getPackageName());
            return;
        }
        AFLogger.m3083d("****** onReceive called *******");
        AppsFlyerProperties.m3086a().m3099c();
        stringExtra = intent.getStringExtra("referrer");
        StringBuilder stringBuilder = new StringBuilder("Play store referrer: ");
        stringBuilder.append(stringExtra);
        AFLogger.m3083d(stringBuilder.toString());
        if (stringExtra != null) {
            if ("AppsFlyer_Test".equals(intent.getStringExtra("TestIntegrationMode"))) {
                Editor edit = m11746c(context).edit();
                edit.clear();
                m11735a(edit);
                AppsFlyerProperties.m3086a().m3094a(false);
                m11709i();
            }
            m11661a(context, "referrer", stringExtra);
            AppsFlyerProperties.m3086a().m3097b(stringExtra);
            if (AppsFlyerProperties.m3086a().m3100d()) {
                AFLogger.m3083d("onReceive: isLaunchCalled");
                m11660a(context, stringExtra, intent);
            }
        }
    }

    /* renamed from: a */
    void m11732a(android.content.Context r8, java.lang.String r9) {
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
        r7 = this;
        r0 = new java.lang.StringBuilder;
        r1 = "received a new (extra) referrer: ";
        r0.<init>(r1);
        r0.append(r9);
        r0 = r0.toString();
        com.appsflyer.AFLogger.m3080c(r0);
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r2 = "appsflyer-data";	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r3 = 0;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r2 = r8.getSharedPreferences(r2, r3);	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r3 = "extraReferrers";	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r4 = 0;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r2 = r2.getString(r3, r4);	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        if (r2 != 0) goto L_0x0033;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
    L_0x0025:
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r2.<init>();	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r3 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r3.<init>();	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r6 = r3;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r3 = r2;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r2 = r6;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        goto L_0x004f;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
    L_0x0033:
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r3.<init>(r2);	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r2 = r3.has(r9);	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        if (r2 == 0) goto L_0x004a;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
    L_0x003e:
        r2 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r4 = r3.get(r9);	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r4 = (java.lang.String) r4;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r2.<init>(r4);	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        goto L_0x004f;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
    L_0x004a:
        r2 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r2.<init>();	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
    L_0x004f:
        r4 = r2.length();	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r5 = 4;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        if (r4 > r5) goto L_0x0059;	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
    L_0x0056:
        r2.put(r0);	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
    L_0x0059:
        r0 = r2.toString();	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r3.put(r9, r0);	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r0 = "extraReferrers";	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r1 = r3.toString();	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        r7.m11661a(r8, r0, r1);	 Catch:{ JSONException -> 0x0082, Throwable -> 0x006a }
        return;
    L_0x006a:
        r8 = move-exception;
        r0 = new java.lang.StringBuilder;
        r1 = "Couldn't save referrer - ";
        r0.<init>(r1);
        r0.append(r9);
        r9 = ": ";
        r0.append(r9);
        r9 = r0.toString();
        com.appsflyer.AFLogger.m3073a(r9, r8);
        return;
    L_0x0082:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.d.a(android.content.Context, java.lang.String):void");
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    void m11735a(Editor editor) {
        if (VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            editor.commit();
        }
    }

    /* renamed from: i */
    private void m11709i() {
        AFLogger.m3083d("Test mode started..");
        this.f9362A = System.currentTimeMillis();
    }

    /* renamed from: j */
    private void m11710j() {
        AFLogger.m3083d("Test mode ended!");
        this.f9362A = 0;
    }

    /* renamed from: e */
    private boolean m11699e(Context context) {
        long currentTimeMillis = System.currentTimeMillis() - this.f9362A;
        context = AppsFlyerProperties.m3086a().m3089a(context);
        return (currentTimeMillis > 30000 || context == null || context.contains("AppsFlyer_Test") == null) ? null : true;
    }

    private C3010d() {
    }

    /* renamed from: c */
    public static C3010d m11689c() {
        return f9361x;
    }

    /* renamed from: b */
    private void m11686b(Application application) {
        AppsFlyerProperties.m3086a().m3096b(application.getApplicationContext());
        if (VERSION.SDK_INT < 14) {
            AFLogger.m3083d("SDK<14 call trackEvent manually");
            C0932h.m3182b((Context) application);
        } else if (VERSION.SDK_INT >= 14 && this.f9384y == null) {
            C0958w.m3263a();
            this.f9384y = new C30071(this);
            C0958w.m3266b().m3269a(application, this.f9384y);
        }
    }

    /* renamed from: a */
    public void m11736a(String str) {
        aa.m3121a().m3135a("setAndroidIdData", str);
        this.f9372h = str;
    }

    /* renamed from: a */
    private void m11661a(Context context, String str, String str2) {
        Editor edit = m11746c(context).edit();
        edit.putString(str, str2);
        m11735a(edit);
    }

    /* renamed from: a */
    private void m11658a(Context context, String str, int i) {
        Editor edit = m11746c(context).edit();
        edit.putInt(str, i);
        m11735a(edit);
    }

    /* renamed from: a */
    private void m11659a(Context context, String str, long j) {
        m11668a(m11746c(context), str, j);
    }

    /* renamed from: a */
    private void m11668a(SharedPreferences sharedPreferences, String str, long j) {
        Editor edit = sharedPreferences.edit();
        edit.putLong(str, j);
        m11735a(edit);
    }

    /* renamed from: a */
    private void m11675a(String str, String str2) {
        AppsFlyerProperties.m3086a().m3092a(str, str2);
    }

    /* renamed from: d */
    private String m11694d(String str) {
        return AppsFlyerProperties.m3086a().m3090a(str);
    }

    /* renamed from: b */
    public void m11744b(String str) {
        aa.m3121a().m3135a("setCustomerUserId", str);
        StringBuilder stringBuilder = new StringBuilder("setCustomerUserId = ");
        stringBuilder.append(str);
        AFLogger.m3083d(stringBuilder.toString());
        m11675a("AppUserId", str);
    }

    /* renamed from: a */
    public C3010d m11723a(String str, AppsFlyerConversionListener appsFlyerConversionListener) {
        aa a = aa.m3121a();
        String str2 = "init";
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = appsFlyerConversionListener == null ? ManagerWebServices.NULL_STRING_VALUE : "conversionDataListener";
        a.m3135a(str2, strArr);
        AFLogger.m3077b(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{"4.8.7", "364"}));
        this.f9367F = true;
        m11675a("AppsFlyerKey", str);
        C0932h.m3177a(str);
        f9360p = appsFlyerConversionListener;
        return this;
    }

    /* renamed from: a */
    public C3010d m11724a(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        if (context != null && m11701f(context)) {
            if (this.f9377q == null) {
                this.f9377q = new C3011i();
                this.f9377q.m11753a(context, (C0933j) this);
            } else {
                AFLogger.m3084e("AFInstallReferrer instance already created");
            }
        }
        return m11723a(str, appsFlyerConversionListener);
    }

    /* renamed from: f */
    private boolean m11701f(@android.support.annotation.NonNull android.content.Context r4) {
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
        r0 = r3.m11746c(r4);
        r1 = 0;
        r0 = r3.m11722a(r0, r1);
        r2 = 2;
        if (r0 <= r2) goto L_0x0012;
    L_0x000c:
        r4 = "Install referrer will not load, the counter > 2, ";
        com.appsflyer.AFLogger.m3072a(r4);
        return r1;
    L_0x0012:
        r0 = "com.android.installreferrer.api.InstallReferrerClient";	 Catch:{ ClassNotFoundException -> 0x0033, Throwable -> 0x002c }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0033, Throwable -> 0x002c }
        r0 = "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE";	 Catch:{ ClassNotFoundException -> 0x0033, Throwable -> 0x002c }
        r4 = com.appsflyer.C0932h.m3180a(r4, r0);	 Catch:{ ClassNotFoundException -> 0x0033, Throwable -> 0x002c }
        if (r4 == 0) goto L_0x0026;	 Catch:{ ClassNotFoundException -> 0x0033, Throwable -> 0x002c }
    L_0x001f:
        r4 = "Install referrer is allowed";	 Catch:{ ClassNotFoundException -> 0x0033, Throwable -> 0x002c }
        com.appsflyer.AFLogger.m3080c(r4);	 Catch:{ ClassNotFoundException -> 0x0033, Throwable -> 0x002c }
        r4 = 1;
        return r4;
    L_0x0026:
        r4 = "Install referrer is not allowed";
        com.appsflyer.AFLogger.m3080c(r4);
        return r1;
    L_0x002c:
        r4 = move-exception;
        r0 = "An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient";
        com.appsflyer.AFLogger.m3073a(r0, r4);
        return r1;
    L_0x0033:
        r4 = "Class com.android.installreferrer.api.InstallReferrerClient not found";
        com.appsflyer.AFLogger.m3072a(r4);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.d.f(android.content.Context):boolean");
    }

    /* renamed from: a */
    public void m11729a(Application application) {
        if (this.f9367F) {
            m11730a(application, null);
        } else {
            AFLogger.m3084e("ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking(Application)' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        }
    }

    /* renamed from: a */
    public void m11730a(Application application, String str) {
        aa.m3121a().m3135a("startTracking", str);
        AFLogger.m3083d(String.format("Starting AppsFlyer Tracking: (v%s.%s)", new Object[]{"4.8.7", "364"}));
        AFLogger.m3083d("Build Number: 364");
        AppsFlyerProperties.m3086a().m3096b(application.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            m11675a("AppsFlyerKey", str);
            C0932h.m3177a(str);
        } else if (TextUtils.isEmpty(m11694d("AppsFlyerKey")) != null) {
            AFLogger.m3084e("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).");
            return;
        }
        m11686b(application);
    }

    /* renamed from: g */
    private void m11704g(Context context) {
        int i;
        if (C0932h.m3184b()) {
            i = 23;
            AFLogger.m3072a("OPPO device found");
        } else {
            i = 18;
        }
        if (VERSION.SDK_INT >= i) {
            StringBuilder stringBuilder = new StringBuilder("OS SDK is=");
            stringBuilder.append(VERSION.SDK_INT);
            stringBuilder.append("; use KeyStore");
            AFLogger.m3072a(stringBuilder.toString());
            C0921c c0921c = new C0921c(context);
            if (c0921c.m3155b()) {
                c0921c.m3153a();
                m11675a("KSAppsFlyerId", c0921c.m3156c());
                m11675a("KSAppsFlyerRICounter", String.valueOf(c0921c.m3157d()));
                return;
            }
            c0921c.m3154a(C0961z.m3280a(new WeakReference(context)));
            m11675a("KSAppsFlyerId", c0921c.m3156c());
            m11675a("KSAppsFlyerRICounter", String.valueOf(c0921c.m3157d()));
        } else {
            context = new StringBuilder("OS SDK is=");
            context.append(VERSION.SDK_INT);
            context.append("; no KeyStore usage");
            AFLogger.m3072a(context.toString());
        }
    }

    /* renamed from: k */
    private String m11712k() {
        return m11694d("AppUserId");
    }

    /* renamed from: l */
    private String m11714l() {
        return m11694d("appid");
    }

    /* renamed from: a */
    void m11737a(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.m3083d("app went to background");
            SharedPreferences sharedPreferences = ((Context) weakReference.get()).getSharedPreferences("appsflyer-data", 0);
            AppsFlyerProperties.m3086a().m3091a(sharedPreferences);
            long j = this.f9383w - this.f9382v;
            Map hashMap = new HashMap();
            String d = m11694d("AppsFlyerKey");
            if (d == null) {
                AFLogger.m3084e("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            Object d2 = m11694d("KSAppsFlyerId");
            if (AppsFlyerProperties.m3086a().m3098b("deviceTrackingDisabled", false)) {
                hashMap.put("deviceTrackingDisabled", "true");
            }
            C0940m a = C0932h.m3173a(((Context) weakReference.get()).getContentResolver());
            if (a != null) {
                hashMap.put("amazon_aid", a.m3208a());
                hashMap.put("amazon_aid_limit", String.valueOf(a.m3209b()));
            }
            String a2 = AppsFlyerProperties.m3086a().m3090a("advertiserId");
            if (a2 != null) {
                hashMap.put("advertiserId", a2);
            }
            hashMap.put("app_id", ((Context) weakReference.get()).getPackageName());
            hashMap.put("devkey", d);
            hashMap.put(InstrumentationConstantsKt.FIELD_UID, C0961z.m3280a((WeakReference) weakReference));
            hashMap.put("time_in_app", String.valueOf(j / 1000));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(m11722a(sharedPreferences, false)));
            hashMap.put("gcd_conversion_data_timing", Long.toString(sharedPreferences.getLong("appsflyerGetConversionDataTiming", 0)));
            hashMap.put("channel", m11684b((WeakReference) weakReference));
            weakReference = "originalAppsflyerId";
            if (d2 == null) {
                d2 = "";
            }
            hashMap.put(weakReference, d2);
            if (this.f9369H != null) {
                try {
                    weakReference = new C0955v(null, m11750e());
                    weakReference.f2534a = hashMap;
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        AFLogger.m3080c("Main thread detected. Running callStats task in a new thread.");
                        weakReference.execute(new String[]{C0929g.m3169b("https://stats.%s/stats")});
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Running callStats task (on current thread: ");
                        stringBuilder.append(Thread.currentThread().toString());
                        stringBuilder.append(" )");
                        AFLogger.m3080c(stringBuilder.toString());
                        weakReference.onPreExecute();
                        weakReference.m3258a(weakReference.m3257a(C0929g.m3169b("https://stats.%s/stats")));
                        return;
                    }
                } catch (Throwable th) {
                    AFLogger.m3073a("Could not send callStats request", th);
                    return;
                }
            }
            AFLogger.m3080c("Stats call is disabled, ignore ...");
        }
    }

    /* renamed from: a */
    public void m11734a(Context context, String str, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject(map == null ? new HashMap() : map);
        aa.m3121a().m3135a("trackEvent", str, jSONObject.toString());
        m11743b(context, str, map);
    }

    /* renamed from: b */
    void m11743b(Context context, String str, Map<String, Object> map) {
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (m11694d("AppsFlyerKey") == null) {
            AFLogger.m3084e("[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        if (map == null) {
            map = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(map);
        map = AppsFlyerProperties.m3086a().m3089a(context);
        String jSONObject2 = jSONObject.toString();
        if (map == null) {
            map = "";
        }
        m11733a(context, null, str, jSONObject2, (String) map, true, intent);
    }

    /* renamed from: a */
    private void m11662a(Context context, String str, String str2, String str3) {
        if (AppsFlyerProperties.m3086a().m3098b("shouldMonitor", false)) {
            Intent intent = new Intent("com.appsflyer.MonitorBroadcast");
            intent.setPackage("com.appsflyer.nightvision");
            intent.putExtra("message", str2);
            intent.putExtra("value", str3);
            intent.putExtra("packageName", "true");
            intent.putExtra("pid", new Integer(Process.myPid()));
            intent.putExtra("eventIdentifier", str);
            intent.putExtra("sdk", "4.8.7");
            context.sendBroadcast(intent);
        }
    }

    /* renamed from: b */
    void m11742b(Context context, String str) {
        Map hashMap = new HashMap();
        String d = m11694d("AppsFlyerKey");
        if (d == null) {
            AFLogger.m3084e("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            hashMap.put("app_version_name", packageInfo.versionName);
            hashMap.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            hashMap.put("installDate", m11653a(m11698e("yyyy-MM-dd_HHmmssZ"), packageInfo.firstInstallTime));
        } catch (Throwable th) {
            AFLogger.m3073a("Exception while collecting application version info.", th);
        }
        m11664a(context, hashMap);
        String k = m11712k();
        if (k != null) {
            hashMap.put("appUserId", k);
        }
        try {
            hashMap.put("model", Build.MODEL);
            hashMap.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.m3073a("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.m3086a().m3098b("deviceTrackingDisabled", false)) {
            hashMap.put("deviceTrackingDisabled", "true");
        }
        C0940m a = C0932h.m3173a(context.getContentResolver());
        if (a != null) {
            hashMap.put("amazon_aid", a.m3208a());
            hashMap.put("amazon_aid_limit", String.valueOf(a.m3209b()));
        }
        k = AppsFlyerProperties.m3086a().m3090a("advertiserId");
        if (k != null) {
            hashMap.put("advertiserId", k);
        }
        hashMap.put("devkey", d);
        hashMap.put(InstrumentationConstantsKt.FIELD_UID, C0961z.m3280a(new WeakReference(context)));
        hashMap.put("af_gcm_token", str);
        hashMap.put("launch_counter", Integer.toString(m11722a(m11746c(context), false)));
        hashMap.put("sdk", Integer.toString(VERSION.SDK_INT));
        str = m11684b(new WeakReference(context));
        if (str != null) {
            hashMap.put("channel", str);
        }
        try {
            str = new C0955v(context, m11750e());
            str.f2534a = hashMap;
            context = new StringBuilder();
            context.append(C0929g.m3169b(f9355e));
            context.append(packageName);
            str.execute(new String[]{context.toString()});
        } catch (Throwable th3) {
            AFLogger.m3073a(th3.getMessage(), th3);
        }
    }

    /* renamed from: c */
    private static void m11690c(Context context, String str) {
        Intent intent = new Intent("com.appsflyer.testIntgrationBroadcast");
        intent.putExtra("params", str);
        context.sendBroadcast(intent);
    }

    /* renamed from: h */
    private Map<String, String> m11707h(Context context) throws C0941n {
        String string = context.getSharedPreferences("appsflyer-data", 0).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return m11700f(string);
        }
        throw new C0941n();
    }

    /* renamed from: d */
    private Map<String, String> m11695d(Context context, String str) {
        Map<String, String> linkedHashMap = new LinkedHashMap();
        Object obj = null;
        for (String str2 : str.split("&")) {
            Object substring;
            int indexOf = str2.indexOf("=");
            Object substring2 = indexOf > 0 ? str2.substring(0, indexOf) : str2;
            if (!linkedHashMap.containsKey(substring2)) {
                if (substring2.equals("c")) {
                    substring2 = ManagerWebServices.PARAM_DISCOUNT_CAMPAIGN;
                } else if (substring2.equals("pid")) {
                    substring2 = "media_source";
                } else if (substring2.equals("af_prt")) {
                    substring2 = "agency";
                    obj = 1;
                }
                linkedHashMap.put(substring2, "");
            }
            if (indexOf > 0) {
                indexOf++;
                if (str2.length() > indexOf) {
                    substring = str2.substring(indexOf);
                    linkedHashMap.put(substring2, substring);
                }
            }
            substring = null;
            linkedHashMap.put(substring2, substring);
        }
        try {
            if (linkedHashMap.containsKey("install_time") == null) {
                linkedHashMap.put("install_time", m11653a(m11698e("yyyy-MM-dd HH:mm:ss"), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
            }
        } catch (Throwable e) {
            AFLogger.m3073a("Could not fetch install time. ", e);
        }
        if (linkedHashMap.containsKey("af_status") == null) {
            linkedHashMap.put("af_status", "Non-organic");
        }
        if (obj != null) {
            linkedHashMap.remove("media_source");
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private String m11653a(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(j));
    }

    /* renamed from: e */
    private SimpleDateFormat m11698e(String str) {
        return new SimpleDateFormat(str, Locale.US);
    }

    /* renamed from: f */
    private Map<String, String> m11700f(String str) {
        Map<String, String> hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            str = jSONObject.keys();
            while (str.hasNext()) {
                String str2 = (String) str.next();
                if (!f9358m.contains(str2)) {
                    CharSequence string = jSONObject.getString(str2);
                    if (!(TextUtils.isEmpty(string) || ManagerWebServices.NULL_STRING_VALUE.equals(string))) {
                        hashMap.put(str2, string);
                    }
                }
            }
            return hashMap;
        } catch (Throwable e) {
            AFLogger.m3073a(e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: a */
    void m11733a(Context context, String str, String str2, String str3, String str4, boolean z, Intent intent) {
        C3010d c3010d;
        Context applicationContext = context.getApplicationContext();
        if ((str2 == null ? 1 : null) != null) {
            if (!AppsFlyerProperties.m3086a().m3098b("launchProtectEnabled", true)) {
                AFLogger.m3083d("Allowing multiple launches within a 5 second time window.");
            } else if (m11749d()) {
                return;
            }
            this.f9374k = System.currentTimeMillis();
        } else {
            c3010d = this;
        }
        ScheduledThreadPoolExecutor c = C0919a.m3116a().m3119c();
        C3010d c3010d2 = c3010d;
        c3010d2.m11679a((ScheduledExecutorService) c, (Runnable) new C0924c(new WeakReference(applicationContext), str, str2, str3, str4, z, c, false, intent), 150, TimeUnit.MILLISECONDS);
    }

    /* renamed from: d */
    boolean m11749d() {
        if (this.f9374k > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f9374k;
            SimpleDateFormat e = m11698e("yyyy/MM/dd HH:mm:ss.SSS Z");
            String a = m11653a(e, this.f9374k);
            String a2 = m11653a(e, this.f9375l);
            if (currentTimeMillis < this.f9376o && !m11750e()) {
                AFLogger.m3083d(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{a, a2, Long.valueOf(currentTimeMillis), Long.valueOf(this.f9376o)}));
                return true;
            } else if (!m11750e()) {
                AFLogger.m3083d(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{a, a2, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!m11750e()) {
            AFLogger.m3083d("Sending first launch for this session!");
        }
        return false;
    }

    /* renamed from: a */
    private void m11660a(Context context, String str, Intent intent) {
        if (str != null && str.length() > 5) {
            ScheduledThreadPoolExecutor c = C0919a.m3116a().m3119c();
            C0924c c0924c = new C0924c(new WeakReference(context.getApplicationContext()), null, null, null, str, true, c, true, intent);
            m11679a((ScheduledExecutorService) c, (Runnable) c0924c, 5, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    private void m11663a(Context context, String str, String str2, String str3, String str4, boolean z, boolean z2, Intent intent) {
        if (context == null) {
            AFLogger.m3080c("sendTrackingWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences c = m11746c(context);
        AppsFlyerProperties.m3086a().m3091a(c);
        if (!m11750e()) {
            StringBuilder stringBuilder = new StringBuilder("sendTrackingWithEvent from activity: ");
            stringBuilder.append(context.getClass().getName());
            AFLogger.m3083d(stringBuilder.toString());
        }
        boolean z3 = str2 == null;
        Map a = m11727a(context, str, str2, str3, str4, z, c, z3, intent);
        String str5 = (String) a.get("appsflyerKey");
        if (str5 != null) {
            if (str5.length() != 0) {
                if (!m11750e()) {
                    AFLogger.m3083d("AppsFlyerLib.sendTrackingWithEvent");
                }
                if (!z3) {
                    str5 = C0929g.m3169b(f9354d);
                } else if (z2) {
                    str5 = C0929g.m3169b(f9352b);
                } else {
                    str5 = C0929g.m3169b(f9353c);
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str5);
                stringBuilder2.append(context.getPackageName());
                Runnable c0925e = new C0925e(stringBuilder2.toString(), a, context.getApplicationContext(), z3, m11722a(c, false));
                if (z3 && m11701f(context) && !m11717m()) {
                    AFLogger.m3080c("Failed to get new referrer, wait ...");
                    m11679a(C0919a.m3116a().m3119c(), c0925e, 500, TimeUnit.MILLISECONDS);
                    return;
                }
                c0925e.run();
                return;
            }
        }
        C3010d c3010d = this;
        AFLogger.m3080c("Not sending data yet, waiting for dev key");
    }

    /* renamed from: m */
    private boolean m11717m() {
        return this.f9378r != null && this.f9378r.size() > 0;
    }

    /* renamed from: a */
    java.util.Map<java.lang.String, java.lang.Object> m11727a(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, android.content.SharedPreferences r23, boolean r24, android.content.Intent r25) {
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
        r16 = this;
        r1 = r16;
        r2 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r6 = r23;
        r7 = r24;
        r8 = new java.util.HashMap;
        r8.<init>();
        com.appsflyer.C0932h.m3176a(r2, r8);
        r9 = "af_timestamp";
        r10 = new java.util.Date;
        r10.<init>();
        r10 = r10.getTime();
        r10 = java.lang.Long.toString(r10);
        r8.put(r9, r10);
        r9 = r16.m11750e();	 Catch:{ Throwable -> 0x0598 }
        if (r9 != 0) goto L_0x0046;	 Catch:{ Throwable -> 0x0598 }
    L_0x002e:
        r9 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0598 }
        r10 = "******* sendTrackingWithEvent: ";	 Catch:{ Throwable -> 0x0598 }
        r9.<init>(r10);	 Catch:{ Throwable -> 0x0598 }
        if (r7 == 0) goto L_0x003a;	 Catch:{ Throwable -> 0x0598 }
    L_0x0037:
        r10 = "Launch";	 Catch:{ Throwable -> 0x0598 }
        goto L_0x003b;	 Catch:{ Throwable -> 0x0598 }
    L_0x003a:
        r10 = r4;	 Catch:{ Throwable -> 0x0598 }
    L_0x003b:
        r9.append(r10);	 Catch:{ Throwable -> 0x0598 }
        r9 = r9.toString();	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3083d(r9);	 Catch:{ Throwable -> 0x0598 }
        goto L_0x004b;	 Catch:{ Throwable -> 0x0598 }
    L_0x0046:
        r9 = "SDK tracking has been stopped";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3083d(r9);	 Catch:{ Throwable -> 0x0598 }
    L_0x004b:
        r9 = "AppsFlyer_4.8.7";	 Catch:{ Throwable -> 0x0598 }
        r10 = "EVENT_CREATED_WITH_NAME";	 Catch:{ Throwable -> 0x0598 }
        if (r7 == 0) goto L_0x0054;	 Catch:{ Throwable -> 0x0598 }
    L_0x0051:
        r11 = "Launch";	 Catch:{ Throwable -> 0x0598 }
        goto L_0x0055;	 Catch:{ Throwable -> 0x0598 }
    L_0x0054:
        r11 = r4;	 Catch:{ Throwable -> 0x0598 }
    L_0x0055:
        r1.m11662a(r2, r9, r10, r11);	 Catch:{ Throwable -> 0x0598 }
        r9 = com.appsflyer.p022a.C0917a.m3104a();	 Catch:{ Throwable -> 0x0598 }
        r9.m3107a(r2);	 Catch:{ Throwable -> 0x0598 }
        r9 = 0;
        r10 = r17.getPackageManager();	 Catch:{ Exception -> 0x00a1 }
        r11 = r17.getPackageName();	 Catch:{ Exception -> 0x00a1 }
        r12 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;	 Catch:{ Exception -> 0x00a1 }
        r10 = r10.getPackageInfo(r11, r12);	 Catch:{ Exception -> 0x00a1 }
        r10 = r10.requestedPermissions;	 Catch:{ Exception -> 0x00a1 }
        r10 = java.util.Arrays.asList(r10);	 Catch:{ Exception -> 0x00a1 }
        r11 = "android.permission.INTERNET";	 Catch:{ Exception -> 0x00a1 }
        r11 = r10.contains(r11);	 Catch:{ Exception -> 0x00a1 }
        if (r11 != 0) goto L_0x0086;	 Catch:{ Exception -> 0x00a1 }
    L_0x007c:
        r11 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml";	 Catch:{ Exception -> 0x00a1 }
        com.appsflyer.AFLogger.m3084e(r11);	 Catch:{ Exception -> 0x00a1 }
        r11 = "PERMISSION_INTERNET_MISSING";	 Catch:{ Exception -> 0x00a1 }
        r1.m11662a(r2, r9, r11, r9);	 Catch:{ Exception -> 0x00a1 }
    L_0x0086:
        r11 = "android.permission.ACCESS_NETWORK_STATE";	 Catch:{ Exception -> 0x00a1 }
        r11 = r10.contains(r11);	 Catch:{ Exception -> 0x00a1 }
        if (r11 != 0) goto L_0x0093;	 Catch:{ Exception -> 0x00a1 }
    L_0x008e:
        r11 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml";	 Catch:{ Exception -> 0x00a1 }
        com.appsflyer.AFLogger.m3084e(r11);	 Catch:{ Exception -> 0x00a1 }
    L_0x0093:
        r11 = "android.permission.ACCESS_WIFI_STATE";	 Catch:{ Exception -> 0x00a1 }
        r10 = r10.contains(r11);	 Catch:{ Exception -> 0x00a1 }
        if (r10 != 0) goto L_0x00a8;	 Catch:{ Exception -> 0x00a1 }
    L_0x009b:
        r10 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml";	 Catch:{ Exception -> 0x00a1 }
        com.appsflyer.AFLogger.m3084e(r10);	 Catch:{ Exception -> 0x00a1 }
        goto L_0x00a8;
    L_0x00a1:
        r0 = move-exception;
        r10 = r0;
        r11 = "Exception while validation permissions. ";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3073a(r11, r10);	 Catch:{ Throwable -> 0x0598 }
    L_0x00a8:
        if (r22 == 0) goto L_0x00b1;	 Catch:{ Throwable -> 0x0598 }
    L_0x00aa:
        r10 = "af_events_api";	 Catch:{ Throwable -> 0x0598 }
        r11 = "1";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r10, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x00b1:
        r10 = "brand";	 Catch:{ Throwable -> 0x0598 }
        r11 = android.os.Build.BRAND;	 Catch:{ Throwable -> 0x0598 }
        r8.put(r10, r11);	 Catch:{ Throwable -> 0x0598 }
        r10 = "device";	 Catch:{ Throwable -> 0x0598 }
        r11 = android.os.Build.DEVICE;	 Catch:{ Throwable -> 0x0598 }
        r8.put(r10, r11);	 Catch:{ Throwable -> 0x0598 }
        r10 = "product";	 Catch:{ Throwable -> 0x0598 }
        r11 = android.os.Build.PRODUCT;	 Catch:{ Throwable -> 0x0598 }
        r8.put(r10, r11);	 Catch:{ Throwable -> 0x0598 }
        r10 = "sdk";	 Catch:{ Throwable -> 0x0598 }
        r11 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x0598 }
        r11 = java.lang.Integer.toString(r11);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r10, r11);	 Catch:{ Throwable -> 0x0598 }
        r10 = "model";	 Catch:{ Throwable -> 0x0598 }
        r11 = android.os.Build.MODEL;	 Catch:{ Throwable -> 0x0598 }
        r8.put(r10, r11);	 Catch:{ Throwable -> 0x0598 }
        r10 = "deviceType";	 Catch:{ Throwable -> 0x0598 }
        r11 = android.os.Build.TYPE;	 Catch:{ Throwable -> 0x0598 }
        r8.put(r10, r11);	 Catch:{ Throwable -> 0x0598 }
        r10 = 1;	 Catch:{ Throwable -> 0x0598 }
        if (r7 == 0) goto L_0x011c;	 Catch:{ Throwable -> 0x0598 }
    L_0x00e2:
        r11 = r16.m11713k(r17);	 Catch:{ Throwable -> 0x0598 }
        if (r11 == 0) goto L_0x010b;	 Catch:{ Throwable -> 0x0598 }
    L_0x00e8:
        r11 = com.appsflyer.AppsFlyerProperties.m3086a();	 Catch:{ Throwable -> 0x0598 }
        r11 = r11.m3103g();	 Catch:{ Throwable -> 0x0598 }
        if (r11 != 0) goto L_0x0108;	 Catch:{ Throwable -> 0x0598 }
    L_0x00f2:
        r11 = "af_sdks";	 Catch:{ Throwable -> 0x0598 }
        r12 = r16.m11718n();	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r12);	 Catch:{ Throwable -> 0x0598 }
        r11 = r16.m11748d(r17);	 Catch:{ Throwable -> 0x0598 }
        r12 = "batteryLevel";	 Catch:{ Throwable -> 0x0598 }
        r11 = java.lang.String.valueOf(r11);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r12, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x0108:
        r16.m11704g(r17);	 Catch:{ Throwable -> 0x0598 }
    L_0x010b:
        r11 = "timepassedsincelastlaunch";	 Catch:{ Throwable -> 0x0598 }
        r12 = r1.m11644a(r2, r10);	 Catch:{ Throwable -> 0x0598 }
        r12 = java.lang.Long.toString(r12);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r12);	 Catch:{ Throwable -> 0x0598 }
        r1.m11688b(r8);	 Catch:{ Throwable -> 0x0598 }
        goto L_0x011f;	 Catch:{ Throwable -> 0x0598 }
    L_0x011c:
        r1.m11666a(r2, r8, r4, r5);	 Catch:{ Throwable -> 0x0598 }
    L_0x011f:
        r11 = "KSAppsFlyerId";	 Catch:{ Throwable -> 0x0598 }
        r11 = r1.m11694d(r11);	 Catch:{ Throwable -> 0x0598 }
        r12 = "KSAppsFlyerRICounter";	 Catch:{ Throwable -> 0x0598 }
        r12 = r1.m11694d(r12);	 Catch:{ Throwable -> 0x0598 }
        if (r11 == 0) goto L_0x0143;	 Catch:{ Throwable -> 0x0598 }
    L_0x012d:
        if (r12 == 0) goto L_0x0143;	 Catch:{ Throwable -> 0x0598 }
    L_0x012f:
        r13 = java.lang.Integer.valueOf(r12);	 Catch:{ Throwable -> 0x0598 }
        r13 = r13.intValue();	 Catch:{ Throwable -> 0x0598 }
        if (r13 <= 0) goto L_0x0143;	 Catch:{ Throwable -> 0x0598 }
    L_0x0139:
        r13 = "reinstallCounter";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r13, r12);	 Catch:{ Throwable -> 0x0598 }
        r12 = "originalAppsflyerId";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r12, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x0143:
        r11 = "additionalCustomData";	 Catch:{ Throwable -> 0x0598 }
        r11 = r1.m11694d(r11);	 Catch:{ Throwable -> 0x0598 }
        if (r11 == 0) goto L_0x0150;	 Catch:{ Throwable -> 0x0598 }
    L_0x014b:
        r12 = "customData";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r12, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x0150:
        r11 = r17.getPackageManager();	 Catch:{ Exception -> 0x0164 }
        r12 = r17.getPackageName();	 Catch:{ Exception -> 0x0164 }
        r11 = r11.getInstallerPackageName(r12);	 Catch:{ Exception -> 0x0164 }
        if (r11 == 0) goto L_0x016b;	 Catch:{ Exception -> 0x0164 }
    L_0x015e:
        r12 = "installer_package";	 Catch:{ Exception -> 0x0164 }
        r8.put(r12, r11);	 Catch:{ Exception -> 0x0164 }
        goto L_0x016b;
    L_0x0164:
        r0 = move-exception;
        r11 = r0;
        r12 = "Exception while getting the app's installer package. ";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3073a(r12, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x016b:
        r11 = com.appsflyer.AppsFlyerProperties.m3086a();	 Catch:{ Throwable -> 0x0598 }
        r12 = "sdkExtension";	 Catch:{ Throwable -> 0x0598 }
        r11 = r11.m3090a(r12);	 Catch:{ Throwable -> 0x0598 }
        if (r11 == 0) goto L_0x0182;	 Catch:{ Throwable -> 0x0598 }
    L_0x0177:
        r12 = r11.length();	 Catch:{ Throwable -> 0x0598 }
        if (r12 <= 0) goto L_0x0182;	 Catch:{ Throwable -> 0x0598 }
    L_0x017d:
        r12 = "sdkExtension";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r12, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x0182:
        r11 = new java.lang.ref.WeakReference;	 Catch:{ Throwable -> 0x0598 }
        r11.<init>(r2);	 Catch:{ Throwable -> 0x0598 }
        r11 = r1.m11684b(r11);	 Catch:{ Throwable -> 0x0598 }
        r12 = r1.m11697e(r2, r11);	 Catch:{ Throwable -> 0x0598 }
        if (r12 == 0) goto L_0x0196;	 Catch:{ Throwable -> 0x0598 }
    L_0x0191:
        r13 = "channel";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r13, r12);	 Catch:{ Throwable -> 0x0598 }
    L_0x0196:
        if (r12 == 0) goto L_0x019e;	 Catch:{ Throwable -> 0x0598 }
    L_0x0198:
        r13 = r12.equals(r11);	 Catch:{ Throwable -> 0x0598 }
        if (r13 == 0) goto L_0x01a2;	 Catch:{ Throwable -> 0x0598 }
    L_0x019e:
        if (r12 != 0) goto L_0x01a7;	 Catch:{ Throwable -> 0x0598 }
    L_0x01a0:
        if (r11 == 0) goto L_0x01a7;	 Catch:{ Throwable -> 0x0598 }
    L_0x01a2:
        r12 = "af_latestchannel";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r12, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x01a7:
        r11 = r16.m11715l(r17);	 Catch:{ Throwable -> 0x0598 }
        if (r11 == 0) goto L_0x01b6;	 Catch:{ Throwable -> 0x0598 }
    L_0x01ad:
        r12 = "af_installstore";	 Catch:{ Throwable -> 0x0598 }
        r11 = r11.toLowerCase();	 Catch:{ Throwable -> 0x0598 }
        r8.put(r12, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x01b6:
        r11 = r16.m11720o(r17);	 Catch:{ Throwable -> 0x0598 }
        if (r11 == 0) goto L_0x01c5;	 Catch:{ Throwable -> 0x0598 }
    L_0x01bc:
        r12 = "af_preinstall_name";	 Catch:{ Throwable -> 0x0598 }
        r11 = r11.toLowerCase();	 Catch:{ Throwable -> 0x0598 }
        r8.put(r12, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x01c5:
        r11 = r16.m11716m(r17);	 Catch:{ Throwable -> 0x0598 }
        if (r11 == 0) goto L_0x01d4;	 Catch:{ Throwable -> 0x0598 }
    L_0x01cb:
        r12 = "af_currentstore";	 Catch:{ Throwable -> 0x0598 }
        r11 = r11.toLowerCase();	 Catch:{ Throwable -> 0x0598 }
        r8.put(r12, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x01d4:
        if (r3 == 0) goto L_0x01e2;	 Catch:{ Throwable -> 0x0598 }
    L_0x01d6:
        r11 = r18.length();	 Catch:{ Throwable -> 0x0598 }
        if (r11 < 0) goto L_0x01e2;	 Catch:{ Throwable -> 0x0598 }
    L_0x01dc:
        r11 = "appsflyerKey";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r3);	 Catch:{ Throwable -> 0x0598 }
        goto L_0x01f5;	 Catch:{ Throwable -> 0x0598 }
    L_0x01e2:
        r3 = "AppsFlyerKey";	 Catch:{ Throwable -> 0x0598 }
        r3 = r1.m11694d(r3);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x0586;	 Catch:{ Throwable -> 0x0598 }
    L_0x01ea:
        r11 = r3.length();	 Catch:{ Throwable -> 0x0598 }
        if (r11 < 0) goto L_0x0586;	 Catch:{ Throwable -> 0x0598 }
    L_0x01f0:
        r11 = "appsflyerKey";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x01f5:
        r3 = r16.m11712k();	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x0200;	 Catch:{ Throwable -> 0x0598 }
    L_0x01fb:
        r11 = "appUserId";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x0200:
        r3 = com.appsflyer.AppsFlyerProperties.m3086a();	 Catch:{ Throwable -> 0x0598 }
        r11 = "userEmails";	 Catch:{ Throwable -> 0x0598 }
        r3 = r3.m3090a(r11);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x0212;	 Catch:{ Throwable -> 0x0598 }
    L_0x020c:
        r11 = "user_emails";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r3);	 Catch:{ Throwable -> 0x0598 }
        goto L_0x0223;	 Catch:{ Throwable -> 0x0598 }
    L_0x0212:
        r3 = "userEmail";	 Catch:{ Throwable -> 0x0598 }
        r3 = r1.m11694d(r3);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x0223;	 Catch:{ Throwable -> 0x0598 }
    L_0x021a:
        r11 = "sha1_el";	 Catch:{ Throwable -> 0x0598 }
        r3 = com.appsflyer.C0960y.m3273a(r3);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x0223:
        if (r4 == 0) goto L_0x0231;	 Catch:{ Throwable -> 0x0598 }
    L_0x0225:
        r3 = "eventName";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r4);	 Catch:{ Throwable -> 0x0598 }
        if (r5 == 0) goto L_0x0231;	 Catch:{ Throwable -> 0x0598 }
    L_0x022c:
        r3 = "eventValue";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r5);	 Catch:{ Throwable -> 0x0598 }
    L_0x0231:
        r3 = r16.m11714l();	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x0242;	 Catch:{ Throwable -> 0x0598 }
    L_0x0237:
        r3 = "appid";	 Catch:{ Throwable -> 0x0598 }
        r5 = "appid";	 Catch:{ Throwable -> 0x0598 }
        r5 = r1.m11694d(r5);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r5);	 Catch:{ Throwable -> 0x0598 }
    L_0x0242:
        r3 = "currencyCode";	 Catch:{ Throwable -> 0x0598 }
        r3 = r1.m11694d(r3);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x026c;	 Catch:{ Throwable -> 0x0598 }
    L_0x024a:
        r5 = r3.length();	 Catch:{ Throwable -> 0x0598 }
        r11 = 3;	 Catch:{ Throwable -> 0x0598 }
        if (r5 == r11) goto L_0x0267;	 Catch:{ Throwable -> 0x0598 }
    L_0x0251:
        r5 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0598 }
        r11 = "WARNING: currency code should be 3 characters!!! '";	 Catch:{ Throwable -> 0x0598 }
        r5.<init>(r11);	 Catch:{ Throwable -> 0x0598 }
        r5.append(r3);	 Catch:{ Throwable -> 0x0598 }
        r11 = "' is not a legal value.";	 Catch:{ Throwable -> 0x0598 }
        r5.append(r11);	 Catch:{ Throwable -> 0x0598 }
        r5 = r5.toString();	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3084e(r5);	 Catch:{ Throwable -> 0x0598 }
    L_0x0267:
        r5 = "currency";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r5, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x026c:
        r3 = "IS_UPDATE";	 Catch:{ Throwable -> 0x0598 }
        r3 = r1.m11694d(r3);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x0279;	 Catch:{ Throwable -> 0x0598 }
    L_0x0274:
        r5 = "isUpdate";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r5, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x0279:
        r3 = r16.m11745b(r17);	 Catch:{ Throwable -> 0x0598 }
        r5 = "af_preinstalled";	 Catch:{ Throwable -> 0x0598 }
        r3 = java.lang.Boolean.toString(r3);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r5, r3);	 Catch:{ Throwable -> 0x0598 }
        r3 = com.appsflyer.AppsFlyerProperties.m3086a();	 Catch:{ Throwable -> 0x0598 }
        r5 = "collectFacebookAttrId";	 Catch:{ Throwable -> 0x0598 }
        r3 = r3.m3098b(r5, r10);	 Catch:{ Throwable -> 0x0598 }
        r5 = 0;
        if (r3 == 0) goto L_0x02bb;
    L_0x0293:
        r3 = r17.getPackageManager();	 Catch:{ NameNotFoundException -> 0x02ae, Throwable -> 0x02a5 }
        r11 = "com.facebook.katana";	 Catch:{ NameNotFoundException -> 0x02ae, Throwable -> 0x02a5 }
        r3.getApplicationInfo(r11, r5);	 Catch:{ NameNotFoundException -> 0x02ae, Throwable -> 0x02a5 }
        r3 = r17.getContentResolver();	 Catch:{ NameNotFoundException -> 0x02ae, Throwable -> 0x02a5 }
        r3 = r1.m11725a(r3);	 Catch:{ NameNotFoundException -> 0x02ae, Throwable -> 0x02a5 }
        goto L_0x02b4;
    L_0x02a5:
        r0 = move-exception;
        r3 = r0;
        r11 = "Exception while collecting facebook's attribution ID. ";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3073a(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x02ac:
        r3 = r9;	 Catch:{ Throwable -> 0x0598 }
        goto L_0x02b4;	 Catch:{ Throwable -> 0x0598 }
    L_0x02ae:
        r3 = "Exception while collecting facebook's attribution ID. ";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3084e(r3);	 Catch:{ Throwable -> 0x0598 }
        goto L_0x02ac;	 Catch:{ Throwable -> 0x0598 }
    L_0x02b4:
        if (r3 == 0) goto L_0x02bb;	 Catch:{ Throwable -> 0x0598 }
    L_0x02b6:
        r11 = "fb";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x02bb:
        r1.m11691c(r2, r8);	 Catch:{ Throwable -> 0x0598 }
        r3 = new java.lang.ref.WeakReference;	 Catch:{ Exception -> 0x02cf }
        r3.<init>(r2);	 Catch:{ Exception -> 0x02cf }
        r3 = com.appsflyer.C0961z.m3280a(r3);	 Catch:{ Exception -> 0x02cf }
        if (r3 == 0) goto L_0x02eb;	 Catch:{ Exception -> 0x02cf }
    L_0x02c9:
        r11 = "uid";	 Catch:{ Exception -> 0x02cf }
        r8.put(r11, r3);	 Catch:{ Exception -> 0x02cf }
        goto L_0x02eb;
    L_0x02cf:
        r0 = move-exception;
        r3 = r0;
        r11 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0598 }
        r12 = "ERROR: ";	 Catch:{ Throwable -> 0x0598 }
        r11.<init>(r12);	 Catch:{ Throwable -> 0x0598 }
        r12 = "could not get uid ";	 Catch:{ Throwable -> 0x0598 }
        r11.append(r12);	 Catch:{ Throwable -> 0x0598 }
        r12 = r3.getMessage();	 Catch:{ Throwable -> 0x0598 }
        r11.append(r12);	 Catch:{ Throwable -> 0x0598 }
        r11 = r11.toString();	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3073a(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x02eb:
        r3 = "lang";	 Catch:{ Exception -> 0x02f9 }
        r11 = java.util.Locale.getDefault();	 Catch:{ Exception -> 0x02f9 }
        r11 = r11.getDisplayLanguage();	 Catch:{ Exception -> 0x02f9 }
        r8.put(r3, r11);	 Catch:{ Exception -> 0x02f9 }
        goto L_0x0300;
    L_0x02f9:
        r0 = move-exception;
        r3 = r0;
        r11 = "Exception while collecting display language name. ";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3073a(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x0300:
        r3 = "lang_code";	 Catch:{ Exception -> 0x030e }
        r11 = java.util.Locale.getDefault();	 Catch:{ Exception -> 0x030e }
        r11 = r11.getLanguage();	 Catch:{ Exception -> 0x030e }
        r8.put(r3, r11);	 Catch:{ Exception -> 0x030e }
        goto L_0x0315;
    L_0x030e:
        r0 = move-exception;
        r3 = r0;
        r11 = "Exception while collecting display language code. ";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3073a(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x0315:
        r3 = "country";	 Catch:{ Exception -> 0x0323 }
        r11 = java.util.Locale.getDefault();	 Catch:{ Exception -> 0x0323 }
        r11 = r11.getCountry();	 Catch:{ Exception -> 0x0323 }
        r8.put(r3, r11);	 Catch:{ Exception -> 0x0323 }
        goto L_0x032a;
    L_0x0323:
        r0 = move-exception;
        r3 = r0;
        r11 = "Exception while collecting country name. ";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3073a(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x032a:
        r3 = "platformextension";	 Catch:{ Throwable -> 0x0598 }
        r11 = r1.f9368G;	 Catch:{ Throwable -> 0x0598 }
        r11 = r11.m3253a();	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r11);	 Catch:{ Throwable -> 0x0598 }
        r1.m11664a(r2, r8);	 Catch:{ Throwable -> 0x0598 }
        r3 = "yyyy-MM-dd_HHmmssZ";	 Catch:{ Throwable -> 0x0598 }
        r3 = r1.m11698e(r3);	 Catch:{ Throwable -> 0x0598 }
        r11 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x0598 }
        r12 = 9;
        if (r11 < r12) goto L_0x0363;
    L_0x0344:
        r11 = r17.getPackageManager();	 Catch:{ Exception -> 0x035c }
        r13 = r17.getPackageName();	 Catch:{ Exception -> 0x035c }
        r11 = r11.getPackageInfo(r13, r5);	 Catch:{ Exception -> 0x035c }
        r13 = r11.firstInstallTime;	 Catch:{ Exception -> 0x035c }
        r11 = "installDate";	 Catch:{ Exception -> 0x035c }
        r13 = r1.m11653a(r3, r13);	 Catch:{ Exception -> 0x035c }
        r8.put(r11, r13);	 Catch:{ Exception -> 0x035c }
        goto L_0x0363;
    L_0x035c:
        r0 = move-exception;
        r11 = r0;
        r13 = "Exception while collecting install date. ";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3073a(r13, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x0363:
        r11 = r17.getPackageManager();	 Catch:{ Throwable -> 0x03bb }
        r13 = r17.getPackageName();	 Catch:{ Throwable -> 0x03bb }
        r11 = r11.getPackageInfo(r13, r5);	 Catch:{ Throwable -> 0x03bb }
        r13 = "versionCode";	 Catch:{ Throwable -> 0x03bb }
        r13 = r6.getInt(r13, r5);	 Catch:{ Throwable -> 0x03bb }
        r14 = r11.versionCode;	 Catch:{ Throwable -> 0x03bb }
        if (r14 <= r13) goto L_0x0385;	 Catch:{ Throwable -> 0x03bb }
    L_0x0379:
        r13 = "appsflyerConversionDataRequestRetries";	 Catch:{ Throwable -> 0x03bb }
        r1.m11658a(r2, r13, r5);	 Catch:{ Throwable -> 0x03bb }
        r13 = "versionCode";	 Catch:{ Throwable -> 0x03bb }
        r14 = r11.versionCode;	 Catch:{ Throwable -> 0x03bb }
        r1.m11658a(r2, r13, r14);	 Catch:{ Throwable -> 0x03bb }
    L_0x0385:
        r13 = "app_version_code";	 Catch:{ Throwable -> 0x03bb }
        r14 = r11.versionCode;	 Catch:{ Throwable -> 0x03bb }
        r14 = java.lang.Integer.toString(r14);	 Catch:{ Throwable -> 0x03bb }
        r8.put(r13, r14);	 Catch:{ Throwable -> 0x03bb }
        r13 = "app_version_name";	 Catch:{ Throwable -> 0x03bb }
        r14 = r11.versionName;	 Catch:{ Throwable -> 0x03bb }
        r8.put(r13, r14);	 Catch:{ Throwable -> 0x03bb }
        r13 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x03bb }
        if (r13 < r12) goto L_0x03c2;	 Catch:{ Throwable -> 0x03bb }
    L_0x039b:
        r12 = r11.firstInstallTime;	 Catch:{ Throwable -> 0x03bb }
        r14 = r11.lastUpdateTime;	 Catch:{ Throwable -> 0x03bb }
        r11 = "date1";	 Catch:{ Throwable -> 0x03bb }
        r12 = r1.m11653a(r3, r12);	 Catch:{ Throwable -> 0x03bb }
        r8.put(r11, r12);	 Catch:{ Throwable -> 0x03bb }
        r11 = "date2";	 Catch:{ Throwable -> 0x03bb }
        r12 = r1.m11653a(r3, r14);	 Catch:{ Throwable -> 0x03bb }
        r8.put(r11, r12);	 Catch:{ Throwable -> 0x03bb }
        r3 = r1.m11654a(r3, r2);	 Catch:{ Throwable -> 0x03bb }
        r11 = "firstLaunchDate";	 Catch:{ Throwable -> 0x03bb }
        r8.put(r11, r3);	 Catch:{ Throwable -> 0x03bb }
        goto L_0x03c2;
    L_0x03bb:
        r0 = move-exception;
        r3 = r0;
        r11 = "Exception while collecting app version data ";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3073a(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x03c2:
        r3 = r21.length();	 Catch:{ Throwable -> 0x0598 }
        if (r3 <= 0) goto L_0x03cf;	 Catch:{ Throwable -> 0x0598 }
    L_0x03c8:
        r3 = "referrer";	 Catch:{ Throwable -> 0x0598 }
        r11 = r21;	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x03cf:
        r3 = "attributionId";	 Catch:{ Throwable -> 0x0598 }
        r3 = r6.getString(r3, r9);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x03e2;	 Catch:{ Throwable -> 0x0598 }
    L_0x03d7:
        r11 = r3.length();	 Catch:{ Throwable -> 0x0598 }
        if (r11 <= 0) goto L_0x03e2;	 Catch:{ Throwable -> 0x0598 }
    L_0x03dd:
        r11 = "installAttribution";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x03e2:
        r3 = "extraReferrers";	 Catch:{ Throwable -> 0x0598 }
        r3 = r6.getString(r3, r9);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x03ef;	 Catch:{ Throwable -> 0x0598 }
    L_0x03ea:
        r11 = "extraReferrers";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x03ef:
        r3 = "afUninstallToken";	 Catch:{ Throwable -> 0x0598 }
        r3 = r1.m11694d(r3);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x0406;	 Catch:{ Throwable -> 0x0598 }
    L_0x03f7:
        r3 = com.appsflyer.C0947q.m3235a(r3);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x0406;	 Catch:{ Throwable -> 0x0598 }
    L_0x03fd:
        r11 = "af_gcm_token";	 Catch:{ Throwable -> 0x0598 }
        r3 = r3.m3240a();	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x0406:
        r3 = com.appsflyer.C0932h.m3188e(r17);	 Catch:{ Throwable -> 0x0598 }
        r1.f9366E = r3;	 Catch:{ Throwable -> 0x0598 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0598 }
        r11 = "didConfigureTokenRefreshService=";	 Catch:{ Throwable -> 0x0598 }
        r3.<init>(r11);	 Catch:{ Throwable -> 0x0598 }
        r11 = r1.f9366E;	 Catch:{ Throwable -> 0x0598 }
        r3.append(r11);	 Catch:{ Throwable -> 0x0598 }
        r3 = r3.toString();	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3080c(r3);	 Catch:{ Throwable -> 0x0598 }
        r3 = r1.f9366E;	 Catch:{ Throwable -> 0x0598 }
        if (r3 != 0) goto L_0x042c;	 Catch:{ Throwable -> 0x0598 }
    L_0x0423:
        r3 = "tokenRefreshConfigured";	 Catch:{ Throwable -> 0x0598 }
        r11 = java.lang.Boolean.valueOf(r5);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r11);	 Catch:{ Throwable -> 0x0598 }
    L_0x042c:
        if (r7 == 0) goto L_0x044b;	 Catch:{ Throwable -> 0x0598 }
    L_0x042e:
        r3 = r1.f9365D;	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x0449;	 Catch:{ Throwable -> 0x0598 }
    L_0x0432:
        r3 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0598 }
        r11 = r1.f9365D;	 Catch:{ Throwable -> 0x0598 }
        r3.<init>(r11);	 Catch:{ Throwable -> 0x0598 }
        r11 = "isPush";	 Catch:{ Throwable -> 0x0598 }
        r12 = "true";	 Catch:{ Throwable -> 0x0598 }
        r3.put(r11, r12);	 Catch:{ Throwable -> 0x0598 }
        r11 = "af_deeplink";	 Catch:{ Throwable -> 0x0598 }
        r3 = r3.toString();	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x0449:
        r1.f9365D = r9;	 Catch:{ Throwable -> 0x0598 }
    L_0x044b:
        if (r7 == 0) goto L_0x0462;	 Catch:{ Throwable -> 0x0598 }
    L_0x044d:
        r3 = r25;	 Catch:{ Throwable -> 0x0598 }
        r3 = r1.m11646a(r3);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x0459;	 Catch:{ Throwable -> 0x0598 }
    L_0x0455:
        r1.m11665a(r2, r8, r3);	 Catch:{ Throwable -> 0x0598 }
        goto L_0x0462;	 Catch:{ Throwable -> 0x0598 }
    L_0x0459:
        r3 = r1.f9385z;	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x0462;	 Catch:{ Throwable -> 0x0598 }
    L_0x045d:
        r3 = r1.f9385z;	 Catch:{ Throwable -> 0x0598 }
        r1.m11665a(r2, r8, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x0462:
        r3 = r1.f9364C;	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x047e;	 Catch:{ Throwable -> 0x0598 }
    L_0x0466:
        r3 = "testAppMode_retargeting";	 Catch:{ Throwable -> 0x0598 }
        r9 = "true";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r9);	 Catch:{ Throwable -> 0x0598 }
        r3 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0598 }
        r3.<init>(r8);	 Catch:{ Throwable -> 0x0598 }
        r3 = r3.toString();	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.C3010d.m11690c(r2, r3);	 Catch:{ Throwable -> 0x0598 }
        r3 = "Sent retargeting params to test app";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3083d(r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x047e:
        r3 = r16.m11699e(r17);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x049f;	 Catch:{ Throwable -> 0x0598 }
    L_0x0484:
        r3 = "testAppMode";	 Catch:{ Throwable -> 0x0598 }
        r9 = "true";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r9);	 Catch:{ Throwable -> 0x0598 }
        r3 = new org.json.JSONObject;	 Catch:{ Throwable -> 0x0598 }
        r3.<init>(r8);	 Catch:{ Throwable -> 0x0598 }
        r3 = r3.toString();	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.C3010d.m11690c(r2, r3);	 Catch:{ Throwable -> 0x0598 }
        r3 = "Sent params to test app";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3083d(r3);	 Catch:{ Throwable -> 0x0598 }
        r16.m11710j();	 Catch:{ Throwable -> 0x0598 }
    L_0x049f:
        r3 = "advertiserId";	 Catch:{ Throwable -> 0x0598 }
        r3 = r1.m11694d(r3);	 Catch:{ Throwable -> 0x0598 }
        if (r3 != 0) goto L_0x04c1;	 Catch:{ Throwable -> 0x0598 }
    L_0x04a7:
        com.appsflyer.C0932h.m3176a(r2, r8);	 Catch:{ Throwable -> 0x0598 }
        r3 = "advertiserId";	 Catch:{ Throwable -> 0x0598 }
        r3 = r1.m11694d(r3);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x04ba;	 Catch:{ Throwable -> 0x0598 }
    L_0x04b2:
        r3 = "GAID_retry";	 Catch:{ Throwable -> 0x0598 }
        r9 = "true";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r9);	 Catch:{ Throwable -> 0x0598 }
        goto L_0x04c1;	 Catch:{ Throwable -> 0x0598 }
    L_0x04ba:
        r3 = "GAID_retry";	 Catch:{ Throwable -> 0x0598 }
        r9 = "false";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r9);	 Catch:{ Throwable -> 0x0598 }
    L_0x04c1:
        r3 = r17.getContentResolver();	 Catch:{ Throwable -> 0x0598 }
        r3 = com.appsflyer.C0932h.m3173a(r3);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x04e1;	 Catch:{ Throwable -> 0x0598 }
    L_0x04cb:
        r9 = "amazon_aid";	 Catch:{ Throwable -> 0x0598 }
        r11 = r3.m3208a();	 Catch:{ Throwable -> 0x0598 }
        r8.put(r9, r11);	 Catch:{ Throwable -> 0x0598 }
        r9 = "amazon_aid_limit";	 Catch:{ Throwable -> 0x0598 }
        r3 = r3.m3209b();	 Catch:{ Throwable -> 0x0598 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r9, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x04e1:
        r3 = com.appsflyer.AppsFlyerProperties.m3086a();	 Catch:{ Throwable -> 0x0598 }
        r3 = r3.m3089a(r2);	 Catch:{ Throwable -> 0x0598 }
        if (r3 == 0) goto L_0x04fe;	 Catch:{ Throwable -> 0x0598 }
    L_0x04eb:
        r9 = r3.length();	 Catch:{ Throwable -> 0x0598 }
        if (r9 <= 0) goto L_0x04fe;	 Catch:{ Throwable -> 0x0598 }
    L_0x04f1:
        r9 = "referrer";	 Catch:{ Throwable -> 0x0598 }
        r9 = r8.get(r9);	 Catch:{ Throwable -> 0x0598 }
        if (r9 != 0) goto L_0x04fe;	 Catch:{ Throwable -> 0x0598 }
    L_0x04f9:
        r9 = "referrer";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r9, r3);	 Catch:{ Throwable -> 0x0598 }
    L_0x04fe:
        r3 = "true";	 Catch:{ Throwable -> 0x0598 }
        r9 = "sentSuccessfully";	 Catch:{ Throwable -> 0x0598 }
        r11 = "";	 Catch:{ Throwable -> 0x0598 }
        r9 = r6.getString(r9, r11);	 Catch:{ Throwable -> 0x0598 }
        r3 = r3.equals(r9);	 Catch:{ Throwable -> 0x0598 }
        r9 = "sentRegisterRequestToAF";	 Catch:{ Throwable -> 0x0598 }
        r9 = r6.getBoolean(r9, r5);	 Catch:{ Throwable -> 0x0598 }
        r11 = "registeredUninstall";	 Catch:{ Throwable -> 0x0598 }
        r9 = java.lang.Boolean.valueOf(r9);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r9);	 Catch:{ Throwable -> 0x0598 }
        r9 = r1.m11722a(r6, r7);	 Catch:{ Throwable -> 0x0598 }
        r11 = "counter";	 Catch:{ Throwable -> 0x0598 }
        r12 = java.lang.Integer.toString(r9);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r12);	 Catch:{ Throwable -> 0x0598 }
        r11 = "iaecounter";	 Catch:{ Throwable -> 0x0598 }
        if (r4 == 0) goto L_0x052e;	 Catch:{ Throwable -> 0x0598 }
    L_0x052c:
        r4 = 1;	 Catch:{ Throwable -> 0x0598 }
        goto L_0x052f;	 Catch:{ Throwable -> 0x0598 }
    L_0x052e:
        r4 = 0;	 Catch:{ Throwable -> 0x0598 }
    L_0x052f:
        r4 = r1.m11740b(r6, r4);	 Catch:{ Throwable -> 0x0598 }
        r4 = java.lang.Integer.toString(r4);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r11, r4);	 Catch:{ Throwable -> 0x0598 }
        if (r7 == 0) goto L_0x0545;	 Catch:{ Throwable -> 0x0598 }
    L_0x053c:
        if (r9 != r10) goto L_0x0545;	 Catch:{ Throwable -> 0x0598 }
    L_0x053e:
        r4 = com.appsflyer.AppsFlyerProperties.m3086a();	 Catch:{ Throwable -> 0x0598 }
        r4.m3101e();	 Catch:{ Throwable -> 0x0598 }
    L_0x0545:
        r4 = "isFirstCall";	 Catch:{ Throwable -> 0x0598 }
        r3 = r3 ^ r10;	 Catch:{ Throwable -> 0x0598 }
        r3 = java.lang.Boolean.toString(r3);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r4, r3);	 Catch:{ Throwable -> 0x0598 }
        r1.m11667a(r2, r7, r8, r9);	 Catch:{ Throwable -> 0x0598 }
        r2 = new com.appsflyer.y;	 Catch:{ Throwable -> 0x0598 }
        r2.<init>();	 Catch:{ Throwable -> 0x0598 }
        r2 = r2.m3276a(r8);	 Catch:{ Throwable -> 0x0598 }
        r3 = "af_v";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r2);	 Catch:{ Throwable -> 0x0598 }
        r2 = new com.appsflyer.y;	 Catch:{ Throwable -> 0x0598 }
        r2.<init>();	 Catch:{ Throwable -> 0x0598 }
        r2 = r2.m3277b(r8);	 Catch:{ Throwable -> 0x0598 }
        r3 = "af_v2";	 Catch:{ Throwable -> 0x0598 }
        r8.put(r3, r2);	 Catch:{ Throwable -> 0x0598 }
        r2 = "is_stop_tracking_used";	 Catch:{ Throwable -> 0x0598 }
        r2 = r6.contains(r2);	 Catch:{ Throwable -> 0x0598 }
        if (r2 == 0) goto L_0x05a1;	 Catch:{ Throwable -> 0x0598 }
    L_0x0576:
        r2 = "istu";	 Catch:{ Throwable -> 0x0598 }
        r3 = "is_stop_tracking_used";	 Catch:{ Throwable -> 0x0598 }
        r3 = r6.getBoolean(r3, r5);	 Catch:{ Throwable -> 0x0598 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Throwable -> 0x0598 }
        r8.put(r2, r3);	 Catch:{ Throwable -> 0x0598 }
        goto L_0x05a1;	 Catch:{ Throwable -> 0x0598 }
    L_0x0586:
        r3 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3083d(r3);	 Catch:{ Throwable -> 0x0598 }
        r3 = "AppsFlyer_4.8.7";	 Catch:{ Throwable -> 0x0598 }
        r4 = "DEV_KEY_MISSING";	 Catch:{ Throwable -> 0x0598 }
        r1.m11662a(r2, r3, r4, r9);	 Catch:{ Throwable -> 0x0598 }
        r2 = "AppsFlyer will not track this event.";	 Catch:{ Throwable -> 0x0598 }
        com.appsflyer.AFLogger.m3083d(r2);	 Catch:{ Throwable -> 0x0598 }
        return r9;
    L_0x0598:
        r0 = move-exception;
        r2 = r0;
        r3 = r2.getLocalizedMessage();
        com.appsflyer.AFLogger.m3073a(r3, r2);
    L_0x05a1:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.d.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, android.content.SharedPreferences, boolean, android.content.Intent):java.util.Map<java.lang.String, java.lang.Object>");
    }

    /* renamed from: a */
    private void m11667a(Context context, boolean z, Map<String, Object> map, int i) {
        Map hashMap = new HashMap();
        hashMap.put("cpu_abi", m11747c("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", m11747c("ro.product.cpu.abi2"));
        hashMap.put("arch", m11747c("os.arch"));
        hashMap.put("build_display_id", m11747c("ro.build.display.id"));
        if (z) {
            if (this.f9363B) {
                z = m11708i(context);
                if (!z.isEmpty()) {
                    hashMap.put("loc", z);
                }
            }
            m11687b(context, hashMap);
            if (true >= i) {
                context = C0946p.m3226a(context).m3234e();
                if (!context.isEmpty()) {
                    hashMap.put("sensors", context);
                }
            }
        }
        map.put("deviceData", hashMap);
    }

    /* renamed from: a */
    private void m11664a(Context context, Map<String, ? super String> map) {
        context = C0938l.m3202a().m3207a(context);
        map.put("network", context.m3199a());
        if (context.m3201c() != null) {
            map.put("operator", context.m3201c());
        }
        if (context.m3200b() != null) {
            map.put("carrier", context.m3200b());
        }
    }

    /* renamed from: b */
    private void m11687b(Context context, Map<String, Object> map) {
        context = C0932h.m3172a().m3191a(context);
        map.put("btl", Float.toString(context.m3170a()));
        if (context.m3171b() != null) {
            map.put("btch", context.m3171b());
        }
    }

    @Nullable
    /* renamed from: i */
    private Map<String, Object> m11708i(Context context) {
        context = C0935k.m3196a().m3198a(context);
        Map<String, Object> hashMap = new HashMap(3);
        if (context != null) {
            hashMap.put(ManagerWebServices.PARAM_LAT, String.valueOf(context.getLatitude()));
            hashMap.put(ManagerWebServices.PARAM_LON, String.valueOf(context.getLongitude()));
            hashMap.put(ManagerWebServices.IG_PARAM_TIMESTAMP, String.valueOf(context.getTime()));
        }
        return hashMap;
    }

    /* renamed from: b */
    private void m11688b(Map<String, Object> map) {
        String a = AppsFlyerProperties.m3086a().m3090a("oneLinkSlug");
        if (a != null) {
            map.put("onelink_id", a);
            map.put("ol_ver", AppsFlyerProperties.m3086a().m3090a("onelinkVersion"));
        }
    }

    @Nullable
    /* renamed from: a */
    private Uri m11646a(Intent intent) {
        return (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData();
    }

    /* renamed from: a */
    private void m11665a(Context context, Map<String, Object> map, Uri uri) {
        Map d;
        map.put("af_deeplink", uri.toString());
        if (uri.getQueryParameter("af_deeplink") != null) {
            map = ("AppsFlyer_Test".equals(uri.getQueryParameter("media_source")) == null || Boolean.parseBoolean(uri.getQueryParameter("is_retargeting")) == null) ? null : true;
            this.f9364C = map;
            d = m11695d(context, uri.getQuery());
            m11678a(d, "path", uri.getPath());
            m11678a(d, "scheme", uri.getScheme());
            m11678a(d, "host", uri.getHost());
        } else {
            d = new HashMap();
            d.put(ManagerWebServices.IG_PARAM_LINK, uri.toString());
        }
        WeakReference weakReference = new WeakReference(context);
        context = new C3013x(uri, this);
        context.m3164a((C0927a) new C0927a());
        if (context.mo1230c() != null) {
            context.m11756a(m11647a(d, weakReference));
            C0919a.m3116a().m3118b().execute(context);
            return;
        }
        m11692c(d);
    }

    /* renamed from: c */
    private void m11692c(Map<String, String> map) {
        if (f9360p != null) {
            try {
                f9360p.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.m3073a(th.getLocalizedMessage(), th);
            }
        }
    }

    /* renamed from: a */
    private C0959a m11647a(final Map<String, String> map, final WeakReference<Context> weakReference) {
        return new C0959a(this) {
            /* renamed from: c */
            final /* synthetic */ C3010d f9349c;

            /* renamed from: a */
            public final void mo1222a(Map<String, String> map) {
                m11636b(map);
                m11637c(map);
                this.f9349c.m11692c(map);
            }

            /* renamed from: a */
            public final void mo1221a(String str) {
                if (C3010d.f9360p != null) {
                    m11637c(map);
                    C3010d.f9360p.onAttributionFailure(str);
                }
            }

            /* renamed from: b */
            private void m11636b(Map<String, String> map) {
                for (String str : map.keySet()) {
                    map.put(str, map.get(str));
                }
            }

            /* renamed from: c */
            private void m11637c(Map<String, String> map) {
                if (weakReference.get() != null) {
                    this.f9349c.m11661a((Context) weakReference.get(), "deeplinkAttribution", new JSONObject(map).toString());
                }
            }
        };
    }

    /* renamed from: a */
    private void m11678a(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    /* renamed from: n */
    private String m11718n() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m11702g("com.tune.Tune"));
        stringBuilder.append(m11702g("com.adjust.sdk.Adjust"));
        stringBuilder.append(m11702g("com.kochava.android.tracker.Feature"));
        stringBuilder.append(m11702g("io.branch.referral.Branch"));
        stringBuilder.append(m11702g("com.apsalar.sdk.Apsalar"));
        stringBuilder.append(m11702g("com.localytics.android.Localytics"));
        stringBuilder.append(m11702g("com.tenjin.android.TenjinSDK"));
        stringBuilder.append(m11702g("place holder for TD"));
        stringBuilder.append(m11702g("it.partytrack.sdk.Track"));
        stringBuilder.append(m11702g("jp.appAdForce.android.LtvManager"));
        return stringBuilder.toString();
    }

    /* renamed from: g */
    private int m11702g(String str) {
        return this.f9368G.m3254a(str) != null ? 1 : null;
    }

    /* renamed from: a */
    private void m11666a(Context context, Map<String, Object> map, String str, String str2) {
        context = m11746c(context);
        Editor edit = context.edit();
        try {
            String string = context.getString("prev_event_name", null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(context.getLong("prev_event_timestamp", -1));
                jSONObject.put("prev_event_timestamp", stringBuilder.toString());
                jSONObject.put("prev_event_value", context.getString("prev_event_value", null));
                jSONObject.put("prev_event_name", string);
                map.put("prev_event", jSONObject.toString());
            }
            edit.putString("prev_event_name", str);
            edit.putString("prev_event_value", str2);
            edit.putLong("prev_event_timestamp", System.currentTimeMillis());
            m11735a(edit);
        } catch (Throwable e) {
            AFLogger.m3073a("Error while processing previous event.", e);
        }
    }

    /* renamed from: a */
    boolean m11739a(Context context) {
        try {
            return C3813b.m14425a().mo2566a(context) == null;
        } catch (Throwable th) {
            AFLogger.m3073a("WARNING:  Google play services is unavailable. ", th);
            return false;
        }
    }

    /* renamed from: c */
    private void m11691c(android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
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
        r9 = this;
        r0 = com.appsflyer.AppsFlyerProperties.m3086a();
        r1 = "deviceTrackingDisabled";
        r2 = 0;
        r0 = r0.m3098b(r1, r2);
        if (r0 == 0) goto L_0x0015;
    L_0x000d:
        r10 = "deviceTrackingDisabled";
        r0 = "true";
        r11.put(r10, r0);
        return;
    L_0x0015:
        r0 = r9.m11746c(r10);
        r1 = com.appsflyer.AppsFlyerProperties.m3086a();
        r3 = "collectIMEI";
        r4 = 1;
        r1 = r1.m3098b(r3, r4);
        r3 = "imeiCached";
        r5 = 0;
        r3 = r0.getString(r3, r5);
        if (r1 == 0) goto L_0x0073;
    L_0x002d:
        r1 = r9.m11711j(r10);
        if (r1 == 0) goto L_0x006c;
    L_0x0033:
        r1 = "phone";	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        r1 = r10.getSystemService(r1);	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        r1 = (android.telephony.TelephonyManager) r1;	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        r6 = r1.getClass();	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        r7 = "getDeviceId";	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        r8 = new java.lang.Class[r2];	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        r6 = r6.getMethod(r7, r8);	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        r2 = new java.lang.Object[r2];	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        r1 = r6.invoke(r1, r2);	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        r1 = (java.lang.String) r1;	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        if (r1 == 0) goto L_0x0052;	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
    L_0x0051:
        goto L_0x007b;	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
    L_0x0052:
        r1 = r9.f9371g;	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        if (r1 == 0) goto L_0x0059;	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
    L_0x0056:
        r1 = r9.f9371g;	 Catch:{ InvocationTargetException -> 0x0066, Exception -> 0x005f }
        goto L_0x007b;
    L_0x0059:
        if (r3 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x005d;
    L_0x005c:
        r3 = r5;
    L_0x005d:
        r1 = r3;
        goto L_0x007b;
    L_0x005f:
        r1 = move-exception;
        r2 = "WARNING: READ_PHONE_STATE is missing. ";
        com.appsflyer.AFLogger.m3073a(r2, r1);
        goto L_0x007a;
    L_0x0066:
        r1 = "WARNING: READ_PHONE_STATE is missing.";
        com.appsflyer.AFLogger.m3084e(r1);
        goto L_0x007a;
    L_0x006c:
        r1 = r9.f9371g;
        if (r1 == 0) goto L_0x007a;
    L_0x0070:
        r1 = r9.f9371g;
        goto L_0x007b;
    L_0x0073:
        r1 = r9.f9371g;
        if (r1 == 0) goto L_0x007a;
    L_0x0077:
        r1 = r9.f9371g;
        goto L_0x007b;
    L_0x007a:
        r1 = r5;
    L_0x007b:
        if (r1 == 0) goto L_0x0088;
    L_0x007d:
        r2 = "imeiCached";
        r9.m11661a(r10, r2, r1);
        r2 = "imei";
        r11.put(r2, r1);
        goto L_0x008d;
    L_0x0088:
        r1 = "IMEI was not collected.";
        com.appsflyer.AFLogger.m3083d(r1);
    L_0x008d:
        r1 = com.appsflyer.AppsFlyerProperties.m3086a();
        r2 = "collectAndroidId";
        r1 = r1.m3098b(r2, r4);
        r2 = "androidIdCached";
        r0 = r0.getString(r2, r5);
        if (r1 == 0) goto L_0x00ce;
    L_0x009f:
        r1 = r9.m11711j(r10);
        if (r1 == 0) goto L_0x00c7;
    L_0x00a5:
        r1 = r10.getContentResolver();	 Catch:{ Exception -> 0x00be }
        r2 = "android_id";	 Catch:{ Exception -> 0x00be }
        r1 = android.provider.Settings.Secure.getString(r1, r2);	 Catch:{ Exception -> 0x00be }
        if (r1 == 0) goto L_0x00b3;	 Catch:{ Exception -> 0x00be }
    L_0x00b1:
        r5 = r1;	 Catch:{ Exception -> 0x00be }
        goto L_0x00d4;	 Catch:{ Exception -> 0x00be }
    L_0x00b3:
        r1 = r9.f9372h;	 Catch:{ Exception -> 0x00be }
        if (r1 == 0) goto L_0x00bb;	 Catch:{ Exception -> 0x00be }
    L_0x00b7:
        r0 = r9.f9372h;	 Catch:{ Exception -> 0x00be }
    L_0x00b9:
        r5 = r0;
        goto L_0x00d4;
    L_0x00bb:
        if (r0 == 0) goto L_0x00d4;
    L_0x00bd:
        goto L_0x00b9;
    L_0x00be:
        r0 = move-exception;
        r1 = r0.getMessage();
        com.appsflyer.AFLogger.m3073a(r1, r0);
        goto L_0x00d4;
    L_0x00c7:
        r0 = r9.f9372h;
        if (r0 == 0) goto L_0x00d4;
    L_0x00cb:
        r5 = r9.f9372h;
        goto L_0x00d4;
    L_0x00ce:
        r0 = r9.f9372h;
        if (r0 == 0) goto L_0x00d4;
    L_0x00d2:
        r5 = r9.f9372h;
    L_0x00d4:
        if (r5 == 0) goto L_0x00e1;
    L_0x00d6:
        r0 = "androidIdCached";
        r9.m11661a(r10, r0, r5);
        r10 = "android_id";
        r11.put(r10, r5);
        return;
    L_0x00e1:
        r10 = "Android ID was not collected.";
        com.appsflyer.AFLogger.m3083d(r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.d.c(android.content.Context, java.util.Map):void");
    }

    /* renamed from: j */
    private boolean m11711j(Context context) {
        if (VERSION.SDK_INT >= 19) {
            if (m11739a(context) != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: k */
    private boolean m11713k(Context context) {
        return m11746c(context).contains("appsFlyerCount") == null ? true : null;
    }

    /* renamed from: l */
    private String m11715l(Context context) {
        SharedPreferences c = m11746c(context);
        String str = null;
        if (c.contains("INSTALL_STORE")) {
            return c.getString("INSTALL_STORE", null);
        }
        if (m11713k(context)) {
            str = m11716m(context);
        }
        m11661a(context, "INSTALL_STORE", str);
        return str;
    }

    /* renamed from: m */
    private String m11716m(Context context) {
        return m11652a(new WeakReference(context), "AF_STORE");
    }

    /* renamed from: c */
    String m11747c(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke(null, new Object[]{str});
        } catch (Throwable th) {
            AFLogger.m3073a(th.getMessage(), th);
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    private String m11652a(WeakReference<Context> weakReference, String str) {
        if (weakReference.get() == null) {
            return null;
        }
        return m11651a(str, ((Context) weakReference.get()).getPackageManager(), ((Context) weakReference.get()).getPackageName());
    }

    @Nullable
    /* renamed from: a */
    private String m11651a(String str, PackageManager packageManager, String str2) {
        try {
            packageManager = packageManager.getApplicationInfo(str2, ProfileEditingConfig.DEFAULT_MAX_LENGTH).metaData;
            if (packageManager == null) {
                return null;
            }
            packageManager = packageManager.get(str);
            if (packageManager != null) {
                return packageManager.toString();
            }
            return null;
        } catch (Throwable th) {
            str2 = new StringBuilder("Could not find ");
            str2.append(str);
            str2.append(" value in the manifest");
            AFLogger.m3073a(str2.toString(), th);
            return null;
        }
    }

    /* renamed from: n */
    private String m11719n(Context context) {
        File h = m11705h(m11747c("ro.appsflyer.preinstall.path"));
        if (m11682a(h)) {
            h = m11705h(m11651a("AF_PRE_INSTALL_PATH", context.getPackageManager(), context.getPackageName()));
        }
        if (m11682a(h)) {
            h = m11705h("/data/local/tmp/pre_install.appsflyer");
        }
        if (m11682a(h)) {
            h = m11705h("/etc/pre_install.appsflyer");
        }
        if (m11682a(h)) {
            return null;
        }
        context = m11650a(h, context.getPackageName());
        if (context != null) {
            return context;
        }
        return null;
    }

    /* renamed from: a */
    private java.lang.String m11650a(java.io.File r5, java.lang.String r6) {
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
        r4 = this;
        r0 = 0;
        r1 = new java.util.Properties;	 Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
        r1.<init>();	 Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
        r2 = new java.io.FileReader;	 Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
        r2.<init>(r5);	 Catch:{ FileNotFoundException -> 0x0041, Throwable -> 0x0029, all -> 0x0026 }
        r1.load(r2);	 Catch:{ FileNotFoundException -> 0x0042, Throwable -> 0x0024 }
        r3 = "Found PreInstall property!";	 Catch:{ FileNotFoundException -> 0x0042, Throwable -> 0x0024 }
        com.appsflyer.AFLogger.m3083d(r3);	 Catch:{ FileNotFoundException -> 0x0042, Throwable -> 0x0024 }
        r6 = r1.getProperty(r6);	 Catch:{ FileNotFoundException -> 0x0042, Throwable -> 0x0024 }
        r2.close();	 Catch:{ Throwable -> 0x001b }
        goto L_0x0023;
    L_0x001b:
        r5 = move-exception;
        r0 = r5.getMessage();
        com.appsflyer.AFLogger.m3073a(r0, r5);
    L_0x0023:
        return r6;
    L_0x0024:
        r5 = move-exception;
        goto L_0x002b;
    L_0x0026:
        r5 = move-exception;
        r2 = r0;
        goto L_0x005e;
    L_0x0029:
        r5 = move-exception;
        r2 = r0;
    L_0x002b:
        r6 = r5.getMessage();	 Catch:{ all -> 0x005d }
        com.appsflyer.AFLogger.m3073a(r6, r5);	 Catch:{ all -> 0x005d }
        if (r2 == 0) goto L_0x005c;
    L_0x0034:
        r2.close();	 Catch:{ Throwable -> 0x0038 }
        goto L_0x005c;
    L_0x0038:
        r5 = move-exception;
        r6 = r5.getMessage();
        com.appsflyer.AFLogger.m3073a(r6, r5);
        goto L_0x005c;
    L_0x0041:
        r2 = r0;
    L_0x0042:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005d }
        r1 = "PreInstall file wasn't found: ";	 Catch:{ all -> 0x005d }
        r6.<init>(r1);	 Catch:{ all -> 0x005d }
        r5 = r5.getAbsolutePath();	 Catch:{ all -> 0x005d }
        r6.append(r5);	 Catch:{ all -> 0x005d }
        r5 = r6.toString();	 Catch:{ all -> 0x005d }
        com.appsflyer.AFLogger.m3080c(r5);	 Catch:{ all -> 0x005d }
        if (r2 == 0) goto L_0x005c;
    L_0x0059:
        r2.close();	 Catch:{ Throwable -> 0x0038 }
    L_0x005c:
        return r0;
    L_0x005d:
        r5 = move-exception;
    L_0x005e:
        if (r2 == 0) goto L_0x006c;
    L_0x0060:
        r2.close();	 Catch:{ Throwable -> 0x0064 }
        goto L_0x006c;
    L_0x0064:
        r6 = move-exception;
        r0 = r6.getMessage();
        com.appsflyer.AFLogger.m3073a(r0, r6);
    L_0x006c:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.d.a(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private boolean m11682a(File file) {
        if (file != null) {
            if (file.exists() != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: h */
    private File m11705h(String str) {
        if (str != null) {
            try {
                if (str.trim().length() > 0) {
                    return new File(str.trim());
                }
            } catch (Throwable th) {
                AFLogger.m3073a(th.getMessage(), th);
            }
        }
        return null;
    }

    /* renamed from: o */
    private String m11720o(Context context) {
        SharedPreferences c = m11746c(context);
        String d = m11694d("preInstallName");
        if (d != null) {
            return d;
        }
        String string;
        if (c.contains("preInstallName")) {
            string = c.getString("preInstallName", null);
        } else {
            if (m11713k(context)) {
                d = m11719n(context);
                if (d == null) {
                    d = m11652a(new WeakReference(context), "AF_PRE_INSTALL_NAME");
                }
            }
            if (d != null) {
                m11661a(context, "preInstallName", d);
            }
            string = d;
        }
        if (string != null) {
            m11675a("preInstallName", string);
        }
        return string;
    }

    /* renamed from: p */
    private void m11721p(Context context) {
        if (!this.f9379s) {
            if (System.currentTimeMillis() - this.f9380t >= 15000) {
                if (this.f9381u == null) {
                    this.f9381u = C0919a.m3116a().m3119c();
                    m11679a(this.f9381u, new C0923b(this, context), 1, TimeUnit.SECONDS);
                }
            }
        }
    }

    @Nullable
    /* renamed from: b */
    private String m11684b(WeakReference<Context> weakReference) {
        String a = AppsFlyerProperties.m3086a().m3090a("channel");
        return a == null ? m11652a((WeakReference) weakReference, "CHANNEL") : a;
    }

    /* renamed from: b */
    public boolean m11745b(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != null) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            AFLogger.m3073a("Could not check if app is pre installed", e);
        }
    }

    /* renamed from: e */
    private String m11697e(Context context, String str) throws NameNotFoundException {
        SharedPreferences c = m11746c(context);
        if (c.contains("CACHED_CHANNEL")) {
            return c.getString("CACHED_CHANNEL", null);
        }
        m11661a(context, "CACHED_CHANNEL", str);
        return str;
    }

    /* renamed from: a */
    private String m11654a(SimpleDateFormat simpleDateFormat, Context context) {
        String string = m11746c(context).getString("appsFlyerFirstInstall", null);
        if (string == null) {
            if (m11713k(context)) {
                AFLogger.m3080c("AppsFlyer: first launch detected");
                simpleDateFormat = simpleDateFormat.format(new Date());
            } else {
                simpleDateFormat = "";
            }
            string = simpleDateFormat;
            m11661a(context, "appsFlyerFirstInstall", string);
        }
        simpleDateFormat = new StringBuilder("AppsFlyer: first launch date: ");
        simpleDateFormat.append(string);
        AFLogger.m3083d(simpleDateFormat.toString());
        return string;
    }

    /* renamed from: a */
    public String m11725a(ContentResolver contentResolver) {
        ContentResolver contentResolver2 = contentResolver;
        contentResolver = contentResolver2.query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null);
        String str = null;
        if (contentResolver != null) {
            try {
                if (contentResolver.moveToFirst()) {
                    String string = contentResolver.getString(contentResolver.getColumnIndex("aid"));
                    if (contentResolver != null) {
                        try {
                            contentResolver.close();
                        } catch (Throwable e) {
                            AFLogger.m3073a(e.getMessage(), e);
                        }
                    }
                    str = string;
                    return str;
                }
            } catch (Throwable e2) {
                AFLogger.m3073a("Could not collect cursor attribution. ", e2);
                if (contentResolver != null) {
                    try {
                        contentResolver.close();
                    } catch (Throwable e3) {
                        AFLogger.m3073a(e3.getMessage(), e3);
                    }
                }
            } catch (Throwable th) {
                if (contentResolver != null) {
                    try {
                        contentResolver.close();
                    } catch (Throwable e32) {
                        AFLogger.m3073a(e32.getMessage(), e32);
                    }
                }
            }
        }
        if (contentResolver != null) {
            try {
                contentResolver.close();
            } catch (Throwable e322) {
                AFLogger.m3073a(e322.getMessage(), e322);
            }
        }
        return null;
    }

    /* renamed from: c */
    final SharedPreferences m11746c(Context context) {
        return context.getSharedPreferences("appsflyer-data", 0);
    }

    /* renamed from: a */
    final int m11722a(SharedPreferences sharedPreferences, boolean z) {
        return m11643a(sharedPreferences, "appsFlyerCount", z);
    }

    /* renamed from: b */
    final int m11740b(SharedPreferences sharedPreferences, boolean z) {
        return m11643a(sharedPreferences, "appsFlyerInAppEventCount", z);
    }

    /* renamed from: a */
    private int m11643a(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = sharedPreferences.getInt(str, 0);
        if (z) {
            i++;
            Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            m11735a(edit);
        }
        if (aa.m3121a().m3142f() != null) {
            aa.m3121a().m3131a(String.valueOf(i));
        }
        return i;
    }

    /* renamed from: a */
    private long m11644a(Context context, boolean z) {
        long j = m11746c(context).getLong("AppsFlyerTimePassedSincePrevLaunch", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            m11659a(context, "AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        }
        return j > 0 ? (currentTimeMillis - j) / 1000 : -1;
    }

    /* renamed from: a */
    private void m11676a(String str, String str2, String str3, WeakReference<Context> weakReference, String str4, boolean z) throws IOException {
        URL url = new URL(str);
        StringBuilder stringBuilder = new StringBuilder("url: ");
        stringBuilder.append(url.toString());
        AFLogger.m3083d(stringBuilder.toString());
        stringBuilder = new StringBuilder("data: ");
        stringBuilder.append(str2);
        C0932h.m3183b(stringBuilder.toString());
        m11662a((Context) weakReference.get(), "AppsFlyer_4.8.7", "EVENT_DATA", str2);
        try {
            m11677a(url, str2, str3, (WeakReference) weakReference, str4, z);
        } catch (Throwable e) {
            AFLogger.m3073a("Exception in sendRequestToServer. ", e);
            if (AppsFlyerProperties.m3086a().m3098b("useHttpFallback", false)) {
                m11677a(new URL(str.replace("https:", "http:")), str2, str3, (WeakReference) weakReference, str4, z);
                return;
            }
            str = new StringBuilder("failed to send requeset to server. ");
            str.append(e.getLocalizedMessage());
            AFLogger.m3083d(str.toString());
            m11662a((Context) weakReference.get(), "AppsFlyer_4.8.7", "ERROR", e.getLocalizedMessage());
            throw e;
        }
    }

    /* renamed from: a */
    private void m11677a(URL url, String str, String str2, WeakReference<Context> weakReference, String str3, boolean z) throws IOException {
        Throwable th;
        C3010d c3010d = this;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Context context = (Context) weakReference.get();
        Object obj = (!z || f9360p == null) ? null : 1;
        OutputStreamWriter outputStreamWriter = null;
        HttpURLConnection httpURLConnection;
        try {
            aa.m3121a().m3134a(url.toString(), str4);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                int length = str.getBytes().length;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(length);
                httpURLConnection.setRequestProperty("Content-Length", stringBuilder.toString());
                httpURLConnection.setRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE, C15616a.ACCEPT_JSON_VALUE);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setDoOutput(true);
                try {
                    OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                    try {
                        outputStreamWriter2.write(str4);
                        outputStreamWriter2.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        String a = m11726a(httpURLConnection);
                        aa.m3121a().m3132a(url.toString(), responseCode, a);
                        StringBuilder stringBuilder2 = new StringBuilder("response code: ");
                        stringBuilder2.append(responseCode);
                        AFLogger.m3083d(stringBuilder2.toString());
                        m11662a(context, "AppsFlyer_4.8.7", "SERVER_RESPONSE_CODE", Integer.toString(responseCode));
                        SharedPreferences c = m11746c(context);
                        if (responseCode == Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                            if (weakReference.get() != null && z) {
                                c3010d.f9375l = System.currentTimeMillis();
                            }
                            str4 = m11694d("afUninstallToken");
                            if (str4 != null) {
                                StringBuilder stringBuilder3 = new StringBuilder("Uninstall Token exists: ");
                                stringBuilder3.append(str4);
                                AFLogger.m3080c(stringBuilder3.toString());
                                if (!c.getBoolean("sentRegisterRequestToAF", false)) {
                                    stringBuilder3 = new StringBuilder("Resending Uninstall token to AF servers: ");
                                    stringBuilder3.append(str4);
                                    AFLogger.m3080c(stringBuilder3.toString());
                                    C0932h.m3175a(context, new C0947q(str4));
                                }
                            } else if (m11694d("gcmProjectNumber") != null) {
                                AFLogger.m3080c("GCM Project number exists. Fetching token and sending to AF servers");
                                C0932h.m3178a(new WeakReference(context));
                            }
                            if (c3010d.f9385z != null) {
                                c3010d.f9385z = null;
                            }
                            if (str6 != null) {
                                C0917a.m3104a().m3109a(str6, context);
                            }
                            if (weakReference.get() != null && str6 == null) {
                                m11661a(context, "sentSuccessfully", "true");
                                m11721p(context);
                            }
                            c3010d.f9369H = C0929g.m3168a(a).optBoolean("send_background", false);
                        }
                        responseCode = c.getInt("appsflyerConversionDataRequestRetries", 0);
                        long j = c.getLong("appsflyerConversionDataCacheExpiration", 0);
                        if (j != 0 && System.currentTimeMillis() - j > 5184000000L) {
                            m11661a(context, "attributionId", null);
                            m11659a(context, "appsflyerConversionDataCacheExpiration", 0);
                        }
                        if (c.getString("attributionId", null) == null && str5 != null && obj != null && f9360p != null && responseCode <= 5) {
                            ScheduledExecutorService c2 = C0919a.m3116a().m3119c();
                            m11679a(c2, (Runnable) new C3009d(c3010d, context.getApplicationContext(), str5, c2), 10, TimeUnit.MILLISECONDS);
                        } else if (str5 == null) {
                            AFLogger.m3084e("AppsFlyer dev key is missing.");
                        } else if (!(obj == null || f9360p == null || c.getString("attributionId", null) == null || m11722a(c, false) <= 1)) {
                            Map h = m11707h(context);
                            if (h != null) {
                                try {
                                    if (!h.containsKey("is_first_launch")) {
                                        h.put("is_first_launch", Boolean.toString(false));
                                    }
                                    f9360p.onInstallConversionDataLoaded(h);
                                } catch (Throwable th2) {
                                    th = th2;
                                    AFLogger.m3073a(th.getLocalizedMessage(), th);
                                }
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable th22) {
                        th = th22;
                        outputStreamWriter = outputStreamWriter2;
                        if (outputStreamWriter != null) {
                            outputStreamWriter.close();
                        }
                        throw th;
                    }
                } catch (Throwable th222) {
                    th = th222;
                    if (outputStreamWriter != null) {
                        outputStreamWriter.close();
                    }
                    throw th;
                }
            } catch (Throwable th2222) {
                th = th2222;
                AFLogger.m3073a(th.getMessage(), th);
            } catch (Throwable th22222) {
                th = th22222;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th222222) {
            th = th222222;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m11679a(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!(scheduledExecutorService.isShutdown() || scheduledExecutorService.isTerminated())) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (Throwable e) {
                AFLogger.m3073a("scheduleJob failed with RejectedExecutionException Exception", e);
                return;
            } catch (Throwable e2) {
                AFLogger.m3073a("scheduleJob failed with Exception", e2);
            }
        }
        AFLogger.m3084e("scheduler is null, shut downed or terminated");
    }

    /* renamed from: a */
    public void mo1226a(Map<String, String> map) {
        this.f9378r = map;
    }

    /* renamed from: e */
    public boolean m11750e() {
        return this.f9370I;
    }

    @android.support.annotation.NonNull
    /* renamed from: a */
    java.lang.String m11726a(java.net.HttpURLConnection r8) {
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
        r7 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = 0;
        r2 = r8.getErrorStream();	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        if (r2 != 0) goto L_0x0010;	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
    L_0x000c:
        r2 = r8.getInputStream();	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
    L_0x0010:
        r3 = new java.io.InputStreamReader;	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r3.<init>(r2);	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r2 = new java.io.BufferedReader;	 Catch:{ Throwable -> 0x0038 }
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0038 }
    L_0x001a:
        r1 = r2.readLine();	 Catch:{ Throwable -> 0x0033, all -> 0x0030 }
        if (r1 == 0) goto L_0x0029;	 Catch:{ Throwable -> 0x0033, all -> 0x0030 }
    L_0x0020:
        r0.append(r1);	 Catch:{ Throwable -> 0x0033, all -> 0x0030 }
        r1 = 10;	 Catch:{ Throwable -> 0x0033, all -> 0x0030 }
        r0.append(r1);	 Catch:{ Throwable -> 0x0033, all -> 0x0030 }
        goto L_0x001a;
    L_0x0029:
        r2.close();	 Catch:{ Throwable -> 0x0060 }
    L_0x002c:
        r3.close();	 Catch:{ Throwable -> 0x0060 }
        goto L_0x0060;
    L_0x0030:
        r8 = move-exception;
        r1 = r2;
        goto L_0x0084;
    L_0x0033:
        r1 = move-exception;
        r6 = r2;
        r2 = r1;
        r1 = r6;
        goto L_0x003f;
    L_0x0038:
        r2 = move-exception;
        goto L_0x003f;
    L_0x003a:
        r8 = move-exception;
        r3 = r1;
        goto L_0x0084;
    L_0x003d:
        r2 = move-exception;
        r3 = r1;
    L_0x003f:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0083 }
        r5 = "Could not read connection response from: ";	 Catch:{ all -> 0x0083 }
        r4.<init>(r5);	 Catch:{ all -> 0x0083 }
        r8 = r8.getURL();	 Catch:{ all -> 0x0083 }
        r8 = r8.toString();	 Catch:{ all -> 0x0083 }
        r4.append(r8);	 Catch:{ all -> 0x0083 }
        r8 = r4.toString();	 Catch:{ all -> 0x0083 }
        com.appsflyer.AFLogger.m3073a(r8, r2);	 Catch:{ all -> 0x0083 }
        if (r1 == 0) goto L_0x005d;
    L_0x005a:
        r1.close();	 Catch:{ Throwable -> 0x0060 }
    L_0x005d:
        if (r3 == 0) goto L_0x0060;
    L_0x005f:
        goto L_0x002c;
    L_0x0060:
        r8 = r0.toString();
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x006a }
        r0.<init>(r8);	 Catch:{ JSONException -> 0x006a }
        return r8;
    L_0x006a:
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = "string_response";	 Catch:{ JSONException -> 0x0079 }
        r0.put(r1, r8);	 Catch:{ JSONException -> 0x0079 }
        r8 = r0.toString();	 Catch:{ JSONException -> 0x0079 }
        return r8;
    L_0x0079:
        r8 = new org.json.JSONObject;
        r8.<init>();
        r8 = r8.toString();
        return r8;
    L_0x0083:
        r8 = move-exception;
    L_0x0084:
        if (r1 == 0) goto L_0x0089;
    L_0x0086:
        r1.close();	 Catch:{ Throwable -> 0x008e }
    L_0x0089:
        if (r3 == 0) goto L_0x008e;	 Catch:{ Throwable -> 0x008e }
    L_0x008b:
        r3.close();	 Catch:{ Throwable -> 0x008e }
    L_0x008e:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.d.a(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: d */
    float m11748d(Context context) {
        float f;
        try {
            context = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = context.getIntExtra("level", -1);
            context = context.getIntExtra("scale", -1);
            if (intExtra != -1) {
                if (context != -1) {
                    f = (((float) intExtra) / ((float) context)) * 100.0f;
                    return f;
                }
            }
            return 50.0f;
        } catch (Throwable th) {
            AFLogger.m3073a(th.getMessage(), th);
            f = 1.0f;
        }
    }

    /* renamed from: f */
    public String m11751f() {
        return this.f9373i;
    }
}
