package com.tinder.module;

import com.tinder.common.log.C10681a.C8546a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class eb implements Factory<C8546a> {
    /* renamed from: a */
    private final ea f42958a;

    public /* synthetic */ Object get() {
        return m52436a();
    }

    /* renamed from: a */
    public C8546a m52436a() {
        return m52434a(this.f42958a);
    }

    /* renamed from: a */
    public static C8546a m52434a(ea eaVar) {
        return m52435b(eaVar);
    }

    /* renamed from: b */
    public static C8546a m52435b(ea eaVar) {
        return (C8546a) C15521i.a(eaVar.m40877a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
