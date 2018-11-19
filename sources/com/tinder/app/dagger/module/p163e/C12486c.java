package com.tinder.app.dagger.module.p163e;

import com.tinder.common.logger.Logger;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator;
import com.tinder.domain.superlikeable.usecase.EndSuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.LoadSuperLikeableGame;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.e.c */
public final class C12486c implements Factory<EndSuperLikeableGame> {
    /* renamed from: a */
    private final Provider<LoadSuperLikeableGame> f40263a;
    /* renamed from: b */
    private final Provider<RecsEngineRegistry> f40264b;
    /* renamed from: c */
    private final Provider<SuperLikeableGamePlayCoordinator> f40265c;
    /* renamed from: d */
    private final Provider<Logger> f40266d;

    public /* synthetic */ Object get() {
        return m49117a();
    }

    /* renamed from: a */
    public EndSuperLikeableGame m49117a() {
        return C12486c.m49116a(this.f40263a, this.f40264b, this.f40265c, this.f40266d);
    }

    /* renamed from: a */
    public static EndSuperLikeableGame m49116a(Provider<LoadSuperLikeableGame> provider, Provider<RecsEngineRegistry> provider2, Provider<SuperLikeableGamePlayCoordinator> provider3, Provider<Logger> provider4) {
        return C12486c.m49115a((LoadSuperLikeableGame) provider.get(), (RecsEngineRegistry) provider2.get(), (SuperLikeableGamePlayCoordinator) provider3.get(), (Logger) provider4.get());
    }

    /* renamed from: a */
    public static EndSuperLikeableGame m49115a(LoadSuperLikeableGame loadSuperLikeableGame, RecsEngineRegistry recsEngineRegistry, SuperLikeableGamePlayCoordinator superLikeableGamePlayCoordinator, Logger logger) {
        return (EndSuperLikeableGame) C15521i.a(C8248a.m35188a(loadSuperLikeableGame, recsEngineRegistry, superLikeableGamePlayCoordinator, logger), "Cannot return null from a non-@Nullable @Provides method");
    }
}
