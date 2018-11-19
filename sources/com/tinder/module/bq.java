package com.tinder.module;

import com.tinder.data.fastmatch.C8649b;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.settings.notifications.NotificationSettingsSource;
import com.tinder.managers.bk;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class bq implements Factory<FastMatchConfigProvider> {
    /* renamed from: a */
    private final FastMatchModule f42823a;
    /* renamed from: b */
    private final Provider<C8649b> f42824b;
    /* renamed from: c */
    private final Provider<bk> f42825c;
    /* renamed from: d */
    private final Provider<NotificationSettingsSource> f42826d;

    public /* synthetic */ Object get() {
        return m52193a();
    }

    public bq(FastMatchModule fastMatchModule, Provider<C8649b> provider, Provider<bk> provider2, Provider<NotificationSettingsSource> provider3) {
        this.f42823a = fastMatchModule;
        this.f42824b = provider;
        this.f42825c = provider2;
        this.f42826d = provider3;
    }

    /* renamed from: a */
    public FastMatchConfigProvider m52193a() {
        return m52191a(this.f42823a, this.f42824b, this.f42825c, this.f42826d);
    }

    /* renamed from: a */
    public static FastMatchConfigProvider m52191a(FastMatchModule fastMatchModule, Provider<C8649b> provider, Provider<bk> provider2, Provider<NotificationSettingsSource> provider3) {
        return m52190a(fastMatchModule, (C8649b) provider.get(), (bk) provider2.get(), (NotificationSettingsSource) provider3.get());
    }

    /* renamed from: b */
    public static bq m52192b(FastMatchModule fastMatchModule, Provider<C8649b> provider, Provider<bk> provider2, Provider<NotificationSettingsSource> provider3) {
        return new bq(fastMatchModule, provider, provider2, provider3);
    }

    /* renamed from: a */
    public static FastMatchConfigProvider m52190a(FastMatchModule fastMatchModule, C8649b c8649b, bk bkVar, NotificationSettingsSource notificationSettingsSource) {
        return (FastMatchConfigProvider) C15521i.a(fastMatchModule.m40759a(c8649b, bkVar, notificationSettingsSource), "Cannot return null from a non-@Nullable @Provides method");
    }
}
