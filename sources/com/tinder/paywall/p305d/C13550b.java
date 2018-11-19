package com.tinder.paywall.p305d;

import android.content.res.Resources;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.paywall.d.b */
public final class C13550b implements Factory<C10057a> {
    /* renamed from: a */
    private final Provider<Resources> f43274a;

    public /* synthetic */ Object get() {
        return m52948a();
    }

    public C13550b(Provider<Resources> provider) {
        this.f43274a = provider;
    }

    /* renamed from: a */
    public C10057a m52948a() {
        return C13550b.m52946a(this.f43274a);
    }

    /* renamed from: a */
    public static C10057a m52946a(Provider<Resources> provider) {
        return new C10057a((Resources) provider.get());
    }

    /* renamed from: b */
    public static C13550b m52947b(Provider<Resources> provider) {
        return new C13550b(provider);
    }
}
