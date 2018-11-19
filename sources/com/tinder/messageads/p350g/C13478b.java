package com.tinder.messageads.p350g;

import com.tinder.messageads.repository.MessageAdSettingsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.messageads.g.b */
public final class C13478b implements Factory<C12127a> {
    /* renamed from: a */
    private final Provider<MessageAdSettingsRepository> f42741a;

    public /* synthetic */ Object get() {
        return m52051a();
    }

    public C13478b(Provider<MessageAdSettingsRepository> provider) {
        this.f42741a = provider;
    }

    /* renamed from: a */
    public C12127a m52051a() {
        return C13478b.m52049a(this.f42741a);
    }

    /* renamed from: a */
    public static C12127a m52049a(Provider<MessageAdSettingsRepository> provider) {
        return new C12127a((MessageAdSettingsRepository) provider.get());
    }

    /* renamed from: b */
    public static C13478b m52050b(Provider<MessageAdSettingsRepository> provider) {
        return new C13478b(provider);
    }
}
