package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;

public abstract class atx extends aav implements zzxe {
    public atx() {
        attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: a */
    public static zzxe m27254a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof zzxe ? (zzxe) queryLocalInterface : new aty(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                onCreate((Bundle) aaw.m18803a(parcel, Bundle.CREATOR));
                break;
            case 2:
                onRestart();
                break;
            case 3:
                onStart();
                break;
            case 4:
                onResume();
                break;
            case 5:
                onPause();
                break;
            case 6:
                Bundle bundle = (Bundle) aaw.m18803a(parcel, Bundle.CREATOR);
                onSaveInstanceState(bundle);
                parcel2.writeNoException();
                aaw.m18809b(parcel2, bundle);
                return true;
            case 7:
                onStop();
                break;
            case 8:
                onDestroy();
                break;
            case 9:
                zzbf();
                break;
            case 10:
                onBackPressed();
                break;
            case 11:
                boolean zzmu = zzmu();
                parcel2.writeNoException();
                aaw.m18806a(parcel2, zzmu);
                return true;
            case 12:
                onActivityResult(parcel.readInt(), parcel.readInt(), (Intent) aaw.m18803a(parcel, Intent.CREATOR));
                break;
            case 13:
                zzk(C3828a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
