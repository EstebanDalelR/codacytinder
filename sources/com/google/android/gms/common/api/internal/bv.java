package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C2469f;
import com.google.android.gms.common.api.C2470g;
import com.google.android.gms.common.api.C3792e;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ad;
import java.lang.ref.WeakReference;

public final class bv<R extends Result> extends C2470g<R> implements ResultCallback<R> {
    /* renamed from: a */
    private C2469f<? super R, ? extends Result> f11945a;
    /* renamed from: b */
    private bv<? extends Result> f11946b;
    /* renamed from: c */
    private volatile C3792e<? super R> f11947c;
    /* renamed from: d */
    private PendingResult<R> f11948d;
    /* renamed from: e */
    private final Object f11949e;
    /* renamed from: f */
    private Status f11950f;
    /* renamed from: g */
    private final WeakReference<GoogleApiClient> f11951g;
    /* renamed from: h */
    private final bx f11952h;
    /* renamed from: i */
    private boolean f11953i;

    /* renamed from: a */
    private static void m14312a(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (Throwable e) {
                String valueOf = String.valueOf(result);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                stringBuilder.append("Unable to release ");
                stringBuilder.append(valueOf);
                Log.w("TransformedResultImpl", stringBuilder.toString(), e);
            }
        }
    }

    /* renamed from: a */
    private final void m14313a(Status status) {
        synchronized (this.f11949e) {
            this.f11950f = status;
            m14318b(this.f11950f);
        }
    }

    /* renamed from: b */
    private final void m14317b() {
        if (this.f11945a != null || this.f11947c != null) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.f11951g.get();
            if (!(this.f11953i || this.f11945a == null || googleApiClient == null)) {
                googleApiClient.mo2494a(this);
                this.f11953i = true;
            }
            if (this.f11950f != null) {
                m14318b(this.f11950f);
                return;
            }
            if (this.f11948d != null) {
                this.f11948d.mo2487a((ResultCallback) this);
            }
        }
    }

    /* renamed from: b */
    private final void m14318b(Status status) {
        synchronized (this.f11949e) {
            if (this.f11945a != null) {
                status = this.f11945a.m8912a(status);
                ad.m9046a((Object) status, (Object) "onFailure must not return null");
                this.f11946b.m14313a(status);
            } else if (m14320c()) {
                this.f11947c.m14214a(status);
            }
        }
    }

    /* renamed from: c */
    private final boolean m14320c() {
        return (this.f11947c == null || ((GoogleApiClient) this.f11951g.get()) == null) ? false : true;
    }

    /* renamed from: a */
    final void m14323a() {
        this.f11947c = null;
    }

    /* renamed from: a */
    public final void m14324a(PendingResult<?> pendingResult) {
        synchronized (this.f11949e) {
            this.f11948d = pendingResult;
            m14317b();
        }
    }

    public final void onResult(R r) {
        synchronized (this.f11949e) {
            if (!r.getStatus().isSuccess()) {
                m14313a(r.getStatus());
                m14312a((Result) r);
            } else if (this.f11945a != null) {
                bj.m8981a().submit(new bw(this, r));
            } else if (m14320c()) {
                this.f11947c.m14213a((Result) r);
            }
        }
    }
}
