package com.tinder.module;

import com.tinder.purchase.model.C14531b;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class az implements Factory<C14531b> {
    /* renamed from: a */
    private final au f42794a;

    public /* synthetic */ Object get() {
        return m52142a();
    }

    public az(au auVar) {
        this.f42794a = auVar;
    }

    /* renamed from: a */
    public C14531b m52142a() {
        return m52139a(this.f42794a);
    }

    /* renamed from: a */
    public static C14531b m52139a(au auVar) {
        return m52141c(auVar);
    }

    /* renamed from: b */
    public static az m52140b(au auVar) {
        return new az(auVar);
    }

    /* renamed from: c */
    public static C14531b m52141c(au auVar) {
        return (C14531b) C15521i.a(auVar.m40786b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
