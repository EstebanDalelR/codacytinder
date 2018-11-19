package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.oi;
import java.util.List;

/* renamed from: com.google.android.gms.location.o */
public final class C4494o implements Creator<ActivityRecognitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.m20055a(parcel);
        long j = 0;
        long j2 = j;
        List list = null;
        Bundle bundle = list;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    list = oi.m20062c(parcel, readInt, DetectedActivity.CREATOR);
                    break;
                case 2:
                    j = oi.m20066f(parcel, readInt);
                    break;
                case 3:
                    j2 = oi.m20066f(parcel, readInt);
                    break;
                case 4:
                    i = oi.m20065e(parcel, readInt);
                    break;
                case 5:
                    bundle = oi.m20074n(parcel, readInt);
                    break;
                default:
                    oi.m20060b(parcel, readInt);
                    break;
            }
        }
        oi.m20054A(parcel, a);
        return new ActivityRecognitionResult(list, j, j2, i, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
