package com.snapchat.kit.sdk.bitmoji.networking;

import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5890a;
import com.squareup.okhttp.C6068p;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.bitmoji.networking.d */
public final class C7865d implements Factory<C7864c> {
    /* renamed from: a */
    private final Provider<C5890a> f28373a;
    /* renamed from: b */
    private final Provider<C6068p> f28374b;

    public /* synthetic */ Object get() {
        return m33662a();
    }

    public C7865d(Provider<C5890a> provider, Provider<C6068p> provider2) {
        this.f28373a = provider;
        this.f28374b = provider2;
    }

    /* renamed from: a */
    public C7864c m33662a() {
        return new C7864c((C5890a) this.f28373a.get(), (C6068p) this.f28374b.get());
    }

    /* renamed from: a */
    public static Factory<C7864c> m33661a(Provider<C5890a> provider, Provider<C6068p> provider2) {
        return new C7865d(provider, provider2);
    }
}
