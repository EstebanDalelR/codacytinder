package com.tinder.module;

import com.tinder.common.C10654a;
import com.tinder.common.CrashReporter;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class fi implements Factory<C10654a> {
    /* renamed from: a */
    private final fh f43024a;
    /* renamed from: b */
    private final Provider<CrashReporter> f43025b;

    public /* synthetic */ Object get() {
        return m52524a();
    }

    /* renamed from: a */
    public C10654a m52524a() {
        return m52523a(this.f43024a, this.f43025b);
    }

    /* renamed from: a */
    public static C10654a m52523a(fh fhVar, Provider<CrashReporter> provider) {
        return m52522a(fhVar, (CrashReporter) provider.get());
    }

    /* renamed from: a */
    public static C10654a m52522a(fh fhVar, CrashReporter crashReporter) {
        return (C10654a) C15521i.a(fhVar.m40900a(crashReporter), "Cannot return null from a non-@Nullable @Provides method");
    }
}
