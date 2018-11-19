package com.tinder.module;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import de.greenrobot.event.C2664c;

public final class ch implements Factory<C2664c> {
    /* renamed from: a */
    private final bs f42861a;

    public /* synthetic */ Object get() {
        return m52260a();
    }

    public ch(bs bsVar) {
        this.f42861a = bsVar;
    }

    /* renamed from: a */
    public C2664c m52260a() {
        return m52257a(this.f42861a);
    }

    /* renamed from: a */
    public static C2664c m52257a(bs bsVar) {
        return m52259c(bsVar);
    }

    /* renamed from: b */
    public static ch m52258b(bs bsVar) {
        return new ch(bsVar);
    }

    /* renamed from: c */
    public static C2664c m52259c(bs bsVar) {
        return (C2664c) C15521i.a(bsVar.m40823a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
