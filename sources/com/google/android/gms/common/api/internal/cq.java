package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ad;

public final class cq implements ConnectionCallbacks, OnConnectionFailedListener {
    /* renamed from: a */
    public final Api<?> f11971a;
    /* renamed from: b */
    private final boolean f11972b;
    /* renamed from: c */
    private zzu f11973c;

    public cq(Api<?> api, boolean z) {
        this.f11971a = api;
        this.f11972b = z;
    }

    /* renamed from: a */
    private final void m14342a() {
        ad.m9046a(this.f11973c, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    /* renamed from: a */
    public final void m14343a(zzu zzu) {
        this.f11973c = zzu;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        m14342a();
        this.f11973c.onConnected(bundle);
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        m14342a();
        this.f11973c.zza(connectionResult, this.f11971a, this.f11972b);
    }

    public final void onConnectionSuspended(int i) {
        m14342a();
        this.f11973c.onConnectionSuspended(i);
    }
}
