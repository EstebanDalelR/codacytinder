package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public final class zzbr extends zzbfm {
    public static final Creator<zzbr> CREATOR = new ae();
    private final Account zzebz;
    private int zzeck;
    private final int zzgbl;
    private final GoogleSignInAccount zzgbm;

    zzbr(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.zzeck = i;
        this.zzebz = account;
        this.zzgbl = i2;
        this.zzgbm = googleSignInAccount;
    }

    public zzbr(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, this.zzeck);
        oj.a(parcel, 2, this.zzebz, i, false);
        oj.a(parcel, 3, this.zzgbl);
        oj.a(parcel, 4, this.zzgbm, i, false);
        oj.a(parcel, a);
    }
}
