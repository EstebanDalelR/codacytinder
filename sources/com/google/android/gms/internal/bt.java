package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class bt extends aau implements zzadh {
    bt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final int getAmount() throws RemoteException {
        Parcel a = m18800a(2, m18799a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final String getType() throws RemoteException {
        Parcel a = m18800a(1, m18799a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
