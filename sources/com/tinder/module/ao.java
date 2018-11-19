package com.tinder.module;

import com.tinder.analytics.C6233k;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class ao implements Factory<C6233k> {
    /* renamed from: a */
    private final aa f42774a;

    public /* synthetic */ Object get() {
        return m52106a();
    }

    public ao(aa aaVar) {
        this.f42774a = aaVar;
    }

    /* renamed from: a */
    public C6233k m52106a() {
        return m52103a(this.f42774a);
    }

    /* renamed from: a */
    public static C6233k m52103a(aa aaVar) {
        return m52105c(aaVar);
    }

    /* renamed from: b */
    public static ao m52104b(aa aaVar) {
        return new ao(aaVar);
    }

    /* renamed from: c */
    public static C6233k m52105c(aa aaVar) {
        return (C6233k) C15521i.a(aaVar.m40771a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
