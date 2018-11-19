package com.tinder.module;

import android.content.Context;
import com.tinder.api.ManagerWebServices;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ep implements Factory<ManagerWebServices> {
    /* renamed from: a */
    private final ec f42992a;
    /* renamed from: b */
    private final Provider<Context> f42993b;

    public /* synthetic */ Object get() {
        return m52487a();
    }

    public ep(ec ecVar, Provider<Context> provider) {
        this.f42992a = ecVar;
        this.f42993b = provider;
    }

    /* renamed from: a */
    public ManagerWebServices m52487a() {
        return m52485a(this.f42992a, this.f42993b);
    }

    /* renamed from: a */
    public static ManagerWebServices m52485a(ec ecVar, Provider<Context> provider) {
        return m52484a(ecVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static ep m52486b(ec ecVar, Provider<Context> provider) {
        return new ep(ecVar, provider);
    }

    /* renamed from: a */
    public static ManagerWebServices m52484a(ec ecVar, Context context) {
        return (ManagerWebServices) C15521i.a(ecVar.m40881a(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
