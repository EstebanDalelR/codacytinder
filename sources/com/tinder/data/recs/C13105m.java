package com.tinder.data.recs;

import com.tinder.domain.recs.model.Rec$Source;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.recs.m */
public final class C13105m implements Factory<C8788l> {
    /* renamed from: a */
    private final Provider<Rec$Source> f41729a;

    public /* synthetic */ Object get() {
        return m50964a();
    }

    public C13105m(Provider<Rec$Source> provider) {
        this.f41729a = provider;
    }

    /* renamed from: a */
    public C8788l m50964a() {
        return new C8788l((Rec$Source) this.f41729a.get());
    }

    /* renamed from: a */
    public static C13105m m50963a(Provider<Rec$Source> provider) {
        return new C13105m(provider);
    }
}
