package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class aty extends aau implements zzxe {
    aty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
        Parcel a = m18799a();
        a.writeInt(i);
        a.writeInt(i2);
        aaw.m18805a(a, (Parcelable) intent);
        m18801b(12, a);
    }

    public final void onBackPressed() throws RemoteException {
        m18801b(10, m18799a());
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) bundle);
        m18801b(1, a);
    }

    public final void onDestroy() throws RemoteException {
        m18801b(8, m18799a());
    }

    public final void onPause() throws RemoteException {
        m18801b(5, m18799a());
    }

    public final void onRestart() throws RemoteException {
        m18801b(2, m18799a());
    }

    public final void onResume() throws RemoteException {
        m18801b(4, m18799a());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) bundle);
        a = m18800a(6, a);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    public final void onStart() throws RemoteException {
        m18801b(3, m18799a());
    }

    public final void onStop() throws RemoteException {
        m18801b(7, m18799a());
    }

    public final void zzbf() throws RemoteException {
        m18801b(9, m18799a());
    }

    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(13, a);
    }

    public final boolean zzmu() throws RemoteException {
        Parcel a = m18800a(11, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }
}
