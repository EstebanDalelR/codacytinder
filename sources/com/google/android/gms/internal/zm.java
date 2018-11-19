package com.google.android.gms.internal;

import java.security.SecureRandom;

public final class zm {
    /* renamed from: a */
    private static final SecureRandom f16668a = new SecureRandom();

    /* renamed from: a */
    public static byte[] m20287a(int i) {
        byte[] bArr = new byte[i];
        f16668a.nextBytes(bArr);
        return bArr;
    }
}
