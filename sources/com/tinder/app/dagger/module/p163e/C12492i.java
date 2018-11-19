package com.tinder.app.dagger.module.p163e;

import com.tinder.common.logger.Logger;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator;
import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator.GamePlayFlow;
import com.tinder.domain.superlikeable.SuperLikeableGameSwipeTracker;
import com.tinder.domain.superlikeable.usecase.InjectSuperLikeableGameTeaserRec;
import com.tinder.domain.superlikeable.usecase.LoadSuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.SkipSuperLikeableGame;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.app.dagger.module.e.i */
public final class C12492i implements Factory<SuperLikeableGamePlayCoordinator> {
    /* renamed from: a */
    private final Provider<GamePlayFlow> f40275a;
    /* renamed from: b */
    private final Provider<LoadSuperLikeableGame> f40276b;
    /* renamed from: c */
    private final Provider<InjectSuperLikeableGameTeaserRec> f40277c;
    /* renamed from: d */
    private final Provider<SkipSuperLikeableGame> f40278d;
    /* renamed from: e */
    private final Provider<SuperLikeableGameSwipeTracker> f40279e;
    /* renamed from: f */
    private final Provider<RecsEngineRegistry> f40280f;
    /* renamed from: g */
    private final Provider<Logger> f40281g;

    public /* synthetic */ Object get() {
        return m49141a();
    }

    public C12492i(Provider<GamePlayFlow> provider, Provider<LoadSuperLikeableGame> provider2, Provider<InjectSuperLikeableGameTeaserRec> provider3, Provider<SkipSuperLikeableGame> provider4, Provider<SuperLikeableGameSwipeTracker> provider5, Provider<RecsEngineRegistry> provider6, Provider<Logger> provider7) {
        this.f40275a = provider;
        this.f40276b = provider2;
        this.f40277c = provider3;
        this.f40278d = provider4;
        this.f40279e = provider5;
        this.f40280f = provider6;
        this.f40281g = provider7;
    }

    /* renamed from: a */
    public SuperLikeableGamePlayCoordinator m49141a() {
        return C12492i.m49139a(this.f40275a, this.f40276b, this.f40277c, this.f40278d, this.f40279e, this.f40280f, this.f40281g);
    }

    /* renamed from: a */
    public static SuperLikeableGamePlayCoordinator m49139a(Provider<GamePlayFlow> provider, Provider<LoadSuperLikeableGame> provider2, Provider<InjectSuperLikeableGameTeaserRec> provider3, Provider<SkipSuperLikeableGame> provider4, Provider<SuperLikeableGameSwipeTracker> provider5, Provider<RecsEngineRegistry> provider6, Provider<Logger> provider7) {
        return C12492i.m49138a((GamePlayFlow) provider.get(), (LoadSuperLikeableGame) provider2.get(), (InjectSuperLikeableGameTeaserRec) provider3.get(), (SkipSuperLikeableGame) provider4.get(), (SuperLikeableGameSwipeTracker) provider5.get(), (RecsEngineRegistry) provider6.get(), (Logger) provider7.get());
    }

    /* renamed from: b */
    public static C12492i m49140b(Provider<GamePlayFlow> provider, Provider<LoadSuperLikeableGame> provider2, Provider<InjectSuperLikeableGameTeaserRec> provider3, Provider<SkipSuperLikeableGame> provider4, Provider<SuperLikeableGameSwipeTracker> provider5, Provider<RecsEngineRegistry> provider6, Provider<Logger> provider7) {
        return new C12492i(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    /* renamed from: a */
    public static SuperLikeableGamePlayCoordinator m49138a(GamePlayFlow gamePlayFlow, LoadSuperLikeableGame loadSuperLikeableGame, InjectSuperLikeableGameTeaserRec injectSuperLikeableGameTeaserRec, SkipSuperLikeableGame skipSuperLikeableGame, SuperLikeableGameSwipeTracker superLikeableGameSwipeTracker, RecsEngineRegistry recsEngineRegistry, Logger logger) {
        return (SuperLikeableGamePlayCoordinator) C15521i.a(C8248a.m35186a(gamePlayFlow, loadSuperLikeableGame, injectSuperLikeableGameTeaserRec, skipSuperLikeableGame, superLikeableGameSwipeTracker, recsEngineRegistry, logger), "Cannot return null from a non-@Nullable @Provides method");
    }
}
