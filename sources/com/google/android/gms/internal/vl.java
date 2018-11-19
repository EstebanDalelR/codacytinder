package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class vl implements zzdpq {
    public final zzdpw zzd(String str, String str2, int i) throws GeneralSecurityException {
        Object obj;
        String toLowerCase = str2.toLowerCase();
        Object obj2 = -1;
        zzdpw viVar;
        if (toLowerCase.hashCode() == 107855) {
            if (toLowerCase.equals("mac")) {
                obj = null;
                if (obj == null) {
                    throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
                }
                if (str.hashCode() != 836622442) {
                    if (str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                        obj2 = null;
                    }
                }
                if (obj2 == null) {
                    throw new GeneralSecurityException(String.format("No support for primitive 'Mac' with key type '%s'.", new Object[]{str}));
                }
                viVar = new vi();
                if (i > 0) {
                    return viVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
        }
        obj = -1;
        if (obj == null) {
            if (str.hashCode() != 836622442) {
                if (str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    obj2 = null;
                }
            }
            if (obj2 == null) {
                viVar = new vi();
                if (i > 0) {
                    return viVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'Mac' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
