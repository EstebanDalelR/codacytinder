package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;

public abstract class cq extends aav implements zzaem {
    public cq() {
        attachInterface(this, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    /* renamed from: a */
    public static zzaem m27274a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof zzaem ? (zzaem) queryLocalInterface : new cr(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                zzm(C3828a.a(parcel.readStrongBinder()));
                break;
            case 2:
                zzc(C3828a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                zzn(C3828a.a(parcel.readStrongBinder()));
                break;
            case 4:
                zzo(C3828a.a(parcel.readStrongBinder()));
                break;
            case 5:
                zzp(C3828a.a(parcel.readStrongBinder()));
                break;
            case 6:
                zzq(C3828a.a(parcel.readStrongBinder()));
                break;
            case 7:
                zza(C3828a.a(parcel.readStrongBinder()), (zzaeq) aaw.m18803a(parcel, zzaeq.CREATOR));
                break;
            case 8:
                zzr(C3828a.a(parcel.readStrongBinder()));
                break;
            case 9:
                zzd(C3828a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                zzs(C3828a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
