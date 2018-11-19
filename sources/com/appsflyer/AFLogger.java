package com.appsflyer;

import android.support.annotation.NonNull;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AFLogger {
    /* renamed from: a */
    private static long f2394a = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private int level;

        private LogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* renamed from: a */
    public static void m3075a(String str, boolean z) {
        if (m3076a(LogLevel.INFO)) {
            Log.i("AppsFlyer_4.8.7", m3085f(str));
        }
        if (z) {
            aa.m3121a().m3138b("I", m3082d(str, true));
        }
    }

    /* renamed from: a */
    public static void m3071a() {
        f2394a = System.currentTimeMillis();
    }

    @NonNull
    /* renamed from: f */
    private static String m3085f(String str) {
        return m3082d(str, false);
    }

    @NonNull
    /* renamed from: d */
    private static String m3082d(String str, boolean z) {
        if (!z) {
            if (LogLevel.VERBOSE.getLevel() != AppsFlyerProperties.m3086a().m3095b()) {
                return str;
            }
        }
        z = new StringBuilder("(");
        z.append(m3070a(System.currentTimeMillis() - f2394a));
        z.append(") ");
        z.append(str);
        return z.toString();
    }

    /* renamed from: b */
    static void m3078b(String str, boolean z) {
        if (m3076a(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_4.8.7", m3085f(str));
        }
        if (z) {
            aa.m3121a().m3138b("D", m3082d(str, true));
        }
    }

    /* renamed from: a */
    static void m3074a(String str, Throwable th, boolean z, boolean z2) {
        if (m3076a(LogLevel.ERROR) && z2) {
            Log.e("AppsFlyer_4.8.7", m3085f(str), th);
        }
        if (z) {
            aa.m3121a().m3136a(th);
        }
    }

    /* renamed from: c */
    static void m3081c(String str, boolean z) {
        if (m3076a(LogLevel.WARNING)) {
            Log.w("AppsFlyer_4.8.7", m3085f(str));
        }
        if (z) {
            aa.m3121a().m3138b("W", m3082d(str, true));
        }
    }

    /* renamed from: a */
    public static void m3072a(String str) {
        if (m3076a(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_4.8.7", m3085f(str));
        }
        aa.m3121a().m3138b("V", m3082d(str, true));
    }

    /* renamed from: a */
    private static boolean m3076a(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.m3086a().m3095b() ? true : null;
    }

    /* renamed from: b */
    static void m3077b(String str) {
        if (!m3079b()) {
            Log.d("AppsFlyer_4.8.7", m3085f(str));
        }
        aa.m3121a().m3138b("F", str);
    }

    /* renamed from: b */
    private static boolean m3079b() {
        return AppsFlyerProperties.m3086a().m3102f();
    }

    /* renamed from: c */
    public static void m3080c(String str) {
        m3078b(str, true);
    }

    /* renamed from: d */
    public static void m3083d(String str) {
        m3075a(str, true);
    }

    /* renamed from: a */
    public static void m3073a(String str, Throwable th) {
        m3074a(str, th, true, false);
    }

    /* renamed from: e */
    public static void m3084e(String str) {
        m3081c(str, true);
    }

    /* renamed from: a */
    static String m3070a(long j) {
        long toMillis = j - TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(j));
        long toMillis2 = toMillis - TimeUnit.MINUTES.toMillis(TimeUnit.MILLISECONDS.toMinutes(toMillis));
        toMillis = TimeUnit.MILLISECONDS.toMillis(toMillis2 - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(toMillis2)));
        return String.format(Locale.getDefault(), "%02d:%02d:%02d:%03d", new Object[]{Long.valueOf(r0), Long.valueOf(j), Long.valueOf(r2), Long.valueOf(toMillis)});
    }
}
