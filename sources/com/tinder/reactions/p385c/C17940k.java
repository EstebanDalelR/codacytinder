package com.tinder.reactions.p385c;

import com.tinder.domain.message.ReactionSettingsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.c.k */
public final class C17940k implements Factory<C16289j> {
    /* renamed from: a */
    private final Provider<ReactionSettingsRepository> f55850a;

    public /* synthetic */ Object get() {
        return m65257a();
    }

    public C17940k(Provider<ReactionSettingsRepository> provider) {
        this.f55850a = provider;
    }

    /* renamed from: a */
    public C16289j m65257a() {
        return C17940k.m65255a(this.f55850a);
    }

    /* renamed from: a */
    public static C16289j m65255a(Provider<ReactionSettingsRepository> provider) {
        return new C16289j((ReactionSettingsRepository) provider.get());
    }

    /* renamed from: b */
    public static C17940k m65256b(Provider<ReactionSettingsRepository> provider) {
        return new C17940k(provider);
    }
}
