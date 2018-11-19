package com.tinder.screenshot;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.screenshotty.C14830c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.screenshot.d */
public final class C18047d implements Factory<C16559a> {
    /* renamed from: a */
    private final Provider<C14830c> f56053a;
    /* renamed from: b */
    private final Provider<AppVisibilityTracker> f56054b;

    public /* synthetic */ Object get() {
        return m65520a();
    }

    public C18047d(Provider<C14830c> provider, Provider<AppVisibilityTracker> provider2) {
        this.f56053a = provider;
        this.f56054b = provider2;
    }

    /* renamed from: a */
    public C16559a m65520a() {
        return C18047d.m65518a(this.f56053a, this.f56054b);
    }

    /* renamed from: a */
    public static C16559a m65518a(Provider<C14830c> provider, Provider<AppVisibilityTracker> provider2) {
        return new C16559a((C14830c) provider.get(), (AppVisibilityTracker) provider2.get());
    }

    /* renamed from: b */
    public static C18047d m65519b(Provider<C14830c> provider, Provider<AppVisibilityTracker> provider2) {
        return new C18047d(provider, provider2);
    }
}
