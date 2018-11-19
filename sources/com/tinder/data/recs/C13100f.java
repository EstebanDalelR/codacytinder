package com.tinder.data.recs;

import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.MessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.recs.f */
public final class C13100f implements Factory<C10990e> {
    /* renamed from: a */
    private final Provider<MatchRepository> f41721a;
    /* renamed from: b */
    private final Provider<MessageRepository> f41722b;

    public /* synthetic */ Object get() {
        return m50957a();
    }

    public C13100f(Provider<MatchRepository> provider, Provider<MessageRepository> provider2) {
        this.f41721a = provider;
        this.f41722b = provider2;
    }

    /* renamed from: a */
    public C10990e m50957a() {
        return C13100f.m50955a(this.f41721a, this.f41722b);
    }

    /* renamed from: a */
    public static C10990e m50955a(Provider<MatchRepository> provider, Provider<MessageRepository> provider2) {
        return new C10990e((MatchRepository) provider.get(), (MessageRepository) provider2.get());
    }

    /* renamed from: b */
    public static C13100f m50956b(Provider<MatchRepository> provider, Provider<MessageRepository> provider2) {
        return new C13100f(provider, provider2);
    }
}
