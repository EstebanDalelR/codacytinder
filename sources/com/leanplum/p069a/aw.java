package com.leanplum.p069a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.leanplum.Leanplum;
import com.leanplum.utils.SharedPreferencesUtil;
import com.tinder.api.ManagerWebServices;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.aw */
public class aw {
    /* renamed from: B */
    private static ax f7952B = null;
    /* renamed from: C */
    private static List<Map<String, Object>> f7953C = new ArrayList();
    /* renamed from: a */
    static final int f7954a;
    /* renamed from: b */
    private static final long f7955b = 100;
    /* renamed from: c */
    private static final long f7956c = 5000;
    /* renamed from: d */
    private static final long f7957d = 60000;
    /* renamed from: e */
    private static String f7958e = "__leanplum__";
    /* renamed from: f */
    private static String f7959f = "uuid";
    /* renamed from: g */
    private static String f7960g = null;
    /* renamed from: h */
    private static String f7961h = null;
    /* renamed from: i */
    private static String f7962i = null;
    /* renamed from: j */
    private static String f7963j = null;
    /* renamed from: k */
    private static final ac f7964k = new ac();
    /* renamed from: l */
    private static final Map<String, Boolean> f7965l = new HashMap();
    /* renamed from: m */
    private static int f7966m = 0;
    /* renamed from: n */
    private static az f7967n = null;
    /* renamed from: o */
    private static String f7968o = null;
    /* renamed from: p */
    private static final Map<File, Long> f7969p = new HashMap();
    /* renamed from: q */
    private static final Map<File, Double> f7970q = new HashMap();
    /* renamed from: r */
    private static String f7971r = "";
    /* renamed from: s */
    private static long f7972s;
    /* renamed from: t */
    private static final Object f7973t = new Object();
    /* renamed from: A */
    private long f7974A;
    /* renamed from: u */
    private final String f7975u;
    /* renamed from: v */
    private final String f7976v;
    /* renamed from: w */
    private final Map<String, Object> f7977w;
    /* renamed from: x */
    private ba f7978x;
    /* renamed from: y */
    private ay f7979y;
    /* renamed from: z */
    private boolean f7980z;

    /* renamed from: com.leanplum.a.aw$1 */
    final class C25811 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ aw f7941a;

        C25811(aw awVar) {
            this.f7941a = awVar;
        }

        public final void run() {
            try {
                this.f7941a.m9581j();
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: com.leanplum.a.aw$2 */
    final class C25822 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ aw f7942a;

        C25822(aw awVar) {
            this.f7942a = awVar;
        }

        public final void run() {
            try {
                aw.m9534a(this.f7942a);
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: com.leanplum.a.aw$3 */
    final class C25833 extends AsyncTask<Void, Void, Void> {
        /* renamed from: a */
        private /* synthetic */ aw f7943a;

        C25833(aw awVar) {
            this.f7943a = awVar;
        }

        /* renamed from: a */
        private Void m9525a() {
            this.f7943a.m9570s();
            return null;
        }

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            this.f7943a.m9570s();
            return null;
        }
    }

    static {
        if (VERSION.SDK_INT <= 17) {
            f7954a = 5000;
        } else {
            f7954a = 10000;
        }
    }

    /* renamed from: a */
    public static void m9540a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            f7960g = str.trim();
        }
        if (TextUtils.isEmpty(str2) == null) {
            f7961h = str2.trim();
        }
    }

    /* renamed from: a */
    public static void m9539a(String str) {
        f7962i = str;
    }

    /* renamed from: b */
    public static void m9548b(String str) {
        f7963j = str;
    }

    /* renamed from: c */
    public static void m9554c(String str) {
        f7968o = str;
    }

    /* renamed from: a */
    public static String m9530a() {
        return f7968o;
    }

    /* renamed from: b */
    public final long m9577b() {
        return this.f7974A;
    }

    /* renamed from: a */
    public final void m9573a(long j) {
        this.f7974A = j;
    }

    /* renamed from: c */
    public static void m9553c() {
        String string = Leanplum.getContext().getSharedPreferences("__leanplum__", 0).getString("__leanplum_token", null);
        if (string != null) {
            f7968o = string;
        }
    }

    /* renamed from: d */
    public static void m9558d() {
        Editor edit = Leanplum.getContext().getSharedPreferences("__leanplum__", 0).edit();
        edit.putString("__leanplum_token", f7968o);
        SharedPreferencesUtil.commitChanges(edit);
    }

    /* renamed from: e */
    public static String m9560e() {
        return f7960g;
    }

    /* renamed from: f */
    public static String m9561f() {
        return f7962i;
    }

    /* renamed from: g */
    public static String m9562g() {
        return f7963j;
    }

    public aw(String str, String str2, Map<String, Object> map) {
        this.f7975u = str;
        this.f7976v = str2;
        if (map == null) {
            map = new HashMap();
        }
        this.f7977w = map;
        if (!("log".equals(str2) == null || ae.f7900a == null)) {
            f7953C.add(m9567p());
        }
        aq.m9522a();
        this.f7974A = -1;
    }

    /* renamed from: a */
    public static aw m9529a(String str, Map<String, Object> map) {
        map = "log".equals(str) != null ? ap.DEBUG : ap.VERBOSE;
        StringBuilder stringBuilder = new StringBuilder("Will call API method ");
        stringBuilder.append(str);
        stringBuilder.append(" with arguments ");
        stringBuilder.append(null);
        ao.m9514a(map, stringBuilder.toString());
        bb.m9588a();
        return bb.m9587a("GET", str, null);
    }

    /* renamed from: b */
    public static aw m9544b(String str, Map<String, Object> map) {
        ap apVar = "log".equals(str) ? ap.DEBUG : ap.VERBOSE;
        StringBuilder stringBuilder = new StringBuilder("Will call API method ");
        stringBuilder.append(str);
        stringBuilder.append(" with arguments ");
        stringBuilder.append(map);
        ao.m9514a(apVar, stringBuilder.toString());
        bb.m9588a();
        return bb.m9587a("POST", str, map);
    }

    /* renamed from: a */
    public final void m9575a(ba baVar) {
        this.f7978x = baVar;
    }

    /* renamed from: a */
    public final void m9574a(ay ayVar) {
        this.f7979y = ayVar;
    }

    /* renamed from: a */
    public static void m9536a(ax axVar) {
        f7952B = axVar;
    }

    /* renamed from: p */
    private Map<String, Object> m9567p() {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("deviceId", f7962i);
        hashMap.put(ManagerWebServices.PARAM_USER_ID, f7963j);
        hashMap.put("action", this.f7976v);
        hashMap.put("sdkVersion", C2590h.f8063h);
        hashMap.put("devMode", Boolean.toString(C2590h.f8067l));
        hashMap.put("time", Double.toString(((double) new Date().getTime()) / 1000.0d));
        if (f7968o != null) {
            hashMap.put(ManagerWebServices.PARAM_TOKEN, f7968o);
        }
        hashMap.putAll(this.f7977w);
        return hashMap;
    }

    /* renamed from: a */
    private void m9542a(Map<String, Object> map) {
        synchronized (aw.class) {
            SharedPreferences sharedPreferences = Leanplum.getContext().getSharedPreferences("__leanplum__", 0);
            Editor edit = sharedPreferences.edit();
            long a = ae.m9463a();
            Object string = sharedPreferences.getString("__leanplum_uuid", null);
            if (string == null || a % ((long) f7954a) == 0) {
                string = UUID.randomUUID().toString();
                edit.putString("__leanplum_uuid", string);
                SharedPreferencesUtil.commitChanges(edit);
            }
            map.put("uuid", string);
            ae.m9466a(ab.m9450a((Map) map));
            this.f7974A = a;
            if (this.f7978x != null || (this.f7979y != null && bo.m9632h() == null)) {
                f7964k.m9460a(this, this.f7978x, this.f7979y);
            }
        }
    }

    /* renamed from: h */
    public final void m9579h() {
        m9582k();
        if (C2590h.f8067l) {
            long j;
            long currentTimeMillis = System.currentTimeMillis();
            if (f7972s != 0) {
                if (currentTimeMillis - f7972s <= f7956c) {
                    j = (f7972s + f7956c) - currentTimeMillis;
                    aq.m9522a().m9524a(new C25811(this), j);
                }
            }
            j = f7955b;
            aq.m9522a().m9524a(new C25811(this), j);
        }
    }

    /* renamed from: i */
    public final void m9580i() {
        m9582k();
        aq.m9522a().m9524a(new C25822(this), 1000);
    }

    /* renamed from: q */
    private void m9568q() {
        if (C2590h.f8067l) {
            m9579h();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (f7972s == 0 || currentTimeMillis - f7972s > f7957d) {
            m9581j();
        }
    }

    /* renamed from: j */
    public final void m9581j() {
        if (bo.m9632h()) {
            if (!C2590h.f8069n) {
                if (f7960g == null) {
                    ao.m9516a("Cannot send request. appId is not set.");
                } else if (f7961h == null) {
                    ao.m9516a("Cannot send request. accessKey is not set.");
                } else {
                    m9582k();
                    bo.m9613a(true, new C25833(this), new Void[0]);
                }
            }
            return;
        }
        m9582k();
        ao.m9518c("Device is offline, will send later");
        Exception exception = new Exception("Not connected to the Internet");
        if (this.f7979y != null) {
            this.f7979y.mo2612a(exception);
        }
        if (f7952B != null) {
            List t = aw.m9571t();
            f7952B.mo2610a(aw.m9531a(t), null, t.size());
        }
    }

    /* renamed from: a */
    private void m9538a(Exception exception) {
        if (this.f7979y != null) {
            this.f7979y.mo2612a(exception);
        }
        if (f7952B != null) {
            List t = aw.m9571t();
            f7952B.mo2610a(aw.m9531a(t), null, t.size());
        }
    }

    /* renamed from: b */
    private static boolean m9549b(Map<String, Object> map) {
        if (f7960g != null) {
            if (f7961h != null) {
                map.put("appId", f7960g);
                map.put("clientKey", f7961h);
                map.put("client", C2590h.f8064i);
                return true;
            }
        }
        ao.m9516a("API keys are not set. Please use Leanplum.setAppIdForDevelopmentMode or Leanplum.setAppIdForProductionMode.");
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m9543a(org.json.JSONObject r8, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r9, java.lang.Exception r10, int r11) {
        /*
        r7 = this;
        r0 = com.leanplum.p069a.aw.class;
        monitor-enter(r0);
        if (r8 != 0) goto L_0x0011;
    L_0x0005:
        if (r10 == 0) goto L_0x0011;
    L_0x0007:
        r8 = f7964k;	 Catch:{ all -> 0x000e }
        r8.m9461a(r10, r11);	 Catch:{ all -> 0x000e }
        monitor-exit(r0);	 Catch:{ all -> 0x000e }
        return;
    L_0x000e:
        r8 = move-exception;
        goto L_0x0099;
    L_0x0011:
        if (r8 != 0) goto L_0x0015;
    L_0x0013:
        monitor-exit(r0);	 Catch:{ all -> 0x000e }
        return;
    L_0x0015:
        r1 = f7952B;	 Catch:{ all -> 0x000e }
        if (r1 == 0) goto L_0x001e;
    L_0x0019:
        r1 = f7952B;	 Catch:{ all -> 0x000e }
        r1.mo2610a(r9, r8, r11);	 Catch:{ all -> 0x000e }
    L_0x001e:
        r9 = com.leanplum.p069a.aw.m9528a(r8);	 Catch:{ all -> 0x000e }
        r1 = 0;
        r2 = r10;
        r10 = 0;
    L_0x0025:
        if (r10 >= r9) goto L_0x008a;
    L_0x0027:
        r3 = com.leanplum.p069a.aw.m9532a(r8, r10);	 Catch:{ all -> 0x000e }
        r4 = com.leanplum.p069a.aw.m9550b(r3);	 Catch:{ all -> 0x000e }
        if (r4 != 0) goto L_0x0087;
    L_0x0031:
        r3 = com.leanplum.p069a.aw.m9552c(r3);	 Catch:{ all -> 0x000e }
        r4 = 1;
        if (r3 == 0) goto L_0x0075;
    L_0x0038:
        r5 = r3.length();	 Catch:{ all -> 0x000e }
        if (r5 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0075;
    L_0x003f:
        r5 = "App not found";
        r5 = r3.startsWith(r5);	 Catch:{ all -> 0x000e }
        if (r5 == 0) goto L_0x004c;
    L_0x0047:
        r3 = "No app matching the provided app ID was found.";
        com.leanplum.p069a.C2590h.f8073r = r4;	 Catch:{ all -> 0x000e }
        goto L_0x0077;
    L_0x004c:
        r5 = "Invalid access key";
        r5 = r3.startsWith(r5);	 Catch:{ all -> 0x000e }
        if (r5 == 0) goto L_0x0059;
    L_0x0054:
        r3 = "The access key you provided is not valid for this app.";
        com.leanplum.p069a.C2590h.f8073r = r4;	 Catch:{ all -> 0x000e }
        goto L_0x0077;
    L_0x0059:
        r5 = "Development mode requested but not permitted";
        r5 = r3.startsWith(r5);	 Catch:{ all -> 0x000e }
        if (r5 == 0) goto L_0x0066;
    L_0x0061:
        r3 = "A call to Leanplum.setAppIdForDevelopmentMode with your production key was made, which is not permitted.";
        com.leanplum.p069a.C2590h.f8073r = r4;	 Catch:{ all -> 0x000e }
        goto L_0x0077;
    L_0x0066:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x000e }
        r6 = "API error: ";
        r5.<init>(r6);	 Catch:{ all -> 0x000e }
        r5.append(r3);	 Catch:{ all -> 0x000e }
        r3 = r5.toString();	 Catch:{ all -> 0x000e }
        goto L_0x0077;
    L_0x0075:
        r3 = "API error";
    L_0x0077:
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x000e }
        r4[r1] = r3;	 Catch:{ all -> 0x000e }
        com.leanplum.p069a.ao.m9516a(r4);	 Catch:{ all -> 0x000e }
        r4 = r9 + -1;
        if (r10 != r4) goto L_0x0087;
    L_0x0082:
        r2 = new java.lang.Exception;	 Catch:{ all -> 0x000e }
        r2.<init>(r3);	 Catch:{ all -> 0x000e }
    L_0x0087:
        r10 = r10 + 1;
        goto L_0x0025;
    L_0x008a:
        if (r2 == 0) goto L_0x0092;
    L_0x008c:
        r8 = f7964k;	 Catch:{ all -> 0x000e }
        r8.m9461a(r2, r11);	 Catch:{ all -> 0x000e }
        goto L_0x0097;
    L_0x0092:
        r9 = f7964k;	 Catch:{ all -> 0x000e }
        r9.m9462a(r8, r11);	 Catch:{ all -> 0x000e }
    L_0x0097:
        monitor-exit(r0);	 Catch:{ all -> 0x000e }
        return;
    L_0x0099:
        monitor-exit(r0);	 Catch:{ all -> 0x000e }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.aw.a(org.json.JSONObject, java.util.List, java.lang.Exception, int):void");
    }

    @NonNull
    /* renamed from: d */
    private static String m9556d(String str) {
        if (str != null) {
            if (str.length() != 0) {
                if (str.startsWith("App not found")) {
                    str = "No app matching the provided app ID was found.";
                    C2590h.f8073r = true;
                    return str;
                } else if (str.startsWith("Invalid access key")) {
                    str = "The access key you provided is not valid for this app.";
                    C2590h.f8073r = true;
                    return str;
                } else if (str.startsWith("Development mode requested but not permitted")) {
                    str = "A call to Leanplum.setAppIdForDevelopmentMode with your production key was made, which is not permitted.";
                    C2590h.f8073r = true;
                    return str;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("API error: ");
                    stringBuilder.append(str);
                    return stringBuilder.toString();
                }
            }
        }
        return "API error";
    }

    /* renamed from: r */
    private void m9569r() {
        if (!C2590h.f8069n) {
            if (f7960g == null) {
                ao.m9516a("Cannot send request. appId is not set.");
            } else if (f7961h == null) {
                ao.m9516a("Cannot send request. accessKey is not set.");
            } else {
                m9582k();
                bo.m9613a(true, new C25833(this), new Void[0]);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: s */
    private void m9570s() {
        /*
        r12 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = f7953C;
        r1 = r1.size();
        if (r1 == 0) goto L_0x0032;
    L_0x000d:
        r1 = java.util.UUID.randomUUID();
        r1 = r1.toString();
        r2 = f7953C;
        r2 = r2.iterator();
    L_0x001b:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0030;
    L_0x0021:
        r3 = r2.next();
        r3 = (java.util.Map) r3;
        r4 = "uuid";
        r3.put(r4, r1);
        r0.add(r3);
        goto L_0x001b;
    L_0x0030:
        r1 = r0;
        goto L_0x003d;
    L_0x0032:
        r0 = com.leanplum.p069a.aw.m9571t();
        r1 = com.leanplum.p069a.aw.m9531a(r0);
        r11 = r1;
        r1 = r0;
        r0 = r11;
    L_0x003d:
        r2 = r0.isEmpty();
        if (r2 == 0) goto L_0x0044;
    L_0x0043:
        return;
    L_0x0044:
        r5 = new java.util.HashMap;
        r5.<init>();
        r2 = com.leanplum.p069a.aw.m9549b(r5);
        if (r2 != 0) goto L_0x0050;
    L_0x004f:
        return;
    L_0x0050:
        r2 = "data";
        r3 = new java.util.HashMap;
        r3.<init>();
        r4 = "data";
        r3.put(r4, r0);
        r3 = com.leanplum.p069a.ab.m9450a(r3);
        r5.put(r2, r3);
        r2 = "sdkVersion";
        r3 = com.leanplum.p069a.C2590h.f8063h;
        r5.put(r2, r3);
        r2 = "action";
        r3 = "multi";
        r5.put(r2, r3);
        r2 = "time";
        r3 = new java.util.Date;
        r3.<init>();
        r3 = r3.getTime();
        r3 = (double) r3;
        r6 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r3 = r3 / r6;
        r3 = java.lang.Double.toString(r3);
        r5.put(r2, r3);
        r2 = 0;
        r9 = 1;
        r10 = 0;
        r3 = com.leanplum.p069a.C2590h.f8056a;	 Catch:{ JSONException -> 0x0160, Exception -> 0x0134 }
        r4 = com.leanplum.p069a.C2590h.f8057b;	 Catch:{ JSONException -> 0x0160, Exception -> 0x0134 }
        r6 = r12.f7975u;	 Catch:{ JSONException -> 0x0160, Exception -> 0x0134 }
        r7 = com.leanplum.p069a.C2590h.f8058c;	 Catch:{ JSONException -> 0x0160, Exception -> 0x0134 }
        r8 = com.leanplum.p069a.C2590h.f8061f;	 Catch:{ JSONException -> 0x0160, Exception -> 0x0134 }
        r3 = com.leanplum.p069a.bo.m9603a(r3, r4, r5, r6, r7, r8);	 Catch:{ JSONException -> 0x0160, Exception -> 0x0134 }
        r4 = com.leanplum.p069a.bo.m9607a(r3);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r5 = r3.getResponseCode();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r5 < r6) goto L_0x00f5;
    L_0x00a7:
        r6 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        if (r5 > r6) goto L_0x00f5;
    L_0x00ab:
        r5 = com.leanplum.p069a.aw.m9528a(r4);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r6 = r0.size();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        if (r5 == r6) goto L_0x00d6;
    L_0x00b5:
        r6 = new java.lang.Object[r9];	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r7 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r8 = "Sent ";
        r7.<init>(r8);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r8 = r0.size();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r7.append(r8);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r8 = " requests but only received ";
        r7.append(r8);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r7.append(r5);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r5 = r7.toString();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r6[r2] = r5;	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        com.leanplum.p069a.ao.m9517b(r6);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
    L_0x00d6:
        r5 = r1.size();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r12.m9543a(r4, r0, r10, r5);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r4 = f7953C;	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r4.clear();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r4 = r1.size();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        com.leanplum.p069a.aw.m9533a(r4);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r4 = r1.size();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r5 = f7954a;	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        if (r4 != r5) goto L_0x0125;
    L_0x00f1:
        r12.m9570s();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        goto L_0x0125;
    L_0x00f5:
        r6 = new java.lang.Exception;	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r7 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r8 = "HTTP error ";
        r7.<init>(r8);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r7.append(r5);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r7 = r7.toString();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r6.<init>(r7);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r7 = -1;
        if (r5 == r7) goto L_0x0125;
    L_0x010b:
        r7 = 408; // 0x198 float:5.72E-43 double:2.016E-321;
        if (r5 == r7) goto L_0x0125;
    L_0x010f:
        r7 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r5 < r7) goto L_0x0117;
    L_0x0113:
        r7 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        if (r5 <= r7) goto L_0x0125;
    L_0x0117:
        r5 = r1.size();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        com.leanplum.p069a.aw.m9533a(r5);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r5 = r1.size();	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
        r12.m9543a(r4, r0, r6, r5);	 Catch:{ JSONException -> 0x012f, Exception -> 0x012c }
    L_0x0125:
        if (r3 == 0) goto L_0x0198;
    L_0x0127:
        r3.disconnect();	 Catch:{ Throwable -> 0x01a0 }
        goto L_0x01a6;
    L_0x012c:
        r0 = move-exception;
        r10 = r3;
        goto L_0x0135;
    L_0x012f:
        r4 = move-exception;
        goto L_0x0162;
    L_0x0131:
        r0 = move-exception;
        r3 = r10;
        goto L_0x019a;
    L_0x0134:
        r0 = move-exception;
    L_0x0135:
        r1 = new java.lang.Object[r9];	 Catch:{ all -> 0x0131 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0131 }
        r4 = "Unable to send request: ";
        r3.<init>(r4);	 Catch:{ all -> 0x0131 }
        r4 = r0.toString();	 Catch:{ all -> 0x0131 }
        r3.append(r4);	 Catch:{ all -> 0x0131 }
        r4 = "\n";
        r3.append(r4);	 Catch:{ all -> 0x0131 }
        r0 = com.leanplum.p069a.ao.m9513a(r0);	 Catch:{ all -> 0x0131 }
        r3.append(r0);	 Catch:{ all -> 0x0131 }
        r0 = r3.toString();	 Catch:{ all -> 0x0131 }
        r1[r2] = r0;	 Catch:{ all -> 0x0131 }
        com.leanplum.p069a.ao.m9516a(r1);	 Catch:{ all -> 0x0131 }
        if (r10 == 0) goto L_0x0198;
    L_0x015c:
        r10.disconnect();	 Catch:{ Throwable -> 0x01a0 }
        goto L_0x01a6;
    L_0x0160:
        r4 = move-exception;
        r3 = r10;
    L_0x0162:
        r5 = new java.lang.Object[r9];	 Catch:{ all -> 0x0199 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0199 }
        r7 = "Error parsing JSON response: ";
        r6.<init>(r7);	 Catch:{ all -> 0x0199 }
        r7 = r4.toString();	 Catch:{ all -> 0x0199 }
        r6.append(r7);	 Catch:{ all -> 0x0199 }
        r7 = "\n";
        r6.append(r7);	 Catch:{ all -> 0x0199 }
        r7 = com.leanplum.p069a.ao.m9513a(r4);	 Catch:{ all -> 0x0199 }
        r6.append(r7);	 Catch:{ all -> 0x0199 }
        r6 = r6.toString();	 Catch:{ all -> 0x0199 }
        r5[r2] = r6;	 Catch:{ all -> 0x0199 }
        com.leanplum.p069a.ao.m9516a(r5);	 Catch:{ all -> 0x0199 }
        r2 = r1.size();	 Catch:{ all -> 0x0199 }
        com.leanplum.p069a.aw.m9533a(r2);	 Catch:{ all -> 0x0199 }
        r1 = r1.size();	 Catch:{ all -> 0x0199 }
        r12.m9543a(r10, r0, r4, r1);	 Catch:{ all -> 0x0199 }
        if (r3 == 0) goto L_0x0198;
    L_0x0197:
        goto L_0x0127;
    L_0x0198:
        return;
    L_0x0199:
        r0 = move-exception;
    L_0x019a:
        if (r3 == 0) goto L_0x01a2;
    L_0x019c:
        r3.disconnect();	 Catch:{ Throwable -> 0x01a0 }
        goto L_0x01a2;
    L_0x01a0:
        r0 = move-exception;
        goto L_0x01a3;
    L_0x01a2:
        throw r0;	 Catch:{ Throwable -> 0x01a0 }
    L_0x01a3:
        com.leanplum.p069a.bo.m9608a(r0);
    L_0x01a6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.aw.s():void");
    }

    /* renamed from: k */
    public final void m9582k() {
        if (!C2590h.f8069n && !ae.f7900a && !this.f7980z) {
            this.f7980z = true;
            Map p = m9567p();
            synchronized (aw.class) {
                SharedPreferences sharedPreferences = Leanplum.getContext().getSharedPreferences("__leanplum__", 0);
                Editor edit = sharedPreferences.edit();
                long a = ae.m9463a();
                Object string = sharedPreferences.getString("__leanplum_uuid", null);
                if (string == null || a % ((long) f7954a) == 0) {
                    string = UUID.randomUUID().toString();
                    edit.putString("__leanplum_uuid", string);
                    SharedPreferencesUtil.commitChanges(edit);
                }
                p.put("uuid", string);
                ae.m9466a(ab.m9450a(p));
                this.f7974A = a;
                if (!(this.f7978x == null && (this.f7979y == null || bo.m9632h()))) {
                    f7964k.m9460a(this, this.f7978x, this.f7979y);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m9533a(int i) {
        if (i != 0) {
            synchronized (aw.class) {
                ae.m9469b(i);
            }
        }
    }

    /* renamed from: t */
    private static List<Map<String, Object>> m9571t() {
        List<Map<String, Object>> a;
        synchronized (aw.class) {
            f7972s = System.currentTimeMillis();
            Editor edit = Leanplum.getContext().getSharedPreferences("__leanplum__", 0).edit();
            a = ae.m9464a(f7954a);
            edit.remove("__leanplum_uuid");
            SharedPreferencesUtil.commitChanges(edit);
        }
        return a;
    }

    /* renamed from: a */
    private static List<Map<String, Object>> m9531a(List<Map<String, Object>> list) {
        List<Map<String, Object>> arrayList = new ArrayList();
        int size = list.size();
        if (size > 0) {
            int i = 0;
            while (i < size) {
                Map map = (Map) list.get(i);
                if (i >= size - 1 || !"start".equals(((Map) list.get(i + 1)).get("action")) || !"start".equals(map.get("action")) || !Boolean.TRUE.toString().equals(map.get("background"))) {
                    arrayList.add(map);
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static String m9546b(List<Map<String, Object>> list) {
        Map hashMap = new HashMap();
        hashMap.put(ManagerWebServices.FB_DATA, list);
        return ab.m9450a(hashMap);
    }

    /* renamed from: b */
    private static String m9545b(int i) {
        StringBuilder stringBuilder;
        if (i < 1024) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(i);
            stringBuilder.append(" B");
            return stringBuilder.toString();
        } else if (i < 1048576) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(i >> 10);
            stringBuilder.append(" KB");
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(i >> 20);
            stringBuilder.append(" MB");
            return stringBuilder.toString();
        }
    }

    /* renamed from: u */
    private static void m9572u() {
        int size = f7969p.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Entry entry : f7969p.entrySet()) {
            File file = (File) entry.getKey();
            long longValue = ((Long) entry.getValue()).longValue();
            double doubleValue = ((Double) f7970q.get(file)).doubleValue();
            if (doubleValue == 1.0d) {
                i++;
            }
            i2 += (int) (((double) longValue) * doubleValue);
            i3 = (int) (((long) i3) + longValue);
        }
        StringBuilder stringBuilder = new StringBuilder("Uploading resources. ");
        stringBuilder.append(i);
        stringBuilder.append('/');
        stringBuilder.append(size);
        stringBuilder.append(" files completed; ");
        stringBuilder.append(aw.m9545b(i2));
        stringBuilder.append('/');
        stringBuilder.append(aw.m9545b(i3));
        stringBuilder.append(" transferred.");
        String stringBuilder2 = stringBuilder.toString();
        if (!f7971r.equals(stringBuilder2)) {
            f7971r = stringBuilder2;
            ao.m9518c(stringBuilder2);
        }
    }

    /* renamed from: a */
    public final void m9576a(java.util.List<java.lang.String> r11, final java.util.List<java.io.InputStream> r12) {
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
        r10 = this;
        r0 = com.leanplum.p069a.C2590h.f8069n;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r10.m9567p();
        r1 = com.leanplum.p069a.aw.m9549b(r0);
        if (r1 != 0) goto L_0x0010;
    L_0x000f:
        return;
    L_0x0010:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = 0;
        r3 = 0;
    L_0x0017:
        r4 = r11.size();
        if (r3 >= r4) goto L_0x0082;
    L_0x001d:
        r4 = r11.get(r3);
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x007f;
    L_0x0025:
        r5 = java.lang.Boolean.TRUE;
        r6 = f7965l;
        r6 = r6.get(r4);
        r5 = r5.equals(r6);
        if (r5 != 0) goto L_0x007f;
    L_0x0033:
        r5 = new java.io.File;
        r5.<init>(r4);
        r6 = 1;
        r7 = r12.get(r3);	 Catch:{ IOException -> 0x005b, NullPointerException -> 0x0045 }
        r7 = (java.io.InputStream) r7;	 Catch:{ IOException -> 0x005b, NullPointerException -> 0x0045 }
        r7 = r7.available();	 Catch:{ IOException -> 0x005b, NullPointerException -> 0x0045 }
        r7 = (long) r7;
        goto L_0x005f;
    L_0x0045:
        r5 = new java.lang.Object[r6];
        r6 = new java.lang.StringBuilder;
        r7 = "Unable to read file ";
        r6.<init>(r7);
        r6.append(r4);
        r4 = r6.toString();
        r5[r2] = r4;
        com.leanplum.p069a.ao.m9516a(r5);
        goto L_0x007f;
    L_0x005b:
        r7 = r5.length();
    L_0x005f:
        r9 = f7965l;
        r6 = java.lang.Boolean.valueOf(r6);
        r9.put(r4, r6);
        r1.add(r5);
        r4 = f7969p;
        r6 = java.lang.Long.valueOf(r7);
        r4.put(r5, r6);
        r4 = f7970q;
        r6 = 0;
        r6 = java.lang.Double.valueOf(r6);
        r4.put(r5, r6);
    L_0x007f:
        r3 = r3 + 1;
        goto L_0x0017;
    L_0x0082:
        r11 = r1.size();
        if (r11 != 0) goto L_0x0089;
    L_0x0088:
        return;
    L_0x0089:
        com.leanplum.p069a.aw.m9572u();
        r11 = new com.leanplum.a.aw$4;
        r11.<init>(r10, r1, r12, r0);
        r12 = new java.lang.Void[r2];
        com.leanplum.p069a.bo.m9613a(r2, r11, r12);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.aw.a(java.util.List, java.util.List):void");
    }

    /* renamed from: b */
    final void m9578b(final String str, final String str2) {
        if (!C2590h.f8069n && !Boolean.TRUE.equals(f7965l.get(str))) {
            f7966m++;
            Object[] objArr = new Object[1];
            StringBuilder stringBuilder = new StringBuilder("Downloading resource ");
            stringBuilder.append(str);
            objArr[0] = stringBuilder.toString();
            ao.m9518c(objArr);
            f7965l.put(str, Boolean.valueOf(true));
            final Map p = m9567p();
            p.put("filename", str);
            if (aw.m9549b(p)) {
                bo.m9613a(false, new AsyncTask<Void, Void, Void>(this) {
                    /* renamed from: d */
                    private /* synthetic */ aw f7951d;

                    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
                        return m9527a();
                    }

                    /* renamed from: a */
                    private Void m9527a() {
                        try {
                            this.f7951d.m9541a(C2590h.f8056a, C2590h.f8057b, str, str2, p);
                        } catch (Throwable th) {
                            bo.m9608a(th);
                        }
                        return null;
                    }
                }, new Void[0]);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m9541a(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
        r10 = this;
        r0 = 0;
        r1 = 2;
        r2 = 0;
        r3 = 1;
        if (r14 != 0) goto L_0x001c;
    L_0x0006:
        r7 = r10.f7975u;	 Catch:{ Exception -> 0x0018 }
        r8 = com.leanplum.p069a.C2590h.f8058c;	 Catch:{ Exception -> 0x0018 }
        r9 = com.leanplum.p069a.C2590h.f8062g;	 Catch:{ Exception -> 0x0018 }
        r4 = r11;
        r5 = r12;
        r6 = r15;
        r12 = com.leanplum.p069a.bo.m9603a(r4, r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x0018 }
        goto L_0x002a;
    L_0x0014:
        r11 = move-exception;
        r12 = r2;
        goto L_0x012d;
    L_0x0018:
        r11 = move-exception;
        r15 = r2;
        goto L_0x00ca;
    L_0x001c:
        r12 = r10.f7975u;	 Catch:{ Exception -> 0x0018 }
        r15 = "https://";
        r15 = r14.startsWith(r15);	 Catch:{ Exception -> 0x0018 }
        r4 = com.leanplum.p069a.C2590h.f8062g;	 Catch:{ Exception -> 0x0018 }
        r12 = com.leanplum.p069a.bo.m9604a(r14, r12, r15, r4);	 Catch:{ Exception -> 0x0018 }
    L_0x002a:
        r15 = r12.getURL();	 Catch:{ Exception -> 0x00c7, all -> 0x00c5 }
        r12.connect();	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r4 = r12.getResponseCode();	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 == r5) goto L_0x0055;
    L_0x0039:
        r2 = new java.lang.Exception;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r6 = "Leanplum: Error sending request to: ";
        r5.<init>(r6);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r5.append(r11);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r11 = ", HTTP status code: ";
        r5.append(r11);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r5.append(r4);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r11 = r5.toString();	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r2.<init>(r11);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        throw r2;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
    L_0x0055:
        r11 = new java.util.Stack;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r11.<init>();	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r4 = r13;
    L_0x005b:
        r5 = new java.io.File;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r5.<init>(r4);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r4 = r5.getParent();	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        if (r4 == 0) goto L_0x006a;
    L_0x0066:
        r11.push(r4);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        goto L_0x005b;
    L_0x006a:
        r4 = r11.isEmpty();	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        if (r4 != 0) goto L_0x0091;
    L_0x0070:
        r4 = r11.pop();	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r4 = com.leanplum.p069a.C2594s.m9734d(r4);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r5 = new java.io.File;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r5.<init>(r4);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r5 = r5.mkdir();	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        if (r5 != 0) goto L_0x006a;
    L_0x0085:
        r5 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r6 = "Failed to create directory: ";
        r5[r0] = r6;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r5[r3] = r4;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        com.leanplum.p069a.ao.m9517b(r5);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        goto L_0x006a;
    L_0x0091:
        r11 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r4 = new java.io.File;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r5 = com.leanplum.p069a.C2594s.m9734d(r13);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r11.<init>(r4);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        com.leanplum.p069a.bo.m9609a(r12, r11);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r11 = f7966m;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r11 = r11 - r3;
        f7966m = r11;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r11 = r10.f7978x;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        if (r11 == 0) goto L_0x00b0;
    L_0x00ab:
        r11 = r10.f7978x;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r11.mo2627a(r2);	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
    L_0x00b0:
        r11 = f7966m;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        if (r11 != 0) goto L_0x00bd;
    L_0x00b4:
        r11 = f7967n;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        if (r11 == 0) goto L_0x00bd;
    L_0x00b8:
        r11 = f7967n;	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
        r11.mo2609a();	 Catch:{ Exception -> 0x00c3, all -> 0x00c5 }
    L_0x00bd:
        if (r12 == 0) goto L_0x012c;
    L_0x00bf:
        r12.disconnect();
        return;
    L_0x00c3:
        r11 = move-exception;
        goto L_0x00c9;
    L_0x00c5:
        r11 = move-exception;
        goto L_0x012d;
    L_0x00c7:
        r11 = move-exception;
        r15 = r2;
    L_0x00c9:
        r2 = r12;
    L_0x00ca:
        r12 = r11 instanceof java.io.EOFException;	 Catch:{ all -> 0x0014 }
        if (r12 == 0) goto L_0x00f4;
    L_0x00ce:
        if (r2 == 0) goto L_0x00f4;
    L_0x00d0:
        r12 = r2.getURL();	 Catch:{ all -> 0x0014 }
        r12 = r12.equals(r15);	 Catch:{ all -> 0x0014 }
        if (r12 != 0) goto L_0x00f4;
    L_0x00da:
        r5 = 0;
        r11 = r2.getURL();	 Catch:{ all -> 0x0014 }
        r6 = r11.toString();	 Catch:{ all -> 0x0014 }
        r9 = new java.util.HashMap;	 Catch:{ all -> 0x0014 }
        r9.<init>();	 Catch:{ all -> 0x0014 }
        r4 = r10;
        r7 = r13;
        r8 = r14;
        r4.m9541a(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0014 }
        if (r2 == 0) goto L_0x00f3;
    L_0x00f0:
        r2.disconnect();
    L_0x00f3:
        return;
    L_0x00f4:
        r12 = new java.lang.Object[r1];	 Catch:{ all -> 0x0014 }
        r14 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0014 }
        r15 = "Error downloading resource:";
        r14.<init>(r15);	 Catch:{ all -> 0x0014 }
        r14.append(r13);	 Catch:{ all -> 0x0014 }
        r13 = r14.toString();	 Catch:{ all -> 0x0014 }
        r12[r0] = r13;	 Catch:{ all -> 0x0014 }
        r12[r3] = r11;	 Catch:{ all -> 0x0014 }
        com.leanplum.p069a.ao.m9516a(r12);	 Catch:{ all -> 0x0014 }
        r12 = f7966m;	 Catch:{ all -> 0x0014 }
        r12 = r12 - r3;
        f7966m = r12;	 Catch:{ all -> 0x0014 }
        r12 = r10.f7979y;	 Catch:{ all -> 0x0014 }
        if (r12 == 0) goto L_0x0119;
    L_0x0114:
        r12 = r10.f7979y;	 Catch:{ all -> 0x0014 }
        r12.mo2612a(r11);	 Catch:{ all -> 0x0014 }
    L_0x0119:
        r11 = f7966m;	 Catch:{ all -> 0x0014 }
        if (r11 != 0) goto L_0x0126;
    L_0x011d:
        r11 = f7967n;	 Catch:{ all -> 0x0014 }
        if (r11 == 0) goto L_0x0126;
    L_0x0121:
        r11 = f7967n;	 Catch:{ all -> 0x0014 }
        r11.mo2609a();	 Catch:{ all -> 0x0014 }
    L_0x0126:
        if (r2 == 0) goto L_0x012c;
    L_0x0128:
        r2.disconnect();
        return;
    L_0x012c:
        return;
    L_0x012d:
        if (r12 == 0) goto L_0x0132;
    L_0x012f:
        r12.disconnect();
    L_0x0132:
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.aw.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    /* renamed from: l */
    public static int m9563l() {
        return f7966m;
    }

    /* renamed from: a */
    public static void m9537a(az azVar) {
        f7967n = azVar;
    }

    /* renamed from: a */
    public static int m9528a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        try {
            return jSONObject.getJSONArray("response").length();
        } catch (JSONObject jSONObject2) {
            ao.m9516a("Could not parse JSON response.", jSONObject2);
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONObject m9532a(JSONObject jSONObject, int i) {
        try {
            return jSONObject.getJSONArray("response").getJSONObject(i);
        } catch (JSONObject jSONObject2) {
            ao.m9516a("Could not parse JSON response.", jSONObject2);
            return null;
        }
    }

    /* renamed from: d */
    private static JSONObject m9557d(JSONObject jSONObject) {
        int a = aw.m9528a(jSONObject);
        return a > 0 ? aw.m9532a(jSONObject, a - 1) : null;
    }

    /* renamed from: b */
    public static boolean m9550b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.getBoolean("success");
        } catch (JSONObject jSONObject2) {
            ao.m9516a("Could not parse JSON response.", jSONObject2);
            return false;
        }
    }

    /* renamed from: c */
    public static String m9552c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject = jSONObject.optJSONObject("error");
            if (jSONObject == null) {
                return null;
            }
            return jSONObject.getString("message");
        } catch (JSONObject jSONObject2) {
            ao.m9516a("Could not parse JSON response.", jSONObject2);
            return null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m9534a(aw awVar) {
        if (C2590h.f8067l) {
            awVar.m9579h();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (f7972s == 0 || currentTimeMillis - f7972s > f7957d) {
            awVar.m9581j();
        }
    }
}
