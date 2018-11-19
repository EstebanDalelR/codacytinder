package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.auth.api.proxy.b */
public final class C2444b implements Creator<ProxyResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = pendingIntent;
        byte[] bArr = bundle;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 != AdError.NETWORK_ERROR_CODE) {
                switch (i4) {
                    case 1:
                        i2 = oi.e(parcel, readInt);
                        break;
                    case 2:
                        pendingIntent = (PendingIntent) oi.a(parcel, readInt, PendingIntent.CREATOR);
                        break;
                    case 3:
                        i3 = oi.e(parcel, readInt);
                        break;
                    case 4:
                        bundle = oi.n(parcel, readInt);
                        break;
                    case 5:
                        bArr = oi.o(parcel, readInt);
                        break;
                    default:
                        oi.b(parcel, readInt);
                        break;
                }
            }
            i = oi.e(parcel, readInt);
        }
        oi.A(parcel, a);
        return new ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }
}
