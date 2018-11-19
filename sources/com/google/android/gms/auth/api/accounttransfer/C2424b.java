package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.b */
public final class C2424b implements Creator<zzp> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        List list = null;
        List list2 = list;
        List list3 = list2;
        List list4 = list3;
        List list5 = list4;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = oi.e(parcel, readInt);
                    break;
                case 2:
                    list = oi.x(parcel, readInt);
                    break;
                case 3:
                    list2 = oi.x(parcel, readInt);
                    break;
                case 4:
                    list3 = oi.x(parcel, readInt);
                    break;
                case 5:
                    list4 = oi.x(parcel, readInt);
                    break;
                case 6:
                    list5 = oi.x(parcel, readInt);
                    break;
                default:
                    oi.b(parcel, readInt);
                    break;
            }
        }
        oi.A(parcel, a);
        return new zzp(i, list, list2, list3, list4, list5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzp[i];
    }
}
