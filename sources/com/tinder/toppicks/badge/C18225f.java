package com.tinder.toppicks.badge;

import com.tinder.discovery.view.DiscoveryTabView.Adapter.OnSegmentsUpdatedListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.subjects.C18432c;
import javax.inject.Provider;

/* renamed from: com.tinder.toppicks.badge.f */
public final class C18225f implements Factory<OnSegmentsUpdatedListener> {
    /* renamed from: a */
    private final TopPicksTriggerModule f56495a;
    /* renamed from: b */
    private final Provider<C18432c<Boolean>> f56496b;

    public /* synthetic */ Object get() {
        return m66062a();
    }

    public C18225f(TopPicksTriggerModule topPicksTriggerModule, Provider<C18432c<Boolean>> provider) {
        this.f56495a = topPicksTriggerModule;
        this.f56496b = provider;
    }

    /* renamed from: a */
    public OnSegmentsUpdatedListener m66062a() {
        return C18225f.m66060a(this.f56495a, this.f56496b);
    }

    /* renamed from: a */
    public static OnSegmentsUpdatedListener m66060a(TopPicksTriggerModule topPicksTriggerModule, Provider<C18432c<Boolean>> provider) {
        return C18225f.m66059a(topPicksTriggerModule, (C18432c) provider.get());
    }

    /* renamed from: b */
    public static C18225f m66061b(TopPicksTriggerModule topPicksTriggerModule, Provider<C18432c<Boolean>> provider) {
        return new C18225f(topPicksTriggerModule, provider);
    }

    /* renamed from: a */
    public static OnSegmentsUpdatedListener m66059a(TopPicksTriggerModule topPicksTriggerModule, C18432c<Boolean> c18432c) {
        return (OnSegmentsUpdatedListener) C15521i.m58001a(topPicksTriggerModule.m57294a(c18432c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
