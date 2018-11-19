package com.tinder.module;

import android.content.Context;
import com.tinder.bitmoji.C8323c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bx implements Factory<C8323c> {
    /* renamed from: a */
    private final bs f42839a;
    /* renamed from: b */
    private final Provider<Context> f42840b;

    public /* synthetic */ Object get() {
        return m52216a();
    }

    public bx(bs bsVar, Provider<Context> provider) {
        this.f42839a = bsVar;
        this.f42840b = provider;
    }

    /* renamed from: a */
    public C8323c m52216a() {
        return m52214a(this.f42839a, this.f42840b);
    }

    /* renamed from: a */
    public static C8323c m52214a(bs bsVar, Provider<Context> provider) {
        return m52213a(bsVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static bx m52215b(bs bsVar, Provider<Context> provider) {
        return new bx(bsVar, provider);
    }

    /* renamed from: a */
    public static C8323c m52213a(bs bsVar, Context context) {
        return (C8323c) C15521i.a(bsVar.m40848k(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
