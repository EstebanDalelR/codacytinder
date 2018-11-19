package com.tinder.gamepadcounters;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.boost.p178a.C10400d;
import com.tinder.common.provider.C8550g;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.superlike.p421e.C15082f;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.gamepadcounters.e */
public final class C13318e implements Factory<C9673c> {
    /* renamed from: a */
    private final Provider<AbTestUtility> f42262a;
    /* renamed from: b */
    private final Provider<C10400d> f42263b;
    /* renamed from: c */
    private final Provider<C15082f> f42264c;
    /* renamed from: d */
    private final Provider<C8550g> f42265d;
    /* renamed from: e */
    private final Provider<AppVisibilityTracker> f42266e;

    public /* synthetic */ Object get() {
        return m51554a();
    }

    public C13318e(Provider<AbTestUtility> provider, Provider<C10400d> provider2, Provider<C15082f> provider3, Provider<C8550g> provider4, Provider<AppVisibilityTracker> provider5) {
        this.f42262a = provider;
        this.f42263b = provider2;
        this.f42264c = provider3;
        this.f42265d = provider4;
        this.f42266e = provider5;
    }

    /* renamed from: a */
    public C9673c m51554a() {
        return C13318e.m51552a(this.f42262a, this.f42263b, this.f42264c, this.f42265d, this.f42266e);
    }

    /* renamed from: a */
    public static C9673c m51552a(Provider<AbTestUtility> provider, Provider<C10400d> provider2, Provider<C15082f> provider3, Provider<C8550g> provider4, Provider<AppVisibilityTracker> provider5) {
        return new C9673c((AbTestUtility) provider.get(), (C10400d) provider2.get(), (C15082f) provider3.get(), (C8550g) provider4.get(), (AppVisibilityTracker) provider5.get());
    }

    /* renamed from: b */
    public static C13318e m51553b(Provider<AbTestUtility> provider, Provider<C10400d> provider2, Provider<C15082f> provider3, Provider<C8550g> provider4, Provider<AppVisibilityTracker> provider5) {
        return new C13318e(provider, provider2, provider3, provider4, provider5);
    }
}
