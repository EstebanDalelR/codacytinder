package com.tinder.data.message;

import com.tinder.api.TinderApi;
import com.tinder.data.p322e.C10764a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.message.s */
public final class C12958s implements Factory<C8697q> {
    /* renamed from: a */
    private final Provider<TinderApi> f41511a;
    /* renamed from: b */
    private final Provider<C10839m> f41512b;
    /* renamed from: c */
    private final Provider<C10764a> f41513c;

    public /* synthetic */ Object get() {
        return m50686a();
    }

    public C12958s(Provider<TinderApi> provider, Provider<C10839m> provider2, Provider<C10764a> provider3) {
        this.f41511a = provider;
        this.f41512b = provider2;
        this.f41513c = provider3;
    }

    /* renamed from: a */
    public C8697q m50686a() {
        return C12958s.m50684a(this.f41511a, this.f41512b, this.f41513c);
    }

    /* renamed from: a */
    public static C8697q m50684a(Provider<TinderApi> provider, Provider<C10839m> provider2, Provider<C10764a> provider3) {
        return new C8697q((TinderApi) provider.get(), (C10839m) provider2.get(), (C10764a) provider3.get());
    }

    /* renamed from: b */
    public static C12958s m50685b(Provider<TinderApi> provider, Provider<C10839m> provider2, Provider<C10764a> provider3) {
        return new C12958s(provider, provider2, provider3);
    }
}
