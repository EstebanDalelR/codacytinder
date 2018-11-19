package com.tinder.interactors;

import com.tinder.api.TinderApiClient;
import com.tinder.boost.repository.BoostStatusRepository;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.managers.ManagerProfile;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.interactors.n */
public final class C13343n implements Factory<C9719k> {
    /* renamed from: a */
    private final Provider<TinderApiClient> f42324a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42325b;
    /* renamed from: c */
    private final Provider<ManagerProfile> f42326c;
    /* renamed from: d */
    private final Provider<BoostStatusRepository> f42327d;

    public /* synthetic */ Object get() {
        return m51621a();
    }

    public C13343n(Provider<TinderApiClient> provider, Provider<AbTestUtility> provider2, Provider<ManagerProfile> provider3, Provider<BoostStatusRepository> provider4) {
        this.f42324a = provider;
        this.f42325b = provider2;
        this.f42326c = provider3;
        this.f42327d = provider4;
    }

    /* renamed from: a */
    public C9719k m51621a() {
        return C13343n.m51619a(this.f42324a, this.f42325b, this.f42326c, this.f42327d);
    }

    /* renamed from: a */
    public static C9719k m51619a(Provider<TinderApiClient> provider, Provider<AbTestUtility> provider2, Provider<ManagerProfile> provider3, Provider<BoostStatusRepository> provider4) {
        return new C9719k((TinderApiClient) provider.get(), (AbTestUtility) provider2.get(), (ManagerProfile) provider3.get(), (BoostStatusRepository) provider4.get());
    }

    /* renamed from: b */
    public static C13343n m51620b(Provider<TinderApiClient> provider, Provider<AbTestUtility> provider2, Provider<ManagerProfile> provider3, Provider<BoostStatusRepository> provider4) {
        return new C13343n(provider, provider2, provider3, provider4);
    }
}
