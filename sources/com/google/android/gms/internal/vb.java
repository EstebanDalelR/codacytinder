package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class vb implements zzdpq {
    public final zzdpw zzd(String str, String str2, int i) throws GeneralSecurityException {
        Object obj;
        zzdpw uzVar;
        String toLowerCase = str2.toLowerCase();
        int hashCode = toLowerCase.hashCode();
        Object obj2 = -1;
        if (hashCode != 275448849) {
            if (hashCode == 1420614889) {
                if (toLowerCase.equals("hybridencrypt")) {
                    obj = 1;
                    switch (obj) {
                        case null:
                            if (str.hashCode() != -80133005) {
                                if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                                    obj2 = null;
                                }
                            }
                            if (obj2 != null) {
                                uzVar = new uz();
                                break;
                            }
                            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
                        case 1:
                            if (str.hashCode() != 396454335) {
                                if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                                    obj2 = null;
                                }
                            }
                            if (obj2 != null) {
                                uzVar = new va();
                                break;
                            }
                            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
                        default:
                            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
                    }
                    if (i > 0) {
                        return uzVar;
                    }
                    throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
                }
            }
        } else if (toLowerCase.equals("hybriddecrypt")) {
            obj = null;
            switch (obj) {
                case null:
                    if (str.hashCode() != -80133005) {
                        if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                            obj2 = null;
                        }
                    }
                    if (obj2 != null) {
                        uzVar = new uz();
                        break;
                    }
                    throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
                case 1:
                    if (str.hashCode() != 396454335) {
                        if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                            obj2 = null;
                        }
                    }
                    if (obj2 != null) {
                        uzVar = new va();
                        break;
                    }
                    throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
                default:
                    throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
            }
            if (i > 0) {
                return uzVar;
            }
            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
        }
        obj = -1;
        switch (obj) {
            case null:
                if (str.hashCode() != -80133005) {
                    if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                        obj2 = null;
                    }
                }
                if (obj2 != null) {
                    uzVar = new uz();
                    break;
                }
                throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
            case 1:
                if (str.hashCode() != 396454335) {
                    if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                        obj2 = null;
                    }
                }
                if (obj2 != null) {
                    uzVar = new va();
                    break;
                }
                throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
            default:
                throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
        }
        if (i > 0) {
            return uzVar;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
    }
}
