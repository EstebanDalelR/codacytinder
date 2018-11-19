package com.tinder.fireboarding.domain;

import com.tinder.purchase.usecase.C16248i;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001fBK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u0019R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/fireboarding/domain/FireboardingGame;", "", "observeFireboardingConfig", "Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;", "swipeCountRepository", "Lcom/tinder/recs/domain/repository/SwipeCountRepository;", "isNewAccount", "Lcom/tinder/fireboarding/domain/IsNewAccount;", "levelSwipeCountAdapter", "Lcom/tinder/fireboarding/domain/LevelSwipeCountAdapter;", "listeners", "", "Lcom/tinder/fireboarding/domain/FireboardingGame$GameListener;", "areAllLevelsComplete", "Lcom/tinder/fireboarding/domain/AreAllLevelsComplete;", "purchaseMade", "Lcom/tinder/purchase/usecase/PurchaseMade;", "observeCompletedFireboardingLevels", "Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;", "(Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;Lcom/tinder/recs/domain/repository/SwipeCountRepository;Lcom/tinder/fireboarding/domain/IsNewAccount;Lcom/tinder/fireboarding/domain/LevelSwipeCountAdapter;Ljava/util/Set;Lcom/tinder/fireboarding/domain/AreAllLevelsComplete;Lcom/tinder/purchase/usecase/PurchaseMade;Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isGameRunning", "", "completeGame", "", "completeLevel", "level", "Lcom/tinder/fireboarding/domain/Level;", "startGame", "stopGame", "GameListener", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
public final class FireboardingGame {
    /* renamed from: a */
    private C17356a f31953a = new C17356a();
    /* renamed from: b */
    private boolean f31954b;
    /* renamed from: c */
    private final C11811o f31955c;
    /* renamed from: d */
    private final SwipeCountRepository f31956d;
    /* renamed from: e */
    private final C11806k f31957e;
    /* renamed from: f */
    private final C9567m f31958f;
    /* renamed from: g */
    private final Set<GameListener> f31959g;
    /* renamed from: h */
    private final C11800b f31960h;
    /* renamed from: i */
    private final C16248i f31961i;
    /* renamed from: j */
    private final C11809n f31962j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/tinder/fireboarding/domain/FireboardingGame$GameListener;", "", "onGameCompleted", "", "onLevelCompleted", "level", "Lcom/tinder/fireboarding/domain/Level;", "onNextLevelAvailable", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    public interface GameListener {
        void onGameCompleted();

        void onLevelCompleted(@NotNull Level level);

        void onNextLevelAvailable(@NotNull Level level);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$a */
    static final class C11785a<T> implements Predicate<C9566h> {
        /* renamed from: a */
        public static final C11785a f38504a = new C11785a();

        C11785a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47702a((C9566h) obj);
        }

        /* renamed from: a */
        public final boolean m47702a(@NotNull C9566h c9566h) {
            C2668g.b(c9566h, "it");
            return c9566h.m39871a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "level", "Lcom/tinder/fireboarding/domain/Level;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$b */
    static final class C11786b<T> implements Consumer<Level> {
        /* renamed from: a */
        final /* synthetic */ FireboardingGame f38505a;

        C11786b(FireboardingGame fireboardingGame) {
            this.f38505a = fireboardingGame;
        }

        public /* synthetic */ void accept(Object obj) {
            m47703a((Level) obj);
        }

        /* renamed from: a */
        public final void m47703a(Level level) {
            for (GameListener gameListener : this.f38505a.f31959g) {
                C2668g.a(level, "level");
                gameListener.onNextLevelAvailable(level);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$c */
    static final class C11787c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ FireboardingGame f38506a;

        C11787c(FireboardingGame fireboardingGame) {
            this.f38506a = fireboardingGame;
        }

        public /* synthetic */ void accept(Object obj) {
            m47704a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47704a(Throwable th) {
            this.f38506a.m39867b();
            C0001a.c(th, "Fireboarding: error starting game", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$d */
    static final class C11788d<T> implements Predicate<C9566h> {
        /* renamed from: a */
        public static final C11788d f38507a = new C11788d();

        C11788d() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47705a((C9566h) obj);
        }

        /* renamed from: a */
        public final boolean m47705a(@NotNull C9566h c9566h) {
            C2668g.b(c9566h, "it");
            return c9566h.m39871a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$e */
    static final class C11789e<T, R> implements Function<C9566h, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ FireboardingGame f38508a;

        C11789e(FireboardingGame fireboardingGame) {
            this.f38508a = fireboardingGame;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47706a((C9566h) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m47706a(@NotNull C9566h c9566h) {
            C2668g.b(c9566h, "it");
            return this.f38508a.f31961i.execute();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$f */
    static final class C11790f implements Action {
        /* renamed from: a */
        final /* synthetic */ FireboardingGame f38509a;

        C11790f(FireboardingGame fireboardingGame) {
            this.f38509a = fireboardingGame;
        }

        public final void run() {
            this.f38509a.m39867b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$g */
    static final class C11791g<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11791g f38510a = new C11791g();

        C11791g() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47707a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47707a(Throwable th) {
            C0001a.c(th, "Fireboarding: error observing purchase made.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "it", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$h */
    static final class C11792h<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ FireboardingGame f38511a;

        C11792h(FireboardingGame fireboardingGame) {
            this.f38511a = fireboardingGame;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47708a((C9566h) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<Boolean> m47708a(@NotNull C9566h c9566h) {
            C2668g.b(c9566h, "it");
            return this.f38511a.f31960h.execute();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$i */
    static final class C11793i<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C11793i f38512a = new C11793i();

        C11793i() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47709a((Boolean) obj);
        }

        /* renamed from: a */
        public final boolean m47709a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return bool.booleanValue() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "it", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Single;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$j */
    static final class C11794j<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ FireboardingGame f38513a;

        C11794j(FireboardingGame fireboardingGame) {
            this.f38513a = fireboardingGame;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47710a((Boolean) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<Boolean> m47710a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return this.f38513a.f31957e.execute();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "it", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Observable;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$k */
    static final class C11795k<T, R> implements Function<T, ObservableSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ FireboardingGame f38514a;

        C11795k(FireboardingGame fireboardingGame) {
            this.f38514a = fireboardingGame;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47711a((Boolean) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3959e<Integer> m47711a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            if (bool.booleanValue() != null) {
                return this.f38514a.f31956d.observeSwipeCount();
            }
            this.f38514a.m39867b();
            bool = C3959e.empty();
            C2668g.a(bool, "Observable.empty()");
            return bool;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/fireboarding/domain/Level;", "it", "", "apply", "(Ljava/lang/Integer;)Lcom/tinder/fireboarding/domain/Level;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$l */
    static final class C11796l<T, R> implements Function<T, R> {
        /* renamed from: a */
        final /* synthetic */ FireboardingGame f38515a;

        C11796l(FireboardingGame fireboardingGame) {
            this.f38515a = fireboardingGame;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47712a((Integer) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Level m47712a(@NotNull Integer num) {
            C2668g.b(num, "it");
            return this.f38515a.f31958f.m39872a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/tinder/fireboarding/domain/Level;", "", "newLevel", "completedLevels", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$m */
    static final class C11797m<T1, T2, R> implements BiFunction<Level, Set<? extends Level>, Pair<? extends Level, ? extends Set<? extends Level>>> {
        /* renamed from: a */
        public static final C11797m f38516a = new C11797m();

        C11797m() {
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m47713a((Level) obj, (Set) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final Pair<Level, Set<Level>> m47713a(@NotNull Level level, @NotNull Set<? extends Level> set) {
            C2668g.b(level, "newLevel");
            C2668g.b(set, "completedLevels");
            return new Pair(level, set);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/tinder/fireboarding/domain/Level;", "", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$n */
    static final class C11798n<T> implements Predicate<Pair<? extends Level, ? extends Set<? extends Level>>> {
        /* renamed from: a */
        public static final C11798n f38517a = new C11798n();

        C11798n() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47714a((Pair) obj);
        }

        /* renamed from: a */
        public final boolean m47714a(@NotNull Pair<? extends Level, ? extends Set<? extends Level>> pair) {
            C2668g.b(pair, "it");
            return ((Set) pair.b()).contains((Level) pair.a()) ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/fireboarding/domain/Level;", "it", "Lkotlin/Pair;", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.domain.FireboardingGame$o */
    static final class C11799o<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C11799o f38518a = new C11799o();

        C11799o() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47715a((Pair) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Level m47715a(@NotNull Pair<? extends Level, ? extends Set<? extends Level>> pair) {
            C2668g.b(pair, "it");
            return (Level) pair.a();
        }
    }

    public FireboardingGame(@NotNull C11811o c11811o, @NotNull SwipeCountRepository swipeCountRepository, @NotNull C11806k c11806k, @NotNull C9567m c9567m, @NotNull Set<? extends GameListener> set, @NotNull C11800b c11800b, @NotNull C16248i c16248i, @NotNull C11809n c11809n) {
        C2668g.b(c11811o, "observeFireboardingConfig");
        C2668g.b(swipeCountRepository, "swipeCountRepository");
        C2668g.b(c11806k, "isNewAccount");
        C2668g.b(c9567m, "levelSwipeCountAdapter");
        C2668g.b(set, "listeners");
        C2668g.b(c11800b, "areAllLevelsComplete");
        C2668g.b(c16248i, "purchaseMade");
        C2668g.b(c11809n, "observeCompletedFireboardingLevels");
        this.f31955c = c11811o;
        this.f31956d = swipeCountRepository;
        this.f31957e = c11806k;
        this.f31958f = c9567m;
        this.f31959g = set;
        this.f31960h = c11800b;
        this.f31961i = c16248i;
        this.f31962j = c11809n;
    }

    /* renamed from: a */
    public final void m39865a() {
        if (this.f31953a.b() <= 0) {
            if (!this.f31954b) {
                this.f31954b = true;
                this.f31953a.add(this.f31955c.execute().a(C11785a.f38504a).f().a(new C11792h(this)).a(C11793i.f38512a).d(new C11794j(this)).c(new C11795k(this)).map(new C11796l(this)).withLatestFrom(this.f31962j.execute(), C11797m.f38516a).filter(C11798n.f38517a).map(C11799o.f38518a).distinctUntilChanged().subscribe(new C11786b(this), new C11787c(this)));
                this.f31953a.add(this.f31955c.execute().a(C11788d.f38507a).f().d(new C11789e(this)).a(new C11790f(this), C11791g.f38510a));
            }
        }
    }

    /* renamed from: a */
    public final void m39866a(@NotNull Level level) {
        C2668g.b(level, "level");
        if (this.f31954b) {
            for (GameListener onLevelCompleted : this.f31959g) {
                onLevelCompleted.onLevelCompleted(level);
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trying to complete level when game is not running. level = ");
        stringBuilder.append(level);
        C0001a.b(new IllegalStateException(stringBuilder.toString()));
    }

    /* renamed from: b */
    public final void m39867b() {
        if (this.f31954b) {
            m39868c();
            for (GameListener onGameCompleted : this.f31959g) {
                onGameCompleted.onGameCompleted();
            }
        }
    }

    /* renamed from: c */
    public final void m39868c() {
        this.f31953a.a();
        this.f31954b = false;
    }
}
