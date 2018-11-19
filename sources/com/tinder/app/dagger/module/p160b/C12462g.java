package com.tinder.app.dagger.module.p160b;

import android.content.SharedPreferences;
import com.tinder.fireboarding.domain.CompletedLevelRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.b.g */
public final class C12462g implements Factory<CompletedLevelRepository> {
    /* renamed from: a */
    private final C8245a f40204a;
    /* renamed from: b */
    private final Provider<SharedPreferences> f40205b;

    public /* synthetic */ Object get() {
        return m49023a();
    }

    public C12462g(C8245a c8245a, Provider<SharedPreferences> provider) {
        this.f40204a = c8245a;
        this.f40205b = provider;
    }

    /* renamed from: a */
    public CompletedLevelRepository m49023a() {
        return C12462g.m49021a(this.f40204a, this.f40205b);
    }

    /* renamed from: a */
    public static CompletedLevelRepository m49021a(C8245a c8245a, Provider<SharedPreferences> provider) {
        return C12462g.m49020a(c8245a, (SharedPreferences) provider.get());
    }

    /* renamed from: b */
    public static C12462g m49022b(C8245a c8245a, Provider<SharedPreferences> provider) {
        return new C12462g(c8245a, provider);
    }

    /* renamed from: a */
    public static CompletedLevelRepository m49020a(C8245a c8245a, SharedPreferences sharedPreferences) {
        return (CompletedLevelRepository) C15521i.a(c8245a.m35175b(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
