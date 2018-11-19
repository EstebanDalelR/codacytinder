package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;

public abstract class aor extends aav implements zzrf {
    /* renamed from: a */
    public static zzrf m27172a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof zzrf ? (zzrf) queryLocalInterface : new aos(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        zza(ajm.m27111a(parcel.readStrongBinder()), C3828a.a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
