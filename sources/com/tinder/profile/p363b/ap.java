package com.tinder.profile.p363b;

import com.tinder.api.TinderApi;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.b.ap */
public final class ap implements Factory<ao> {
    /* renamed from: a */
    private final Provider<TinderApi> f55390a;

    public /* synthetic */ Object get() {
        return m64903a();
    }

    public ap(Provider<TinderApi> provider) {
        this.f55390a = provider;
    }

    /* renamed from: a */
    public ao m64903a() {
        return ap.m64901a(this.f55390a);
    }

    /* renamed from: a */
    public static ao m64901a(Provider<TinderApi> provider) {
        return new ao((TinderApi) provider.get());
    }

    /* renamed from: b */
    public static ap m64902b(Provider<TinderApi> provider) {
        return new ap(provider);
    }

    /* renamed from: a */
    public static ao m64900a(TinderApi tinderApi) {
        return new ao(tinderApi);
    }
}
