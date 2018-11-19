package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.zze;
import java.util.List;

public final class qo implements Creator<zzcdx> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        zze zze = zzcdx.zzikw;
        List list = zzcdx.zzikv;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    zze = (zze) oi.m20057a(parcel, readInt, zze.CREATOR);
                    break;
                case 2:
                    list = oi.m20062c(parcel, readInt, zzcdv.CREATOR);
                    break;
                case 3:
                    str = oi.m20072l(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new zzcdx(zze, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdx[i];
    }
}
