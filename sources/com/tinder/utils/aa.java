package com.tinder.utils;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class aa implements Factory<C15377z> {
    /* renamed from: a */
    private final Provider<Context> f56620a;

    public /* synthetic */ Object get() {
        return m66222a();
    }

    public aa(Provider<Context> provider) {
        this.f56620a = provider;
    }

    /* renamed from: a */
    public C15377z m66222a() {
        return m66220a(this.f56620a);
    }

    /* renamed from: a */
    public static C15377z m66220a(Provider<Context> provider) {
        return new C15377z((Context) provider.get());
    }

    /* renamed from: b */
    public static aa m66221b(Provider<Context> provider) {
        return new aa(provider);
    }
}
