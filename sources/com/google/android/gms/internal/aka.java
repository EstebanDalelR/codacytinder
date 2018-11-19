package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class aka extends aau implements zzll {
    aka(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final float getAspectRatio() throws RemoteException {
        Parcel a = m18800a(9, m18799a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final int getPlaybackState() throws RemoteException {
        Parcel a = m18800a(5, m18799a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final boolean isClickToExpandEnabled() throws RemoteException {
        Parcel a = m18800a(12, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final boolean isCustomControlsEnabled() throws RemoteException {
        Parcel a = m18800a(10, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final boolean isMuted() throws RemoteException {
        Parcel a = m18800a(4, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final void mute(boolean z) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18806a(a, z);
        m18801b(3, a);
    }

    public final void pause() throws RemoteException {
        m18801b(2, m18799a());
    }

    public final void play() throws RemoteException {
        m18801b(1, m18799a());
    }

    public final void zza(zzlo zzlo) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) zzlo);
        m18801b(8, a);
    }

    public final float zzih() throws RemoteException {
        Parcel a = m18800a(6, m18799a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float zzii() throws RemoteException {
        Parcel a = m18800a(7, m18799a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final zzlo zzij() throws RemoteException {
        zzlo zzlo;
        Parcel a = m18800a(11, m18799a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzlo = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzlo = queryLocalInterface instanceof zzlo ? (zzlo) queryLocalInterface : new akc(readStrongBinder);
        }
        a.recycle();
        return zzlo;
    }
}
