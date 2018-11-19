package com.tinder.common.navigation;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.common.provider.C8549a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.common.navigation.d */
public final class C12785d implements Factory<C10694a> {
    /* renamed from: a */
    private final Provider<C8549a> f41178a;
    /* renamed from: b */
    private final Provider<AppVisibilityTracker> f41179b;

    public /* synthetic */ Object get() {
        return m50266a();
    }

    public C12785d(Provider<C8549a> provider, Provider<AppVisibilityTracker> provider2) {
        this.f41178a = provider;
        this.f41179b = provider2;
    }

    /* renamed from: a */
    public C10694a m50266a() {
        return C12785d.m50264a(this.f41178a, this.f41179b);
    }

    /* renamed from: a */
    public static C10694a m50264a(Provider<C8549a> provider, Provider<AppVisibilityTracker> provider2) {
        return new C10694a((C8549a) provider.get(), (AppVisibilityTracker) provider2.get());
    }

    /* renamed from: b */
    public static C12785d m50265b(Provider<C8549a> provider, Provider<AppVisibilityTracker> provider2) {
        return new C12785d(provider, provider2);
    }
}
