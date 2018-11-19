package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C4295c;
import com.google.android.gms.common.internal.av;

public class ql extends C4295c<zzcez> {
    /* renamed from: d */
    protected final zzcfu<zzcez> f28807d = new qm(this);
    /* renamed from: e */
    private final String f28808e;

    public ql(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, av avVar) {
        super(context, looper, 23, avVar, connectionCallbacks, onConnectionFailedListener);
        this.f28808e = str;
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface m34042a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzcez ? (zzcez) queryLocalInterface : new rn(iBinder);
    }

    /* renamed from: a */
    protected final String m34043a() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: b */
    protected final String m34044b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* renamed from: k */
    protected final Bundle m34045k() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f28808e);
        return bundle;
    }
}
