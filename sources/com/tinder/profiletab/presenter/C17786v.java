package com.tinder.profiletab.presenter;

import com.tinder.boost.p178a.C10400d;
import com.tinder.boost.provider.BoostUpdateProvider;
import com.tinder.boost.repository.BoostStatusRepository;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.intropricing.domain.p264a.C9730a;
import com.tinder.profile.p366e.C14409b;
import com.tinder.superlike.p421e.C15082f;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profiletab.presenter.v */
public final class C17786v implements Factory<C14474d> {
    /* renamed from: a */
    private final Provider<BoostUpdateProvider> f55490a;
    /* renamed from: b */
    private final Provider<C15082f> f55491b;
    /* renamed from: c */
    private final Provider<C10400d> f55492c;
    /* renamed from: d */
    private final Provider<C14409b> f55493d;
    /* renamed from: e */
    private final Provider<LikeStatusProvider> f55494e;
    /* renamed from: f */
    private final Provider<BoostStatusRepository> f55495f;
    /* renamed from: g */
    private final Provider<SubscriptionProvider> f55496g;
    /* renamed from: h */
    private final Provider<FastMatchConfigProvider> f55497h;
    /* renamed from: i */
    private final Provider<C14471a> f55498i;
    /* renamed from: j */
    private final Provider<C9730a> f55499j;

    public /* synthetic */ Object get() {
        return m64993a();
    }

    public C17786v(Provider<BoostUpdateProvider> provider, Provider<C15082f> provider2, Provider<C10400d> provider3, Provider<C14409b> provider4, Provider<LikeStatusProvider> provider5, Provider<BoostStatusRepository> provider6, Provider<SubscriptionProvider> provider7, Provider<FastMatchConfigProvider> provider8, Provider<C14471a> provider9, Provider<C9730a> provider10) {
        this.f55490a = provider;
        this.f55491b = provider2;
        this.f55492c = provider3;
        this.f55493d = provider4;
        this.f55494e = provider5;
        this.f55495f = provider6;
        this.f55496g = provider7;
        this.f55497h = provider8;
        this.f55498i = provider9;
        this.f55499j = provider10;
    }

    /* renamed from: a */
    public C14474d m64993a() {
        return C17786v.m64991a(this.f55490a, this.f55491b, this.f55492c, this.f55493d, this.f55494e, this.f55495f, this.f55496g, this.f55497h, this.f55498i, this.f55499j);
    }

    /* renamed from: a */
    public static C14474d m64991a(Provider<BoostUpdateProvider> provider, Provider<C15082f> provider2, Provider<C10400d> provider3, Provider<C14409b> provider4, Provider<LikeStatusProvider> provider5, Provider<BoostStatusRepository> provider6, Provider<SubscriptionProvider> provider7, Provider<FastMatchConfigProvider> provider8, Provider<C14471a> provider9, Provider<C9730a> provider10) {
        return new C14474d((BoostUpdateProvider) provider.get(), (C15082f) provider2.get(), (C10400d) provider3.get(), (C14409b) provider4.get(), (LikeStatusProvider) provider5.get(), (BoostStatusRepository) provider6.get(), (SubscriptionProvider) provider7.get(), (FastMatchConfigProvider) provider8.get(), (C14471a) provider9.get(), (C9730a) provider10.get());
    }

    /* renamed from: b */
    public static C17786v m64992b(Provider<BoostUpdateProvider> provider, Provider<C15082f> provider2, Provider<C10400d> provider3, Provider<C14409b> provider4, Provider<LikeStatusProvider> provider5, Provider<BoostStatusRepository> provider6, Provider<SubscriptionProvider> provider7, Provider<FastMatchConfigProvider> provider8, Provider<C14471a> provider9, Provider<C9730a> provider10) {
        return new C17786v(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }
}
