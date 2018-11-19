package com.tinder.match.provider;

import com.tinder.common.p078c.C2642a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.match.provider.h */
public final class C13436h implements Factory<C9879g> {
    /* renamed from: a */
    private final Provider<C2642a> f42625a;

    public /* synthetic */ Object get() {
        return m51933a();
    }

    public C13436h(Provider<C2642a> provider) {
        this.f42625a = provider;
    }

    /* renamed from: a */
    public C9879g m51933a() {
        return C13436h.m51931a(this.f42625a);
    }

    /* renamed from: a */
    public static C9879g m51931a(Provider<C2642a> provider) {
        return new C9879g((C2642a) provider.get());
    }

    /* renamed from: b */
    public static C13436h m51932b(Provider<C2642a> provider) {
        return new C13436h(provider);
    }
}
