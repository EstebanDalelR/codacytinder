package com.tinder.places.recs.presenter;

import android.support.annotation.UiThread;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.p180a.C10455d;
import com.tinder.cardstack.p180a.C10456e;
import com.tinder.cardstack.p180a.C10457f;
import com.tinder.cardstack.p180a.C10458g;
import com.tinder.cardstack.p180a.C12644b;
import com.tinder.cardstack.p180a.C12645c;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.Screen.C10690i;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.model.Match.Attribution;
import com.tinder.domain.match.provider.NewMatchProvider;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.PlacesRepository.PlaceVisitorInfo;
import com.tinder.domain.places.model.PlacesConfig;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.domain.recs.model.RatingResult;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecSource;
import com.tinder.domain.recs.model.RecSource.Places;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsLoadingStatus.FetchFailedNoConnection;
import com.tinder.domain.recs.model.RecsLoadingStatus.Loading;
import com.tinder.domain.recs.model.RecsLoadingStatus.LoadingMore;
import com.tinder.domain.recs.model.RecsLoadingStatus.Uninitialized;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.domain.recs.model.RecsUpdate.ClearAll;
import com.tinder.domain.recs.model.RecsUpdate.Consume;
import com.tinder.domain.recs.model.RecsUpdate.Insert;
import com.tinder.domain.recs.model.RecsUpdate.Remove;
import com.tinder.domain.recs.model.RecsUpdate.Rewind;
import com.tinder.domain.recs.model.RecsUpdate.RewindCancel;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.SwipeActionContext;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.SwipeOrigin;
import com.tinder.domain.recs.model.SwipeRatingStatus;
import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import com.tinder.domain.recs.model.SwipeTerminationEvent;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.places.analytics.C10116f;
import com.tinder.places.analytics.C10119i;
import com.tinder.places.card.presenter.C10133f;
import com.tinder.places.p311f.C12339d;
import com.tinder.places.p311f.C12341f;
import com.tinder.places.p311f.C12343h;
import com.tinder.places.recs.target.PlacesRecsGridTarget;
import com.tinder.places.recs.target.PlacesRecsGridTarget.C10281a;
import com.tinder.places.viewmodel.PlaceColor;
import com.tinder.recs.RecsCardFactory;
import com.tinder.recs.domain.model.RewindReason;
import com.tinder.recs.domain.model.RewindReason.Companion;
import com.tinder.recs.rule.LocalOutOfLikesBouncerRule;
import com.tinder.recsgrid.C14782d;
import com.tinder.recsgrid.C14783e;
import com.tinder.recsgrid.ScrollStatusNotifier;
import com.tinder.recsgrid.ScrollStatusProvider;
import com.tinder.views.grid.p449a.C15453a;
import com.tinder.views.grid.p450b.C15455a;
import com.tinder.views.grid.p450b.C15455a.C15454a;
import com.tinder.views.grid.presenter.RecsGridPresenter;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Single;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0002\u0010$J\b\u0010>\u001a\u00020?H\u0007J\u0012\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u00020CH\u0002J\u0012\u0010D\u001a\u0004\u0018\u00010A2\u0006\u0010B\u001a\u00020CH\u0002J\f\u0010E\u001a\b\u0012\u0004\u0012\u00020&0FJ\u0010\u0010G\u001a\u00020?2\u0006\u0010H\u001a\u00020IH\u0003J\u0010\u0010J\u001a\u00020?2\u0006\u0010K\u001a\u00020LH\u0002J\u0010\u0010M\u001a\u00020?2\u0006\u0010N\u001a\u00020,H\u0003J\u0010\u0010O\u001a\u00020?2\u0006\u0010P\u001a\u00020QH\u0002J\u0018\u0010R\u001a\u00020?2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020TH\u0007J\u0010\u0010V\u001a\u00020?2\u0006\u0010W\u001a\u00020XH\u0002J\u0018\u0010Y\u001a\u00020?2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]H\u0017J\b\u0010^\u001a\u00020?H\u0002J\b\u0010\u0014\u001a\u00020?H\u0007J\b\u0010_\u001a\u00020?H\u0007J\b\u0010`\u001a\u00020<H\u0002J\u000e\u0010a\u001a\b\u0012\u0004\u0012\u00020,0bH\u0002J\u0018\u0010c\u001a\u00020?2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]H\u0017J\b\u0010d\u001a\u00020?H\u0007J\u0018\u0010e\u001a\u00020?2\u0006\u0010f\u001a\u00020<2\b\u0010g\u001a\u0004\u0018\u00010&J\b\u0010h\u001a\u00020?H\u0007J\u0006\u0010i\u001a\u00020?J\r\u0010j\u001a\u00020?H\u0001¢\u0006\u0002\bkJ\b\u0010l\u001a\u00020?H\u0003J\b\u0010m\u001a\u00020?H\u0003J\b\u0010n\u001a\u00020?H\u0003J\b\u0010o\u001a\u00020?H\u0003J\b\u0010p\u001a\u00020?H\u0003J\b\u0010q\u001a\u00020?H\u0003J\b\u0010r\u001a\u00020?H\u0003J\u0018\u0010s\u001a\u00020?2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]H\u0017J\r\u0010t\u001a\u00020?H\u0001¢\u0006\u0002\buJ\f\u0010v\u001a\u00020w*\u00020]H\u0002J\f\u0010x\u001a\u00020y*\u00020QH\u0002J\f\u0010z\u001a\u00020y*\u00020QH\u0002R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010/\u001a\u0002008BX\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b1\u00102R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001e\u00105\u001a\u0002068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0012\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u0004\n\u0002\u0010=R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006{"}, d2 = {"Lcom/tinder/places/recs/presenter/PlacesRecsGridPresenter;", "Lcom/tinder/views/grid/presenter/RecsGridPresenter;", "cardFactory", "Lcom/tinder/recs/RecsCardFactory;", "recSource", "Lcom/tinder/domain/recs/model/RecSource;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "ratingProcessor", "Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;", "userRecPhotoAlbumProvider", "Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider;", "newMatchProvider", "Lcom/tinder/domain/match/provider/NewMatchProvider;", "scrollStatusNotifier", "Lcom/tinder/recsgrid/ScrollStatusNotifier;", "scrollStatusProvider", "Lcom/tinder/recsgrid/ScrollStatusProvider;", "recPrefetcher", "Lcom/tinder/recsgrid/RecPrefetcher;", "markPlaceRecsViewed", "Lcom/tinder/places/usecase/MarkPlaceRecsViewed;", "addPlacesViewRecEvent", "Lcom/tinder/places/analytics/AddPlacesViewRecEvent;", "getPlaceVisitorInfo", "Lcom/tinder/places/usecase/GetPlaceVisitorInfo;", "addPlacesRecentPlaceCloseEvent", "Lcom/tinder/places/analytics/AddPlacesRecentPlaceCloseEvent;", "currentScreenNotifier", "Lcom/tinder/common/navigation/CurrentScreenNotifier;", "localOutOfLikesBouncerRule", "Lcom/tinder/recs/rule/LocalOutOfLikesBouncerRule;", "placesConfigProvider", "Lcom/tinder/domain/places/PlacesConfigProvider;", "markPlacesRecsTutorialAsSeen", "Lcom/tinder/places/usecase/MarkPlacesRecsTutorialAsSeen;", "(Lcom/tinder/recs/RecsCardFactory;Lcom/tinder/domain/recs/model/RecSource;Lcom/tinder/domain/recs/RecsEngineRegistry;Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider;Lcom/tinder/domain/match/provider/NewMatchProvider;Lcom/tinder/recsgrid/ScrollStatusNotifier;Lcom/tinder/recsgrid/ScrollStatusProvider;Lcom/tinder/recsgrid/RecPrefetcher;Lcom/tinder/places/usecase/MarkPlaceRecsViewed;Lcom/tinder/places/analytics/AddPlacesViewRecEvent;Lcom/tinder/places/usecase/GetPlaceVisitorInfo;Lcom/tinder/places/analytics/AddPlacesRecentPlaceCloseEvent;Lcom/tinder/common/navigation/CurrentScreenNotifier;Lcom/tinder/recs/rule/LocalOutOfLikesBouncerRule;Lcom/tinder/domain/places/PlacesConfigProvider;Lcom/tinder/places/usecase/MarkPlacesRecsTutorialAsSeen;)V", "centeredRec", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "lastRecsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "placeId", "", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "getRecsEngine", "()Lcom/tinder/domain/recs/RecsEngine;", "recsEngine$delegate", "Lkotlin/Lazy;", "target", "Lcom/tinder/places/recs/target/PlacesRecsGridTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/recs/target/PlacesRecsGridTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/recs/target/PlacesRecsGridTarget;)V", "totalVisitorsAtStart", "", "Ljava/lang/Integer;", "addPlaceCloseEvent", "", "getAnimationForRewind", "Lcom/tinder/cardstack/animation/SwipeAnimation;", "type", "Lcom/tinder/domain/recs/model/Swipe$Type;", "getAnimationForSwipeType", "getCurrentRecsTeaserImages", "", "handleLoadingStatus", "loadingStatus", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "handleLocalOutOfLikesBouncerRule", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "handleRecsUpdate", "recsUpdate", "handleRewoundSwipeRatingStatus", "swipeRatingStatus", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "handleScrollProgress", "progress", "", "velocity", "handleSwipeTerminationEvent", "swipeTerminationEvent", "Lcom/tinder/domain/recs/model/SwipeTerminationEvent;", "likeOnRec", "rec", "Lcom/tinder/domain/recs/model/Rec;", "origin", "Lcom/tinder/domain/recs/model/SwipeOrigin;", "loadMoreRecs", "notifyPlacesRecsAsCurrentScreen", "numberOfRecs", "observeRecsUpdates", "Lrx/Observable;", "passOnRec", "reset", "setCenteredRec", "position", "recId", "setupColor", "showPlacesRecsTutorialIfNeeded", "subscribe", "subscribe$Tinder_release", "subscribeToLoadingStatus", "subscribeToNewMatches", "subscribeToOutOfLikesBouncerRule", "subscribeToPrefetch", "subscribeToRecsUpdates", "subscribeToSwipeRatingStatus", "subscribeToSwipeTerminationEvents", "superlikeOnRec", "unsubscribe", "unsubscribe$Tinder_release", "getActionContext", "Lcom/tinder/domain/recs/model/Swipe$SwipeActionContext;", "isPlacesMatch", "", "shouldRewind", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.recs.presenter.a */
public final class C12433a implements RecsGridPresenter {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f40090a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C12433a.class), "recsEngine", "getRecsEngine()Lcom/tinder/domain/recs/RecsEngine;"))};
    @DeadshotTarget
    @NotNull
    /* renamed from: b */
    public PlacesRecsGridTarget f40091b;
    /* renamed from: c */
    private final Lazy f40092c = C18451c.a(new PlacesRecsGridPresenter$recsEngine$2(this));
    /* renamed from: d */
    private final C19573b f40093d = new C19573b();
    /* renamed from: e */
    private final C17356a f40094e = new C17356a();
    /* renamed from: f */
    private final long f40095f;
    /* renamed from: g */
    private RecsUpdate f40096g;
    /* renamed from: h */
    private String f40097h;
    /* renamed from: i */
    private final RecsCardFactory f40098i;
    /* renamed from: j */
    private final RecSource f40099j;
    /* renamed from: k */
    private final RecsEngineRegistry f40100k;
    /* renamed from: l */
    private final RatingProcessor f40101l;
    /* renamed from: m */
    private final C15453a f40102m;
    /* renamed from: n */
    private final NewMatchProvider f40103n;
    /* renamed from: o */
    private final ScrollStatusNotifier f40104o;
    /* renamed from: p */
    private final ScrollStatusProvider f40105p;
    /* renamed from: q */
    private final C14782d f40106q;
    /* renamed from: r */
    private final C12341f f40107r;
    /* renamed from: s */
    private final C10119i f40108s;
    /* renamed from: t */
    private final C12339d f40109t;
    /* renamed from: u */
    private final C10116f f40110u;
    /* renamed from: v */
    private final CurrentScreenNotifier f40111v;
    /* renamed from: w */
    private final LocalOutOfLikesBouncerRule f40112w;
    /* renamed from: x */
    private final PlacesConfigProvider f40113x;
    /* renamed from: y */
    private final C12343h f40114y;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/Swipe;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$j */
    static final class C12426j<T> implements Consumer<Swipe> {
        /* renamed from: a */
        final /* synthetic */ C12433a f40083a;

        C12426j(C12433a c12433a) {
            this.f40083a = c12433a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48865a((Swipe) obj);
        }

        /* renamed from: a */
        public final void m48865a(Swipe swipe) {
            C12433a c12433a = this.f40083a;
            C2668g.a(swipe, "it");
            c12433a.m48877a(swipe);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$k */
    static final class C12427k<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12427k f40084a = new C12427k();

        C12427k() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48866a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48866a(Throwable th) {
            C0001a.c(th, "Error with LocalOutOfLikesBouncerRule", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/recsgrid/ScrollStatus;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$l */
    static final class C12428l<T> implements Predicate<C14783e> {
        /* renamed from: a */
        final /* synthetic */ C12433a f40085a;

        C12428l(C12433a c12433a) {
            this.f40085a = c12433a;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48867a((C14783e) obj);
        }

        /* renamed from: a */
        public final boolean m48867a(@NotNull C14783e c14783e) {
            C2668g.b(c14783e, "it");
            return this.f40085a.f40106q.a(c14783e.a(), c14783e.b(), this.f40085a.m48899l());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/recsgrid/ScrollStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$m */
    static final class C12429m<T> implements Consumer<C14783e> {
        /* renamed from: a */
        final /* synthetic */ C12433a f40086a;

        C12429m(C12433a c12433a) {
            this.f40086a = c12433a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48868a((C14783e) obj);
        }

        /* renamed from: a */
        public final void m48868a(C14783e c14783e) {
            this.f40086a.m48900m();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$n */
    static final class C12430n<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12430n f40087a = new C12430n();

        C12430n() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48869a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48869a(Throwable th) {
            C0001a.c(th, "failed to observe scroll status", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeTerminationEvent;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$u */
    static final class C12431u<T> implements Consumer<SwipeTerminationEvent> {
        /* renamed from: a */
        final /* synthetic */ C12433a f40088a;

        C12431u(C12433a c12433a) {
            this.f40088a = c12433a;
        }

        public /* synthetic */ void accept(Object obj) {
            m48870a((SwipeTerminationEvent) obj);
        }

        /* renamed from: a */
        public final void m48870a(SwipeTerminationEvent swipeTerminationEvent) {
            C12433a c12433a = this.f40088a;
            C2668g.a(swipeTerminationEvent, "it");
            c12433a.m48878a(swipeTerminationEvent);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$v */
    static final class C12432v<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12432v f40089a = new C12432v();

        C12432v() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48871a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48871a(Throwable th) {
            C0001a.c(th, "Error with subscribing to termination events", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$g */
    static final class C13600g<T, R> implements Func1<Match, Boolean> {
        /* renamed from: a */
        public static final C13600g f43351a = new C13600g();

        C13600g() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m53062a((Match) obj));
        }

        /* renamed from: a */
        public final boolean m53062a(Match match) {
            return match.getAttribution() == Attribution.FAST_MATCH ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$q */
    static final class C13601q<T, R> implements Func1<SwipeRatingStatus, Boolean> {
        /* renamed from: a */
        public static final C13601q f43352a = new C13601q();

        C13601q() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m53063a((SwipeRatingStatus) obj));
        }

        /* renamed from: a */
        public final boolean m53063a(SwipeRatingStatus swipeRatingStatus) {
            return swipeRatingStatus instanceof Ended;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$r */
    static final class C13602r<T, R> implements Func1<Ended, Boolean> {
        /* renamed from: a */
        final /* synthetic */ C12433a f43353a;

        C13602r(C12433a c12433a) {
            this.f43353a = c12433a;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m53064a((Ended) obj));
        }

        /* renamed from: a */
        public final boolean m53064a(Ended ended) {
            C12433a c12433a = this.f43353a;
            C2668g.a(ended, "it");
            return c12433a.m48883a(ended);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$s */
    static final class C13603s<T, R> implements Func1<Ended, Boolean> {
        /* renamed from: a */
        final /* synthetic */ C12433a f43354a;

        C13603s(C12433a c12433a) {
            this.f43354a = c12433a;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m53065a((Ended) obj));
        }

        /* renamed from: a */
        public final boolean m53065a(Ended ended) {
            C12433a c12433a = this.f43354a;
            C2668g.a(ended, "it");
            return c12433a.m48887b(ended);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "kotlin.jvm.PlatformType", "it", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$t */
    static final class C13604t<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C12433a f43355a;

        C13604t(C12433a c12433a) {
            this.f43355a = c12433a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m53066a((Ended) obj);
        }

        /* renamed from: a */
        public final Single<Ended> m53066a(Ended ended) {
            RecsEngine f = this.f43355a.m48897j();
            Swipe swipe = ended.getSwipe();
            Companion companion = RewindReason.Companion;
            C2668g.a(ended, "it");
            return f.rewindSwipeToSwipedPosition(swipe, companion.fromEndedRatingStatus(ended)).b(ended);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "info", "Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$a */
    static final class C14223a<T> implements Action1<PlaceVisitorInfo> {
        /* renamed from: a */
        final /* synthetic */ C12433a f45073a;

        C14223a(C12433a c12433a) {
            this.f45073a = c12433a;
        }

        public /* synthetic */ void call(Object obj) {
            m53982a((PlaceVisitorInfo) obj);
        }

        /* renamed from: a */
        public final void m53982a(PlaceVisitorInfo placeVisitorInfo) {
            this.f45073a.f40110u.m41352a(String.valueOf(this.f45073a.f40095f), Integer.valueOf(placeVisitorInfo.getTotalVisitors()));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$b */
    static final class C14224b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14224b f45074a = new C14224b();

        C14224b() {
        }

        public /* synthetic */ void call(Object obj) {
            m53983a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53983a(Throwable th) {
            C0001a.c(th, "getPlaceVisitorInfo failed", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$c */
    static final class C14225c implements Action0 {
        /* renamed from: a */
        public static final C14225c f45075a = new C14225c();

        C14225c() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$d */
    static final class C14226d<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ String f45076a;

        C14226d(String str) {
            this.f45076a = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53984a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53984a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error marking place ");
            stringBuilder.append(this.f45076a);
            stringBuilder.append("'s recs as viewed");
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$e */
    static final class C14227e<T> implements Action1<RecsLoadingStatus> {
        /* renamed from: a */
        final /* synthetic */ C12433a f45077a;

        C14227e(C12433a c12433a) {
            this.f45077a = c12433a;
        }

        public /* synthetic */ void call(Object obj) {
            m53985a((RecsLoadingStatus) obj);
        }

        /* renamed from: a */
        public final void m53985a(RecsLoadingStatus recsLoadingStatus) {
            C12433a c12433a = this.f45077a;
            C2668g.a(recsLoadingStatus, "it");
            c12433a.m48875a(recsLoadingStatus);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$f */
    static final class C14228f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14228f f45078a = new C14228f();

        C14228f() {
        }

        public /* synthetic */ void call(Object obj) {
            m53986a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53986a(Throwable th) {
            C0001a.c(th, "Unable to get Loading state update", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "match", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$h */
    static final class C14229h<T> implements Action1<Match> {
        /* renamed from: a */
        final /* synthetic */ C12433a f45079a;

        C14229h(C12433a c12433a) {
            this.f45079a = c12433a;
        }

        public /* synthetic */ void call(Object obj) {
            m53987a((Match) obj);
        }

        /* renamed from: a */
        public final void m53987a(Match match) {
            C15454a c15454a = C15455a.f47881a;
            C2668g.a(match, "match");
            match = c15454a.a(match);
            if (match != null) {
                this.f45079a.m48908a().showNotification(match);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$i */
    static final class C14230i<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14230i f45080a = new C14230i();

        C14230i() {
        }

        public /* synthetic */ void call(Object obj) {
            m53988a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53988a(Throwable th) {
            C0001a.c(th, "Error showing places match notification for new match", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$o */
    static final class C14231o<T> implements Action1<RecsUpdate> {
        /* renamed from: a */
        final /* synthetic */ C12433a f45081a;

        C14231o(C12433a c12433a) {
            this.f45081a = c12433a;
        }

        public /* synthetic */ void call(Object obj) {
            m53989a((RecsUpdate) obj);
        }

        /* renamed from: a */
        public final void m53989a(RecsUpdate recsUpdate) {
            C12433a c12433a = this.f45081a;
            C2668g.a(recsUpdate, "it");
            c12433a.m48876a(recsUpdate);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.recs.presenter.a$p */
    static final class C14232p<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14232p f45082a = new C14232p();

        C14232p() {
        }

        public /* synthetic */ void call(Object obj) {
            m53990a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53990a(Throwable th) {
            C0001a.c(th, "Unable to observe Recs Update", new Object[0]);
        }
    }

    /* renamed from: j */
    private final RecsEngine m48897j() {
        Lazy lazy = this.f40092c;
        KProperty kProperty = f40090a[0];
        return (RecsEngine) lazy.getValue();
    }

    @Inject
    public C12433a(@NotNull RecsCardFactory recsCardFactory, @NotNull RecSource recSource, @NotNull RecsEngineRegistry recsEngineRegistry, @NotNull RatingProcessor ratingProcessor, @NotNull C15453a c15453a, @NotNull NewMatchProvider newMatchProvider, @NotNull ScrollStatusNotifier scrollStatusNotifier, @NotNull ScrollStatusProvider scrollStatusProvider, @NotNull C14782d c14782d, @NotNull C12341f c12341f, @NotNull C10119i c10119i, @NotNull C12339d c12339d, @NotNull C10116f c10116f, @NotNull CurrentScreenNotifier currentScreenNotifier, @NotNull LocalOutOfLikesBouncerRule localOutOfLikesBouncerRule, @NotNull PlacesConfigProvider placesConfigProvider, @NotNull C12343h c12343h) {
        C12433a c12433a = this;
        RecsCardFactory recsCardFactory2 = recsCardFactory;
        RecSource recSource2 = recSource;
        RecsEngineRegistry recsEngineRegistry2 = recsEngineRegistry;
        RatingProcessor ratingProcessor2 = ratingProcessor;
        C15453a c15453a2 = c15453a;
        NewMatchProvider newMatchProvider2 = newMatchProvider;
        ScrollStatusNotifier scrollStatusNotifier2 = scrollStatusNotifier;
        ScrollStatusProvider scrollStatusProvider2 = scrollStatusProvider;
        C14782d c14782d2 = c14782d;
        C12341f c12341f2 = c12341f;
        C10119i c10119i2 = c10119i;
        C12339d c12339d2 = c12339d;
        C10116f c10116f2 = c10116f;
        CurrentScreenNotifier currentScreenNotifier2 = currentScreenNotifier;
        LocalOutOfLikesBouncerRule localOutOfLikesBouncerRule2 = localOutOfLikesBouncerRule;
        PlacesConfigProvider placesConfigProvider2 = placesConfigProvider;
        C2668g.b(recsCardFactory2, "cardFactory");
        C2668g.b(recSource2, "recSource");
        C2668g.b(recsEngineRegistry2, "recsEngineRegistry");
        C2668g.b(ratingProcessor2, "ratingProcessor");
        C2668g.b(c15453a2, "userRecPhotoAlbumProvider");
        C2668g.b(newMatchProvider2, "newMatchProvider");
        C2668g.b(scrollStatusNotifier2, "scrollStatusNotifier");
        C2668g.b(scrollStatusProvider2, "scrollStatusProvider");
        C2668g.b(c14782d2, "recPrefetcher");
        C2668g.b(c12341f2, "markPlaceRecsViewed");
        C2668g.b(c10119i2, "addPlacesViewRecEvent");
        C2668g.b(c12339d2, "getPlaceVisitorInfo");
        C2668g.b(c10116f2, "addPlacesRecentPlaceCloseEvent");
        C2668g.b(currentScreenNotifier2, "currentScreenNotifier");
        C2668g.b(localOutOfLikesBouncerRule2, "localOutOfLikesBouncerRule");
        C2668g.b(placesConfigProvider, "placesConfigProvider");
        C2668g.b(c12343h, "markPlacesRecsTutorialAsSeen");
        PlacesConfigProvider placesConfigProvider3 = placesConfigProvider;
        this.f40098i = recsCardFactory2;
        this.f40099j = recSource2;
        this.f40100k = recsEngineRegistry2;
        this.f40101l = ratingProcessor2;
        this.f40102m = c15453a2;
        this.f40103n = newMatchProvider2;
        this.f40104o = scrollStatusNotifier2;
        this.f40105p = scrollStatusProvider2;
        this.f40106q = c14782d2;
        this.f40107r = c12341f2;
        this.f40108s = c10119i2;
        this.f40109t = c12339d2;
        this.f40110u = c10116f2;
        this.f40111v = currentScreenNotifier2;
        this.f40112w = localOutOfLikesBouncerRule;
        this.f40113x = placesConfigProvider3;
        this.f40114y = c12343h;
        RecSource recSource3 = this.f40099j;
        if (recSource3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.RecSource.Places");
        }
        c12433a.f40095f = ((Places) recSource3).getPlaceId();
    }

    @NotNull
    /* renamed from: a */
    public final PlacesRecsGridTarget m48908a() {
        PlacesRecsGridTarget placesRecsGridTarget = this.f40091b;
        if (placesRecsGridTarget == null) {
            C2668g.b("target");
        }
        return placesRecsGridTarget;
    }

    @Take
    /* renamed from: b */
    public final void m48911b() {
        m48897j().resume();
        m48906s();
        m48903p();
        m48902o();
        m48901n();
        m48898k();
        m48904q();
        m48905r();
    }

    @Take
    /* renamed from: c */
    public final void m48912c() {
        RecSource recSource = this.f40099j;
        if (!(recSource instanceof Places)) {
            recSource = null;
        }
        Places places = (Places) recSource;
        if (places != null) {
            PlacesRecsGridTarget placesRecsGridTarget = this.f40091b;
            if (placesRecsGridTarget == null) {
                C2668g.b("target");
            }
            placesRecsGridTarget.setColor(PlaceColor.Companion.a(places.getPlaceId()));
        }
    }

    @Take
    /* renamed from: d */
    public final void m48913d() {
        RecSource recSource = this.f40099j;
        if (recSource == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.RecSource.Places");
        }
        String valueOf = String.valueOf(((Places) recSource).getPlaceId());
        this.f40107r.m48724a(valueOf).b(Schedulers.io()).a(C14225c.f45075a, new C14226d(valueOf));
    }

    @Take
    /* renamed from: e */
    public final void m48914e() {
        this.f40111v.notify(C10690i.f35031a);
    }

    @UiThread
    /* renamed from: k */
    private final void m48898k() {
        this.f40094e.add(this.f40105p.observe().a(new C12428l(this)).a(new C12429m(this), C12430n.f40087a));
    }

    /* renamed from: l */
    private final int m48899l() {
        RecsUpdate recsUpdate = this.f40096g;
        if (recsUpdate != null) {
            List currentRecs = recsUpdate.getCurrentRecs();
            if (currentRecs != null) {
                return currentRecs.size();
            }
        }
        return 0;
    }

    @Drop
    /* renamed from: f */
    public final void m48915f() {
        m48897j().pause();
        this.f40093d.a();
        this.f40094e.a();
    }

    @Drop
    /* renamed from: g */
    public final void m48916g() {
        this.f40109t.m48722a(String.valueOf(this.f40095f)).h().a(new C14223a(this), C14224b.f45074a);
    }

    @UiThread
    public void likeOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeOrigin, "origin");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("likeOnRec ");
        stringBuilder.append(rec);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        PlacesRecsGridTarget placesRecsGridTarget = this.f40091b;
        if (placesRecsGridTarget == null) {
            C2668g.b("target");
        }
        placesRecsGridTarget.animateLike();
        m48897j().processLikeOnRec(rec, m48873a(swipeOrigin));
    }

    @UiThread
    public void passOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeOrigin, "origin");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("passOnRec ");
        stringBuilder.append(rec);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        m48897j().processPassOnRec(rec, m48873a(swipeOrigin));
    }

    @UiThread
    public void superlikeOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeOrigin, "origin");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("superlikeOnRec ");
        stringBuilder.append(rec);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        m48897j().processSuperlikeOnRec(rec, m48873a(swipeOrigin));
    }

    @UiThread
    /* renamed from: a */
    public final void m48909a(float f, float f2) {
        this.f40104o.notify(new C14783e(f, f2));
    }

    /* renamed from: m */
    private final void m48900m() {
        m48897j().loadMoreRecs();
    }

    @NotNull
    /* renamed from: h */
    public final List<String> m48917h() {
        RecsUpdate recsUpdate = this.f40096g;
        if (recsUpdate != null) {
            return C10133f.f33122b.m41434a(recsUpdate);
        }
        return C19301m.a();
    }

    /* renamed from: a */
    public final void m48910a(int i, @Nullable String str) {
        if ((C2668g.a(str, this.f40097h) ^ 1) != 0) {
            this.f40097h = str;
            this.f40108s.m41358a(String.valueOf(this.f40095f), str, i);
        }
    }

    /* renamed from: i */
    public final void m48918i() {
        PlacesConfig placesConfig = this.f40113x.get();
        if ((placesConfig.getHasSeenPlacesRecsTutorial() ^ 1) == 0) {
            placesConfig = null;
        }
        if (placesConfig != null) {
            PlacesRecsGridTarget placesRecsGridTarget = this.f40091b;
            if (placesRecsGridTarget == null) {
                C2668g.b("target");
            }
            placesRecsGridTarget.showTutorial();
            this.f40114y.execute();
        }
    }

    @UiThread
    /* renamed from: n */
    private final void m48901n() {
        this.f40093d.a(m48897j().observeLoadingStatusUpdates().a(C19397a.a()).a(new C14227e(this), C14228f.f45078a));
    }

    @UiThread
    /* renamed from: a */
    private final void m48875a(RecsLoadingStatus recsLoadingStatus) {
        boolean isEmpty;
        RecsUpdate recsUpdate = this.f40096g;
        if (recsUpdate != null) {
            List currentRecs = recsUpdate.getCurrentRecs();
            if (currentRecs != null) {
                isEmpty = currentRecs.isEmpty();
                if (isEmpty) {
                    if (C2668g.a(recsLoadingStatus, Uninitialized.INSTANCE)) {
                        if (!C2668g.a(recsLoadingStatus, Loading.INSTANCE)) {
                            if (C2668g.a(recsLoadingStatus, LoadingMore.INSTANCE)) {
                                recsLoadingStatus = this.f40091b;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.showLoadingMore();
                            } else if (C2668g.a(recsLoadingStatus, FetchFailedNoConnection.INSTANCE) == null) {
                                recsLoadingStatus = this.f40091b;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.showNoNetworkConnectionError();
                            } else {
                                recsLoadingStatus = this.f40091b;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                            }
                            return;
                        }
                    }
                    recsLoadingStatus = this.f40091b;
                    if (recsLoadingStatus == null) {
                        C2668g.b("target");
                    }
                    recsLoadingStatus.showRefreshing();
                    return;
                }
                recsLoadingStatus = this.f40091b;
                if (recsLoadingStatus == null) {
                    C2668g.b("target");
                }
                recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
            }
        }
        isEmpty = false;
        if (isEmpty) {
            if (C2668g.a(recsLoadingStatus, Uninitialized.INSTANCE)) {
                if (C2668g.a(recsLoadingStatus, Loading.INSTANCE)) {
                    if (C2668g.a(recsLoadingStatus, LoadingMore.INSTANCE)) {
                        recsLoadingStatus = this.f40091b;
                        if (recsLoadingStatus == null) {
                            C2668g.b("target");
                        }
                        recsLoadingStatus.showLoadingMore();
                    } else if (C2668g.a(recsLoadingStatus, FetchFailedNoConnection.INSTANCE) == null) {
                        recsLoadingStatus = this.f40091b;
                        if (recsLoadingStatus == null) {
                            C2668g.b("target");
                        }
                        recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                    } else {
                        recsLoadingStatus = this.f40091b;
                        if (recsLoadingStatus == null) {
                            C2668g.b("target");
                        }
                        recsLoadingStatus.showNoNetworkConnectionError();
                    }
                    return;
                }
            }
            recsLoadingStatus = this.f40091b;
            if (recsLoadingStatus == null) {
                C2668g.b("target");
            }
            recsLoadingStatus.showRefreshing();
            return;
        }
        recsLoadingStatus = this.f40091b;
        if (recsLoadingStatus == null) {
            C2668g.b("target");
        }
        recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
    }

    @UiThread
    /* renamed from: o */
    private final void m48902o() {
        this.f40093d.a(this.f40103n.observeNewMatches().a(Schedulers.io()).f(C13600g.f43351a).a(C19397a.a()).a(new C14229h(this), C14230i.f45080a));
    }

    @UiThread
    /* renamed from: p */
    private final void m48903p() {
        Observable a = this.f40101l.observeSwipeRatingStatus().a(Schedulers.io()).f(C13601q.f43352a).a(Ended.class).f(new C13602r(this)).f(new C13603s(this)).j(new C13604t(this)).a(C19397a.a());
        Action1 c14233d = new C14233d(new C14312x3380e508(this));
        Function1 function1 = C14313x3380e509.f45331a;
        if (function1 != null) {
            function1 = new C14233d(function1);
        }
        Subscription a2 = a.a(c14233d, (Action1) function1);
        this.f40093d.a(new Subscription[]{a2});
    }

    /* renamed from: a */
    private final boolean m48883a(@NotNull Ended ended) {
        return ended.getSwipe().getRec().getSource() instanceof Places;
    }

    /* renamed from: b */
    private final boolean m48887b(@NotNull Ended ended) {
        switch (C10276b.f33406a[ended.getSwipe().getType().ordinal()]) {
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

    /* renamed from: c */
    private final void m48889c(Ended ended) {
        C15455a a = C15455a.f47881a.a(ended.getSwipe().getRec());
        switch (C10276b.f33409d[ended.getSwipe().getType().ordinal()]) {
            case 1:
                switch (C10276b.f33407b[ended.getRatingResult().ordinal()]) {
                    case 1:
                        ended = this.f40091b;
                        if (ended == null) {
                            C2668g.b("target");
                        }
                        ended.showNotification(a);
                        return;
                    case 2:
                        PlacesRecsGridTarget placesRecsGridTarget = this.f40091b;
                        if (placesRecsGridTarget == null) {
                            C2668g.b("target");
                        }
                        placesRecsGridTarget.showSuperLikePaywall(ended.getSwipe().getRec());
                        return;
                    default:
                        return;
                }
            case 2:
                switch (C10276b.f33408c[ended.getRatingResult().ordinal()]) {
                    case 1:
                        ended = this.f40091b;
                        if (ended == null) {
                            C2668g.b("target");
                        }
                        ended.showNotification(a);
                        return;
                    case 2:
                        ended = this.f40091b;
                        if (ended == null) {
                            C2668g.b("target");
                        }
                        ended.showTinderGoldPaywall();
                        return;
                    default:
                        return;
                }
            default:
                return;
        }
    }

    @UiThread
    /* renamed from: q */
    private final void m48904q() {
        Observable observe = this.f40112w.observe();
        C2668g.a(observe, "localOutOfLikesBouncerRule\n            .observe()");
        this.f40094e.add(RxJavaInteropExtKt.toV2Observable(observe).observeOn(C15674a.a()).subscribe(new C12426j(this), C12427k.f40084a));
    }

    /* renamed from: a */
    private final void m48877a(Swipe swipe) {
        switch (C10276b.f33410e[swipe.getType().ordinal()]) {
            case 1:
                PlacesRecsGridTarget placesRecsGridTarget = this.f40091b;
                if (placesRecsGridTarget == null) {
                    C2668g.b("target");
                }
                placesRecsGridTarget.showSuperLikePaywall(swipe.getRec());
                return;
            case 2:
                swipe = this.f40091b;
                if (swipe == null) {
                    C2668g.b("target");
                }
                swipe.showTinderGoldPaywall();
                return;
            default:
                return;
        }
    }

    @UiThread
    /* renamed from: r */
    private final void m48905r() {
        this.f40094e.add(RxJavaInteropExtKt.toV2Observable(m48897j().observeSwipeTerminationEvents()).observeOn(C15674a.a()).subscribe(new C12431u(this), C12432v.f40089a));
    }

    /* renamed from: a */
    private final void m48878a(SwipeTerminationEvent swipeTerminationEvent) {
        switch (C10276b.f33411f[swipeTerminationEvent.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
            case 6:
                swipeTerminationEvent = this.f40098i.createCard(swipeTerminationEvent.getSwipe().getRec());
                PlacesRecsGridTarget placesRecsGridTarget = this.f40091b;
                if (placesRecsGridTarget == null) {
                    C2668g.b("target");
                }
                C2668g.a(swipeTerminationEvent, "card");
                placesRecsGridTarget.resetCardAnimation(swipeTerminationEvent);
                return;
            default:
                return;
        }
    }

    @UiThread
    /* renamed from: s */
    private final void m48906s() {
        this.f40093d.a(m48907t().a(C19397a.a()).a(new C14231o(this), C14232p.f45082a));
    }

    /* renamed from: t */
    private final Observable<RecsUpdate> m48907t() {
        if (this.f40096g == null) {
            return m48897j().observeRecsUpdates();
        }
        RecsEngine j = m48897j();
        RecsUpdate recsUpdate = this.f40096g;
        if (recsUpdate == null) {
            C2668g.a();
        }
        return j.observeRecsUpdatesSince(recsUpdate);
    }

    @UiThread
    /* renamed from: a */
    private final void m48876a(RecsUpdate recsUpdate) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("recs updates");
        stringBuilder.append(recsUpdate);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        if (recsUpdate != this.f40096g) {
            PlacesRecsGridTarget placesRecsGridTarget;
            List createCards;
            if (this.f40096g == null) {
                placesRecsGridTarget = this.f40091b;
                if (placesRecsGridTarget == null) {
                    C2668g.b("target");
                }
                placesRecsGridTarget.showCardGrid();
                placesRecsGridTarget = this.f40091b;
                if (placesRecsGridTarget == null) {
                    C2668g.b("target");
                }
                createCards = this.f40098i.createCards(recsUpdate.getCurrentRecs());
                C2668g.a(createCards, "cardFactory.createCards(recsUpdate.currentRecs)");
                placesRecsGridTarget.insertRecs(0, createCards);
                this.f40096g = recsUpdate;
                m48918i();
                return;
            }
            if (recsUpdate instanceof Consume) {
                int position = recsUpdate.getPosition();
                if (recsUpdate == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.RecsUpdate.Consume");
                }
                Consume consume = (Consume) recsUpdate;
                PlacesRecsGridTarget placesRecsGridTarget2 = this.f40091b;
                if (placesRecsGridTarget2 == null) {
                    C2668g.b("target");
                }
                placesRecsGridTarget2.removeRec(position, m48886b(consume.getSwipe().getType()));
            } else if (recsUpdate instanceof Remove) {
                placesRecsGridTarget = this.f40091b;
                if (placesRecsGridTarget == null) {
                    C2668g.b("target");
                }
                C10281a.m41677a(placesRecsGridTarget, recsUpdate.getPosition(), null, 2, null);
            } else if (recsUpdate instanceof Insert) {
                placesRecsGridTarget = this.f40091b;
                if (placesRecsGridTarget == null) {
                    C2668g.b("target");
                }
                int position2 = recsUpdate.getPosition();
                createCards = this.f40098i.createCards(recsUpdate.getModifiedRecs());
                C2668g.a(createCards, "cardFactory.createCards(recsUpdate.modifiedRecs)");
                placesRecsGridTarget.insertRecs(position2, createCards);
            } else if (recsUpdate instanceof ClearAll) {
                placesRecsGridTarget = this.f40091b;
                if (placesRecsGridTarget == null) {
                    C2668g.b("target");
                }
                placesRecsGridTarget.clearRecs();
            } else if (recsUpdate instanceof Rewind) {
                if (recsUpdate == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.RecsUpdate.Rewind");
                }
                Rewind rewind = (Rewind) recsUpdate;
                Swipe swipe = rewind.getSwipe();
                C8395a createCard = this.f40098i.createCard(swipe.getRec());
                C2668g.a(createCard, "card");
                createCard.setShowRevertIndicator(true);
                createCard.setAppearingAnimation(m48872a(swipe.getType()));
                PlacesRecsGridTarget placesRecsGridTarget3 = this.f40091b;
                if (placesRecsGridTarget3 == null) {
                    C2668g.b("target");
                }
                placesRecsGridTarget3.postInsertRec(rewind.getPosition(), createCard);
            } else if (!(recsUpdate instanceof RewindCancel)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Recs update not handled: ");
                stringBuilder2.append(recsUpdate);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
            this.f40096g = recsUpdate;
        }
    }

    /* renamed from: a */
    private final C8361a m48872a(Type type) {
        switch (C10276b.f33412g[type.ordinal()]) {
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
    private final C8361a m48886b(Type type) {
        switch (C10276b.f33413h[type.ordinal()]) {
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

    /* renamed from: a */
    private final SwipeActionContext m48873a(@NotNull SwipeOrigin swipeOrigin) {
        switch (C10276b.f33414i[swipeOrigin.ordinal()]) {
            case 1:
                return C10277c.f33416b;
            case 2:
                return C10277c.f33415a;
            default:
                throw ((Throwable) new IllegalArgumentException("Invalid Swipe origin for Grid"));
        }
    }
}
