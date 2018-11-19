package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C2490g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public final class zzz extends zzbfm {
    public static final Creator<zzz> CREATOR = new C2497b();
    private int version;
    private int zzfzr;
    private int zzfzs;
    String zzfzt;
    IBinder zzfzu;
    Scope[] zzfzv;
    Bundle zzfzw;
    Account zzfzx;
    zzc[] zzfzy;

    public zzz(int i) {
        this.version = 3;
        this.zzfzs = C2490g.f7554b;
        this.zzfzr = i;
    }

    zzz(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, zzc[] zzcArr) {
        this.version = i;
        this.zzfzr = i2;
        this.zzfzs = i3;
        if ("com.google.android.gms".equals(str)) {
            this.zzfzt = "com.google.android.gms";
        } else {
            this.zzfzt = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                zzan c3821o;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    c3821o = queryLocalInterface instanceof zzan ? (zzan) queryLocalInterface : new C3821o(iBinder);
                }
                account2 = C4294a.m17251a(c3821o);
            }
            this.zzfzx = account2;
        } else {
            this.zzfzu = iBinder;
            this.zzfzx = account;
        }
        this.zzfzv = scopeArr;
        this.zzfzw = bundle;
        this.zzfzy = zzcArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, this.version);
        oj.a(parcel, 2, this.zzfzr);
        oj.a(parcel, 3, this.zzfzs);
        oj.a(parcel, 4, this.zzfzt, false);
        oj.a(parcel, 5, this.zzfzu, false);
        oj.a(parcel, 6, this.zzfzv, i, false);
        oj.a(parcel, 7, this.zzfzw, false);
        oj.a(parcel, 8, this.zzfzx, i, false);
        oj.a(parcel, 10, this.zzfzy, i, false);
        oj.a(parcel, a);
    }
}
