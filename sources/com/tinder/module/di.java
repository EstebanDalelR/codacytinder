package com.tinder.module;

import com.tinder.data.places.C8747h;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class di implements Factory<C8747h> {
    /* renamed from: a */
    private final bs f42914a;

    public /* synthetic */ Object get() {
        return m52365a();
    }

    public di(bs bsVar) {
        this.f42914a = bsVar;
    }

    /* renamed from: a */
    public C8747h m52365a() {
        return m52362a(this.f42914a);
    }

    /* renamed from: a */
    public static C8747h m52362a(bs bsVar) {
        return m52364c(bsVar);
    }

    /* renamed from: b */
    public static di m52363b(bs bsVar) {
        return new di(bsVar);
    }

    /* renamed from: c */
    public static C8747h m52364c(bs bsVar) {
        return (C8747h) C15521i.a(bsVar.m40836e(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
