package com.tinder.module;

import android.content.Context;
import android.content.res.Resources;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dn implements Factory<Resources> {
    /* renamed from: a */
    private final bs f42928a;
    /* renamed from: b */
    private final Provider<Context> f42929b;

    public /* synthetic */ Object get() {
        return m52385a();
    }

    public dn(bs bsVar, Provider<Context> provider) {
        this.f42928a = bsVar;
        this.f42929b = provider;
    }

    /* renamed from: a */
    public Resources m52385a() {
        return m52383a(this.f42928a, this.f42929b);
    }

    /* renamed from: a */
    public static Resources m52383a(bs bsVar, Provider<Context> provider) {
        return m52382a(bsVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static dn m52384b(bs bsVar, Provider<Context> provider) {
        return new dn(bsVar, provider);
    }

    /* renamed from: a */
    public static Resources m52382a(bs bsVar, Context context) {
        return (Resources) C15521i.a(bsVar.m40824b(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
