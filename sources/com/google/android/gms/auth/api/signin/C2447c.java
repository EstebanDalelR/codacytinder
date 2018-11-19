package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.oi;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public final class C2447c implements Creator<GoogleSignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = oi.a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        Uri uri = str4;
        String str5 = uri;
        String str6 = str5;
        List list = str6;
        String str7 = list;
        String str8 = str7;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel2, readInt);
                    break;
                case 2:
                    str = oi.l(parcel2, readInt);
                    break;
                case 3:
                    str2 = oi.l(parcel2, readInt);
                    break;
                case 4:
                    str3 = oi.l(parcel2, readInt);
                    break;
                case 5:
                    str4 = oi.l(parcel2, readInt);
                    break;
                case 6:
                    uri = (Uri) oi.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = oi.l(parcel2, readInt);
                    break;
                case 8:
                    j = oi.f(parcel2, readInt);
                    break;
                case 9:
                    str6 = oi.l(parcel2, readInt);
                    break;
                case 10:
                    list = oi.c(parcel2, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = oi.l(parcel2, readInt);
                    break;
                case 12:
                    str8 = oi.l(parcel2, readInt);
                    break;
                default:
                    oi.b(parcel2, readInt);
                    break;
            }
        }
        oi.A(parcel2, a);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
