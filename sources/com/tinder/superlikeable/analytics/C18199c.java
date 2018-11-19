package com.tinder.superlikeable.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.superlikeable.analytics.c */
public final class C18199c implements Factory<C18198b> {
    /* renamed from: a */
    private final Provider<C2630h> f56415a;
    /* renamed from: b */
    private final Provider<C15096f> f56416b;

    public /* synthetic */ Object get() {
        return m65980a();
    }

    public C18199c(Provider<C2630h> provider, Provider<C15096f> provider2) {
        this.f56415a = provider;
        this.f56416b = provider2;
    }

    /* renamed from: a */
    public C18198b m65980a() {
        return C18199c.m65978a(this.f56415a, this.f56416b);
    }

    /* renamed from: a */
    public static C18198b m65978a(Provider<C2630h> provider, Provider<C15096f> provider2) {
        return new C18198b((C2630h) provider.get(), (C15096f) provider2.get());
    }

    /* renamed from: b */
    public static C18199c m65979b(Provider<C2630h> provider, Provider<C15096f> provider2) {
        return new C18199c(provider, provider2);
    }
}
