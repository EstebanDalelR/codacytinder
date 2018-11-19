package com.google.android.gms.internal;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

public final class mp implements CredentialRequestResult {
    /* renamed from: a */
    private final Status f26941a;
    /* renamed from: b */
    private final Credential f26942b;

    public mp(Status status, Credential credential) {
        this.f26941a = status;
        this.f26942b = credential;
    }

    /* renamed from: a */
    public static mp m31613a(Status status) {
        return new mp(status, null);
    }

    public final Credential getCredential() {
        return this.f26942b;
    }

    public final Status getStatus() {
        return this.f26941a;
    }
}
