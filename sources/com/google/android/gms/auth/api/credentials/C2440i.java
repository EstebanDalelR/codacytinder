package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.credentials.i */
public final class C2440i implements Creator<PasswordSpecification> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = null;
        List list = str;
        List list2 = list;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = oi.l(parcel, readInt);
                    break;
                case 2:
                    list = oi.x(parcel, readInt);
                    break;
                case 3:
                    list2 = oi.w(parcel, readInt);
                    break;
                case 4:
                    i = oi.e(parcel, readInt);
                    break;
                case 5:
                    i2 = oi.e(parcel, readInt);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new PasswordSpecification(str, list, list2, i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PasswordSpecification[i];
    }
}
