package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.aav;
import com.google.android.gms.internal.aaw;

/* renamed from: com.google.android.gms.auth.api.signin.internal.q */
public abstract class C3785q extends aav implements zzs {
    public C3785q() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 101:
                zza((GoogleSignInAccount) aaw.a(parcel, GoogleSignInAccount.CREATOR), (Status) aaw.a(parcel, Status.CREATOR));
                break;
            case 102:
                zzi((Status) aaw.a(parcel, Status.CREATOR));
                break;
            case 103:
                zzj((Status) aaw.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
