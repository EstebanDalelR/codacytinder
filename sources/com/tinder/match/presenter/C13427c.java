package com.tinder.match.presenter;

import com.tinder.domain.updates.InitialUpdatesStatusProvider;
import com.tinder.fastmatch.preview.C9402a;
import com.tinder.match.analytics.C12035a;
import com.tinder.match.analytics.C12037d;
import com.tinder.match.analytics.C12038f;
import com.tinder.match.provider.C9877d;
import com.tinder.match.provider.MatchesSearchQueryProvider;
import com.tinder.match.provider.MatchesSearchStateProvider;
import dagger.internal.Factory;
import io.reactivex.C15679f;
import javax.inject.Provider;

/* renamed from: com.tinder.match.presenter.c */
public final class C13427c implements Factory<C9865a> {
    /* renamed from: a */
    private final Provider<MatchesSearchStateProvider> f42590a;
    /* renamed from: b */
    private final Provider<MatchesSearchQueryProvider> f42591b;
    /* renamed from: c */
    private final Provider<InitialUpdatesStatusProvider> f42592c;
    /* renamed from: d */
    private final Provider<C9402a> f42593d;
    /* renamed from: e */
    private final Provider<C12037d> f42594e;
    /* renamed from: f */
    private final Provider<C12038f> f42595f;
    /* renamed from: g */
    private final Provider<C12035a> f42596g;
    /* renamed from: h */
    private final Provider<C9877d> f42597h;
    /* renamed from: i */
    private final Provider<C15679f> f42598i;
    /* renamed from: j */
    private final Provider<C15679f> f42599j;

    public /* synthetic */ Object get() {
        return m51906a();
    }

    public C13427c(Provider<MatchesSearchStateProvider> provider, Provider<MatchesSearchQueryProvider> provider2, Provider<InitialUpdatesStatusProvider> provider3, Provider<C9402a> provider4, Provider<C12037d> provider5, Provider<C12038f> provider6, Provider<C12035a> provider7, Provider<C9877d> provider8, Provider<C15679f> provider9, Provider<C15679f> provider10) {
        this.f42590a = provider;
        this.f42591b = provider2;
        this.f42592c = provider3;
        this.f42593d = provider4;
        this.f42594e = provider5;
        this.f42595f = provider6;
        this.f42596g = provider7;
        this.f42597h = provider8;
        this.f42598i = provider9;
        this.f42599j = provider10;
    }

    /* renamed from: a */
    public C9865a m51906a() {
        return C13427c.m51904a(this.f42590a, this.f42591b, this.f42592c, this.f42593d, this.f42594e, this.f42595f, this.f42596g, this.f42597h, this.f42598i, this.f42599j);
    }

    /* renamed from: a */
    public static C9865a m51904a(Provider<MatchesSearchStateProvider> provider, Provider<MatchesSearchQueryProvider> provider2, Provider<InitialUpdatesStatusProvider> provider3, Provider<C9402a> provider4, Provider<C12037d> provider5, Provider<C12038f> provider6, Provider<C12035a> provider7, Provider<C9877d> provider8, Provider<C15679f> provider9, Provider<C15679f> provider10) {
        return new C9865a((MatchesSearchStateProvider) provider.get(), (MatchesSearchQueryProvider) provider2.get(), (InitialUpdatesStatusProvider) provider3.get(), (C9402a) provider4.get(), (C12037d) provider5.get(), (C12038f) provider6.get(), (C12035a) provider7.get(), (C9877d) provider8.get(), (C15679f) provider9.get(), (C15679f) provider10.get());
    }

    /* renamed from: b */
    public static C13427c m51905b(Provider<MatchesSearchStateProvider> provider, Provider<MatchesSearchQueryProvider> provider2, Provider<InitialUpdatesStatusProvider> provider3, Provider<C9402a> provider4, Provider<C12037d> provider5, Provider<C12038f> provider6, Provider<C12035a> provider7, Provider<C9877d> provider8, Provider<C15679f> provider9, Provider<C15679f> provider10) {
        return new C13427c(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }
}
