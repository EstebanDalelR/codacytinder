package com.tinder.feed.analytics.events;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.feed.analytics.p247a.C9423b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.feed.analytics.events.h */
public final class C13238h implements Factory<C11692g> {
    /* renamed from: a */
    private final Provider<C2630h> f41963a;
    /* renamed from: b */
    private final Provider<C9423b> f41964b;

    public /* synthetic */ Object get() {
        return m51242a();
    }

    public C13238h(Provider<C2630h> provider, Provider<C9423b> provider2) {
        this.f41963a = provider;
        this.f41964b = provider2;
    }

    /* renamed from: a */
    public C11692g m51242a() {
        return C13238h.m51240a(this.f41963a, this.f41964b);
    }

    /* renamed from: a */
    public static C11692g m51240a(Provider<C2630h> provider, Provider<C9423b> provider2) {
        return new C11692g((C2630h) provider.get(), (C9423b) provider2.get());
    }

    /* renamed from: b */
    public static C13238h m51241b(Provider<C2630h> provider, Provider<C9423b> provider2) {
        return new C13238h(provider, provider2);
    }
}
