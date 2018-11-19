package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11820s;
import com.tinder.fireboarding.domain.CompletedLevelRepository;
import com.tinder.fireboarding.domain.FireboardingGame.GameListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.e */
public final class C12460e implements Factory<GameListener> {
    /* renamed from: a */
    private final C8245a f40197a;
    /* renamed from: b */
    private final Provider<CompletedLevelRepository> f40198b;
    /* renamed from: c */
    private final Provider<C11820s> f40199c;

    public /* synthetic */ Object get() {
        return m49015a();
    }

    public C12460e(C8245a c8245a, Provider<CompletedLevelRepository> provider, Provider<C11820s> provider2) {
        this.f40197a = c8245a;
        this.f40198b = provider;
        this.f40199c = provider2;
    }

    /* renamed from: a */
    public GameListener m49015a() {
        return C12460e.m49013a(this.f40197a, this.f40198b, this.f40199c);
    }

    /* renamed from: a */
    public static GameListener m49013a(C8245a c8245a, Provider<CompletedLevelRepository> provider, Provider<C11820s> provider2) {
        return C12460e.m49012a(c8245a, (CompletedLevelRepository) provider.get(), (C11820s) provider2.get());
    }

    /* renamed from: b */
    public static C12460e m49014b(C8245a c8245a, Provider<CompletedLevelRepository> provider, Provider<C11820s> provider2) {
        return new C12460e(c8245a, provider, provider2);
    }

    /* renamed from: a */
    public static GameListener m49012a(C8245a c8245a, CompletedLevelRepository completedLevelRepository, C11820s c11820s) {
        return (GameListener) C15521i.a(c8245a.m35161a(completedLevelRepository, c11820s), "Cannot return null from a non-@Nullable @Provides method");
    }
}
