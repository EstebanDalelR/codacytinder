package com.tinder.app.dagger.module.toppicks;

import com.tinder.core.experiment.AbTestUtility;
import com.tinder.toppicks.SettingsLauncher;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.toppicks.g */
public final class C12537g implements Factory<SettingsLauncher> {
    /* renamed from: a */
    private final C8254a f40394a;
    /* renamed from: b */
    private final Provider<AbTestUtility> f40395b;

    public /* synthetic */ Object get() {
        return m49339a();
    }

    public C12537g(C8254a c8254a, Provider<AbTestUtility> provider) {
        this.f40394a = c8254a;
        this.f40395b = provider;
    }

    /* renamed from: a */
    public SettingsLauncher m49339a() {
        return C12537g.m49337a(this.f40394a, this.f40395b);
    }

    /* renamed from: a */
    public static SettingsLauncher m49337a(C8254a c8254a, Provider<AbTestUtility> provider) {
        return C12537g.m49336a(c8254a, (AbTestUtility) provider.get());
    }

    /* renamed from: b */
    public static C12537g m49338b(C8254a c8254a, Provider<AbTestUtility> provider) {
        return new C12537g(c8254a, provider);
    }

    /* renamed from: a */
    public static SettingsLauncher m49336a(C8254a c8254a, AbTestUtility abTestUtility) {
        return (SettingsLauncher) C15521i.a(c8254a.m35233a(abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
