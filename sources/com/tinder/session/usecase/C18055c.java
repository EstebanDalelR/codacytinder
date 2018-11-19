package com.tinder.session.usecase;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.session.usecase.c */
public final class C18055c implements Factory<C14835a> {
    /* renamed from: a */
    private final Provider<C2630h> f56069a;

    public /* synthetic */ Object get() {
        return m65541a();
    }

    public C18055c(Provider<C2630h> provider) {
        this.f56069a = provider;
    }

    /* renamed from: a */
    public C14835a m65541a() {
        return C18055c.m65539a(this.f56069a);
    }

    /* renamed from: a */
    public static C14835a m65539a(Provider<C2630h> provider) {
        return new C14835a((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C18055c m65540b(Provider<C2630h> provider) {
        return new C18055c(provider);
    }
}
