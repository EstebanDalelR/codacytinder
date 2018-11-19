package com.tinder.screenshot.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.screenshot.analytics.c */
public final class C18045c implements Factory<C16562a> {
    /* renamed from: a */
    private final Provider<C2630h> f56049a;

    public /* synthetic */ Object get() {
        return m65514a();
    }

    public C18045c(Provider<C2630h> provider) {
        this.f56049a = provider;
    }

    /* renamed from: a */
    public C16562a m65514a() {
        return C18045c.m65512a(this.f56049a);
    }

    /* renamed from: a */
    public static C16562a m65512a(Provider<C2630h> provider) {
        return new C16562a((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C18045c m65513b(Provider<C2630h> provider) {
        return new C18045c(provider);
    }
}
