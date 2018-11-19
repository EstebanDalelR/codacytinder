package com.tinder.recs.presenter;

import android.support.annotation.DrawableRes;
import android.support.annotation.VisibleForTesting;
import com.tinder.R;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.aa;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecs;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecsDupesOnly;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.events.EventPhotosProcessed;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.bj;
import com.tinder.module.Default;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.paywall.paywallflow.C10077p;
import com.tinder.recs.analytics.AddRecsInteractEvent;
import com.tinder.recs.analytics.AddRecsInteractEvent.Request;
import com.tinder.recs.analytics.AddRecsInteractEvent.Type;
import com.tinder.recs.model.RecsDecoratedLoadingStatusInfo;
import com.tinder.recs.model.RecsStatusMessageViewModel;
import com.tinder.recs.presenter.RecsStatusMessageResolver.ResultViewModel;
import com.tinder.recs.provider.RecsDecoratedLoadingStatusProvider;
import com.tinder.recs.target.RecsStatusTarget;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.RxUtils;
import de.greenrobot.event.C2664c;
import io.reactivex.disposables.Disposable;
import io.reactivex.p453a.p455b.C15674a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 U2\u00020\u0001:\u0001UBq\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u000204H\u0002J\u0010\u00108\u001a\u0002042\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u0002042\u0006\u0010<\u001a\u000201H\u0002J\u0006\u0010=\u001a\u000204J\r\u0010>\u001a\u000204H\u0001¢\u0006\u0002\b?J\b\u0010@\u001a\u000204H\u0002J\u000e\u0010A\u001a\u0002042\u0006\u0010B\u001a\u00020CJ\u0010\u0010D\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002J\u0010\u0010E\u001a\u0002042\u0006\u0010F\u001a\u00020GH\u0002J\b\u0010H\u001a\u00020 H\u0003J\u0010\u0010I\u001a\u0002042\u0006\u0010J\u001a\u00020KH\u0002J\u0010\u0010L\u001a\u0002042\u0006\u00100\u001a\u000201H\u0002J\b\u0010M\u001a\u00020 H\u0003J\r\u0010N\u001a\u000204H\u0001¢\u0006\u0002\bOJ\b\u0010P\u001a\u000204H\u0002J\b\u0010Q\u001a\u000204H\u0002J\r\u0010R\u001a\u000204H\u0001¢\u0006\u0002\bSJ\b\u0010T\u001a\u000204H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020+8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000201X\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/tinder/recs/presenter/RecsStatusPresenter;", "", "managerProfile", "Lcom/tinder/managers/ManagerProfile;", "eventBus", "Lde/greenrobot/event/EventBus;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "managerSettings", "Lcom/tinder/managers/ManagerSettings;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "tinderPlusInteractor", "Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;", "recsStatusMessageResolver", "Lcom/tinder/recs/presenter/RecsStatusMessageResolver;", "recsDecoratedLoadingStatusProvider", "Lcom/tinder/recs/provider/RecsDecoratedLoadingStatusProvider;", "startTinderEvent", "Lcom/tinder/analytics/performance/StartTinderEvent;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "paywallFlowFactory", "Lcom/tinder/paywall/paywallflow/PaywallFlowFactory;", "addRecsInteractEvent", "Lcom/tinder/recs/analytics/AddRecsInteractEvent;", "(Lcom/tinder/managers/ManagerProfile;Lde/greenrobot/event/EventBus;Lcom/tinder/domain/recs/RecsEngineRegistry;Lcom/tinder/managers/ManagerSettings;Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/tinderplus/interactors/TinderPlusInteractor;Lcom/tinder/recs/presenter/RecsStatusMessageResolver;Lcom/tinder/recs/provider/RecsDecoratedLoadingStatusProvider;Lcom/tinder/analytics/performance/StartTinderEvent;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/paywall/paywallflow/PaywallFlowFactory;Lcom/tinder/recs/analytics/AddRecsInteractEvent;)V", "loadingStatusSubscription", "Lrx/Subscription;", "numOfCurrentRecs", "", "pingStartTimestamp", "", "recsDecoratedLoadingStatusInfo", "Lcom/tinder/recs/model/RecsDecoratedLoadingStatusInfo;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "recsLoadingStatusInfoDisposable", "Lio/reactivex/disposables/Disposable;", "recsUpdatesSubscription", "target", "Lcom/tinder/recs/target/RecsStatusTarget;", "getTarget$Tinder_release", "()Lcom/tinder/recs/target/RecsStatusTarget;", "setTarget$Tinder_release", "(Lcom/tinder/recs/target/RecsStatusTarget;)V", "viewShouldAnimate", "", "viewShouldBeVisible", "checkShowRecsEnableSettingsButton", "", "loadingStatus", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "evaluateRadarVisibility", "fireRecsInteractEvent", "type", "Lcom/tinder/recs/analytics/AddRecsInteractEvent$Type;", "fireWaitingForRecsPerfEvent", "hasCompleted", "handleSettingsUpdateButtonClick", "loadUserImage", "loadUserImage$Tinder_release", "navigateToSettings", "onEventMainThread", "eventPhotosProcessed", "Lcom/tinder/events/EventPhotosProcessed;", "onLoadingStatusChange", "onRecsUpdate", "recsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "placeholderImage", "renderMessage", "result", "Lcom/tinder/recs/presenter/RecsStatusMessageResolver$ResultViewModel;", "renderRadarAnimation", "ringImage", "subscribe", "subscribe$Tinder_release", "subscribeToRecsDecoratedLoadingStatusProvider", "subscribeToRecsEngineUpdates", "unsubscribe", "unsubscribe$Tinder_release", "unsubscribeFromRecsEngineUpdates", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsStatusPresenter {
    @Deprecated
    public static final Companion Companion = new Companion();
    private static final int DEFAULT_NEW_MAX_AGE_VALUE = 0;
    private static final int DEFAULT_NEW_MIN_AGE_VALUE = 0;
    private static final int DEFAULT_NEW_RADIUS_VALUE = 0;
    private final AbTestUtility abTestUtility;
    private final AddRecsInteractEvent addRecsInteractEvent;
    private final C2664c eventBus;
    private final C2630h fireworks;
    private Subscription loadingStatusSubscription;
    private final ManagerProfile managerProfile;
    private final bj managerSettings;
    private int numOfCurrentRecs;
    private final C10077p paywallFlowFactory;
    private long pingStartTimestamp;
    private RecsDecoratedLoadingStatusInfo recsDecoratedLoadingStatusInfo;
    private final RecsDecoratedLoadingStatusProvider recsDecoratedLoadingStatusProvider;
    private final RecsEngine recsEngine;
    private Disposable recsLoadingStatusInfoDisposable;
    private final RecsStatusMessageResolver recsStatusMessageResolver;
    private Subscription recsUpdatesSubscription;
    private final aa startTinderEvent;
    private final SubscriptionProvider subscriptionProvider;
    @DeadshotTarget
    @NotNull
    public RecsStatusTarget target;
    private final C15193i tinderPlusInteractor;
    private boolean viewShouldAnimate;
    private boolean viewShouldBeVisible = true;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/recs/presenter/RecsStatusPresenter$Companion;", "", "()V", "DEFAULT_NEW_MAX_AGE_VALUE", "", "DEFAULT_NEW_MIN_AGE_VALUE", "DEFAULT_NEW_RADIUS_VALUE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    private static final class Companion {
        private Companion() {
        }
    }

    @Inject
    public RecsStatusPresenter(@NotNull ManagerProfile managerProfile, @Default @NotNull C2664c c2664c, @NotNull RecsEngineRegistry recsEngineRegistry, @NotNull bj bjVar, @NotNull C2630h c2630h, @NotNull AbTestUtility abTestUtility, @NotNull C15193i c15193i, @NotNull RecsStatusMessageResolver recsStatusMessageResolver, @NotNull RecsDecoratedLoadingStatusProvider recsDecoratedLoadingStatusProvider, @NotNull aa aaVar, @NotNull SubscriptionProvider subscriptionProvider, @NotNull C10077p c10077p, @NotNull AddRecsInteractEvent addRecsInteractEvent) {
        C2668g.b(managerProfile, "managerProfile");
        C2668g.b(c2664c, "eventBus");
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        C2668g.b(bjVar, "managerSettings");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(c15193i, "tinderPlusInteractor");
        C2668g.b(recsStatusMessageResolver, "recsStatusMessageResolver");
        C2668g.b(recsDecoratedLoadingStatusProvider, "recsDecoratedLoadingStatusProvider");
        C2668g.b(aaVar, "startTinderEvent");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(c10077p, "paywallFlowFactory");
        C2668g.b(addRecsInteractEvent, "addRecsInteractEvent");
        this.managerProfile = managerProfile;
        this.eventBus = c2664c;
        this.managerSettings = bjVar;
        this.fireworks = c2630h;
        this.abTestUtility = abTestUtility;
        this.tinderPlusInteractor = c15193i;
        this.recsStatusMessageResolver = recsStatusMessageResolver;
        this.recsDecoratedLoadingStatusProvider = recsDecoratedLoadingStatusProvider;
        this.startTinderEvent = aaVar;
        this.subscriptionProvider = subscriptionProvider;
        this.paywallFlowFactory = c10077p;
        this.addRecsInteractEvent = addRecsInteractEvent;
        managerProfile = recsEngineRegistry.getEngine((Rec$Source) Core.INSTANCE);
        if (managerProfile == null) {
            throw ((Throwable) new IllegalArgumentException("Core RecsEngine is not added.".toString()));
        }
        this.recsEngine = managerProfile;
    }

    @NotNull
    public static final /* synthetic */ RecsDecoratedLoadingStatusInfo access$getRecsDecoratedLoadingStatusInfo$p(RecsStatusPresenter recsStatusPresenter) {
        recsStatusPresenter = recsStatusPresenter.recsDecoratedLoadingStatusInfo;
        if (recsStatusPresenter == null) {
            C2668g.b("recsDecoratedLoadingStatusInfo");
        }
        return recsStatusPresenter;
    }

    @NotNull
    public final RecsStatusTarget getTarget$Tinder_release() {
        RecsStatusTarget recsStatusTarget = this.target;
        if (recsStatusTarget == null) {
            C2668g.b("target");
        }
        return recsStatusTarget;
    }

    public final void setTarget$Tinder_release(@NotNull RecsStatusTarget recsStatusTarget) {
        C2668g.b(recsStatusTarget, "<set-?>");
        this.target = recsStatusTarget;
    }

    public final void onEventMainThread(@NotNull EventPhotosProcessed eventPhotosProcessed) {
        C2668g.b(eventPhotosProcessed, "eventPhotosProcessed");
        loadUserImage$Tinder_release();
    }

    @Take
    public final void subscribe$Tinder_release() {
        this.recsDecoratedLoadingStatusProvider.startSubscription();
        subscribeToRecsDecoratedLoadingStatusProvider();
        subscribeToRecsEngineUpdates();
        this.eventBus.a(this);
        loadUserImage$Tinder_release();
    }

    @Drop
    public final void unsubscribe$Tinder_release() {
        this.eventBus.c(this);
        Disposable disposable = this.recsLoadingStatusInfoDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.recsDecoratedLoadingStatusProvider.stopSubscription();
        unsubscribeFromRecsEngineUpdates();
        if (this.pingStartTimestamp > 0) {
            fireWaitingForRecsPerfEvent(false);
        }
    }

    private final void onLoadingStatusChange(RecsLoadingStatus recsLoadingStatus) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LoadingStatus Change, ");
        stringBuilder.append(recsLoadingStatus);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        RecsStatusMessageResolver recsStatusMessageResolver = this.recsStatusMessageResolver;
        RecsDecoratedLoadingStatusInfo recsDecoratedLoadingStatusInfo = this.recsDecoratedLoadingStatusInfo;
        if (recsDecoratedLoadingStatusInfo == null) {
            C2668g.b("recsDecoratedLoadingStatusInfo");
        }
        ResultViewModel resolveMessage = recsStatusMessageResolver.resolveMessage(new RecsStatusMessageViewModel(recsLoadingStatus, recsDecoratedLoadingStatusInfo));
        renderRadarAnimation(resolveMessage.getViewShouldAnimate());
        renderMessage(resolveMessage);
        checkShowRecsEnableSettingsButton(recsLoadingStatus);
        evaluateRadarVisibility();
    }

    @VisibleForTesting
    public final void loadUserImage$Tinder_release() {
        this.managerProfile.e().k(RecsStatusPresenter$loadUserImage$1.INSTANCE).e((String) null).f().a(RxUtils.a()).a(new RecsStatusPresenter$loadUserImage$2(this), RecsStatusPresenter$loadUserImage$3.INSTANCE);
    }

    private final void subscribeToRecsDecoratedLoadingStatusProvider() {
        Disposable disposable = this.recsLoadingStatusInfoDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.recsLoadingStatusInfoDisposable = this.recsDecoratedLoadingStatusProvider.observeChanges().observeOn(C15674a.m58830a()).subscribe(new C16403x7d00acec(this), C16404x7d00aced.INSTANCE);
    }

    private final void subscribeToRecsEngineUpdates() {
        unsubscribeFromRecsEngineUpdates();
        this.loadingStatusSubscription = this.recsEngine.observeLoadingStatusUpdates().a(C19397a.a()).a(new RecsStatusPresenter$subscribeToRecsEngineUpdates$1(this), RecsStatusPresenter$subscribeToRecsEngineUpdates$2.INSTANCE);
        this.recsUpdatesSubscription = this.recsEngine.observeRecsUpdates().a(C19397a.a()).a(new RecsStatusPresenter$subscribeToRecsEngineUpdates$3(this), RecsStatusPresenter$subscribeToRecsEngineUpdates$4.INSTANCE);
    }

    private final void unsubscribeFromRecsEngineUpdates() {
        RxUtils.b(this.loadingStatusSubscription);
        RxUtils.b(this.recsUpdatesSubscription);
    }

    private final void onRecsUpdate(RecsUpdate recsUpdate) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onRecsUpdate, ");
        stringBuilder.append(recsUpdate);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        this.numOfCurrentRecs = recsUpdate.getCurrentRecs().size();
        boolean z = true;
        if (this.numOfCurrentRecs > 1) {
            z = false;
        }
        this.viewShouldBeVisible = z;
        evaluateRadarVisibility();
    }

    @DrawableRes
    private final int ringImage() {
        return this.subscriptionProvider.get().isGold() ? R.drawable.transparent_ring_gold : R.drawable.transparent_ring;
    }

    @DrawableRes
    private final int placeholderImage() {
        return this.subscriptionProvider.get().isGold() ? R.drawable.recs_radar_gold : R.drawable.recs_radar;
    }

    private final void evaluateRadarVisibility() {
        if (this.viewShouldBeVisible && this.viewShouldAnimate) {
            this.pingStartTimestamp = System.currentTimeMillis();
        } else if (this.pingStartTimestamp > 0) {
            fireWaitingForRecsPerfEvent(true);
            this.pingStartTimestamp = 0;
        }
        RecsStatusTarget recsStatusTarget;
        if (this.viewShouldBeVisible) {
            if (this.viewShouldAnimate) {
                recsStatusTarget = this.target;
                if (recsStatusTarget == null) {
                    C2668g.b("target");
                }
                recsStatusTarget.showViewWithAnimation(ringImage());
            } else {
                recsStatusTarget = this.target;
                if (recsStatusTarget == null) {
                    C2668g.b("target");
                }
                recsStatusTarget.showStatusViewWithNoAnimation();
            }
            return;
        }
        recsStatusTarget = this.target;
        if (recsStatusTarget == null) {
            C2668g.b("target");
        }
        recsStatusTarget.hide();
        this.pingStartTimestamp = 0;
    }

    private final void renderMessage(ResultViewModel resultViewModel) {
        if ((((CharSequence) resultViewModel.getLoadingMessage()).length() > 0 ? 1 : null) != null) {
            RecsStatusTarget recsStatusTarget = this.target;
            if (recsStatusTarget == null) {
                C2668g.b("target");
            }
            recsStatusTarget.showMessage(resultViewModel.getLoadingMessage());
            return;
        }
        resultViewModel = this.target;
        if (resultViewModel == null) {
            C2668g.b("target");
        }
        resultViewModel.clearMessage();
    }

    private final void renderRadarAnimation(boolean z) {
        this.viewShouldAnimate = z;
        if (z) {
            z = this.target;
            if (!z) {
                C2668g.b("target");
            }
            z.showRadarAnimation(ringImage());
            return;
        }
        z = this.target;
        if (!z) {
            C2668g.b("target");
        }
        z.hideRadarAnimation();
    }

    private final void checkShowRecsEnableSettingsButton(RecsLoadingStatus recsLoadingStatus) {
        if (!C2668g.a(recsLoadingStatus, NoMoreRecs.INSTANCE)) {
            if (C2668g.a(recsLoadingStatus, NoMoreRecsDupesOnly.INSTANCE) == null) {
                recsLoadingStatus = this.target;
                if (recsLoadingStatus == null) {
                    C2668g.b("target");
                }
                recsLoadingStatus.hideSettingsButton();
                return;
            }
        }
        if (this.abTestUtility.isSettingsOnRecsEnabled() != null) {
            recsLoadingStatus = this.recsDecoratedLoadingStatusInfo;
            if (recsLoadingStatus == null) {
                C2668g.b("recsDecoratedLoadingStatusInfo");
            }
            if (recsLoadingStatus.isAgeAndDistanceWithinLimit() != null) {
                recsLoadingStatus = this.target;
                if (recsLoadingStatus == null) {
                    C2668g.b("target");
                }
                recsLoadingStatus.showSettingsEnableView();
                return;
            }
            recsLoadingStatus = this.target;
            if (recsLoadingStatus == null) {
                C2668g.b("target");
            }
            recsLoadingStatus.showPassportEnableView();
            return;
        }
        recsLoadingStatus = this.target;
        if (recsLoadingStatus == null) {
            C2668g.b("target");
        }
        recsLoadingStatus.hideSettingsButton();
    }

    public final void handleSettingsUpdateButtonClick() {
        RecsDecoratedLoadingStatusInfo recsDecoratedLoadingStatusInfo = this.recsDecoratedLoadingStatusInfo;
        if (recsDecoratedLoadingStatusInfo == null) {
            C2668g.b("recsDecoratedLoadingStatusInfo");
        }
        if (recsDecoratedLoadingStatusInfo.isAgeAndDistanceWithinLimit()) {
            RecsStatusTarget recsStatusTarget = this.target;
            if (recsStatusTarget == null) {
                C2668g.b("target");
            }
            recsStatusTarget.showSettingsDialog();
        } else if (this.tinderPlusInteractor.m57121a()) {
            navigateToSettings();
        } else {
            C10076o a = this.paywallFlowFactory.a(PlusPaywallSource.RECS_EXHAUSTED_SETTINGS);
            a.a(new RecsStatusPresenter$handleSettingsUpdateButtonClick$1(this));
            RecsStatusTarget recsStatusTarget2 = this.target;
            if (recsStatusTarget2 == null) {
                C2668g.b("target");
            }
            recsStatusTarget2.launchPaywallFlow(a);
        }
    }

    private final void navigateToSettings() {
        RecsStatusTarget recsStatusTarget = this.target;
        if (recsStatusTarget == null) {
            C2668g.b("target");
        }
        recsStatusTarget.navigateToSettings();
        fireRecsInteractEvent(Type.PASSPORT);
    }

    private final void fireRecsInteractEvent(Type type) {
        this.addRecsInteractEvent.execute(new Request(type.getAnalyticsValue(), this.managerSettings.b(), this.managerSettings.c(), this.managerSettings.d(), (float) null, 0, 0));
    }

    private final void fireWaitingForRecsPerfEvent(boolean r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r6.startTinderEvent;
        r1 = "START_TINDER_TIMER_KEY";
        r0 = r0.d(r1);
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        return;
    L_0x000b:
        r0 = java.lang.System.currentTimeMillis();
        r2 = r6.pingStartTimestamp;
        r4 = r0 - r2;
        r0 = com.tinder.analytics.performance.C6242m.a();
        r7 = r0.a(r7);
        r0 = r6.numOfCurrentRecs;
        r7 = r7.a(r0);
        r0 = r6.managerSettings;
        r0 = r0.b();
        r7 = r7.a(r0);
        r0 = r6.managerSettings;
        r0 = r0.c();
        r7 = r7.c(r0);
        r0 = r6.managerSettings;
        r0 = r0.d();
        r7 = r7.b(r0);
        r7 = r7.a();
        r0 = new com.tinder.analytics.performance.ah;
        r1 = r6.fireworks;
        r2 = r6.abTestUtility;
        r0.<init>(r1, r2);
        r0.a(r4, r7);
        r0 = r6.startTinderEvent;	 Catch:{ IllegalStateException -> 0x005d }
        r1 = "START_TINDER_TIMER_KEY";	 Catch:{ IllegalStateException -> 0x005d }
        r0.b(r1);	 Catch:{ IllegalStateException -> 0x005d }
        r0 = r6.startTinderEvent;	 Catch:{ IllegalStateException -> 0x005d }
        r1 = "START_TINDER_TIMER_KEY";	 Catch:{ IllegalStateException -> 0x005d }
        r0.a(r1, r7);	 Catch:{ IllegalStateException -> 0x005d }
    L_0x005d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.presenter.RecsStatusPresenter.fireWaitingForRecsPerfEvent(boolean):void");
    }
}
