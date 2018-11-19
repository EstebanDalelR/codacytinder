package com.tinder.data.p211c;

import android.app.Application;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.c.c */
public final class C12848c implements Factory<C8636b> {
    /* renamed from: a */
    private final Provider<Application> f41285a;

    public /* synthetic */ Object get() {
        return m50458a();
    }

    public C12848c(Provider<Application> provider) {
        this.f41285a = provider;
    }

    /* renamed from: a */
    public C8636b m50458a() {
        return C12848c.m50456a(this.f41285a);
    }

    /* renamed from: a */
    public static C8636b m50456a(Provider<Application> provider) {
        return new C8636b((Application) provider.get());
    }

    /* renamed from: b */
    public static C12848c m50457b(Provider<Application> provider) {
        return new C12848c(provider);
    }
}
