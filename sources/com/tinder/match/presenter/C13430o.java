package com.tinder.match.presenter;

import com.tinder.domain.match.usecase.CountMatches;
import com.tinder.match.provider.MatchesSearchQueryProvider;
import com.tinder.match.provider.MatchesSearchStateProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.presenter.o */
public final class C13430o implements Factory<C9872m> {
    /* renamed from: a */
    private final Provider<MatchesSearchStateProvider> f42609a;
    /* renamed from: b */
    private final Provider<MatchesSearchQueryProvider> f42610b;
    /* renamed from: c */
    private final Provider<CountMatches> f42611c;

    public /* synthetic */ Object get() {
        return m51912a();
    }

    public C13430o(Provider<MatchesSearchStateProvider> provider, Provider<MatchesSearchQueryProvider> provider2, Provider<CountMatches> provider3) {
        this.f42609a = provider;
        this.f42610b = provider2;
        this.f42611c = provider3;
    }

    /* renamed from: a */
    public C9872m m51912a() {
        return C13430o.m51910a(this.f42609a, this.f42610b, this.f42611c);
    }

    /* renamed from: a */
    public static C9872m m51910a(Provider<MatchesSearchStateProvider> provider, Provider<MatchesSearchQueryProvider> provider2, Provider<CountMatches> provider3) {
        return new C9872m((MatchesSearchStateProvider) provider.get(), (MatchesSearchQueryProvider) provider2.get(), (CountMatches) provider3.get());
    }

    /* renamed from: b */
    public static C13430o m51911b(Provider<MatchesSearchStateProvider> provider, Provider<MatchesSearchQueryProvider> provider2, Provider<CountMatches> provider3) {
        return new C13430o(provider, provider2, provider3);
    }
}
