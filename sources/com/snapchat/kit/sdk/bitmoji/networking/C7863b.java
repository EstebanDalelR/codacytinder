package com.snapchat.kit.sdk.bitmoji.networking;

import com.google.gson.Gson;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5890a;
import com.snapchat.kit.sdk.core.networking.LoginClient;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.networking.b */
public final class C7863b implements Factory<C5900a> {
    /* renamed from: a */
    private final Provider<LoginClient> f28369a;
    /* renamed from: b */
    private final Provider<C5890a> f28370b;
    /* renamed from: c */
    private final Provider<Gson> f28371c;

    public /* synthetic */ Object get() {
        return m33659a();
    }

    public C7863b(Provider<LoginClient> provider, Provider<C5890a> provider2, Provider<Gson> provider3) {
        this.f28369a = provider;
        this.f28370b = provider2;
        this.f28371c = provider3;
    }

    /* renamed from: a */
    public C5900a m33659a() {
        return new C5900a((LoginClient) this.f28369a.get(), (C5890a) this.f28370b.get(), (Gson) this.f28371c.get());
    }

    /* renamed from: a */
    public static Factory<C5900a> m33658a(Provider<LoginClient> provider, Provider<C5890a> provider2, Provider<Gson> provider3) {
        return new C7863b(provider, provider2, provider3);
    }
}
