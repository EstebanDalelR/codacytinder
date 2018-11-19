package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.x */
public final class C6273x extends aau implements zzabb {
    C6273x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void zza(zzaat zzaat, zzabe zzabe) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzaat);
        aaw.m18804a(a, (IInterface) zzabe);
        m18801b(2, a);
    }

    public final void zza(zzabm zzabm, zzabh zzabh) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzabm);
        aaw.m18804a(a, (IInterface) zzabh);
        m18801b(4, a);
    }

    public final zzaax zzb(zzaat zzaat) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzaat);
        Parcel a2 = m18800a(1, a);
        zzaax zzaax = (zzaax) aaw.m18803a(a2, zzaax.CREATOR);
        a2.recycle();
        return zzaax;
    }
}
