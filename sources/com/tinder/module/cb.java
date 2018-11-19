package com.tinder.module;

import android.content.Context;
import android.net.ConnectivityManager;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cb implements Factory<ConnectivityManager> {
    /* renamed from: a */
    private final bs f42849a;
    /* renamed from: b */
    private final Provider<Context> f42850b;

    public /* synthetic */ Object get() {
        return m52236a();
    }

    public cb(bs bsVar, Provider<Context> provider) {
        this.f42849a = bsVar;
        this.f42850b = provider;
    }

    /* renamed from: a */
    public ConnectivityManager m52236a() {
        return m52234a(this.f42849a, this.f42850b);
    }

    /* renamed from: a */
    public static ConnectivityManager m52234a(bs bsVar, Provider<Context> provider) {
        return m52233a(bsVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static cb m52235b(bs bsVar, Provider<Context> provider) {
        return new cb(bsVar, provider);
    }

    /* renamed from: a */
    public static ConnectivityManager m52233a(bs bsVar, Context context) {
        return (ConnectivityManager) C15521i.a(bsVar.m40837f(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
