package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;
import java.util.List;

public final class asg extends aau implements zzvj {
    asg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String getBody() throws RemoteException {
        Parcel a = m18800a(4, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String getCallToAction() throws RemoteException {
        Parcel a = m18800a(6, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel a = m18800a(15, m18799a());
        Bundle bundle = (Bundle) aaw.m18803a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final String getHeadline() throws RemoteException {
        Parcel a = m18800a(2, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List getImages() throws RemoteException {
        Parcel a = m18800a(3, m18799a());
        List b = aaw.m18808b(a);
        a.recycle();
        return b;
    }

    public final boolean getOverrideClickHandling() throws RemoteException {
        Parcel a = m18800a(14, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final boolean getOverrideImpressionRecording() throws RemoteException {
        Parcel a = m18800a(13, m18799a());
        boolean a2 = aaw.m18807a(a);
        a.recycle();
        return a2;
    }

    public final String getPrice() throws RemoteException {
        Parcel a = m18800a(9, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final double getStarRating() throws RemoteException {
        Parcel a = m18800a(7, m18799a());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    public final String getStore() throws RemoteException {
        Parcel a = m18800a(8, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final zzll getVideoController() throws RemoteException {
        Parcel a = m18800a(17, m18799a());
        zzll a2 = ajz.m27113a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void recordImpression() throws RemoteException {
        m18801b(10, m18799a());
    }

    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(11, a);
    }

    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(12, a);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(16, a);
    }

    public final zzpq zzjs() throws RemoteException {
        Parcel a = m18800a(5, m18799a());
        zzpq a2 = ano.m27158a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final IObjectWrapper zzjx() throws RemoteException {
        Parcel a = m18800a(21, m18799a());
        IObjectWrapper a2 = C3828a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final zzpm zzjy() throws RemoteException {
        Parcel a = m18800a(19, m18799a());
        zzpm a2 = anl.m27157a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final IObjectWrapper zzmk() throws RemoteException {
        Parcel a = m18800a(18, m18799a());
        IObjectWrapper a2 = C3828a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final IObjectWrapper zzml() throws RemoteException {
        Parcel a = m18800a(20, m18799a());
        IObjectWrapper a2 = C3828a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
