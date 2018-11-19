package com.tinder.home;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.home.g */
public final class C13326g implements Factory<C11865f> {
    /* renamed from: a */
    private final Provider<CheckTutorialViewed> f42280a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f42281b;

    public /* synthetic */ Object get() {
        return m51570a();
    }

    public C13326g(Provider<CheckTutorialViewed> provider, Provider<AbTestUtility> provider2) {
        this.f42280a = provider;
        this.f42281b = provider2;
    }

    /* renamed from: a */
    public C11865f m51570a() {
        return C13326g.m51568a(this.f42280a, this.f42281b);
    }

    /* renamed from: a */
    public static C11865f m51568a(Provider<CheckTutorialViewed> provider, Provider<AbTestUtility> provider2) {
        return new C11865f((CheckTutorialViewed) provider.get(), (AbTestUtility) provider2.get());
    }

    /* renamed from: b */
    public static C13326g m51569b(Provider<CheckTutorialViewed> provider, Provider<AbTestUtility> provider2) {
        return new C13326g(provider, provider2);
    }
}
