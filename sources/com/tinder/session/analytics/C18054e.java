package com.tinder.session.analytics;

import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.session.analytics.p402a.C18051a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.session.analytics.e */
public final class C18054e implements Factory<C14834c> {
    /* renamed from: a */
    private final Provider<bk> f56063a;
    /* renamed from: b */
    private final Provider<bj> f56064b;
    /* renamed from: c */
    private final Provider<OfferRepository> f56065c;
    /* renamed from: d */
    private final Provider<CurrentUserProvider> f56066d;
    /* renamed from: e */
    private final Provider<LoadProfileOptionData> f56067e;
    /* renamed from: f */
    private final Provider<C18051a> f56068f;

    public /* synthetic */ Object get() {
        return m65538a();
    }

    public C18054e(Provider<bk> provider, Provider<bj> provider2, Provider<OfferRepository> provider3, Provider<CurrentUserProvider> provider4, Provider<LoadProfileOptionData> provider5, Provider<C18051a> provider6) {
        this.f56063a = provider;
        this.f56064b = provider2;
        this.f56065c = provider3;
        this.f56066d = provider4;
        this.f56067e = provider5;
        this.f56068f = provider6;
    }

    /* renamed from: a */
    public C14834c m65538a() {
        return C18054e.m65536a(this.f56063a, this.f56064b, this.f56065c, this.f56066d, this.f56067e, this.f56068f);
    }

    /* renamed from: a */
    public static C14834c m65536a(Provider<bk> provider, Provider<bj> provider2, Provider<OfferRepository> provider3, Provider<CurrentUserProvider> provider4, Provider<LoadProfileOptionData> provider5, Provider<C18051a> provider6) {
        return new C14834c((bk) provider.get(), (bj) provider2.get(), (OfferRepository) provider3.get(), (CurrentUserProvider) provider4.get(), (LoadProfileOptionData) provider5.get(), (C18051a) provider6.get());
    }

    /* renamed from: b */
    public static C18054e m65537b(Provider<bk> provider, Provider<bj> provider2, Provider<OfferRepository> provider3, Provider<CurrentUserProvider> provider4, Provider<LoadProfileOptionData> provider5, Provider<C18051a> provider6) {
        return new C18054e(provider, provider2, provider3, provider4, provider5, provider6);
    }
}
