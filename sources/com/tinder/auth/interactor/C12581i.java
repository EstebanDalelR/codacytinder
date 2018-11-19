package com.tinder.auth.interactor;

import com.tinder.auth.repository.AuthSessionRepository;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.interactor.i */
public final class C12581i implements Factory<C10333h> {
    /* renamed from: a */
    private final Provider<ManagerAnalytics> f40646a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f40647b;
    /* renamed from: c */
    private final Provider<AuthSessionRepository> f40648c;
    /* renamed from: d */
    private final Provider<bk> f40649d;

    public /* synthetic */ Object get() {
        return m49729a();
    }

    public C12581i(Provider<ManagerAnalytics> provider, Provider<AbTestUtility> provider2, Provider<AuthSessionRepository> provider3, Provider<bk> provider4) {
        this.f40646a = provider;
        this.f40647b = provider2;
        this.f40648c = provider3;
        this.f40649d = provider4;
    }

    /* renamed from: a */
    public C10333h m49729a() {
        return C12581i.m49727a(this.f40646a, this.f40647b, this.f40648c, this.f40649d);
    }

    /* renamed from: a */
    public static C10333h m49727a(Provider<ManagerAnalytics> provider, Provider<AbTestUtility> provider2, Provider<AuthSessionRepository> provider3, Provider<bk> provider4) {
        return new C10333h((ManagerAnalytics) provider.get(), (AbTestUtility) provider2.get(), (AuthSessionRepository) provider3.get(), (bk) provider4.get());
    }

    /* renamed from: b */
    public static C12581i m49728b(Provider<ManagerAnalytics> provider, Provider<AbTestUtility> provider2, Provider<AuthSessionRepository> provider3, Provider<bk> provider4) {
        return new C12581i(provider, provider2, provider3, provider4);
    }
}
