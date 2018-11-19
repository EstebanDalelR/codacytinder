package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C2519c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.a */
public final class C2515a {
    /* renamed from: a */
    private static final Object f7671a = new Object();
    /* renamed from: b */
    private static volatile C2515a f7672b = null;
    /* renamed from: c */
    private static boolean f7673c = false;
    /* renamed from: d */
    private final List<String> f7674d = Collections.EMPTY_LIST;
    /* renamed from: e */
    private final List<String> f7675e = Collections.EMPTY_LIST;
    /* renamed from: f */
    private final List<String> f7676f = Collections.EMPTY_LIST;
    /* renamed from: g */
    private final List<String> f7677g = Collections.EMPTY_LIST;

    private C2515a() {
    }

    /* renamed from: a */
    public static C2515a m9181a() {
        if (f7672b == null) {
            synchronized (f7671a) {
                if (f7672b == null) {
                    f7672b = new C2515a();
                }
            }
        }
        return f7672b;
    }

    /* renamed from: a */
    public final boolean m9182a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m9183a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    /* renamed from: a */
    public final boolean m9183a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : C2519c.m9192a(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
