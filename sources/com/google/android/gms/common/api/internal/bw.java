package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

final class bw implements Runnable {
    /* renamed from: a */
    private /* synthetic */ Result f7507a;
    /* renamed from: b */
    private /* synthetic */ bv f7508b;

    bw(bv bvVar, Result result) {
        this.f7508b = bvVar;
        this.f7507a = result;
    }

    @WorkerThread
    public final void run() {
        GoogleApiClient googleApiClient;
        try {
            BasePendingResult.f11862c.set(Boolean.valueOf(true));
            this.f7508b.f11952h.sendMessage(this.f7508b.f11952h.obtainMessage(0, this.f7508b.f11945a.m8911a(this.f7507a)));
            BasePendingResult.f11862c.set(Boolean.valueOf(false));
            bv.m14312a(this.f7507a);
            googleApiClient = (GoogleApiClient) this.f7508b.f11951g.get();
            if (googleApiClient != null) {
                googleApiClient.mo2501b(this.f7508b);
            }
        } catch (RuntimeException e) {
            this.f7508b.f11952h.sendMessage(this.f7508b.f11952h.obtainMessage(1, e));
            BasePendingResult.f11862c.set(Boolean.valueOf(false));
            bv.m14312a(this.f7507a);
            googleApiClient = (GoogleApiClient) this.f7508b.f11951g.get();
            if (googleApiClient != null) {
                googleApiClient.mo2501b(this.f7508b);
            }
        } catch (Throwable th) {
            BasePendingResult.f11862c.set(Boolean.valueOf(false));
            bv.m14312a(this.f7507a);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.f7508b.f11951g.get();
            if (googleApiClient2 != null) {
                googleApiClient2.mo2501b(this.f7508b);
            }
            throw th;
        }
    }
}
