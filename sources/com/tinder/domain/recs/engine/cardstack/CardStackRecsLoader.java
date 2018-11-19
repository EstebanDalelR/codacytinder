package com.tinder.domain.recs.engine.cardstack;

import com.tinder.data.recs.C8786k;
import com.tinder.data.recs.C8786k.C10993a;
import com.tinder.data.recs.C8786k.C10994b;
import com.tinder.data.recs.C8786k.C10995c;
import com.tinder.data.recs.C8786k.C10996d;
import com.tinder.data.recs.C8786k.C10997e;
import com.tinder.data.recs.C8786k.C10998f;
import com.tinder.data.recs.C8786k.C10999g;
import com.tinder.domain.di.EngineScope;
import com.tinder.domain.recs.RecsAdditionalDataPrefetcher;
import com.tinder.domain.recs.RecsEngine.Config;
import com.tinder.domain.recs.RecsEngine.LoadingRetryPolicy;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.RecsRepository;
import com.tinder.domain.recs.RecsRepository.DefaultImpls;
import com.tinder.domain.recs.engine.RecsLoader;
import com.tinder.domain.recs.model.ContextualInfo.Default.UnexpectedError;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedExpectedError;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedNoConnection;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnexpectedError;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnknownLocation;
import com.tinder.domain.recs.model.RecsLoadingStatus.Loading;
import com.tinder.domain.recs.model.RecsLoadingStatus.LoadingMore;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecs;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecsDupesOnly;
import com.tinder.domain.recs.model.RecsLoadingStatus.RecsAvailable;
import com.tinder.domain.recs.model.RecsLoadingStatus.RetryingUnknownLocation;
import com.tinder.domain.recs.model.RecsLoadingStatus.Uninitialized;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.Insert;
import com.tinder.util.ConnectivityProvider;
import com.tinder.util.ConnectivityProvider.NoInternetConnectionException;
import com.tinder.util.RxUtils;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Observable;
import rx.Single;
import rx.Subscription;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 A2\u00020\u0001:\u0001AB5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u001d\u001a\u00020\u001eH\u0003J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0(H\u0016J\b\u0010)\u001a\u00020\u001eH\u0017J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0017J\b\u0010-\u001a\u00020\u001eH\u0003J\u0010\u0010.\u001a\u00020/2\u0006\u0010+\u001a\u00020,H\u0002J\b\u00100\u001a\u00020\u001eH\u0017J\b\u00101\u001a\u00020\u001eH\u0003J\u0010\u00102\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0016J\u001e\u00103\u001a\u00020\u001e2\f\u00104\u001a\b\u0012\u0004\u0012\u000206052\u0006\u00107\u001a\u00020\u001bH\u0002J\b\u00108\u001a\u00020\u001eH\u0002J\b\u00109\u001a\u00020\u001eH\u0002J\b\u0010:\u001a\u00020\u001eH\u0002J\b\u0010;\u001a\u00020\u001eH\u0002J\b\u0010<\u001a\u00020\u001eH\u0002J\u0010\u0010=\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u001bH\u0003J\u0010\u0010?\u001a\u00020\u001e2\u0006\u0010@\u001a\u000206H\u0003R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/tinder/domain/recs/engine/cardstack/CardStackRecsLoader;", "Lcom/tinder/domain/recs/engine/RecsLoader;", "recsRepository", "Lcom/tinder/domain/recs/RecsRepository;", "recsPrefetcher", "Lcom/tinder/domain/recs/RecsAdditionalDataPrefetcher;", "Lcom/tinder/domain/recs/model/Rec;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "config", "Lcom/tinder/domain/recs/RecsEngine$Config;", "recSource", "Lcom/tinder/domain/recs/model/Rec$Source;", "(Lcom/tinder/domain/recs/RecsRepository;Lcom/tinder/domain/recs/RecsAdditionalDataPrefetcher;Lcom/tinder/util/ConnectivityProvider;Lcom/tinder/domain/recs/RecsEngine$Config;Lcom/tinder/domain/recs/model/Rec$Source;)V", "clearRecsSubscription", "Lrx/Subscription;", "connectivityChangesSubscription", "currentMissingLocationAttempt", "", "isLowOnRecs", "", "isPaused", "loadRecsSubscription", "getRecSource", "()Lcom/tinder/domain/recs/model/Rec$Source;", "recsLoadingStatusUpdatesSubject", "Lrx/subjects/BehaviorSubject;", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "recsUpdatesSubscription", "evaluateLoadMore", "", "handleRecsLoadingError", "throwable", "", "handleRecsUpdate", "recsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "loadMoreRecs", "loadRecs", "observeLoadingStatusUpdates", "Lrx/Observable;", "pause", "reset", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "resetMissingLocationRetryCount", "resetRecsData", "Lrx/Completable;", "resume", "retryMissingLocation", "safeReset", "subscribeForRecsLoading", "loadRecsSingle", "Lrx/Single;", "Lcom/tinder/data/recs/RecsFetchResults;", "recsLoadingStatus", "subscribeToConnectivityUpdates", "subscribeToRecsUpdates", "unsubscribeFromConnectivityUpdates", "unsubscribeFromRecsLoading", "unsubscribeFromRecsUpdates", "updateAndNotifyLoadingStatus", "newStatus", "updateLoadingStatus", "fetchResults", "Companion", "engine_release"}, k = 1, mv = {1, 1, 9})
@EngineScope
public final class CardStackRecsLoader implements RecsLoader {
    public static final Companion Companion = new Companion();
    private static final int RETRY_ON_LOCATION_MISSING_INTERVAL_MS = 1000;
    private static final int RETRY_ON_LOCATION_MISSING_MAX_COUNT = 5;
    private Subscription clearRecsSubscription;
    private final Config config;
    private Subscription connectivityChangesSubscription;
    private final ConnectivityProvider connectivityProvider;
    private int currentMissingLocationAttempt;
    private boolean isLowOnRecs = true;
    private boolean isPaused;
    private Subscription loadRecsSubscription;
    @NotNull
    private final Rec$Source recSource;
    private final C19785a<RecsLoadingStatus> recsLoadingStatusUpdatesSubject;
    private final RecsAdditionalDataPrefetcher<Rec> recsPrefetcher;
    private final RecsRepository recsRepository;
    private Subscription recsUpdatesSubscription;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/recs/engine/cardstack/CardStackRecsLoader$Companion;", "", "()V", "RETRY_ON_LOCATION_MISSING_INTERVAL_MS", "", "RETRY_ON_LOCATION_MISSING_MAX_COUNT", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Companion {
        private Companion() {
        }
    }

    @Inject
    public CardStackRecsLoader(@NotNull RecsRepository recsRepository, @NotNull RecsAdditionalDataPrefetcher<? super Rec> recsAdditionalDataPrefetcher, @NotNull ConnectivityProvider connectivityProvider, @NotNull Config config, @NotNull Rec$Source rec$Source) {
        C2668g.b(recsRepository, "recsRepository");
        C2668g.b(recsAdditionalDataPrefetcher, "recsPrefetcher");
        C2668g.b(connectivityProvider, "connectivityProvider");
        C2668g.b(config, "config");
        C2668g.b(rec$Source, "recSource");
        this.recsRepository = recsRepository;
        this.recsPrefetcher = recsAdditionalDataPrefetcher;
        this.connectivityProvider = connectivityProvider;
        this.config = config;
        this.recSource = rec$Source;
        recsRepository = C19785a.f(Uninitialized.INSTANCE);
        C2668g.a(recsRepository, "BehaviorSubject.create(R…dingStatus.Uninitialized)");
        this.recsLoadingStatusUpdatesSubject = recsRepository;
    }

    @NotNull
    public Rec$Source getRecSource() {
        return this.recSource;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void resume() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = "%s - resume()";
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x0057 }
        r2 = r4.getRecSource();	 Catch:{ all -> 0x0057 }
        r3 = 0;
        r1[r3] = r2;	 Catch:{ all -> 0x0057 }
        p000a.p001a.C0001a.b(r0, r1);	 Catch:{ all -> 0x0057 }
        r4.isPaused = r3;	 Catch:{ all -> 0x0057 }
        r4.subscribeToConnectivityUpdates();	 Catch:{ all -> 0x0057 }
        r4.subscribeToRecsUpdates();	 Catch:{ all -> 0x0057 }
        r0 = r4.recsLoadingStatusUpdatesSubject;	 Catch:{ all -> 0x0057 }
        r0 = r0.A();	 Catch:{ all -> 0x0057 }
        r0 = (com.tinder.domain.recs.model.RecsLoadingStatus) r0;	 Catch:{ all -> 0x0057 }
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.Uninitialized;	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x0028;
    L_0x0024:
        r4.loadRecs();	 Catch:{ all -> 0x0057 }
        goto L_0x0055;
    L_0x0028:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedNoConnection;	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x002d;
    L_0x002c:
        goto L_0x0036;
    L_0x002d:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.RecsAvailable;	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0036;
    L_0x0032:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.RetryingUnknownLocation;	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x003a;
    L_0x0036:
        r4.evaluateLoadMore();	 Catch:{ all -> 0x0057 }
        goto L_0x0055;
    L_0x003a:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecs;	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0052;
    L_0x003f:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecsDupesOnly;	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnknownLocation;	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x0049;
    L_0x0048:
        goto L_0x0052;
    L_0x0049:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedExpectedError;	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x004e;
    L_0x004d:
        goto L_0x0052;
    L_0x004e:
        r0 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnexpectedError;	 Catch:{ all -> 0x0057 }
        if (r0 == 0) goto L_0x0055;
    L_0x0052:
        r4.loadMoreRecs();	 Catch:{ all -> 0x0057 }
    L_0x0055:
        monitor-exit(r4);
        return;
    L_0x0057:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.recs.engine.cardstack.CardStackRecsLoader.resume():void");
    }

    public synchronized void pause() {
        C0001a.b("%s - pause()", new Object[]{getRecSource()});
        this.isPaused = true;
        unsubscribeFromRecsUpdates();
        unsubscribeFromConnectivityUpdates();
    }

    public synchronized void reset(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "reason");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(getRecSource());
        stringBuilder.append(" - reset()");
        C0001a.b(stringBuilder.toString(), new Object[0]);
        if (!RxUtils.f47590a.a(this.clearRecsSubscription)) {
            this.clearRecsSubscription = resetRecsData(resetReason).a(CardStackRecsLoader$reset$1.INSTANCE, CardStackRecsLoader$reset$2.INSTANCE);
        }
    }

    public void safeReset(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "reason");
        throw ((Throwable) new NotImplementedError("CardStackRecsLoader does not support safeReset(). Please use reset() instead."));
    }

    @NotNull
    public Observable<RecsLoadingStatus> observeLoadingStatusUpdates() {
        Observable<RecsLoadingStatus> k = this.recsLoadingStatusUpdatesSubject.e().g().k();
        C2668g.a(k, "recsLoadingStatusUpdates…().onBackpressureBuffer()");
        return k;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void evaluateLoadMore() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.isPaused;	 Catch:{ all -> 0x005e }
        if (r0 != 0) goto L_0x005c;
    L_0x0005:
        r0 = r2.isLowOnRecs;	 Catch:{ all -> 0x005e }
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x005c;
    L_0x000a:
        r0 = r2.recsLoadingStatusUpdatesSubject;	 Catch:{ all -> 0x005e }
        r0 = r0.A();	 Catch:{ all -> 0x005e }
        r0 = (com.tinder.domain.recs.model.RecsLoadingStatus) r0;	 Catch:{ all -> 0x005e }
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.Uninitialized;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0020;
    L_0x0017:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.RecsAvailable;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0020;
    L_0x001c:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedNoConnection;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0026;
    L_0x0020:
        r2.loadMoreRecs();	 Catch:{ all -> 0x005e }
        r0 = kotlin.C15813i.f49016a;	 Catch:{ all -> 0x005e }
        goto L_0x0054;
    L_0x0026:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.RetryingUnknownLocation;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0030;
    L_0x002a:
        r2.retryMissingLocation();	 Catch:{ all -> 0x005e }
        r0 = kotlin.C15813i.f49016a;	 Catch:{ all -> 0x005e }
        goto L_0x0054;
    L_0x0030:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.Loading;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0052;
    L_0x0035:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.LoadingMore;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x0052;
    L_0x003a:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecs;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0052;
    L_0x003f:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecsDupesOnly;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnknownLocation;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0049;
    L_0x0048:
        goto L_0x0052;
    L_0x0049:
        r1 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedExpectedError;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x004e;
    L_0x004d:
        goto L_0x0052;
    L_0x004e:
        r0 = r0 instanceof com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedUnexpectedError;	 Catch:{ all -> 0x005e }
        if (r0 == 0) goto L_0x0056;
    L_0x0052:
        r0 = kotlin.C15813i.f49016a;	 Catch:{ all -> 0x005e }
    L_0x0054:
        monitor-exit(r2);
        return;
    L_0x0056:
        r0 = new kotlin.NoWhenBranchMatchedException;	 Catch:{ all -> 0x005e }
        r0.<init>();	 Catch:{ all -> 0x005e }
        throw r0;	 Catch:{ all -> 0x005e }
    L_0x005c:
        monitor-exit(r2);
        return;
    L_0x005e:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.recs.engine.cardstack.CardStackRecsLoader.evaluateLoadMore():void");
    }

    private final synchronized void retryMissingLocation() {
        C0001a.b("%s - retryMissingLocation()", new Object[]{getRecSource()});
        if (this.currentMissingLocationAttempt >= 5) {
            C0001a.e("%s - retryMissingLocation() method early returned, since maximum number of retries was hit", new Object[]{getRecSource()});
            updateAndNotifyLoadingStatus(FetchFailedUnknownLocation.INSTANCE);
            resetMissingLocationRetryCount();
            return;
        }
        Single d = this.recsRepository.loadAndCacheRecsFromNetwork().a((long) 1000, TimeUnit.MILLISECONDS).d(new C13900xc7dbbdb9(this));
        C2668g.a(d, "retryLocationMissingSingle");
        subscribeForRecsLoading(d, RetryingUnknownLocation.INSTANCE);
    }

    private final void loadRecs() {
        C0001a.b("%s - loadRecs()", new Object[]{getRecSource()});
        if (!this.isPaused) {
            subscribeForRecsLoading(this.recsRepository.loadRecs(), Loading.INSTANCE);
        }
    }

    private final void loadMoreRecs() {
        C0001a.b("%s - loadMoreRecs()", new Object[]{getRecSource()});
        if (!this.isPaused) {
            subscribeForRecsLoading(this.recsRepository.loadAndCacheRecsFromNetwork(), LoadingMore.INSTANCE);
        }
    }

    private final synchronized void updateLoadingStatus(C8786k c8786k) {
        if (!(c8786k instanceof C10995c)) {
            if (!(c8786k instanceof C10996d)) {
                if (c8786k instanceof C10994b) {
                    resetMissingLocationRetryCount();
                    updateAndNotifyLoadingStatus((RecsLoadingStatus) NoMoreRecs.INSTANCE);
                    c8786k = C15813i.f49016a;
                } else if (c8786k instanceof C10997e) {
                    resetMissingLocationRetryCount();
                    updateAndNotifyLoadingStatus((RecsLoadingStatus) NoMoreRecsDupesOnly.INSTANCE);
                    c8786k = C15813i.f49016a;
                } else if (c8786k instanceof C10999g) {
                    updateAndNotifyLoadingStatus((RecsLoadingStatus) RetryingUnknownLocation.INSTANCE);
                    evaluateLoadMore();
                    c8786k = C15813i.f49016a;
                } else if (c8786k instanceof C10993a) {
                    resetMissingLocationRetryCount();
                    updateAndNotifyLoadingStatus(new FetchFailedExpectedError(((C10993a) c8786k).mo9895c()));
                    c8786k = C15813i.f49016a;
                } else if (c8786k instanceof C10998f) {
                    resetMissingLocationRetryCount();
                    updateAndNotifyLoadingStatus(new FetchFailedUnexpectedError(((C10998f) c8786k).mo9895c()));
                    c8786k = C15813i.f49016a;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        resetMissingLocationRetryCount();
        updateAndNotifyLoadingStatus((RecsLoadingStatus) RecsAvailable.INSTANCE);
        evaluateLoadMore();
        c8786k = C15813i.f49016a;
    }

    private final synchronized void updateAndNotifyLoadingStatus(RecsLoadingStatus recsLoadingStatus) {
        if (((RecsLoadingStatus) this.recsLoadingStatusUpdatesSubject.A()) != recsLoadingStatus) {
            C0001a.b("%s - Notified new loadingStatus: %s", new Object[]{getRecSource(), recsLoadingStatus});
            this.recsLoadingStatusUpdatesSubject.onNext(recsLoadingStatus);
        }
    }

    private final void handleRecsUpdate(RecsUpdate recsUpdate) {
        Object[] objArr = new Object[2];
        objArr[0] = getRecSource();
        boolean z = true;
        objArr[1] = recsUpdate;
        C0001a.b("%s - handleRecsUpdate(): %s", objArr);
        if (recsUpdate instanceof Insert) {
            for (Rec prefetchAdditionalData : recsUpdate.getModifiedRecs()) {
                this.recsPrefetcher.prefetchAdditionalData(prefetchAdditionalData);
            }
        }
        if (recsUpdate.getCurrentRecs().size() >= this.config.getLowOnRecsThreshold()) {
            z = false;
        }
        this.isLowOnRecs = z;
        evaluateLoadMore();
    }

    private final void subscribeForRecsLoading(Single<C8786k> single, RecsLoadingStatus recsLoadingStatus) {
        if (!RxUtils.f47590a.a(this.loadRecsSubscription)) {
            LoadingRetryPolicy loadingLoadingRetryPolicy = this.config.getLoadingLoadingRetryPolicy();
            this.loadRecsSubscription = single.a(RxUtils.f47590a.a(loadingLoadingRetryPolicy.getRetryCount(), (long) loadingLoadingRetryPolicy.getRetryIntervalMillis()).a()).b(Schedulers.io()).a(new CardStackRecsLoader$subscribeForRecsLoading$1(this, recsLoadingStatus)).a((Action1) new CardStackRecsLoader$subscribeForRecsLoading$2(this), new CardStackRecsLoader$subscribeForRecsLoading$3(this));
        }
    }

    private final void unsubscribeFromRecsLoading() {
        RxUtils.f47590a.b(this.loadRecsSubscription);
    }

    private final void subscribeToRecsUpdates() {
        this.recsUpdatesSubscription = DefaultImpls.observeRecsUpdates$default(this.recsRepository, null, 1, null).b(new CardStackRecsLoader$subscribeToRecsUpdates$1(this)).a(CardStackRecsLoader$subscribeToRecsUpdates$2.INSTANCE, CardStackRecsLoader$subscribeToRecsUpdates$3.INSTANCE);
    }

    private final void subscribeToConnectivityUpdates() {
        this.connectivityChangesSubscription = this.connectivityProvider.b().a(new CardStackRecsLoader$subscribeToConnectivityUpdates$1(this), CardStackRecsLoader$subscribeToConnectivityUpdates$2.INSTANCE);
    }

    private final Completable resetRecsData(ResetReason resetReason) {
        resetReason = this.recsRepository.clearCache().a(this.recsRepository.resetNetworkState(resetReason)).b(Schedulers.io()).d(new CardStackRecsLoader$resetRecsData$1(this));
        C2668g.a(resetReason, "recsRepository.clearCach…etryCount()\n            }");
        return resetReason;
    }

    private final void unsubscribeFromRecsUpdates() {
        RxUtils.f47590a.b(this.recsUpdatesSubscription);
    }

    private final void unsubscribeFromConnectivityUpdates() {
        RxUtils.f47590a.b(this.connectivityChangesSubscription);
    }

    private final synchronized void resetMissingLocationRetryCount() {
        this.currentMissingLocationAttempt = 0;
    }

    private final void handleRecsLoadingError(Throwable th) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(getRecSource());
        stringBuilder.append(" - handleRecsLoadingError()");
        C0001a.b(stringBuilder.toString(), new Object[0]);
        if (th instanceof NoInternetConnectionException) {
            updateAndNotifyLoadingStatus((RecsLoadingStatus) FetchFailedNoConnection.INSTANCE);
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected Error fecthing ");
        stringBuilder.append(getRecSource());
        stringBuilder.append(" recs");
        C0001a.c(th, stringBuilder.toString(), new Object[0]);
        updateAndNotifyLoadingStatus(new FetchFailedUnexpectedError(new UnexpectedError(th)));
    }
}
