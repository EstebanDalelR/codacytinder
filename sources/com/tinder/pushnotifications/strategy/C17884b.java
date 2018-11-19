package com.tinder.pushnotifications.strategy;

import android.app.NotificationManager;
import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.pushnotifications.strategy.b */
public final class C17884b implements Factory<C16266a> {
    /* renamed from: a */
    private final Provider<Context> f55770a;
    /* renamed from: b */
    private final Provider<NotificationManager> f55771b;

    public /* synthetic */ Object get() {
        return m65171a();
    }

    public C17884b(Provider<Context> provider, Provider<NotificationManager> provider2) {
        this.f55770a = provider;
        this.f55771b = provider2;
    }

    /* renamed from: a */
    public C16266a m65171a() {
        return C17884b.m65169a(this.f55770a, this.f55771b);
    }

    /* renamed from: a */
    public static C16266a m65169a(Provider<Context> provider, Provider<NotificationManager> provider2) {
        return new C16266a((Context) provider.get(), (NotificationManager) provider2.get());
    }

    /* renamed from: b */
    public static C17884b m65170b(Provider<Context> provider, Provider<NotificationManager> provider2) {
        return new C17884b(provider, provider2);
    }
}
