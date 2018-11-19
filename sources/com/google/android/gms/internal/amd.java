package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.dynamic.C4296b;

@zzzv
public final class amd implements CustomRenderedAd {
    /* renamed from: a */
    private final zznx f22989a;

    public amd(zznx zznx) {
        this.f22989a = zznx;
    }

    public final String getBaseUrl() {
        try {
            return this.f22989a.zzjj();
        } catch (Throwable e) {
            hx.m19914c("Could not delegate getBaseURL to CustomRenderedAd", e);
            return null;
        }
    }

    public final String getContent() {
        try {
            return this.f22989a.getContent();
        } catch (Throwable e) {
            hx.m19914c("Could not delegate getContent to CustomRenderedAd", e);
            return null;
        }
    }

    public final void onAdRendered(View view) {
        try {
            this.f22989a.zze(view != null ? C4296b.a(view) : null);
        } catch (Throwable e) {
            hx.m19914c("Could not delegate onAdRendered to CustomRenderedAd", e);
        }
    }

    public final void recordClick() {
        try {
            this.f22989a.recordClick();
        } catch (Throwable e) {
            hx.m19914c("Could not delegate recordClick to CustomRenderedAd", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f22989a.recordImpression();
        } catch (Throwable e) {
            hx.m19914c("Could not delegate recordImpression to CustomRenderedAd", e);
        }
    }
}
