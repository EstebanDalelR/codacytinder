package com.tinder.match.p292c;

import com.tinder.match.p293e.C9864c;
import com.tinder.match.viewmodel.C9889e;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.c.h */
public final class C13421h implements Factory<C9864c> {
    /* renamed from: a */
    private final C9851g f42569a;
    /* renamed from: b */
    private final Provider<C9889e> f42570b;

    public /* synthetic */ Object get() {
        return m51887a();
    }

    public C13421h(C9851g c9851g, Provider<C9889e> provider) {
        this.f42569a = c9851g;
        this.f42570b = provider;
    }

    /* renamed from: a */
    public C9864c m51887a() {
        return C13421h.m51885a(this.f42569a, this.f42570b);
    }

    /* renamed from: a */
    public static C9864c m51885a(C9851g c9851g, Provider<C9889e> provider) {
        return C13421h.m51884a(c9851g, (C9889e) provider.get());
    }

    /* renamed from: b */
    public static C13421h m51886b(C9851g c9851g, Provider<C9889e> provider) {
        return new C13421h(c9851g, provider);
    }

    /* renamed from: a */
    public static C9864c m51884a(C9851g c9851g, C9889e c9889e) {
        return (C9864c) C15521i.a(c9851g.m40545a(c9889e), "Cannot return null from a non-@Nullable @Provides method");
    }
}
