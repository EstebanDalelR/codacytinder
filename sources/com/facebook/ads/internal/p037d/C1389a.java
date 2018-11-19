package com.facebook.ads.internal.p037d;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.C1418g;

/* renamed from: com.facebook.ads.internal.d.a */
public class C1389a {
    /* renamed from: a */
    private static final String f3774a = "com.facebook.ads.internal.d.a";
    /* renamed from: b */
    private static C1389a f3775b = null;
    /* renamed from: c */
    private static boolean f3776c = false;
    /* renamed from: d */
    private Context f3777d;

    private C1389a(Context context) {
        this.f3777d = context;
    }

    /* renamed from: a */
    public static C1389a m4826a(Context context) {
        if (f3775b == null) {
            context = context.getApplicationContext();
            synchronized (context) {
                if (f3775b == null) {
                    f3775b = new C1389a(context);
                }
            }
        }
        return f3775b;
    }

    /* renamed from: a */
    public synchronized void m4827a() {
        if (!f3776c) {
            if (C1418g.m4935f(this.f3777d)) {
                try {
                    Thread.setDefaultUncaughtExceptionHandler(new C1390b(Thread.getDefaultUncaughtExceptionHandler(), this.f3777d));
                } catch (Throwable e) {
                    Log.e(f3774a, "No permissions to set the default uncaught exception handler", e);
                }
            }
            f3776c = true;
        }
    }
}
