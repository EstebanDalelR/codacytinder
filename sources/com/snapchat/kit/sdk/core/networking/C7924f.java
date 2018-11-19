package com.snapchat.kit.sdk.core.networking;

import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C7136a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.networking.f */
public final class C7924f implements Factory<C7154e> {
    /* renamed from: a */
    private final Provider<OAuth2Manager> f28508a;
    /* renamed from: b */
    private final Provider<C7136a> f28509b;
    /* renamed from: c */
    private final Provider<String> f28510c;

    public /* synthetic */ Object get() {
        return m33766a();
    }

    public C7924f(Provider<OAuth2Manager> provider, Provider<C7136a> provider2, Provider<String> provider3) {
        this.f28508a = provider;
        this.f28509b = provider2;
        this.f28510c = provider3;
    }

    /* renamed from: a */
    public C7154e m33766a() {
        return new C7154e((OAuth2Manager) this.f28508a.get(), (C7136a) this.f28509b.get(), (String) this.f28510c.get());
    }

    /* renamed from: a */
    public static Factory<C7154e> m33765a(Provider<OAuth2Manager> provider, Provider<C7136a> provider2, Provider<String> provider3) {
        return new C7924f(provider, provider2, provider3);
    }
}
