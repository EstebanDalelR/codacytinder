package com.facebook.internal;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.facebook.internal.r */
public class C1738r {
    /* renamed from: a */
    private static final HashMap<String, String> f4799a = new HashMap();
    /* renamed from: b */
    private final LoggingBehavior f4800b;
    /* renamed from: c */
    private final String f4801c;
    /* renamed from: d */
    private StringBuilder f4802d;
    /* renamed from: e */
    private int f4803e = 3;

    /* renamed from: a */
    public static synchronized void m5981a(String str, String str2) {
        synchronized (C1738r.class) {
            f4799a.put(str, str2);
        }
    }

    /* renamed from: a */
    public static synchronized void m5980a(String str) {
        synchronized (C1738r.class) {
            if (!FacebookSdk.m3986a(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                C1738r.m5981a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    /* renamed from: a */
    public static void m5978a(LoggingBehavior loggingBehavior, String str, String str2) {
        C1738r.m5976a(loggingBehavior, 3, str, str2);
    }

    /* renamed from: a */
    public static void m5979a(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        if (FacebookSdk.m3986a(loggingBehavior)) {
            C1738r.m5976a(loggingBehavior, (int) 3, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m5977a(LoggingBehavior loggingBehavior, int i, String str, String str2, Object... objArr) {
        if (FacebookSdk.m3986a(loggingBehavior)) {
            C1738r.m5976a(loggingBehavior, i, str, String.format(str2, objArr));
        }
    }

    /* renamed from: a */
    public static void m5976a(LoggingBehavior loggingBehavior, int i, String str, String str2) {
        if (FacebookSdk.m3986a(loggingBehavior)) {
            str2 = C1738r.m5983d(str2);
            if (!str.startsWith("FacebookSDK.")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("FacebookSDK.");
                stringBuilder.append(str);
                str = stringBuilder.toString();
            }
            Log.println(i, str, str2);
            if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private static synchronized String m5983d(String str) {
        synchronized (C1738r.class) {
            for (Entry entry : f4799a.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    public C1738r(LoggingBehavior loggingBehavior, String str) {
        C1749x.m6065a(str, "tag");
        this.f4800b = loggingBehavior;
        loggingBehavior = new StringBuilder();
        loggingBehavior.append("FacebookSDK.");
        loggingBehavior.append(str);
        this.f4801c = loggingBehavior.toString();
        this.f4802d = new StringBuilder();
    }

    /* renamed from: a */
    public void m5984a() {
        m5987b(this.f4802d.toString());
        this.f4802d = new StringBuilder();
    }

    /* renamed from: b */
    public void m5987b(String str) {
        C1738r.m5976a(this.f4800b, this.f4803e, this.f4801c, str);
    }

    /* renamed from: c */
    public void m5988c(String str) {
        if (m5982b()) {
            this.f4802d.append(str);
        }
    }

    /* renamed from: a */
    public void m5986a(String str, Object... objArr) {
        if (m5982b()) {
            this.f4802d.append(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public void m5985a(String str, Object obj) {
        m5986a("  %s:\t%s\n", str, obj);
    }

    /* renamed from: b */
    private boolean m5982b() {
        return FacebookSdk.m3986a(this.f4800b);
    }
}
