package com.tinder.data.adapter;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class ar implements Factory<aq> {
    /* renamed from: a */
    private final Provider<C10738l> f41260a;

    public /* synthetic */ Object get() {
        return m50389a();
    }

    public ar(Provider<C10738l> provider) {
        this.f41260a = provider;
    }

    /* renamed from: a */
    public aq m50389a() {
        return m50387a(this.f41260a);
    }

    /* renamed from: a */
    public static aq m50387a(Provider<C10738l> provider) {
        return new aq((C10738l) provider.get());
    }

    /* renamed from: b */
    public static ar m50388b(Provider<C10738l> provider) {
        return new ar(provider);
    }
}
