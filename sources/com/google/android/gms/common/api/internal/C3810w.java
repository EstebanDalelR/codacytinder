package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

/* renamed from: com.google.android.gms.common.api.internal.w */
final class C3810w implements ConnectionCallbacks, OnConnectionFailedListener {
    /* renamed from: a */
    private /* synthetic */ C3803n f12039a;

    private C3810w(C3803n c3803n) {
        this.f12039a = c3803n;
    }

    public final void onConnected(Bundle bundle) {
        this.f12039a.f12016k.zza(new C4398u(this.f12039a));
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f12039a.f12007b.lock();
        try {
            if (this.f12039a.m14392a(connectionResult)) {
                this.f12039a.m14402d();
                this.f12039a.m14396b();
            } else {
                this.f12039a.m14397b(connectionResult);
            }
            this.f12039a.f12007b.unlock();
        } catch (Throwable th) {
            this.f12039a.f12007b.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
