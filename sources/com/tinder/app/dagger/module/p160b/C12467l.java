package com.tinder.app.dagger.module.p160b;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.fireboarding.domain.FireboardingGame;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.l */
public final class C12467l implements Factory<LifecycleObserver> {
    /* renamed from: a */
    private final C8245a f40220a;
    /* renamed from: b */
    private final Provider<FireboardingGame> f40221b;

    public /* synthetic */ Object get() {
        return m49043a();
    }

    public C12467l(C8245a c8245a, Provider<FireboardingGame> provider) {
        this.f40220a = c8245a;
        this.f40221b = provider;
    }

    /* renamed from: a */
    public LifecycleObserver m49043a() {
        return C12467l.m49041a(this.f40220a, this.f40221b);
    }

    /* renamed from: a */
    public static LifecycleObserver m49041a(C8245a c8245a, Provider<FireboardingGame> provider) {
        return C12467l.m49040a(c8245a, (FireboardingGame) provider.get());
    }

    /* renamed from: b */
    public static C12467l m49042b(C8245a c8245a, Provider<FireboardingGame> provider) {
        return new C12467l(c8245a, provider);
    }

    /* renamed from: a */
    public static LifecycleObserver m49040a(C8245a c8245a, FireboardingGame fireboardingGame) {
        return (LifecycleObserver) C15521i.a(c8245a.m35158a(fireboardingGame), "Cannot return null from a non-@Nullable @Provides method");
    }
}
