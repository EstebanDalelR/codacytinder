package com.tinder.app.dagger.module.p163e;

import com.tinder.api.TinderApi;
import com.tinder.common.logger.Logger;
import com.tinder.data.adapter.ah;
import com.tinder.data.adapter.ap;
import com.tinder.data.superlikeable.C11000a;
import com.tinder.data.superlikeable.C8794b;
import com.tinder.data.superlikeable.SuperLikeableGameApiClient;
import com.tinder.data.superlikeable.SuperLikeableGameApiClient.C8790a;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator;
import com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator.GamePlayFlow;
import com.tinder.domain.superlikeable.SuperLikeableGameRepository;
import com.tinder.domain.superlikeable.SuperLikeableGameSwipeTracker;
import com.tinder.domain.superlikeable.usecase.EndSuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.InjectSuperLikeableGameTeaserRec;
import com.tinder.domain.superlikeable.usecase.LoadSuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.SkipSuperLikeableGame;
import com.tinder.module.Published;
import com.tinder.superlikeable.C15139b;
import com.tinder.util.ConnectivityProvider;
import dagger.Module;
import dagger.Provides;
import io.paperdb.Paper;
import javax.inject.Named;
import javax.inject.Singleton;

@Published
@Module
/* renamed from: com.tinder.app.dagger.module.e.a */
public abstract class C8248a {
    @Singleton
    @Provides
    /* renamed from: a */
    static SuperLikeableGameRepository m35187a(C8794b c8794b, SuperLikeableGameApiClient superLikeableGameApiClient) {
        return new C11000a(c8794b, superLikeableGameApiClient);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    static C8794b m35185a() {
        return new C8794b(Paper.book("superLikeable"));
    }

    @Singleton
    @Provides
    /* renamed from: a */
    static SuperLikeableGameApiClient m35184a(TinderApi tinderApi, ap apVar, C8790a c8790a, ConnectivityProvider connectivityProvider) {
        return new SuperLikeableGameApiClient(tinderApi, apVar, c8790a, connectivityProvider);
    }

    @Singleton
    @Provides
    /* renamed from: a */
    static ap m35183a(@Named("core") ah ahVar) {
        return new ap(ahVar);
    }

    @Singleton
    @Provides
    /* renamed from: b */
    static C8790a m35190b() {
        return new C8790a();
    }

    @Singleton
    @Provides
    /* renamed from: a */
    static SuperLikeableGamePlayCoordinator m35186a(GamePlayFlow gamePlayFlow, LoadSuperLikeableGame loadSuperLikeableGame, InjectSuperLikeableGameTeaserRec injectSuperLikeableGameTeaserRec, SkipSuperLikeableGame skipSuperLikeableGame, SuperLikeableGameSwipeTracker superLikeableGameSwipeTracker, RecsEngineRegistry recsEngineRegistry, Logger logger) {
        return new SuperLikeableGamePlayCoordinator(gamePlayFlow, superLikeableGameSwipeTracker, loadSuperLikeableGame, injectSuperLikeableGameTeaserRec, skipSuperLikeableGame, recsEngineRegistry.getEngine(Core.INSTANCE), logger);
    }

    @Provides
    /* renamed from: a */
    static EndSuperLikeableGame m35188a(LoadSuperLikeableGame loadSuperLikeableGame, RecsEngineRegistry recsEngineRegistry, SuperLikeableGamePlayCoordinator superLikeableGamePlayCoordinator, Logger logger) {
        return new EndSuperLikeableGame(loadSuperLikeableGame, recsEngineRegistry.getEngine(Core.INSTANCE), superLikeableGamePlayCoordinator, logger);
    }

    @Provides
    /* renamed from: a */
    static InjectSuperLikeableGameTeaserRec m35189a(RecsEngineRegistry recsEngineRegistry) {
        return new InjectSuperLikeableGameTeaserRec(recsEngineRegistry.getEngine(Core.INSTANCE));
    }

    @Singleton
    @Provides
    /* renamed from: c */
    static C15139b m35191c() {
        return new C15139b(4);
    }
}
