package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.auth.api.signin.internal.t */
public final class C2455t implements Creator<SignInConfiguration> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = oi.l(parcel, readInt);
            } else if (i != 5) {
                oi.b(parcel, readInt);
            } else {
                googleSignInOptions = (GoogleSignInOptions) oi.a(parcel, readInt, GoogleSignInOptions.CREATOR);
            }
        }
        oi.A(parcel, a);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
