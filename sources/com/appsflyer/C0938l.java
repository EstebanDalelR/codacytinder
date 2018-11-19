package com.appsflyer;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.telephony.TelephonyManager;

/* renamed from: com.appsflyer.l */
final class C0938l {

    /* renamed from: com.appsflyer.l$a */
    static final class C0936a {
        /* renamed from: a */
        static final C0938l f2481a = new C0938l();
    }

    /* renamed from: com.appsflyer.l$b */
    static final class C0937b {
        /* renamed from: a */
        private final String f2482a;
        /* renamed from: b */
        private final String f2483b;
        /* renamed from: c */
        private final String f2484c;

        C0937b(@NonNull String str, @Nullable String str2, @Nullable String str3) {
            this.f2482a = str;
            this.f2483b = str2;
            this.f2484c = str3;
        }

        /* renamed from: a */
        final String m3199a() {
            return this.f2482a;
        }

        @Nullable
        /* renamed from: b */
        final String m3200b() {
            return this.f2483b;
        }

        @Nullable
        /* renamed from: c */
        final String m3201c() {
            return this.f2484c;
        }
    }

    C0938l() {
    }

    /* renamed from: a */
    public static C0938l m3202a() {
        return C0936a.f2481a;
    }

    /* renamed from: a */
    private static boolean m3204a(NetworkInfo networkInfo) {
        return (networkInfo == null || networkInfo.isConnectedOrConnecting() == null) ? null : true;
    }

    @RequiresApi(21)
    /* renamed from: a */
    private static String m3203a(@NonNull ConnectivityManager connectivityManager) {
        Network[] allNetworks = connectivityManager.getAllNetworks();
        int length = allNetworks.length;
        int i = 0;
        while (i < length) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i]);
            if (!C0938l.m3204a(networkInfo)) {
                i++;
            } else if (1 == networkInfo.getType()) {
                return "WIFI";
            } else {
                return networkInfo.getType() == null ? "MOBILE" : "unknown";
            }
        }
        return "unknown";
    }

    /* renamed from: b */
    private static String m3206b(@NonNull ConnectivityManager connectivityManager) {
        if (C0938l.m3204a(connectivityManager.getNetworkInfo(1))) {
            return "WIFI";
        }
        if (C0938l.m3204a(connectivityManager.getNetworkInfo(0))) {
            return "MOBILE";
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (C0938l.m3204a(activeNetworkInfo)) {
            if (1 == activeNetworkInfo.getType()) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() == null) {
                return "MOBILE";
            }
        }
        return "unknown";
    }

    /* renamed from: b */
    private static String m3205b(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "unknown";
        }
        return 21 <= VERSION.SDK_INT ? C0938l.m3203a(connectivityManager) : C0938l.m3206b(connectivityManager);
    }

    /* renamed from: a */
    final C0937b m3207a(@NonNull Context context) {
        String b;
        Throwable th;
        String str = "unknown";
        String str2 = null;
        try {
            TelephonyManager telephonyManager;
            b = C0938l.m3205b(context);
            try {
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
                str = telephonyManager.getSimOperatorName();
            } catch (Throwable th2) {
                th = th2;
                str = null;
                AFLogger.m3073a("Exception while collecting network info. ", th);
                context = str2;
                return new C0937b(b, context, str);
            }
            try {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (networkOperatorName != null) {
                    try {
                        if (networkOperatorName.isEmpty()) {
                        }
                        context = networkOperatorName;
                    } catch (Throwable th3) {
                        th = th3;
                        str2 = networkOperatorName;
                        AFLogger.m3073a("Exception while collecting network info. ", th);
                        context = str2;
                        return new C0937b(b, context, str);
                    }
                    return new C0937b(b, context, str);
                }
                if (2 == telephonyManager.getPhoneType()) {
                    context = "CDMA";
                    return new C0937b(b, context, str);
                }
                context = networkOperatorName;
            } catch (Throwable th4) {
                th = th4;
                AFLogger.m3073a("Exception while collecting network info. ", th);
                context = str2;
                return new C0937b(b, context, str);
            }
        } catch (Throwable th5) {
            th = th5;
            b = str;
            str = null;
            AFLogger.m3073a("Exception while collecting network info. ", th);
            context = str2;
            return new C0937b(b, context, str);
        }
        return new C0937b(b, context, str);
    }
}
