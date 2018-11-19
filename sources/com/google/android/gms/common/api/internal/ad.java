package com.google.android.gms.common.api.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;

final class ad implements OnConnectionFailedListener {
    /* renamed from: a */
    private /* synthetic */ bp f11907a;

    ad(aa aaVar, bp bpVar) {
        this.f11907a = bpVar;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f11907a.m14223a(new Status(8));
    }
}
