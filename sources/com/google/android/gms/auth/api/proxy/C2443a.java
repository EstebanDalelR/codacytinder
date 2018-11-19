package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.auth.api.proxy.a */
public final class C2443a implements Creator<ProxyRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String str = null;
        byte[] bArr = str;
        Bundle bundle = bArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 != AdError.NETWORK_ERROR_CODE) {
                switch (i3) {
                    case 1:
                        str = oi.l(parcel, readInt);
                        break;
                    case 2:
                        i2 = oi.e(parcel, readInt);
                        break;
                    case 3:
                        j = oi.f(parcel, readInt);
                        break;
                    case 4:
                        bArr = oi.o(parcel, readInt);
                        break;
                    case 5:
                        bundle = oi.n(parcel, readInt);
                        break;
                    default:
                        oi.b(parcel, readInt);
                        break;
                }
            }
            i = oi.e(parcel, readInt);
        }
        oi.A(parcel, a);
        return new ProxyRequest(i, str, i2, j, bArr, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }
}
