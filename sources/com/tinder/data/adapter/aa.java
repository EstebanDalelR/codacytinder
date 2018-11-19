package com.tinder.data.adapter;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class aa implements Factory<C10746z> {
    /* renamed from: a */
    private final Provider<ab> f41244a;
    /* renamed from: b */
    private final Provider<ad> f41245b;

    public /* synthetic */ Object get() {
        return m50371a();
    }

    public aa(Provider<ab> provider, Provider<ad> provider2) {
        this.f41244a = provider;
        this.f41245b = provider2;
    }

    /* renamed from: a */
    public C10746z m50371a() {
        return m50369a(this.f41244a, this.f41245b);
    }

    /* renamed from: a */
    public static C10746z m50369a(Provider<ab> provider, Provider<ad> provider2) {
        return new C10746z((ab) provider.get(), (ad) provider2.get());
    }

    /* renamed from: b */
    public static aa m50370b(Provider<ab> provider, Provider<ad> provider2) {
        return new aa(provider, provider2);
    }
}
