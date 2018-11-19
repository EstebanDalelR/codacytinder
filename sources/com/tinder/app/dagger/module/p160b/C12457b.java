package com.tinder.app.dagger.module.p160b;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.fireboarding.domain.AddProgressiveOnboardingUnlockEvent;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.b */
public final class C12457b implements Factory<AddProgressiveOnboardingUnlockEvent> {
    /* renamed from: a */
    private final C8245a f40191a;
    /* renamed from: b */
    private final Provider<C2630h> f40192b;

    public /* synthetic */ Object get() {
        return m49003a();
    }

    public C12457b(C8245a c8245a, Provider<C2630h> provider) {
        this.f40191a = c8245a;
        this.f40192b = provider;
    }

    /* renamed from: a */
    public AddProgressiveOnboardingUnlockEvent m49003a() {
        return C12457b.m49001a(this.f40191a, this.f40192b);
    }

    /* renamed from: a */
    public static AddProgressiveOnboardingUnlockEvent m49001a(C8245a c8245a, Provider<C2630h> provider) {
        return C12457b.m49000a(c8245a, (C2630h) provider.get());
    }

    /* renamed from: b */
    public static C12457b m49002b(C8245a c8245a, Provider<C2630h> provider) {
        return new C12457b(c8245a, provider);
    }

    /* renamed from: a */
    public static AddProgressiveOnboardingUnlockEvent m49000a(C8245a c8245a, C2630h c2630h) {
        return (AddProgressiveOnboardingUnlockEvent) C15521i.a(c8245a.m35159a(c2630h), "Cannot return null from a non-@Nullable @Provides method");
    }
}
