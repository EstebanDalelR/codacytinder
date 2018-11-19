package com.tinder.typingindicator.usecase;

import com.tinder.typingindicator.model.TypingIndicatorExperimentUtility;
import com.tinder.typingindicator.repository.TypingIndicatorRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.usecase.g */
public final class C18266g implements Factory<C17175f> {
    /* renamed from: a */
    private final Provider<TypingIndicatorRepository> f56587a;
    /* renamed from: b */
    private final Provider<TypingIndicatorExperimentUtility> f56588b;

    public /* synthetic */ Object get() {
        return m66176a();
    }

    public C18266g(Provider<TypingIndicatorRepository> provider, Provider<TypingIndicatorExperimentUtility> provider2) {
        this.f56587a = provider;
        this.f56588b = provider2;
    }

    /* renamed from: a */
    public C17175f m66176a() {
        return C18266g.m66174a(this.f56587a, this.f56588b);
    }

    /* renamed from: a */
    public static C17175f m66174a(Provider<TypingIndicatorRepository> provider, Provider<TypingIndicatorExperimentUtility> provider2) {
        return new C17175f((TypingIndicatorRepository) provider.get(), (TypingIndicatorExperimentUtility) provider2.get());
    }

    /* renamed from: b */
    public static C18266g m66175b(Provider<TypingIndicatorRepository> provider, Provider<TypingIndicatorExperimentUtility> provider2) {
        return new C18266g(provider, provider2);
    }
}
