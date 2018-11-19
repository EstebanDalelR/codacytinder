package com.tinder.module;

import android.app.Application;
import com.tinder.managers.ManagerApp;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ee implements Factory<Application> {
    /* renamed from: a */
    private final ec f42961a;
    /* renamed from: b */
    private final Provider<ManagerApp> f42962b;

    public /* synthetic */ Object get() {
        return m52444a();
    }

    public ee(ec ecVar, Provider<ManagerApp> provider) {
        this.f42961a = ecVar;
        this.f42962b = provider;
    }

    /* renamed from: a */
    public Application m52444a() {
        return m52442a(this.f42961a, this.f42962b);
    }

    /* renamed from: a */
    public static Application m52442a(ec ecVar, Provider<ManagerApp> provider) {
        return m52441a(ecVar, (ManagerApp) provider.get());
    }

    /* renamed from: b */
    public static ee m52443b(ec ecVar, Provider<ManagerApp> provider) {
        return new ee(ecVar, provider);
    }

    /* renamed from: a */
    public static Application m52441a(ec ecVar, ManagerApp managerApp) {
        return (Application) C15521i.a(ecVar.m40878a(managerApp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
