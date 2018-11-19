package com.tinder.fastmatch.presenter;

import android.support.annotation.UiThread;
import com.tinder.cardstack.model.C8395a;
import com.tinder.cardstack.p180a.C10455d;
import com.tinder.cardstack.p180a.C10456e;
import com.tinder.cardstack.p180a.C10457f;
import com.tinder.cardstack.p180a.C10458g;
import com.tinder.cardstack.p180a.C12644b;
import com.tinder.cardstack.p180a.C12645c;
import com.tinder.cardstack.p180a.C8361a;
import com.tinder.data.fastmatch.usecase.C10770b;
import com.tinder.data.fastmatch.usecase.C8650a;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.fastmatch.RefreshNotifier;
import com.tinder.domain.fastmatch.RefreshNotifier.SourceType;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import com.tinder.domain.fastmatch.repository.FastMatchRecsResponseRepository;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.provider.NewMatchProvider;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.domain.recs.model.RatingResult;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecSource.FastMatch;
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
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.fastmatch.analytics.C11613a;
import com.tinder.fastmatch.analytics.C11618f;
import com.tinder.fastmatch.analytics.C9372g;
import com.tinder.fastmatch.analytics.LikesYouListEtlEventsFactory.PillResetSource;
import com.tinder.fastmatch.newcount.C9380a;
import com.tinder.fastmatch.p246f.C9379a;
import com.tinder.fastmatch.target.FastMatchRecsGridTarget;
import com.tinder.fastmatch.target.FastMatchRecsGridTarget.C9405a;
import com.tinder.module.FastMatchModule$FastMatchRecsEngine;
import com.tinder.recs.RecsCardFactory;
import com.tinder.recs.domain.model.RewindReason;
import com.tinder.recsgrid.C14782d;
import com.tinder.recsgrid.C14783e;
import com.tinder.recsgrid.ScrollStatusNotifier;
import com.tinder.recsgrid.ScrollStatusProvider;
import com.tinder.utils.RxUtils;
import com.tinder.views.grid.p449a.C15453a;
import com.tinder.views.grid.p450b.C15455a;
import com.tinder.views.grid.p450b.C15455a.C15454a;
import com.tinder.views.grid.presenter.RecsGridPresenter;
import io.reactivex.C3956a;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.SingleSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Subscription;
import p000a.p001a.C0001a;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B¡\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0002\u0010(J\b\u00103\u001a\u000204H\u0002J\u0012\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u000208H\u0002J\u0012\u00109\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020<H\u0003J\u0010\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020,H\u0003J\u0010\u0010?\u001a\u0002042\u0006\u0010@\u001a\u00020AH\u0002J\u0018\u0010B\u001a\u0002042\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020DH\u0007J\u0018\u0010F\u001a\u0002042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0017J\b\u0010K\u001a\u000204H\u0002J\u0006\u0010L\u001a\u000204J\b\u0010M\u001a\u00020NH\u0002J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020,0PH\u0002J\u0018\u0010Q\u001a\u0002042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0017J\b\u0010R\u001a\u000204H\u0007J\b\u0010S\u001a\u000204H\u0002J\r\u0010T\u001a\u000204H\u0001¢\u0006\u0002\bUJ\b\u0010V\u001a\u000204H\u0003J\b\u0010W\u001a\u000204H\u0003J\b\u0010X\u001a\u000204H\u0003J\b\u0010Y\u001a\u000204H\u0002J\r\u0010Z\u001a\u000204H\u0001¢\u0006\u0002\b[J\b\u0010\\\u001a\u000204H\u0003J\b\u0010]\u001a\u000204H\u0003J\u0018\u0010^\u001a\u0002042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0017J\r\u0010_\u001a\u000204H\u0001¢\u0006\u0002\b`J\f\u0010a\u001a\u00020b*\u00020JH\u0002J\f\u0010c\u001a\u00020d*\u00020eH\u0002J\f\u0010f\u001a\u00020d*\u00020AH\u0002R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u00020.8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000¨\u0006g"}, d2 = {"Lcom/tinder/fastmatch/presenter/FastMatchRecsGridPresenter;", "Lcom/tinder/views/grid/presenter/RecsGridPresenter;", "cardFactory", "Lcom/tinder/recs/RecsCardFactory;", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "decrementFastMatchCount", "Lcom/tinder/data/fastmatch/usecase/DecrementFastMatchCount;", "fetchFastMatchCount", "Lcom/tinder/data/fastmatch/usecase/FetchFastMatchCount;", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "ratingProcessor", "Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;", "fastMatchSessionManager", "Lcom/tinder/fastmatch/analytics/FastMatchSessionManager;", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "markFastMatchTutorialAsSeen", "Lcom/tinder/fastmatch/usecase/MarkFastMatchTutorialAsSeen;", "addLikesYouConnectionFailEvent", "Lcom/tinder/fastmatch/analytics/AddLikesYouConnectionFailEvent;", "userRecPhotoAlbumProvider", "Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider;", "refreshNotifier", "Lcom/tinder/domain/fastmatch/RefreshNotifier;", "newMatchProvider", "Lcom/tinder/domain/match/provider/NewMatchProvider;", "addNewLikesYouPillResetEvent", "Lcom/tinder/fastmatch/analytics/AddLikesYouPillResetEvent;", "fastMatchNewCountAbTestResolver", "Lcom/tinder/fastmatch/newcount/FastMatchNewCountAbTestResolver;", "fastMatchRecsResponseRepository", "Lcom/tinder/domain/fastmatch/repository/FastMatchRecsResponseRepository;", "scrollStatusNotifier", "Lcom/tinder/recsgrid/ScrollStatusNotifier;", "scrollStatusProvider", "Lcom/tinder/recsgrid/ScrollStatusProvider;", "recPrefetcher", "Lcom/tinder/recsgrid/RecPrefetcher;", "(Lcom/tinder/recs/RecsCardFactory;Lcom/tinder/domain/recs/RecsEngine;Lcom/tinder/data/fastmatch/usecase/DecrementFastMatchCount;Lcom/tinder/data/fastmatch/usecase/FetchFastMatchCount;Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;Lcom/tinder/fastmatch/analytics/FastMatchSessionManager;Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;Lcom/tinder/fastmatch/usecase/MarkFastMatchTutorialAsSeen;Lcom/tinder/fastmatch/analytics/AddLikesYouConnectionFailEvent;Lcom/tinder/views/grid/provider/UserRecPhotoAlbumProvider;Lcom/tinder/domain/fastmatch/RefreshNotifier;Lcom/tinder/domain/match/provider/NewMatchProvider;Lcom/tinder/fastmatch/analytics/AddLikesYouPillResetEvent;Lcom/tinder/fastmatch/newcount/FastMatchNewCountAbTestResolver;Lcom/tinder/domain/fastmatch/repository/FastMatchRecsResponseRepository;Lcom/tinder/recsgrid/ScrollStatusNotifier;Lcom/tinder/recsgrid/ScrollStatusProvider;Lcom/tinder/recsgrid/RecPrefetcher;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "lastRecsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "target", "Lcom/tinder/fastmatch/target/FastMatchRecsGridTarget;", "getTarget$Tinder_release", "()Lcom/tinder/fastmatch/target/FastMatchRecsGridTarget;", "setTarget$Tinder_release", "(Lcom/tinder/fastmatch/target/FastMatchRecsGridTarget;)V", "decrementFastMatchCountIfNeeded", "", "getAnimationForRewind", "Lcom/tinder/cardstack/animation/SwipeAnimation;", "type", "Lcom/tinder/domain/recs/model/Swipe$Type;", "getAnimationForSwipeType", "handleLoadingStatus", "loadingStatus", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "handleRecsUpdate", "recsUpdate", "handleRewoundSwipeRatingStatus", "swipeRatingStatus", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "handleScrollProgress", "progress", "", "velocity", "likeOnRec", "rec", "Lcom/tinder/domain/recs/model/Rec;", "origin", "Lcom/tinder/domain/recs/model/SwipeOrigin;", "loadMoreRecs", "notifyRefresh", "numberOfRecs", "", "observeRecsUpdates", "Lio/reactivex/Flowable;", "passOnRec", "reset", "showFastMatchTutorialIfNeeded", "subscribe", "subscribe$Tinder_release", "subscribeToLoadingStatus", "subscribeToNewMatches", "subscribeToPrefetch", "subscribeToPullToFreshNotifier", "subscribeToRecsResponse", "subscribeToRecsResponse$Tinder_release", "subscribeToRecsUpdates", "subscribeToSwipeRatingStatus", "superlikeOnRec", "unsubscribe", "unsubscribe$Tinder_release", "getActionContext", "Lcom/tinder/domain/recs/model/Swipe$SwipeActionContext;", "isFastMatch", "", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "shouldRewind", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.presenter.i */
public final class C11648i implements RecsGridPresenter {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public FastMatchRecsGridTarget f38093a;
    /* renamed from: b */
    private final C17356a f38094b = new C17356a();
    /* renamed from: c */
    private RecsUpdate f38095c;
    /* renamed from: d */
    private final RecsCardFactory f38096d;
    /* renamed from: e */
    private final RecsEngine f38097e;
    /* renamed from: f */
    private final C8650a f38098f;
    /* renamed from: g */
    private final C10770b f38099g;
    /* renamed from: h */
    private final FastMatchStatusProvider f38100h;
    /* renamed from: i */
    private final RatingProcessor f38101i;
    /* renamed from: j */
    private final C9372g f38102j;
    /* renamed from: k */
    private final FastMatchConfigProvider f38103k;
    /* renamed from: l */
    private final C9379a f38104l;
    /* renamed from: m */
    private final C11613a f38105m;
    /* renamed from: n */
    private final C15453a f38106n;
    /* renamed from: o */
    private final RefreshNotifier f38107o;
    /* renamed from: p */
    private final NewMatchProvider f38108p;
    /* renamed from: q */
    private final C11618f f38109q;
    /* renamed from: r */
    private final C9380a f38110r;
    /* renamed from: s */
    private final FastMatchRecsResponseRepository f38111s;
    /* renamed from: t */
    private final ScrollStatusNotifier f38112t;
    /* renamed from: u */
    private final ScrollStatusProvider f38113u;
    /* renamed from: v */
    private final C14782d f38114v;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$a */
    static final class C11630a implements Action {
        /* renamed from: a */
        public static final C11630a f38075a = new C11630a();

        C11630a() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$b */
    static final class C11631b<T> implements Consumer<RecsLoadingStatus> {
        /* renamed from: a */
        final /* synthetic */ C11648i f38076a;

        C11631b(C11648i c11648i) {
            this.f38076a = c11648i;
        }

        public /* synthetic */ void accept(Object obj) {
            m47399a((RecsLoadingStatus) obj);
        }

        /* renamed from: a */
        public final void m47399a(RecsLoadingStatus recsLoadingStatus) {
            C11648i c11648i = this.f38076a;
            C2668g.a(recsLoadingStatus, "it");
            c11648i.m47419a(recsLoadingStatus);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$c */
    static final class C11632c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11632c f38077a = new C11632c();

        C11632c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47400a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47400a(Throwable th) {
            C0001a.c(th, "Unable to get Loading state update", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "match", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$d */
    static final class C11633d<T> implements Consumer<Match> {
        /* renamed from: a */
        final /* synthetic */ C11648i f38078a;

        C11633d(C11648i c11648i) {
            this.f38078a = c11648i;
        }

        public /* synthetic */ void accept(Object obj) {
            m47401a((Match) obj);
        }

        /* renamed from: a */
        public final void m47401a(Match match) {
            C15454a c15454a = C15455a.f47881a;
            C2668g.a(match, "match");
            match = c15454a.a(match);
            if (match != null) {
                this.f38078a.m47445a().showNotification(match);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$e */
    static final class C11634e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11634e f38079a = new C11634e();

        C11634e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47402a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47402a(Throwable th) {
            C0001a.c(th, "Error showing fast match notification for new match", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/recsgrid/ScrollStatus;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$f */
    static final class C11635f<T> implements Predicate<C14783e> {
        /* renamed from: a */
        final /* synthetic */ C11648i f38080a;

        C11635f(C11648i c11648i) {
            this.f38080a = c11648i;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47403a((C14783e) obj);
        }

        /* renamed from: a */
        public final boolean m47403a(@NotNull C14783e c14783e) {
            C2668g.b(c14783e, "it");
            return this.f38080a.f38114v.a(c14783e.a(), c14783e.b(), this.f38080a.m47440m());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/recsgrid/ScrollStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$g */
    static final class C11636g<T> implements Consumer<C14783e> {
        /* renamed from: a */
        final /* synthetic */ C11648i f38081a;

        C11636g(C11648i c11648i) {
            this.f38081a = c11648i;
        }

        public /* synthetic */ void accept(Object obj) {
            m47404a((C14783e) obj);
        }

        /* renamed from: a */
        public final void m47404a(C14783e c14783e) {
            this.f38081a.m47434g();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$h */
    static final class C11637h<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11637h f38082a = new C11637h();

        C11637h() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47405a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47405a(Throwable th) {
            C0001a.c(th, "failed to observe scroll status", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/fastmatch/RefreshNotifier$SourceType;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$i */
    static final class C11638i<T> implements Consumer<SourceType> {
        /* renamed from: a */
        final /* synthetic */ C11648i f38083a;

        C11638i(C11648i c11648i) {
            this.f38083a = c11648i;
        }

        public /* synthetic */ void accept(Object obj) {
            m47406a((SourceType) obj);
        }

        /* renamed from: a */
        public final void m47406a(SourceType sourceType) {
            if (sourceType == SourceType.TAP) {
                this.f38083a.m47445a().smoothScrollToTop();
            }
            this.f38083a.m47450e();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$j */
    static final class C11639j<T> implements Consumer<C15813i> {
        /* renamed from: a */
        final /* synthetic */ C11648i f38084a;

        C11639j(C11648i c11648i) {
            this.f38084a = c11648i;
        }

        public /* synthetic */ void accept(Object obj) {
            m47407a((C15813i) obj);
        }

        /* renamed from: a */
        public final void m47407a(C15813i c15813i) {
            this.f38084a.f38102j.m39262n();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lorg/reactivestreams/Subscription;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$k */
    static final class C11640k<T> implements Consumer<Subscription> {
        /* renamed from: a */
        final /* synthetic */ C11648i f38085a;

        C11640k(C11648i c11648i) {
            this.f38085a = c11648i;
        }

        public /* synthetic */ void accept(Object obj) {
            m47408a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m47408a(Subscription subscription) {
            this.f38085a.m47445a().showEmptyList();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/RecsUpdate;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$l */
    static final class C11641l<T> implements Consumer<RecsUpdate> {
        /* renamed from: a */
        final /* synthetic */ C11648i f38086a;

        C11641l(C11648i c11648i) {
            this.f38086a = c11648i;
        }

        public /* synthetic */ void accept(Object obj) {
            m47409a((RecsUpdate) obj);
        }

        /* renamed from: a */
        public final void m47409a(RecsUpdate recsUpdate) {
            C11648i c11648i = this.f38086a;
            C2668g.a(recsUpdate, "it");
            c11648i.m47420a(recsUpdate);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$m */
    static final class C11642m<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11642m f38087a = new C11642m();

        C11642m() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47410a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47410a(Throwable th) {
            C0001a.c(th, "Unable to observe Recs Update", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$n */
    static final class C11643n<T> implements Predicate<SwipeRatingStatus> {
        /* renamed from: a */
        public static final C11643n f38088a = new C11643n();

        C11643n() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47411a((SwipeRatingStatus) obj);
        }

        /* renamed from: a */
        public final boolean m47411a(@NotNull SwipeRatingStatus swipeRatingStatus) {
            C2668g.b(swipeRatingStatus, "it");
            return swipeRatingStatus instanceof Ended;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$o */
    static final class C11644o<T> implements Predicate<Ended> {
        /* renamed from: a */
        final /* synthetic */ C11648i f38089a;

        C11644o(C11648i c11648i) {
            this.f38089a = c11648i;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47412a((Ended) obj);
        }

        /* renamed from: a */
        public final boolean m47412a(@NotNull Ended ended) {
            C2668g.b(ended, "it");
            return this.f38089a.m47424a((SwipeRatingStatus) ended);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$p */
    static final class C11645p<T> implements Predicate<Ended> {
        /* renamed from: a */
        final /* synthetic */ C11648i f38090a;

        C11645p(C11648i c11648i) {
            this.f38090a = c11648i;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47413a((Ended) obj);
        }

        /* renamed from: a */
        public final boolean m47413a(@NotNull Ended ended) {
            C2668g.b(ended, "it");
            return this.f38090a.m47423a(ended);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$q */
    static final class C11646q<T, R> implements Function<T, SingleSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C11648i f38091a;

        C11646q(C11648i c11648i) {
            this.f38091a = c11648i;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m47414a((Ended) obj);
        }

        /* renamed from: a */
        public final C3960g<Ended> m47414a(@NotNull Ended ended) {
            C2668g.b(ended, "it");
            return RxJavaInteropExtKt.toV2Completable(this.f38091a.f38097e.rewindSwipeToSwipedPosition(ended.getSwipe(), RewindReason.Companion.fromEndedRatingStatus(ended))).a(ended);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.presenter.i$r */
    static final class C11647r<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11647r f38092a = new C11647r();

        C11647r() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47415a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47415a(Throwable th) {
            C0001a.c(th, "Failed to observe SwipeRatingStatus. Stream is terminated", new Object[0]);
        }
    }

    @Inject
    public C11648i(@NotNull RecsCardFactory recsCardFactory, @NotNull @FastMatchModule$FastMatchRecsEngine RecsEngine recsEngine, @NotNull C8650a c8650a, @NotNull C10770b c10770b, @NotNull FastMatchStatusProvider fastMatchStatusProvider, @NotNull RatingProcessor ratingProcessor, @NotNull C9372g c9372g, @NotNull FastMatchConfigProvider fastMatchConfigProvider, @NotNull C9379a c9379a, @NotNull C11613a c11613a, @NotNull C15453a c15453a, @NotNull RefreshNotifier refreshNotifier, @NotNull NewMatchProvider newMatchProvider, @NotNull C11618f c11618f, @NotNull C9380a c9380a, @NotNull FastMatchRecsResponseRepository fastMatchRecsResponseRepository, @NotNull ScrollStatusNotifier scrollStatusNotifier, @NotNull ScrollStatusProvider scrollStatusProvider, @NotNull C14782d c14782d) {
        C11648i c11648i = this;
        RecsCardFactory recsCardFactory2 = recsCardFactory;
        RecsEngine recsEngine2 = recsEngine;
        C8650a c8650a2 = c8650a;
        C10770b c10770b2 = c10770b;
        FastMatchStatusProvider fastMatchStatusProvider2 = fastMatchStatusProvider;
        RatingProcessor ratingProcessor2 = ratingProcessor;
        C9372g c9372g2 = c9372g;
        FastMatchConfigProvider fastMatchConfigProvider2 = fastMatchConfigProvider;
        C9379a c9379a2 = c9379a;
        C11613a c11613a2 = c11613a;
        C15453a c15453a2 = c15453a;
        RefreshNotifier refreshNotifier2 = refreshNotifier;
        NewMatchProvider newMatchProvider2 = newMatchProvider;
        C11618f c11618f2 = c11618f;
        C9380a c9380a2 = c9380a;
        FastMatchRecsResponseRepository fastMatchRecsResponseRepository2 = fastMatchRecsResponseRepository;
        C2668g.b(recsCardFactory2, "cardFactory");
        C2668g.b(recsEngine2, "recsEngine");
        C2668g.b(c8650a2, "decrementFastMatchCount");
        C2668g.b(c10770b2, "fetchFastMatchCount");
        C2668g.b(fastMatchStatusProvider2, "fastMatchStatusProvider");
        C2668g.b(ratingProcessor2, "ratingProcessor");
        C2668g.b(c9372g2, "fastMatchSessionManager");
        C2668g.b(fastMatchConfigProvider2, "fastMatchConfigProvider");
        C2668g.b(c9379a2, "markFastMatchTutorialAsSeen");
        C2668g.b(c11613a2, "addLikesYouConnectionFailEvent");
        C2668g.b(c15453a2, "userRecPhotoAlbumProvider");
        C2668g.b(refreshNotifier2, "refreshNotifier");
        C2668g.b(newMatchProvider2, "newMatchProvider");
        C2668g.b(c11618f2, "addNewLikesYouPillResetEvent");
        C2668g.b(c9380a2, "fastMatchNewCountAbTestResolver");
        C2668g.b(fastMatchRecsResponseRepository, "fastMatchRecsResponseRepository");
        C2668g.b(scrollStatusNotifier, "scrollStatusNotifier");
        C2668g.b(scrollStatusProvider, "scrollStatusProvider");
        C2668g.b(c14782d, "recPrefetcher");
        FastMatchRecsResponseRepository fastMatchRecsResponseRepository3 = fastMatchRecsResponseRepository;
        this.f38096d = recsCardFactory2;
        this.f38097e = recsEngine2;
        this.f38098f = c8650a2;
        this.f38099g = c10770b2;
        this.f38100h = fastMatchStatusProvider2;
        this.f38101i = ratingProcessor2;
        this.f38102j = c9372g2;
        this.f38103k = fastMatchConfigProvider2;
        this.f38104l = c9379a2;
        this.f38105m = c11613a2;
        this.f38106n = c15453a2;
        this.f38107o = refreshNotifier2;
        this.f38108p = newMatchProvider2;
        this.f38109q = c11618f2;
        this.f38110r = c9380a;
        this.f38111s = fastMatchRecsResponseRepository3;
        ScrollStatusProvider scrollStatusProvider2 = scrollStatusProvider;
        this.f38112t = scrollStatusNotifier;
        this.f38113u = scrollStatusProvider2;
        this.f38114v = c14782d;
    }

    @NotNull
    /* renamed from: a */
    public final FastMatchRecsGridTarget m47445a() {
        FastMatchRecsGridTarget fastMatchRecsGridTarget = this.f38093a;
        if (fastMatchRecsGridTarget == null) {
            C2668g.b("target");
        }
        return fastMatchRecsGridTarget;
    }

    @Take
    /* renamed from: b */
    public final void m47447b() {
        this.f38097e.resume();
        m47441n();
        m47437j();
        m47436i();
        m47435h();
        m47439l();
        if (this.f38110r.m39281b()) {
            m47438k();
        }
    }

    @Take
    /* renamed from: c */
    public final void m47448c() {
        this.f38094b.add(RxJavaInteropExtKt.toV2Flowable(this.f38111s.observeResponseUpdate()).c(new C11639j(this)));
    }

    @Drop
    /* renamed from: d */
    public final void m47449d() {
        this.f38097e.pause();
        this.f38094b.a();
    }

    @UiThread
    public void likeOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeOrigin, "origin");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("likeOnRec ");
        stringBuilder.append(rec);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        FastMatchRecsGridTarget fastMatchRecsGridTarget = this.f38093a;
        if (fastMatchRecsGridTarget == null) {
            C2668g.b("target");
        }
        fastMatchRecsGridTarget.animateLike();
        this.f38097e.processLikeOnRec(rec, m47417a(swipeOrigin));
        m47444q();
        this.f38102j.m39259k();
    }

    @UiThread
    public void passOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeOrigin, "origin");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("passOnRec ");
        stringBuilder.append(rec);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        this.f38097e.processPassOnRec(rec, m47417a(swipeOrigin));
        m47444q();
        this.f38102j.m39260l();
    }

    @UiThread
    public void superlikeOnRec(@NotNull Rec rec, @NotNull SwipeOrigin swipeOrigin) {
        C2668g.b(rec, "rec");
        C2668g.b(swipeOrigin, "origin");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("superlikeOnRec ");
        stringBuilder.append(rec);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        this.f38097e.processSuperlikeOnRec(rec, m47417a(swipeOrigin));
        m47444q();
        this.f38102j.m39259k();
    }

    @UiThread
    /* renamed from: a */
    public final void m47446a(float f, float f2) {
        this.f38112t.notify(new C14783e(f, f2));
    }

    /* renamed from: g */
    private final void m47434g() {
        this.f38097e.loadMoreRecs();
    }

    @UiThread
    /* renamed from: e */
    public final void m47450e() {
        this.f38106n.a();
        this.f38099g.execute().a(RxUtils.a().b()).b(RxUtils.b());
        RecsEngine.safeReset$default(this.f38097e, null, 1, null);
    }

    /* renamed from: f */
    public final void m47451f() {
        if (this.f38110r.m39281b()) {
            this.f38109q.m47354a(PillResetSource.PULL_TO_REFRESH);
            this.f38107o.refresh(SourceType.PULL_TO_REFRESH);
            return;
        }
        m47450e();
    }

    @UiThread
    /* renamed from: h */
    private final void m47435h() {
        this.f38094b.add(RxJavaInteropExtKt.toV2Flowable(this.f38097e.observeLoadingStatusUpdates()).a(C15674a.a()).a(new C11631b(this), C11632c.f38077a));
    }

    @UiThread
    /* renamed from: a */
    private final void m47419a(RecsLoadingStatus recsLoadingStatus) {
        boolean isEmpty;
        RecsUpdate recsUpdate = this.f38095c;
        if (recsUpdate != null) {
            List currentRecs = recsUpdate.getCurrentRecs();
            if (currentRecs != null) {
                isEmpty = currentRecs.isEmpty();
                if (isEmpty) {
                    if (C2668g.a(recsLoadingStatus, Uninitialized.INSTANCE)) {
                        if (!C2668g.a(recsLoadingStatus, Loading.INSTANCE)) {
                            if (C2668g.a(recsLoadingStatus, LoadingMore.INSTANCE)) {
                                recsLoadingStatus = this.f38093a;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.showLoadingMore();
                            } else if (C2668g.a(recsLoadingStatus, FetchFailedNoConnection.INSTANCE) == null) {
                                recsLoadingStatus = this.f38093a;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.showNoNetworkConnectionError();
                            } else {
                                recsLoadingStatus = this.f38093a;
                                if (recsLoadingStatus == null) {
                                    C2668g.b("target");
                                }
                                recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                            }
                            return;
                        }
                    }
                    recsLoadingStatus = this.f38093a;
                    if (recsLoadingStatus == null) {
                        C2668g.b("target");
                    }
                    recsLoadingStatus.showRefreshing();
                    return;
                }
                recsLoadingStatus = this.f38093a;
                if (recsLoadingStatus == null) {
                    C2668g.b("target");
                }
                recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                recsLoadingStatus = this.f38093a;
                if (recsLoadingStatus == null) {
                    C2668g.b("target");
                }
                recsLoadingStatus.showEmptyList();
            }
        }
        isEmpty = false;
        if (isEmpty) {
            if (C2668g.a(recsLoadingStatus, Uninitialized.INSTANCE)) {
                if (C2668g.a(recsLoadingStatus, Loading.INSTANCE)) {
                    if (C2668g.a(recsLoadingStatus, LoadingMore.INSTANCE)) {
                        recsLoadingStatus = this.f38093a;
                        if (recsLoadingStatus == null) {
                            C2668g.b("target");
                        }
                        recsLoadingStatus.showLoadingMore();
                    } else if (C2668g.a(recsLoadingStatus, FetchFailedNoConnection.INSTANCE) == null) {
                        recsLoadingStatus = this.f38093a;
                        if (recsLoadingStatus == null) {
                            C2668g.b("target");
                        }
                        recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
                    } else {
                        recsLoadingStatus = this.f38093a;
                        if (recsLoadingStatus == null) {
                            C2668g.b("target");
                        }
                        recsLoadingStatus.showNoNetworkConnectionError();
                    }
                    return;
                }
            }
            recsLoadingStatus = this.f38093a;
            if (recsLoadingStatus == null) {
                C2668g.b("target");
            }
            recsLoadingStatus.showRefreshing();
            return;
        }
        recsLoadingStatus = this.f38093a;
        if (recsLoadingStatus == null) {
            C2668g.b("target");
        }
        recsLoadingStatus.hideLoadingMoreAndStopRefreshing();
        recsLoadingStatus = this.f38093a;
        if (recsLoadingStatus == null) {
            C2668g.b("target");
        }
        recsLoadingStatus.showEmptyList();
    }

    @UiThread
    /* renamed from: i */
    private final void m47436i() {
        this.f38094b.add(RxJavaInteropExtKt.toV2Observable(this.f38108p.observeNewMatches()).observeOn(C15756a.b()).observeOn(C15674a.a()).subscribe(new C11633d(this), C11634e.f38079a));
    }

    @UiThread
    /* renamed from: j */
    private final void m47437j() {
        Disposable subscribe = RxJavaInteropExtKt.toV2Observable(this.f38101i.observeSwipeRatingStatus()).observeOn(C15756a.b()).filter(C11643n.f38088a).cast(Ended.class).filter(new C11644o(this)).filter(new C11645p(this)).flatMapSingle(new C11646q(this)).observeOn(C15674a.a()).subscribe(new C11649l(new C14308x230f2485(this)), C11647r.f38092a);
        this.f38094b.a(new Disposable[]{subscribe});
    }

    /* renamed from: k */
    private final void m47438k() {
        this.f38094b.add(RxJavaInteropExtKt.toV2Observable(this.f38107o.observeRefresh()).observeOn(C15674a.a()).subscribe(new C11638i(this)));
    }

    @UiThread
    /* renamed from: l */
    private final void m47439l() {
        this.f38094b.add(this.f38113u.observe().a(new C11635f(this)).a(new C11636g(this), C11637h.f38082a));
    }

    /* renamed from: m */
    private final int m47440m() {
        RecsUpdate recsUpdate = this.f38095c;
        if (recsUpdate != null) {
            List currentRecs = recsUpdate.getCurrentRecs();
            if (currentRecs != null) {
                return currentRecs.size();
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final boolean m47424a(@NotNull SwipeRatingStatus swipeRatingStatus) {
        return C2668g.a(swipeRatingStatus.getSwipe().getRec().getSource(), FastMatch.INSTANCE);
    }

    /* renamed from: a */
    private final boolean m47423a(@NotNull Ended ended) {
        switch (C9392j.f31495a[ended.getSwipe().getType().ordinal()]) {
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

    /* renamed from: b */
    private final void m47429b(Ended ended) {
        C3956a b = RxJavaInteropExtKt.toV2Completable(this.f38105m.execute()).b(C15756a.b());
        Action action = C11630a.f38075a;
        Function1 function1 = FastMatchRecsGridPresenter$handleRewoundSwipeRatingStatus$2.f45316a;
        if (function1 != null) {
            function1 = new C11649l(function1);
        }
        b.a(action, (Consumer) function1);
        C15455a a = C15455a.f47881a.a(ended.getSwipe().getRec());
        switch (C9392j.f31497c[ended.getSwipe().getType().ordinal()]) {
            case 1:
                switch (C9392j.f31496b[ended.getRatingResult().ordinal()]) {
                    case 1:
                        ended = this.f38093a;
                        if (ended == null) {
                            C2668g.b("target");
                        }
                        ended.showNotification(a);
                        return;
                    case 2:
                        FastMatchRecsGridTarget fastMatchRecsGridTarget = this.f38093a;
                        if (fastMatchRecsGridTarget == null) {
                            C2668g.b("target");
                        }
                        fastMatchRecsGridTarget.showSuperLikePaywall(ended.getSwipe().getRec());
                        return;
                    default:
                        return;
                }
            case 2:
                ended = this.f38093a;
                if (ended == null) {
                    C2668g.b("target");
                }
                ended.showNotification(a);
                return;
            default:
                return;
        }
    }

    @UiThread
    /* renamed from: n */
    private final void m47441n() {
        this.f38094b.add(m47442o().a(C15674a.a()).b(new C11640k(this)).a(new C11641l(this), C11642m.f38087a));
    }

    /* renamed from: o */
    private final C3957b<RecsUpdate> m47442o() {
        Observable observeRecsUpdatesSince;
        if (this.f38095c != null) {
            RecsEngine recsEngine = this.f38097e;
            RecsUpdate recsUpdate = this.f38095c;
            if (recsUpdate == null) {
                C2668g.a();
            }
            observeRecsUpdatesSince = recsEngine.observeRecsUpdatesSince(recsUpdate);
        } else {
            observeRecsUpdatesSince = this.f38097e.observeRecsUpdates();
        }
        return RxJavaInteropExtKt.toV2Flowable(observeRecsUpdatesSince);
    }

    @UiThread
    /* renamed from: a */
    private final void m47420a(RecsUpdate recsUpdate) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("recs updates");
        stringBuilder.append(recsUpdate);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        if (recsUpdate != this.f38095c) {
            FastMatchRecsGridTarget fastMatchRecsGridTarget;
            List createCards;
            if (this.f38095c == null) {
                fastMatchRecsGridTarget = this.f38093a;
                if (fastMatchRecsGridTarget == null) {
                    C2668g.b("target");
                }
                fastMatchRecsGridTarget.showCardGrid();
                fastMatchRecsGridTarget = this.f38093a;
                if (fastMatchRecsGridTarget == null) {
                    C2668g.b("target");
                }
                createCards = this.f38096d.createCards(recsUpdate.getCurrentRecs());
                C2668g.a(createCards, "cardFactory.createCards(recsUpdate.currentRecs)");
                fastMatchRecsGridTarget.insertRecs(0, createCards);
                this.f38095c = recsUpdate;
                m47443p();
                return;
            }
            if (recsUpdate instanceof Consume) {
                int position = recsUpdate.getPosition();
                if (recsUpdate == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.tinder.domain.recs.model.RecsUpdate.Consume");
                }
                Consume consume = (Consume) recsUpdate;
                FastMatchRecsGridTarget fastMatchRecsGridTarget2 = this.f38093a;
                if (fastMatchRecsGridTarget2 == null) {
                    C2668g.b("target");
                }
                fastMatchRecsGridTarget2.removeRec(position, m47427b(consume.getSwipe().getType()));
                if (recsUpdate.getCurrentRecs().size() == 0) {
                    fastMatchRecsGridTarget = this.f38093a;
                    if (fastMatchRecsGridTarget == null) {
                        C2668g.b("target");
                    }
                    fastMatchRecsGridTarget.showEmptyList();
                }
            } else if (recsUpdate instanceof Remove) {
                fastMatchRecsGridTarget = this.f38093a;
                if (fastMatchRecsGridTarget == null) {
                    C2668g.b("target");
                }
                C9405a.m39354a(fastMatchRecsGridTarget, recsUpdate.getPosition(), null, 2, null);
            } else if (recsUpdate instanceof Insert) {
                fastMatchRecsGridTarget = this.f38093a;
                if (fastMatchRecsGridTarget == null) {
                    C2668g.b("target");
                }
                int position2 = recsUpdate.getPosition();
                createCards = this.f38096d.createCards(recsUpdate.getModifiedRecs());
                C2668g.a(createCards, "cardFactory.createCards(recsUpdate.modifiedRecs)");
                fastMatchRecsGridTarget.insertRecs(position2, createCards);
            } else if (recsUpdate instanceof ClearAll) {
                fastMatchRecsGridTarget = this.f38093a;
                if (fastMatchRecsGridTarget == null) {
                    C2668g.b("target");
                }
                fastMatchRecsGridTarget.clearRecs();
            } else if (recsUpdate instanceof Rewind) {
                Swipe swipe = ((Rewind) recsUpdate).getSwipe();
                C8395a createCard = this.f38096d.createCard(swipe.getRec());
                C2668g.a(createCard, "card");
                createCard.setShowRevertIndicator(true);
                createCard.setAppearingAnimation(m47416a(swipe.getType()));
                fastMatchRecsGridTarget = this.f38093a;
                if (fastMatchRecsGridTarget == null) {
                    C2668g.b("target");
                }
                fastMatchRecsGridTarget.postInsertRec(recsUpdate.getPosition(), createCard);
            } else if (!(recsUpdate instanceof RewindCancel)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Recs update not handled: ");
                stringBuilder2.append(recsUpdate);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
            this.f38095c = recsUpdate;
        }
    }

    /* renamed from: p */
    private final void m47443p() {
        if (!this.f38103k.get().getHasSeenTutorial()) {
            FastMatchRecsGridTarget fastMatchRecsGridTarget = this.f38093a;
            if (fastMatchRecsGridTarget == null) {
                C2668g.b("target");
            }
            fastMatchRecsGridTarget.showTutorial();
            this.f38104l.m39279a();
        }
    }

    /* renamed from: a */
    private final C8361a m47416a(Type type) {
        switch (C9392j.f31498d[type.ordinal()]) {
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
    private final C8361a m47427b(Type type) {
        switch (C9392j.f31499e[type.ordinal()]) {
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

    /* renamed from: q */
    private final void m47444q() {
        if (!this.f38100h.get().isRange()) {
            this.f38098f.m36885a();
        }
    }

    /* renamed from: a */
    private final SwipeActionContext m47417a(@NotNull SwipeOrigin swipeOrigin) {
        switch (C9392j.f31500f[swipeOrigin.ordinal()]) {
            case 1:
                return C9393k.f31502b;
            case 2:
                return C9393k.f31501a;
            default:
                throw ((Throwable) new IllegalArgumentException("Invalid Swipe origin for Grid"));
        }
    }
}
