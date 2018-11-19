package com.tinder.app.dagger.module.p163e;

import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.superlikeable.usecase.InjectSuperLikeableGameTeaserRec;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.e.d */
public final class C12487d implements Factory<InjectSuperLikeableGameTeaserRec> {
    /* renamed from: a */
    private final Provider<RecsEngineRegistry> f40267a;

    public /* synthetic */ Object get() {
        return m49121a();
    }

    public C12487d(Provider<RecsEngineRegistry> provider) {
        this.f40267a = provider;
    }

    /* renamed from: a */
    public InjectSuperLikeableGameTeaserRec m49121a() {
        return C12487d.m49119a(this.f40267a);
    }

    /* renamed from: a */
    public static InjectSuperLikeableGameTeaserRec m49119a(Provider<RecsEngineRegistry> provider) {
        return C12487d.m49118a((RecsEngineRegistry) provider.get());
    }

    /* renamed from: b */
    public static C12487d m49120b(Provider<RecsEngineRegistry> provider) {
        return new C12487d(provider);
    }

    /* renamed from: a */
    public static InjectSuperLikeableGameTeaserRec m49118a(RecsEngineRegistry recsEngineRegistry) {
        return (InjectSuperLikeableGameTeaserRec) C15521i.a(C8248a.m35189a(recsEngineRegistry), "Cannot return null from a non-@Nullable @Provides method");
    }
}
