package com.tinder.tinderplus;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.tinderplus.b */
public final class C18213b implements Factory<C2657a> {
    /* renamed from: a */
    private final Provider<bk> f56468a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f56469b;
    /* renamed from: c */
    private final Provider<LoadProfileOptionData> f56470c;

    public /* synthetic */ Object get() {
        return m66037a();
    }

    public C18213b(Provider<bk> provider, Provider<AbTestUtility> provider2, Provider<LoadProfileOptionData> provider3) {
        this.f56468a = provider;
        this.f56469b = provider2;
        this.f56470c = provider3;
    }

    /* renamed from: a */
    public C2657a m66037a() {
        return C18213b.m66035a(this.f56468a, this.f56469b, this.f56470c);
    }

    /* renamed from: a */
    public static C2657a m66035a(Provider<bk> provider, Provider<AbTestUtility> provider2, Provider<LoadProfileOptionData> provider3) {
        return new C2657a((bk) provider.get(), (AbTestUtility) provider2.get(), (LoadProfileOptionData) provider3.get());
    }

    /* renamed from: b */
    public static C18213b m66036b(Provider<bk> provider, Provider<AbTestUtility> provider2, Provider<LoadProfileOptionData> provider3) {
        return new C18213b(provider, provider2, provider3);
    }
}
