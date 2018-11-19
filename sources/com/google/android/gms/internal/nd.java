package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public final class nd extends aau implements zzawd {
    nd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zza(zzawb zzawb) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzawb);
        m18801b(4, a);
    }

    public final void zza(zzawb zzawb, CredentialRequest credentialRequest) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzawb);
        aaw.m18805a(a, (Parcelable) credentialRequest);
        m18801b(1, a);
    }

    public final void zza(zzawb zzawb, zzavz zzavz) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzawb);
        aaw.m18805a(a, (Parcelable) zzavz);
        m18801b(3, a);
    }

    public final void zza(zzawb zzawb, zzawf zzawf) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzawb);
        aaw.m18805a(a, (Parcelable) zzawf);
        m18801b(2, a);
    }
}
