package com.tinder.module;

import android.content.Context;
import com.tinder.managers.ManagerApp;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ed implements Factory<Context> {
    /* renamed from: a */
    private final ec f42959a;
    /* renamed from: b */
    private final Provider<ManagerApp> f42960b;

    public /* synthetic */ Object get() {
        return m52440a();
    }

    public ed(ec ecVar, Provider<ManagerApp> provider) {
        this.f42959a = ecVar;
        this.f42960b = provider;
    }

    /* renamed from: a */
    public Context m52440a() {
        return m52438a(this.f42959a, this.f42960b);
    }

    /* renamed from: a */
    public static Context m52438a(ec ecVar, Provider<ManagerApp> provider) {
        return m52437a(ecVar, (ManagerApp) provider.get());
    }

    /* renamed from: b */
    public static ed m52439b(ec ecVar, Provider<ManagerApp> provider) {
        return new ed(ecVar, provider);
    }

    /* renamed from: a */
    public static Context m52437a(ec ecVar, ManagerApp managerApp) {
        return (Context) C15521i.a(ecVar.m40887b(managerApp), "Cannot return null from a non-@Nullable @Provides method");
    }
}
