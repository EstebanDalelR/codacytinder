package com.snapchat.kit.sdk.login.networking;

import com.google.gson.Gson;
import com.snapchat.kit.sdk.core.networking.LoginClient;
import com.snapchat.kit.sdk.login.p150a.C5954a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.login.networking.b */
public final class C7936b implements Factory<C5958a> {
    /* renamed from: a */
    private final Provider<LoginClient> f28534a;
    /* renamed from: b */
    private final Provider<Gson> f28535b;
    /* renamed from: c */
    private final Provider<C5954a> f28536c;

    public /* synthetic */ Object get() {
        return m33790a();
    }

    public C7936b(Provider<LoginClient> provider, Provider<Gson> provider2, Provider<C5954a> provider3) {
        this.f28534a = provider;
        this.f28535b = provider2;
        this.f28536c = provider3;
    }

    /* renamed from: a */
    public C5958a m33790a() {
        return new C5958a((LoginClient) this.f28534a.get(), (Gson) this.f28535b.get(), (C5954a) this.f28536c.get());
    }

    /* renamed from: a */
    public static Factory<C5958a> m33789a(Provider<LoginClient> provider, Provider<Gson> provider2, Provider<C5954a> provider3) {
        return new C7936b(provider, provider2, provider3);
    }
}
