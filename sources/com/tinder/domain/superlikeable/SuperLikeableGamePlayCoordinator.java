package com.tinder.domain.superlikeable;

import com.tinder.common.logger.Logger;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.superlikeable.SuperLikeableGameRepository.SkipRequestPendingException;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.InjectSuperLikeableGameTeaserRec;
import com.tinder.domain.superlikeable.usecase.LoadSuperLikeableGame;
import com.tinder.domain.superlikeable.usecase.SkipSuperLikeableGame;
import com.tinder.domain.utils.RxUtils;
import com.tinder.util.ConnectivityProvider.NoInternetConnectionException;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Subscription;
import rx.schedulers.Schedulers;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001-B?\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0007J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0007J\b\u0010 \u001a\u00020\u001cH\u0002J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\"J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0003J\b\u0010)\u001a\u00020\u001cH\u0002J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002J<\u0010+\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010(0( \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010(0(\u0018\u00010\"0\"*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0,0\"H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0011\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator;", "", "gamePlayFlow", "Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator$GamePlayFlow;", "swipeTracker", "Lcom/tinder/domain/superlikeable/SuperLikeableGameSwipeTracker;", "loadSuperLikeableGame", "Lcom/tinder/domain/superlikeable/usecase/LoadSuperLikeableGame;", "injectSuperLikeableGameTeaserRec", "Lcom/tinder/domain/superlikeable/usecase/InjectSuperLikeableGameTeaserRec;", "skipSuperLikeableGame", "Lcom/tinder/domain/superlikeable/usecase/SkipSuperLikeableGame;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator$GamePlayFlow;Lcom/tinder/domain/superlikeable/SuperLikeableGameSwipeTracker;Lcom/tinder/domain/superlikeable/usecase/LoadSuperLikeableGame;Lcom/tinder/domain/superlikeable/usecase/InjectSuperLikeableGameTeaserRec;Lcom/tinder/domain/superlikeable/usecase/SkipSuperLikeableGame;Lcom/tinder/domain/recs/RecsEngine;Lcom/tinder/common/logger/Logger;)V", "gamePlayStatusSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator$GamePlayFlow$Status;", "kotlin.jvm.PlatformType", "loadSuperLikeableGameSubscription", "Lrx/Subscription;", "recsUpdateSubscription", "status", "getStatus", "()Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator$GamePlayFlow$Status;", "clearInjectionStatus", "", "endGame", "evaluateGameInjection", "evaluateGamePlay", "loadGame", "observeGamePlayStatus", "Lrx/Observable;", "onGameLoadFailed", "error", "", "onGameLoaded", "game", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "subscribeToRecsUpdatesIfUnsubscribed", "updateStatusTo", "validateGamePlayability", "Ljava8/util/Optional;", "GamePlayFlow", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableGamePlayCoordinator {
    private final GamePlayFlow gamePlayFlow;
    private final PublishSubject<Status> gamePlayStatusSubject = PublishSubject.w();
    private final InjectSuperLikeableGameTeaserRec injectSuperLikeableGameTeaserRec;
    private final LoadSuperLikeableGame loadSuperLikeableGame;
    private Subscription loadSuperLikeableGameSubscription;
    private final Logger logger;
    private final RecsEngine recsEngine;
    private Subscription recsUpdateSubscription;
    private final SkipSuperLikeableGame skipSuperLikeableGame;
    private final SuperLikeableGameSwipeTracker swipeTracker;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0001¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator$GamePlayFlow;", "", "()V", "playableGameAvailable", "Ljava8/util/Optional;", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "getPlayableGameAvailable", "()Ljava8/util/Optional;", "setPlayableGameAvailable", "(Ljava8/util/Optional;)V", "status", "Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator$GamePlayFlow$Status;", "getStatus", "()Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator$GamePlayFlow$Status;", "setStatus", "(Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator$GamePlayFlow$Status;)V", "Status", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class GamePlayFlow {
        @NotNull
        private Optional<SuperLikeableGame> playableGameAvailable;
        @NotNull
        private Status status = Status.GAME_LOAD_PENDING;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/domain/superlikeable/SuperLikeableGamePlayCoordinator$GamePlayFlow$Status;", "", "(Ljava/lang/String;I)V", "GAME_LOAD_PENDING", "GAME_LOADING", "GAME_LOADED_BUT_NOT_INJECTED", "GAME_INJECTED", "GAME_OVER", "domain_release"}, k = 1, mv = {1, 1, 10})
        public enum Status {
        }

        @Inject
        public GamePlayFlow() {
            Optional a = Optional.a();
            C2668g.a(a, "Optional.empty()");
            this.playableGameAvailable = a;
        }

        @NotNull
        public final Optional<SuperLikeableGame> getPlayableGameAvailable() {
            return this.playableGameAvailable;
        }

        public final void setPlayableGameAvailable(@NotNull Optional<SuperLikeableGame> optional) {
            C2668g.b(optional, "<set-?>");
            this.playableGameAvailable = optional;
        }

        @NotNull
        public final Status getStatus() {
            return this.status;
        }

        public final void setStatus(@NotNull Status status) {
            C2668g.b(status, "<set-?>");
            this.status = status;
        }
    }

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Status.values().length];

        static {
            $EnumSwitchMapping$0 = new int[Status.values().length];
            $EnumSwitchMapping$0[Status.GAME_LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Status.GAME_INJECTED.ordinal()] = 2;
            $EnumSwitchMapping$0[Status.GAME_LOAD_PENDING.ordinal()] = 3;
            $EnumSwitchMapping$0[Status.GAME_LOADED_BUT_NOT_INJECTED.ordinal()] = 4;
            $EnumSwitchMapping$1[Status.GAME_OVER.ordinal()] = 1;
        }
    }

    public SuperLikeableGamePlayCoordinator(@NotNull GamePlayFlow gamePlayFlow, @NotNull SuperLikeableGameSwipeTracker superLikeableGameSwipeTracker, @NotNull LoadSuperLikeableGame loadSuperLikeableGame, @NotNull InjectSuperLikeableGameTeaserRec injectSuperLikeableGameTeaserRec, @NotNull SkipSuperLikeableGame skipSuperLikeableGame, @NotNull RecsEngine recsEngine, @NotNull Logger logger) {
        C2668g.b(gamePlayFlow, "gamePlayFlow");
        C2668g.b(superLikeableGameSwipeTracker, "swipeTracker");
        C2668g.b(loadSuperLikeableGame, "loadSuperLikeableGame");
        C2668g.b(injectSuperLikeableGameTeaserRec, "injectSuperLikeableGameTeaserRec");
        C2668g.b(skipSuperLikeableGame, "skipSuperLikeableGame");
        C2668g.b(recsEngine, "recsEngine");
        C2668g.b(logger, "logger");
        this.gamePlayFlow = gamePlayFlow;
        this.swipeTracker = superLikeableGameSwipeTracker;
        this.loadSuperLikeableGame = loadSuperLikeableGame;
        this.injectSuperLikeableGameTeaserRec = injectSuperLikeableGameTeaserRec;
        this.skipSuperLikeableGame = skipSuperLikeableGame;
        this.recsEngine = recsEngine;
        this.logger = logger;
    }

    @NotNull
    public final Status getStatus() {
        return this.gamePlayFlow.getStatus();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateGamePlay() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.gamePlayFlow;	 Catch:{ all -> 0x004c }
        r0 = r0.getStatus();	 Catch:{ all -> 0x004c }
        r1 = com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator.WhenMappings.$EnumSwitchMapping$1;	 Catch:{ all -> 0x004c }
        r2 = r0.ordinal();	 Catch:{ all -> 0x004c }
        r1 = r1[r2];	 Catch:{ all -> 0x004c }
        r2 = 1;
        if (r1 == r2) goto L_0x004a;
    L_0x0012:
        r4.subscribeToRecsUpdatesIfUnsubscribed();	 Catch:{ all -> 0x004c }
        r1 = r4.swipeTracker;	 Catch:{ all -> 0x004c }
        r1.trackNewSwipe();	 Catch:{ all -> 0x004c }
        r1 = com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator.WhenMappings.$EnumSwitchMapping$0;	 Catch:{ all -> 0x004c }
        r2 = r0.ordinal();	 Catch:{ all -> 0x004c }
        r1 = r1[r2];	 Catch:{ all -> 0x004c }
        switch(r1) {
            case 1: goto L_0x0031;
            case 2: goto L_0x0031;
            case 3: goto L_0x002c;
            case 4: goto L_0x0028;
            default: goto L_0x0025;
        };	 Catch:{ all -> 0x004c }
    L_0x0025:
        r1 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x004c }
        goto L_0x0033;
    L_0x0028:
        r4.evaluateGameInjection();	 Catch:{ all -> 0x004c }
        goto L_0x002f;
    L_0x002c:
        r4.loadGame();	 Catch:{ all -> 0x004c }
    L_0x002f:
        monitor-exit(r4);
        return;
    L_0x0031:
        monitor-exit(r4);
        return;
    L_0x0033:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004c }
        r2.<init>();	 Catch:{ all -> 0x004c }
        r3 = "Unhandled SuperLikeable GamePlayFlow status: ";
        r2.append(r3);	 Catch:{ all -> 0x004c }
        r2.append(r0);	 Catch:{ all -> 0x004c }
        r0 = r2.toString();	 Catch:{ all -> 0x004c }
        r1.<init>(r0);	 Catch:{ all -> 0x004c }
        r1 = (java.lang.Throwable) r1;	 Catch:{ all -> 0x004c }
        throw r1;	 Catch:{ all -> 0x004c }
    L_0x004a:
        monitor-exit(r4);
        return;
    L_0x004c:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.superlikeable.SuperLikeableGamePlayCoordinator.evaluateGamePlay():void");
    }

    public final synchronized void endGame() {
        this.logger.debug("endGame() was called");
        Subscription subscription = this.recsUpdateSubscription;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        updateStatusTo(Status.GAME_OVER);
    }

    @NotNull
    public final Observable<Status> observeGamePlayStatus() {
        Observable<Status> g = this.gamePlayStatusSubject.e().g();
        C2668g.a(g, "gamePlayStatusSubject.as…().distinctUntilChanged()");
        return g;
    }

    private final void loadGame() {
        Observable a = this.loadSuperLikeableGame.execute().a(new SuperLikeableGamePlayCoordinator$loadGame$1(this)).a();
        C2668g.a(a, "loadSuperLikeableGame.ex…          .toObservable()");
        SuperLikeableGamePlayCoordinator superLikeableGamePlayCoordinator = this;
        this.loadSuperLikeableGameSubscription = validateGamePlayability(a).b(Schedulers.io()).a(new SuperLikeableGamePlayCoordinator$sam$rx_functions_Action1$0(new SuperLikeableGamePlayCoordinator$loadGame$2(superLikeableGamePlayCoordinator)), new SuperLikeableGamePlayCoordinator$sam$rx_functions_Action1$0(new SuperLikeableGamePlayCoordinator$loadGame$3(superLikeableGamePlayCoordinator)));
    }

    private final synchronized void onGameLoaded(SuperLikeableGame superLikeableGame) {
        GamePlayFlow gamePlayFlow = this.gamePlayFlow;
        Optional a = Optional.a(superLikeableGame);
        C2668g.a(a, "Optional.of(game)");
        gamePlayFlow.setPlayableGameAvailable(a);
        this.swipeTracker.updateInjectionThreshold(superLikeableGame.getInjectionSwipeThreshold());
        updateStatusTo(Status.GAME_LOADED_BUT_NOT_INJECTED);
        evaluateGameInjection();
    }

    private final void onGameLoadFailed(Throwable th) {
        if (th instanceof NoInternetConnectionException) {
            this.logger.debug("Unable to load superLikeableGame. No Internet connection");
        } else if (th instanceof SkipRequestPendingException) {
            this.skipSuperLikeableGame.execute();
        } else {
            this.logger.error(th, "Unable to load superLikeableGame.");
        }
        synchronized (this) {
            updateStatusTo(Status.GAME_LOAD_PENDING);
            th = C15813i.f49016a;
        }
    }

    private final Observable<SuperLikeableGame> validateGamePlayability(@NotNull Observable<Optional<SuperLikeableGame>> observable) {
        return observable.c(new SuperLikeableGamePlayCoordinator$validateGamePlayability$1(this));
    }

    private final void evaluateGameInjection() {
        if (!this.swipeTracker.injectionThresholdWasHit()) {
            return;
        }
        if (this.gamePlayFlow.getPlayableGameAvailable().c()) {
            SuperLikeableGame superLikeableGame = (SuperLikeableGame) this.gamePlayFlow.getPlayableGameAvailable().b();
            InjectSuperLikeableGameTeaserRec injectSuperLikeableGameTeaserRec = this.injectSuperLikeableGameTeaserRec;
            C2668g.a(superLikeableGame, "game");
            injectSuperLikeableGameTeaserRec.execute(superLikeableGame).a(new SuperLikeableGamePlayCoordinator$evaluateGameInjection$2(this), new SuperLikeableGamePlayCoordinator$evaluateGameInjection$3(this));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("When the state is ");
        stringBuilder.append(Status.GAME_INJECTED);
        stringBuilder.append(", there should be a playable game in cache.");
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    private final void subscribeToRecsUpdatesIfUnsubscribed() {
        if (!RxUtils.INSTANCE.isSubscribed(this.recsUpdateSubscription)) {
            this.recsUpdateSubscription = this.recsEngine.observeRecsUpdates().f(C13162xb89f54c5.INSTANCE).f(new C13163xb89f54c6(this)).a(new C13911xb89f54c7(this), new C13912xb89f54c8(this));
        }
    }

    private final void clearInjectionStatus() {
        updateStatusTo(Status.GAME_LOADED_BUT_NOT_INJECTED);
    }

    private final void updateStatusTo(Status status) {
        this.gamePlayFlow.setStatus(status);
        this.gamePlayStatusSubject.onNext(status);
    }
}
