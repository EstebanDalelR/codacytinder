package com.tinder.chat.view.action;

import com.tinder.chat.analytics.C10538s;
import com.tinder.chat.analytics.ah;
import com.tinder.chat.analytics.aj;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.action.o */
public final class C12743o implements Factory<C10588n> {
    /* renamed from: a */
    private final Provider<ChatContextualMenuDisplayAction> f41097a;
    /* renamed from: b */
    private final Provider<MatchProfileDisplayAction> f41098b;
    /* renamed from: c */
    private final Provider<aj> f41099c;
    /* renamed from: d */
    private final Provider<ah> f41100d;
    /* renamed from: e */
    private final Provider<C10538s> f41101e;

    public /* synthetic */ Object get() {
        return m50150a();
    }

    public C12743o(Provider<ChatContextualMenuDisplayAction> provider, Provider<MatchProfileDisplayAction> provider2, Provider<aj> provider3, Provider<ah> provider4, Provider<C10538s> provider5) {
        this.f41097a = provider;
        this.f41098b = provider2;
        this.f41099c = provider3;
        this.f41100d = provider4;
        this.f41101e = provider5;
    }

    /* renamed from: a */
    public C10588n m50150a() {
        return C12743o.m50148a(this.f41097a, this.f41098b, this.f41099c, this.f41100d, this.f41101e);
    }

    /* renamed from: a */
    public static C10588n m50148a(Provider<ChatContextualMenuDisplayAction> provider, Provider<MatchProfileDisplayAction> provider2, Provider<aj> provider3, Provider<ah> provider4, Provider<C10538s> provider5) {
        return new C10588n((ChatContextualMenuDisplayAction) provider.get(), (MatchProfileDisplayAction) provider2.get(), (aj) provider3.get(), (ah) provider4.get(), (C10538s) provider5.get());
    }

    /* renamed from: b */
    public static C12743o m50149b(Provider<ChatContextualMenuDisplayAction> provider, Provider<MatchProfileDisplayAction> provider2, Provider<aj> provider3, Provider<ah> provider4, Provider<C10538s> provider5) {
        return new C12743o(provider, provider2, provider3, provider4, provider5);
    }
}
