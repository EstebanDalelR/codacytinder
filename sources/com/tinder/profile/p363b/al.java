package com.tinder.profile.p363b;

import com.tinder.managers.bk;
import com.tinder.passport.p093d.C3945a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.profile.b.al */
public final class al implements Factory<aj> {
    /* renamed from: a */
    private final Provider<bk> f55387a;
    /* renamed from: b */
    private final Provider<C3945a> f55388b;

    public /* synthetic */ Object get() {
        return m64895a();
    }

    public al(Provider<bk> provider, Provider<C3945a> provider2) {
        this.f55387a = provider;
        this.f55388b = provider2;
    }

    /* renamed from: a */
    public aj m64895a() {
        return al.m64893a(this.f55387a, this.f55388b);
    }

    /* renamed from: a */
    public static aj m64893a(Provider<bk> provider, Provider<C3945a> provider2) {
        return new aj((bk) provider.get(), (C3945a) provider2.get());
    }

    /* renamed from: b */
    public static al m64894b(Provider<bk> provider, Provider<C3945a> provider2) {
        return new al(provider, provider2);
    }
}
