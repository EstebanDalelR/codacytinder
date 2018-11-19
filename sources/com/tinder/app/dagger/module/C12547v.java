package com.tinder.app.dagger.module;

import com.tinder.activities.MainActivity;
import com.tinder.main.p287c.C13390c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.v */
public final class C12547v implements Factory<C13390c> {
    /* renamed from: a */
    private final C8253o f40417a;
    /* renamed from: b */
    private final Provider<MainActivity> f40418b;

    public /* synthetic */ Object get() {
        return m49378a();
    }

    public C12547v(C8253o c8253o, Provider<MainActivity> provider) {
        this.f40417a = c8253o;
        this.f40418b = provider;
    }

    /* renamed from: a */
    public C13390c m49378a() {
        return C12547v.m49376a(this.f40417a, this.f40418b);
    }

    /* renamed from: a */
    public static C13390c m49376a(C8253o c8253o, Provider<MainActivity> provider) {
        return C12547v.m49375a(c8253o, (MainActivity) provider.get());
    }

    /* renamed from: b */
    public static C12547v m49377b(C8253o c8253o, Provider<MainActivity> provider) {
        return new C12547v(c8253o, provider);
    }

    /* renamed from: a */
    public static C13390c m49375a(C8253o c8253o, MainActivity mainActivity) {
        return (C13390c) C15521i.a(c8253o.m35220a(mainActivity), "Cannot return null from a non-@Nullable @Provides method");
    }
}
