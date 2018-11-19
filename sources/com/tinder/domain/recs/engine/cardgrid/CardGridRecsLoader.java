package com.tinder.domain.recs.engine.cardgrid;

import com.tinder.data.recs.C8786k;
import com.tinder.data.recs.C8786k.C10993a;
import com.tinder.data.recs.C8786k.C10994b;
import com.tinder.data.recs.C8786k.C10995c;
import com.tinder.data.recs.C8786k.C10996d;
import com.tinder.data.recs.C8786k.C10997e;
import com.tinder.data.recs.C8786k.C10998f;
import com.tinder.data.recs.C8786k.C10999g;
import com.tinder.domain.di.EngineScope;
import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.RecsRepository;
import com.tinder.domain.recs.RecsRepository.DefaultImpls;
import com.tinder.domain.recs.engine.RecsLoader;
import com.tinder.domain.recs.model.ContextualInfo.Default.UnexpectedError;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedExpectedError;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedNoConnection;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnexpectedError;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnknownLocation;
import com.tinder.domain.recs.model.RecsLoadingStatus.Loading;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecs;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecsDupesOnly;
import com.tinder.domain.recs.model.RecsLoadingStatus.RecsAvailable;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.util.ConnectivityProvider;
import com.tinder.util.ConnectivityProvider.NoInternetConnectionException;
import com.tinder.util.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Subscription;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002&'B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0017J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0017J\b\u0010#\u001a\u00020\u001aH\u0017J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0017J\b\u0010%\u001a\u00020\u000eH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00060\u0018R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/tinder/domain/recs/engine/cardgrid/CardGridRecsLoader;", "Lcom/tinder/domain/recs/engine/RecsLoader;", "recsRepository", "Lcom/tinder/domain/recs/RecsRepository;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "config", "Lcom/tinder/domain/recs/RecsEngine$Config;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "(Lcom/tinder/domain/recs/RecsRepository;Lcom/tinder/util/ConnectivityProvider;Lcom/tinder/domain/recs/RecsEngine$Config;Lcom/tinder/domain/recs/model/Rec$Source;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "isPaused", "", "lastKnownRecsUpdates", "Lcom/tinder/domain/recs/model/RecsUpdate;", "loadingStatusAdapter", "Lcom/tinder/domain/recs/engine/cardgrid/CardGridRecsLoader$LoadingStatusAdapter;", "loadingStatusProvider", "Lcom/tinder/domain/recs/engine/cardgrid/LoadingStatusProvider;", "getRecSource", "()Lcom/tinder/domain/recs/model/Rec$Source;", "recsLoadingRefreshingCoordinator", "Lcom/tinder/domain/recs/engine/cardgrid/CardGridRecsLoader$RecsLoadingRefreshingCoordinator;", "loadMoreRecs", "", "loadMoreRecsIfNeeded", "observeLoadingStatusUpdates", "Lrx/Observable;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "pause", "reset", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "resume", "safeReset", "shouldLoadMoreRecs", "LoadingStatusAdapter", "RecsLoadingRefreshingCoordinator", "engine_release"}, k = 1, mv = {1, 1, 9})
@EngineScope
public final class CardGridRecsLoader implements RecsLoader {
    private final C19573b compositeSubscription = new C19573b();
    private final Config config;
    private final ConnectivityProvider connectivityProvider;
    private boolean isPaused = true;
    private RecsUpdate lastKnownRecsUpdates;
    private final LoadingStatusAdapter loadingStatusAdapter = new LoadingStatusAdapter();
    private final LoadingStatusProvider loadingStatusProvider = new LoadingStatusProvider();
    @NotNull
    private final Rec$Source recSource;
    private final RecsLoadingRefreshingCoordinator recsLoadingRefreshingCoordinator = new RecsLoadingRefreshingCoordinator();
    private final RecsRepository recsRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/tinder/domain/recs/engine/cardgrid/CardGridRecsLoader$LoadingStatusAdapter;", "", "()V", "fromRecsFetchResults", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "recsFetchResults", "Lcom/tinder/data/recs/RecsFetchResults;", "fromThrowable", "throwable", "", "engine_release"}, k = 1, mv = {1, 1, 9})
    private static final class LoadingStatusAdapter {
        @NotNull
        public final RecsLoadingStatus fromRecsFetchResults(@NotNull C8786k c8786k) {
            C2668g.b(c8786k, "recsFetchResults");
            if (!(c8786k instanceof C10995c)) {
                if (!(c8786k instanceof C10996d)) {
                    if (c8786k instanceof C10999g) {
                        return (RecsLoadingStatus) FetchFailedUnknownLocation.INSTANCE;
                    }
                    if (c8786k instanceof C10997e) {
                        return (RecsLoadingStatus) NoMoreRecsDupesOnly.INSTANCE;
                    }
                    if (c8786k instanceof C10994b) {
                        return (RecsLoadingStatus) NoMoreRecs.INSTANCE;
                    }
                    if (c8786k instanceof C10993a) {
                        return new FetchFailedExpectedError(((C10993a) c8786k).mo9895c());
                    }
                    if (c8786k instanceof C10998f) {
                        return new FetchFailedUnexpectedError(((C10998f) c8786k).mo9895c());
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return (RecsLoadingStatus) RecsAvailable.INSTANCE;
        }

        @NotNull
        public final RecsLoadingStatus fromThrowable(@NotNull Throwable th) {
            C2668g.b(th, "throwable");
            if (th instanceof NoInternetConnectionException) {
                return (RecsLoadingStatus) FetchFailedNoConnection.INSTANCE;
            }
            return new FetchFailedUnexpectedError(new UnexpectedError(th));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/domain/recs/engine/cardgrid/CardGridRecsLoader$RecsLoadingRefreshingCoordinator;", "", "(Lcom/tinder/domain/recs/engine/cardgrid/CardGridRecsLoader;)V", "clearRecsSubscription", "Lrx/Subscription;", "loadRecsSubscription", "refreshRecsSubscription", "loadMoreRecs", "", "resetRecs", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "resetRecsAfterSuccessfulLoad", "engine_release"}, k = 1, mv = {1, 1, 9})
    private final class RecsLoadingRefreshingCoordinator {
        private Subscription clearRecsSubscription;
        private Subscription loadRecsSubscription;
        private Subscription refreshRecsSubscription;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void loadMoreRecs() {
            /*
            r6 = this;
            monitor-enter(r6);
            r0 = com.tinder.util.RxUtils.f47590a;	 Catch:{ all -> 0x00bc }
            r1 = r6.loadRecsSubscription;	 Catch:{ all -> 0x00bc }
            r0 = r0.a(r1);	 Catch:{ all -> 0x00bc }
            if (r0 != 0) goto L_0x00ba;
        L_0x000b:
            r0 = com.tinder.util.RxUtils.f47590a;	 Catch:{ all -> 0x00bc }
            r1 = r6.refreshRecsSubscription;	 Catch:{ all -> 0x00bc }
            r0 = r0.a(r1);	 Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0017;
        L_0x0015:
            goto L_0x00ba;
        L_0x0017:
            r0 = com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader.this;	 Catch:{ all -> 0x00bc }
            r0 = r0.loadingStatusProvider;	 Catch:{ all -> 0x00bc }
            r0 = r0.get();	 Catch:{ all -> 0x00bc }
            r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.Uninitialized;	 Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x0036;
        L_0x0025:
            r0 = com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader.this;	 Catch:{ all -> 0x00bc }
            r0 = r0.recsRepository;	 Catch:{ all -> 0x00bc }
            r0 = r0.loadRecs();	 Catch:{ all -> 0x00bc }
            r1 = com.tinder.domain.recs.model.RecsLoadingStatus.Loading.INSTANCE;	 Catch:{ all -> 0x00bc }
            r0 = kotlin.C15811g.a(r0, r1);	 Catch:{ all -> 0x00bc }
            goto L_0x0059;
        L_0x0036:
            r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.RecsAvailable;	 Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x003b;
        L_0x003a:
            goto L_0x0049;
        L_0x003b:
            r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedNoConnection;	 Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x0040;
        L_0x003f:
            goto L_0x0049;
        L_0x0040:
            r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnexpectedError;	 Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x0045;
        L_0x0044:
            goto L_0x0049;
        L_0x0045:
            r0 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecs;	 Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00b8;
        L_0x0049:
            r0 = com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader.this;	 Catch:{ all -> 0x00bc }
            r0 = r0.recsRepository;	 Catch:{ all -> 0x00bc }
            r0 = r0.loadAndCacheRecsFromNetwork();	 Catch:{ all -> 0x00bc }
            r1 = com.tinder.domain.recs.model.RecsLoadingStatus.LoadingMore.INSTANCE;	 Catch:{ all -> 0x00bc }
            r0 = kotlin.C15811g.a(r0, r1);	 Catch:{ all -> 0x00bc }
        L_0x0059:
            r1 = r0.c();	 Catch:{ all -> 0x00bc }
            r1 = (rx.Single) r1;	 Catch:{ all -> 0x00bc }
            r0 = r0.d();	 Catch:{ all -> 0x00bc }
            r0 = (com.tinder.domain.recs.model.RecsLoadingStatus) r0;	 Catch:{ all -> 0x00bc }
            r2 = com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader.this;	 Catch:{ all -> 0x00bc }
            r2 = r2.loadingStatusProvider;	 Catch:{ all -> 0x00bc }
            r2.update(r0);	 Catch:{ all -> 0x00bc }
            r0 = com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader.this;	 Catch:{ all -> 0x00bc }
            r0 = r0.config;	 Catch:{ all -> 0x00bc }
            r0 = r0.getLoadingLoadingRetryPolicy();	 Catch:{ all -> 0x00bc }
            r2 = com.tinder.util.RxUtils.f47590a;	 Catch:{ all -> 0x00bc }
            r3 = r0.getRetryCount();	 Catch:{ all -> 0x00bc }
            r0 = r0.getRetryIntervalMillis();	 Catch:{ all -> 0x00bc }
            r4 = (long) r0;	 Catch:{ all -> 0x00bc }
            r0 = r2.a(r3, r4);	 Catch:{ all -> 0x00bc }
            r0 = r0.a();	 Catch:{ all -> 0x00bc }
            r0 = r1.a(r0);	 Catch:{ all -> 0x00bc }
            r1 = new com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader$RecsLoadingRefreshingCoordinator$loadMoreRecs$1;	 Catch:{ all -> 0x00bc }
            r1.<init>(r6);	 Catch:{ all -> 0x00bc }
            r1 = (rx.functions.Action0) r1;	 Catch:{ all -> 0x00bc }
            r0 = r0.a(r1);	 Catch:{ all -> 0x00bc }
            r1 = rx.schedulers.Schedulers.io();	 Catch:{ all -> 0x00bc }
            r0 = r0.b(r1);	 Catch:{ all -> 0x00bc }
            r1 = new com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader$RecsLoadingRefreshingCoordinator$loadMoreRecs$2;	 Catch:{ all -> 0x00bc }
            r1.<init>(r6);	 Catch:{ all -> 0x00bc }
            r1 = (rx.functions.Action1) r1;	 Catch:{ all -> 0x00bc }
            r2 = new com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader$RecsLoadingRefreshingCoordinator$loadMoreRecs$3;	 Catch:{ all -> 0x00bc }
            r2.<init>(r6);	 Catch:{ all -> 0x00bc }
            r2 = (rx.functions.Action1) r2;	 Catch:{ all -> 0x00bc }
            r0 = r0.a(r1, r2);	 Catch:{ all -> 0x00bc }
            r6.loadRecsSubscription = r0;	 Catch:{ all -> 0x00bc }
            monitor-exit(r6);
            return;
        L_0x00b8:
            monitor-exit(r6);
            return;
        L_0x00ba:
            monitor-exit(r6);
            return;
        L_0x00bc:
            r0 = move-exception;
            monitor-exit(r6);
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.recs.engine.cardgrid.CardGridRecsLoader.RecsLoadingRefreshingCoordinator.loadMoreRecs():void");
        }

        public final void resetRecsAfterSuccessfulLoad(@NotNull ResetReason resetReason) {
            C2668g.b(resetReason, "reason");
            if (!RxUtils.f47590a.a(this.refreshRecsSubscription)) {
                Subscription subscription = this.loadRecsSubscription;
                if (subscription != null) {
                    subscription.unsubscribe();
                }
                CardGridRecsLoader.this.loadingStatusProvider.update(Loading.INSTANCE);
                this.refreshRecsSubscription = CardGridRecsLoader.this.recsRepository.resetNetworkState(resetReason).b(CardGridRecsLoader.this.recsRepository.loadRecsFromNetwork()).a(new C13159xd8082cb3(this)).a(new C13160xd8082cb4(this)).b(Schedulers.io()).a(new C13898xd8082cb5(this), new C13899xd8082cb6(this));
            }
        }

        public final void resetRecs(@NotNull ResetReason resetReason) {
            C2668g.b(resetReason, "reason");
            Subscription subscription = this.refreshRecsSubscription;
            if (subscription != null) {
                subscription.unsubscribe();
            }
            subscription = this.loadRecsSubscription;
            if (subscription != null) {
                subscription.unsubscribe();
            }
            this.clearRecsSubscription = CardGridRecsLoader.this.recsRepository.resetNetworkState(resetReason).a(CardGridRecsLoader.this.recsRepository.clearCache()).d(new CardGridRecsLoader$RecsLoadingRefreshingCoordinator$resetRecs$1(this)).b(Schedulers.io()).a(new CardGridRecsLoader$RecsLoadingRefreshingCoordinator$resetRecs$2(this), new CardGridRecsLoader$RecsLoadingRefreshingCoordinator$resetRecs$3(this));
        }
    }

    @Inject
    public CardGridRecsLoader(@NotNull RecsRepository recsRepository, @NotNull ConnectivityProvider connectivityProvider, @NotNull Config config, @NotNull Rec$Source rec$Source) {
        C2668g.b(recsRepository, "recsRepository");
        C2668g.b(connectivityProvider, "connectivityProvider");
        C2668g.b(config, "config");
        C2668g.b(rec$Source, "recSource");
        this.recsRepository = recsRepository;
        this.connectivityProvider = connectivityProvider;
        this.config = config;
        this.recSource = rec$Source;
    }

    @NotNull
    public Rec$Source getRecSource() {
        return this.recSource;
    }

    @NotNull
    public Observable<RecsLoadingStatus> observeLoadingStatusUpdates() {
        return this.loadingStatusProvider.observe();
    }

    public synchronized void resume() {
        if (!this.compositeSubscription.b()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(getRecSource());
            stringBuilder.append(" - resume()");
            C0001a.b(stringBuilder.toString(), new Object[0]);
            this.isPaused = false;
            Subscription a = this.connectivityProvider.b().f(CardGridRecsLoader$resume$connectivityChangesSubscription$1.INSTANCE).a(new CardGridRecsLoader$resume$connectivityChangesSubscription$2(this), CardGridRecsLoader$resume$connectivityChangesSubscription$3.INSTANCE);
            Subscription a2 = DefaultImpls.observeRecsUpdates$default(this.recsRepository, null, 1, null).a(new CardGridRecsLoader$resume$recsUpdatesSubscription$1(this), CardGridRecsLoader$resume$recsUpdatesSubscription$2.INSTANCE);
            this.compositeSubscription.a(new Subscription[]{a, a2});
            loadMoreRecsIfNeeded();
        }
    }

    public synchronized void pause() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(getRecSource());
        stringBuilder.append(" - pause()");
        C0001a.b(stringBuilder.toString(), new Object[0]);
        this.isPaused = true;
        this.compositeSubscription.a();
    }

    public synchronized void reset(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "reason");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(getRecSource());
        stringBuilder.append(" - reset()");
        C0001a.b(stringBuilder.toString(), new Object[0]);
        this.recsLoadingRefreshingCoordinator.resetRecs(resetReason);
    }

    public synchronized void safeReset(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "reason");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(getRecSource());
        stringBuilder.append(" - restart()");
        C0001a.b(stringBuilder.toString(), new Object[0]);
        this.recsLoadingRefreshingCoordinator.resetRecsAfterSuccessfulLoad(resetReason);
    }

    public final synchronized void loadMoreRecs() {
        if (!this.isPaused) {
            this.recsLoadingRefreshingCoordinator.loadMoreRecs();
        }
    }

    private final void loadMoreRecsIfNeeded() {
        if (shouldLoadMoreRecs()) {
            loadMoreRecs();
        }
    }

    private final boolean shouldLoadMoreRecs() {
        RecsUpdate recsUpdate = this.lastKnownRecsUpdates;
        boolean z = true;
        if (recsUpdate == null) {
            return true;
        }
        if (recsUpdate.getCurrentRecs().size() >= this.config.getLowOnRecsThreshold()) {
            z = false;
        }
        return z;
    }
}
