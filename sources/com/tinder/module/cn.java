package com.tinder.module;

import android.content.Context;
import com.google.android.gms.gcm.C2544a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cn implements Factory<C2544a> {
    /* renamed from: a */
    private final bs f42873a;
    /* renamed from: b */
    private final Provider<Context> f42874b;

    public /* synthetic */ Object get() {
        return m52283a();
    }

    public cn(bs bsVar, Provider<Context> provider) {
        this.f42873a = bsVar;
        this.f42874b = provider;
    }

    /* renamed from: a */
    public C2544a m52283a() {
        return m52281a(this.f42873a, this.f42874b);
    }

    /* renamed from: a */
    public static C2544a m52281a(bs bsVar, Provider<Context> provider) {
        return m52280a(bsVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static cn m52282b(bs bsVar, Provider<Context> provider) {
        return new cn(bsVar, provider);
    }

    /* renamed from: a */
    public static C2544a m52280a(bs bsVar, Context context) {
        return (C2544a) C15521i.a(bsVar.m40799a(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
