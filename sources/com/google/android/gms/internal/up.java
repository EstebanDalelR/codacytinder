package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class up implements zzdpq {
    public final zzdpw zzd(String str, String str2, int i) throws GeneralSecurityException {
        Object obj;
        String toLowerCase = str2.toLowerCase();
        Object obj2 = -1;
        zzdpw urVar;
        if (toLowerCase.hashCode() == 2989895) {
            if (toLowerCase.equals("aead")) {
                obj = null;
                if (obj == null) {
                    throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
                }
                switch (str.hashCode()) {
                    case 360753376:
                        if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                            obj2 = 3;
                            break;
                        }
                        break;
                    case 1215885937:
                        if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                            obj2 = null;
                            break;
                        }
                        break;
                    case 1469984853:
                        if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                            obj2 = 4;
                            break;
                        }
                        break;
                    case 1797113348:
                        if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                            obj2 = 1;
                            break;
                        }
                        break;
                    case 1855890991:
                        if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                            obj2 = 2;
                            break;
                        }
                        break;
                    case 2079211877:
                        if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                            obj2 = 5;
                            break;
                        }
                        break;
                    default:
                        break;
                }
                switch (obj2) {
                    case null:
                        urVar = new ur();
                        break;
                    case 1:
                        urVar = new ut();
                        break;
                    case 2:
                        urVar = new uu();
                        break;
                    case 3:
                        urVar = new uv();
                        break;
                    case 4:
                        urVar = new uw();
                        break;
                    case 5:
                        urVar = new uy();
                        break;
                    default:
                        throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[]{str}));
                }
                if (i > 0) {
                    return urVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
        }
        obj = -1;
        if (obj == null) {
            switch (str.hashCode()) {
                case 360753376:
                    if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                        obj2 = 3;
                        break;
                    }
                    break;
                case 1215885937:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                        obj2 = null;
                        break;
                    }
                    break;
                case 1469984853:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                        obj2 = 4;
                        break;
                    }
                    break;
                case 1797113348:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                        obj2 = 1;
                        break;
                    }
                    break;
                case 1855890991:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                        obj2 = 2;
                        break;
                    }
                    break;
                case 2079211877:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                        obj2 = 5;
                        break;
                    }
                    break;
                default:
                    break;
            }
            switch (obj2) {
                case null:
                    urVar = new ur();
                    break;
                case 1:
                    urVar = new ut();
                    break;
                case 2:
                    urVar = new uu();
                    break;
                case 3:
                    urVar = new uv();
                    break;
                case 4:
                    urVar = new uw();
                    break;
                case 5:
                    urVar = new uy();
                    break;
                default:
                    throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", new Object[]{str}));
            }
            if (i > 0) {
                return urVar;
            }
            throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
