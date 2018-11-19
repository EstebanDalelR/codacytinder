package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.credentials.a */
public final class C2432a implements Creator<Credential> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = null;
        String str2 = str;
        Uri uri = str2;
        List list = uri;
        String str3 = list;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = oi.l(parcel, readInt);
                    break;
                case 2:
                    str2 = oi.l(parcel, readInt);
                    break;
                case 3:
                    uri = (Uri) oi.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    list = oi.c(parcel, readInt, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = oi.l(parcel, readInt);
                    break;
                case 6:
                    str4 = oi.l(parcel, readInt);
                    break;
                case 7:
                    str5 = oi.l(parcel, readInt);
                    break;
                case 8:
                    str6 = oi.l(parcel, readInt);
                    break;
                case 9:
                    str7 = oi.l(parcel, readInt);
                    break;
                case 10:
                    str8 = oi.l(parcel, readInt);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new Credential(str, str2, uri, list, str3, str4, str5, str6, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }
}
