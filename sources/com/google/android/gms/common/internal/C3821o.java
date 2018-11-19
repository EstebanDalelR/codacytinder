package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.aau;
import com.google.android.gms.internal.aaw;

/* renamed from: com.google.android.gms.common.internal.o */
public final class C3821o extends aau implements zzan {
    C3821o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account getAccount() throws RemoteException {
        Parcel a = a(2, a());
        Account account = (Account) aaw.a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
