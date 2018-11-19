package com.google.android.gms.common.util;

import android.util.Base64;

/* renamed from: com.google.android.gms.common.util.b */
public final class C2518b {
    /* renamed from: a */
    public static String m9190a(byte[] bArr) {
        return bArr == null ? null : Base64.encodeToString(bArr, 0);
    }

    /* renamed from: b */
    public static String m9191b(byte[] bArr) {
        return bArr == null ? null : Base64.encodeToString(bArr, 10);
    }
}
