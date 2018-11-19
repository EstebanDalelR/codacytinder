package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C2441e;
import com.google.android.gms.auth.api.C4392g;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C4295c;
import com.google.android.gms.common.internal.av;

public final class ng extends C4295c<zzawl> {
    /* renamed from: d */
    private final Bundle f28804d;

    public ng(Context context, Looper looper, av avVar, C4392g c4392g, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 16, avVar, connectionCallbacks, onConnectionFailedListener);
        if (c4392g == null) {
            this.f28804d = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface m34028a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof zzawl ? (zzawl) queryLocalInterface : new ni(iBinder);
    }

    /* renamed from: a */
    protected final String m34029a() {
        return "com.google.android.gms.auth.service.START";
    }

    /* renamed from: b */
    protected final String m34030b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* renamed from: k */
    protected final Bundle m34031k() {
        return this.f28804d;
    }

    public final boolean zzaay() {
        av e = e();
        return (TextUtils.isEmpty(e.a()) || e.a(C2441e.f7379a).isEmpty()) ? false : true;
    }
}
