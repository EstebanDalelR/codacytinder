package com.tinder.settings.feed.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.feed.analytics.a */
public final class C18066a implements Factory<AddSettingsFeedInteractUseCase> {
    /* renamed from: a */
    private final Provider<C2630h> f56110a;

    public /* synthetic */ Object get() {
        return m65567a();
    }

    public C18066a(Provider<C2630h> provider) {
        this.f56110a = provider;
    }

    /* renamed from: a */
    public AddSettingsFeedInteractUseCase m65567a() {
        return C18066a.m65565a(this.f56110a);
    }

    /* renamed from: a */
    public static AddSettingsFeedInteractUseCase m65565a(Provider<C2630h> provider) {
        return new AddSettingsFeedInteractUseCase((C2630h) provider.get());
    }

    /* renamed from: b */
    public static C18066a m65566b(Provider<C2630h> provider) {
        return new C18066a(provider);
    }
}
