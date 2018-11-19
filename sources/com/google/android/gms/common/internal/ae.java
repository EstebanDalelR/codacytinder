package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.oi;

public final class ae implements Creator<zzbr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    break;
                case 2:
                    account = (Account) oi.a(parcel, readInt, Account.CREATOR);
                    break;
                case 3:
                    i2 = oi.e(parcel, readInt);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) oi.a(parcel, readInt, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new zzbr(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbr[i];
    }
}
