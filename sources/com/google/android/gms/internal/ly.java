package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.support.annotation.Nullable;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@zzzv
@TargetApi(21)
public final class ly extends lx {
    public ly(zzanh zzanh, boolean z) {
        super(zzanh, z);
    }

    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            if (webResourceRequest.getUrl() != null) {
                return m27429a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
            }
        }
        return null;
    }
}
