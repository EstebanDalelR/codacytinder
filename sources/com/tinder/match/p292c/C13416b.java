package com.tinder.match.p292c;

import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.match.usecase.CountMatches;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.c.b */
public final class C13416b implements Factory<CountMatches> {
    /* renamed from: a */
    private final C9850a f42559a;
    /* renamed from: b */
    private final Provider<MatchRepository> f42560b;

    public /* synthetic */ Object get() {
        return m51868a();
    }

    public C13416b(C9850a c9850a, Provider<MatchRepository> provider) {
        this.f42559a = c9850a;
        this.f42560b = provider;
    }

    /* renamed from: a */
    public CountMatches m51868a() {
        return C13416b.m51866a(this.f42559a, this.f42560b);
    }

    /* renamed from: a */
    public static CountMatches m51866a(C9850a c9850a, Provider<MatchRepository> provider) {
        return C13416b.m51865a(c9850a, (MatchRepository) provider.get());
    }

    /* renamed from: b */
    public static C13416b m51867b(C9850a c9850a, Provider<MatchRepository> provider) {
        return new C13416b(c9850a, provider);
    }

    /* renamed from: a */
    public static CountMatches m51865a(C9850a c9850a, MatchRepository matchRepository) {
        return (CountMatches) C15521i.a(c9850a.m40541a(matchRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
