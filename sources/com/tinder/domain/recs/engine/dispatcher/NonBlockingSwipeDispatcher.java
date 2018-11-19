package com.tinder.domain.recs.engine.dispatcher;

import android.support.annotation.WorkerThread;
import com.tinder.domain.recs.SwipeDataStore;
import com.tinder.domain.recs.engine.dispatcher.common.DispatchableSwipeProvider;
import com.tinder.domain.recs.engine.dispatcher.common.DispatcherStateProvider;
import com.tinder.domain.recs.engine.dispatcher.common.model.DispatchPolicySet;
import com.tinder.domain.recs.engine.dispatcher.common.model.DispatcherState;
import com.tinder.domain.recs.engine.dispatcher.common.policy.DispatchPolicy;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.SwipeRatingStatus;
import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import com.tinder.util.ConnectivityProvider;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0013H\u0017J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0002J$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0003J\b\u0010\"\u001a\u00020\u0013H\u0003J\u0016\u0010#\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0003J\b\u0010$\u001a\u00020\u0013H\u0003J\b\u0010%\u001a\u00020\u0013H\u0017J\b\u0010&\u001a\u00020\u0013H\u0003J\b\u0010'\u001a\u00020\u0013H\u0002J\b\u0010(\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/NonBlockingSwipeDispatcher;", "Lcom/tinder/domain/recs/engine/dispatcher/SwipeDispatcher;", "swipeDataStore", "Lcom/tinder/domain/recs/SwipeDataStore;", "stateProvider", "Lcom/tinder/domain/recs/engine/dispatcher/common/DispatcherStateProvider;", "dispatchableSwipeProvider", "Lcom/tinder/domain/recs/engine/dispatcher/common/DispatchableSwipeProvider;", "ratingProcessor", "Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;", "connectivityProvider", "Lcom/tinder/util/ConnectivityProvider;", "(Lcom/tinder/domain/recs/SwipeDataStore;Lcom/tinder/domain/recs/engine/dispatcher/common/DispatcherStateProvider;Lcom/tinder/domain/recs/engine/dispatcher/common/DispatchableSwipeProvider;Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;Lcom/tinder/util/ConnectivityProvider;)V", "connectivitySubscriptions", "Lrx/subscriptions/CompositeSubscription;", "dispatchPolicySet", "Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatchPolicySet;", "dispatcherSubscriptions", "cancel", "", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "clear", "dispatch", "findDispatchableSwipes", "", "state", "Lcom/tinder/domain/recs/engine/dispatcher/common/model/DispatcherState;", "findExpiredSwipes", "swipes", "findPendingSwipes", "handleEndedSwipeRatingStatus", "endedSwipeRatingStatus", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "handleNewState", "handleNewSwipes", "pause", "restart", "resume", "subscribeToConnectivity", "unsubscribeToConnectivity", "Companion", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class NonBlockingSwipeDispatcher implements SwipeDispatcher {
    public static final Companion Companion = new Companion();
    private static final boolean DEBUG = false;
    private static final long SEVEN_DAYS_AGO_TIMESTAMP;
    private static final int THROTTLE_INTERVAL_MILLIS = 100;
    private static final int TIMER_INTERVAL_SECONDS = 5;
    private final ConnectivityProvider connectivityProvider;
    private final C19573b connectivitySubscriptions = new C19573b();
    private final DispatchPolicySet dispatchPolicySet = DispatchPolicySet.Companion.defaultPolicies();
    private final DispatchableSwipeProvider dispatchableSwipeProvider;
    private final C19573b dispatcherSubscriptions = new C19573b();
    private final RatingProcessor ratingProcessor;
    private final DispatcherStateProvider stateProvider;
    private final SwipeDataStore swipeDataStore;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/NonBlockingSwipeDispatcher$Companion;", "", "()V", "DEBUG", "", "getDEBUG", "()Z", "SEVEN_DAYS_AGO_TIMESTAMP", "", "getSEVEN_DAYS_AGO_TIMESTAMP", "()J", "THROTTLE_INTERVAL_MILLIS", "", "getTHROTTLE_INTERVAL_MILLIS", "()I", "TIMER_INTERVAL_SECONDS", "getTIMER_INTERVAL_SECONDS", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class Companion {
        private Companion() {
        }

        private final int getTIMER_INTERVAL_SECONDS() {
            return NonBlockingSwipeDispatcher.TIMER_INTERVAL_SECONDS;
        }

        private final int getTHROTTLE_INTERVAL_MILLIS() {
            return NonBlockingSwipeDispatcher.THROTTLE_INTERVAL_MILLIS;
        }

        private final long getSEVEN_DAYS_AGO_TIMESTAMP() {
            return NonBlockingSwipeDispatcher.SEVEN_DAYS_AGO_TIMESTAMP;
        }

        private final boolean getDEBUG() {
            return NonBlockingSwipeDispatcher.DEBUG;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.domain.recs.engine.dispatcher.NonBlockingSwipeDispatcher$2 */
    static final class C139022<T> implements Action1<Throwable> {
        public static final C139022 INSTANCE = new C139022();

        C139022() {
        }

        public final void call(Throwable th) {
            C0001a.c(th, "Cannot observe swipes: ", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.domain.recs.engine.dispatcher.NonBlockingSwipeDispatcher$4 */
    static final class C139044<T> implements Action1<Throwable> {
        public static final C139044 INSTANCE = new C139044();

        C139044() {
        }

        public final void call(Throwable th) {
            C0001a.c(th, "Cannot observe state: ", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.domain.recs.engine.dispatcher.NonBlockingSwipeDispatcher$6 */
    static final class C139066<T> implements Action1<Throwable> {
        public static final C139066 INSTANCE = new C139066();

        C139066() {
        }

        public final void call(Throwable th) {
            C0001a.c(th, "Cannot observe swipe rating result: ", new Object[0]);
        }
    }

    public NonBlockingSwipeDispatcher(@NotNull SwipeDataStore swipeDataStore, @NotNull DispatcherStateProvider dispatcherStateProvider, @NotNull DispatchableSwipeProvider dispatchableSwipeProvider, @NotNull RatingProcessor ratingProcessor, @NotNull ConnectivityProvider connectivityProvider) {
        C2668g.b(swipeDataStore, "swipeDataStore");
        C2668g.b(dispatcherStateProvider, "stateProvider");
        C2668g.b(dispatchableSwipeProvider, "dispatchableSwipeProvider");
        C2668g.b(ratingProcessor, "ratingProcessor");
        C2668g.b(connectivityProvider, "connectivityProvider");
        this.swipeDataStore = swipeDataStore;
        this.stateProvider = dispatcherStateProvider;
        this.dispatchableSwipeProvider = dispatchableSwipeProvider;
        this.ratingProcessor = ratingProcessor;
        this.connectivityProvider = connectivityProvider;
        if (Companion.getDEBUG() != null) {
            this.swipeDataStore.observeSwipes().a((Action1) new Action1<Set<? extends Swipe>>() {
                public final void call(Set<Swipe> set) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("");
                    stringBuilder.append(this);
                    stringBuilder.append(" swipeRepository: ");
                    stringBuilder.append(set);
                    C0001a.b(stringBuilder.toString(), new Object[0]);
                }
            }, (Action1) C139022.INSTANCE);
            this.stateProvider.observeState().a((Action1) new Action1<DispatcherState>() {
                public final void call(DispatcherState dispatcherState) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("");
                    stringBuilder.append(this);
                    stringBuilder.append(" state: ");
                    stringBuilder.append(dispatcherState);
                    C0001a.b(stringBuilder.toString(), new Object[0]);
                }
            }, (Action1) C139044.INSTANCE);
            this.ratingProcessor.observeSwipeRatingStatus().a((Action1) new Action1<SwipeRatingStatus>() {
                public final void call(SwipeRatingStatus swipeRatingStatus) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("");
                    stringBuilder.append(this);
                    stringBuilder.append(" swipeRatingStatus: ");
                    stringBuilder.append(swipeRatingStatus);
                    C0001a.b(stringBuilder.toString(), new Object[0]);
                }
            }, (Action1) C139066.INSTANCE);
        }
        subscribeToConnectivity();
    }

    @WorkerThread
    public synchronized void dispatch(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        resume();
        this.swipeDataStore.addSwipe(swipe);
    }

    @WorkerThread
    public synchronized void cancel(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
    }

    @WorkerThread
    public synchronized void restart() {
        clear();
        resume();
    }

    @WorkerThread
    public void clear() {
        pause();
        this.swipeDataStore.removeAllSwipes();
    }

    private final synchronized void resume() {
        if (!this.dispatcherSubscriptions.b()) {
            this.stateProvider.setState(new DispatcherState());
            Subscription a = this.swipeDataStore.observeSwipes().a(Schedulers.io()).a(new NonBlockingSwipeDispatcher$resume$addSwipesSubscription$1(this), NonBlockingSwipeDispatcher$resume$addSwipesSubscription$2.INSTANCE);
            Subscription a2 = this.stateProvider.observeState().a(Object.class).h(Observable.a((long) Companion.getTIMER_INTERVAL_SECONDS(), (long) Companion.getTIMER_INTERVAL_SECONDS(), TimeUnit.SECONDS)).g((long) Companion.getTHROTTLE_INTERVAL_MILLIS(), TimeUnit.MILLISECONDS).a(Schedulers.io()).a(new NonBlockingSwipeDispatcher$resume$newStateSubscription$1(this), NonBlockingSwipeDispatcher$resume$newStateSubscription$2.INSTANCE);
            Subscription a3 = this.dispatchableSwipeProvider.observeDispatchableSwipe().a(Schedulers.io()).j(new C13161x85eb282c(this)).a(new C13907x85eb282d(this), C13908x85eb282e.INSTANCE);
            this.dispatcherSubscriptions.a(new Subscription[]{a, a2, a3});
        }
    }

    private final synchronized void pause() {
        this.dispatcherSubscriptions.a();
    }

    private final void subscribeToConnectivity() {
        if (!this.connectivitySubscriptions.b()) {
            Subscription a = this.connectivityProvider.b().e(Boolean.valueOf(true)).g().a(new C13909x5d5cab8e(this), C13910x5d5cab8f.INSTANCE);
            this.connectivitySubscriptions.a(new Subscription[]{a});
        }
    }

    private final void unsubscribeToConnectivity() {
        this.connectivitySubscriptions.a();
    }

    private final synchronized void handleNewSwipes(Set<Swipe> set) {
        Set findExpiredSwipes = findExpiredSwipes(set);
        this.swipeDataStore.removeSwipes(findExpiredSwipes);
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(findExpiredSwipes);
        set = this.stateProvider.getState();
        this.stateProvider.setState(set.addingToPending(findPendingSwipes(hashSet, set)));
    }

    private final synchronized void handleNewState() {
        DispatcherState state = this.stateProvider.getState();
        Set findDispatchableSwipes = findDispatchableSwipes(state);
        this.stateProvider.setState(state.movingToRunning(findDispatchableSwipes));
        this.dispatchableSwipeProvider.updateDispatchableSwipes(findDispatchableSwipes);
    }

    private final synchronized void handleEndedSwipeRatingStatus(Ended ended) {
        Swipe swipe = ended.getSwipe();
        DispatcherState state = this.stateProvider.getState();
        switch (ended.getRatingResult()) {
            case SUCCESSFUL:
            case BOUNCER:
                ended = state.movingToSuccessful(ak.a(swipe));
                this.swipeDataStore.removeSwipe(swipe);
                break;
            case ERROR:
                ended = state.movingToFailed(ak.a(swipe));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.stateProvider.setState(ended);
    }

    private final Set<Swipe> findExpiredSwipes(Set<Swipe> set) {
        HashSet hashSet = new HashSet();
        for (Swipe swipe : set) {
            if (swipe.getTimestamp() < Companion.getSEVEN_DAYS_AGO_TIMESTAMP()) {
                hashSet.add(swipe);
            }
        }
        return hashSet;
    }

    private final Set<Swipe> findPendingSwipes(Set<Swipe> set, DispatcherState dispatcherState) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(set);
        hashSet.removeAll(dispatcherState.allSwipes());
        return hashSet;
    }

    private final Set<Swipe> findDispatchableSwipes(DispatcherState dispatcherState) {
        Collection a = ak.a();
        for (DispatchPolicy findDispatchableSwipes : this.dispatchPolicySet.dispatchPolicies()) {
            a = findDispatchableSwipes.findDispatchableSwipes(a, dispatcherState);
        }
        return (Set) new HashSet(a);
    }

    static {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date());
        gregorianCalendar.add(5, -7);
        Date time = gregorianCalendar.getTime();
        C2668g.a(time, "sevenDaysAgo");
        SEVEN_DAYS_AGO_TIMESTAMP = time.getTime();
    }
}
