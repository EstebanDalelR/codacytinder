package com.tinder.reactions.drawer.mediator;

import com.tinder.reactions.drawer.provider.C16327e;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.drawer.mediator.j */
public final class C17966j implements Factory<C14633g> {
    /* renamed from: a */
    private final Provider<C16327e> f55899a;

    public /* synthetic */ Object get() {
        return m65303a();
    }

    public C17966j(Provider<C16327e> provider) {
        this.f55899a = provider;
    }

    /* renamed from: a */
    public C14633g m65303a() {
        return C17966j.m65301a(this.f55899a);
    }

    /* renamed from: a */
    public static C14633g m65301a(Provider<C16327e> provider) {
        return new C14633g((C16327e) provider.get());
    }

    /* renamed from: b */
    public static C17966j m65302b(Provider<C16327e> provider) {
        return new C17966j(provider);
    }
}
