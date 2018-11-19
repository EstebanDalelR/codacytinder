package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public final class ad implements Creator<zzabm> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        Bundle bundle = null;
        zzakd zzakd = bundle;
        ApplicationInfo applicationInfo = zzakd;
        String str = applicationInfo;
        List list = str;
        PackageInfo packageInfo = list;
        String str2 = packageInfo;
        String str3 = str2;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    bundle = oi.m20074n(parcel, readInt);
                    break;
                case 2:
                    zzakd = (zzakd) oi.m20057a(parcel, readInt, zzakd.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) oi.m20057a(parcel, readInt, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = oi.m20072l(parcel, readInt);
                    break;
                case 5:
                    list = oi.m20084x(parcel, readInt);
                    break;
                case 6:
                    packageInfo = (PackageInfo) oi.m20057a(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = oi.m20072l(parcel, readInt);
                    break;
                case 8:
                    z = oi.m20063c(parcel, readInt);
                    break;
                case 9:
                    str3 = oi.m20072l(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzabm(bundle, zzakd, applicationInfo, str, list, packageInfo, str2, z, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzabm[i];
    }
}
