package com.google.android.gms.internal;

import com.google.android.gms.ads.C2338a;

@zzzv
public class ajc extends C2338a {
    /* renamed from: a */
    private final Object f22987a = new Object();
    /* renamed from: b */
    private C2338a f22988b;

    /* renamed from: a */
    public final void m27110a(C2338a c2338a) {
        synchronized (this.f22987a) {
            this.f22988b = c2338a;
        }
    }

    public void onAdClosed() {
        synchronized (this.f22987a) {
            if (this.f22988b != null) {
                this.f22988b.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.f22987a) {
            if (this.f22988b != null) {
                this.f22988b.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f22987a) {
            if (this.f22988b != null) {
                this.f22988b.onAdLeftApplication();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f22987a) {
            if (this.f22988b != null) {
                this.f22988b.onAdLoaded();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.f22987a) {
            if (this.f22988b != null) {
                this.f22988b.onAdOpened();
            }
        }
    }
}
