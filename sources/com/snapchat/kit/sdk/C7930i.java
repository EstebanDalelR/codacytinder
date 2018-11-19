package com.snapchat.kit.sdk;

import com.snapchat.kit.sdk.core.networking.ClientFactory;
import com.snapchat.kit.sdk.core.networking.LoginClient;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.i */
public final class C7930i implements Factory<LoginClient> {
    /* renamed from: a */
    private final C5951d f28516a;
    /* renamed from: b */
    private final Provider<ClientFactory> f28517b;

    public /* synthetic */ Object get() {
        return m33778a();
    }

    public C7930i(C5951d c5951d, Provider<ClientFactory> provider) {
        this.f28516a = c5951d;
        this.f28517b = provider;
    }

    /* renamed from: a */
    public LoginClient m33778a() {
        return (LoginClient) C15521i.a(this.f28516a.m25560a((ClientFactory) this.f28517b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static Factory<LoginClient> m33777a(C5951d c5951d, Provider<ClientFactory> provider) {
        return new C7930i(c5951d, provider);
    }
}
