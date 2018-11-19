package com.tinder.superlike.p421e;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.superlike.e.h */
public final class C18194h implements Factory<C15082f> {
    /* renamed from: a */
    private final Provider<LoadProfileOptionData> f56407a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f56408b;

    public /* synthetic */ Object get() {
        return m65971a();
    }

    public C18194h(Provider<LoadProfileOptionData> provider, Provider<AbTestUtility> provider2) {
        this.f56407a = provider;
        this.f56408b = provider2;
    }

    /* renamed from: a */
    public C15082f m65971a() {
        return C18194h.m65969a(this.f56407a, this.f56408b);
    }

    /* renamed from: a */
    public static C15082f m65969a(Provider<LoadProfileOptionData> provider, Provider<AbTestUtility> provider2) {
        return new C15082f((LoadProfileOptionData) provider.get(), (AbTestUtility) provider2.get());
    }

    /* renamed from: b */
    public static C18194h m65970b(Provider<LoadProfileOptionData> provider, Provider<AbTestUtility> provider2) {
        return new C18194h(provider, provider2);
    }
}
