package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.exoplayer2.Format;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.location.r */
public final class C4498r implements Creator<zze> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = oi.m20055a(parcel);
        long j = 50;
        long j2 = Format.OFFSET_SAMPLE_RELATIVE;
        boolean z = true;
        float f = 0.0f;
        int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = oi.m20063c(parcel2, readInt);
                    break;
                case 2:
                    j = oi.m20066f(parcel2, readInt);
                    break;
                case 3:
                    f = oi.m20069i(parcel2, readInt);
                    break;
                case 4:
                    j2 = oi.m20066f(parcel2, readInt);
                    break;
                case 5:
                    i = oi.m20065e(parcel2, readInt);
                    break;
                default:
                    oi.m20060b(parcel2, readInt);
                    break;
            }
        }
        oi.m20054A(parcel2, a);
        return new zze(z, j, f, j2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
