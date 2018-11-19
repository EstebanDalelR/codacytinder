package com.tinder.module;

import android.content.Context;
import android.telephony.TelephonyManager;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class dt implements Factory<TelephonyManager> {
    /* renamed from: a */
    private final bs f42941a;
    /* renamed from: b */
    private final Provider<Context> f42942b;

    public /* synthetic */ Object get() {
        return m52409a();
    }

    public dt(bs bsVar, Provider<Context> provider) {
        this.f42941a = bsVar;
        this.f42942b = provider;
    }

    /* renamed from: a */
    public TelephonyManager m52409a() {
        return m52407a(this.f42941a, this.f42942b);
    }

    /* renamed from: a */
    public static TelephonyManager m52407a(bs bsVar, Provider<Context> provider) {
        return m52406a(bsVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static dt m52408b(bs bsVar, Provider<Context> provider) {
        return new dt(bsVar, provider);
    }

    /* renamed from: a */
    public static TelephonyManager m52406a(bs bsVar, Context context) {
        return (TelephonyManager) C15521i.a(bsVar.m40829c(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
