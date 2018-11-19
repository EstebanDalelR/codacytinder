package com.tinder.app.dagger.module;

import com.tinder.main.BackPressInterceptor;
import com.tinder.match.provider.MatchesSearchStateProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.l */
public final class C12500l implements Factory<BackPressInterceptor> {
    /* renamed from: a */
    private final Provider<MatchesSearchStateProvider> f40294a;

    public /* synthetic */ Object get() {
        return m49170a();
    }

    /* renamed from: a */
    public BackPressInterceptor m49170a() {
        return C12500l.m49169a(this.f40294a);
    }

    /* renamed from: a */
    public static BackPressInterceptor m49169a(Provider<MatchesSearchStateProvider> provider) {
        return C12500l.m49168a((MatchesSearchStateProvider) provider.get());
    }

    /* renamed from: a */
    public static BackPressInterceptor m49168a(MatchesSearchStateProvider matchesSearchStateProvider) {
        return (BackPressInterceptor) C15521i.a(C8250h.m35194a(matchesSearchStateProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
