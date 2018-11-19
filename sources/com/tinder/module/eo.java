package com.tinder.module;

import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.apprating.p086a.C8260f;
import com.tinder.interactors.C2647c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class eo implements Factory<C8260f> {
    /* renamed from: a */
    private final ec f42988a;
    /* renamed from: b */
    private final Provider<ManagerWebServices> f42989b;
    /* renamed from: c */
    private final Provider<ManagerNetwork> f42990c;
    /* renamed from: d */
    private final Provider<C2647c> f42991d;

    public /* synthetic */ Object get() {
        return m52483a();
    }

    public eo(ec ecVar, Provider<ManagerWebServices> provider, Provider<ManagerNetwork> provider2, Provider<C2647c> provider3) {
        this.f42988a = ecVar;
        this.f42989b = provider;
        this.f42990c = provider2;
        this.f42991d = provider3;
    }

    /* renamed from: a */
    public C8260f m52483a() {
        return m52481a(this.f42988a, this.f42989b, this.f42990c, this.f42991d);
    }

    /* renamed from: a */
    public static C8260f m52481a(ec ecVar, Provider<ManagerWebServices> provider, Provider<ManagerNetwork> provider2, Provider<C2647c> provider3) {
        return m52480a(ecVar, (ManagerWebServices) provider.get(), (ManagerNetwork) provider2.get(), (C2647c) provider3.get());
    }

    /* renamed from: b */
    public static eo m52482b(ec ecVar, Provider<ManagerWebServices> provider, Provider<ManagerNetwork> provider2, Provider<C2647c> provider3) {
        return new eo(ecVar, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static C8260f m52480a(ec ecVar, ManagerWebServices managerWebServices, ManagerNetwork managerNetwork, C2647c c2647c) {
        return (C8260f) C15521i.a(ecVar.m40882a(managerWebServices, managerNetwork, c2647c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
