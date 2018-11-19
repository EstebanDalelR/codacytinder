package com.tinder.places.p156a;

import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.places.provider.C10271c;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.places.a.g */
public final class C8029g implements Factory<OnSegmentChangedListener> {
    /* renamed from: a */
    private final C6251e f28680a;
    /* renamed from: b */
    private final Provider<PlacesConfigProvider> f28681b;
    /* renamed from: c */
    private final Provider<ConfirmTutorialsViewed> f28682c;
    /* renamed from: d */
    private final Provider<C10271c> f28683d;

    public /* synthetic */ Object get() {
        return m33948a();
    }

    public C8029g(C6251e c6251e, Provider<PlacesConfigProvider> provider, Provider<ConfirmTutorialsViewed> provider2, Provider<C10271c> provider3) {
        this.f28680a = c6251e;
        this.f28681b = provider;
        this.f28682c = provider2;
        this.f28683d = provider3;
    }

    /* renamed from: a */
    public OnSegmentChangedListener m33948a() {
        return C8029g.m33946a(this.f28680a, this.f28681b, this.f28682c, this.f28683d);
    }

    /* renamed from: a */
    public static OnSegmentChangedListener m33946a(C6251e c6251e, Provider<PlacesConfigProvider> provider, Provider<ConfirmTutorialsViewed> provider2, Provider<C10271c> provider3) {
        return C8029g.m33945a(c6251e, (PlacesConfigProvider) provider.get(), (ConfirmTutorialsViewed) provider2.get(), (C10271c) provider3.get());
    }

    /* renamed from: b */
    public static C8029g m33947b(C6251e c6251e, Provider<PlacesConfigProvider> provider, Provider<ConfirmTutorialsViewed> provider2, Provider<C10271c> provider3) {
        return new C8029g(c6251e, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static OnSegmentChangedListener m33945a(C6251e c6251e, PlacesConfigProvider placesConfigProvider, ConfirmTutorialsViewed confirmTutorialsViewed, C10271c c10271c) {
        return (OnSegmentChangedListener) C15521i.a(c6251e.m26959a(placesConfigProvider, confirmTutorialsViewed, c10271c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
