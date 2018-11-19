package com.tinder.toppicks.notifications;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.notifications.g */
public final class C18237g implements Factory<C17045f> {
    /* renamed from: a */
    private final Provider<C2630h> f56528a;

    public /* synthetic */ Object get() {
        return m66097a();
    }

    public C18237g(Provider<C2630h> provider) {
        this.f56528a = provider;
    }

    /* renamed from: a */
    public C17045f m66097a() {
        return C18237g.m66095a(this.f56528a);
    }

    /* renamed from: a */
    public static C17045f m66095a(Provider<C2630h> provider) {
        return new C17045f((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C18237g m66096b(Provider<C2630h> provider) {
        return new C18237g(provider);
    }
}
