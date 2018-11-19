package com.tinder.app.dagger.module;

import com.tinder.match.provider.MatchesSearchStateProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.m */
public final class C12501m implements Factory<MatchesSearchStateProvider> {
    /* renamed from: a */
    private static final C12501m f40295a = new C12501m();

    public /* synthetic */ Object get() {
        return m49174a();
    }

    /* renamed from: a */
    public MatchesSearchStateProvider m49174a() {
        return C12501m.m49171b();
    }

    /* renamed from: b */
    public static MatchesSearchStateProvider m49171b() {
        return C12501m.m49173d();
    }

    /* renamed from: c */
    public static C12501m m49172c() {
        return f40295a;
    }

    /* renamed from: d */
    public static MatchesSearchStateProvider m49173d() {
        return (MatchesSearchStateProvider) C15521i.a(C8250h.m35195a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
