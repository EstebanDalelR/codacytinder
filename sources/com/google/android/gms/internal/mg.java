package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C4295c;
import com.google.android.gms.common.internal.av;

public final class mg extends C4295c<zzauu> {
    public mg(Context context, Looper looper, av avVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 74, avVar, connectionCallbacks, onConnectionFailedListener);
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface m34018a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
        return queryLocalInterface instanceof zzauu ? (zzauu) queryLocalInterface : new mh(iBinder);
    }

    @NonNull
    /* renamed from: a */
    protected final String m34019a() {
        return "com.google.android.gms.auth.api.accountactivationstate.START";
    }

    @NonNull
    /* renamed from: b */
    protected final String m34020b() {
        return "com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService";
    }
}
