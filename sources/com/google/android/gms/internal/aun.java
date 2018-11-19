package com.google.android.gms.internal;

import android.content.Context;
import com.facebook.ads.AudienceNetworkActivity;

@zzzv
public class aun extends auh implements zzanm {
    aun(Context context, dm dmVar, zzanh zzanh, zzyb zzyb) {
        super(context, dmVar, zzanh, zzyb);
    }

    /* renamed from: a */
    protected final void mo6852a() {
        if (this.c.errorCode == -2) {
            this.b.zzsz().m20000a((zzanm) this);
            mo7431b();
            hx.m19911b("Loading HTML in WebView.");
            this.b.loadDataWithBaseURL(this.c.zzcja, this.c.body, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8", null);
        }
    }

    /* renamed from: b */
    protected void mo7431b() {
    }
}
