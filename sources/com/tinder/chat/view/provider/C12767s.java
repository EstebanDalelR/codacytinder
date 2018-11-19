package com.tinder.chat.view.provider;

import com.tinder.chat.view.model.C8502w;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.chat.view.provider.s */
public final class C12767s implements Factory<C8516r> {
    /* renamed from: a */
    private final Provider<C8502w> f41149a;
    /* renamed from: b */
    private final Provider<C8509n> f41150b;
    /* renamed from: c */
    private final Provider<ab> f41151c;

    public /* synthetic */ Object get() {
        return m50222a();
    }

    public C12767s(Provider<C8502w> provider, Provider<C8509n> provider2, Provider<ab> provider3) {
        this.f41149a = provider;
        this.f41150b = provider2;
        this.f41151c = provider3;
    }

    /* renamed from: a */
    public C8516r m50222a() {
        return C12767s.m50220a(this.f41149a, this.f41150b, this.f41151c);
    }

    /* renamed from: a */
    public static C8516r m50220a(Provider<C8502w> provider, Provider<C8509n> provider2, Provider<ab> provider3) {
        return new C8516r((C8502w) provider.get(), (C8509n) provider2.get(), (ab) provider3.get());
    }

    /* renamed from: b */
    public static C12767s m50221b(Provider<C8502w> provider, Provider<C8509n> provider2, Provider<ab> provider3) {
        return new C12767s(provider, provider2, provider3);
    }
}
