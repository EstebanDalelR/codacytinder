package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.google.android.gms.common.internal.ad;

/* renamed from: com.google.android.gms.common.q */
public class C2514q {
    /* renamed from: a */
    private static C2514q f7669a;
    /* renamed from: b */
    private final Context f7670b;

    private C2514q(Context context) {
        this.f7670b = context.getApplicationContext();
    }

    /* renamed from: a */
    static C4293i m9177a(PackageInfo packageInfo, C4293i... c4293iArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        int i = 0;
        C4400j c4400j = new C4400j(packageInfo.signatures[0].toByteArray());
        while (i < c4293iArr.length) {
            if (c4293iArr[i].equals(c4400j)) {
                return c4293iArr[i];
            }
            i++;
        }
        return null;
    }

    /* renamed from: a */
    public static C2514q m9178a(Context context) {
        ad.m9045a((Object) context);
        synchronized (C2514q.class) {
            if (f7669a == null) {
                C2491h.m9031a(context);
                f7669a = new C2514q(context);
            }
        }
        return f7669a;
    }

    /* renamed from: a */
    private static boolean m9179a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (C2514q.m9177a(packageInfo, z ? C2511l.f7668a : new C4293i[]{C2511l.f7668a[0]}) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m9180a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (C2514q.m9179a(packageInfo, false)) {
            return true;
        }
        if (C2514q.m9179a(packageInfo, true)) {
            if (C2513p.zzch(this.f7670b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}
