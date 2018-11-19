package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.google.android.exoplayer2.util.C2314v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Requirements {
    /* renamed from: a */
    private static final String[] f6220a = null;
    /* renamed from: b */
    private final int f6221b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface NetworkType {
    }

    /* renamed from: a */
    private static void m7808a(String str) {
    }

    public Requirements(int i) {
        this.f6221b = i;
    }

    /* renamed from: a */
    public int m7814a() {
        return this.f6221b & 7;
    }

    /* renamed from: b */
    public boolean m7816b() {
        return (this.f6221b & 16) != 0;
    }

    /* renamed from: c */
    public boolean m7817c() {
        return (this.f6221b & 8) != 0;
    }

    /* renamed from: a */
    public boolean m7815a(Context context) {
        return (m7811b(context) && m7812c(context) && m7813d(context) != null) ? true : null;
    }

    /* renamed from: d */
    public int m7818d() {
        return this.f6221b;
    }

    /* renamed from: b */
    private boolean m7811b(Context context) {
        int a = m7814a();
        if (a == 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnected()) {
                if (!m7809a(connectivityManager)) {
                    return false;
                }
                if (a == 1) {
                    return true;
                }
                if (a == 3) {
                    context = activeNetworkInfo.isRoaming();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Roaming: ");
                    stringBuilder.append(context);
                    m7808a(stringBuilder.toString());
                    return context ^ 1;
                }
                context = m7810a(connectivityManager, activeNetworkInfo);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Metered network: ");
                stringBuilder2.append(context);
                m7808a(stringBuilder2.toString());
                if (a == 2) {
                    return context ^ 1;
                }
                if (a == 4) {
                    return context;
                }
                throw new IllegalStateException();
            }
        }
        m7808a("No network info or no connection.");
        return false;
    }

    /* renamed from: c */
    private boolean m7812c(Context context) {
        if (!m7816b()) {
            return true;
        }
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (context == null) {
            return false;
        }
        context = context.getIntExtra("status", -1);
        if (context == 2 || context == 5) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private boolean m7813d(android.content.Context r5) {
        /*
        r4 = this;
        r0 = r4.m7817c();
        r1 = 1;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = "power";
        r5 = r5.getSystemService(r0);
        r5 = (android.os.PowerManager) r5;
        r0 = com.google.android.exoplayer2.util.C2314v.f6956a;
        r2 = 23;
        r3 = 0;
        if (r0 < r2) goto L_0x0020;
    L_0x0017:
        r5 = r5.isDeviceIdleMode();
        if (r5 != 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0033;
    L_0x001e:
        r1 = 0;
        goto L_0x0033;
    L_0x0020:
        r0 = com.google.android.exoplayer2.util.C2314v.f6956a;
        r2 = 20;
        if (r0 < r2) goto L_0x002d;
    L_0x0026:
        r5 = r5.isInteractive();
        if (r5 != 0) goto L_0x001e;
    L_0x002c:
        goto L_0x0033;
    L_0x002d:
        r5 = r5.isScreenOn();
        if (r5 != 0) goto L_0x001e;
    L_0x0033:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.scheduler.Requirements.d(android.content.Context):boolean");
    }

    /* renamed from: a */
    private static boolean m7809a(ConnectivityManager connectivityManager) {
        if (C2314v.f6956a < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        boolean z = false;
        if (activeNetwork == null) {
            m7808a("No active network.");
            return false;
        }
        connectivityManager = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (connectivityManager == null || connectivityManager.hasCapability(16) == null) {
            z = true;
        }
        connectivityManager = new StringBuilder();
        connectivityManager.append("Network capability validated: ");
        connectivityManager.append(z);
        m7808a(connectivityManager.toString());
        return z ^ 1;
    }

    /* renamed from: a */
    private static boolean m7810a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (C2314v.f6956a >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        connectivityManager = networkInfo.getType();
        networkInfo = true;
        if (connectivityManager == 1 || connectivityManager == 7 || connectivityManager == 9) {
            networkInfo = null;
        }
        return networkInfo;
    }

    public String toString() {
        return super.toString();
    }
}
