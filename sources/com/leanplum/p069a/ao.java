package com.leanplum.p069a;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.leanplum.a.ao */
public final class ao {
    /* renamed from: a */
    private static final ThreadLocal<Boolean> f7931a = new C25791();

    /* renamed from: com.leanplum.a.ao$1 */
    final class C25791 extends ThreadLocal<Boolean> {
        C25791() {
        }

        /* renamed from: a */
        private static Boolean m9510a() {
            return Boolean.valueOf(false);
        }

        protected final /* synthetic */ Object initialValue() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: a */
    public static void m9516a(Object... objArr) {
        ao.m9514a(ap.ERROR, C3859g.m14561a(objArr, ", "));
    }

    /* renamed from: b */
    public static void m9517b(Object... objArr) {
        ao.m9514a(ap.WARNING, C3859g.m14561a(objArr, ", "));
    }

    /* renamed from: c */
    public static void m9518c(Object... objArr) {
        ao.m9514a(ap.INFO, C3859g.m14561a(objArr, ", "));
    }

    /* renamed from: d */
    public static void m9519d(Object... objArr) {
        ao.m9514a(ap.VERBOSE, C3859g.m14561a(objArr, ", "));
    }

    /* renamed from: e */
    public static void m9520e(Object... objArr) {
        ao.m9514a(ap.PRIVATE, C3859g.m14561a(objArr, ", "));
    }

    /* renamed from: f */
    public static void m9521f(Object... objArr) {
        ao.m9514a(ap.DEBUG, C3859g.m14561a(objArr, ", "));
    }

    /* renamed from: a */
    private static String m9512a(ap apVar) {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(apVar.name());
        stringBuilder.append("][Leanplum]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m9511a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 5) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(stackTrace[5].getClassName());
        String stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append("::");
        stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(stackTrace[5].getMethodName());
        stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append("::");
        stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder2);
        stringBuilder.append(stackTrace[5].getLineNumber());
        String stringBuilder3 = stringBuilder.toString();
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(stringBuilder3);
        stringBuilder4.append("]: ");
        return stringBuilder4.toString();
    }

    /* renamed from: a */
    private static void m9515a(String str) {
        if (C2590h.f8068m) {
            if (!((Boolean) f7931a.get()).booleanValue()) {
                f7931a.set(Boolean.valueOf(true));
                try {
                    Map hashMap = new HashMap();
                    hashMap.put("type", "sdkLog");
                    hashMap.put("message", str);
                    aw.m9544b("log", hashMap).m9582k();
                } catch (Throwable th) {
                    f7931a.remove();
                }
                f7931a.remove();
            }
        }
    }

    /* renamed from: a */
    public static String m9513a(Throwable th) {
        return Log.getStackTraceString(th);
    }

    /* renamed from: a */
    public static void m9514a(ap apVar, String str) {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder("[");
        stringBuilder2.append(apVar.name());
        stringBuilder2.append("][Leanplum]");
        String stringBuilder3 = stringBuilder2.toString();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length >= 5) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("[");
            stringBuilder4.append(stackTrace[5].getClassName());
            String stringBuilder5 = stringBuilder4.toString();
            stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder5);
            stringBuilder4.append("::");
            stringBuilder5 = stringBuilder4.toString();
            stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder5);
            stringBuilder4.append(stackTrace[5].getMethodName());
            stringBuilder5 = stringBuilder4.toString();
            stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder5);
            stringBuilder4.append("::");
            stringBuilder5 = stringBuilder4.toString();
            stringBuilder4 = new StringBuilder();
            stringBuilder4.append(stringBuilder5);
            stringBuilder4.append(stackTrace[5].getLineNumber());
            stringBuilder = stringBuilder4.toString();
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(stringBuilder);
            stringBuilder6.append("]: ");
            stringBuilder = stringBuilder6.toString();
        } else {
            stringBuilder = "";
        }
        switch (apVar) {
            case ERROR:
                apVar = new StringBuilder();
                apVar.append(stringBuilder);
                apVar.append(str);
                Log.e(stringBuilder3, apVar.toString());
                apVar = new StringBuilder();
                apVar.append(stringBuilder3);
                apVar.append(stringBuilder);
                apVar.append(str);
                ao.m9515a(apVar.toString());
                return;
            case WARNING:
                apVar = new StringBuilder();
                apVar.append(stringBuilder);
                apVar.append(str);
                Log.w(stringBuilder3, apVar.toString());
                apVar = new StringBuilder();
                apVar.append(stringBuilder3);
                apVar.append(stringBuilder);
                apVar.append(str);
                ao.m9515a(apVar.toString());
                return;
            case INFO:
                apVar = new StringBuilder();
                apVar.append(stringBuilder);
                apVar.append(str);
                Log.i(stringBuilder3, apVar.toString());
                apVar = new StringBuilder();
                apVar.append(stringBuilder3);
                apVar.append(stringBuilder);
                apVar.append(str);
                ao.m9515a(apVar.toString());
                return;
            case VERBOSE:
                if (!(C2590h.f8067l == null || C2590h.f8070o == null)) {
                    apVar = new StringBuilder();
                    apVar.append(stringBuilder);
                    apVar.append(str);
                    Log.v(stringBuilder3, apVar.toString());
                    apVar = new StringBuilder();
                    apVar.append(stringBuilder3);
                    apVar.append(stringBuilder);
                    apVar.append(str);
                    ao.m9515a(apVar.toString());
                }
                return;
            case PRIVATE:
                apVar = new StringBuilder();
                apVar.append(stringBuilder3);
                apVar.append(stringBuilder);
                apVar.append(str);
                ao.m9515a(apVar.toString());
                return;
            default:
                return;
        }
    }
}
