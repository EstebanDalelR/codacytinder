package com.google.android.m4b.maps.cg;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;

class bx {
    /* renamed from: a */
    private static final String f19145a = "bx";

    @TargetApi(9)
    /* renamed from: a */
    public static Object m23056a() {
        if (!m23060d()) {
            return null;
        }
        if (C4728u.m21050a(f19145a, 5)) {
            Log.w(f19145a, "Suppressed StrictMode policy violation: StrictModeDiskReadViolation");
        }
        return StrictMode.allowThreadDiskReads();
    }

    @TargetApi(9)
    /* renamed from: b */
    public static Object m23058b() {
        if (!m23060d()) {
            return null;
        }
        if (C4728u.m21050a(f19145a, 5)) {
            Log.w(f19145a, "Suppressed StrictMode policy violation: StrictModeDiskWriteViolation");
        }
        return StrictMode.allowThreadDiskWrites();
    }

    @TargetApi(9)
    /* renamed from: c */
    public static Object m23059c() {
        Object a = m23056a();
        m23058b();
        return a;
    }

    /* renamed from: d */
    private static boolean m23060d() {
        if (VERSION.SDK_INT != 21) {
            if (VERSION.SDK_INT != 22) {
                return false;
            }
        }
        return true;
    }

    private bx() {
    }

    @TargetApi(9)
    /* renamed from: a */
    public static void m23057a(Object obj) {
        if ((VERSION.SDK_INT >= 9 ? 1 : null) != null && obj != null) {
            StrictMode.setThreadPolicy((ThreadPolicy) obj);
        }
    }
}
