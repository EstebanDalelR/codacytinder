package com.tinder.recsads;

import com.tinder.addy.tracker.AdUrlTracker;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.recsads.i */
public final class C18024i implements Factory<C16459h> {
    /* renamed from: a */
    private final Provider<AdUrlTracker> f55969a;

    public /* synthetic */ Object get() {
        return m65431a();
    }

    public C18024i(Provider<AdUrlTracker> provider) {
        this.f55969a = provider;
    }

    /* renamed from: a */
    public C16459h m65431a() {
        return C18024i.m65429a(this.f55969a);
    }

    /* renamed from: a */
    public static C16459h m65429a(Provider<AdUrlTracker> provider) {
        return new C16459h((AdUrlTracker) provider.get());
    }

    /* renamed from: b */
    public static C18024i m65430b(Provider<AdUrlTracker> provider) {
        return new C18024i(provider);
    }
}
