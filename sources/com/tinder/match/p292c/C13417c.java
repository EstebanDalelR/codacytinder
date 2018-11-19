package com.tinder.match.p292c;

import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.match.usecase.GetMessagesMatches;
import com.tinder.domain.message.MessageRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.c.c */
public final class C13417c implements Factory<GetMessagesMatches> {
    /* renamed from: a */
    private final C9850a f42561a;
    /* renamed from: b */
    private final Provider<MatchRepository> f42562b;
    /* renamed from: c */
    private final Provider<MessageRepository> f42563c;

    public /* synthetic */ Object get() {
        return m51872a();
    }

    public C13417c(C9850a c9850a, Provider<MatchRepository> provider, Provider<MessageRepository> provider2) {
        this.f42561a = c9850a;
        this.f42562b = provider;
        this.f42563c = provider2;
    }

    /* renamed from: a */
    public GetMessagesMatches m51872a() {
        return C13417c.m51870a(this.f42561a, this.f42562b, this.f42563c);
    }

    /* renamed from: a */
    public static GetMessagesMatches m51870a(C9850a c9850a, Provider<MatchRepository> provider, Provider<MessageRepository> provider2) {
        return C13417c.m51869a(c9850a, (MatchRepository) provider.get(), (MessageRepository) provider2.get());
    }

    /* renamed from: b */
    public static C13417c m51871b(C9850a c9850a, Provider<MatchRepository> provider, Provider<MessageRepository> provider2) {
        return new C13417c(c9850a, provider, provider2);
    }

    /* renamed from: a */
    public static GetMessagesMatches m51869a(C9850a c9850a, MatchRepository matchRepository, MessageRepository messageRepository) {
        return (GetMessagesMatches) C15521i.a(c9850a.m40544b(matchRepository, messageRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
