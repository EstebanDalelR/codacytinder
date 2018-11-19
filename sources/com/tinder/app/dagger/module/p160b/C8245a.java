package com.tinder.app.dagger.module.p160b;

import android.arch.lifecycle.LifecycleObserver;
import android.content.SharedPreferences;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.auth.repository.AuthLedgerRepository;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.fireboarding.FireboardingLifecycleObserver;
import com.tinder.fireboarding.domain.AddProgressiveOnboardingUnlockEvent;
import com.tinder.fireboarding.domain.C11800b;
import com.tinder.fireboarding.domain.C11802c;
import com.tinder.fireboarding.domain.C11804j;
import com.tinder.fireboarding.domain.C11806k;
import com.tinder.fireboarding.domain.C11808l;
import com.tinder.fireboarding.domain.C11809n;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.fireboarding.domain.C11813p;
import com.tinder.fireboarding.domain.C11816q;
import com.tinder.fireboarding.domain.C11817r;
import com.tinder.fireboarding.domain.C11820s;
import com.tinder.fireboarding.domain.C11823t;
import com.tinder.fireboarding.domain.C11824u;
import com.tinder.fireboarding.domain.C9562d;
import com.tinder.fireboarding.domain.C9567m;
import com.tinder.fireboarding.domain.CompletedLevelRepository;
import com.tinder.fireboarding.domain.FireboardingEnabledRepository;
import com.tinder.fireboarding.domain.FireboardingGame;
import com.tinder.fireboarding.domain.FireboardingGame.GameListener;
import com.tinder.fireboarding.domain.Level;
import com.tinder.fireboarding.p253a.C11772a;
import com.tinder.fireboarding.p253a.C11778b;
import com.tinder.fireboarding.p253a.C11781c;
import com.tinder.fireboarding.p253a.C11782d;
import com.tinder.fireboarding.p253a.C11783e;
import com.tinder.main.qualifier.MainActivityQualifier;
import com.tinder.module.Default;
import com.tinder.purchase.usecase.C16248i;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import com.tinder.recs.domain.usecase.IncrementRewindsAvailable;
import com.tinder.recs.domain.usecase.RecsFirstInserted;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J \u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0012\u0010\u0017\u001a\u00020\n2\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0007J,\u0010\u001a\u001a\u00020\u001b2\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f` H\u0007J\u0012\u0010!\u001a\u00020\"2\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0007JX\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0011\u0010,\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b.0-2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4J$\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f` H\u0007J\u0010\u00106\u001a\u0002072\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0007J\u0010\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u000209H\u0007J\u0010\u0010@\u001a\u00020A2\u0006\u00102\u001a\u000203H\u0007J1\u0010B\u001a\u00020+2\"\u0010C\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f` H\u0001¢\u0006\u0002\bDJ\u0010\u0010E\u001a\u0002032\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010F\u001a\u00020%2\u0006\u0010G\u001a\u00020\"H\u0007J\u0010\u0010H\u001a\u00020I2\u0006\u00102\u001a\u000203H\u0007J \u0010J\u001a\u00020K2\u0006\u00102\u001a\u0002032\u0006\u0010L\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010M\u001a\u00020=2\u0006\u0010:\u001a\u00020;H\u0007J\u0010\u0010N\u001a\u00020O2\u0006\u0010:\u001a\u00020;H\u0007J\u0010\u0010P\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0007J \u0010Q\u001a\u00020R2\u0006\u00102\u001a\u0002032\u0006\u0010<\u001a\u00020=2\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010S\u001a\u00020T2\u0006\u0010G\u001a\u00020\"H\u0007J\u0010\u0010U\u001a\u00020)2\u0006\u0010V\u001a\u00020WH\u0007¨\u0006X"}, d2 = {"Lcom/tinder/app/dagger/module/fireboarding/FireboardingModule;", "", "()V", "provideAddProgressiveOnboardingUnlockEvent", "Lcom/tinder/fireboarding/domain/AddProgressiveOnboardingUnlockEvent;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "provideAreAllLevelsComplete", "Lcom/tinder/fireboarding/domain/AreAllLevelsComplete;", "completedLevelRepository", "Lcom/tinder/fireboarding/domain/CompletedLevelRepository;", "provideCompleteFireboardingLevel", "Lcom/tinder/fireboarding/domain/CompleteFireboardingLevel;", "fireboardingGame", "Lcom/tinder/fireboarding/domain/FireboardingGame;", "provideCompleteGameFireboardingListener", "Lcom/tinder/fireboarding/domain/FireboardingGame$GameListener;", "removeInjectedFireboardingRec", "Lcom/tinder/fireboarding/domain/RemoveInjectedFireboardingRec;", "provideCompleteLevelFireboardingListener", "incrementRewindsAvailable", "Lcom/tinder/recs/domain/usecase/IncrementRewindsAvailable;", "addProgressiveOnboardingUnlockEvent", "provideCompletedLevelRepository", "sharedPreference", "Landroid/content/SharedPreferences;", "provideCompletedLevelsProgressiveOnboardingAdapter", "Lcom/tinder/fireboarding/domain/CompletedLevelsProgressiveOnboardingAdapter;", "fireboardingLevelMap", "Ljava/util/LinkedHashMap;", "Lcom/tinder/fireboarding/domain/Level;", "", "Lkotlin/collections/LinkedHashMap;", "provideFireboardingEnabledRepository", "Lcom/tinder/fireboarding/domain/FireboardingEnabledRepository;", "provideFireboardingGame", "observeFireboardingConfig", "Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;", "swipeCountRepository", "Lcom/tinder/recs/domain/repository/SwipeCountRepository;", "isNewAccount", "Lcom/tinder/fireboarding/domain/IsNewAccount;", "levelSwipeCountAdapter", "Lcom/tinder/fireboarding/domain/LevelSwipeCountAdapter;", "gameListeners", "", "Lkotlin/jvm/JvmSuppressWildcards;", "areAllLevelsComplete", "purchaseMade", "Lcom/tinder/purchase/usecase/PurchaseMade;", "observeCompletedFireboardingLevels", "Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;", "provideFireboardingGame$Tinder_release", "provideFireboardingLevels", "provideFireboardingLifecycleObserver", "Landroid/arch/lifecycle/LifecycleObserver;", "provideInjectFireboardingRec", "Lcom/tinder/fireboarding/domain/InjectFireboardingRec;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "recsFirstInserted", "Lcom/tinder/recs/domain/usecase/RecsFirstInserted;", "provideInjectionFireboardingGameListener", "injectFireboardingRec", "provideIsSuperLikeEnabled", "Lcom/tinder/fireboarding/domain/IsSuperlikeEnabled;", "provideLevelSwipeCountAdapter", "levelsMap", "provideLevelSwipeCountAdapter$Tinder_release", "provideObserveCompletedFireboardingLevels", "provideObserveFireboardingConfig", "fireboardingEnabledRepository", "provideObserveIsSuperLikeEnabled", "Lcom/tinder/fireboarding/domain/ObserveIsSuperLikeEnabled;", "provideObserveProgressiveOnboarding", "Lcom/tinder/fireboarding/domain/ObserveProgressiveOnboarding;", "completedLevelsProgressiveOnboardingAdapter", "provideRecsFirstInserted", "provideRemoveFireboardingRec", "Lcom/tinder/fireboarding/domain/RemoveFireboardingRec;", "provideRemoveInjectedFireboardingRec", "provideShouldShowNudgeAnimation", "Lcom/tinder/fireboarding/domain/ShouldShowNudgeAnimation;", "provideUpdateFireboardingConfig", "Lcom/tinder/fireboarding/domain/UpdateFireboardingConfig;", "providesIsNewAccount", "authLedgerRepository", "Lcom/tinder/auth/repository/AuthLedgerRepository;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.app.dagger.module.b.a */
public final class C8245a {
    @IntoSet
    @MainActivityQualifier
    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final LifecycleObserver m35158a(@NotNull FireboardingGame fireboardingGame) {
        C2668g.b(fireboardingGame, "fireboardingGame");
        return new FireboardingLifecycleObserver(fireboardingGame);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final FireboardingEnabledRepository m35160a(@Default @NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreference");
        return new C11782d(sharedPreferences);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final C11824u m35173a(@NotNull FireboardingEnabledRepository fireboardingEnabledRepository) {
        C2668g.b(fireboardingEnabledRepository, "fireboardingEnabledRepository");
        return new C11824u(fireboardingEnabledRepository);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: b */
    public final C11811o m35179b(@NotNull FireboardingEnabledRepository fireboardingEnabledRepository) {
        C2668g.b(fireboardingEnabledRepository, "fireboardingEnabledRepository");
        return new C11811o(fireboardingEnabledRepository);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final LinkedHashMap<Level, Integer> m35174a() {
        LinkedHashMap<Level, Integer> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Level.LIKE_AND_PASS, Integer.valueOf(15));
        linkedHashMap.put(Level.REWIND, Integer.valueOf(30));
        linkedHashMap.put(Level.SUPERLIKE, Integer.valueOf(45));
        linkedHashMap.put(Level.BOOST, Integer.valueOf(60));
        return linkedHashMap;
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final C9567m m35169a(@NotNull LinkedHashMap<Level, Integer> linkedHashMap) {
        C2668g.b(linkedHashMap, "levelsMap");
        return new C9567m(2, linkedHashMap);
    }

    @IntoSet
    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final GameListener m35163a(@NotNull C11804j c11804j) {
        C2668g.b(c11804j, "injectFireboardingRec");
        return new C11783e(c11804j);
    }

    @IntoSet
    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final GameListener m35162a(@NotNull CompletedLevelRepository completedLevelRepository, @NotNull IncrementRewindsAvailable incrementRewindsAvailable, @NotNull AddProgressiveOnboardingUnlockEvent addProgressiveOnboardingUnlockEvent) {
        C2668g.b(completedLevelRepository, "completedLevelRepository");
        C2668g.b(incrementRewindsAvailable, "incrementRewindsAvailable");
        C2668g.b(addProgressiveOnboardingUnlockEvent, "addProgressiveOnboardingUnlockEvent");
        return new C11778b(completedLevelRepository, incrementRewindsAvailable, addProgressiveOnboardingUnlockEvent);
    }

    @IntoSet
    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final GameListener m35161a(@NotNull CompletedLevelRepository completedLevelRepository, @NotNull C11820s c11820s) {
        C2668g.b(completedLevelRepository, "completedLevelRepository");
        C2668g.b(c11820s, "removeInjectedFireboardingRec");
        return new C11772a(completedLevelRepository, c11820s);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final C11804j m35166a(@NotNull RecsEngineRegistry recsEngineRegistry, @NotNull RecsFirstInserted recsFirstInserted) {
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        C2668g.b(recsFirstInserted, "recsFirstInserted");
        recsEngineRegistry = recsEngineRegistry.getEngine(Core.INSTANCE);
        if (recsEngineRegistry == null) {
            C2668g.a();
        }
        return new C11804j(recsEngineRegistry, recsFirstInserted, 2);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: b */
    public final CompletedLevelRepository m35175b(@Default @NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreference");
        return new C11781c(sharedPreferences);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final C11800b m35165a(@NotNull CompletedLevelRepository completedLevelRepository) {
        C2668g.b(completedLevelRepository, "completedLevelRepository");
        return new C11800b(completedLevelRepository);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: b */
    public final C11809n m35178b(@NotNull CompletedLevelRepository completedLevelRepository) {
        C2668g.b(completedLevelRepository, "completedLevelRepository");
        return new C11809n(completedLevelRepository);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final FireboardingGame m35164a(@NotNull C11811o c11811o, @NotNull SwipeCountRepository swipeCountRepository, @NotNull C11806k c11806k, @NotNull C9567m c9567m, @NotNull Set<GameListener> set, @NotNull C11800b c11800b, @NotNull C16248i c16248i, @NotNull C11809n c11809n) {
        C11811o c11811o2 = c11811o;
        C2668g.b(c11811o2, "observeFireboardingConfig");
        SwipeCountRepository swipeCountRepository2 = swipeCountRepository;
        C2668g.b(swipeCountRepository2, "swipeCountRepository");
        C11806k c11806k2 = c11806k;
        C2668g.b(c11806k2, "isNewAccount");
        C9567m c9567m2 = c9567m;
        C2668g.b(c9567m2, "levelSwipeCountAdapter");
        Set<GameListener> set2 = set;
        C2668g.b(set2, "gameListeners");
        C11800b c11800b2 = c11800b;
        C2668g.b(c11800b2, "areAllLevelsComplete");
        C16248i c16248i2 = c16248i;
        C2668g.b(c16248i2, "purchaseMade");
        C11809n c11809n2 = c11809n;
        C2668g.b(c11809n2, "observeCompletedFireboardingLevels");
        return new FireboardingGame(c11811o2, swipeCountRepository2, c11806k2, c9567m2, set2, c11800b2, c16248i2, c11809n2);
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final C11802c m35176b(@NotNull FireboardingGame fireboardingGame) {
        C2668g.b(fireboardingGame, "fireboardingGame");
        return new C11802c(fireboardingGame);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C11817r m35171a(@NotNull RecsEngineRegistry recsEngineRegistry) {
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        recsEngineRegistry = recsEngineRegistry.getEngine(Core.INSTANCE);
        if (recsEngineRegistry == null) {
            C2668g.a();
        }
        return new C11817r(recsEngineRegistry);
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final RecsFirstInserted m35181b(@NotNull RecsEngineRegistry recsEngineRegistry) {
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        recsEngineRegistry = recsEngineRegistry.getEngine(Core.INSTANCE);
        if (recsEngineRegistry == null) {
            C2668g.a();
        }
        return new RecsFirstInserted(recsEngineRegistry);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C11823t m35172a(@NotNull C11809n c11809n, @NotNull RecsFirstInserted recsFirstInserted, @NotNull C11811o c11811o) {
        C2668g.b(c11809n, "observeCompletedFireboardingLevels");
        C2668g.b(recsFirstInserted, "recsFirstInserted");
        C2668g.b(c11811o, "observeFireboardingConfig");
        return new C11823t(c11809n, recsFirstInserted, c11811o);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C11808l m35168a(@NotNull C11809n c11809n) {
        C2668g.b(c11809n, "observeCompletedFireboardingLevels");
        return new C11808l(c11809n);
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final C11813p m35180b(@NotNull C11809n c11809n) {
        C2668g.b(c11809n, "observeCompletedFireboardingLevels");
        return new C11813p(c11809n);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C11806k m35167a(@NotNull AuthLedgerRepository authLedgerRepository) {
        C2668g.b(authLedgerRepository, "authLedgerRepository");
        return new C11806k(authLedgerRepository);
    }

    @NotNull
    @Provides
    /* renamed from: c */
    public final C11820s m35182c(@NotNull RecsEngineRegistry recsEngineRegistry) {
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        recsEngineRegistry = recsEngineRegistry.getEngine(Core.INSTANCE);
        if (recsEngineRegistry == null) {
            C2668g.a();
        }
        return new C11820s(recsEngineRegistry);
    }

    @NotNull
    @Provides
    /* renamed from: b */
    public final C9562d m35177b(@NotNull LinkedHashMap<Level, Integer> linkedHashMap) {
        C2668g.b(linkedHashMap, "fireboardingLevelMap");
        linkedHashMap = linkedHashMap.keySet();
        C2668g.a(linkedHashMap, "fireboardingLevelMap.keys");
        return new C9562d(C19301m.l((Iterable) linkedHashMap));
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C11816q m35170a(@NotNull C11809n c11809n, @NotNull C9562d c9562d, @NotNull C11811o c11811o) {
        C2668g.b(c11809n, "observeCompletedFireboardingLevels");
        C2668g.b(c9562d, "completedLevelsProgressiveOnboardingAdapter");
        C2668g.b(c11811o, "observeFireboardingConfig");
        return new C11816q(c11809n, c9562d, c11811o);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final AddProgressiveOnboardingUnlockEvent m35159a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        return new AddProgressiveOnboardingUnlockEvent(c2630h);
    }
}
