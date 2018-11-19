package com.tinder.match.provider;

import com.tinder.domain.match.usecase.GetMessagesMatches;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.provider.k */
public final class C13438k implements Factory<C9880i> {
    /* renamed from: a */
    private final Provider<GetMessagesMatches> f42627a;
    /* renamed from: b */
    private final Provider<MatchesSearchQueryProvider> f42628b;

    public /* synthetic */ Object get() {
        return m51936a();
    }

    public C13438k(Provider<GetMessagesMatches> provider, Provider<MatchesSearchQueryProvider> provider2) {
        this.f42627a = provider;
        this.f42628b = provider2;
    }

    /* renamed from: a */
    public C9880i m51936a() {
        return C13438k.m51934a(this.f42627a, this.f42628b);
    }

    /* renamed from: a */
    public static C9880i m51934a(Provider<GetMessagesMatches> provider, Provider<MatchesSearchQueryProvider> provider2) {
        return new C9880i((GetMessagesMatches) provider.get(), (MatchesSearchQueryProvider) provider2.get());
    }

    /* renamed from: b */
    public static C13438k m51935b(Provider<GetMessagesMatches> provider, Provider<MatchesSearchQueryProvider> provider2) {
        return new C13438k(provider, provider2);
    }
}
