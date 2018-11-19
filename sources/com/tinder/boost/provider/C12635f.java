package com.tinder.boost.provider;

import com.tinder.boost.repository.BoostStatusRepository;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.boost.provider.f */
public final class C12635f implements Factory<C2639c> {
    /* renamed from: a */
    private final Provider<LikeStatusProvider> f40767a;
    /* renamed from: b */
    private final Provider<BoostStatusRepository> f40768b;
    /* renamed from: c */
    private final Provider<BoostUpdateProvider> f40769c;
    /* renamed from: d */
    private final Provider<C8349a> f40770d;

    public /* synthetic */ Object get() {
        return m49891a();
    }

    public C12635f(Provider<LikeStatusProvider> provider, Provider<BoostStatusRepository> provider2, Provider<BoostUpdateProvider> provider3, Provider<C8349a> provider4) {
        this.f40767a = provider;
        this.f40768b = provider2;
        this.f40769c = provider3;
        this.f40770d = provider4;
    }

    /* renamed from: a */
    public C2639c m49891a() {
        return C12635f.m49889a(this.f40767a, this.f40768b, this.f40769c, this.f40770d);
    }

    /* renamed from: a */
    public static C2639c m49889a(Provider<LikeStatusProvider> provider, Provider<BoostStatusRepository> provider2, Provider<BoostUpdateProvider> provider3, Provider<C8349a> provider4) {
        return new C2639c((LikeStatusProvider) provider.get(), (BoostStatusRepository) provider2.get(), (BoostUpdateProvider) provider3.get(), (C8349a) provider4.get());
    }

    /* renamed from: b */
    public static C12635f m49890b(Provider<LikeStatusProvider> provider, Provider<BoostStatusRepository> provider2, Provider<BoostUpdateProvider> provider3, Provider<C8349a> provider4) {
        return new C12635f(provider, provider2, provider3, provider4);
    }
}
