package com.tinder.module;

import com.google.android.gms.gcm.PeriodicTask;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class dd implements Factory<PeriodicTask> {
    /* renamed from: a */
    private final bs f42907a;

    public /* synthetic */ Object get() {
        return m52345a();
    }

    public dd(bs bsVar) {
        this.f42907a = bsVar;
    }

    /* renamed from: a */
    public PeriodicTask m52345a() {
        return m52342a(this.f42907a);
    }

    /* renamed from: a */
    public static PeriodicTask m52342a(bs bsVar) {
        return m52344c(bsVar);
    }

    /* renamed from: b */
    public static dd m52343b(bs bsVar) {
        return new dd(bsVar);
    }

    /* renamed from: c */
    public static PeriodicTask m52344c(bs bsVar) {
        return (PeriodicTask) C15521i.a(bsVar.m40847k(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
