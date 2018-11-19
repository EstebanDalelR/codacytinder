package com.tinder.settings.feed.p406a;

import com.tinder.domain.settings.feed.usecase.SaveFeedSettings;
import com.tinder.settings.feed.analytics.AddSettingsFeedInteractUseCase;
import com.tinder.settings.feed.analytics.C16628b;
import com.tinder.settings.feed.provider.C14879a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.settings.feed.a.c */
public final class C18063c implements Factory<C14868a> {
    /* renamed from: a */
    private final Provider<C14879a> f56104a;
    /* renamed from: b */
    private final Provider<SaveFeedSettings> f56105b;
    /* renamed from: c */
    private final Provider<AddSettingsFeedInteractUseCase> f56106c;
    /* renamed from: d */
    private final Provider<C16628b> f56107d;

    public /* synthetic */ Object get() {
        return m65562a();
    }

    public C18063c(Provider<C14879a> provider, Provider<SaveFeedSettings> provider2, Provider<AddSettingsFeedInteractUseCase> provider3, Provider<C16628b> provider4) {
        this.f56104a = provider;
        this.f56105b = provider2;
        this.f56106c = provider3;
        this.f56107d = provider4;
    }

    /* renamed from: a */
    public C14868a m65562a() {
        return C18063c.m65560a(this.f56104a, this.f56105b, this.f56106c, this.f56107d);
    }

    /* renamed from: a */
    public static C14868a m65560a(Provider<C14879a> provider, Provider<SaveFeedSettings> provider2, Provider<AddSettingsFeedInteractUseCase> provider3, Provider<C16628b> provider4) {
        return new C14868a((C14879a) provider.get(), (SaveFeedSettings) provider2.get(), (AddSettingsFeedInteractUseCase) provider3.get(), (C16628b) provider4.get());
    }

    /* renamed from: b */
    public static C18063c m65561b(Provider<C14879a> provider, Provider<SaveFeedSettings> provider2, Provider<AddSettingsFeedInteractUseCase> provider3, Provider<C16628b> provider4) {
        return new C18063c(provider, provider2, provider3, provider4);
    }
}
