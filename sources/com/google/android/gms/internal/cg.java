package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class cg {
    /* renamed from: a */
    public static boolean f15916a = Log.isLoggable("Volley", 2);
    /* renamed from: b */
    private static String f15917b = "Volley";

    /* renamed from: com.google.android.gms.internal.cg$a */
    static class C4467a {
        /* renamed from: a */
        public static final boolean f15913a = cg.f15916a;
        /* renamed from: b */
        private final List<db> f15914b = new ArrayList();
        /* renamed from: c */
        private boolean f15915c = false;

        C4467a() {
        }

        /* renamed from: a */
        public final synchronized void m19565a(String str) {
            long j;
            this.f15915c = true;
            if (this.f15914b.size() == 0) {
                j = 0;
            } else {
                j = ((db) this.f15914b.get(this.f15914b.size() - 1)).f15942c - ((db) this.f15914b.get(0)).f15942c;
            }
            if (j > 0) {
                long j2 = ((db) this.f15914b.get(0)).f15942c;
                cg.m19569b("(%-4d ms) %s", Long.valueOf(j), str);
                for (db dbVar : this.f15914b) {
                    cg.m19569b("(+%-4d) [%2d] %s", Long.valueOf(dbVar.f15942c - j2), Long.valueOf(dbVar.f15941b), dbVar.f15940a);
                    j2 = dbVar.f15942c;
                }
            }
        }

        /* renamed from: a */
        public final synchronized void m19566a(String str, long j) {
            if (this.f15915c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f15914b.add(new db(str, j, SystemClock.elapsedRealtime()));
        }

        protected final void finalize() throws Throwable {
            if (!this.f15915c) {
                m19565a("Request on the loose");
                cg.m19570c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m19567a(String str, Object... objArr) {
        if (f15916a) {
            Log.v(f15917b, m19571d(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m19568a(Throwable th, String str, Object... objArr) {
        Log.e(f15917b, m19571d(str, objArr), th);
    }

    /* renamed from: b */
    public static void m19569b(String str, Object... objArr) {
        Log.d(f15917b, m19571d(str, objArr));
    }

    /* renamed from: c */
    public static void m19570c(String str, Object... objArr) {
        Log.e(f15917b, m19571d(str, objArr));
    }

    /* renamed from: d */
    private static String m19571d(String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(cg.class)) {
                str2 = stackTrace[i].getClassName();
                str2 = str2.substring(str2.lastIndexOf(46) + 1);
                str2 = str2.substring(str2.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(methodName).length());
                stringBuilder.append(str2);
                stringBuilder.append(".");
                stringBuilder.append(methodName);
                str2 = stringBuilder.toString();
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
