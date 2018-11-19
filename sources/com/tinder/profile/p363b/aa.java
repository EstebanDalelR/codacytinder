package com.tinder.profile.p363b;

import com.tinder.api.TinderApi;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.b.aa */
public final class aa implements Factory<C16093z> {
    /* renamed from: a */
    private final Provider<TinderApi> f55380a;

    public /* synthetic */ Object get() {
        return m64889a();
    }

    public aa(Provider<TinderApi> provider) {
        this.f55380a = provider;
    }

    /* renamed from: a */
    public C16093z m64889a() {
        return aa.m64887a(this.f55380a);
    }

    /* renamed from: a */
    public static C16093z m64887a(Provider<TinderApi> provider) {
        return new C16093z((TinderApi) provider.get());
    }

    /* renamed from: b */
    public static aa m64888b(Provider<TinderApi> provider) {
        return new aa(provider);
    }
}
