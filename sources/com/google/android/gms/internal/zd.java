package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

public final class zd implements zzduv<KeyPairGenerator> {
    public final /* synthetic */ Object zzb(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
