package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.aav;
import com.google.android.gms.internal.aaw;

/* renamed from: com.google.android.gms.common.internal.p */
public abstract class C3822p extends aav implements zzat {
    public C3822p() {
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public static zzat m14459a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof zzat ? (zzat) queryLocalInterface : new C3823q(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                IInterface zzaga = zzaga();
                parcel2.writeNoException();
                aaw.a(parcel2, zzaga);
                return true;
            case 2:
                i = zzagb();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            default:
                return false;
        }
    }
}
