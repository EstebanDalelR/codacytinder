package com.google.android.gms.internal;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.security.GeneralSecurityException;

public final class yi {
    /* renamed from: a */
    public static byte[] m20267a(byte[]... bArr) throws GeneralSecurityException {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (i > ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += bArr2.length;
        }
        Object obj = new byte[i];
        int i2 = 0;
        for (Object obj2 : bArr) {
            System.arraycopy(obj2, 0, obj, i2, obj2.length);
            i2 += obj2.length;
        }
        return obj;
    }
}
