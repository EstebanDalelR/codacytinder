package com.tinder.app.dagger.module.main;

import com.tinder.discovery.view.DiscoveryTabView;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import dagger.Lazy;
import dagger.internal.C15521i;
import dagger.internal.C17281c;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.d */
public final class C12503d implements Factory<OnSegmentChangedListener> {
    /* renamed from: a */
    private final C8251a f40313a;
    /* renamed from: b */
    private final Provider<DiscoveryTabView> f40314b;

    public /* synthetic */ Object get() {
        return m49208a();
    }

    public C12503d(C8251a c8251a, Provider<DiscoveryTabView> provider) {
        this.f40313a = c8251a;
        this.f40314b = provider;
    }

    /* renamed from: a */
    public OnSegmentChangedListener m49208a() {
        return C12503d.m49206a(this.f40313a, this.f40314b);
    }

    /* renamed from: a */
    public static OnSegmentChangedListener m49206a(C8251a c8251a, Provider<DiscoveryTabView> provider) {
        return C12503d.m49205a(c8251a, C17281c.b(provider));
    }

    /* renamed from: b */
    public static C12503d m49207b(C8251a c8251a, Provider<DiscoveryTabView> provider) {
        return new C12503d(c8251a, provider);
    }

    /* renamed from: a */
    public static OnSegmentChangedListener m49205a(C8251a c8251a, Lazy<DiscoveryTabView> lazy) {
        return (OnSegmentChangedListener) C15521i.a(c8251a.m35210a((Lazy) lazy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
