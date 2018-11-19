package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Result;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.y */
public final class C3811y implements zzbh {
    /* renamed from: a */
    private final ah f12040a;

    public C3811y(ah ahVar) {
        this.f12040a = ahVar;
    }

    public final void begin() {
        for (zze disconnect : this.f12040a.f13944a.values()) {
            disconnect.disconnect();
        }
        this.f12040a.f13947d.f11880c = Collections.emptySet();
    }

    public final void connect() {
        this.f12040a.m17175a();
    }

    public final boolean disconnect() {
        return true;
    }

    public final void onConnected(Bundle bundle) {
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void zza(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final <A extends zzb, R extends Result, T extends ck<R, A>> T zzd(T t) {
        this.f12040a.f13947d.f11878a.add(t);
        return t;
    }

    public final <A extends zzb, T extends ck<? extends Result, A>> T zze(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
