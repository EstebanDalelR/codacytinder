package com.snapchat.kit.sdk.core.networking;

import com.google.gson.Gson;
import com.squareup.okhttp.C5997b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.networking.a */
public final class C7921a implements Factory<ClientFactory> {
    /* renamed from: a */
    private final Provider<C5997b> f28499a;
    /* renamed from: b */
    private final Provider<Gson> f28500b;
    /* renamed from: c */
    private final Provider<C7154e> f28501c;
    /* renamed from: d */
    private final Provider<C7922c> f28502d;

    public /* synthetic */ Object get() {
        return m33761a();
    }

    public C7921a(Provider<C5997b> provider, Provider<Gson> provider2, Provider<C7154e> provider3, Provider<C7922c> provider4) {
        this.f28499a = provider;
        this.f28500b = provider2;
        this.f28501c = provider3;
        this.f28502d = provider4;
    }

    /* renamed from: a */
    public ClientFactory m33761a() {
        return new ClientFactory((C5997b) this.f28499a.get(), (Gson) this.f28500b.get(), (C7154e) this.f28501c.get(), (C7922c) this.f28502d.get());
    }

    /* renamed from: a */
    public static Factory<ClientFactory> m33760a(Provider<C5997b> provider, Provider<Gson> provider2, Provider<C7154e> provider3, Provider<C7922c> provider4) {
        return new C7921a(provider, provider2, provider3, provider4);
    }
}
