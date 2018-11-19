package com.tinder.settings.presenter;

import com.tinder.domain.profile.usecase.ObserveDiscoverySettings;
import com.tinder.settings.p404b.C14865b;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bk implements Factory<bh> {
    /* renamed from: a */
    private final Provider<ObserveDiscoverySettings> f56122a;
    /* renamed from: b */
    private final Provider<C14865b> f56123b;

    public /* synthetic */ Object get() {
        return m65587a();
    }

    /* renamed from: a */
    public bh m65587a() {
        return m65586a(this.f56122a, this.f56123b);
    }

    /* renamed from: a */
    public static bh m65586a(Provider<ObserveDiscoverySettings> provider, Provider<C14865b> provider2) {
        return new bh((ObserveDiscoverySettings) provider.get(), (C14865b) provider2.get());
    }

    /* renamed from: a */
    public static bh m65585a(ObserveDiscoverySettings observeDiscoverySettings, C14865b c14865b) {
        return new bh(observeDiscoverySettings, c14865b);
    }
}
