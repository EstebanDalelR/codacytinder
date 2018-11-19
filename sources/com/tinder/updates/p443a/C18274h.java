package com.tinder.updates.p443a;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.updates.a.h */
public final class C18274h implements Factory<C17207g> {
    /* renamed from: a */
    private final Provider<C2630h> f56603a;

    public /* synthetic */ Object get() {
        return m66200a();
    }

    public C18274h(Provider<C2630h> provider) {
        this.f56603a = provider;
    }

    /* renamed from: a */
    public C17207g m66200a() {
        return C18274h.m66198a(this.f56603a);
    }

    /* renamed from: a */
    public static C17207g m66198a(Provider<C2630h> provider) {
        return new C17207g((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C18274h m66199b(Provider<C2630h> provider) {
        return new C18274h(provider);
    }
}
