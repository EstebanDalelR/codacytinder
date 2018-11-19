package com.tinder.profile.p363b;

import com.tinder.api.TinderApi;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.b.an */
public final class an implements Factory<am> {
    /* renamed from: a */
    private final Provider<TinderApi> f55389a;

    public /* synthetic */ Object get() {
        return m64899a();
    }

    public an(Provider<TinderApi> provider) {
        this.f55389a = provider;
    }

    /* renamed from: a */
    public am m64899a() {
        return an.m64897a(this.f55389a);
    }

    /* renamed from: a */
    public static am m64897a(Provider<TinderApi> provider) {
        return new am((TinderApi) provider.get());
    }

    /* renamed from: b */
    public static an m64898b(Provider<TinderApi> provider) {
        return new an(provider);
    }

    /* renamed from: a */
    public static am m64896a(TinderApi tinderApi) {
        return new am(tinderApi);
    }
}
