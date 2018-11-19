package com.tinder.chat.view.provider;

import com.tinder.chat.view.model.C12750s;
import com.tinder.domain.match.usecase.GetMatch;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.provider.c */
public final class C12757c implements Factory<C8506a> {
    /* renamed from: a */
    private final Provider<String> f41136a;
    /* renamed from: b */
    private final Provider<GetMatch> f41137b;
    /* renamed from: c */
    private final Provider<C12750s> f41138c;

    public /* synthetic */ Object get() {
        return m50198a();
    }

    public C12757c(Provider<String> provider, Provider<GetMatch> provider2, Provider<C12750s> provider3) {
        this.f41136a = provider;
        this.f41137b = provider2;
        this.f41138c = provider3;
    }

    /* renamed from: a */
    public C8506a m50198a() {
        return C12757c.m50196a(this.f41136a, this.f41137b, this.f41138c);
    }

    /* renamed from: a */
    public static C8506a m50196a(Provider<String> provider, Provider<GetMatch> provider2, Provider<C12750s> provider3) {
        return new C8506a((String) provider.get(), (GetMatch) provider2.get(), (C12750s) provider3.get());
    }

    /* renamed from: b */
    public static C12757c m50197b(Provider<String> provider, Provider<GetMatch> provider2, Provider<C12750s> provider3) {
        return new C12757c(provider, provider2, provider3);
    }
}
