package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.v4.content.C2839a;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.zzcu;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public final class C4288b extends C2839a<Void> implements zzcu {
    /* renamed from: o */
    private Semaphore f13940o = new Semaphore(0);
    /* renamed from: p */
    private Set<GoogleApiClient> f13941p;

    public C4288b(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.f13941p = set;
    }

    /* renamed from: x */
    private final Void m17167x() {
        int i = 0;
        for (GoogleApiClient a : this.f13941p) {
            if (a.mo2497a((zzcu) this)) {
                i++;
            }
        }
        try {
            this.f13940o.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (Throwable e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ Object mo3563d() {
        return m17167x();
    }

    /* renamed from: l */
    protected final void mo3564l() {
        this.f13940o.drainPermits();
        m1612n();
    }

    public final void zzabi() {
        this.f13940o.release();
    }
}
