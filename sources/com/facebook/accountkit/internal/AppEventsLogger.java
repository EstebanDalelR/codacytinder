package com.facebook.accountkit.internal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;
import com.facebook.accountkit.LoggingBehavior;
import com.facebook.accountkit.internal.AccountKitGraphRequest.Callback;
import com.facebook.ads.AdError;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

final class AppEventsLogger {
    /* renamed from: a */
    private static final String f3227a = AppEventsLogger.class.getCanonicalName();
    /* renamed from: b */
    private static final Object f3228b = new Object();
    /* renamed from: c */
    private static String f3229c;
    /* renamed from: d */
    private static boolean f3230d;
    /* renamed from: e */
    private static final Map<SessionEventsStateKey, C1210c> f3231e = new ConcurrentHashMap();
    /* renamed from: f */
    private static final Executor f3232f = new ThreadPoolExecutor(1, 4, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), new C12031(), new C12042());
    /* renamed from: g */
    private final Context f3233g;
    /* renamed from: h */
    private final SessionEventsStateKey f3234h;

    /* renamed from: com.facebook.accountkit.internal.AppEventsLogger$1 */
    static class C12031 implements ThreadFactory {
        /* renamed from: a */
        private final AtomicInteger f3202a = new AtomicInteger(1);

        C12031() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("App Event Thread #");
            stringBuilder.append(this.f3202a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    /* renamed from: com.facebook.accountkit.internal.AppEventsLogger$2 */
    static class C12042 extends DiscardPolicy {
        C12042() {
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            super.rejectedExecution(runnable, threadPoolExecutor);
            Log.e(AppEventsLogger.f3227a, "App Event Dropped");
        }
    }

    /* renamed from: com.facebook.accountkit.internal.AppEventsLogger$4 */
    class C12064 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ AppEventsLogger f3205a;

        C12064(AppEventsLogger appEventsLogger) {
            this.f3205a = appEventsLogger;
        }

        public void run() {
            this.f3205a.m4204b(FlushReason.TIMER);
        }
    }

    private static class AppEvent implements Serializable {
        /* renamed from: c */
        private static final HashSet<String> f3210c = new HashSet();
        private static final long serialVersionUID = 1;
        /* renamed from: a */
        final boolean f3211a;
        /* renamed from: b */
        final JSONObject f3212b;

        private static class SerializationProxyV1 implements Serializable {
            private static final long serialVersionUID = -2488473066578201069L;
            /* renamed from: a */
            private final boolean f3208a;
            /* renamed from: b */
            private final String f3209b;

            private SerializationProxyV1(String str, boolean z) {
                this.f3209b = str;
                this.f3208a = z;
            }

            private Object readResolve() throws JSONException {
                return new AppEvent(this.f3209b, this.f3208a);
            }
        }

        AppEvent(String str, Double d, Bundle bundle, boolean z) {
            this.f3211a = z;
            JSONObject jSONObject = null;
            try {
                m4179a(str);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("_eventName", str);
                jSONObject2.put("_logTime", System.currentTimeMillis() / 1000);
                if (d != null) {
                    jSONObject2.put("_valueToSum", d.doubleValue());
                }
                if (z) {
                    jSONObject2.put("_implicitlyLogged", "1");
                }
                if (bundle != null) {
                    for (String str2 : bundle.keySet()) {
                        m4179a(str2);
                        Object obj = bundle.get(str2);
                        if ((obj instanceof String) || (obj instanceof Number)) {
                            jSONObject2.put(str2, obj.toString());
                        } else {
                            throw new AccountKitException(Type.ARGUMENT_ERROR, new InternalAccountKitError(InternalAccountKitError.INVALID_PARAMETER_TYPE, obj, str2));
                        }
                    }
                }
                if (!z) {
                    C1229h.m4343a(LoggingBehavior.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject2.toString());
                }
                jSONObject = jSONObject2;
            } catch (String str3) {
                C1229h.m4343a(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", str3.toString());
            } catch (String str32) {
                C1229h.m4343a(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event name or parameter:", str32.toString());
            }
            this.f3212b = jSONObject;
        }

        private AppEvent(String str, boolean z) throws JSONException {
            this.f3212b = new JSONObject(str);
            this.f3211a = z;
        }

        /* renamed from: a */
        private void m4179a(String str) throws AccountKitException {
            if (!(str == null || str.length() == 0)) {
                if (str.length() <= 40) {
                    boolean contains;
                    synchronized (f3210c) {
                        contains = f3210c.contains(str);
                    }
                    if (!contains) {
                        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
                            synchronized (f3210c) {
                                f3210c.add(str);
                            }
                            return;
                        }
                        throw new AccountKitException(Type.INTERNAL_ERROR, new InternalAccountKitError(InternalAccountKitError.INVALID_PARAMETER_TYPE, str));
                    }
                    return;
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            throw new AccountKitException(Type.INTERNAL_ERROR, new InternalAccountKitError(InternalAccountKitError.INVALID_PARAMETER_TYPE, str, Integer.valueOf(40)));
        }

        private Object writeReplace() {
            return new SerializationProxyV1(this.f3212b.toString(), this.f3211a);
        }

        public String toString() {
            return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.f3212b.optString("_eventName"), Boolean.valueOf(this.f3211a), this.f3212b.toString()});
        }
    }

    private enum FlushReason {
        EXPLICIT,
        TIMER,
        SESSION_CHANGE,
        PERSISTED_EVENTS,
        EVENT_THRESHOLD,
        EAGER_FLUSHING_EVENT
    }

    private enum FlushResult {
        SUCCESS,
        SERVER_ERROR,
        NO_CONNECTIVITY,
        UNKNOWN_ERROR
    }

    private static class SessionEventsStateKey implements Serializable {
        private static final long serialVersionUID = 1;
        /* renamed from: a */
        public final String f3215a;
        /* renamed from: b */
        private final String f3216b;

        private static class SerializationProxyV1 implements Serializable {
            private static final long serialVersionUID = -1;
            /* renamed from: a */
            private final String f3213a;
            /* renamed from: b */
            private final String f3214b;

            private SerializationProxyV1(String str, String str2) {
                this.f3213a = str;
                this.f3214b = str2;
            }

            private Object readResolve() {
                return new SessionEventsStateKey(this.f3213a, this.f3214b);
            }
        }

        SessionEventsStateKey(AccessToken accessToken) {
            this(accessToken.getToken(), AccountKit.m4119h());
        }

        SessionEventsStateKey(String str, String str2) {
            if (C1251w.m4500a(str)) {
                str = null;
            }
            this.f3216b = str;
            this.f3215a = str2;
        }

        public int hashCode() {
            return C1251w.m4481a(this.f3216b) ^ C1251w.m4481a(this.f3215a);
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof SessionEventsStateKey)) {
                return false;
            }
            SessionEventsStateKey sessionEventsStateKey = (SessionEventsStateKey) obj;
            if (C1251w.m4505b(sessionEventsStateKey.f3216b, this.f3216b) && C1251w.m4505b(sessionEventsStateKey.f3215a, this.f3215a) != null) {
                z = true;
            }
            return z;
        }

        private Object writeReplace() {
            return new SerializationProxyV1(this.f3216b, this.f3215a);
        }
    }

    /* renamed from: com.facebook.accountkit.internal.AppEventsLogger$a */
    private static class C1208a {
        /* renamed from: a */
        int f3217a;
        /* renamed from: b */
        public FlushResult f3218b;

        private C1208a() {
            this.f3217a = 0;
            this.f3218b = FlushResult.SUCCESS;
        }
    }

    /* renamed from: com.facebook.accountkit.internal.AppEventsLogger$b */
    private static class C1209b {
        /* renamed from: a */
        private static final Object f3219a = new Object();
        /* renamed from: b */
        private final Context f3220b;
        /* renamed from: c */
        private HashMap<SessionEventsStateKey, List<AppEvent>> f3221c = new HashMap();

        private C1209b(Context context) {
            this.f3220b = context;
        }

        /* renamed from: a */
        static C1209b m4180a(Context context) {
            C1209b c1209b;
            synchronized (f3219a) {
                c1209b = new C1209b(context);
                c1209b.m4183b();
            }
            return c1209b;
        }

        /* renamed from: a */
        static void m4182a(Context context, SessionEventsStateKey sessionEventsStateKey, C1210c c1210c) {
            c1210c = c1210c.m4190b();
            if (c1210c.size() != 0) {
                synchronized (f3219a) {
                    context = C1209b.m4180a(context);
                    context.m4184a(sessionEventsStateKey, c1210c);
                    context.m4181a();
                }
            }
        }

        /* renamed from: a */
        private void m4181a() {
            OutputStream outputStream;
            Exception exception;
            String a;
            StringBuilder stringBuilder;
            Throwable th;
            Closeable closeable = null;
            try {
                OutputStream openFileOutput = this.f3220b.openFileOutput("AccountKitAppEventsLogger.persistedevents", 0);
                try {
                    closeable = new BufferedOutputStream(openFileOutput);
                    openFileOutput = new ObjectOutputStream(closeable);
                    openFileOutput.writeObject(this.f3221c);
                    C1251w.m4491a((Closeable) openFileOutput);
                } catch (Exception e) {
                    outputStream = openFileOutput;
                    exception = e;
                    closeable = outputStream;
                    try {
                        a = AppEventsLogger.f3227a;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Got unexpected exception: ");
                        stringBuilder.append(exception.toString());
                        Log.d(a, stringBuilder.toString());
                        C1251w.m4491a(closeable);
                    } catch (Throwable th2) {
                        th = th2;
                        C1251w.m4491a(closeable);
                        throw th;
                    }
                } catch (Throwable th3) {
                    outputStream = openFileOutput;
                    th = th3;
                    closeable = outputStream;
                    C1251w.m4491a(closeable);
                    throw th;
                }
            } catch (Exception e2) {
                exception = e2;
                a = AppEventsLogger.f3227a;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Got unexpected exception: ");
                stringBuilder.append(exception.toString());
                Log.d(a, stringBuilder.toString());
                C1251w.m4491a(closeable);
            }
        }

        /* renamed from: b */
        private void m4183b() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r6 = this;
            r0 = 0;
            r1 = new java.io.BufferedInputStream;	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            r2 = r6.f3220b;	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            r3 = "AccountKitAppEventsLogger.persistedevents";	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            r2 = r2.openFileInput(r3);	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            r0 = new java.io.ObjectInputStream;	 Catch:{ FileNotFoundException -> 0x003d, Exception -> 0x0038, all -> 0x0033 }
            r0.<init>(r1);	 Catch:{ FileNotFoundException -> 0x003d, Exception -> 0x0038, all -> 0x0033 }
            r1 = r0.readObject();	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            r1 = (java.util.HashMap) r1;	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            r2 = r6.f3220b;	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            r3 = "AccountKitAppEventsLogger.persistedevents";	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            r2 = r2.getFileStreamPath(r3);	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            r2 = r2.delete();	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            if (r2 != 0) goto L_0x0030;	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
        L_0x0027:
            r2 = com.facebook.accountkit.internal.AppEventsLogger.f3227a;	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            r3 = "Error deleting file: AccountKitAppEventsLogger.persistedevents";	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            android.util.Log.d(r2, r3);	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
        L_0x0030:
            r6.f3221c = r1;	 Catch:{ FileNotFoundException -> 0x0063, Exception -> 0x0041 }
            goto L_0x0063;
        L_0x0033:
            r0 = move-exception;
            r5 = r1;
            r1 = r0;
            r0 = r5;
            goto L_0x005f;
        L_0x0038:
            r0 = move-exception;
            r5 = r1;
            r1 = r0;
            r0 = r5;
            goto L_0x0042;
        L_0x003d:
            r0 = r1;
            goto L_0x0063;
        L_0x003f:
            r1 = move-exception;
            goto L_0x005f;
        L_0x0041:
            r1 = move-exception;
        L_0x0042:
            r2 = com.facebook.accountkit.internal.AppEventsLogger.f3227a;	 Catch:{ all -> 0x003f }
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003f }
            r3.<init>();	 Catch:{ all -> 0x003f }
            r4 = "Got unexpected exception: ";	 Catch:{ all -> 0x003f }
            r3.append(r4);	 Catch:{ all -> 0x003f }
            r1 = r1.toString();	 Catch:{ all -> 0x003f }
            r3.append(r1);	 Catch:{ all -> 0x003f }
            r1 = r3.toString();	 Catch:{ all -> 0x003f }
            android.util.Log.d(r2, r1);	 Catch:{ all -> 0x003f }
            goto L_0x0063;
        L_0x005f:
            com.facebook.accountkit.internal.C1251w.m4491a(r0);
            throw r1;
        L_0x0063:
            com.facebook.accountkit.internal.C1251w.m4491a(r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.AppEventsLogger.b.b():void");
        }

        /* renamed from: a */
        void m4184a(SessionEventsStateKey sessionEventsStateKey, List<AppEvent> list) {
            if (!this.f3221c.containsKey(sessionEventsStateKey)) {
                this.f3221c.put(sessionEventsStateKey, new ArrayList());
            }
            ((List) this.f3221c.get(sessionEventsStateKey)).addAll(list);
        }
    }

    /* renamed from: com.facebook.accountkit.internal.AppEventsLogger$c */
    private static class C1210c {
        /* renamed from: a */
        private List<AppEvent> f3222a = new ArrayList();
        /* renamed from: b */
        private final String f3223b;
        /* renamed from: c */
        private final Context f3224c;
        /* renamed from: d */
        private final List<AppEvent> f3225d = new ArrayList();
        /* renamed from: e */
        private int f3226e;

        C1210c(Context context, String str) {
            this.f3224c = context;
            this.f3223b = str;
        }

        /* renamed from: a */
        synchronized void m4188a(AppEvent appEvent) {
            if (this.f3222a.size() + this.f3225d.size() >= AdError.NETWORK_ERROR_CODE) {
                this.f3226e++;
            } else {
                this.f3222a.add(appEvent);
            }
        }

        /* renamed from: a */
        synchronized int m4186a() {
            return this.f3222a.size();
        }

        /* renamed from: a */
        synchronized void m4189a(boolean z) {
            if (z) {
                this.f3222a.addAll(this.f3225d);
            }
            this.f3225d.clear();
            this.f3226e = false;
        }

        /* renamed from: a */
        int m4187a(com.facebook.accountkit.internal.AccountKitGraphRequest r6) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r5 = this;
            monitor-enter(r5);
            r0 = r5.f3226e;	 Catch:{ all -> 0x0071 }
            r1 = r5.f3225d;	 Catch:{ all -> 0x0071 }
            r2 = r5.f3222a;	 Catch:{ all -> 0x0071 }
            r1.addAll(r2);	 Catch:{ all -> 0x0071 }
            r1 = r5.f3222a;	 Catch:{ all -> 0x0071 }
            r1.clear();	 Catch:{ all -> 0x0071 }
            r1 = new org.json.JSONArray;	 Catch:{ all -> 0x0071 }
            r1.<init>();	 Catch:{ all -> 0x0071 }
            r2 = r5.f3225d;	 Catch:{ all -> 0x0071 }
            r2 = r2.iterator();	 Catch:{ all -> 0x0071 }
        L_0x001a:
            r3 = r2.hasNext();	 Catch:{ all -> 0x0071 }
            if (r3 == 0) goto L_0x002c;	 Catch:{ all -> 0x0071 }
        L_0x0020:
            r3 = r2.next();	 Catch:{ all -> 0x0071 }
            r3 = (com.facebook.accountkit.internal.AppEventsLogger.AppEvent) r3;	 Catch:{ all -> 0x0071 }
            r3 = r3.f3212b;	 Catch:{ all -> 0x0071 }
            r1.put(r3);	 Catch:{ all -> 0x0071 }
            goto L_0x001a;	 Catch:{ all -> 0x0071 }
        L_0x002c:
            r2 = r1.length();	 Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x0035;	 Catch:{ all -> 0x0071 }
        L_0x0032:
            r6 = 0;	 Catch:{ all -> 0x0071 }
            monitor-exit(r5);	 Catch:{ all -> 0x0071 }
            return r6;	 Catch:{ all -> 0x0071 }
        L_0x0035:
            monitor-exit(r5);	 Catch:{ all -> 0x0071 }
            r2 = r5.m4191c();	 Catch:{ JSONException -> 0x0044 }
            r3 = r5.f3226e;	 Catch:{ JSONException -> 0x0044 }
            if (r3 <= 0) goto L_0x0049;	 Catch:{ JSONException -> 0x0044 }
        L_0x003e:
            r3 = "num_skipped_events";	 Catch:{ JSONException -> 0x0044 }
            r2.put(r3, r0);	 Catch:{ JSONException -> 0x0044 }
            goto L_0x0049;
        L_0x0044:
            r2 = new org.json.JSONObject;
            r2.<init>();
        L_0x0049:
            r6.m4171a(r2);
            r0 = r6.m4174c();
            if (r0 != 0) goto L_0x0057;
        L_0x0052:
            r0 = new android.os.Bundle;
            r0.<init>();
        L_0x0057:
            r2 = r1.toString();
            if (r2 == 0) goto L_0x0069;
        L_0x005d:
            r3 = "events_file";
            r4 = r5.m4185a(r2);
            r0.putByteArray(r3, r4);
            r6.m4170a(r2);
        L_0x0069:
            r6.m4167a(r0);
            r6 = r1.length();
            return r6;
        L_0x0071:
            r6 = move-exception;
            monitor-exit(r5);	 Catch:{ all -> 0x0071 }
            throw r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.AppEventsLogger.c.a(com.facebook.accountkit.internal.AccountKitGraphRequest):int");
        }

        /* renamed from: b */
        synchronized List<AppEvent> m4190b() {
            List<AppEvent> list;
            list = this.f3222a;
            this.f3222a = new ArrayList();
            return list;
        }

        /* renamed from: c */
        public JSONObject m4191c() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            C1251w.m4503b(jSONObject, this.f3223b);
            try {
                C1251w.m4495a(jSONObject, this.f3224c);
            } catch (Exception e) {
                C1229h.m4343a(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
            }
            return jSONObject;
        }

        /* renamed from: a */
        private byte[] m4185a(String str) {
            try {
                return str.getBytes("UTF-8");
            } catch (Exception e) {
                C1251w.m4492a("Encoding exception: ", e);
                return null;
            }
        }
    }

    AppEventsLogger(@NonNull Context context, String str) {
        AccessToken e = AccountKit.m4116e();
        if (e == null || !(str == null || str.equals(e.getApplicationId()))) {
            if (str == null) {
                str = C1251w.m4507c();
            }
            this.f3234h = new SessionEventsStateKey(null, str);
        } else {
            this.f3234h = new SessionEventsStateKey(e);
        }
        this.f3233g = context;
        m4203b();
    }

    /* renamed from: a */
    void m4208a(String str, Double d, Bundle bundle) {
        final AppEvent appEvent = new AppEvent(str, d, bundle, true);
        f3232f.execute(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ AppEventsLogger f3204b;

            public void run() {
                this.f3204b.m4193a(this.f3204b.f3234h).m4188a(appEvent);
                this.f3204b.m4206c();
            }
        });
    }

    /* renamed from: b */
    private void m4203b() {
        C1251w.m4489a().scheduleAtFixedRate(new C12064(this), 0, 15, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    private static String m4197a(Context context) {
        if (f3229c == null) {
            synchronized (f3228b) {
                if (f3229c == null) {
                    context = context.getSharedPreferences("com.facebook.accountkit.sdk.appEventPreferences", 0);
                    f3229c = context.getString("anonymousAppDeviceGUID", null);
                    if (f3229c == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("XZ");
                        stringBuilder.append(UUID.randomUUID().toString());
                        f3229c = stringBuilder.toString();
                        context.edit().putString("anonymousAppDeviceGUID", f3229c).apply();
                    }
                }
            }
        }
        return f3229c;
    }

    /* renamed from: c */
    private void m4206c() {
        synchronized (f3228b) {
            if (m4207d() > 30) {
                m4198a(FlushReason.EVENT_THRESHOLD);
            }
        }
    }

    /* renamed from: d */
    private static int m4207d() {
        int i;
        synchronized (f3228b) {
            i = 0;
            for (C1210c a : f3231e.values()) {
                i += a.m4186a();
            }
        }
        return i;
    }

    /* renamed from: a */
    private C1210c m4193a(SessionEventsStateKey sessionEventsStateKey) {
        C1210c c1210c = (C1210c) f3231e.get(sessionEventsStateKey);
        if (c1210c == null) {
            synchronized (f3228b) {
                c1210c = (C1210c) f3231e.get(sessionEventsStateKey);
                if (c1210c == null) {
                    c1210c = new C1210c(this.f3233g, m4197a(this.f3233g));
                    f3231e.put(sessionEventsStateKey, c1210c);
                }
            }
        }
        return c1210c;
    }

    /* renamed from: a */
    private void m4198a(final FlushReason flushReason) {
        f3232f.execute(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ AppEventsLogger f3207b;

            public void run() {
                this.f3207b.m4204b(flushReason);
            }
        });
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private void m4204b(com.facebook.accountkit.internal.AppEventsLogger.FlushReason r4) {
        /*
        r3 = this;
        r0 = f3228b;
        monitor-enter(r0);
        r1 = f3230d;	 Catch:{ all -> 0x002f }
        if (r1 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        return;
    L_0x0009:
        r1 = 1;
        f3230d = r1;	 Catch:{ all -> 0x002f }
        r1 = new java.util.HashSet;	 Catch:{ all -> 0x002f }
        r2 = f3231e;	 Catch:{ all -> 0x002f }
        r2 = r2.keySet();	 Catch:{ all -> 0x002f }
        r1.<init>(r2);	 Catch:{ all -> 0x002f }
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        r3.m4199a(r4, r1);	 Catch:{ Exception -> 0x001c }
        goto L_0x0024;
    L_0x001c:
        r4 = move-exception;
        r0 = f3227a;
        r1 = "Caught unexpected exception while flushing: ";
        com.facebook.accountkit.internal.C1251w.m4493a(r0, r1, r4);
    L_0x0024:
        r4 = f3228b;
        monitor-enter(r4);
        r0 = 0;
        f3230d = r0;	 Catch:{ all -> 0x002c }
        monitor-exit(r4);	 Catch:{ all -> 0x002c }
        return;
    L_0x002c:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x002c }
        throw r0;
    L_0x002f:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002f }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.AppEventsLogger.b(com.facebook.accountkit.internal.AppEventsLogger$FlushReason):void");
    }

    /* renamed from: a */
    private void m4199a(FlushReason flushReason, Set<SessionEventsStateKey> set) {
        C1208a c1208a = new C1208a();
        List<C1224e> arrayList = new ArrayList();
        for (SessionEventsStateKey sessionEventsStateKey : set) {
            C1210c a = m4193a(sessionEventsStateKey);
            if (a != null) {
                C1224e a2 = m4195a(sessionEventsStateKey, a, c1208a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (arrayList.size() > null) {
            C1229h.m4343a(LoggingBehavior.APP_EVENTS, f3227a, "Flushing %d events due to %s.", Integer.valueOf(c1208a.f3217a), flushReason.toString());
            for (C1224e executeOnExecutor : arrayList) {
                executeOnExecutor.executeOnExecutor(f3232f, new Void[0]);
            }
        }
    }

    /* renamed from: a */
    private C1224e m4195a(SessionEventsStateKey sessionEventsStateKey, C1210c c1210c, C1208a c1208a) {
        AccountKitGraphRequest accountKitGraphRequest = new AccountKitGraphRequest(null, String.format("%s/events", new Object[]{sessionEventsStateKey.f3215a}), null, false, HttpMethod.POST);
        int a = c1210c.m4187a(accountKitGraphRequest);
        if (a == 0) {
            return null;
        }
        c1208a.f3217a += a;
        final SessionEventsStateKey sessionEventsStateKey2 = sessionEventsStateKey;
        final AccountKitGraphRequest accountKitGraphRequest2 = accountKitGraphRequest;
        final C1210c c1210c2 = c1210c;
        final C1208a c1208a2 = c1208a;
        return new C1224e(accountKitGraphRequest, new Callback(this) {
            /* renamed from: e */
            final /* synthetic */ AppEventsLogger f9742e;

            public void onCompleted(C1227f c1227f) {
                this.f9742e.m4200a(sessionEventsStateKey2, accountKitGraphRequest2, c1227f, c1210c2, c1208a2);
            }
        });
    }

    /* renamed from: a */
    private void m4200a(com.facebook.accountkit.internal.AppEventsLogger.SessionEventsStateKey r11, com.facebook.accountkit.internal.AccountKitGraphRequest r12, @android.support.annotation.Nullable com.facebook.accountkit.internal.C1227f r13, com.facebook.accountkit.internal.AppEventsLogger.C1210c r14, com.facebook.accountkit.internal.AppEventsLogger.C1208a r15) {
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
        r10 = this;
        if (r13 != 0) goto L_0x0004;
    L_0x0002:
        r0 = 0;
        goto L_0x0008;
    L_0x0004:
        r0 = r13.m4333a();
    L_0x0008:
        r1 = "Success";
        r2 = com.facebook.accountkit.internal.AppEventsLogger.FlushResult.SUCCESS;
        r3 = 1;
        r4 = 0;
        r5 = 2;
        if (r0 == 0) goto L_0x0033;
    L_0x0011:
        r1 = r0.m4335a();
        r2 = -1;
        if (r1 != r2) goto L_0x001d;
    L_0x0018:
        r1 = "Failed: No Connectivity";
        r2 = com.facebook.accountkit.internal.AppEventsLogger.FlushResult.NO_CONNECTIVITY;
        goto L_0x0033;
    L_0x001d:
        r1 = "Failed:\n  Response: %s\n  Error %s";
        r2 = new java.lang.Object[r5];
        r13 = r13.toString();
        r2[r4] = r13;
        r13 = r0.toString();
        r2[r3] = r13;
        r1 = java.lang.String.format(r1, r2);
        r2 = com.facebook.accountkit.internal.AppEventsLogger.FlushResult.SERVER_ERROR;
    L_0x0033:
        r13 = com.facebook.accountkit.AccountKit.m4109a();
        r6 = com.facebook.accountkit.LoggingBehavior.APP_EVENTS;
        r13 = r13.m4130a(r6);
        if (r13 == 0) goto L_0x006b;
    L_0x003f:
        r13 = r12.m4176e();
        r13 = (java.lang.String) r13;
        r6 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x004f }
        r6.<init>(r13);	 Catch:{ JSONException -> 0x004f }
        r13 = r6.toString(r5);	 Catch:{ JSONException -> 0x004f }
        goto L_0x0051;
    L_0x004f:
        r13 = "<Can't encode events for debug logging>";
    L_0x0051:
        r6 = com.facebook.accountkit.LoggingBehavior.APP_EVENTS;
        r7 = f3227a;
        r8 = "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s";
        r9 = 3;
        r9 = new java.lang.Object[r9];
        r12 = r12.m4173b();
        r12 = r12.toString();
        r9[r4] = r12;
        r9[r3] = r1;
        r9[r5] = r13;
        com.facebook.accountkit.internal.C1229h.m4343a(r6, r7, r8, r9);
    L_0x006b:
        if (r0 == 0) goto L_0x006e;
    L_0x006d:
        goto L_0x006f;
    L_0x006e:
        r3 = 0;
    L_0x006f:
        r14.m4189a(r3);
        r12 = com.facebook.accountkit.internal.AppEventsLogger.FlushResult.NO_CONNECTIVITY;
        if (r2 != r12) goto L_0x007b;
    L_0x0076:
        r12 = r10.f3233g;
        com.facebook.accountkit.internal.AppEventsLogger.C1209b.m4182a(r12, r11, r14);
    L_0x007b:
        r11 = com.facebook.accountkit.internal.AppEventsLogger.FlushResult.SUCCESS;
        if (r2 == r11) goto L_0x0087;
    L_0x007f:
        r11 = r15.f3218b;
        r12 = com.facebook.accountkit.internal.AppEventsLogger.FlushResult.NO_CONNECTIVITY;
        if (r11 == r12) goto L_0x0087;
    L_0x0085:
        r15.f3218b = r2;
    L_0x0087:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.internal.AppEventsLogger.a(com.facebook.accountkit.internal.AppEventsLogger$SessionEventsStateKey, com.facebook.accountkit.internal.AccountKitGraphRequest, com.facebook.accountkit.internal.f, com.facebook.accountkit.internal.AppEventsLogger$c, com.facebook.accountkit.internal.AppEventsLogger$a):void");
    }
}
