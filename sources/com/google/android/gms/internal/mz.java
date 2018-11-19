package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.C2422a.C4391a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C4295c;
import com.google.android.gms.common.internal.av;

public final class mz extends C4295c<zzawd> {
    @Nullable
    /* renamed from: d */
    private final C4391a f28803d;

    public mz(Context context, Looper looper, av avVar, C4391a c4391a, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, avVar, connectionCallbacks, onConnectionFailedListener);
        this.f28803d = c4391a;
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface m34023a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zzawd ? (zzawd) queryLocalInterface : new nd(iBinder);
    }

    /* renamed from: a */
    protected final String m34024a() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* renamed from: b */
    protected final String m34025b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* renamed from: c */
    final C4391a m34026c() {
        return this.f28803d;
    }

    /* renamed from: k */
    protected final Bundle m34027k() {
        return this.f28803d == null ? new Bundle() : this.f28803d.b();
    }
}
