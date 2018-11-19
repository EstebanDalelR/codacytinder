package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11804j;
import com.tinder.fireboarding.domain.FireboardingGame.GameListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.n */
public final class C12469n implements Factory<GameListener> {
    /* renamed from: a */
    private final C8245a f40225a;
    /* renamed from: b */
    private final Provider<C11804j> f40226b;

    public /* synthetic */ Object get() {
        return m49051a();
    }

    public C12469n(C8245a c8245a, Provider<C11804j> provider) {
        this.f40225a = c8245a;
        this.f40226b = provider;
    }

    /* renamed from: a */
    public GameListener m49051a() {
        return C12469n.m49049a(this.f40225a, this.f40226b);
    }

    /* renamed from: a */
    public static GameListener m49049a(C8245a c8245a, Provider<C11804j> provider) {
        return C12469n.m49048a(c8245a, (C11804j) provider.get());
    }

    /* renamed from: b */
    public static C12469n m49050b(C8245a c8245a, Provider<C11804j> provider) {
        return new C12469n(c8245a, provider);
    }

    /* renamed from: a */
    public static GameListener m49048a(C8245a c8245a, C11804j c11804j) {
        return (GameListener) C15521i.a(c8245a.m35163a(c11804j), "Cannot return null from a non-@Nullable @Provides method");
    }
}
