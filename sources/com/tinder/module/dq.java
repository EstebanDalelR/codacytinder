package com.tinder.module;

import com.spotify.sdk.android.authentication.AuthenticationRequest.Builder;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class dq implements Factory<Builder> {
    /* renamed from: a */
    private final bs f42938a;

    public /* synthetic */ Object get() {
        return m52397a();
    }

    public dq(bs bsVar) {
        this.f42938a = bsVar;
    }

    /* renamed from: a */
    public Builder m52397a() {
        return m52394a(this.f42938a);
    }

    /* renamed from: a */
    public static Builder m52394a(bs bsVar) {
        return m52396c(bsVar);
    }

    /* renamed from: b */
    public static dq m52395b(bs bsVar) {
        return new dq(bsVar);
    }

    /* renamed from: c */
    public static Builder m52396c(bs bsVar) {
        return (Builder) C15521i.a(bsVar.m40839g(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
