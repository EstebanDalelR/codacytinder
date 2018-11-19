package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.auth.api.signin.f */
public final class C2450f implements Creator<SignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = "";
        String str2 = "";
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i != 4) {
                switch (i) {
                    case 7:
                        googleSignInAccount = (GoogleSignInAccount) oi.a(parcel, readInt, GoogleSignInAccount.CREATOR);
                        break;
                    case 8:
                        str2 = oi.l(parcel, readInt);
                        break;
                    default:
                        oi.b(parcel, readInt);
                        break;
                }
            }
            str = oi.l(parcel, readInt);
        }
        oi.A(parcel, a);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
