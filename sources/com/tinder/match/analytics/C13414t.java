package com.tinder.match.analytics;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.analytics.t */
public final class C13414t implements Factory<C9848s> {
    /* renamed from: a */
    private final Provider<C9844j> f42557a;

    public /* synthetic */ Object get() {
        return m51861a();
    }

    public C13414t(Provider<C9844j> provider) {
        this.f42557a = provider;
    }

    /* renamed from: a */
    public C9848s m51861a() {
        return C13414t.m51859a(this.f42557a);
    }

    /* renamed from: a */
    public static C9848s m51859a(Provider<C9844j> provider) {
        return new C9848s((C9844j) provider.get());
    }

    /* renamed from: b */
    public static C13414t m51860b(Provider<C9844j> provider) {
        return new C13414t(provider);
    }
}
