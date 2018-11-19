package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.auth.api.credentials.c */
public final class C2434c implements Creator<CredentialPickerConfig> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 != AdError.NETWORK_ERROR_CODE) {
                switch (i3) {
                    case 1:
                        z = oi.c(parcel, readInt);
                        break;
                    case 2:
                        z2 = oi.c(parcel, readInt);
                        break;
                    case 3:
                        z3 = oi.c(parcel, readInt);
                        break;
                    case 4:
                        i2 = oi.e(parcel, readInt);
                        break;
                    default:
                        oi.b(parcel, readInt);
                        break;
                }
            }
            i = oi.e(parcel, readInt);
        }
        oi.A(parcel, a);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
