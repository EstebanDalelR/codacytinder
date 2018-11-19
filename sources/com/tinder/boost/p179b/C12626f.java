package com.tinder.boost.p179b;

import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.boost.b.f */
public final class C12626f implements Factory<C10403e> {
    /* renamed from: a */
    private final Provider<CheckTutorialViewed> f40734a;
    /* renamed from: b */
    private final Provider<bk> f40735b;

    public /* synthetic */ Object get() {
        return m49854a();
    }

    public C12626f(Provider<CheckTutorialViewed> provider, Provider<bk> provider2) {
        this.f40734a = provider;
        this.f40735b = provider2;
    }

    /* renamed from: a */
    public C10403e m49854a() {
        return C12626f.m49852a(this.f40734a, this.f40735b);
    }

    /* renamed from: a */
    public static C10403e m49852a(Provider<CheckTutorialViewed> provider, Provider<bk> provider2) {
        return new C10403e((CheckTutorialViewed) provider.get(), (bk) provider2.get());
    }

    /* renamed from: b */
    public static C12626f m49853b(Provider<CheckTutorialViewed> provider, Provider<bk> provider2) {
        return new C12626f(provider, provider2);
    }
}
