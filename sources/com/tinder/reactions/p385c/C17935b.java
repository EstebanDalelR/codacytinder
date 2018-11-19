package com.tinder.reactions.p385c;

import com.tinder.domain.message.ReactionSettingsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.c.b */
public final class C17935b implements Factory<C14597a> {
    /* renamed from: a */
    private final Provider<ReactionSettingsRepository> f55843a;

    public /* synthetic */ Object get() {
        return m65244a();
    }

    public C17935b(Provider<ReactionSettingsRepository> provider) {
        this.f55843a = provider;
    }

    /* renamed from: a */
    public C14597a m65244a() {
        return C17935b.m65242a(this.f55843a);
    }

    /* renamed from: a */
    public static C14597a m65242a(Provider<ReactionSettingsRepository> provider) {
        return new C14597a((ReactionSettingsRepository) provider.get());
    }

    /* renamed from: b */
    public static C17935b m65243b(Provider<ReactionSettingsRepository> provider) {
        return new C17935b(provider);
    }
}
