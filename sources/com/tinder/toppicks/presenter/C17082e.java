package com.tinder.toppicks.presenter;

import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
import com.tinder.cardstack.p180a.C10455d;
import com.tinder.cardstack.p180a.C10456e;
import com.tinder.cardstack.p180a.C10457f;
import com.tinder.cardstack.p180a.C10458g;
import com.tinder.cardstack.p180a.C12644b;
import com.tinder.cardstack.p180a.C12645c;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.injection.qualifiers.CurrentDateTimeMillis;
import com.tinder.domain.injection.qualifiers.TimeIntervalMins;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.domain.recs.model.RatingResult;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecSource.TopPicks;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedNoConnection;
import com.tinder.domain.recs.model.RecsLoadingStatus.Loading;
import com.tinder.domain.recs.model.RecsLoadingStatus.LoadingMore;
import com.tinder.domain.recs.model.RecsLoadingStatus.Uninitialized;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.Consume;
import com.tinder.domain.recs.model.RecsUpdate.Remove;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.SwipeActionContext;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.domain.recs.model.SwipeRatingStatus;
import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import com.tinder.domain.recs.model.TopPickTeaserRec;
import com.tinder.domain.recs.model.TopPickUserRec;
import com.tinder.domain.toppicks.MarkTopPicksTutorialAsSeen;
import com.tinder.domain.toppicks.ShouldShowTopPicksTutorial;
import com.tinder.domain.toppicks.model.TopPicksResponse;
import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.toppicks.usecase.BypassTopPicksEnd;
import com.tinder.domain.toppicks.usecase.DecrementTopPicksCount;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksResponse;
import com.tinder.domain.toppicks.usecase.ObserveTopPicksSession;
import com.tinder.domain.toppicks.usecase.SetTopPicksCount;
import com.tinder.domain.toppicks.usecase.UpdateTopPicksSession;
import com.tinder.domain.toppicks.usecase.UpdateTopPicksSessionFromRecsUpdate;
import com.tinder.domain.toppicks.usecase.UpdateTopPicksSessionFromRecsUpdate.Request;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.recs.RecsCardFactory;
import com.tinder.recs.domain.model.RewindReason;
import com.tinder.recs.provider.SuperLikeRatingStatus;
import com.tinder.recs.provider.SuperLikeRatingStatusNotifier;
import com.tinder.recsgrid.C14782d;
import com.tinder.recsgrid.C14783e;
import com.tinder.recsgrid.ScrollStatusNotifier;
import com.tinder.recsgrid.ScrollStatusProvider;
import com.tinder.toppicks.C15256e;
import com.tinder.toppicks.notifications.ScheduleTopPicksNotification;
import com.tinder.toppicks.notifications.ScheduleTopPicksNotification$Reason;
import com.tinder.toppicks.notifications.ScheduleTopPicksNotification.C15276a;
import com.tinder.toppicks.p430a.C15223c;
import com.tinder.toppicks.view.TopPicksGridRecsTarget;
import com.tinder.views.grid.presenter.RecsGridPresenter;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.collections.C19297v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B¿\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u000e\b\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,¢\u0006\u0002\u0010-J\u001e\u0010<\u001a\u00020=2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010A\u001a\u00020=H\u0002J\u0006\u0010B\u001a\u00020CJ\u0012\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020GH\u0002J\u0012\u0010H\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020GH\u0002J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020@0?H\u0002J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020K0?H\u0002J\u0012\u0010L\u001a\u00020=2\b\u0010M\u001a\u0004\u0018\u000103H\u0002J\u0010\u0010N\u001a\u00020C2\u0006\u0010O\u001a\u00020PH\u0003J\u0010\u0010Q\u001a\u00020C2\u0006\u0010M\u001a\u000203H\u0003J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020T0S2\u0006\u0010U\u001a\u00020TH\u0002J\u0010\u0010V\u001a\u00020C2\u0006\u0010U\u001a\u00020TH\u0002J\u0018\u0010W\u001a\u00020C2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020YH\u0007J\u0010\u0010[\u001a\u0002012\u0006\u0010\\\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u0002012\u0006\u0010\\\u001a\u00020]H\u0002J\u0018\u0010_\u001a\u00020C2\u0006\u0010`\u001a\u00020@2\u0006\u0010a\u001a\u00020bH\u0017J\u0006\u0010c\u001a\u00020CJ\b\u0010d\u001a\u00020CH\u0007J\b\u0010e\u001a\u00020=H\u0002J\u000e\u0010f\u001a\b\u0012\u0004\u0012\u0002030gH\u0002J\r\u0010h\u001a\u00020CH\u0001¢\u0006\u0002\biJ\r\u0010j\u001a\u00020CH\u0001¢\u0006\u0002\bkJ\r\u0010l\u001a\u00020CH\u0001¢\u0006\u0002\bmJ\r\u0010n\u001a\u00020CH\u0001¢\u0006\u0002\boJ\r\u0010p\u001a\u00020CH\u0001¢\u0006\u0002\bqJ\u0018\u0010r\u001a\u00020C2\u0006\u0010`\u001a\u00020@2\u0006\u0010a\u001a\u00020bH\u0017J\b\u0010s\u001a\u00020CH\u0002J\u0006\u0010t\u001a\u00020CJ\u0010\u0010u\u001a\u0002012\u0006\u0010M\u001a\u000203H\u0002J\u0010\u0010v\u001a\u00020C2\u0006\u0010w\u001a\u00020xH\u0007J\u0018\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020TH\u0002J\u0010\u0010~\u001a\u00020C2\u0006\u0010\\\u001a\u00020]H\u0003J\u0010\u0010\u001a\u00020C2\u0006\u0010\\\u001a\u00020]H\u0003J\t\u0010\u0001\u001a\u00020CH\u0007J\u000f\u0010\u0001\u001a\u00020CH\u0001¢\u0006\u0003\b\u0001J\t\u0010\u0001\u001a\u00020CH\u0003J\t\u0010\u0001\u001a\u00020CH\u0003J\t\u0010\u0001\u001a\u00020CH\u0003J\u0019\u0010\u0001\u001a\u00020C2\u0006\u0010`\u001a\u00020@2\u0006\u0010a\u001a\u00020bH\u0017J\u000f\u0010\u0001\u001a\u00020CH\u0001¢\u0006\u0003\b\u0001J\u0011\u0010\u0001\u001a\u00020C2\u0006\u0010M\u001a\u000203H\u0002J\u0011\u0010\u0001\u001a\u00020C2\u0006\u0010M\u001a\u000203H\u0002J\u0010\u0010\u0010\u001a\u00020C2\u0006\u0010\\\u001a\u00020]H\u0003J\u000e\u0010\u0001\u001a\u00030\u0001*\u00020bH\u0002J\u000e\u0010\u0001\u001a\u000201*\u00030\u0001H\u0002J\r\u0010\u0001\u001a\u000201*\u00020TH\u0002R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u001e\u00106\u001a\u0002078\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/tinder/toppicks/presenter/TopPicksGridRecsPresenter;", "Lcom/tinder/views/grid/presenter/RecsGridPresenter;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "cardFactory", "Lcom/tinder/recs/RecsCardFactory;", "scrollStatusProvider", "Lcom/tinder/recsgrid/ScrollStatusProvider;", "scrollStatusNotifier", "Lcom/tinder/recsgrid/ScrollStatusNotifier;", "recPrefetcher", "Lcom/tinder/recsgrid/RecPrefetcher;", "markTopPicksTutorialAsSeen", "Lcom/tinder/domain/toppicks/MarkTopPicksTutorialAsSeen;", "shouldShowTopPicksTutorial", "Lcom/tinder/domain/toppicks/ShouldShowTopPicksTutorial;", "updateTopPicksSession", "Lcom/tinder/domain/toppicks/usecase/UpdateTopPicksSession;", "observeTopPicksResponse", "Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksResponse;", "updateTopPicksSessionFromRecsUpdate", "Lcom/tinder/domain/toppicks/usecase/UpdateTopPicksSessionFromRecsUpdate;", "decrementTopPicksCount", "Lcom/tinder/domain/toppicks/usecase/DecrementTopPicksCount;", "sendTopPicksEmptyStateViewEvent", "Lcom/tinder/toppicks/analytics/SendTopPicksEmptyStateViewEvent;", "timeIntervalMins", "Lio/reactivex/Observable;", "", "currentDateTimeMills", "Lkotlin/Function0;", "bypassTopPicksEnd", "Lcom/tinder/domain/toppicks/usecase/BypassTopPicksEnd;", "scheduleTopPicksNotification", "Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification;", "topPicksExpirationTimeSynchronizer", "Lcom/tinder/toppicks/TopPicksExpirationTimeSynchronizer;", "ratingProcessor", "Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;", "setTopPicksCount", "Lcom/tinder/domain/toppicks/usecase/SetTopPicksCount;", "superLikeRatingStatusNotifier", "Lcom/tinder/recs/provider/SuperLikeRatingStatusNotifier;", "observeTopPicksSession", "Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksSession;", "(Lcom/tinder/domain/recs/RecsEngineRegistry;Lcom/tinder/recs/RecsCardFactory;Lcom/tinder/recsgrid/ScrollStatusProvider;Lcom/tinder/recsgrid/ScrollStatusNotifier;Lcom/tinder/recsgrid/RecPrefetcher;Lcom/tinder/domain/toppicks/MarkTopPicksTutorialAsSeen;Lcom/tinder/domain/toppicks/ShouldShowTopPicksTutorial;Lcom/tinder/domain/toppicks/usecase/UpdateTopPicksSession;Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksResponse;Lcom/tinder/domain/toppicks/usecase/UpdateTopPicksSessionFromRecsUpdate;Lcom/tinder/domain/toppicks/usecase/DecrementTopPicksCount;Lcom/tinder/toppicks/analytics/SendTopPicksEmptyStateViewEvent;Lio/reactivex/Observable;Lkotlin/jvm/functions/Function0;Lcom/tinder/domain/toppicks/usecase/BypassTopPicksEnd;Lcom/tinder/toppicks/notifications/ScheduleTopPicksNotification;Lcom/tinder/toppicks/TopPicksExpirationTimeSynchronizer;Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;Lcom/tinder/domain/toppicks/usecase/SetTopPicksCount;Lcom/tinder/recs/provider/SuperLikeRatingStatusNotifier;Lcom/tinder/domain/toppicks/usecase/ObserveTopPicksSession;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isTopPicksEnd", "", "lastRecsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "target", "Lcom/tinder/toppicks/view/TopPicksGridRecsTarget;", "getTarget$Tinder_release", "()Lcom/tinder/toppicks/view/TopPicksGridRecsTarget;", "setTarget$Tinder_release", "(Lcom/tinder/toppicks/view/TopPicksGridRecsTarget;)V", "calculateRewindBeforeTeasersPosition", "", "currentRecs", "", "Lcom/tinder/domain/recs/model/Rec;", "swipedIndex", "forceRecsLoad", "", "getAnimationForRewind", "Lcom/tinder/cardstack/animation/SwipeAnimation;", "type", "Lcom/tinder/domain/recs/model/Swipe$Type;", "getAnimationForSwipeType", "getExistingTeasers", "getExpiredPurchasedRecs", "Lcom/tinder/domain/recs/model/TopPickUserRec;", "getTopPicksCount", "recsUpdate", "handleLoadingStatus", "loadingStatus", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "handleRecsUpdate", "handleRewind", "Lio/reactivex/Single;", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "swipeRatingStatus", "handleRewoundSwipeRatingStatus", "handleScrollProgress", "progress", "", "velocity", "hasTeasers", "response", "Lcom/tinder/domain/toppicks/model/TopPicksResponse;", "hasTopPicks", "likeOnRec", "rec", "origin", "Lcom/tinder/domain/recs/model/SwipeOrigin;", "loadMoreRecs", "markTutorialAsSeen", "numberOfRecs", "observeRecsUpdates", "Lio/reactivex/Flowable;", "observeSwipeRatingStatus", "observeSwipeRatingStatus$Tinder_release", "observeTopPicksApiResponse", "observeTopPicksApiResponse$Tinder_release", "observeTopPicksExpirationUpdate", "observeTopPicksExpirationUpdate$Tinder_release", "observeTopPicksSessionRefreshTime", "observeTopPicksSessionRefreshTime$Tinder_release", "observeTopPicksSessionTopPicksEnd", "observeTopPicksSessionTopPicksEnd$Tinder_release", "passOnRec", "removeExpiredRecs", "removeTeasers", "replayUpdateIsRemoval", "reset", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "rewindSwipeBeforeTeasers", "Lio/reactivex/Completable;", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "ratingStatus", "scheduleLocalNotificationIfNecessary", "sendTopPicksExhaustedEventIfNecessary", "showTutorialIfNecessary", "subscribe", "subscribe$Tinder_release", "subscribeToLoadingStatus", "subscribeToPrefetch", "subscribeToRecsUpdates", "superlikeOnRec", "unsubscribe", "unsubscribe$Tinder_release", "updateCount", "updateTopPickSessionFromSwipe", "getActionContext", "Lcom/tinder/domain/recs/model/Swipe$SwipeActionContext;", "isTopPick", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "shouldRewind", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.presenter.e */
public final class C17082e implements RecsGridPresenter {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public TopPicksGridRecsTarget f52557a;
    /* renamed from: b */
    private final RecsEngine f52558b;
    /* renamed from: c */
    private final C17356a f52559c = new C17356a();
    /* renamed from: d */
    private RecsUpdate f52560d;
    /* renamed from: e */
    private boolean f52561e;
    /* renamed from: f */
    private final RecsCardFactory f52562f;
    /* renamed from: g */
    private final ScrollStatusProvider f52563g;
    /* renamed from: h */
    private final ScrollStatusNotifier f52564h;
    /* renamed from: i */
    private final C14782d f52565i;
    /* renamed from: j */
    private final MarkTopPicksTutorialAsSeen f52566j;
    /* renamed from: k */
    private final ShouldShowTopPicksTutorial f52567k;
    /* renamed from: l */
    private final UpdateTopPicksSession f52568l;
    /* renamed from: m */
    private final ObserveTopPicksResponse f52569m;
    /* renamed from: n */
    private final UpdateTopPicksSessionFromRecsUpdate f52570n;
    /* renamed from: o */
    private final DecrementTopPicksCount f52571o;
    /* renamed from: p */
    private final C15223c f52572p;
    /* renamed from: q */
    private final C3959e<Long> f52573q;
    /* renamed from: r */
    private final Function0<Long> f52574r;
    /* renamed from: s */
    private final BypassTopPicksEnd f52575s;
    /* renamed from: t */
    private final ScheduleTopPicksNotification f52576t;
    /* renamed from: u */
    private final C15256e f52577u;
    /* renamed from: v */
    private final RatingProcessor f52578v;
    /* renamed from: w */
    private final SetTopPicksCount f52579w;
    /* renamed from: x */
    private final SuperLikeRatingStatusNotifier f52580x;
    /* renamed from: y */
    private final ObserveTopPicksSession f52581y;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$a */
    static final class C17056a<T> implements Predicate<SwipeRatingStatus> {
        /* renamed from: a */
        public static final C17056a f52525a = new C17056a();

        C17056a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62864a((SwipeRatingStatus) obj);
        }

        /* renamed from: a */
        public final boolean m62864a(@NotNull SwipeRatingStatus swipeRatingStatus) {
            C2668g.b(swipeRatingStatus, "it");
            return swipeRatingStatus instanceof Ended;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/recsgrid/ScrollStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$aa */
    static final class aa<T> implements Consumer<C14783e> {
        /* renamed from: a */
        final /* synthetic */ C17082e f52526a;

        aa(C17082e c17082e) {
            this.f52526a = c17082e;
        }

        public /* synthetic */ void accept(Object obj) {
            m62865a((C14783e) obj);
        }

        /* renamed from: a */
        public final void m62865a(C14783e c14783e) {
            this.f52526a.m62944i();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$ab */
    static final class ab<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final ab f52527a = new ab();

        ab() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62866a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62866a(Throwable th) {
            C0001a.c(th, "failed to observe scroll status", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsUpdate;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$ac */
    static final class ac<T> implements Consumer<RecsUpdate> {
        /* renamed from: a */
        final /* synthetic */ C17082e f52528a;

        ac(C17082e c17082e) {
            this.f52528a = c17082e;
        }

        public /* synthetic */ void accept(Object obj) {
            m62867a((RecsUpdate) obj);
        }

        /* renamed from: a */
        public final void m62867a(RecsUpdate recsUpdate) {
            C17082e c17082e = this.f52528a;
            C2668g.a(recsUpdate, "it");
            c17082e.m62911b(recsUpdate);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$ad */
    static final class ad<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final ad f52529a = new ad();

        ad() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62868a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62868a(Throwable th) {
            C0001a.c(th, "Unable to observe Recs Update", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$ae */
    static final class ae implements Action {
        /* renamed from: a */
        public static final ae f52530a = new ae();

        ae() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$af */
    static final class af<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final af f52531a = new af();

        af() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62869a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62869a(Throwable th) {
            C0001a.c(th, "Error updating session", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$b */
    static final class C17057b<T> implements Predicate<Ended> {
        /* renamed from: a */
        final /* synthetic */ C17082e f52532a;

        C17057b(C17082e c17082e) {
            this.f52532a = c17082e;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62870a((Ended) obj);
        }

        /* renamed from: a */
        public final boolean m62870a(@NotNull Ended ended) {
            C2668g.b(ended, "it");
            return this.f52532a.m62907a((SwipeRatingStatus) ended);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "it", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$c */
    static final class C17058c<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C17082e f52533a;

        C17058c(C17082e c17082e) {
            this.f52533a = c17082e;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62871a((Ended) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3960g<Ended> m62871a(@NotNull Ended ended) {
            C2668g.b(ended, "it");
            return this.f52533a.m62897a(ended);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$d */
    static final class C17059d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17059d f52534a = new C17059d();

        C17059d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62872a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62872a(Throwable th) {
            C0001a.c(th, "Error observing swipe rating result", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "topPicksResponse", "Lcom/tinder/domain/toppicks/model/TopPicksResponse;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$e */
    static final class C17060e<T> implements Consumer<TopPicksResponse> {
        /* renamed from: a */
        final /* synthetic */ C17082e f52535a;

        C17060e(C17082e c17082e) {
            this.f52535a = c17082e;
        }

        public /* synthetic */ void accept(Object obj) {
            m62873a((TopPicksResponse) obj);
        }

        /* renamed from: a */
        public final void m62873a(TopPicksResponse topPicksResponse) {
            C17082e c17082e = this.f52535a;
            C2668g.a(topPicksResponse, "topPicksResponse");
            c17082e.m62900a(topPicksResponse);
            this.f52535a.m62925e(topPicksResponse);
            this.f52535a.m62912b(topPicksResponse);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$f */
    static final class C17061f<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17061f f52536a = new C17061f();

        C17061f() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62874a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62874a(Throwable th) {
            C0001a.c(th, "Error observing Api response", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$g */
    static final class C17062g<T> implements Consumer<Long> {
        /* renamed from: a */
        final /* synthetic */ C17082e f52537a;

        C17062g(C17082e c17082e) {
            this.f52537a = c17082e;
        }

        public /* synthetic */ void accept(Object obj) {
            m62875a((Long) obj);
        }

        /* renamed from: a */
        public final void m62875a(Long l) {
            this.f52537a.m62926n();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$h */
    static final class C17063h<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17063h f52538a = new C17063h();

        C17063h() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62876a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62876a(Throwable th) {
            C0001a.c(th, "Error observing top picks expiration update", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "it", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$i */
    static final class C17064i<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17064i f52539a = new C17064i();

        C17064i() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62877a((TopPicksSession) obj);
        }

        @NotNull
        /* renamed from: a */
        public final DateTime m62877a(@NotNull TopPicksSession topPicksSession) {
            C2668g.b(topPicksSession, "it");
            return topPicksSession.getRefreshTime();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "refreshTime", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$j */
    static final class C17065j<T> implements Consumer<DateTime> {
        /* renamed from: a */
        final /* synthetic */ C17082e f52540a;

        C17065j(C17082e c17082e) {
            this.f52540a = c17082e;
        }

        public /* synthetic */ void accept(Object obj) {
            m62878a((DateTime) obj);
        }

        /* renamed from: a */
        public final void m62878a(DateTime dateTime) {
            C15256e b = this.f52540a.f52577u;
            C2668g.a(dateTime, "refreshTime");
            b.m57346a(dateTime.getMillis());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$k */
    static final class C17066k<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17066k f52541a = new C17066k();

        C17066k() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62879a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62879a(Throwable th) {
            C0001a.c(th, "Error observing top picks session.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$l */
    static final class C17067l<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C17067l f52542a = new C17067l();

        C17067l() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m62880a((TopPicksSession) obj));
        }

        /* renamed from: a */
        public final boolean m62880a(@NotNull TopPicksSession topPicksSession) {
            C2668g.b(topPicksSession, "it");
            return topPicksSession.isTopPicksEnd();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isTopPicksEnd", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$m */
    static final class C17068m<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C17082e f52543a;

        C17068m(C17082e c17082e) {
            this.f52543a = c17082e;
        }

        public /* synthetic */ void accept(Object obj) {
            m62881a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m62881a(Boolean bool) {
            C17082e c17082e = this.f52543a;
            C2668g.a(bool, "isTopPicksEnd");
            c17082e.f52561e = bool.booleanValue();
            if (bool.booleanValue() != null) {
                this.f52543a.m62934a().attachPaywallOverscrollListener();
            } else {
                this.f52543a.m62934a().detachPaywallOverscrollListener();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$n */
    static final class C17069n<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17069n f52544a = new C17069n();

        C17069n() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62882a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62882a(Throwable th) {
            C0001a.c(th, "Error observing top picks session.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$o */
    static final class C17070o implements Action {
        /* renamed from: a */
        public static final C17070o f52545a = new C17070o();

        C17070o() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$p */
    static final class C17071p<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17071p f52546a = new C17071p();

        C17071p() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62883a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62883a(Throwable th) {
            C0001a.c(th, "Unable to remove expired recs", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$q */
    static final class C17072q implements Action {
        /* renamed from: a */
        public static final C17072q f52547a = new C17072q();

        C17072q() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$r */
    static final class C17073r<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17073r f52548a = new C17073r();

        C17073r() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62884a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62884a(Throwable th) {
            C0001a.c(th, "Unable to remove teasers", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$s */
    static final class C17074s implements Action {
        /* renamed from: a */
        public static final C17074s f52549a = new C17074s();

        C17074s() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$t */
    static final class C17075t<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17075t f52550a = new C17075t();

        C17075t() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62885a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62885a(Throwable th) {
            C0001a.c(th, "Error scheduling notitication", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$u */
    static final class C17076u<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C17076u f52551a = new C17076u();

        C17076u() {
        }

        @NotNull
        /* renamed from: a */
        public final Boolean m62886a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return bool;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62886a((Boolean) obj).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$v */
    static final class C17077v<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C17082e f52552a;

        C17077v(C17082e c17082e) {
            this.f52552a = c17082e;
        }

        public /* synthetic */ void accept(Object obj) {
            m62887a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m62887a(Boolean bool) {
            this.f52552a.m62934a().displayTutorial();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$w */
    static final class C17078w<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17078w f52553a = new C17078w();

        C17078w() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62888a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62888a(Throwable th) {
            C0001a.c(th, "Error getting top picks tutorial status", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$x */
    static final class C17079x<T> implements Consumer<RecsLoadingStatus> {
        /* renamed from: a */
        final /* synthetic */ C17082e f52554a;

        C17079x(C17082e c17082e) {
            this.f52554a = c17082e;
        }

        public /* synthetic */ void accept(Object obj) {
            m62889a((RecsLoadingStatus) obj);
        }

        /* renamed from: a */
        public final void m62889a(RecsLoadingStatus recsLoadingStatus) {
            C17082e c17082e = this.f52554a;
            C2668g.a(recsLoadingStatus, "it");
            c17082e.m62899a(recsLoadingStatus);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$y */
    static final class C17080y<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C17080y f52555a = new C17080y();

        C17080y() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62890a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62890a(Throwable th) {
            C0001a.c(th, "Unable to get Loading state update", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/recsgrid/ScrollStatus;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.presenter.e$z */
    static final class C17081z<T> implements Predicate<C14783e> {
        /* renamed from: a */
        final /* synthetic */ C17082e f52556a;

        C17081z(C17082e c17082e) {
            this.f52556a = c17082e;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62891a((C14783e) obj);
        }

        /* renamed from: a */
        public final boolean m62891a(@NotNull C14783e c14783e) {
            C2668g.b(c14783e, "it");
            return this.f52556a.f52565i.m56056a(c14783e.m56057a(), c14783e.m56058b(), this.f52556a.m62931s());
        }
    }

    @Inject
    public C17082e(@NotNull RecsEngineRegistry recsEngineRegistry, @NotNull RecsCardFactory recsCardFactory, @NotNull ScrollStatusProvider scrollStatusProvider, @NotNull ScrollStatusNotifier scrollStatusNotifier, @NotNull C14782d c14782d, @NotNull MarkTopPicksTutorialAsSeen markTopPicksTutorialAsSeen, @NotNull ShouldShowTopPicksTutorial shouldShowTopPicksTutorial, @NotNull UpdateTopPicksSession updateTopPicksSession, @NotNull ObserveTopPicksResponse observeTopPicksResponse, @NotNull UpdateTopPicksSessionFromRecsUpdate updateTopPicksSessionFromRecsUpdate, @NotNull DecrementTopPicksCount decrementTopPicksCount, @NotNull C15223c c15223c, @NotNull @TimeIntervalMins C3959e<Long> c3959e, @NotNull @CurrentDateTimeMillis Function0<Long> function0, @NotNull BypassTopPicksEnd bypassTopPicksEnd, @NotNull ScheduleTopPicksNotification scheduleTopPicksNotification, @NotNull C15256e c15256e, @NotNull RatingProcessor ratingProcessor, @NotNull SetTopPicksCount setTopPicksCount, @NotNull SuperLikeRatingStatusNotifier superLikeRatingStatusNotifier, @NotNull ObserveTopPicksSession observeTopPicksSession) {
        C17082e c17082e = this;
        RecsCardFactory recsCardFactory2 = recsCardFactory;
        ScrollStatusProvider scrollStatusProvider2 = scrollStatusProvider;
        ScrollStatusNotifier scrollStatusNotifier2 = scrollStatusNotifier;
        C14782d c14782d2 = c14782d;
        MarkTopPicksTutorialAsSeen markTopPicksTutorialAsSeen2 = markTopPicksTutorialAsSeen;
        ShouldShowTopPicksTutorial shouldShowTopPicksTutorial2 = shouldShowTopPicksTutorial;
        UpdateTopPicksSession updateTopPicksSession2 = updateTopPicksSession;
        ObserveTopPicksResponse observeTopPicksResponse2 = observeTopPicksResponse;
        UpdateTopPicksSessionFromRecsUpdate updateTopPicksSessionFromRecsUpdate2 = updateTopPicksSessionFromRecsUpdate;
        DecrementTopPicksCount decrementTopPicksCount2 = decrementTopPicksCount;
        C15223c c15223c2 = c15223c;
        C3959e<Long> c3959e2 = c3959e;
        Function0<Long> function02 = function0;
        BypassTopPicksEnd bypassTopPicksEnd2 = bypassTopPicksEnd;
        ScheduleTopPicksNotification scheduleTopPicksNotification2 = scheduleTopPicksNotification;
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        C2668g.b(recsCardFactory2, "cardFactory");
        C2668g.b(scrollStatusProvider2, "scrollStatusProvider");
        C2668g.b(scrollStatusNotifier2, "scrollStatusNotifier");
        C2668g.b(c14782d2, "recPrefetcher");
        C2668g.b(markTopPicksTutorialAsSeen2, "markTopPicksTutorialAsSeen");
        C2668g.b(shouldShowTopPicksTutorial2, "shouldShowTopPicksTutorial");
        C2668g.b(updateTopPicksSession2, "updateTopPicksSession");
        C2668g.b(observeTopPicksResponse2, "observeTopPicksResponse");
        C2668g.b(updateTopPicksSessionFromRecsUpdate2, "updateTopPicksSessionFromRecsUpdate");
        C2668g.b(decrementTopPicksCount2, "decrementTopPicksCount");
        C2668g.b(c15223c2, "sendTopPicksEmptyStateViewEvent");
        C2668g.b(c3959e2, "timeIntervalMins");
        C2668g.b(function02, "currentDateTimeMills");
        C2668g.b(bypassTopPicksEnd2, "bypassTopPicksEnd");
        C2668g.b(scheduleTopPicksNotification, "scheduleTopPicksNotification");
        C2668g.b(c15256e, "topPicksExpirationTimeSynchronizer");
        C2668g.b(ratingProcessor, "ratingProcessor");
        C2668g.b(setTopPicksCount, "setTopPicksCount");
        C2668g.b(superLikeRatingStatusNotifier, "superLikeRatingStatusNotifier");
        C2668g.b(observeTopPicksSession, "observeTopPicksSession");
        ScheduleTopPicksNotification scheduleTopPicksNotification3 = scheduleTopPicksNotification;
        this.f52562f = recsCardFactory2;
        this.f52563g = scrollStatusProvider2;
        this.f52564h = scrollStatusNotifier2;
        this.f52565i = c14782d2;
        this.f52566j = markTopPicksTutorialAsSeen2;
        this.f52567k = shouldShowTopPicksTutorial2;
        this.f52568l = updateTopPicksSession2;
        this.f52569m = observeTopPicksResponse2;
        this.f52570n = updateTopPicksSessionFromRecsUpdate2;
        this.f52571o = decrementTopPicksCount2;
        this.f52572p = c15223c2;
        this.f52573q = c3959e2;
        this.f52574r = function02;
        this.f52575s = bypassTopPicksEnd2;
        this.f52576t = scheduleTopPicksNotification3;
        RatingProcessor ratingProcessor2 = ratingProcessor;
        this.f52577u = c15256e;
        this.f52578v = ratingProcessor2;
        SuperLikeRatingStatusNotifier superLikeRatingStatusNotifier2 = superLikeRatingStatusNotifier;
        this.f52579w = setTopPicksCount;
        this.f52580x = superLikeRatingStatusNotifier2;
        this.f52581y = observeTopPicksSession;
        this.f52558b = recsEngineRegistry.addEngineIfAbsent(TopPicks.INSTANCE);
    }

    @NotNull
    /* renamed from: a */
    public final TopPicksGridRecsTarget m62934a() {
        TopPicksGridRecsTarget topPicksGridRecsTarget = this.f52557a;
        if (topPicksGridRecsTarget == null) {
            C2668g.b("target");
        }
        return topPicksGridRecsTarget;
    }

    @Take
    /* renamed from: b */
    public final void m62937b() {
        this.f52558b.resume();
        m62928p();
        m62927o();
        m62930r();
    }

    @Take
    /* renamed from: c */
    public final void m62938c() {
        this.f52559c.add(this.f52573q.observeOn(C15756a.m59010b()).subscribeOn(C15674a.m58830a()).subscribe(new C17062g(this), C17063h.f52538a));
    }

    @Take
    /* renamed from: d */
    public final void m62939d() {
        this.f52559c.add(this.f52569m.execute().b(C15756a.m59010b()).a(new C17060e(this), C17061f.f52536a));
    }

    @Take
    /* renamed from: e */
    public final void m62940e() {
        this.f52559c.add(RxJavaInteropExtKt.toV2Observable(this.f52578v.observeSwipeRatingStatus()).observeOn(C15756a.m59010b()).filter(C17056a.f52525a).cast(Ended.class).filter(new C17057b(this)).flatMapSingle(new C17058c(this)).observeOn(C15674a.m58830a()).subscribe(new C17083h(new TopPicksGridRecsPresenter$observeSwipeRatingStatus$4(this)), C17059d.f52534a));
    }

    @Take
    /* renamed from: f */
    public final void m62941f() {
        this.f52559c.add(this.f52581y.execute().f(C17064i.f52539a).d().a(C15674a.m58830a()).a(new C17065j(this), C17066k.f52541a));
    }

    @Take
    /* renamed from: g */
    public final void m62942g() {
        this.f52559c.add(this.f52581y.execute().f(C17067l.f52542a).d().a(C15674a.m58830a()).a(new C17068m(this), C17069n.f52544a));
    }

    @Drop
    /* renamed from: h */
    public final void m62943h() {
        this.f52558b.pause();
        this.f52559c.m63446a();
        this.f52577u.m57347b();
        TopPicksGridRecsTarget topPicksGridRecsTarget = this.f52557a;
        if (topPicksGridRecsTarget == null) {
            C2668g.b("target");
        }
        topPicksGridRecsTarget.detachPaywallOverscrollListener();
    }

    @UiThread
    public void likeOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeOrigin, "origin");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("likeOnRec ");
        stringBuilder.append(rec);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        this.f52558b.processLikeOnRec(rec, m62895a(swipeOrigin));
    }

    @UiThread
    public void passOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeOrigin, "origin");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("passOnRec ");
        stringBuilder.append(rec);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        this.f52558b.processPassOnRec(rec, m62895a(swipeOrigin));
    }

    @UiThread
    public void superlikeOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeOrigin, "origin");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("superLikeOnRec ");
        stringBuilder.append(rec);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        this.f52558b.processSuperlikeOnRec(rec, m62895a(swipeOrigin));
    }

    @UiThread
    /* renamed from: a */
    public final void m62935a(float f, float f2) {
        this.f52564h.notify(new C14783e(f, f2));
    }

    /* renamed from: i */
    public final void m62944i() {
        this.f52558b.loadMoreRecs();
    }

    /* renamed from: j */
    public final void m62945j() {
        this.f52559c.add(RxJavaInteropExtKt.toV2Completable(this.f52558b.removeRecs(m62932t())).a(C17072q.f52547a, C17073r.f52548a));
    }

    /* renamed from: n */
    private final void m62926n() {
        this.f52559c.add(RxJavaInteropExtKt.toV2Completable(this.f52558b.removeRecs(m62933u())).a(C17070o.f52545a, C17071p.f52546a));
    }

    /* renamed from: k */
    public final void m62946k() {
        this.f52575s.execute();
        m62944i();
    }

    @UiThread
    /* renamed from: a */
    public final void m62936a(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "reason");
        this.f52558b.reset(resetReason);
    }

    @UiThread
    /* renamed from: l */
    public final void m62947l() {
        this.f52566j.execute();
    }

    @UiThread
    /* renamed from: m */
    public final void m62948m() {
        this.f52567k.execute().b(C15756a.m59010b()).a(C15674a.m58830a()).a(C17076u.f52551a).a(new C17077v(this), C17078w.f52553a);
    }

    @UiThread
    /* renamed from: o */
    private final void m62927o() {
        this.f52559c.add(RxJavaInteropExtKt.toV2Flowable(this.f52558b.observeLoadingStatusUpdates()).a(C15674a.m58830a()).a(new C17079x(this), C17080y.f52555a));
    }

    @UiThread
    /* renamed from: a */
    private final void m62899a(RecsLoadingStatus recsLoadingStatus) {
        RecsUpdate recsUpdate = this.f52560d;
        Object obj = 1;
        if (recsUpdate != null) {
            List currentRecs = recsUpdate.getCurrentRecs();
            if (currentRecs != null) {
                Iterable<Rec> iterable = currentRecs;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (Rec type : iterable) {
                        Object obj2;
                        if (type.getType() == RecType.TOP_PICK) {
                            obj2 = 1;
                            continue;
                        } else {
                            obj2 = null;
                            continue;
                        }
                        if (obj2 != null) {
                        }
                    }
                    if (obj != null) {
                        recsLoadingStatus = this.f52557a;
                        if (recsLoadingStatus == null) {
                            C2668g.b("target");
                        }
                        recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                        this.f52570n.execute(new Request(false));
                        return;
                    }
                    if (recsLoadingStatus instanceof Uninitialized) {
                        if (!(recsLoadingStatus instanceof Loading)) {
                            if (!(recsLoadingStatus instanceof LoadingMore)) {
                                recsLoadingStatus = this.f52557a;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.showLoadingMore();
                            } else if ((recsLoadingStatus instanceof FetchFailedNoConnection) != null) {
                                recsLoadingStatus = this.f52557a;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.showNoNetworkConnectionError();
                                recsLoadingStatus = this.f52557a;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                            } else {
                                recsLoadingStatus = this.f52557a;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                            }
                        }
                    }
                    recsLoadingStatus = this.f52557a;
                    if (recsLoadingStatus == null) {
                        C2668g.b("target");
                    }
                    recsLoadingStatus.showRefreshing();
                } else if (obj != null) {
                    if (recsLoadingStatus instanceof Uninitialized) {
                        if (recsLoadingStatus instanceof Loading) {
                            if (!(recsLoadingStatus instanceof LoadingMore)) {
                                recsLoadingStatus = this.f52557a;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.showLoadingMore();
                            } else if ((recsLoadingStatus instanceof FetchFailedNoConnection) != null) {
                                recsLoadingStatus = this.f52557a;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                            } else {
                                recsLoadingStatus = this.f52557a;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.showNoNetworkConnectionError();
                                recsLoadingStatus = this.f52557a;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                            }
                        }
                    }
                    recsLoadingStatus = this.f52557a;
                    if (recsLoadingStatus == null) {
                        C2668g.b("target");
                    }
                    recsLoadingStatus.showRefreshing();
                } else {
                    recsLoadingStatus = this.f52557a;
                    if (recsLoadingStatus == null) {
                        C2668g.b("target");
                    }
                    recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                    this.f52570n.execute(new Request(false));
                    return;
                }
            }
        }
        obj = null;
        if (obj != null) {
            recsLoadingStatus = this.f52557a;
            if (recsLoadingStatus == null) {
                C2668g.b("target");
            }
            recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
            this.f52570n.execute(new Request(false));
            return;
        }
        if (recsLoadingStatus instanceof Uninitialized) {
            if (recsLoadingStatus instanceof Loading) {
                if (!(recsLoadingStatus instanceof LoadingMore)) {
                    recsLoadingStatus = this.f52557a;
                    if (recsLoadingStatus == null) {
                        C2668g.b("target");
                    }
                    recsLoadingStatus.showLoadingMore();
                } else if ((recsLoadingStatus instanceof FetchFailedNoConnection) != null) {
                    recsLoadingStatus = this.f52557a;
                    if (recsLoadingStatus == null) {
                        C2668g.b("target");
                    }
                    recsLoadingStatus.showNoNetworkConnectionError();
                    recsLoadingStatus = this.f52557a;
                    if (recsLoadingStatus == null) {
                        C2668g.b("target");
                    }
                    recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                } else {
                    recsLoadingStatus = this.f52557a;
                    if (recsLoadingStatus == null) {
                        C2668g.b("target");
                    }
                    recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                }
            }
        }
        recsLoadingStatus = this.f52557a;
        if (recsLoadingStatus == null) {
            C2668g.b("target");
        }
        recsLoadingStatus.showRefreshing();
    }

    @UiThread
    /* renamed from: p */
    private final void m62928p() {
        this.f52559c.add(m62929q().a(C15674a.m58830a()).a(new ac(this), ad.f52529a));
    }

    /* renamed from: q */
    private final C3957b<RecsUpdate> m62929q() {
        Observable observeRecsUpdatesSince;
        if (this.f52560d != null) {
            RecsEngine recsEngine = this.f52558b;
            RecsUpdate recsUpdate = this.f52560d;
            if (recsUpdate == null) {
                C2668g.a();
            }
            observeRecsUpdatesSince = recsEngine.observeRecsUpdatesSince(recsUpdate);
        } else {
            observeRecsUpdatesSince = this.f52558b.observeRecsUpdates();
        }
        return RxJavaInteropExtKt.toV2Flowable(observeRecsUpdatesSince);
    }

    /* renamed from: a */
    private final boolean m62906a(RecsUpdate recsUpdate) {
        return (this.f52560d != null || (!(recsUpdate instanceof Remove) && (recsUpdate instanceof Consume) == null)) ? null : true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.UiThread
    /* renamed from: b */
    private final void m62911b(com.tinder.domain.recs.model.RecsUpdate r5) {
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "recs updates";
        r0.append(r1);
        r0.append(r5);
        r0 = r0.toString();
        r1 = 0;
        r2 = new java.lang.Object[r1];
        p000a.p001a.C0001a.b(r0, r2);
        r0 = r4.f52560d;
        if (r5 != r0) goto L_0x001c;
    L_0x001b:
        return;
    L_0x001c:
        r4.m62917c(r5);
        r0 = r4.f52560d;
        if (r0 != 0) goto L_0x005c;
    L_0x0023:
        r0 = r4.f52557a;
        if (r0 != 0) goto L_0x002c;
    L_0x0027:
        r2 = "target";
        kotlin.jvm.internal.C2668g.b(r2);
    L_0x002c:
        r0.showCardGrid();
        r0 = r4.f52557a;
        if (r0 != 0) goto L_0x0038;
    L_0x0033:
        r2 = "target";
        kotlin.jvm.internal.C2668g.b(r2);
    L_0x0038:
        r0.insertHeader();
        r0 = r4.f52557a;
        if (r0 != 0) goto L_0x0044;
    L_0x003f:
        r2 = "target";
        kotlin.jvm.internal.C2668g.b(r2);
    L_0x0044:
        r2 = r4.f52562f;
        r3 = r5.getCurrentRecs();
        r2 = r2.createCards(r3);
        r3 = "cardFactory.createCards(recsUpdate.currentRecs)";
        kotlin.jvm.internal.C2668g.a(r2, r3);
        r0.insertRecs(r1, r2);
        r4.f52560d = r5;
        r4.m62948m();
        return;
    L_0x005c:
        r0 = r5 instanceof com.tinder.domain.recs.model.RecsUpdate.Consume;
        if (r0 == 0) goto L_0x0090;
    L_0x0060:
        r0 = r5.getPosition();
        r1 = r4.f52557a;
        if (r1 != 0) goto L_0x006d;
    L_0x0068:
        r2 = "target";
        kotlin.jvm.internal.C2668g.b(r2);
    L_0x006d:
        r2 = r5;
        r2 = (com.tinder.domain.recs.model.RecsUpdate.Consume) r2;
        r3 = r2.getSwipe();
        r3 = r3.getType();
        r3 = r4.m62909b(r3);
        r1.removeRec(r0, r3);
        r0 = r2.getSwipe();
        r0 = r0.getType();
        r1 = com.tinder.domain.recs.model.Swipe.Type.SUPERLIKE;
        if (r0 == r1) goto L_0x0149;
    L_0x008b:
        r4.m62922d(r5);
        goto L_0x0149;
    L_0x0090:
        r0 = r5 instanceof com.tinder.domain.recs.model.RecsUpdate.Remove;
        if (r0 == 0) goto L_0x00ab;
    L_0x0094:
        r0 = r4.f52557a;
        if (r0 != 0) goto L_0x009d;
    L_0x0098:
        r1 = "target";
        kotlin.jvm.internal.C2668g.b(r1);
    L_0x009d:
        r1 = r5.getPosition();
        r2 = 2;
        r3 = 0;
        com.tinder.toppicks.view.TopPicksGridRecsTarget$a.m57460a(r0, r1, r3, r2, r3);
        r4.m62922d(r5);
        goto L_0x0149;
    L_0x00ab:
        r0 = r5 instanceof com.tinder.domain.recs.model.RecsUpdate.Insert;
        if (r0 == 0) goto L_0x00f0;
    L_0x00af:
        r0 = r4.f52560d;
        if (r0 == 0) goto L_0x00c4;
    L_0x00b3:
        r0 = r4.f52560d;
        if (r0 != 0) goto L_0x00ba;
    L_0x00b7:
        kotlin.jvm.internal.C2668g.a();
    L_0x00ba:
        r0 = r0.getCurrentRecs();
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x00d0;
    L_0x00c4:
        r0 = r4.f52557a;
        if (r0 != 0) goto L_0x00cd;
    L_0x00c8:
        r1 = "target";
        kotlin.jvm.internal.C2668g.b(r1);
    L_0x00cd:
        r0.insertHeader();
    L_0x00d0:
        r0 = r4.f52557a;
        if (r0 != 0) goto L_0x00d9;
    L_0x00d4:
        r1 = "target";
        kotlin.jvm.internal.C2668g.b(r1);
    L_0x00d9:
        r1 = r5.getPosition();
        r2 = r4.f52562f;
        r3 = r5.getModifiedRecs();
        r2 = r2.createCards(r3);
        r3 = "cardFactory.createCards(recsUpdate.modifiedRecs)";
        kotlin.jvm.internal.C2668g.a(r2, r3);
        r0.insertRecs(r1, r2);
        goto L_0x0149;
    L_0x00f0:
        r0 = r5 instanceof com.tinder.domain.recs.model.RecsUpdate.ClearAll;
        if (r0 == 0) goto L_0x0101;
    L_0x00f4:
        r0 = r4.f52557a;
        if (r0 != 0) goto L_0x00fd;
    L_0x00f8:
        r1 = "target";
        kotlin.jvm.internal.C2668g.b(r1);
    L_0x00fd:
        r0.clearRecs();
        goto L_0x0149;
    L_0x0101:
        r0 = r5 instanceof com.tinder.domain.recs.model.RecsUpdate.Rewind;
        if (r0 == 0) goto L_0x0145;
    L_0x0105:
        if (r5 != 0) goto L_0x010f;
    L_0x0107:
        r5 = new kotlin.TypeCastException;
        r0 = "null cannot be cast to non-null type com.tinder.domain.recs.model.RecsUpdate.Rewind";
        r5.<init>(r0);
        throw r5;
    L_0x010f:
        r0 = r5;
        r0 = (com.tinder.domain.recs.model.RecsUpdate.Rewind) r0;
        r1 = r0.getSwipe();
        r2 = r4.f52562f;
        r3 = r1.getRec();
        r2 = r2.createCard(r3);
        r3 = "card";
        kotlin.jvm.internal.C2668g.a(r2, r3);
        r3 = 1;
        r2.setShowRevertIndicator(r3);
        r1 = r1.getType();
        r1 = r4.m62894a(r1);
        r2.setAppearingAnimation(r1);
        r1 = r4.f52557a;
        if (r1 != 0) goto L_0x013d;
    L_0x0138:
        r3 = "target";
        kotlin.jvm.internal.C2668g.b(r3);
    L_0x013d:
        r0 = r0.getPosition();
        r1.postInsertRec(r0, r2);
        goto L_0x0149;
    L_0x0145:
        r0 = r5 instanceof com.tinder.domain.recs.model.RecsUpdate.RewindCancel;
        if (r0 == 0) goto L_0x014c;
    L_0x0149:
        r4.f52560d = r5;
        return;
    L_0x014c:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Recs update not handled: ";
        r1.append(r2);
        r1.append(r5);
        r5 = r1.toString();
        r0.<init>(r5);
        r0 = (java.lang.Throwable) r0;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.toppicks.presenter.e.b(com.tinder.domain.recs.model.RecsUpdate):void");
    }

    /* renamed from: a */
    private final C3960g<Ended> m62897a(Ended ended) {
        if (m62915b(ended)) {
            ended = m62896a(ended.getSwipe(), ended).a(ended);
            C2668g.a(ended, "rewindSwipeBeforeTeasers…efault(swipeRatingStatus)");
            return ended;
        }
        ended = C3960g.a(ended);
        C2668g.a(ended, "Single.just(swipeRatingStatus)");
        return ended;
    }

    /* renamed from: c */
    private final void m62917c(RecsUpdate recsUpdate) {
        int i = 0;
        if (this.f52561e || m62906a(recsUpdate)) {
            if (this.f52561e) {
                Collection arrayList = new ArrayList();
                for (Object next : recsUpdate.getCurrentRecs()) {
                    if ((((Rec) next).getType() == RecType.TOP_PICK ? 1 : null) != null) {
                        arrayList.add(next);
                    }
                }
                this.f52579w.execute(((List) arrayList).size());
            }
            return;
        }
        if (recsUpdate instanceof Consume) {
            i = 1;
        } else if (recsUpdate instanceof Remove) {
            i = recsUpdate.getModifiedRecs().size();
        }
        if (i > 0) {
            this.f52571o.execute(i);
        }
    }

    /* renamed from: d */
    private final void m62922d(RecsUpdate recsUpdate) {
        if (this.f52561e) {
            if (m62924e(recsUpdate) <= null) {
                recsUpdate = null;
                this.f52570n.execute(new Request(recsUpdate)).b(C15756a.m59010b()).a(ae.f52530a, af.f52531a);
            }
        }
        recsUpdate = true;
        this.f52570n.execute(new Request(recsUpdate)).b(C15756a.m59010b()).a(ae.f52530a, af.f52531a);
    }

    @UiThread
    /* renamed from: r */
    private final void m62930r() {
        this.f52559c.add(this.f52563g.observe().a(new C17081z(this)).a(new aa(this), ab.f52527a));
    }

    @WorkerThread
    /* renamed from: a */
    private final void m62900a(TopPicksResponse topPicksResponse) {
        this.f52568l.execute(new TopPicksSession(topPicksResponse.getRefreshTime(), m62923d(topPicksResponse), m62920c(topPicksResponse), topPicksResponse.getHasTpsAvailableForPurchase(), topPicksResponse.isTopPicksEnd()));
    }

    @WorkerThread
    /* renamed from: b */
    private final void m62912b(TopPicksResponse topPicksResponse) {
        if (!m62920c(topPicksResponse)) {
            if (m62923d(topPicksResponse) == null) {
                this.f52572p.m57290a();
            }
        }
    }

    /* renamed from: c */
    private final boolean m62920c(TopPicksResponse topPicksResponse) {
        if (topPicksResponse.getTeasersCount() <= null) {
            return (((Collection) m62932t()).isEmpty() ^ 1) != null;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    private final boolean m62923d(TopPicksResponse topPicksResponse) {
        if (topPicksResponse.isTopPicksEnd()) {
            if (topPicksResponse.getRecsCount() > null) {
                return true;
            }
            if (m62924e(this.f52560d) > null) {
                return true;
            }
        } else if (topPicksResponse.getCount() > null) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private final int m62931s() {
        RecsUpdate recsUpdate = this.f52560d;
        if (recsUpdate != null) {
            List currentRecs = recsUpdate.getCurrentRecs();
            if (currentRecs != null) {
                return currentRecs.size();
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final C8361a m62894a(Type type) {
        switch (C15287f.f47425a[type.ordinal()]) {
            case 1:
                return (C8361a) new C10456e();
            case 2:
                return (C8361a) new C12645c();
            case 3:
                return (C8361a) new C10458g();
            default:
                return null;
        }
    }

    /* renamed from: b */
    private final C8361a m62909b(Type type) {
        switch (C15287f.f47426b[type.ordinal()]) {
            case 1:
                return (C8361a) new C10455d();
            case 2:
                return (C8361a) new C12644b();
            case 3:
                return (C8361a) new C10457f();
            default:
                return null;
        }
    }

    @WorkerThread
    /* renamed from: e */
    private final void m62925e(TopPicksResponse topPicksResponse) {
        if (topPicksResponse.getHasTpsAvailableForPurchase() != null) {
            this.f52559c.add(this.f52576t.m62834a(new C15276a(ScheduleTopPicksNotification$Reason.TOP_PICKS_GRID)).b(C15756a.m59010b()).a(C17074s.f52549a, C17075t.f52550a));
        }
    }

    /* renamed from: e */
    private final int m62924e(RecsUpdate recsUpdate) {
        if (recsUpdate != null) {
            recsUpdate = recsUpdate.getCurrentRecs();
            if (recsUpdate != null) {
                Collection arrayList = new ArrayList();
                for (Object next : (Iterable) recsUpdate) {
                    if (((Rec) next) instanceof TopPickUserRec) {
                        arrayList.add(next);
                    }
                }
                return ((List) arrayList).size();
            }
        }
        return null;
    }

    /* renamed from: t */
    private final List<Rec> m62932t() {
        RecsUpdate recsUpdate = this.f52560d;
        if (recsUpdate != null) {
            List currentRecs = recsUpdate.getCurrentRecs();
            if (currentRecs != null) {
                Collection arrayList = new ArrayList();
                for (Object next : currentRecs) {
                    if (((Rec) next) instanceof TopPickTeaserRec) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
        }
        return C17554o.m64195a();
    }

    /* renamed from: u */
    private final List<TopPickUserRec> m62933u() {
        RecsUpdate recsUpdate = this.f52560d;
        if (recsUpdate != null) {
            List currentRecs = recsUpdate.getCurrentRecs();
            if (currentRecs != null) {
                currentRecs = C19297v.m68737a(currentRecs, TopPickUserRec.class);
                if (currentRecs != null) {
                    Collection arrayList = new ArrayList();
                    for (Object next : currentRecs) {
                        if ((((TopPickUserRec) next).getExpirationTime() < ((Number) this.f52574r.invoke()).longValue() ? 1 : null) != null) {
                            arrayList.add(next);
                        }
                    }
                    return (List) arrayList;
                }
            }
        }
        return C17554o.m64195a();
    }

    /* renamed from: a */
    private final boolean m62907a(@NotNull SwipeRatingStatus swipeRatingStatus) {
        return C2668g.a(swipeRatingStatus.getSwipe().getRec().getSource(), TopPicks.INSTANCE);
    }

    /* renamed from: b */
    private final boolean m62915b(@NotNull Ended ended) {
        switch (C15287f.f47427c[ended.getSwipe().getType().ordinal()]) {
            case 1:
            case 2:
                if (ended.getRatingResult() != RatingResult.SUCCESSFUL) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    private final C3956a m62896a(Swipe swipe, Ended ended) {
        return RxJavaInteropExtKt.toV2Completable(this.f52558b.rewindSwipeToSelectedPosition(swipe, new TopPicksGridRecsPresenter$rewindSwipeBeforeTeasers$1(this), RewindReason.Companion.fromEndedRatingStatus(ended)));
    }

    /* renamed from: c */
    private final void m62918c(Ended ended) {
        switch (C15287f.f47430f[ended.getSwipe().getType().ordinal()]) {
            case 1:
                this.f52580x.notify(SuperLikeRatingStatus.ENDED);
                switch (C15287f.f47428d[ended.getRatingResult().ordinal()]) {
                    case 1:
                        ended = this.f52557a;
                        if (ended == null) {
                            C2668g.b("target");
                        }
                        ended.showSuperLikeNetworkError();
                        return;
                    case 2:
                        TopPicksGridRecsTarget topPicksGridRecsTarget = this.f52557a;
                        if (topPicksGridRecsTarget == null) {
                            C2668g.b("target");
                        }
                        topPicksGridRecsTarget.showSuperLikePaywall(ended.getSwipe().getRec());
                        return;
                    case 3:
                        RecsUpdate recsUpdate = this.f52560d;
                        if (recsUpdate != null) {
                            m62922d(recsUpdate);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 2:
                switch (C15287f.f47429e[ended.getRatingResult().ordinal()]) {
                    case 1:
                    case 2:
                        ended = this.f52557a;
                        if (ended == null) {
                            C2668g.b("target");
                        }
                        ended.showGenericError();
                        return;
                    default:
                        return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    private final SwipeActionContext m62895a(@NotNull SwipeOrigin swipeOrigin) {
        switch (C15287f.f47431g[swipeOrigin.ordinal()]) {
            case 1:
                return C15288g.f47433b;
            case 2:
                return C15288g.f47432a;
            default:
                throw ((Throwable) new IllegalArgumentException("Invalid Swipe origin for Grid"));
        }
    }

    /* renamed from: a */
    private final int m62893a(List<? extends Rec> list, int i) {
        int i2 = 0;
        for (Rec type : list) {
            if ((type.getType() == RecType.TOP_PICKS_TEASER ? 1 : null) != null) {
                break;
            }
            i2++;
        }
        i2 = -1;
        return i2 < 0 ? i : Math.min(i, i2);
    }
}
