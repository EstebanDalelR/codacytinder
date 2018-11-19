package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.aav;

/* renamed from: com.google.android.gms.auth.api.signin.internal.p */
public abstract class C3784p extends aav implements zzq {
    public C3784p() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                zzabo();
                return true;
            case 2:
                zzabp();
                return true;
            default:
                return false;
        }
    }
}
