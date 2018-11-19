package com.tinder.data.profile;

import com.tinder.api.TinderApi;
import com.tinder.data.adapter.C10746z;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.d */
public final class C13076d implements Factory<C10928c> {
    /* renamed from: a */
    private final Provider<TinderApi> f41650a;
    /* renamed from: b */
    private final Provider<C10746z> f41651b;

    public /* synthetic */ Object get() {
        return m50892a();
    }

    public C13076d(Provider<TinderApi> provider, Provider<C10746z> provider2) {
        this.f41650a = provider;
        this.f41651b = provider2;
    }

    /* renamed from: a */
    public C10928c m50892a() {
        return C13076d.m50890a(this.f41650a, this.f41651b);
    }

    /* renamed from: a */
    public static C10928c m50890a(Provider<TinderApi> provider, Provider<C10746z> provider2) {
        return new C10928c((TinderApi) provider.get(), (C10746z) provider2.get());
    }

    /* renamed from: b */
    public static C13076d m50891b(Provider<TinderApi> provider, Provider<C10746z> provider2) {
        return new C13076d(provider, provider2);
    }
}
