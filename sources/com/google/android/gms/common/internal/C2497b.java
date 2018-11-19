package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.common.internal.b */
public final class C2497b implements Creator<zzz> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = null;
        IBinder iBinder = str;
        Scope[] scopeArr = iBinder;
        Bundle bundle = scopeArr;
        Account account = bundle;
        zzc[] zzcArr = account;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    break;
                case 2:
                    i2 = oi.e(parcel, readInt);
                    break;
                case 3:
                    i3 = oi.e(parcel, readInt);
                    break;
                case 4:
                    str = oi.l(parcel, readInt);
                    break;
                case 5:
                    iBinder = oi.m(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) oi.b(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = oi.n(parcel, readInt);
                    break;
                case 8:
                    account = (Account) oi.a(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    zzcArr = (zzc[]) oi.b(parcel, readInt, zzc.CREATOR);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new zzz(i, i2, i3, str, iBinder, scopeArr, bundle, account, zzcArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
