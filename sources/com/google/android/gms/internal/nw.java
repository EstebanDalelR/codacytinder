package com.google.android.gms.internal;

import com.facebook.ads.AdError;

public final class nw {
    /* renamed from: a */
    public static int m20053a(int i) {
        if (i != AdError.NETWORK_ERROR_CODE) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder(43);
                    stringBuilder.append(i);
                    stringBuilder.append(" is not a valid enum EnumBoolean");
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return i;
    }
}
