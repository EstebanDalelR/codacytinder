package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: android.support.v4.os.b */
public final class C0529b {
    /* renamed from: a */
    public static void m1953a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: a */
    public static void m1952a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
