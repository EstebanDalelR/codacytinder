package com.tinder.module;

import com.tinder.common.C8540g;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class bm implements Factory<C8540g> {
    /* renamed from: a */
    private final bl f42819a;

    public /* synthetic */ Object get() {
        return m52177a();
    }

    public bm(bl blVar) {
        this.f42819a = blVar;
    }

    /* renamed from: a */
    public C8540g m52177a() {
        return m52174a(this.f42819a);
    }

    /* renamed from: a */
    public static C8540g m52174a(bl blVar) {
        return m52176c(blVar);
    }

    /* renamed from: b */
    public static bm m52175b(bl blVar) {
        return new bm(blVar);
    }

    /* renamed from: c */
    public static C8540g m52176c(bl blVar) {
        return (C8540g) C15521i.a(blVar.m40796d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
