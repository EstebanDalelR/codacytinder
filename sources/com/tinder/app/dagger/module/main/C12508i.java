package com.tinder.app.dagger.module.main;

import com.tinder.discovery.p231a.C13142b;
import com.tinder.discovery.view.DiscoveryTabView.Adapter.OnSegmentsUpdatedListener;
import com.tinder.domain.purchase.SubscriptionProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import java.util.Set;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.main.i */
public final class C12508i implements Factory<C13142b> {
    /* renamed from: a */
    private final C8251a f40326a;
    /* renamed from: b */
    private final Provider<SubscriptionProvider> f40327b;
    /* renamed from: c */
    private final Provider<Set<OnSegmentsUpdatedListener>> f40328c;

    public /* synthetic */ Object get() {
        return m49228a();
    }

    public C12508i(C8251a c8251a, Provider<SubscriptionProvider> provider, Provider<Set<OnSegmentsUpdatedListener>> provider2) {
        this.f40326a = c8251a;
        this.f40327b = provider;
        this.f40328c = provider2;
    }

    /* renamed from: a */
    public C13142b m49228a() {
        return C12508i.m49226a(this.f40326a, this.f40327b, this.f40328c);
    }

    /* renamed from: a */
    public static C13142b m49226a(C8251a c8251a, Provider<SubscriptionProvider> provider, Provider<Set<OnSegmentsUpdatedListener>> provider2) {
        return C12508i.m49225a(c8251a, (SubscriptionProvider) provider.get(), (Set) provider2.get());
    }

    /* renamed from: b */
    public static C12508i m49227b(C8251a c8251a, Provider<SubscriptionProvider> provider, Provider<Set<OnSegmentsUpdatedListener>> provider2) {
        return new C12508i(c8251a, provider, provider2);
    }

    /* renamed from: a */
    public static C13142b m49225a(C8251a c8251a, SubscriptionProvider subscriptionProvider, Set<OnSegmentsUpdatedListener> set) {
        return (C13142b) C15521i.a(c8251a.m35202a(subscriptionProvider, (Set) set), "Cannot return null from a non-@Nullable @Provides method");
    }
}
