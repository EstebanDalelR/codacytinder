package com.tinder.app.dagger.module.toppicks;

import com.tinder.paywall.legacy.LegacyPaywallLauncher;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.toppicks.b */
public final class C12532b implements Factory<LegacyPaywallLauncher> {
    /* renamed from: a */
    private final C8254a f40387a;

    public /* synthetic */ Object get() {
        return m49319a();
    }

    public C12532b(C8254a c8254a) {
        this.f40387a = c8254a;
    }

    /* renamed from: a */
    public LegacyPaywallLauncher m49319a() {
        return C12532b.m49316a(this.f40387a);
    }

    /* renamed from: a */
    public static LegacyPaywallLauncher m49316a(C8254a c8254a) {
        return C12532b.m49318c(c8254a);
    }

    /* renamed from: b */
    public static C12532b m49317b(C8254a c8254a) {
        return new C12532b(c8254a);
    }

    /* renamed from: c */
    public static LegacyPaywallLauncher m49318c(C8254a c8254a) {
        return (LegacyPaywallLauncher) C15521i.a(c8254a.m35231a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
