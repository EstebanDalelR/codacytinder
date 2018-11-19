package com.tinder.core.p201a;

import com.tinder.managers.ManagerFusedLocation;
import dagger.internal.Factory;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.core.a.b */
public final class C12805b implements Factory<C8588a> {
    /* renamed from: a */
    private final Provider<ManagerFusedLocation> f41206a;
    /* renamed from: b */
    private final Provider<C2664c> f41207b;

    public /* synthetic */ Object get() {
        return m50310a();
    }

    public C12805b(Provider<ManagerFusedLocation> provider, Provider<C2664c> provider2) {
        this.f41206a = provider;
        this.f41207b = provider2;
    }

    /* renamed from: a */
    public C8588a m50310a() {
        return C12805b.m50308a(this.f41206a, this.f41207b);
    }

    /* renamed from: a */
    public static C8588a m50308a(Provider<ManagerFusedLocation> provider, Provider<C2664c> provider2) {
        return new C8588a((ManagerFusedLocation) provider.get(), (C2664c) provider2.get());
    }

    /* renamed from: b */
    public static C12805b m50309b(Provider<ManagerFusedLocation> provider, Provider<C2664c> provider2) {
        return new C12805b(provider, provider2);
    }
}
