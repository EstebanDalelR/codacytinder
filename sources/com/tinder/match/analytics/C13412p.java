package com.tinder.match.analytics;

import com.tinder.domain.match.usecase.GetMessagesMatches;
import com.tinder.domain.match.usecase.GetNewMatches;
import com.tinder.match.provider.MatchesSearchQueryProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.analytics.p */
public final class C13412p implements Factory<C9845l> {
    /* renamed from: a */
    private final Provider<GetMessagesMatches> f42548a;
    /* renamed from: b */
    private final Provider<GetNewMatches> f42549b;
    /* renamed from: c */
    private final Provider<MatchesSearchQueryProvider> f42550c;
    /* renamed from: d */
    private final Provider<C9846q> f42551d;
    /* renamed from: e */
    private final Provider<C9848s> f42552e;

    public /* synthetic */ Object get() {
        return m51855a();
    }

    public C13412p(Provider<GetMessagesMatches> provider, Provider<GetNewMatches> provider2, Provider<MatchesSearchQueryProvider> provider3, Provider<C9846q> provider4, Provider<C9848s> provider5) {
        this.f42548a = provider;
        this.f42549b = provider2;
        this.f42550c = provider3;
        this.f42551d = provider4;
        this.f42552e = provider5;
    }

    /* renamed from: a */
    public C9845l m51855a() {
        return C13412p.m51853a(this.f42548a, this.f42549b, this.f42550c, this.f42551d, this.f42552e);
    }

    /* renamed from: a */
    public static C9845l m51853a(Provider<GetMessagesMatches> provider, Provider<GetNewMatches> provider2, Provider<MatchesSearchQueryProvider> provider3, Provider<C9846q> provider4, Provider<C9848s> provider5) {
        return new C9845l((GetMessagesMatches) provider.get(), (GetNewMatches) provider2.get(), (MatchesSearchQueryProvider) provider3.get(), (C9846q) provider4.get(), (C9848s) provider5.get());
    }

    /* renamed from: b */
    public static C13412p m51854b(Provider<GetMessagesMatches> provider, Provider<GetNewMatches> provider2, Provider<MatchesSearchQueryProvider> provider3, Provider<C9846q> provider4, Provider<C9848s> provider5) {
        return new C13412p(provider, provider2, provider3, provider4, provider5);
    }
}
