package com.tinder.screenshot.analytics;

import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.screenshotty.C14830c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.screenshot.analytics.f */
public final class C18046f implements Factory<C16566d> {
    /* renamed from: a */
    private final Provider<C14830c> f56050a;
    /* renamed from: b */
    private final Provider<CurrentScreenTracker> f56051b;
    /* renamed from: c */
    private final Provider<C16562a> f56052c;

    public /* synthetic */ Object get() {
        return m65517a();
    }

    public C18046f(Provider<C14830c> provider, Provider<CurrentScreenTracker> provider2, Provider<C16562a> provider3) {
        this.f56050a = provider;
        this.f56051b = provider2;
        this.f56052c = provider3;
    }

    /* renamed from: a */
    public C16566d m65517a() {
        return C18046f.m65515a(this.f56050a, this.f56051b, this.f56052c);
    }

    /* renamed from: a */
    public static C16566d m65515a(Provider<C14830c> provider, Provider<CurrentScreenTracker> provider2, Provider<C16562a> provider3) {
        return new C16566d((C14830c) provider.get(), (CurrentScreenTracker) provider2.get(), (C16562a) provider3.get());
    }

    /* renamed from: b */
    public static C18046f m65516b(Provider<C14830c> provider, Provider<CurrentScreenTracker> provider2, Provider<C16562a> provider3) {
        return new C18046f(provider, provider2, provider3);
    }
}
