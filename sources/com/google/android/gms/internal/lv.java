package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@zzzv
@TargetApi(11)
public final class lv extends lx {
    public lv(zzanh zzanh, boolean z) {
        super(zzanh, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m27429a(webView, str, null);
    }
}
