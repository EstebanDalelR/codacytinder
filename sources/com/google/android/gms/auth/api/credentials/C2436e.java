package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.oi;

/* renamed from: com.google.android.gms.auth.api.credentials.e */
public final class C2436e implements Creator<CredentialRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = oi.a(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = strArr;
        CredentialPickerConfig credentialPickerConfig2 = credentialPickerConfig;
        String str = credentialPickerConfig2;
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
                        z = oi.c(parcel, readInt);
                        break;
                    case 2:
                        strArr = oi.v(parcel, readInt);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) oi.a(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) oi.a(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = oi.c(parcel, readInt);
                        break;
                    case 6:
                        str = oi.l(parcel, readInt);
                        break;
                    case 7:
                        str2 = oi.l(parcel, readInt);
                        break;
                    case 8:
                        z3 = oi.c(parcel, readInt);
                        break;
                    default:
                        oi.b(parcel, readInt);
                        break;
                }
            }
            i = oi.e(parcel, readInt);
        }
        oi.A(parcel, a);
        return new CredentialRequest(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialRequest[i];
    }
}
