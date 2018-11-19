package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.s */
public final class C4475s implements Creator<zzaat> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = oi.m20055a(parcel);
        long j = 0;
        long j2 = j;
        Bundle bundle = null;
        zzjj zzjj = bundle;
        zzjn zzjn = zzjj;
        String str = zzjn;
        ApplicationInfo applicationInfo = str;
        PackageInfo packageInfo = applicationInfo;
        String str2 = packageInfo;
        String str3 = str2;
        String str4 = str3;
        zzakd zzakd = str4;
        Bundle bundle2 = zzakd;
        List list = bundle2;
        Bundle bundle3 = list;
        String str5 = bundle3;
        String str6 = str5;
        List list2 = str6;
        String str7 = list2;
        zzpe zzpe = str7;
        List list3 = zzpe;
        String str8 = list3;
        String str9 = str8;
        String str10 = str9;
        Bundle bundle4 = str10;
        String str11 = bundle4;
        zzlr zzlr = str11;
        Bundle bundle5 = zzlr;
        String str12 = bundle5;
        String str13 = str12;
        String str14 = str13;
        List list4 = str14;
        String str15 = list4;
        List list5 = str15;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.m20065e(parcel2, readInt);
                    break;
                case 2:
                    bundle = oi.m20074n(parcel2, readInt);
                    break;
                case 3:
                    zzjj = (zzjj) oi.m20057a(parcel2, readInt, zzjj.CREATOR);
                    break;
                case 4:
                    zzjn = (zzjn) oi.m20057a(parcel2, readInt, zzjn.CREATOR);
                    break;
                case 5:
                    str = oi.m20072l(parcel2, readInt);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) oi.m20057a(parcel2, readInt, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) oi.m20057a(parcel2, readInt, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = oi.m20072l(parcel2, readInt);
                    break;
                case 9:
                    str3 = oi.m20072l(parcel2, readInt);
                    break;
                case 10:
                    str4 = oi.m20072l(parcel2, readInt);
                    break;
                case 11:
                    zzakd = (zzakd) oi.m20057a(parcel2, readInt, zzakd.CREATOR);
                    break;
                case 12:
                    bundle2 = oi.m20074n(parcel2, readInt);
                    break;
                case 13:
                    i2 = oi.m20065e(parcel2, readInt);
                    break;
                case 14:
                    list = oi.m20084x(parcel2, readInt);
                    break;
                case 15:
                    bundle3 = oi.m20074n(parcel2, readInt);
                    break;
                case 16:
                    z = oi.m20063c(parcel2, readInt);
                    break;
                case 18:
                    i3 = oi.m20065e(parcel2, readInt);
                    break;
                case 19:
                    i4 = oi.m20065e(parcel2, readInt);
                    break;
                case 20:
                    f = oi.m20069i(parcel2, readInt);
                    break;
                case 21:
                    str5 = oi.m20072l(parcel2, readInt);
                    break;
                case 25:
                    j = oi.m20066f(parcel2, readInt);
                    break;
                case 26:
                    str6 = oi.m20072l(parcel2, readInt);
                    break;
                case 27:
                    list2 = oi.m20084x(parcel2, readInt);
                    break;
                case 28:
                    str7 = oi.m20072l(parcel2, readInt);
                    break;
                case 29:
                    zzpe = (zzpe) oi.m20057a(parcel2, readInt, zzpe.CREATOR);
                    break;
                case 30:
                    list3 = oi.m20084x(parcel2, readInt);
                    break;
                case 31:
                    j2 = oi.m20066f(parcel2, readInt);
                    break;
                case 33:
                    str8 = oi.m20072l(parcel2, readInt);
                    break;
                case 34:
                    f2 = oi.m20069i(parcel2, readInt);
                    break;
                case 35:
                    i5 = oi.m20065e(parcel2, readInt);
                    break;
                case 36:
                    i6 = oi.m20065e(parcel2, readInt);
                    break;
                case 37:
                    z3 = oi.m20063c(parcel2, readInt);
                    break;
                case 38:
                    z4 = oi.m20063c(parcel2, readInt);
                    break;
                case 39:
                    str9 = oi.m20072l(parcel2, readInt);
                    break;
                case 40:
                    z2 = oi.m20063c(parcel2, readInt);
                    break;
                case 41:
                    str10 = oi.m20072l(parcel2, readInt);
                    break;
                case 42:
                    z5 = oi.m20063c(parcel2, readInt);
                    break;
                case 43:
                    i7 = oi.m20065e(parcel2, readInt);
                    break;
                case 44:
                    bundle4 = oi.m20074n(parcel2, readInt);
                    break;
                case 45:
                    str11 = oi.m20072l(parcel2, readInt);
                    break;
                case 46:
                    zzlr = (zzlr) oi.m20057a(parcel2, readInt, zzlr.CREATOR);
                    break;
                case 47:
                    z6 = oi.m20063c(parcel2, readInt);
                    break;
                case 48:
                    bundle5 = oi.m20074n(parcel2, readInt);
                    break;
                case 49:
                    str12 = oi.m20072l(parcel2, readInt);
                    break;
                case 50:
                    str13 = oi.m20072l(parcel2, readInt);
                    break;
                case 51:
                    str14 = oi.m20072l(parcel2, readInt);
                    break;
                case 52:
                    z7 = oi.m20063c(parcel2, readInt);
                    break;
                case 53:
                    list4 = oi.m20083w(parcel2, readInt);
                    break;
                case 54:
                    str15 = oi.m20072l(parcel2, readInt);
                    break;
                case 55:
                    list5 = oi.m20084x(parcel2, readInt);
                    break;
                case 56:
                    i8 = oi.m20065e(parcel2, readInt);
                    break;
                case 57:
                    z8 = oi.m20063c(parcel2, readInt);
                    break;
                case 58:
                    z9 = oi.m20063c(parcel2, readInt);
                    break;
                case 59:
                    z10 = oi.m20063c(parcel2, readInt);
                    break;
                default:
                    oi.m20060b(parcel2, readInt);
                    break;
            }
        }
        oi.m20054A(parcel2, a);
        return new zzaat(i, bundle, zzjj, zzjn, str, applicationInfo, packageInfo, str2, str3, str4, zzakd, bundle2, i2, list, bundle3, z, i3, i4, f, str5, j, str6, list2, str7, zzpe, list3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, zzlr, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i8, z8, z9, z10);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaat[i];
    }
}
