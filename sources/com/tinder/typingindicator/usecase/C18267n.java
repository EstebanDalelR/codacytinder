package com.tinder.typingindicator.usecase;

import com.tinder.typingindicator.model.TypingIndicatorExperimentUtility;
import com.tinder.typingindicator.repository.TypingIndicatorRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.usecase.n */
public final class C18267n implements Factory<C17183m> {
    /* renamed from: a */
    private final Provider<TypingIndicatorRepository> f56589a;
    /* renamed from: b */
    private final Provider<TypingIndicatorExperimentUtility> f56590b;

    public /* synthetic */ Object get() {
        return m66179a();
    }

    public C18267n(Provider<TypingIndicatorRepository> provider, Provider<TypingIndicatorExperimentUtility> provider2) {
        this.f56589a = provider;
        this.f56590b = provider2;
    }

    /* renamed from: a */
    public C17183m m66179a() {
        return C18267n.m66177a(this.f56589a, this.f56590b);
    }

    /* renamed from: a */
    public static C17183m m66177a(Provider<TypingIndicatorRepository> provider, Provider<TypingIndicatorExperimentUtility> provider2) {
        return new C17183m((TypingIndicatorRepository) provider.get(), (TypingIndicatorExperimentUtility) provider2.get());
    }

    /* renamed from: b */
    public static C18267n m66178b(Provider<TypingIndicatorRepository> provider, Provider<TypingIndicatorExperimentUtility> provider2) {
        return new C18267n(provider, provider2);
    }
}
