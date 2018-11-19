package com.snapchat.kit.sdk.core.metrics.p149b;

import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b.b */
public final class C7888b implements Factory<C5938a> {
    /* renamed from: a */
    private final Provider<Gson> f28484a;

    public /* synthetic */ Object get() {
        return m33742a();
    }

    public C7888b(Provider<Gson> provider) {
        this.f28484a = provider;
    }

    /* renamed from: a */
    public C5938a m33742a() {
        return new C5938a((Gson) this.f28484a.get());
    }

    /* renamed from: a */
    public static Factory<C5938a> m33741a(Provider<Gson> provider) {
        return new C7888b(provider);
    }
}
