package com.tinder.module;

import com.google.gson.Gson;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class cp implements Factory<Gson> {
    /* renamed from: a */
    private final bs f42877a;

    public /* synthetic */ Object get() {
        return m52291a();
    }

    public cp(bs bsVar) {
        this.f42877a = bsVar;
    }

    /* renamed from: a */
    public Gson m52291a() {
        return m52288a(this.f42877a);
    }

    /* renamed from: a */
    public static Gson m52288a(bs bsVar) {
        return m52290c(bsVar);
    }

    /* renamed from: b */
    public static cp m52289b(bs bsVar) {
        return new cp(bsVar);
    }

    /* renamed from: c */
    public static Gson m52290c(bs bsVar) {
        return (Gson) C15521i.a(bsVar.m40830c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
