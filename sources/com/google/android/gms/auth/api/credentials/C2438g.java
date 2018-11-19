package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.auth.api.credentials.g */
public final class C2438g implements Creator<HintRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = credentialPickerConfig;
        String str = strArr;
        String str2 = str;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 != AdError.NETWORK_ERROR_CODE) {
                switch (i2) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) oi.a(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = oi.c(parcel, readInt);
                        break;
                    case 3:
                        z2 = oi.c(parcel, readInt);
                        break;
                    case 4:
                        strArr = oi.v(parcel, readInt);
                        break;
                    case 5:
                        z3 = oi.c(parcel, readInt);
                        break;
                    case 6:
                        str = oi.l(parcel, readInt);
                        break;
                    case 7:
                        str2 = oi.l(parcel, readInt);
                        break;
                    default:
                        oi.b(parcel, readInt);
                        break;
                }
            }
            i = oi.e(parcel, readInt);
        }
        oi.A(parcel, a);
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }
}
