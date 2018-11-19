package com.tinder.module;

import android.content.Context;
import com.google.android.gms.iid.C2553a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cr implements Factory<C2553a> {
    /* renamed from: a */
    private final bs f42880a;
    /* renamed from: b */
    private final Provider<Context> f42881b;

    public /* synthetic */ Object get() {
        return m52299a();
    }

    public cr(bs bsVar, Provider<Context> provider) {
        this.f42880a = bsVar;
        this.f42881b = provider;
    }

    /* renamed from: a */
    public C2553a m52299a() {
        return m52297a(this.f42880a, this.f42881b);
    }

    /* renamed from: a */
    public static C2553a m52297a(bs bsVar, Provider<Context> provider) {
        return m52296a(bsVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static cr m52298b(bs bsVar, Provider<Context> provider) {
        return new cr(bsVar, provider);
    }

    /* renamed from: a */
    public static C2553a m52296a(bs bsVar, Context context) {
        return (C2553a) C15521i.a(bsVar.m40835e(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
