package com.tinder.settings.feed.provider;

import com.tinder.base.p172b.C8301a;
import com.tinder.domain.settings.feed.usecase.LoadFeedSettings;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.feed.provider.c */
public final class C18070c implements Factory<C14879a> {
    /* renamed from: a */
    private final Provider<LoadFeedSettings> f56114a;
    /* renamed from: b */
    private final Provider<C8301a> f56115b;

    public /* synthetic */ Object get() {
        return m65577a();
    }

    public C18070c(Provider<LoadFeedSettings> provider, Provider<C8301a> provider2) {
        this.f56114a = provider;
        this.f56115b = provider2;
    }

    /* renamed from: a */
    public C14879a m65577a() {
        return C18070c.m65575a(this.f56114a, this.f56115b);
    }

    /* renamed from: a */
    public static C14879a m65575a(Provider<LoadFeedSettings> provider, Provider<C8301a> provider2) {
        return new C14879a((LoadFeedSettings) provider.get(), (C8301a) provider2.get());
    }

    /* renamed from: b */
    public static C18070c m65576b(Provider<LoadFeedSettings> provider, Provider<C8301a> provider2) {
        return new C18070c(provider, provider2);
    }
}
