package com.tinder.module;

import com.tinder.analytics.fireworks.FireworksSyncListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class aj implements Factory<FireworksSyncListener> {
    /* renamed from: a */
    private final aa f42765a;

    public /* synthetic */ Object get() {
        return m52086a();
    }

    public aj(aa aaVar) {
        this.f42765a = aaVar;
    }

    /* renamed from: a */
    public FireworksSyncListener m52086a() {
        return m52083a(this.f42765a);
    }

    /* renamed from: a */
    public static FireworksSyncListener m52083a(aa aaVar) {
        return m52085c(aaVar);
    }

    /* renamed from: b */
    public static aj m52084b(aa aaVar) {
        return new aj(aaVar);
    }

    /* renamed from: c */
    public static FireworksSyncListener m52085c(aa aaVar) {
        return (FireworksSyncListener) C15521i.a(aaVar.m40775b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
