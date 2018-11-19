package com.tinder.chat.view.provider;

import com.tinder.typingindicator.usecase.C17175f;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ac implements Factory<ab> {
    /* renamed from: a */
    private final Provider<C8518y> f41133a;
    /* renamed from: b */
    private final Provider<C17175f> f41134b;

    public /* synthetic */ Object get() {
        return m50195a();
    }

    public ac(Provider<C8518y> provider, Provider<C17175f> provider2) {
        this.f41133a = provider;
        this.f41134b = provider2;
    }

    /* renamed from: a */
    public ab m50195a() {
        return m50193a(this.f41133a, this.f41134b);
    }

    /* renamed from: a */
    public static ab m50193a(Provider<C8518y> provider, Provider<C17175f> provider2) {
        return new ab((C8518y) provider.get(), (C17175f) provider2.get());
    }

    /* renamed from: b */
    public static ac m50194b(Provider<C8518y> provider, Provider<C17175f> provider2) {
        return new ac(provider, provider2);
    }
}
