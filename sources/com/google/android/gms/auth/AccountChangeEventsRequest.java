package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;

public class AccountChangeEventsRequest extends zzbfm {
    public static final Creator<AccountChangeEventsRequest> CREATOR = new C2458b();
    private int mVersion;
    @Deprecated
    private String zzebv;
    private int zzebx;
    private Account zzebz;

    public AccountChangeEventsRequest() {
        this.mVersion = 1;
    }

    AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.mVersion = i;
        this.zzebx = i2;
        this.zzebv = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.zzebz = account;
        } else {
            this.zzebz = new Account(str, "com.google");
        }
    }

    public Account getAccount() {
        return this.zzebz;
    }

    @Deprecated
    public String getAccountName() {
        return this.zzebv;
    }

    public int getEventIndex() {
        return this.zzebx;
    }

    public AccountChangeEventsRequest setAccount(Account account) {
        this.zzebz = account;
        return this;
    }

    @Deprecated
    public AccountChangeEventsRequest setAccountName(String str) {
        this.zzebv = str;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int i) {
        this.zzebx = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = oj.a(parcel);
        oj.a(parcel, 1, this.mVersion);
        oj.a(parcel, 2, this.zzebx);
        oj.a(parcel, 3, this.zzebv, false);
        oj.a(parcel, 4, this.zzebz, i, false);
        oj.a(parcel, a);
    }
}
