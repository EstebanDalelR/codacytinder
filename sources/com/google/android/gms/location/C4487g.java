package com.google.android.gms.location;

import com.facebook.ads.AdError;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.g */
public final class C4487g {
    /* renamed from: a */
    public static int m20358a(int i) {
        return ((i < 0 || i > 1) && (AdError.NETWORK_ERROR_CODE > i || i > AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE)) ? 1 : i;
    }

    /* renamed from: b */
    public static Status m20359b(int i) {
        if (i == 1) {
            i = 13;
        }
        return new Status(i);
    }
}
