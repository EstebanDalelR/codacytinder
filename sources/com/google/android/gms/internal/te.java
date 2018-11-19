package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.C3787a;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.av;

final class te extends C3787a<tm, tg> {
    te() {
    }

    /* renamed from: a */
    public final /* synthetic */ zze m31663a(Context context, Looper looper, av avVar, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        tg tgVar = (tg) obj;
        if (tgVar == null) {
            tgVar = tg.f28809a;
        }
        return new tm(context, looper, true, avVar, tgVar, connectionCallbacks, onConnectionFailedListener);
    }
}
