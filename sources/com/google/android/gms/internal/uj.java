package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class uj {
    /* renamed from: a */
    private static final CopyOnWriteArrayList<zzdpy> f16576a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static zzdpy m20225a(String str) throws GeneralSecurityException {
        Iterator it = f16576a.iterator();
        while (it.hasNext()) {
            zzdpy zzdpy = (zzdpy) it.next();
            if (zzdpy.zzod(str)) {
                return zzdpy;
            }
        }
        String str2 = "No KMS client does support: ";
        str = String.valueOf(str);
        throw new GeneralSecurityException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
