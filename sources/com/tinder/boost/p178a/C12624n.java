package com.tinder.boost.p178a;

import com.tinder.api.TinderApiClient;
import com.tinder.boost.provider.BoostUpdateProvider;
import com.tinder.boost.provider.C2639c;
import com.tinder.boost.provider.C8349a;
import com.tinder.boost.repository.BoostStatusRepository;
import com.tinder.domain.boost.repository.BoostProfileFacesRepository;
import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.boost.a.n */
public final class C12624n implements Factory<C10400d> {
    /* renamed from: a */
    private final Provider<TinderApiClient> f40726a;
    /* renamed from: b */
    private final Provider<bk> f40727b;
    /* renamed from: c */
    private final Provider<BoostProfileFacesRepository> f40728c;
    /* renamed from: d */
    private final Provider<BoostUpdateProvider> f40729d;
    /* renamed from: e */
    private final Provider<C2639c> f40730e;
    /* renamed from: f */
    private final Provider<BoostStatusRepository> f40731f;
    /* renamed from: g */
    private final Provider<C8349a> f40732g;

    public /* synthetic */ Object get() {
        return m49848a();
    }

    public C12624n(Provider<TinderApiClient> provider, Provider<bk> provider2, Provider<BoostProfileFacesRepository> provider3, Provider<BoostUpdateProvider> provider4, Provider<C2639c> provider5, Provider<BoostStatusRepository> provider6, Provider<C8349a> provider7) {
        this.f40726a = provider;
        this.f40727b = provider2;
        this.f40728c = provider3;
        this.f40729d = provider4;
        this.f40730e = provider5;
        this.f40731f = provider6;
        this.f40732g = provider7;
    }

    /* renamed from: a */
    public C10400d m49848a() {
        return C12624n.m49846a(this.f40726a, this.f40727b, this.f40728c, this.f40729d, this.f40730e, this.f40731f, this.f40732g);
    }

    /* renamed from: a */
    public static C10400d m49846a(Provider<TinderApiClient> provider, Provider<bk> provider2, Provider<BoostProfileFacesRepository> provider3, Provider<BoostUpdateProvider> provider4, Provider<C2639c> provider5, Provider<BoostStatusRepository> provider6, Provider<C8349a> provider7) {
        return new C10400d((TinderApiClient) provider.get(), (bk) provider2.get(), (BoostProfileFacesRepository) provider3.get(), (BoostUpdateProvider) provider4.get(), (C2639c) provider5.get(), (BoostStatusRepository) provider6.get(), (C8349a) provider7.get());
    }

    /* renamed from: b */
    public static C12624n m49847b(Provider<TinderApiClient> provider, Provider<bk> provider2, Provider<BoostProfileFacesRepository> provider3, Provider<BoostUpdateProvider> provider4, Provider<C2639c> provider5, Provider<BoostStatusRepository> provider6, Provider<C8349a> provider7) {
        return new C12624n(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }
}
