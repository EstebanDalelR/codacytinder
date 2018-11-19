package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType;
import com.facebook.internal.C1701b;
import com.facebook.internal.C1737q;
import com.facebook.internal.C1747v;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class FacebookSdk {
    /* renamed from: a */
    private static final String f3090a = FacebookSdk.class.getCanonicalName();
    /* renamed from: b */
    private static final HashSet<LoggingBehavior> f3091b = new HashSet(Arrays.asList(new LoggingBehavior[]{LoggingBehavior.DEVELOPER_ERRORS}));
    /* renamed from: c */
    private static Executor f3092c = null;
    /* renamed from: d */
    private static volatile String f3093d = null;
    /* renamed from: e */
    private static volatile String f3094e = null;
    /* renamed from: f */
    private static volatile String f3095f = null;
    /* renamed from: g */
    private static volatile Boolean f3096g = null;
    /* renamed from: h */
    private static volatile String f3097h = "facebook.com";
    /* renamed from: i */
    private static AtomicLong f3098i = new AtomicLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
    /* renamed from: j */
    private static volatile boolean f3099j = false;
    /* renamed from: k */
    private static boolean f3100k = false;
    /* renamed from: l */
    private static C1737q<File> f3101l = null;
    /* renamed from: m */
    private static Context f3102m = null;
    /* renamed from: n */
    private static int f3103n = 64206;
    /* renamed from: o */
    private static final Object f3104o = new Object();
    /* renamed from: p */
    private static String f3105p = C1747v.m6057d();
    /* renamed from: q */
    private static final BlockingQueue<Runnable> f3106q = new LinkedBlockingQueue(10);
    /* renamed from: r */
    private static final ThreadFactory f3107r = new C11701();
    /* renamed from: s */
    private static Boolean f3108s = Boolean.valueOf(false);

    /* renamed from: com.facebook.FacebookSdk$1 */
    static class C11701 implements ThreadFactory {
        /* renamed from: a */
        private final AtomicInteger f3085a = new AtomicInteger(0);

        C11701() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FacebookSdk #");
            stringBuilder.append(this.f3085a.incrementAndGet());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    /* renamed from: com.facebook.FacebookSdk$2 */
    static class C11712 implements Callable<File> {
        C11712() {
        }

        public /* synthetic */ Object call() throws Exception {
            return m3978a();
        }

        /* renamed from: a */
        public File m3978a() throws Exception {
            return FacebookSdk.f3102m.getCacheDir();
        }
    }

    public interface InitializeCallback {
        void onInitialized();
    }

    /* renamed from: g */
    public static String m3996g() {
        return "4.33.0";
    }

    @Deprecated
    /* renamed from: a */
    public static synchronized void m3980a(Context context) {
        synchronized (FacebookSdk.class) {
            m3981a(context, null);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @java.lang.Deprecated
    /* renamed from: a */
    public static synchronized void m3981a(final android.content.Context r3, final com.facebook.FacebookSdk.InitializeCallback r4) {
        /*
        r0 = com.facebook.FacebookSdk.class;
        monitor-enter(r0);
        r1 = f3108s;	 Catch:{ all -> 0x0081 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0081 }
        if (r1 == 0) goto L_0x0012;
    L_0x000b:
        if (r4 == 0) goto L_0x0010;
    L_0x000d:
        r4.onInitialized();	 Catch:{ all -> 0x0081 }
    L_0x0010:
        monitor-exit(r0);
        return;
    L_0x0012:
        r1 = "applicationContext";
        com.facebook.internal.C1749x.m6064a(r3, r1);	 Catch:{ all -> 0x0081 }
        r1 = 0;
        com.facebook.internal.C1749x.m6069b(r3, r1);	 Catch:{ all -> 0x0081 }
        com.facebook.internal.C1749x.m6063a(r3, r1);	 Catch:{ all -> 0x0081 }
        r1 = r3.getApplicationContext();	 Catch:{ all -> 0x0081 }
        f3102m = r1;	 Catch:{ all -> 0x0081 }
        r1 = f3102m;	 Catch:{ all -> 0x0081 }
        m3991c(r1);	 Catch:{ all -> 0x0081 }
        r1 = f3093d;	 Catch:{ all -> 0x0081 }
        r1 = com.facebook.internal.Utility.m5785a(r1);	 Catch:{ all -> 0x0081 }
        if (r1 == 0) goto L_0x0039;
    L_0x0031:
        r3 = new com.facebook.FacebookException;	 Catch:{ all -> 0x0081 }
        r4 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.";
        r3.<init>(r4);	 Catch:{ all -> 0x0081 }
        throw r3;	 Catch:{ all -> 0x0081 }
    L_0x0039:
        r1 = f3102m;	 Catch:{ all -> 0x0081 }
        r1 = r1 instanceof android.app.Application;	 Catch:{ all -> 0x0081 }
        if (r1 == 0) goto L_0x0050;
    L_0x003f:
        r1 = f3096g;	 Catch:{ all -> 0x0081 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0081 }
        if (r1 == 0) goto L_0x0050;
    L_0x0047:
        r1 = f3102m;	 Catch:{ all -> 0x0081 }
        r1 = (android.app.Application) r1;	 Catch:{ all -> 0x0081 }
        r2 = f3093d;	 Catch:{ all -> 0x0081 }
        com.facebook.appevents.internal.C1649a.m5584a(r1, r2);	 Catch:{ all -> 0x0081 }
    L_0x0050:
        r1 = 1;
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x0081 }
        f3108s = r1;	 Catch:{ all -> 0x0081 }
        com.facebook.internal.C1712j.m5911a();	 Catch:{ all -> 0x0081 }
        com.facebook.internal.C1745t.m6039b();	 Catch:{ all -> 0x0081 }
        r1 = f3102m;	 Catch:{ all -> 0x0081 }
        com.facebook.internal.BoltsMeasurementEventListener.m5706a(r1);	 Catch:{ all -> 0x0081 }
        r1 = new com.facebook.internal.q;	 Catch:{ all -> 0x0081 }
        r2 = new com.facebook.FacebookSdk$2;	 Catch:{ all -> 0x0081 }
        r2.<init>();	 Catch:{ all -> 0x0081 }
        r1.<init>(r2);	 Catch:{ all -> 0x0081 }
        f3101l = r1;	 Catch:{ all -> 0x0081 }
        r1 = new java.util.concurrent.FutureTask;	 Catch:{ all -> 0x0081 }
        r2 = new com.facebook.FacebookSdk$3;	 Catch:{ all -> 0x0081 }
        r2.<init>(r4, r3);	 Catch:{ all -> 0x0081 }
        r1.<init>(r2);	 Catch:{ all -> 0x0081 }
        r3 = m3990c();	 Catch:{ all -> 0x0081 }
        r3.execute(r1);	 Catch:{ all -> 0x0081 }
        monitor-exit(r0);
        return;
    L_0x0081:
        r3 = move-exception;
        monitor-exit(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookSdk.a(android.content.Context, com.facebook.FacebookSdk$InitializeCallback):void");
    }

    public static synchronized boolean isInitialized() {
        boolean booleanValue;
        synchronized (FacebookSdk.class) {
            booleanValue = f3108s.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    public static boolean m3986a(LoggingBehavior loggingBehavior) {
        synchronized (f3091b) {
            loggingBehavior = (!m3984a() || f3091b.contains(loggingBehavior) == null) ? null : true;
        }
        return loggingBehavior;
    }

    /* renamed from: a */
    public static boolean m3984a() {
        return f3099j;
    }

    /* renamed from: b */
    public static boolean m3988b() {
        return f3100k;
    }

    /* renamed from: a */
    public static void m3983a(boolean z) {
        f3100k = z;
    }

    /* renamed from: c */
    public static Executor m3990c() {
        synchronized (f3104o) {
            if (f3092c == null) {
                f3092c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f3092c;
    }

    /* renamed from: d */
    public static String m3992d() {
        return f3097h;
    }

    /* renamed from: e */
    public static Context m3994e() {
        C1749x.m6061a();
        return f3102m;
    }

    /* renamed from: f */
    public static String m3995f() {
        Log.d(f3090a, String.format("getGraphApiVersion: %s", new Object[]{f3105p}));
        return f3105p;
    }

    /* renamed from: a */
    public static void m3982a(Context context, final String str) {
        context = context.getApplicationContext();
        m3990c().execute(new Runnable() {
            public void run() {
                FacebookSdk.m3987b(context, str);
            }
        });
    }

    /* renamed from: b */
    static void m3987b(Context context, String str) {
        if (context != null) {
            if (str != null) {
                try {
                    C1701b a = C1701b.m5867a(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append("ping");
                    String stringBuilder2 = stringBuilder.toString();
                    long j = sharedPreferences.getLong(stringBuilder2, 0);
                    context = GraphRequest.m4013a(null, String.format("%s/activities", new Object[]{str}), AppEventsLoggerUtility.m5579a(GraphAPIActivityType.MOBILE_INSTALL_EVENT, a, AppEventsLogger.m5521a(context), m3989b(context), context), null);
                    if (j == 0) {
                        context.m4065i();
                        context = sharedPreferences.edit();
                        context.putLong(stringBuilder2, System.currentTimeMillis());
                        context.apply();
                        return;
                    }
                    return;
                } catch (Throwable e) {
                    throw new FacebookException("An error occurred while publishing install.", e);
                } catch (Exception e2) {
                    Utility.m5777a("Facebook-publish", e2);
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Both context and applicationId must be non-null");
    }

    /* renamed from: b */
    public static boolean m3989b(Context context) {
        C1749x.m6061a();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: h */
    public static long m3997h() {
        C1749x.m6061a();
        return f3098i.get();
    }

    /* renamed from: c */
    static void m3991c(android.content.Context r3) {
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
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r3.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0092 }
        r3 = r3.getPackageName();	 Catch:{ NameNotFoundException -> 0x0092 }
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0092 }
        r3 = r0.getApplicationInfo(r3, r1);	 Catch:{ NameNotFoundException -> 0x0092 }
        if (r3 == 0) goto L_0x0091;
    L_0x0013:
        r0 = r3.metaData;
        if (r0 != 0) goto L_0x0019;
    L_0x0017:
        goto L_0x0091;
    L_0x0019:
        r0 = f3093d;
        if (r0 != 0) goto L_0x0050;
    L_0x001d:
        r0 = r3.metaData;
        r1 = "com.facebook.sdk.ApplicationId";
        r0 = r0.get(r1);
        r1 = r0 instanceof java.lang.String;
        if (r1 == 0) goto L_0x0044;
    L_0x0029:
        r0 = (java.lang.String) r0;
        r1 = java.util.Locale.ROOT;
        r1 = r0.toLowerCase(r1);
        r2 = "fb";
        r1 = r1.startsWith(r2);
        if (r1 == 0) goto L_0x0041;
    L_0x0039:
        r1 = 2;
        r0 = r0.substring(r1);
        f3093d = r0;
        goto L_0x0050;
    L_0x0041:
        f3093d = r0;
        goto L_0x0050;
    L_0x0044:
        r0 = r0 instanceof java.lang.Integer;
        if (r0 == 0) goto L_0x0050;
    L_0x0048:
        r3 = new com.facebook.FacebookException;
        r0 = "App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.";
        r3.<init>(r0);
        throw r3;
    L_0x0050:
        r0 = f3094e;
        if (r0 != 0) goto L_0x005e;
    L_0x0054:
        r0 = r3.metaData;
        r1 = "com.facebook.sdk.ApplicationName";
        r0 = r0.getString(r1);
        f3094e = r0;
    L_0x005e:
        r0 = f3095f;
        if (r0 != 0) goto L_0x006c;
    L_0x0062:
        r0 = r3.metaData;
        r1 = "com.facebook.sdk.ClientToken";
        r0 = r0.getString(r1);
        f3095f = r0;
    L_0x006c:
        r0 = f3103n;
        r1 = 64206; // 0xface float:8.9972E-41 double:3.1722E-319;
        if (r0 != r1) goto L_0x007d;
    L_0x0073:
        r0 = r3.metaData;
        r2 = "com.facebook.sdk.CallbackOffset";
        r0 = r0.getInt(r2, r1);
        f3103n = r0;
    L_0x007d:
        r0 = f3096g;
        if (r0 != 0) goto L_0x0090;
    L_0x0081:
        r3 = r3.metaData;
        r0 = "com.facebook.sdk.AutoLogAppEventsEnabled";
        r1 = 1;
        r3 = r3.getBoolean(r0, r1);
        r3 = java.lang.Boolean.valueOf(r3);
        f3096g = r3;
    L_0x0090:
        return;
    L_0x0091:
        return;
    L_0x0092:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookSdk.c(android.content.Context):void");
    }

    /* renamed from: d */
    public static java.lang.String m3993d(android.content.Context r3) {
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
        com.facebook.internal.C1749x.m6061a();
        r0 = 0;
        if (r3 != 0) goto L_0x0007;
    L_0x0006:
        return r0;
    L_0x0007:
        r1 = r3.getPackageManager();
        if (r1 != 0) goto L_0x000e;
    L_0x000d:
        return r0;
    L_0x000e:
        r3 = r3.getPackageName();
        r2 = 64;
        r3 = r1.getPackageInfo(r3, r2);	 Catch:{ NameNotFoundException -> 0x003f }
        r1 = r3.signatures;
        if (r1 == 0) goto L_0x003e;
    L_0x001c:
        r1 = r1.length;
        if (r1 != 0) goto L_0x0020;
    L_0x001f:
        goto L_0x003e;
    L_0x0020:
        r1 = "SHA-1";	 Catch:{ NoSuchAlgorithmException -> 0x003d }
        r1 = java.security.MessageDigest.getInstance(r1);	 Catch:{ NoSuchAlgorithmException -> 0x003d }
        r3 = r3.signatures;
        r0 = 0;
        r3 = r3[r0];
        r3 = r3.toByteArray();
        r1.update(r3);
        r3 = r1.digest();
        r0 = 9;
        r3 = android.util.Base64.encodeToString(r3, r0);
        return r3;
    L_0x003d:
        return r0;
    L_0x003e:
        return r0;
    L_0x003f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookSdk.d(android.content.Context):java.lang.String");
    }

    /* renamed from: i */
    public static String m3998i() {
        C1749x.m6061a();
        return f3093d;
    }

    /* renamed from: j */
    public static String m3999j() {
        C1749x.m6061a();
        return f3094e;
    }

    /* renamed from: k */
    public static String m4000k() {
        C1749x.m6061a();
        return f3095f;
    }

    /* renamed from: l */
    public static boolean m4001l() {
        C1749x.m6061a();
        return f3096g.booleanValue();
    }

    /* renamed from: m */
    public static File m4002m() {
        C1749x.m6061a();
        return (File) f3101l.m5975a();
    }

    /* renamed from: n */
    public static int m4003n() {
        C1749x.m6061a();
        return f3103n;
    }

    /* renamed from: a */
    public static boolean m3985a(int i) {
        return i >= f3103n && i < f3103n + 100;
    }
}
