package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.g */
public abstract class C2499g {
    /* renamed from: a */
    private static final Object f7638a = new Object();
    /* renamed from: b */
    private static C2499g f7639b;

    /* renamed from: a */
    public static C2499g m9145a(Context context) {
        synchronized (f7638a) {
            if (f7639b == null) {
                f7639b = new C3819i(context.getApplicationContext());
            }
        }
        return f7639b;
    }

    /* renamed from: a */
    public final void m9146a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo2583b(new C2500h(str, str2, i), serviceConnection, str3);
    }

    /* renamed from: a */
    protected abstract boolean mo2582a(C2500h c2500h, ServiceConnection serviceConnection, String str);

    /* renamed from: b */
    protected abstract void mo2583b(C2500h c2500h, ServiceConnection serviceConnection, String str);
}
