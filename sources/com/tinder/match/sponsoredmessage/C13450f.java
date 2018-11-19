package com.tinder.match.sponsoredmessage;

import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.MessageRepository;
import com.tinder.sponsoredmessage.C15034e;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.sponsoredmessage.f */
public final class C13450f implements Factory<C12087e> {
    /* renamed from: a */
    private final Provider<C15034e> f42642a;
    /* renamed from: b */
    private final Provider<MatchRepository> f42643b;
    /* renamed from: c */
    private final Provider<MessageRepository> f42644c;

    public /* synthetic */ Object get() {
        return m51951a();
    }

    public C13450f(Provider<C15034e> provider, Provider<MatchRepository> provider2, Provider<MessageRepository> provider3) {
        this.f42642a = provider;
        this.f42643b = provider2;
        this.f42644c = provider3;
    }

    /* renamed from: a */
    public C12087e m51951a() {
        return C13450f.m51949a(this.f42642a, this.f42643b, this.f42644c);
    }

    /* renamed from: a */
    public static C12087e m51949a(Provider<C15034e> provider, Provider<MatchRepository> provider2, Provider<MessageRepository> provider3) {
        return new C12087e((C15034e) provider.get(), (MatchRepository) provider2.get(), (MessageRepository) provider3.get());
    }

    /* renamed from: b */
    public static C13450f m51950b(Provider<C15034e> provider, Provider<MatchRepository> provider2, Provider<MessageRepository> provider3) {
        return new C13450f(provider, provider2, provider3);
    }
}
