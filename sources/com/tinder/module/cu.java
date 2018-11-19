package com.tinder.module;

import android.os.Handler;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class cu implements Factory<Handler> {
    /* renamed from: a */
    private final bs f42888a;

    public /* synthetic */ Object get() {
        return m52311a();
    }

    public cu(bs bsVar) {
        this.f42888a = bsVar;
    }

    /* renamed from: a */
    public Handler m52311a() {
        return m52308a(this.f42888a);
    }

    /* renamed from: a */
    public static Handler m52308a(bs bsVar) {
        return m52310c(bsVar);
    }

    /* renamed from: b */
    public static cu m52309b(bs bsVar) {
        return new cu(bsVar);
    }

    /* renamed from: c */
    public static Handler m52310c(bs bsVar) {
        return (Handler) C15521i.a(bsVar.m40849l(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
