package com.tinder.data.profile;

import com.tinder.data.profile.persistence.ProfileDataStore;
import com.tinder.domain.onboarding.TutorialToOnboardingTutorialNameAdapter;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.r */
public final class C13085r implements Factory<C10975q> {
    /* renamed from: a */
    private final Provider<C8761i> f41686a;
    /* renamed from: b */
    private final Provider<ProfileDataStore> f41687b;
    /* renamed from: c */
    private final Provider<TutorialToOnboardingTutorialNameAdapter> f41688c;

    public /* synthetic */ Object get() {
        return m50918a();
    }

    public C13085r(Provider<C8761i> provider, Provider<ProfileDataStore> provider2, Provider<TutorialToOnboardingTutorialNameAdapter> provider3) {
        this.f41686a = provider;
        this.f41687b = provider2;
        this.f41688c = provider3;
    }

    /* renamed from: a */
    public C10975q m50918a() {
        return C13085r.m50916a(this.f41686a, this.f41687b, this.f41688c);
    }

    /* renamed from: a */
    public static C10975q m50916a(Provider<C8761i> provider, Provider<ProfileDataStore> provider2, Provider<TutorialToOnboardingTutorialNameAdapter> provider3) {
        return new C10975q((C8761i) provider.get(), (ProfileDataStore) provider2.get(), (TutorialToOnboardingTutorialNameAdapter) provider3.get());
    }

    /* renamed from: b */
    public static C13085r m50917b(Provider<C8761i> provider, Provider<ProfileDataStore> provider2, Provider<TutorialToOnboardingTutorialNameAdapter> provider3) {
        return new C13085r(provider, provider2, provider3);
    }
}
