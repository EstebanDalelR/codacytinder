package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11802c;
import com.tinder.fireboarding.domain.FireboardingGame;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.d */
public final class C12459d implements Factory<C11802c> {
    /* renamed from: a */
    private final C8245a f40195a;
    /* renamed from: b */
    private final Provider<FireboardingGame> f40196b;

    public /* synthetic */ Object get() {
        return m49011a();
    }

    public C12459d(C8245a c8245a, Provider<FireboardingGame> provider) {
        this.f40195a = c8245a;
        this.f40196b = provider;
    }

    /* renamed from: a */
    public C11802c m49011a() {
        return C12459d.m49009a(this.f40195a, this.f40196b);
    }

    /* renamed from: a */
    public static C11802c m49009a(C8245a c8245a, Provider<FireboardingGame> provider) {
        return C12459d.m49008a(c8245a, (FireboardingGame) provider.get());
    }

    /* renamed from: b */
    public static C12459d m49010b(C8245a c8245a, Provider<FireboardingGame> provider) {
        return new C12459d(c8245a, provider);
    }

    /* renamed from: a */
    public static C11802c m49008a(C8245a c8245a, FireboardingGame fireboardingGame) {
        return (C11802c) C15521i.a(c8245a.m35176b(fireboardingGame), "Cannot return null from a non-@Nullable @Provides method");
    }
}
