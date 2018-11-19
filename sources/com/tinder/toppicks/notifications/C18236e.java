package com.tinder.toppicks.notifications;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.notifications.e */
public final class C18236e implements Factory<C17041d> {
    /* renamed from: a */
    private final Provider<C2630h> f56527a;

    public /* synthetic */ Object get() {
        return m66094a();
    }

    public C18236e(Provider<C2630h> provider) {
        this.f56527a = provider;
    }

    /* renamed from: a */
    public C17041d m66094a() {
        return C18236e.m66092a(this.f56527a);
    }

    /* renamed from: a */
    public static C17041d m66092a(Provider<C2630h> provider) {
        return new C17041d((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C18236e m66093b(Provider<C2630h> provider) {
        return new C18236e(provider);
    }
}
