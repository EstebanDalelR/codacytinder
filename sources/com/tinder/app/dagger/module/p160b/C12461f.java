package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.AddProgressiveOnboardingUnlockEvent;
import com.tinder.fireboarding.domain.CompletedLevelRepository;
import com.tinder.fireboarding.domain.FireboardingGame.GameListener;
import com.tinder.recs.domain.usecase.IncrementRewindsAvailable;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.f */
public final class C12461f implements Factory<GameListener> {
    /* renamed from: a */
    private final C8245a f40200a;
    /* renamed from: b */
    private final Provider<CompletedLevelRepository> f40201b;
    /* renamed from: c */
    private final Provider<IncrementRewindsAvailable> f40202c;
    /* renamed from: d */
    private final Provider<AddProgressiveOnboardingUnlockEvent> f40203d;

    public /* synthetic */ Object get() {
        return m49019a();
    }

    public C12461f(C8245a c8245a, Provider<CompletedLevelRepository> provider, Provider<IncrementRewindsAvailable> provider2, Provider<AddProgressiveOnboardingUnlockEvent> provider3) {
        this.f40200a = c8245a;
        this.f40201b = provider;
        this.f40202c = provider2;
        this.f40203d = provider3;
    }

    /* renamed from: a */
    public GameListener m49019a() {
        return C12461f.m49017a(this.f40200a, this.f40201b, this.f40202c, this.f40203d);
    }

    /* renamed from: a */
    public static GameListener m49017a(C8245a c8245a, Provider<CompletedLevelRepository> provider, Provider<IncrementRewindsAvailable> provider2, Provider<AddProgressiveOnboardingUnlockEvent> provider3) {
        return C12461f.m49016a(c8245a, (CompletedLevelRepository) provider.get(), (IncrementRewindsAvailable) provider2.get(), (AddProgressiveOnboardingUnlockEvent) provider3.get());
    }

    /* renamed from: b */
    public static C12461f m49018b(C8245a c8245a, Provider<CompletedLevelRepository> provider, Provider<IncrementRewindsAvailable> provider2, Provider<AddProgressiveOnboardingUnlockEvent> provider3) {
        return new C12461f(c8245a, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static GameListener m49016a(C8245a c8245a, CompletedLevelRepository completedLevelRepository, IncrementRewindsAvailable incrementRewindsAvailable, AddProgressiveOnboardingUnlockEvent addProgressiveOnboardingUnlockEvent) {
        return (GameListener) C15521i.a(c8245a.m35162a(completedLevelRepository, incrementRewindsAvailable, addProgressiveOnboardingUnlockEvent), "Cannot return null from a non-@Nullable @Provides method");
    }
}
