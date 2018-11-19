package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

public abstract class ajj extends aav implements zzkn {
    public ajj() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        zzkh zzkh = null;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                IInterface zzdi = zzdi();
                parcel2.writeNoException();
                aaw.m18804a(parcel2, zzdi);
                return true;
            case 2:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzkh = queryLocalInterface instanceof zzkh ? (zzkh) queryLocalInterface : new ajg(readStrongBinder);
                }
                zzb(zzkh);
                break;
            case 3:
                zza(aog.m27167a(parcel.readStrongBinder()));
                break;
            case 4:
                zza(aoi.m27168a(parcel.readStrongBinder()));
                break;
            case 5:
                zza(parcel.readString(), aon.m27170a(parcel.readStrongBinder()), aok.m27169a(parcel.readStrongBinder()));
                break;
            case 6:
                zza((zzpe) aaw.m18803a(parcel, zzpe.CREATOR));
                break;
            case 7:
                zzld ajv;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    ajv = queryLocalInterface instanceof zzld ? (zzld) queryLocalInterface : new ajv(readStrongBinder);
                }
                zzb(ajv);
                break;
            case 8:
                zza(aor.m27172a(parcel.readStrongBinder()), (zzjn) aaw.m18803a(parcel, zzjn.CREATOR));
                break;
            case 9:
                zza((PublisherAdViewOptions) aaw.m18803a(parcel, PublisherAdViewOptions.CREATOR));
                break;
            case 10:
                zza(aop.m27171a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
