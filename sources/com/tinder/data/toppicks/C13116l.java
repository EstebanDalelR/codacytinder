package com.tinder.data.toppicks;

import com.tinder.data.toppicks.store.C8798a;
import com.tinder.domain.settings.notifications.NotificationSettingsSource;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.data.toppicks.l */
public final class C13116l implements Factory<C11017k> {
    /* renamed from: a */
    private final Provider<C8798a> f41741a;
    /* renamed from: b */
    private final Provider<NotificationSettingsSource> f41742b;

    public /* synthetic */ Object get() {
        return m50985a();
    }

    public C13116l(Provider<C8798a> provider, Provider<NotificationSettingsSource> provider2) {
        this.f41741a = provider;
        this.f41742b = provider2;
    }

    /* renamed from: a */
    public C11017k m50985a() {
        return C13116l.m50983a(this.f41741a, this.f41742b);
    }

    /* renamed from: a */
    public static C11017k m50983a(Provider<C8798a> provider, Provider<NotificationSettingsSource> provider2) {
        return new C11017k((C8798a) provider.get(), (NotificationSettingsSource) provider2.get());
    }

    /* renamed from: b */
    public static C13116l m50984b(Provider<C8798a> provider, Provider<NotificationSettingsSource> provider2) {
        return new C13116l(provider, provider2);
    }
}
