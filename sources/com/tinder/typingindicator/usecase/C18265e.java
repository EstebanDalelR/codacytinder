package com.tinder.typingindicator.usecase;

import com.tinder.typingindicator.repository.TypingIndicatorRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.usecase.e */
public final class C18265e implements Factory<C17174d> {
    /* renamed from: a */
    private final Provider<TypingIndicatorRepository> f56586a;

    public /* synthetic */ Object get() {
        return m66173a();
    }

    public C18265e(Provider<TypingIndicatorRepository> provider) {
        this.f56586a = provider;
    }

    /* renamed from: a */
    public C17174d m66173a() {
        return C18265e.m66171a(this.f56586a);
    }

    /* renamed from: a */
    public static C17174d m66171a(Provider<TypingIndicatorRepository> provider) {
        return new C17174d((TypingIndicatorRepository) provider.get());
    }

    /* renamed from: b */
    public static C18265e m66172b(Provider<TypingIndicatorRepository> provider) {
        return new C18265e(provider);
    }
}
