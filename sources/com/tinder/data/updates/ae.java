package com.tinder.data.updates;

import com.tinder.data.match.C10799v;
import com.tinder.domain.match.usecase.InsertMatches;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ae implements Factory<ac> {
    /* renamed from: a */
    private final Provider<C10799v> f41759a;
    /* renamed from: b */
    private final Provider<InsertMatches> f41760b;

    public /* synthetic */ Object get() {
        return m51001a();
    }

    public ae(Provider<C10799v> provider, Provider<InsertMatches> provider2) {
        this.f41759a = provider;
        this.f41760b = provider2;
    }

    /* renamed from: a */
    public ac m51001a() {
        return m50999a(this.f41759a, this.f41760b);
    }

    /* renamed from: a */
    public static ac m50999a(Provider<C10799v> provider, Provider<InsertMatches> provider2) {
        return new ac((C10799v) provider.get(), (InsertMatches) provider2.get());
    }

    /* renamed from: b */
    public static ae m51000b(Provider<C10799v> provider, Provider<InsertMatches> provider2) {
        return new ae(provider, provider2);
    }
}
