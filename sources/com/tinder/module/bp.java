package com.tinder.module;

import com.crashlytics.android.core.CrashlyticsCore;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class bp implements Factory<CrashlyticsCore> {
    /* renamed from: a */
    private final bl f42822a;

    public /* synthetic */ Object get() {
        return m52189a();
    }

    public bp(bl blVar) {
        this.f42822a = blVar;
    }

    /* renamed from: a */
    public CrashlyticsCore m52189a() {
        return m52186a(this.f42822a);
    }

    /* renamed from: a */
    public static CrashlyticsCore m52186a(bl blVar) {
        return m52188c(blVar);
    }

    /* renamed from: b */
    public static bp m52187b(bl blVar) {
        return new bp(blVar);
    }

    /* renamed from: c */
    public static CrashlyticsCore m52188c(bl blVar) {
        return (CrashlyticsCore) C15521i.a(blVar.m40793a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
