package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.android.volley.f */
public class C0911f {
    /* renamed from: a */
    public static String f2386a = "Volley";
    /* renamed from: b */
    public static boolean f2387b = Log.isLoggable(f2386a, 2);

    /* renamed from: com.android.volley.f$a */
    static class C0910a {
        /* renamed from: a */
        public static final boolean f2383a = C0911f.f2387b;
        /* renamed from: b */
        private final List<C0909a> f2384b = new ArrayList();
        /* renamed from: c */
        private boolean f2385c = false;

        /* renamed from: com.android.volley.f$a$a */
        private static class C0909a {
            /* renamed from: a */
            public final String f2380a;
            /* renamed from: b */
            public final long f2381b;
            /* renamed from: c */
            public final long f2382c;

            public C0909a(String str, long j, long j2) {
                this.f2380a = str;
                this.f2381b = j;
                this.f2382c = j2;
            }
        }

        C0910a() {
        }

        /* renamed from: a */
        public synchronized void m3054a(String str, long j) {
            if (this.f2385c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f2384b.add(new C0909a(str, j, SystemClock.elapsedRealtime()));
        }

        /* renamed from: a */
        public synchronized void m3053a(String str) {
            this.f2385c = true;
            if (m3052a() > 0) {
                long j = ((C0909a) this.f2384b.get(0)).f2382c;
                C0911f.m3057b("(%-4d ms) %s", Long.valueOf(r1), str);
                for (C0909a c0909a : this.f2384b) {
                    C0911f.m3057b("(+%-4d) [%2d] %s", Long.valueOf(c0909a.f2382c - j), Long.valueOf(c0909a.f2381b), c0909a.f2380a);
                    j = c0909a.f2382c;
                }
            }
        }

        protected void finalize() throws Throwable {
            if (!this.f2385c) {
                m3053a("Request on the loose");
                C0911f.m3058c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        /* renamed from: a */
        private long m3052a() {
            if (this.f2384b.size() == 0) {
                return 0;
            }
            return ((C0909a) this.f2384b.get(this.f2384b.size() - 1)).f2382c - ((C0909a) this.f2384b.get(0)).f2382c;
        }
    }

    /* renamed from: a */
    public static void m3055a(String str, Object... objArr) {
        if (f2387b) {
            Log.v(f2386a, C0911f.m3060e(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m3057b(String str, Object... objArr) {
        Log.d(f2386a, C0911f.m3060e(str, objArr));
    }

    /* renamed from: c */
    public static void m3058c(String str, Object... objArr) {
        Log.e(f2386a, C0911f.m3060e(str, objArr));
    }

    /* renamed from: a */
    public static void m3056a(Throwable th, String str, Object... objArr) {
        Log.e(f2386a, C0911f.m3060e(str, objArr), th);
    }

    /* renamed from: d */
    public static void m3059d(String str, Object... objArr) {
        Log.wtf(f2386a, C0911f.m3060e(str, objArr));
    }

    /* renamed from: e */
    private static String m3060e(String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        objArr = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        for (int i = 2; i < objArr.length; i++) {
            if (!objArr[i].getClass().equals(C0911f.class)) {
                str2 = objArr[i].getClassName();
                str2 = str2.substring(str2.lastIndexOf(46) + 1);
                str2 = str2.substring(str2.lastIndexOf(36) + 1);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(".");
                stringBuilder.append(objArr[i].getMethodName());
                str2 = stringBuilder.toString();
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
