package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11809n;
import com.tinder.fireboarding.domain.CompletedLevelRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.q */
public final class C12472q implements Factory<C11809n> {
    /* renamed from: a */
    private final C8245a f40231a;
    /* renamed from: b */
    private final Provider<CompletedLevelRepository> f40232b;

    public /* synthetic */ Object get() {
        return m49063a();
    }

    public C12472q(C8245a c8245a, Provider<CompletedLevelRepository> provider) {
        this.f40231a = c8245a;
        this.f40232b = provider;
    }

    /* renamed from: a */
    public C11809n m49063a() {
        return C12472q.m49061a(this.f40231a, this.f40232b);
    }

    /* renamed from: a */
    public static C11809n m49061a(C8245a c8245a, Provider<CompletedLevelRepository> provider) {
        return C12472q.m49060a(c8245a, (CompletedLevelRepository) provider.get());
    }

    /* renamed from: b */
    public static C12472q m49062b(C8245a c8245a, Provider<CompletedLevelRepository> provider) {
        return new C12472q(c8245a, provider);
    }

    /* renamed from: a */
    public static C11809n m49060a(C8245a c8245a, CompletedLevelRepository completedLevelRepository) {
        return (C11809n) C15521i.a(c8245a.m35178b(completedLevelRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
