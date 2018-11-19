package com.tinder.toppicks.p433e;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.toppicks.domain.worker.C15253e;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.e.c */
public final class C18230c implements Factory<C15254a> {
    /* renamed from: a */
    private final Provider<AppVisibilityTracker> f56512a;
    /* renamed from: b */
    private final Provider<C15253e> f56513b;

    public /* synthetic */ Object get() {
        return m66078a();
    }

    public C18230c(Provider<AppVisibilityTracker> provider, Provider<C15253e> provider2) {
        this.f56512a = provider;
        this.f56513b = provider2;
    }

    /* renamed from: a */
    public C15254a m66078a() {
        return C18230c.m66076a(this.f56512a, this.f56513b);
    }

    /* renamed from: a */
    public static C15254a m66076a(Provider<AppVisibilityTracker> provider, Provider<C15253e> provider2) {
        return new C15254a((AppVisibilityTracker) provider.get(), (C15253e) provider2.get());
    }

    /* renamed from: b */
    public static C18230c m66077b(Provider<AppVisibilityTracker> provider, Provider<C15253e> provider2) {
        return new C18230c(provider, provider2);
    }
}
