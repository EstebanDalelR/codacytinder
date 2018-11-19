package com.tinder.module;

import com.facebook.network.connectionclass.C1798b;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class ei implements Factory<C1798b> {
    /* renamed from: a */
    private final ec f42968a;

    public /* synthetic */ Object get() {
        return m52459a();
    }

    public ei(ec ecVar) {
        this.f42968a = ecVar;
    }

    /* renamed from: a */
    public C1798b m52459a() {
        return m52456a(this.f42968a);
    }

    /* renamed from: a */
    public static C1798b m52456a(ec ecVar) {
        return m52458c(ecVar);
    }

    /* renamed from: b */
    public static ei m52457b(ec ecVar) {
        return new ei(ecVar);
    }

    /* renamed from: c */
    public static C1798b m52458c(ec ecVar) {
        return (C1798b) C15521i.a(ecVar.m40888b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
