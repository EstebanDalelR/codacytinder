package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class px extends aau implements zzcay {
    px(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    public final boolean getBooleanFlagValue(String str, boolean z, int i) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        aaw.m18806a(a, z);
        a.writeInt(i);
        Parcel a2 = m18800a(2, a);
        z = aaw.m18807a(a2);
        a2.recycle();
        return z;
    }

    public final int getIntFlagValue(String str, int i, int i2) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        a.writeInt(i);
        a.writeInt(i2);
        Parcel a2 = m18800a(3, a);
        i = a2.readInt();
        a2.recycle();
        return i;
    }

    public final long getLongFlagValue(String str, long j, int i) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        a.writeLong(j);
        a.writeInt(i);
        Parcel a2 = m18800a(4, a);
        j = a2.readLong();
        a2.recycle();
        return j;
    }

    public final String getStringFlagValue(String str, String str2, int i) throws RemoteException {
        Parcel a = m18799a();
        a.writeString(str);
        a.writeString(str2);
        a.writeInt(i);
        Parcel a2 = m18800a(5, a);
        str2 = a2.readString();
        a2.recycle();
        return str2;
    }

    public final void init(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = m18799a();
        aaw.m18804a(a, (IInterface) iObjectWrapper);
        m18801b(1, a);
    }
}
