package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;
import java.util.List;

public final class aob extends aau implements zzqi {
    aob(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    public final void destroy() throws RemoteException {
        m18801b(10, m18799a());
    }

    public final String getAdvertiser() throws RemoteException {
        Parcel a = m18800a(8, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String getBody() throws RemoteException {
        Parcel a = m18800a(5, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String getCallToAction() throws RemoteException {
        Parcel a = m18800a(7, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final Bundle getExtras() throws RemoteException {
        Parcel a = m18800a(9, m18799a());
        Bundle bundle = (Bundle) aaw.m18803a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final String getHeadline() throws RemoteException {
        Parcel a = m18800a(3, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final List getImages() throws RemoteException {
        Parcel a = m18800a(4, m18799a());
        List b = aaw.m18808b(a);
        a.recycle();
        return b;
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel a = m18800a(17, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final zzll getVideoController() throws RemoteException {
        Parcel a = m18800a(11, m18799a());
        zzll a2 = ajz.m27113a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void performClick(Bundle bundle) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) bundle);
        m18801b(12, a);
    }

    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) bundle);
        Parcel a2 = m18800a(13, a);
        boolean a3 = aaw.m18807a(a2);
        a2.recycle();
        return a3;
    }

    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18805a(a, (Parcelable) bundle);
        m18801b(14, a);
    }

    public final IObjectWrapper zzjt() throws RemoteException {
        Parcel a = m18800a(2, m18799a());
        IObjectWrapper a2 = C3828a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final IObjectWrapper zzjx() throws RemoteException {
        Parcel a = m18800a(16, m18799a());
        IObjectWrapper a2 = C3828a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final zzpm zzjy() throws RemoteException {
        zzpm zzpm;
        Parcel a = m18800a(15, m18799a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzpm = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzpm = queryLocalInterface instanceof zzpm ? (zzpm) queryLocalInterface : new anm(readStrongBinder);
        }
        a.recycle();
        return zzpm;
    }

    public final zzpq zzjz() throws RemoteException {
        zzpq zzpq;
        Parcel a = m18800a(6, m18799a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            zzpq = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzpq = queryLocalInterface instanceof zzpq ? (zzpq) queryLocalInterface : new anp(readStrongBinder);
        }
        a.recycle();
        return zzpq;
    }
}
