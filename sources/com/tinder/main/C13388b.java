package com.tinder.main;

import com.tinder.common.logger.Logger;
import com.tinder.domain.match.usecase.ObserveHasUntouchedMatches;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.main.b */
public final class C13388b implements Factory<C11991a> {
    /* renamed from: a */
    private final Provider<ObserveHasUntouchedMatches> f42447a;
    /* renamed from: b */
    private final Provider<Logger> f42448b;

    public /* synthetic */ Object get() {
        return m51788a();
    }

    public C13388b(Provider<ObserveHasUntouchedMatches> provider, Provider<Logger> provider2) {
        this.f42447a = provider;
        this.f42448b = provider2;
    }

    /* renamed from: a */
    public C11991a m51788a() {
        return C13388b.m51786a(this.f42447a, this.f42448b);
    }

    /* renamed from: a */
    public static C11991a m51786a(Provider<ObserveHasUntouchedMatches> provider, Provider<Logger> provider2) {
        return new C11991a((ObserveHasUntouchedMatches) provider.get(), (Logger) provider2.get());
    }

    /* renamed from: b */
    public static C13388b m51787b(Provider<ObserveHasUntouchedMatches> provider, Provider<Logger> provider2) {
        return new C13388b(provider, provider2);
    }
}
