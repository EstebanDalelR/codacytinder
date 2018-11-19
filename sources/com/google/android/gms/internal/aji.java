package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class aji extends aau implements zzkk {
    aji(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel a = m18800a(2, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean isLoading() throws RemoteException {
        Parcel a = m18800a(3, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final void zza(zzjj zzjj, int i) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzjj);
        a.writeInt(i);
        m18801b(5, a);
    }

    public final String zzcp() throws RemoteException {
        Parcel a = m18800a(4, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void zzd(zzjj zzjj) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzjj);
        m18801b(1, a);
    }
}
