package com.google.android.gms.common.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

/* renamed from: com.google.android.gms.common.internal.e */
final class C3818e implements zzg {
    /* renamed from: a */
    private /* synthetic */ OnConnectionFailedListener f12066a;

    C3818e(OnConnectionFailedListener onConnectionFailedListener) {
        this.f12066a = onConnectionFailedListener;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f12066a.onConnectionFailed(connectionResult);
    }
}
