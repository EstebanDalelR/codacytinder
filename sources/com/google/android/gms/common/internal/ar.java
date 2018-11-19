package com.google.android.gms.common.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;

public final class ar implements zzj {
    /* renamed from: a */
    private /* synthetic */ al f12055a;

    public ar(al alVar) {
        this.f12055a = alVar;
    }

    public final void zzf(@NonNull ConnectionResult connectionResult) {
        if (connectionResult.isSuccess()) {
            this.f12055a.zza(null, this.f12055a.mo3585f());
            return;
        }
        if (this.f12055a.f7600v != null) {
            this.f12055a.f7600v.onConnectionFailed(connectionResult);
        }
    }
}
