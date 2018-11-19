package com.tinder.data.updates;

import com.tinder.api.TinderApi;
import com.tinder.domain.boost.repository.BoostCursorRepository;
import com.tinder.domain.boost.repository.BoostStatusRepository;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.updates.x */
public final class C13129x implements Factory<C8813v> {
    /* renamed from: a */
    private final Provider<LastActivityDateRepository> f41779a;
    /* renamed from: b */
    private final Provider<BoostStatusRepository> f41780b;
    /* renamed from: c */
    private final Provider<BoostCursorRepository> f41781c;
    /* renamed from: d */
    private final Provider<TinderApi> f41782d;

    public /* synthetic */ Object get() {
        return m51039a();
    }

    public C13129x(Provider<LastActivityDateRepository> provider, Provider<BoostStatusRepository> provider2, Provider<BoostCursorRepository> provider3, Provider<TinderApi> provider4) {
        this.f41779a = provider;
        this.f41780b = provider2;
        this.f41781c = provider3;
        this.f41782d = provider4;
    }

    /* renamed from: a */
    public C8813v m51039a() {
        return C13129x.m51037a(this.f41779a, this.f41780b, this.f41781c, this.f41782d);
    }

    /* renamed from: a */
    public static C8813v m51037a(Provider<LastActivityDateRepository> provider, Provider<BoostStatusRepository> provider2, Provider<BoostCursorRepository> provider3, Provider<TinderApi> provider4) {
        return new C8813v((LastActivityDateRepository) provider.get(), (BoostStatusRepository) provider2.get(), (BoostCursorRepository) provider3.get(), (TinderApi) provider4.get());
    }

    /* renamed from: b */
    public static C13129x m51038b(Provider<LastActivityDateRepository> provider, Provider<BoostStatusRepository> provider2, Provider<BoostCursorRepository> provider3, Provider<TinderApi> provider4) {
        return new C13129x(provider, provider2, provider3, provider4);
    }
}
