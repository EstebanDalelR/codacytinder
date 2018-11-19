package com.tinder.match.p292c;

import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.match.usecase.GetNewMatches;
import com.tinder.domain.message.MessageRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.c.d */
public final class C13418d implements Factory<GetNewMatches> {
    /* renamed from: a */
    private final C9850a f42564a;
    /* renamed from: b */
    private final Provider<MatchRepository> f42565b;
    /* renamed from: c */
    private final Provider<MessageRepository> f42566c;

    public /* synthetic */ Object get() {
        return m51876a();
    }

    public C13418d(C9850a c9850a, Provider<MatchRepository> provider, Provider<MessageRepository> provider2) {
        this.f42564a = c9850a;
        this.f42565b = provider;
        this.f42566c = provider2;
    }

    /* renamed from: a */
    public GetNewMatches m51876a() {
        return C13418d.m51874a(this.f42564a, this.f42565b, this.f42566c);
    }

    /* renamed from: a */
    public static GetNewMatches m51874a(C9850a c9850a, Provider<MatchRepository> provider, Provider<MessageRepository> provider2) {
        return C13418d.m51873a(c9850a, (MatchRepository) provider.get(), (MessageRepository) provider2.get());
    }

    /* renamed from: b */
    public static C13418d m51875b(C9850a c9850a, Provider<MatchRepository> provider, Provider<MessageRepository> provider2) {
        return new C13418d(c9850a, provider, provider2);
    }

    /* renamed from: a */
    public static GetNewMatches m51873a(C9850a c9850a, MatchRepository matchRepository, MessageRepository messageRepository) {
        return (GetNewMatches) C15521i.a(c9850a.m40542a(matchRepository, messageRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
