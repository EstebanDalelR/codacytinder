package com.tinder.places.provider;

import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.p238f.p239a.C9363a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.provider.n */
public final class C13599n implements Factory<C12425m> {
    /* renamed from: a */
    private final Provider<ProfileRemoteRepository> f43348a;
    /* renamed from: b */
    private final Provider<LoadProfileOptionData> f43349b;
    /* renamed from: c */
    private final Provider<C9363a> f43350c;

    public /* synthetic */ Object get() {
        return m53061a();
    }

    public C13599n(Provider<ProfileRemoteRepository> provider, Provider<LoadProfileOptionData> provider2, Provider<C9363a> provider3) {
        this.f43348a = provider;
        this.f43349b = provider2;
        this.f43350c = provider3;
    }

    /* renamed from: a */
    public C12425m m53061a() {
        return C13599n.m53059a(this.f43348a, this.f43349b, this.f43350c);
    }

    /* renamed from: a */
    public static C12425m m53059a(Provider<ProfileRemoteRepository> provider, Provider<LoadProfileOptionData> provider2, Provider<C9363a> provider3) {
        return new C12425m((ProfileRemoteRepository) provider.get(), (LoadProfileOptionData) provider2.get(), (C9363a) provider3.get());
    }

    /* renamed from: b */
    public static C13599n m53060b(Provider<ProfileRemoteRepository> provider, Provider<LoadProfileOptionData> provider2, Provider<C9363a> provider3) {
        return new C13599n(provider, provider2, provider3);
    }
}
