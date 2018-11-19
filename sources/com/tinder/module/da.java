package com.tinder.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import de.greenrobot.event.C2664c;

public final class da implements Factory<C2664c> {
    /* renamed from: a */
    private final bs f42902a;

    public /* synthetic */ Object get() {
        return m52333a();
    }

    public da(bs bsVar) {
        this.f42902a = bsVar;
    }

    /* renamed from: a */
    public C2664c m52333a() {
        return m52330a(this.f42902a);
    }

    /* renamed from: a */
    public static C2664c m52330a(bs bsVar) {
        return m52332c(bsVar);
    }

    /* renamed from: b */
    public static da m52331b(bs bsVar) {
        return new da(bsVar);
    }

    /* renamed from: c */
    public static C2664c m52332c(bs bsVar) {
        return (C2664c) C15521i.a(bsVar.m40828b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
