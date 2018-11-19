package com.tinder.pushnotifications.usecase;

import android.app.NotificationManager;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.pushnotifications.usecase.b */
public final class C17889b implements Factory<C14574a> {
    /* renamed from: a */
    private final Provider<NotificationManager> f55781a;

    public /* synthetic */ Object get() {
        return m65180a();
    }

    public C17889b(Provider<NotificationManager> provider) {
        this.f55781a = provider;
    }

    /* renamed from: a */
    public C14574a m65180a() {
        return C17889b.m65178a(this.f55781a);
    }

    /* renamed from: a */
    public static C14574a m65178a(Provider<NotificationManager> provider) {
        return new C14574a((NotificationManager) provider.get());
    }

    /* renamed from: b */
    public static C17889b m65179b(Provider<NotificationManager> provider) {
        return new C17889b(provider);
    }
}
