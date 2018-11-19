package com.tinder.app.dagger.module;

import com.tinder.main.tooltip.C9835c;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.app.dagger.module.y */
public final class C12550y implements Factory<C9835c> {
    /* renamed from: a */
    private final C8253o f40423a;

    public /* synthetic */ Object get() {
        return m49390a();
    }

    public C12550y(C8253o c8253o) {
        this.f40423a = c8253o;
    }

    /* renamed from: a */
    public C9835c m49390a() {
        return C12550y.m49387a(this.f40423a);
    }

    /* renamed from: a */
    public static C9835c m49387a(C8253o c8253o) {
        return C12550y.m49389c(c8253o);
    }

    /* renamed from: b */
    public static C12550y m49388b(C8253o c8253o) {
        return new C12550y(c8253o);
    }

    /* renamed from: c */
    public static C9835c m49389c(C8253o c8253o) {
        return (C9835c) C15521i.a(c8253o.m35223a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
