package com.google.android.gms.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;

public final class anp extends aau implements zzpq {
    anp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final double getScale() throws RemoteException {
        Parcel a = m18800a(3, m18799a());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    public final Uri getUri() throws RemoteException {
        Parcel a = m18800a(2, m18799a());
        Uri uri = (Uri) aaw.m18803a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    public final IObjectWrapper zzjr() throws RemoteException {
        Parcel a = m18800a(1, m18799a());
        IObjectWrapper a2 = C3828a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
