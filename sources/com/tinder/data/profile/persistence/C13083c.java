package com.tinder.data.profile.persistence;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.profile.persistence.c */
public final class C13083c implements Factory<C10961b> {
    /* renamed from: a */
    private final Provider<C8767d> f41684a;

    public /* synthetic */ Object get() {
        return m50912a();
    }

    public C13083c(Provider<C8767d> provider) {
        this.f41684a = provider;
    }

    /* renamed from: a */
    public C10961b m50912a() {
        return C13083c.m50910a(this.f41684a);
    }

    /* renamed from: a */
    public static C10961b m50910a(Provider<C8767d> provider) {
        return new C10961b((C8767d) provider.get());
    }

    /* renamed from: b */
    public static C13083c m50911b(Provider<C8767d> provider) {
        return new C13083c(provider);
    }
}
