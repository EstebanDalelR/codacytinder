package com.google.android.gms.ads.internal.js;

import com.facebook.ads.AudienceNetworkActivity;

/* renamed from: com.google.android.gms.ads.internal.js.p */
final class C2386p implements Runnable {
    /* renamed from: a */
    private /* synthetic */ String f7283a;
    /* renamed from: b */
    private /* synthetic */ C4390l f7284b;

    C2386p(C4390l c4390l, String str) {
        this.f7284b = c4390l;
        this.f7283a = str;
    }

    public final void run() {
        this.f7284b.f14562a.loadData(this.f7283a, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, "UTF-8");
    }
}
