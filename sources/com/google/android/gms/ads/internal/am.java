package com.google.android.gms.ads.internal;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.aja;
import com.google.android.gms.internal.alo;
import com.google.android.gms.internal.ec;

final class am extends WebViewClient {
    /* renamed from: a */
    private /* synthetic */ al f7105a;

    am(al alVar) {
        this.f7105a = alVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f7105a.f13853g != null) {
            try {
                this.f7105a.f13853g.onAdFailedToLoad(0);
            } catch (Throwable e) {
                ec.c("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f7105a.m17118b())) {
            return false;
        }
        if (str.startsWith((String) aja.f().a(alo.ce))) {
            if (this.f7105a.f13853g != null) {
                try {
                    this.f7105a.f13853g.onAdFailedToLoad(3);
                } catch (Throwable e) {
                    ec.c("Could not call AdListener.onAdFailedToLoad().", e);
                }
            }
            this.f7105a.m17117a(0);
            return true;
        }
        if (str.startsWith((String) aja.f().a(alo.cf))) {
            if (this.f7105a.f13853g != null) {
                try {
                    this.f7105a.f13853g.onAdFailedToLoad(0);
                } catch (Throwable e2) {
                    ec.c("Could not call AdListener.onAdFailedToLoad().", e2);
                }
            }
            this.f7105a.m17117a(0);
            return true;
        }
        if (str.startsWith((String) aja.f().a(alo.cg))) {
            if (this.f7105a.f13853g != null) {
                try {
                    this.f7105a.f13853g.onAdLoaded();
                } catch (Throwable e22) {
                    ec.c("Could not call AdListener.onAdLoaded().", e22);
                }
            }
            this.f7105a.m17117a(this.f7105a.m17115a(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f7105a.f13853g != null) {
                try {
                    this.f7105a.f13853g.onAdLeftApplication();
                } catch (Throwable e222) {
                    ec.c("Could not call AdListener.onAdLeftApplication().", e222);
                }
            }
            this.f7105a.m17111c(this.f7105a.m17108b(str));
            return true;
        }
    }
}
