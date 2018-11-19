package com.tinder.app.dagger.module.main;

import com.tinder.discovery.analytics.C11131k;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.r */
public final class C12517r implements Factory<OnSegmentChangedListener> {
    /* renamed from: a */
    private final C8251a f40348a;
    /* renamed from: b */
    private final Provider<C11131k> f40349b;

    public /* synthetic */ Object get() {
        return m49263a();
    }

    public C12517r(C8251a c8251a, Provider<C11131k> provider) {
        this.f40348a = c8251a;
        this.f40349b = provider;
    }

    /* renamed from: a */
    public OnSegmentChangedListener m49263a() {
        return C12517r.m49261a(this.f40348a, this.f40349b);
    }

    /* renamed from: a */
    public static OnSegmentChangedListener m49261a(C8251a c8251a, Provider<C11131k> provider) {
        return C12517r.m49260a(c8251a, (C11131k) provider.get());
    }

    /* renamed from: b */
    public static C12517r m49262b(C8251a c8251a, Provider<C11131k> provider) {
        return new C12517r(c8251a, provider);
    }

    /* renamed from: a */
    public static OnSegmentChangedListener m49260a(C8251a c8251a, C11131k c11131k) {
        return (OnSegmentChangedListener) C15521i.a(c8251a.m35209a(c11131k), "Cannot return null from a non-@Nullable @Provides method");
    }
}
