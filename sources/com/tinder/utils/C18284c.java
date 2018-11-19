package com.tinder.utils;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.utils.c */
public final class C18284c implements Factory<C15354a> {
    /* renamed from: a */
    private final Provider<Context> f56624a;

    public /* synthetic */ Object get() {
        return m66225a();
    }

    public C18284c(Provider<Context> provider) {
        this.f56624a = provider;
    }

    /* renamed from: a */
    public C15354a m66225a() {
        return C18284c.m66223a(this.f56624a);
    }

    /* renamed from: a */
    public static C15354a m66223a(Provider<Context> provider) {
        return new C15354a((Context) provider.get());
    }

    /* renamed from: b */
    public static C18284c m66224b(Provider<Context> provider) {
        return new C18284c(provider);
    }
}
