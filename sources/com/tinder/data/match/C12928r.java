package com.tinder.data.match;

import com.tinder.domain.match.provider.UnMatchNotifier;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.match.r */
public final class C12928r implements Factory<C10798q> {
    /* renamed from: a */
    private final Provider<C8676s> f41442a;
    /* renamed from: b */
    private final Provider<C8674m> f41443b;
    /* renamed from: c */
    private final Provider<UnMatchNotifier> f41444c;

    public /* synthetic */ Object get() {
        return m50611a();
    }

    public C12928r(Provider<C8676s> provider, Provider<C8674m> provider2, Provider<UnMatchNotifier> provider3) {
        this.f41442a = provider;
        this.f41443b = provider2;
        this.f41444c = provider3;
    }

    /* renamed from: a */
    public C10798q m50611a() {
        return C12928r.m50609a(this.f41442a, this.f41443b, this.f41444c);
    }

    /* renamed from: a */
    public static C10798q m50609a(Provider<C8676s> provider, Provider<C8674m> provider2, Provider<UnMatchNotifier> provider3) {
        return new C10798q((C8676s) provider.get(), (C8674m) provider2.get(), (UnMatchNotifier) provider3.get());
    }

    /* renamed from: b */
    public static C12928r m50610b(Provider<C8676s> provider, Provider<C8674m> provider2, Provider<UnMatchNotifier> provider3) {
        return new C12928r(provider, provider2, provider3);
    }
}
