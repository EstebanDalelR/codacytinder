package com.snapchat.kit.sdk.core.networking;

import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C7136a;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.networking.d */
public final class C7923d implements Factory<C7922c> {
    /* renamed from: a */
    private final Provider<OAuth2Manager> f28504a;
    /* renamed from: b */
    private final Provider<C7136a> f28505b;
    /* renamed from: c */
    private final Provider<String> f28506c;
    /* renamed from: d */
    private final Provider<Fingerprint> f28507d;

    public /* synthetic */ Object get() {
        return m33764a();
    }

    public C7923d(Provider<OAuth2Manager> provider, Provider<C7136a> provider2, Provider<String> provider3, Provider<Fingerprint> provider4) {
        this.f28504a = provider;
        this.f28505b = provider2;
        this.f28506c = provider3;
        this.f28507d = provider4;
    }

    /* renamed from: a */
    public C7922c m33764a() {
        return new C7922c((OAuth2Manager) this.f28504a.get(), (C7136a) this.f28505b.get(), (String) this.f28506c.get(), (Fingerprint) this.f28507d.get());
    }

    /* renamed from: a */
    public static Factory<C7922c> m33763a(Provider<OAuth2Manager> provider, Provider<C7136a> provider2, Provider<String> provider3, Provider<Fingerprint> provider4) {
        return new C7923d(provider, provider2, provider3, provider4);
    }
}
