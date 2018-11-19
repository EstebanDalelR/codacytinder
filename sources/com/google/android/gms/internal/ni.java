package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public final class ni extends aau implements zzawl {
    ni(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zza(zzawj zzawj, ProxyRequest proxyRequest) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzawj);
        aaw.m18805a(a, (Parcelable) proxyRequest);
        m18801b(1, a);
    }
}
