package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public final class ajk extends aau implements zzkn {
    ajk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) publisherAdViewOptions);
        m18801b(9, a);
    }

    public final void zza(zzpe zzpe) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) zzpe);
        m18801b(6, a);
    }

    public final void zza(zzqq zzqq) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzqq);
        m18801b(3, a);
    }

    public final void zza(zzqt zzqt) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzqt);
        m18801b(4, a);
    }

    public final void zza(zzrc zzrc) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzrc);
        m18801b(10, a);
    }

    public final void zza(zzrf zzrf, zzjn zzjn) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzrf);
        aaw.m18805a(a, (Parcelable) zzjn);
        m18801b(8, a);
    }

    public final void zza(String str, zzqz zzqz, zzqw zzqw) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        aaw.m18804a(a, (IInterface) zzqz);
        aaw.m18804a(a, (IInterface) zzqw);
        m18801b(5, a);
    }

    public final void zzb(zzkh zzkh) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzkh);
        m18801b(2, a);
    }

    public final void zzb(zzld zzld) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzld);
        m18801b(7, a);
    }

    public final zzkk zzdi() throws RemoteException {
        zzkk zzkk;
        Parcel a = m18800a(1, m18799a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzkk = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzkk = queryLocalInterface instanceof zzkk ? (zzkk) queryLocalInterface : new aji(readStrongBinder);
        }
        a.recycle();
        return zzkk;
    }
}
