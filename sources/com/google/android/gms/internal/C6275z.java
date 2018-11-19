package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.z */
public final class C6275z extends aau implements zzabe {
    C6275z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    public final void zza(zzaax zzaax) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzaax);
        m18801b(1, a);
    }
}
