package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.webkit.WebChromeClient;

@TargetApi(14)
public class fv extends ft {
    /* renamed from: a */
    public final String mo7434a(SslError sslError) {
        return sslError.getUrl();
    }

    /* renamed from: c */
    public final WebChromeClient mo6868c(zzanh zzanh) {
        return new lw(zzanh);
    }

    /* renamed from: f */
    public int mo7435f() {
        return 1;
    }
}
