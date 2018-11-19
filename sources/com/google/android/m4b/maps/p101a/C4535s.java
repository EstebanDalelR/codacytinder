package com.google.android.m4b.maps.p101a;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.m4b.maps.a.s */
public class C4535s {
    /* renamed from: a */
    public static boolean f16849a = Log.isLoggable("Volley", 2);
    /* renamed from: b */
    private static String f16850b = "Volley";

    /* renamed from: com.google.android.m4b.maps.a.s$a */
    static class C4534a {
        /* renamed from: a */
        public static final boolean f16846a = C4535s.f16849a;
        /* renamed from: b */
        private final List<C4533a> f16847b = new ArrayList();
        /* renamed from: c */
        private boolean f16848c = false;

        /* renamed from: com.google.android.m4b.maps.a.s$a$a */
        static class C4533a {
            /* renamed from: a */
            public final String f16843a;
            /* renamed from: b */
            public final long f16844b;
            /* renamed from: c */
            public final long f16845c;

            public C4533a(String str, long j, long j2) {
                this.f16843a = str;
                this.f16844b = j;
                this.f16845c = j2;
            }
        }

        C4534a() {
        }

        /* renamed from: a */
        public final synchronized void m20466a(String str, long j) {
            if (this.f16848c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f16847b.add(new C4533a(str, j, SystemClock.elapsedRealtime()));
        }

        /* renamed from: a */
        public final synchronized void m20465a(String str) {
            long j;
            this.f16848c = true;
            if (this.f16847b.size() == 0) {
                j = 0;
            } else {
                j = ((C4533a) this.f16847b.get(this.f16847b.size() - 1)).f16845c - ((C4533a) this.f16847b.get(0)).f16845c;
            }
            if (j > 0) {
                long j2 = ((C4533a) this.f16847b.get(0)).f16845c;
                C4535s.m20469b("(%-4d ms) %s", Long.valueOf(j), str);
                for (C4533a c4533a : this.f16847b) {
                    C4535s.m20469b("(+%-4d) [%2d] %s", Long.valueOf(c4533a.f16845c - j2), Long.valueOf(c4533a.f16844b), c4533a.f16843a);
                    j2 = c4533a.f16845c;
                }
            }
        }

        protected final void finalize() {
            if (!this.f16848c) {
                m20465a("Request on the loose");
                C4535s.m20470c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m20467a(String str, Object... objArr) {
        if (f16849a) {
            Log.v(f16850b, C4535s.m20471d(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m20469b(String str, Object... objArr) {
        Log.d(f16850b, C4535s.m20471d(str, objArr));
    }

    /* renamed from: c */
    public static void m20470c(String str, Object... objArr) {
        Log.e(f16850b, C4535s.m20471d(str, objArr));
    }

    /* renamed from: a */
    public static void m20468a(Throwable th, String str, Object... objArr) {
        Log.e(f16850b, C4535s.m20471d(str, objArr), th);
    }

    /* renamed from: d */
    private static String m20471d(String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        objArr = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        for (int i = 2; i < objArr.length; i++) {
            if (!objArr[i].getClass().equals(C4535s.class)) {
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
