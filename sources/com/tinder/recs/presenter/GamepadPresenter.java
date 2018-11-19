package com.tinder.recs.presenter;

import com.tinder.boost.p179b.C8339c;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.domain.profile.model.Tutorial.BoostReminder;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.Consume;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.fireboarding.domain.C11809n;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.fireboarding.domain.C9566h;
import com.tinder.fireboarding.domain.Level;
import com.tinder.gamepad.model.C9657b;
import com.tinder.gamepadcounters.C9671a;
import com.tinder.gamepadcounters.C9673c;
import com.tinder.home.p259b.C9695a;
import com.tinder.managers.bk;
import com.tinder.recs.target.GamepadTarget;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3957b;
import io.reactivex.disposables.C17356a;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001@BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\b\u0010#\u001a\u00020$H\u0002J\r\u0010%\u001a\u00020$H\u0001¢\u0006\u0002\b&J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0016\u0010+\u001a\u00020(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\u0006\u0010/\u001a\u00020$J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020201H\u0002J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020401H\u0002J\u001e\u00105\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\f\u00106\u001a\b\u0012\u0004\u0012\u00020807H\u0002J\b\u00109\u001a\u00020$H\u0002J\r\u0010:\u001a\u00020$H\u0001¢\u0006\u0002\b;J\b\u0010<\u001a\u00020$H\u0002J\b\u0010=\u001a\u00020$H\u0002J\r\u0010>\u001a\u00020$H\u0001¢\u0006\u0002\b?R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/tinder/recs/presenter/GamepadPresenter;", "", "addBoostReminderViewEvent", "Lcom/tinder/boost/usecase/AddBoostReminderViewEvent;", "likeStatusProvider", "Lcom/tinder/tinderplus/provider/LikeStatusProvider;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "tinderPlusInteractor", "Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;", "gamepadCounterSessionController", "Lcom/tinder/gamepadcounters/GamepadCounterSessionController;", "homePageTabSelectedProvider", "Lcom/tinder/home/provider/HomePageTabSelectedProvider;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "managerSharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "observeCompletedFireboardingLevels", "Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;", "observeFireboardingConfig", "Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;", "(Lcom/tinder/boost/usecase/AddBoostReminderViewEvent;Lcom/tinder/tinderplus/provider/LikeStatusProvider;Lcom/tinder/domain/recs/RecsEngineRegistry;Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;Lcom/tinder/gamepadcounters/GamepadCounterSessionController;Lcom/tinder/home/provider/HomePageTabSelectedProvider;Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/fireboarding/domain/ObserveCompletedFireboardingLevels;Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "target", "Lcom/tinder/recs/target/GamepadTarget;", "getTarget$Tinder_release", "()Lcom/tinder/recs/target/GamepadTarget;", "setTarget$Tinder_release", "(Lcom/tinder/recs/target/GamepadTarget;)V", "bindDefaultButtonsStates", "", "drop", "drop$Tinder_release", "isRewindButtonEnabled", "", "recsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "isTopRecSuperlikable", "recs", "", "Lcom/tinder/domain/recs/model/Rec;", "notifyCounterSeen", "observeGamepadCounterInfo", "Lrx/Single;", "Lcom/tinder/gamepadcounters/GamePadButtonCounterInfo;", "observeHomePageRecs", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "onRecsUpdate", "completedLevels", "", "Lcom/tinder/fireboarding/domain/Level;", "showBoostReminderTooltipIfNecessary", "subscribeToGamepadCounterSession", "subscribeToGamepadCounterSession$Tinder_release", "subscribeToLikeStatusChanges", "subscribeToRecsUpdates", "take", "take$Tinder_release", "RecsUpdateCompositeInfo", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GamepadPresenter {
    private final C8339c addBoostReminderViewEvent;
    private final CheckTutorialViewed checkTutorialViewed;
    private final C17356a compositeDisposable;
    private final C19573b compositeSubscription;
    private final C9673c gamepadCounterSessionController;
    private final C9695a homePageTabSelectedProvider;
    private final LikeStatusProvider likeStatusProvider;
    private final bk managerSharedPreferences;
    private final C11809n observeCompletedFireboardingLevels;
    private final C11811o observeFireboardingConfig;
    private final RecsEngine recsEngine;
    @DeadshotTarget
    @NotNull
    public GamepadTarget target;
    private final C15193i tinderPlusInteractor;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/tinder/recs/presenter/GamepadPresenter$RecsUpdateCompositeInfo;", "", "recsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "completedLevels", "", "Lcom/tinder/fireboarding/domain/Level;", "fireboardingConfig", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "(Lcom/tinder/domain/recs/model/RecsUpdate;Ljava/util/Set;Lcom/tinder/fireboarding/domain/FireboardingConfig;)V", "getCompletedLevels", "()Ljava/util/Set;", "getFireboardingConfig", "()Lcom/tinder/fireboarding/domain/FireboardingConfig;", "getRecsUpdate", "()Lcom/tinder/domain/recs/model/RecsUpdate;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class RecsUpdateCompositeInfo {
        @NotNull
        private final Set<Level> completedLevels;
        @NotNull
        private final C9566h fireboardingConfig;
        @NotNull
        private final RecsUpdate recsUpdate;

        @NotNull
        public static /* synthetic */ RecsUpdateCompositeInfo copy$default(RecsUpdateCompositeInfo recsUpdateCompositeInfo, RecsUpdate recsUpdate, Set set, C9566h c9566h, int i, Object obj) {
            if ((i & 1) != 0) {
                recsUpdate = recsUpdateCompositeInfo.recsUpdate;
            }
            if ((i & 2) != 0) {
                set = recsUpdateCompositeInfo.completedLevels;
            }
            if ((i & 4) != 0) {
                c9566h = recsUpdateCompositeInfo.fireboardingConfig;
            }
            return recsUpdateCompositeInfo.copy(recsUpdate, set, c9566h);
        }

        @NotNull
        public final RecsUpdate component1() {
            return this.recsUpdate;
        }

        @NotNull
        public final Set<Level> component2() {
            return this.completedLevels;
        }

        @NotNull
        public final C9566h component3() {
            return this.fireboardingConfig;
        }

        @NotNull
        public final RecsUpdateCompositeInfo copy(@NotNull RecsUpdate recsUpdate, @NotNull Set<? extends Level> set, @NotNull C9566h c9566h) {
            C2668g.b(recsUpdate, "recsUpdate");
            C2668g.b(set, "completedLevels");
            C2668g.b(c9566h, "fireboardingConfig");
            return new RecsUpdateCompositeInfo(recsUpdate, set, c9566h);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RecsUpdateCompositeInfo) {
                    RecsUpdateCompositeInfo recsUpdateCompositeInfo = (RecsUpdateCompositeInfo) obj;
                    if (C2668g.a(this.recsUpdate, recsUpdateCompositeInfo.recsUpdate) && C2668g.a(this.completedLevels, recsUpdateCompositeInfo.completedLevels) && C2668g.a(this.fireboardingConfig, recsUpdateCompositeInfo.fireboardingConfig)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            RecsUpdate recsUpdate = this.recsUpdate;
            int i = 0;
            int hashCode = (recsUpdate != null ? recsUpdate.hashCode() : 0) * 31;
            Set set = this.completedLevels;
            hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
            C9566h c9566h = this.fireboardingConfig;
            if (c9566h != null) {
                i = c9566h.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RecsUpdateCompositeInfo(recsUpdate=");
            stringBuilder.append(this.recsUpdate);
            stringBuilder.append(", completedLevels=");
            stringBuilder.append(this.completedLevels);
            stringBuilder.append(", fireboardingConfig=");
            stringBuilder.append(this.fireboardingConfig);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public RecsUpdateCompositeInfo(@NotNull RecsUpdate recsUpdate, @NotNull Set<? extends Level> set, @NotNull C9566h c9566h) {
            C2668g.b(recsUpdate, "recsUpdate");
            C2668g.b(set, "completedLevels");
            C2668g.b(c9566h, "fireboardingConfig");
            this.recsUpdate = recsUpdate;
            this.completedLevels = set;
            this.fireboardingConfig = c9566h;
        }

        @NotNull
        public final RecsUpdate getRecsUpdate() {
            return this.recsUpdate;
        }

        @NotNull
        public final Set<Level> getCompletedLevels() {
            return this.completedLevels;
        }

        @NotNull
        public final C9566h getFireboardingConfig() {
            return this.fireboardingConfig;
        }
    }

    @Inject
    public GamepadPresenter(@NotNull C8339c c8339c, @NotNull LikeStatusProvider likeStatusProvider, @NotNull RecsEngineRegistry recsEngineRegistry, @NotNull C15193i c15193i, @NotNull C9673c c9673c, @NotNull C9695a c9695a, @NotNull CheckTutorialViewed checkTutorialViewed, @NotNull bk bkVar, @NotNull C11809n c11809n, @NotNull C11811o c11811o) {
        C2668g.b(c8339c, "addBoostReminderViewEvent");
        C2668g.b(likeStatusProvider, "likeStatusProvider");
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        C2668g.b(c15193i, "tinderPlusInteractor");
        C2668g.b(c9673c, "gamepadCounterSessionController");
        C2668g.b(c9695a, "homePageTabSelectedProvider");
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        C2668g.b(bkVar, "managerSharedPreferences");
        C2668g.b(c11809n, "observeCompletedFireboardingLevels");
        C2668g.b(c11811o, "observeFireboardingConfig");
        this.addBoostReminderViewEvent = c8339c;
        this.likeStatusProvider = likeStatusProvider;
        this.tinderPlusInteractor = c15193i;
        this.gamepadCounterSessionController = c9673c;
        this.homePageTabSelectedProvider = c9695a;
        this.checkTutorialViewed = checkTutorialViewed;
        this.managerSharedPreferences = bkVar;
        this.observeCompletedFireboardingLevels = c11809n;
        this.observeFireboardingConfig = c11811o;
        c8339c = recsEngineRegistry.getEngine((Rec$Source) Core.INSTANCE);
        if (c8339c == null) {
            throw ((Throwable) new IllegalArgumentException("Core RecsEngine is not added.".toString()));
        }
        this.recsEngine = c8339c;
        this.compositeSubscription = new C19573b();
        this.compositeDisposable = new C17356a();
    }

    @NotNull
    public final GamepadTarget getTarget$Tinder_release() {
        GamepadTarget gamepadTarget = this.target;
        if (gamepadTarget == null) {
            C2668g.b("target");
        }
        return gamepadTarget;
    }

    public final void setTarget$Tinder_release(@NotNull GamepadTarget gamepadTarget) {
        C2668g.b(gamepadTarget, "<set-?>");
        this.target = gamepadTarget;
    }

    @Take
    public final void take$Tinder_release() {
        this.compositeSubscription.a();
        showBoostReminderTooltipIfNecessary();
        subscribeToRecsUpdates();
        subscribeToLikeStatusChanges();
        bindDefaultButtonsStates();
    }

    @Take
    public final void subscribeToGamepadCounterSession$Tinder_release() {
        this.gamepadCounterSessionController.a();
        this.compositeSubscription.a(Single.a(observeGamepadCounterInfo(), observeHomePageRecs(), C18005x631ac0d4.INSTANCE).b(Schedulers.io()).a(C19397a.a()).a(new C18766x631ac0d5(this), C18767x631ac0d6.INSTANCE));
    }

    @Drop
    public final void drop$Tinder_release() {
        this.compositeSubscription.a();
        this.compositeDisposable.m63446a();
    }

    public final void notifyCounterSeen() {
        this.gamepadCounterSessionController.b();
    }

    private final void subscribeToLikeStatusChanges() {
        this.compositeSubscription.a(this.likeStatusProvider.observeLikeStatusUpdates().a(C19397a.a()).a(new C18768xb8266e99(this), C18769xb8266e9a.INSTANCE));
    }

    private final void bindDefaultButtonsStates() {
        Set a = C9657b.f32194a.a();
        GamepadTarget gamepadTarget = this.target;
        if (gamepadTarget == null) {
            C2668g.b("target");
        }
        gamepadTarget.bind(a);
    }

    private final void subscribeToRecsUpdates() {
        C3957b.a(RxJavaInteropExtKt.toV2Flowable(this.recsEngine.observeRecsUpdates()), this.observeCompletedFireboardingLevels.execute().toFlowable(BackpressureStrategy.LATEST), this.observeFireboardingConfig.execute(), GamepadPresenter$subscribeToRecsUpdates$1.INSTANCE).a(C15674a.m58830a()).a(new GamepadPresenter$subscribeToRecsUpdates$2(this), GamepadPresenter$subscribeToRecsUpdates$3.INSTANCE);
    }

    private final void onRecsUpdate(RecsUpdate recsUpdate, Set<? extends Level> set) {
        List currentRecs = recsUpdate.getCurrentRecs();
        recsUpdate = C9657b.f32194a.a(isRewindButtonEnabled(recsUpdate), recsUpdate.getCurrentRecs().isEmpty(), isTopRecSuperlikable(currentRecs), set);
        set = this.target;
        if (set == null) {
            C2668g.b("target");
        }
        set.bind(recsUpdate);
    }

    private final boolean isTopRecSuperlikable(List<? extends Rec> list) {
        Rec rec = (Rec) C19299w.m68831g((List) list);
        return rec != null ? RecFieldDecorationExtensionsKt.isSuperLikeable(rec) : null;
    }

    private final void showBoostReminderTooltipIfNecessary() {
        this.compositeDisposable.add(this.checkTutorialViewed.execute(BoostReminder.INSTANCE).a(new GamepadPresenter$showBoostReminderTooltipIfNecessary$1(this)).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new GamepadPresenter$showBoostReminderTooltipIfNecessary$2(this), GamepadPresenter$showBoostReminderTooltipIfNecessary$3.INSTANCE));
    }

    private final Single<C9671a> observeGamepadCounterInfo() {
        Single<C9671a> a = this.gamepadCounterSessionController.d().h().a();
        C2668g.a(a, "gamepadCounterSessionCon…Info().first().toSingle()");
        return a;
    }

    private final Single<TabbedPageLayout$Page> observeHomePageRecs() {
        Single<TabbedPageLayout$Page> a = this.homePageTabSelectedProvider.a().f(GamepadPresenter$observeHomePageRecs$1.INSTANCE).h().a();
        C2668g.a(a, "homePageTabSelectedProvi…)\n            .toSingle()");
        return a;
    }

    private final boolean isRewindButtonEnabled(RecsUpdate recsUpdate) {
        boolean z = false;
        if (this.tinderPlusInteractor.m57121a() && (recsUpdate instanceof Consume)) {
            if ((((Consume) recsUpdate).getSwipe().getRec().getType() == RecType.AD ? 1 : null) == null && recsUpdate.getAvailableRewindCount() > null) {
                z = true;
            }
            return z;
        }
        if (recsUpdate.getAvailableRewindCount() > null) {
            z = true;
        }
        return z;
    }
}
