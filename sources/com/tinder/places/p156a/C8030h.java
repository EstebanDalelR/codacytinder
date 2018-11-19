package com.tinder.places.p156a;

import com.tinder.discovery.view.DiscoveryTabView.Adapter.OnSegmentsUpdatedListener;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.a.h */
public final class C8030h implements Factory<OnSegmentsUpdatedListener> {
    /* renamed from: a */
    private final C6251e f28684a;
    /* renamed from: b */
    private final Provider<C7343b> f28685b;

    public /* synthetic */ Object get() {
        return m33952a();
    }

    public C8030h(C6251e c6251e, Provider<C7343b> provider) {
        this.f28684a = c6251e;
        this.f28685b = provider;
    }

    /* renamed from: a */
    public OnSegmentsUpdatedListener m33952a() {
        return C8030h.m33950a(this.f28684a, this.f28685b);
    }

    /* renamed from: a */
    public static OnSegmentsUpdatedListener m33950a(C6251e c6251e, Provider<C7343b> provider) {
        return C8030h.m33949a(c6251e, (C7343b) provider.get());
    }

    /* renamed from: b */
    public static C8030h m33951b(C6251e c6251e, Provider<C7343b> provider) {
        return new C8030h(c6251e, provider);
    }

    /* renamed from: a */
    public static OnSegmentsUpdatedListener m33949a(C6251e c6251e, C7343b c7343b) {
        return (OnSegmentsUpdatedListener) C15521i.a(c6251e.m26958a(c7343b), "Cannot return null from a non-@Nullable @Provides method");
    }
}
