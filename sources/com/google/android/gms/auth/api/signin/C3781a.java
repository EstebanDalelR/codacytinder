package com.google.android.gms.auth.api.signin;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.a */
public class C3781a implements Result {
    /* renamed from: a */
    private Status f11858a;
    /* renamed from: b */
    private GoogleSignInAccount f11859b;

    public C3781a(@Nullable GoogleSignInAccount googleSignInAccount, @NonNull Status status) {
        this.f11859b = googleSignInAccount;
        this.f11858a = status;
    }

    @NonNull
    public Status getStatus() {
        return this.f11858a;
    }
}
