package com.tinder.data.boost;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.boost.b */
public final class C12844b implements Factory<C10751a> {
    /* renamed from: a */
    private final Provider<BoostCursorModel> f41280a;

    public /* synthetic */ Object get() {
        return m50445a();
    }

    public C12844b(Provider<BoostCursorModel> provider) {
        this.f41280a = provider;
    }

    /* renamed from: a */
    public C10751a m50445a() {
        return C12844b.m50443a(this.f41280a);
    }

    /* renamed from: a */
    public static C10751a m50443a(Provider<BoostCursorModel> provider) {
        return new C10751a((BoostCursorModel) provider.get());
    }

    /* renamed from: b */
    public static C12844b m50444b(Provider<BoostCursorModel> provider) {
        return new C12844b(provider);
    }
}
