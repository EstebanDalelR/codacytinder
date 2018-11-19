package com.tinder.module;

import com.tinder.common.CrashReporter;
import com.tinder.managers.LegacyBreadCrumbTracker;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bz implements Factory<LegacyBreadCrumbTracker> {
    /* renamed from: a */
    private final bs f42844a;
    /* renamed from: b */
    private final Provider<CrashReporter> f42845b;

    public /* synthetic */ Object get() {
        return m52224a();
    }

    public bz(bs bsVar, Provider<CrashReporter> provider) {
        this.f42844a = bsVar;
        this.f42845b = provider;
    }

    /* renamed from: a */
    public LegacyBreadCrumbTracker m52224a() {
        return m52222a(this.f42844a, this.f42845b);
    }

    /* renamed from: a */
    public static LegacyBreadCrumbTracker m52222a(bs bsVar, Provider<CrashReporter> provider) {
        return m52221a(bsVar, (CrashReporter) provider.get());
    }

    /* renamed from: b */
    public static bz m52223b(bs bsVar, Provider<CrashReporter> provider) {
        return new bz(bsVar, provider);
    }

    /* renamed from: a */
    public static LegacyBreadCrumbTracker m52221a(bs bsVar, CrashReporter crashReporter) {
        return (LegacyBreadCrumbTracker) C15521i.a(bsVar.m40816a(crashReporter), "Cannot return null from a non-@Nullable @Provides method");
    }
}
