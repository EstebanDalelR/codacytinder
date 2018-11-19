package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.oi;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.e */
public final class C2449e implements Creator<GoogleSignInOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        ArrayList arrayList = null;
        Account account = arrayList;
        String str = account;
        String str2 = str;
        ArrayList arrayList2 = str2;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    break;
                case 2:
                    arrayList = oi.c(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) oi.a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = oi.c(parcel, readInt);
                    break;
                case 5:
                    z2 = oi.c(parcel, readInt);
                    break;
                case 6:
                    z3 = oi.c(parcel, readInt);
                    break;
                case 7:
                    str = oi.l(parcel, readInt);
                    break;
                case 8:
                    str2 = oi.l(parcel, readInt);
                    break;
                case 9:
                    arrayList2 = oi.c(parcel, readInt, zzn.CREATOR);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
