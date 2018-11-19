package com.tinder.recsads.listener;

import com.tinder.addy.tracker.AdUrlTracker;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.listener.b */
public final class C18026b implements Factory<C16462a> {
    /* renamed from: a */
    private final Provider<AdUrlTracker> f55971a;

    public /* synthetic */ Object get() {
        return m65437a();
    }

    public C18026b(Provider<AdUrlTracker> provider) {
        this.f55971a = provider;
    }

    /* renamed from: a */
    public C16462a m65437a() {
        return C18026b.m65435a(this.f55971a);
    }

    /* renamed from: a */
    public static C16462a m65435a(Provider<AdUrlTracker> provider) {
        return new C16462a((AdUrlTracker) provider.get());
    }

    /* renamed from: b */
    public static C18026b m65436b(Provider<AdUrlTracker> provider) {
        return new C18026b(provider);
    }
}
