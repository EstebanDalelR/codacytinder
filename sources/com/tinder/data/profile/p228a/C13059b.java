package com.tinder.data.profile.p228a;

import com.tinder.api.TinderUserApi;
import com.tinder.data.adapter.C10746z;
import com.tinder.data.adapter.C8617w;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.a.b */
public final class C13059b implements Factory<C8750a> {
    /* renamed from: a */
    private final Provider<TinderUserApi> f41617a;
    /* renamed from: b */
    private final Provider<C10746z> f41618b;
    /* renamed from: c */
    private final Provider<C8617w> f41619c;

    public /* synthetic */ Object get() {
        return m50817a();
    }

    public C13059b(Provider<TinderUserApi> provider, Provider<C10746z> provider2, Provider<C8617w> provider3) {
        this.f41617a = provider;
        this.f41618b = provider2;
        this.f41619c = provider3;
    }

    /* renamed from: a */
    public C8750a m50817a() {
        return C13059b.m50815a(this.f41617a, this.f41618b, this.f41619c);
    }

    /* renamed from: a */
    public static C8750a m50815a(Provider<TinderUserApi> provider, Provider<C10746z> provider2, Provider<C8617w> provider3) {
        return new C8750a((TinderUserApi) provider.get(), (C10746z) provider2.get(), (C8617w) provider3.get());
    }

    /* renamed from: b */
    public static C13059b m50816b(Provider<TinderUserApi> provider, Provider<C10746z> provider2, Provider<C8617w> provider3) {
        return new C13059b(provider, provider2, provider3);
    }
}
