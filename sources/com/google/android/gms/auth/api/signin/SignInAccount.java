package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public class SignInAccount extends zzbfm implements ReflectedParcelable {
    public static final Creator<SignInAccount> CREATOR = new C2450f();
    @Deprecated
    private String zzauv;
    @Deprecated
    private String zzegs;
    private GoogleSignInAccount zzehv;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.zzehv = googleSignInAccount;
        this.zzegs = ad.m9048a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.zzauv = ad.m9048a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount getGoogleSignInAccount() {
        return this.zzehv;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 4, this.zzegs, false);
        oj.a(parcel, 7, this.zzehv, i, false);
        oj.a(parcel, 8, this.zzauv, false);
        oj.a(parcel, a);
    }
}
