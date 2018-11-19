package com.tinder.reactions.p382a.p383a;

import com.tinder.data.reactions.StrikeReactionStore;
import com.tinder.domain.reactions.repository.StrikeReactionRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.a.a.c */
public final class C17893c implements Factory<StrikeReactionRepository> {
    /* renamed from: a */
    private final C14578a f55792a;
    /* renamed from: b */
    private final Provider<StrikeReactionStore> f55793b;

    public /* synthetic */ Object get() {
        return m65192a();
    }

    public C17893c(C14578a c14578a, Provider<StrikeReactionStore> provider) {
        this.f55792a = c14578a;
        this.f55793b = provider;
    }

    /* renamed from: a */
    public StrikeReactionRepository m65192a() {
        return C17893c.m65190a(this.f55792a, this.f55793b);
    }

    /* renamed from: a */
    public static StrikeReactionRepository m65190a(C14578a c14578a, Provider<StrikeReactionStore> provider) {
        return C17893c.m65189a(c14578a, (StrikeReactionStore) provider.get());
    }

    /* renamed from: b */
    public static C17893c m65191b(C14578a c14578a, Provider<StrikeReactionStore> provider) {
        return new C17893c(c14578a, provider);
    }

    /* renamed from: a */
    public static StrikeReactionRepository m65189a(C14578a c14578a, StrikeReactionStore strikeReactionStore) {
        return (StrikeReactionRepository) C15521i.m58001a(c14578a.m55619a(strikeReactionStore), "Cannot return null from a non-@Nullable @Provides method");
    }
}
