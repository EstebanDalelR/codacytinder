package com.tinder.settings.data;

import com.tinder.api.TinderApi;
import com.tinder.data.p218g.p219a.C8663a;
import com.tinder.data.p218g.p220b.C8665a;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.places.provider.PlacesAvailableProvider;
import com.tinder.domain.settings.notifications.NotificationSettingsSource;
import com.tinder.p238f.p239a.C9363a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.data.e */
public final class C18062e implements Factory<C16626c> {
    /* renamed from: a */
    private final Provider<NotificationSettingsSource> f56095a;
    /* renamed from: b */
    private final Provider<C8665a> f56096b;
    /* renamed from: c */
    private final Provider<TinderApi> f56097c;
    /* renamed from: d */
    private final Provider<C8663a> f56098d;
    /* renamed from: e */
    private final Provider<FastMatchConfigProvider> f56099e;
    /* renamed from: f */
    private final Provider<C9363a> f56100f;
    /* renamed from: g */
    private final Provider<TopPicksConfig> f56101g;
    /* renamed from: h */
    private final Provider<PlacesAvailableProvider> f56102h;
    /* renamed from: i */
    private final Provider<C16619a> f56103i;

    public /* synthetic */ Object get() {
        return m65559a();
    }

    public C18062e(Provider<NotificationSettingsSource> provider, Provider<C8665a> provider2, Provider<TinderApi> provider3, Provider<C8663a> provider4, Provider<FastMatchConfigProvider> provider5, Provider<C9363a> provider6, Provider<TopPicksConfig> provider7, Provider<PlacesAvailableProvider> provider8, Provider<C16619a> provider9) {
        this.f56095a = provider;
        this.f56096b = provider2;
        this.f56097c = provider3;
        this.f56098d = provider4;
        this.f56099e = provider5;
        this.f56100f = provider6;
        this.f56101g = provider7;
        this.f56102h = provider8;
        this.f56103i = provider9;
    }

    /* renamed from: a */
    public C16626c m65559a() {
        return C18062e.m65557a(this.f56095a, this.f56096b, this.f56097c, this.f56098d, this.f56099e, this.f56100f, this.f56101g, this.f56102h, this.f56103i);
    }

    /* renamed from: a */
    public static C16626c m65557a(Provider<NotificationSettingsSource> provider, Provider<C8665a> provider2, Provider<TinderApi> provider3, Provider<C8663a> provider4, Provider<FastMatchConfigProvider> provider5, Provider<C9363a> provider6, Provider<TopPicksConfig> provider7, Provider<PlacesAvailableProvider> provider8, Provider<C16619a> provider9) {
        return new C16626c((NotificationSettingsSource) provider.get(), (C8665a) provider2.get(), (TinderApi) provider3.get(), (C8663a) provider4.get(), (FastMatchConfigProvider) provider5.get(), (C9363a) provider6.get(), (TopPicksConfig) provider7.get(), (PlacesAvailableProvider) provider8.get(), (C16619a) provider9.get());
    }

    /* renamed from: b */
    public static C18062e m65558b(Provider<NotificationSettingsSource> provider, Provider<C8665a> provider2, Provider<TinderApi> provider3, Provider<C8663a> provider4, Provider<FastMatchConfigProvider> provider5, Provider<C9363a> provider6, Provider<TopPicksConfig> provider7, Provider<PlacesAvailableProvider> provider8, Provider<C16619a> provider9) {
        return new C18062e(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }
}
