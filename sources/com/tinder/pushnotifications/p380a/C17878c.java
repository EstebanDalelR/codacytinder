package com.tinder.pushnotifications.p380a;

import android.content.Context;
import com.tinder.app.AppVisibilityTracker;
import com.tinder.utils.C15362l;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.pushnotifications.a.c */
public final class C17878c implements Factory<C14548a> {
    /* renamed from: a */
    private final Provider<AppVisibilityTracker> f55757a;
    /* renamed from: b */
    private final Provider<Context> f55758b;
    /* renamed from: c */
    private final Provider<C15362l> f55759c;

    public /* synthetic */ Object get() {
        return m65156a();
    }

    public C17878c(Provider<AppVisibilityTracker> provider, Provider<Context> provider2, Provider<C15362l> provider3) {
        this.f55757a = provider;
        this.f55758b = provider2;
        this.f55759c = provider3;
    }

    /* renamed from: a */
    public C14548a m65156a() {
        return C17878c.m65154a(this.f55757a, this.f55758b, this.f55759c);
    }

    /* renamed from: a */
    public static C14548a m65154a(Provider<AppVisibilityTracker> provider, Provider<Context> provider2, Provider<C15362l> provider3) {
        return new C14548a((AppVisibilityTracker) provider.get(), (Context) provider2.get(), (C15362l) provider3.get());
    }

    /* renamed from: b */
    public static C17878c m65155b(Provider<AppVisibilityTracker> provider, Provider<Context> provider2, Provider<C15362l> provider3) {
        return new C17878c(provider, provider2, provider3);
    }
}
