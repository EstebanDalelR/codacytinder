package com.tinder.reactions.p385c;

import com.tinder.domain.message.ReactionSettingsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.c.g */
public final class C17937g implements Factory<C16287f> {
    /* renamed from: a */
    private final Provider<ReactionSettingsRepository> f55846a;

    public /* synthetic */ Object get() {
        return m65250a();
    }

    public C17937g(Provider<ReactionSettingsRepository> provider) {
        this.f55846a = provider;
    }

    /* renamed from: a */
    public C16287f m65250a() {
        return C17937g.m65248a(this.f55846a);
    }

    /* renamed from: a */
    public static C16287f m65248a(Provider<ReactionSettingsRepository> provider) {
        return new C16287f((ReactionSettingsRepository) provider.get());
    }

    /* renamed from: b */
    public static C17937g m65249b(Provider<ReactionSettingsRepository> provider) {
        return new C17937g(provider);
    }
}
