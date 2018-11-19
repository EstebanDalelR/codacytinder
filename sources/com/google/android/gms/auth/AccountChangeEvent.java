package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2507w;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.util.Arrays;

public class AccountChangeEvent extends zzbfm {
    public static final Creator<AccountChangeEvent> CREATOR = new C2420a();
    private int mVersion;
    private long zzebu;
    private String zzebv;
    private int zzebw;
    private int zzebx;
    private String zzeby;

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.mVersion = i;
        this.zzebu = j;
        this.zzebv = (String) ad.m9045a((Object) str);
        this.zzebw = i2;
        this.zzebx = i3;
        this.zzeby = str2;
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.mVersion = 1;
        this.zzebu = j;
        this.zzebv = (String) ad.m9045a((Object) str);
        this.zzebw = i;
        this.zzebx = i2;
        this.zzeby = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            return this.mVersion == accountChangeEvent.mVersion && this.zzebu == accountChangeEvent.zzebu && C2507w.m9173a(this.zzebv, accountChangeEvent.zzebv) && this.zzebw == accountChangeEvent.zzebw && this.zzebx == accountChangeEvent.zzebx && C2507w.m9173a(this.zzeby, accountChangeEvent.zzeby);
        }
    }

    public String getAccountName() {
        return this.zzebv;
    }

    public String getChangeData() {
        return this.zzeby;
    }

    public int getChangeType() {
        return this.zzebw;
    }

    public int getEventIndex() {
        return this.zzebx;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mVersion), Long.valueOf(this.zzebu), this.zzebv, Integer.valueOf(this.zzebw), Integer.valueOf(this.zzebx), this.zzeby});
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.zzebw) {
            case 1:
                str = "ADDED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "RENAMED_FROM";
                break;
            case 4:
                str = "RENAMED_TO";
                break;
            default:
                break;
        }
        String str2 = this.zzebv;
        String str3 = this.zzeby;
        int i = this.zzebx;
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str2).length() + 91) + String.valueOf(str).length()) + String.valueOf(str3).length());
        stringBuilder.append("AccountChangeEvent {accountName = ");
        stringBuilder.append(str2);
        stringBuilder.append(", changeType = ");
        stringBuilder.append(str);
        stringBuilder.append(", changeData = ");
        stringBuilder.append(str3);
        stringBuilder.append(", eventIndex = ");
        stringBuilder.append(i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = oj.a(parcel);
        oj.a(parcel, 1, this.mVersion);
        oj.a(parcel, 2, this.zzebu);
        oj.a(parcel, 3, this.zzebv, false);
        oj.a(parcel, 4, this.zzebw);
        oj.a(parcel, 5, this.zzebx);
        oj.a(parcel, 6, this.zzeby, false);
        oj.a(parcel, i);
    }
}
