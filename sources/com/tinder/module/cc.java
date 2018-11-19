package com.tinder.module;

import android.content.Context;
import com.tinder.util.ConnectivityProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class cc implements Factory<ConnectivityProvider> {
    /* renamed from: a */
    private final bs f42851a;
    /* renamed from: b */
    private final Provider<Context> f42852b;

    public /* synthetic */ Object get() {
        return m52240a();
    }

    public cc(bs bsVar, Provider<Context> provider) {
        this.f42851a = bsVar;
        this.f42852b = provider;
    }

    /* renamed from: a */
    public ConnectivityProvider m52240a() {
        return m52238a(this.f42851a, this.f42852b);
    }

    /* renamed from: a */
    public static ConnectivityProvider m52238a(bs bsVar, Provider<Context> provider) {
        return m52237a(bsVar, (Context) provider.get());
    }

    /* renamed from: b */
    public static cc m52239b(bs bsVar, Provider<Context> provider) {
        return new cc(bsVar, provider);
    }

    /* renamed from: a */
    public static ConnectivityProvider m52237a(bs bsVar, Context context) {
        return (ConnectivityProvider) C15521i.a(bsVar.m40842h(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
