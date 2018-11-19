package com.tinder.settings.feed.presenter;

import com.tinder.settings.feed.provider.C14879a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.feed.presenter.f */
public final class C18069f implements Factory<C14876c> {
    /* renamed from: a */
    private final Provider<C14879a> f56113a;

    public /* synthetic */ Object get() {
        return m65574a();
    }

    public C18069f(Provider<C14879a> provider) {
        this.f56113a = provider;
    }

    /* renamed from: a */
    public C14876c m65574a() {
        return C18069f.m65572a(this.f56113a);
    }

    /* renamed from: a */
    public static C14876c m65572a(Provider<C14879a> provider) {
        return new C14876c((C14879a) provider.get());
    }

    /* renamed from: b */
    public static C18069f m65573b(Provider<C14879a> provider) {
        return new C18069f(provider);
    }
}
