package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;

/* renamed from: com.google.android.gms.common.internal.d */
final class C3817d implements zzf {
    /* renamed from: a */
    private /* synthetic */ ConnectionCallbacks f12065a;

    C3817d(ConnectionCallbacks connectionCallbacks) {
        this.f12065a = connectionCallbacks;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        this.f12065a.onConnected(bundle);
    }

    public final void onConnectionSuspended(int i) {
        this.f12065a.onConnectionSuspended(i);
    }
}
