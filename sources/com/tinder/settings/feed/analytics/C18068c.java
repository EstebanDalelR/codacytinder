package com.tinder.settings.feed.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.feed.analytics.c */
public final class C18068c implements Factory<C16628b> {
    /* renamed from: a */
    private final Provider<C2630h> f56112a;

    public /* synthetic */ Object get() {
        return m65571a();
    }

    public C18068c(Provider<C2630h> provider) {
        this.f56112a = provider;
    }

    /* renamed from: a */
    public C16628b m65571a() {
        return C18068c.m65569a(this.f56112a);
    }

    /* renamed from: a */
    public static C16628b m65569a(Provider<C2630h> provider) {
        return new C16628b((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C18068c m65570b(Provider<C2630h> provider) {
        return new C18068c(provider);
    }
}
