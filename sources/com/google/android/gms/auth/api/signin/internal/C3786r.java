package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.aau;
import com.google.android.gms.internal.aaw;

/* renamed from: com.google.android.gms.auth.api.signin.internal.r */
public final class C3786r extends aau implements zzu {
    C3786r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zza(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel a = a();
        aaw.a(a, zzs);
        aaw.a(a, googleSignInOptions);
        b(101, a);
    }

    public final void zzb(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel a = a();
        aaw.a(a, zzs);
        aaw.a(a, googleSignInOptions);
        b(102, a);
    }

    public final void zzc(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel a = a();
        aaw.a(a, zzs);
        aaw.a(a, googleSignInOptions);
        b(103, a);
    }
}
