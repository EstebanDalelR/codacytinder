package com.tinder.app.dagger.module;

import com.tinder.verification.C15388c.C15387a;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class ak implements Factory<C15387a> {
    /* renamed from: a */
    private final ad f40188a;

    public /* synthetic */ Object get() {
        return m48996a();
    }

    public ak(ad adVar) {
        this.f40188a = adVar;
    }

    /* renamed from: a */
    public C15387a m48996a() {
        return m48993a(this.f40188a);
    }

    /* renamed from: a */
    public static C15387a m48993a(ad adVar) {
        return m48995c(adVar);
    }

    /* renamed from: b */
    public static ak m48994b(ad adVar) {
        return new ak(adVar);
    }

    /* renamed from: c */
    public static C15387a m48995c(ad adVar) {
        return (C15387a) C15521i.a(adVar.m35152a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
