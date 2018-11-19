package com.tinder.app.dagger.module.p160b;

import com.tinder.fireboarding.domain.C11800b;
import com.tinder.fireboarding.domain.CompletedLevelRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.c */
public final class C12458c implements Factory<C11800b> {
    /* renamed from: a */
    private final C8245a f40193a;
    /* renamed from: b */
    private final Provider<CompletedLevelRepository> f40194b;

    public /* synthetic */ Object get() {
        return m49007a();
    }

    public C12458c(C8245a c8245a, Provider<CompletedLevelRepository> provider) {
        this.f40193a = c8245a;
        this.f40194b = provider;
    }

    /* renamed from: a */
    public C11800b m49007a() {
        return C12458c.m49005a(this.f40193a, this.f40194b);
    }

    /* renamed from: a */
    public static C11800b m49005a(C8245a c8245a, Provider<CompletedLevelRepository> provider) {
        return C12458c.m49004a(c8245a, (CompletedLevelRepository) provider.get());
    }

    /* renamed from: b */
    public static C12458c m49006b(C8245a c8245a, Provider<CompletedLevelRepository> provider) {
        return new C12458c(c8245a, provider);
    }

    /* renamed from: a */
    public static C11800b m49004a(C8245a c8245a, CompletedLevelRepository completedLevelRepository) {
        return (C11800b) C15521i.a(c8245a.m35165a(completedLevelRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
