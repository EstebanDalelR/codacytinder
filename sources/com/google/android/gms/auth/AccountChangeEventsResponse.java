package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.List;

public class AccountChangeEventsResponse extends zzbfm {
    public static final Creator<AccountChangeEventsResponse> CREATOR = new C2459c();
    private int mVersion;
    private List<AccountChangeEvent> zzapa;

    AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.mVersion = i;
        this.zzapa = (List) ad.m9045a((Object) list);
    }

    public AccountChangeEventsResponse(List<AccountChangeEvent> list) {
        this.mVersion = 1;
        this.zzapa = (List) ad.m9045a((Object) list);
    }

    public List<AccountChangeEvent> getEvents() {
        return this.zzapa;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = oj.a(parcel);
        oj.a(parcel, 1, this.mVersion);
        oj.c(parcel, 2, this.zzapa, false);
        oj.a(parcel, i);
    }
}
