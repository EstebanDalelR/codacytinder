package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.ar;

@TargetApi(21)
public final class gb extends ga {
    /* renamed from: a */
    public final ku mo6863a(zzanh zzanh, boolean z) {
        return new ly(zzanh, z);
    }

    /* renamed from: c */
    public final CookieManager mo8493c(Context context) {
        if (fq.m19763e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            hx.m19912b("Failed to obtain CookieManager.", th);
            ar.i().m27296a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: f */
    public final int mo7435f() {
        return 16974374;
    }
}
