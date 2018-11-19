package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final class fu implements Callable<Boolean> {
    /* renamed from: a */
    private /* synthetic */ Context f16071a;
    /* renamed from: b */
    private /* synthetic */ WebSettings f16072b;

    fu(ft ftVar, Context context, WebSettings webSettings) {
        this.f16071a = context;
        this.f16072b = webSettings;
    }

    public final /* synthetic */ Object call() throws Exception {
        if (this.f16071a.getCacheDir() != null) {
            this.f16072b.setAppCachePath(this.f16071a.getCacheDir().getAbsolutePath());
            this.f16072b.setAppCacheMaxSize(0);
            this.f16072b.setAppCacheEnabled(true);
        }
        this.f16072b.setDatabasePath(this.f16071a.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        this.f16072b.setDatabaseEnabled(true);
        this.f16072b.setDomStorageEnabled(true);
        this.f16072b.setDisplayZoomControls(false);
        this.f16072b.setBuiltInZoomControls(true);
        this.f16072b.setSupportZoom(true);
        this.f16072b.setAllowContentAccess(false);
        return Boolean.valueOf(true);
    }
}
