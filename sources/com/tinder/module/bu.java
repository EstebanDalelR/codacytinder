package com.tinder.module;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.C10295a;
import com.tinder.managers.ManagerApp;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bu implements Factory<AppVisibilityTracker> {
    /* renamed from: a */
    private final bs f42830a;
    /* renamed from: b */
    private final Provider<ManagerApp> f42831b;
    /* renamed from: c */
    private final Provider<C10295a> f42832c;

    public /* synthetic */ Object get() {
        return m52204a();
    }

    public bu(bs bsVar, Provider<ManagerApp> provider, Provider<C10295a> provider2) {
        this.f42830a = bsVar;
        this.f42831b = provider;
        this.f42832c = provider2;
    }

    /* renamed from: a */
    public AppVisibilityTracker m52204a() {
        return m52202a(this.f42830a, this.f42831b, this.f42832c);
    }

    /* renamed from: a */
    public static AppVisibilityTracker m52202a(bs bsVar, Provider<ManagerApp> provider, Provider<C10295a> provider2) {
        return m52201a(bsVar, (ManagerApp) provider.get(), (C10295a) provider2.get());
    }

    /* renamed from: b */
    public static bu m52203b(bs bsVar, Provider<ManagerApp> provider, Provider<C10295a> provider2) {
        return new bu(bsVar, provider, provider2);
    }

    /* renamed from: a */
    public static AppVisibilityTracker m52201a(bs bsVar, ManagerApp managerApp, C10295a c10295a) {
        return (AppVisibilityTracker) C15521i.a(bsVar.m40800a(managerApp, c10295a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
