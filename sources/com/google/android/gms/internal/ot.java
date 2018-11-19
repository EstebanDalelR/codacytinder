package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C4295c;
import com.google.android.gms.common.internal.av;

public final class ot extends C4295c<zzbge> {
    public ot(Context context, Looper looper, av avVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 39, avVar, connectionCallbacks, onConnectionFailedListener);
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface m34038a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return queryLocalInterface instanceof zzbge ? (zzbge) queryLocalInterface : new ov(iBinder);
    }

    /* renamed from: a */
    public final String m34039a() {
        return "com.google.android.gms.common.service.START";
    }

    /* renamed from: b */
    protected final String m34040b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }
}
