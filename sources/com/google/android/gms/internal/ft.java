package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.util.Set;

@TargetApi(11)
public class ft extends fs {
    /* renamed from: a */
    public ku mo6863a(zzanh zzanh, boolean z) {
        return new lv(zzanh, z);
    }

    /* renamed from: a */
    public final Set<String> mo6864a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    /* renamed from: a */
    public final boolean mo4620a(Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    /* renamed from: a */
    public boolean mo6865a(Context context, WebSettings webSettings) {
        super.mo6865a(context, webSettings);
        return ((Boolean) hg.m19844a(context, new fu(this, context, webSettings))).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo6866a(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    /* renamed from: b */
    public final boolean mo6867b(View view) {
        view.setLayerType(0, null);
        return true;
    }

    /* renamed from: c */
    public WebChromeClient mo6868c(zzanh zzanh) {
        return new ln(zzanh);
    }

    /* renamed from: c */
    public final boolean mo6869c(View view) {
        view.setLayerType(1, null);
        return true;
    }
}
