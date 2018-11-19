package com.google.android.gms.ads.internal.js;

import com.facebook.ads.AudienceNetworkActivity;

/* renamed from: com.google.android.gms.ads.internal.js.o */
final class C2385o implements Runnable {
    /* renamed from: a */
    private /* synthetic */ String f7281a;
    /* renamed from: b */
    private /* synthetic */ C4390l f7282b;

    C2385o(C4390l c4390l, String str) {
        this.f7282b = c4390l;
        this.f7281a = str;
    }

    public final void run() {
        this.f7282b.f14562a.loadData(this.f7281a, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8");
    }
}
