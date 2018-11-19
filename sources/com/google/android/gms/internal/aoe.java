package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C3828a;
import java.util.List;

public final class aoe extends aau implements zzqm {
    aoe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final void destroy() throws RemoteException {
        m18801b(8, m18799a());
    }

    public final List<String> getAvailableAssetNames() throws RemoteException {
        Parcel a = m18800a(3, m18799a());
        List createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    public final String getCustomTemplateId() throws RemoteException {
        Parcel a = m18800a(4, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final zzll getVideoController() throws RemoteException {
        Parcel a = m18800a(7, m18799a());
        zzll a2 = ajz.m27113a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void performClick(String str) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        m18801b(5, a);
    }

    public final void recordImpression() throws RemoteException {
        m18801b(6, m18799a());
    }

    public final String zzap(String str) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        Parcel a2 = m18800a(1, a);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final zzpq zzaq(String str) throws RemoteException {
        zzpq zzpq;
        Parcel a = m18799a();
        a.writeString(str);
        Parcel a2 = m18800a(2, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            zzpq = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzpq = queryLocalInterface instanceof zzpq ? (zzpq) queryLocalInterface : new anp(readStrongBinder);
        }
        a2.recycle();
        return zzpq;
    }

    public final boolean zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        Parcel a2 = m18800a(10, a);
        boolean a3 = aaw.m18807a(a2);
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zzjt() throws RemoteException {
        Parcel a = m18800a(11, m18799a());
        IObjectWrapper a2 = C3828a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final IObjectWrapper zzka() throws RemoteException {
        Parcel a = m18800a(9, m18799a());
        IObjectWrapper a2 = C3828a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
