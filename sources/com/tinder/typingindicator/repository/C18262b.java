package com.tinder.typingindicator.repository;

import com.tinder.base.p172b.C8301a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.repository.b */
public final class C18262b implements Factory<C17165a> {
    /* renamed from: a */
    private final Provider<C8301a> f56578a;

    public /* synthetic */ Object get() {
        return m66164a();
    }

    public C18262b(Provider<C8301a> provider) {
        this.f56578a = provider;
    }

    /* renamed from: a */
    public C17165a m66164a() {
        return C18262b.m66162a(this.f56578a);
    }

    /* renamed from: a */
    public static C17165a m66162a(Provider<C8301a> provider) {
        return new C17165a((C8301a) provider.get());
    }

    /* renamed from: b */
    public static C18262b m66163b(Provider<C8301a> provider) {
        return new C18262b(provider);
    }
}
