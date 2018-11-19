package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

public final class zg implements zzduv<MessageDigest> {
    public final /* synthetic */ Object zzb(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
