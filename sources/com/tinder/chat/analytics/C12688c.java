package com.tinder.chat.analytics;

import com.tinder.common.utils.StringLinkDetector;
import com.tinder.domain.match.usecase.GetMatch;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.typingindicator.usecase.C17174d;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.analytics.c */
public final class C12688c implements Factory<C10522a> {
    /* renamed from: a */
    private final Provider<MessageRepository> f40962a;
    /* renamed from: b */
    private final Provider<GetMatch> f40963b;
    /* renamed from: c */
    private final Provider<MetaGateway> f40964c;
    /* renamed from: d */
    private final Provider<StringLinkDetector> f40965d;
    /* renamed from: e */
    private final Provider<C17174d> f40966e;

    public /* synthetic */ Object get() {
        return m49983a();
    }

    public C12688c(Provider<MessageRepository> provider, Provider<GetMatch> provider2, Provider<MetaGateway> provider3, Provider<StringLinkDetector> provider4, Provider<C17174d> provider5) {
        this.f40962a = provider;
        this.f40963b = provider2;
        this.f40964c = provider3;
        this.f40965d = provider4;
        this.f40966e = provider5;
    }

    /* renamed from: a */
    public C10522a m49983a() {
        return C12688c.m49981a(this.f40962a, this.f40963b, this.f40964c, this.f40965d, this.f40966e);
    }

    /* renamed from: a */
    public static C10522a m49981a(Provider<MessageRepository> provider, Provider<GetMatch> provider2, Provider<MetaGateway> provider3, Provider<StringLinkDetector> provider4, Provider<C17174d> provider5) {
        return new C10522a((MessageRepository) provider.get(), (GetMatch) provider2.get(), (MetaGateway) provider3.get(), (StringLinkDetector) provider4.get(), (C17174d) provider5.get());
    }

    /* renamed from: b */
    public static C12688c m49982b(Provider<MessageRepository> provider, Provider<GetMatch> provider2, Provider<MetaGateway> provider3, Provider<StringLinkDetector> provider4, Provider<C17174d> provider5) {
        return new C12688c(provider, provider2, provider3, provider4, provider5);
    }
}
