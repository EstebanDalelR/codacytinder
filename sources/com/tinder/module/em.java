package com.tinder.module;

import android.content.Context;
import com.tinder.managers.bt;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class em implements Factory<bt> {
    /* renamed from: a */
    private final ec f42983a;
    /* renamed from: b */
    private final Provider<Context> f42984b;

    public /* synthetic */ Object get() {
        return m52475a();
    }

    public em(ec ecVar, Provider<Context> provider) {
        this.f42983a = ecVar;
        this.f42984b = provider;
    }

    /* renamed from: a */
    public bt m52475a() {
        return m52473a(this.f42983a, this.f42984b);
    }

    /* renamed from: a */
    public static bt m52473a(ec ecVar, Provider<Context> provider) {
        return m52472a(ecVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static em m52474b(ec ecVar, Provider<Context> provider) {
        return new em(ecVar, provider);
    }

    /* renamed from: a */
    public static bt m52472a(ec ecVar, Context context) {
        return (bt) C15521i.a(ecVar.m40889b(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
