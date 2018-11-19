package com.snapchat.kit.sdk.core.security;

import android.support.annotation.NonNull;
import javax.crypto.SecretKey;

/* renamed from: com.snapchat.kit.sdk.core.security.e */
public class C5949e {
    /* renamed from: a */
    private final SecretKey f21777a;
    /* renamed from: b */
    private final boolean f21778b;

    public C5949e(@NonNull SecretKey secretKey, boolean z) {
        this.f21777a = secretKey;
        this.f21778b = z;
    }

    @NonNull
    /* renamed from: a */
    public SecretKey m25549a() {
        return this.f21777a;
    }

    /* renamed from: b */
    public boolean m25550b() {
        return this.f21778b;
    }
}
