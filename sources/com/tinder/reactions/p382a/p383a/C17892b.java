package com.tinder.reactions.p382a.p383a;

import com.squareup.sqlbrite.BriteDatabase;
import com.tinder.data.reactions.StrikeReactionStore;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.a.a.b */
public final class C17892b implements Factory<StrikeReactionStore> {
    /* renamed from: a */
    private final C14578a f55790a;
    /* renamed from: b */
    private final Provider<BriteDatabase> f55791b;

    public /* synthetic */ Object get() {
        return m65188a();
    }

    public C17892b(C14578a c14578a, Provider<BriteDatabase> provider) {
        this.f55790a = c14578a;
        this.f55791b = provider;
    }

    /* renamed from: a */
    public StrikeReactionStore m65188a() {
        return C17892b.m65186a(this.f55790a, this.f55791b);
    }

    /* renamed from: a */
    public static StrikeReactionStore m65186a(C14578a c14578a, Provider<BriteDatabase> provider) {
        return C17892b.m65185a(c14578a, (BriteDatabase) provider.get());
    }

    /* renamed from: b */
    public static C17892b m65187b(C14578a c14578a, Provider<BriteDatabase> provider) {
        return new C17892b(c14578a, provider);
    }

    /* renamed from: a */
    public static StrikeReactionStore m65185a(C14578a c14578a, BriteDatabase briteDatabase) {
        return (StrikeReactionStore) C15521i.m58001a(c14578a.m55618a(briteDatabase), "Cannot return null from a non-@Nullable @Provides method");
    }
}
