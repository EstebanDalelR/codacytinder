package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import java.util.concurrent.Callable;

final class aw implements Callable<String> {
    /* renamed from: a */
    private /* synthetic */ av f7190a;

    aw(av avVar) {
        this.f7190a = avVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        String str = "";
        if (!((Boolean) aja.f().a(alo.cm)).booleanValue()) {
            return str;
        }
        CookieManager c = ar.m8650g().c(this.f7190a.e.f7163c);
        return c != null ? c.getCookie("googleads.g.doubleclick.net") : str;
    }
}
