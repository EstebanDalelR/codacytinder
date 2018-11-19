package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class nc extends aav implements zzawb {
    public nc() {
        attachInterface(this, "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                zza((Status) aaw.m18803a(parcel, Status.CREATOR), (Credential) aaw.m18803a(parcel, Credential.CREATOR));
                break;
            case 2:
                zze((Status) aaw.m18803a(parcel, Status.CREATOR));
                break;
            case 3:
                zza((Status) aaw.m18803a(parcel, Status.CREATOR), parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
