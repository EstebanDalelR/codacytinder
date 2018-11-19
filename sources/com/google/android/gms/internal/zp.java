package com.google.android.gms.internal;

import java.io.PrintStream;
import java.io.PrintWriter;

public final class zp {
    /* renamed from: a */
    private static zq f16671a;
    /* renamed from: b */
    private static int f16672b;

    /* renamed from: com.google.android.gms.internal.zp$a */
    static final class C6276a extends zq {
        C6276a() {
        }

        /* renamed from: a */
        public final void mo4727a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }
    }

    static {
        Integer a;
        zq zuVar;
        Throwable th;
        PrintStream printStream;
        String name;
        StringBuilder stringBuilder;
        int i = 1;
        try {
            a = m20291a();
            if (a != null) {
                try {
                    if (a.intValue() >= 19) {
                        zuVar = new zu();
                        f16671a = zuVar;
                        if (a != null) {
                            i = a.intValue();
                        }
                        f16672b = i;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    printStream = System.err;
                    name = C6276a.class.getName();
                    stringBuilder = new StringBuilder(String.valueOf(name).length() + 132);
                    stringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
                    stringBuilder.append(name);
                    stringBuilder.append("will be used. The error is: ");
                    printStream.println(stringBuilder.toString());
                    th.printStackTrace(System.err);
                    zuVar = new C6276a();
                    f16671a = zuVar;
                    if (a != null) {
                        i = a.intValue();
                    }
                    f16672b = i;
                }
            }
            zuVar = (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ 1) != 0 ? new zt() : new C6276a();
        } catch (Throwable th3) {
            th = th3;
            a = null;
            printStream = System.err;
            name = C6276a.class.getName();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 132);
            stringBuilder.append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ");
            stringBuilder.append(name);
            stringBuilder.append("will be used. The error is: ");
            printStream.println(stringBuilder.toString());
            th.printStackTrace(System.err);
            zuVar = new C6276a();
            f16671a = zuVar;
            if (a != null) {
                i = a.intValue();
            }
            f16672b = i;
        }
        f16671a = zuVar;
        if (a != null) {
            i = a.intValue();
        }
        f16672b = i;
    }

    /* renamed from: a */
    private static Integer m20291a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* renamed from: a */
    public static void m20292a(Throwable th, PrintWriter printWriter) {
        f16671a.mo4727a(th, printWriter);
    }
}
