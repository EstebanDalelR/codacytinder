package com.google.android.gms.common.api.internal;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzan;
import com.google.android.gms.common.internal.zzj;
import java.util.Set;

final class at implements zzcy, zzj {
    /* renamed from: a */
    final /* synthetic */ al f11915a;
    /* renamed from: b */
    private final zze f11916b;
    /* renamed from: c */
    private final cg<?> f11917c;
    /* renamed from: d */
    private zzan f11918d = null;
    /* renamed from: e */
    private Set<Scope> f11919e = null;
    /* renamed from: f */
    private boolean f11920f = false;

    public at(al alVar, zze zze, cg<?> cgVar) {
        this.f11915a = alVar;
        this.f11916b = zze;
        this.f11917c = cgVar;
    }

    @WorkerThread
    /* renamed from: a */
    private final void m14269a() {
        if (this.f11920f && this.f11918d != null) {
            this.f11916b.zza(this.f11918d, this.f11919e);
        }
    }

    @WorkerThread
    public final void zzb(zzan zzan, Set<Scope> set) {
        if (zzan != null) {
            if (set != null) {
                this.f11918d = zzan;
                this.f11919e = set;
                m14269a();
                return;
            }
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        zzh(new ConnectionResult(4));
    }

    public final void zzf(@NonNull ConnectionResult connectionResult) {
        this.f11915a.f7475q.post(new au(this, connectionResult));
    }

    @WorkerThread
    public final void zzh(ConnectionResult connectionResult) {
        ((an) this.f11915a.f7471m.get(this.f11917c)).m17190a(connectionResult);
    }
}
