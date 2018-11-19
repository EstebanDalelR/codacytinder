package com.tinder.recs.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.recs.model.RecFieldDecorationExtensionsKt;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.fireboarding.domain.C11811o;
import com.tinder.fireboarding.domain.C11813p;
import com.tinder.recs.analytics.AddRecsAllPhotosViewedEvent;
import com.tinder.recs.analytics.AddRecsAllPhotosViewedEvent.RecsAllPhotosViewedEventRequest;
import com.tinder.recs.analytics.AddRecsPhotoViewEvent;
import com.tinder.recs.analytics.AddRecsPhotoViewEvent.RecsPhotoViewEventRequest;
import com.tinder.recs.analytics.RecsPhotoSource;
import com.tinder.recs.analytics.RecsPhotosViewedCache;
import com.tinder.recs.target.TappyUserRecCardTarget;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3957b;
import io.reactivex.disposables.Disposable;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u001e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u001cH\u0007J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aJ \u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006)"}, d2 = {"Lcom/tinder/recs/presenter/TappyUserRecCardPresenter;", "", "addRecsPhotoViewEvent", "Lcom/tinder/recs/analytics/AddRecsPhotoViewEvent;", "addAllRecsPhotoViewEvent", "Lcom/tinder/recs/analytics/AddRecsAllPhotosViewedEvent;", "recsPhotosViewedCache", "Lcom/tinder/recs/analytics/RecsPhotosViewedCache;", "observeFireboardingConfig", "Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;", "observeIsSuperLikeEnabled", "Lcom/tinder/fireboarding/domain/ObserveIsSuperLikeEnabled;", "(Lcom/tinder/recs/analytics/AddRecsPhotoViewEvent;Lcom/tinder/recs/analytics/AddRecsAllPhotosViewedEvent;Lcom/tinder/recs/analytics/RecsPhotosViewedCache;Lcom/tinder/fireboarding/domain/ObserveFireboardingConfig;Lcom/tinder/fireboarding/domain/ObserveIsSuperLikeEnabled;)V", "isSuperlikeEnabledDisposable", "Lio/reactivex/disposables/Disposable;", "target", "Lcom/tinder/recs/target/TappyUserRecCardTarget;", "getTarget$Tinder_release", "()Lcom/tinder/recs/target/TappyUserRecCardTarget;", "setTarget$Tinder_release", "(Lcom/tinder/recs/target/TappyUserRecCardTarget;)V", "createRecsPhotoViewEventRequest", "Lcom/tinder/recs/analytics/AddRecsPhotoViewEvent$RecsPhotoViewEventRequest;", "position", "", "userRec", "Lcom/tinder/domain/recs/model/UserRec;", "handleCardMovedToTop", "", "handleOnPhotoChanged", "totalCount", "notifyPhotoViewed", "observeIsSuperlikeEnabled", "isUserRecSuperlikeable", "", "onDropTarget", "onUserRecBound", "shouldShowSuperLikeStamp", "isSuperLikeEnabled", "isUserRecSuperLikable", "isFireboardingEnabled", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TappyUserRecCardPresenter {
    private final AddRecsAllPhotosViewedEvent addAllRecsPhotoViewEvent;
    private final AddRecsPhotoViewEvent addRecsPhotoViewEvent;
    private Disposable isSuperlikeEnabledDisposable;
    private final C11811o observeFireboardingConfig;
    private final C11813p observeIsSuperLikeEnabled;
    private final RecsPhotosViewedCache recsPhotosViewedCache;
    @DeadshotTarget
    @NotNull
    public TappyUserRecCardTarget target;

    private final boolean shouldShowSuperLikeStamp(boolean z, boolean z2, boolean z3) {
        return z2 && (!z3 || z);
    }

    @Inject
    public TappyUserRecCardPresenter(@NotNull AddRecsPhotoViewEvent addRecsPhotoViewEvent, @NotNull AddRecsAllPhotosViewedEvent addRecsAllPhotosViewedEvent, @NotNull RecsPhotosViewedCache recsPhotosViewedCache, @NotNull C11811o c11811o, @NotNull C11813p c11813p) {
        C2668g.b(addRecsPhotoViewEvent, "addRecsPhotoViewEvent");
        C2668g.b(addRecsAllPhotosViewedEvent, "addAllRecsPhotoViewEvent");
        C2668g.b(recsPhotosViewedCache, "recsPhotosViewedCache");
        C2668g.b(c11811o, "observeFireboardingConfig");
        C2668g.b(c11813p, "observeIsSuperLikeEnabled");
        this.addRecsPhotoViewEvent = addRecsPhotoViewEvent;
        this.addAllRecsPhotoViewEvent = addRecsAllPhotosViewedEvent;
        this.recsPhotosViewedCache = recsPhotosViewedCache;
        this.observeFireboardingConfig = c11811o;
        this.observeIsSuperLikeEnabled = c11813p;
    }

    @NotNull
    public final TappyUserRecCardTarget getTarget$Tinder_release() {
        TappyUserRecCardTarget tappyUserRecCardTarget = this.target;
        if (tappyUserRecCardTarget == null) {
            C2668g.b("target");
        }
        return tappyUserRecCardTarget;
    }

    public final void setTarget$Tinder_release(@NotNull TappyUserRecCardTarget tappyUserRecCardTarget) {
        C2668g.b(tappyUserRecCardTarget, "<set-?>");
        this.target = tappyUserRecCardTarget;
    }

    public final void handleOnPhotoChanged(int i, int i2, @NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        if (i == i2 - 1) {
            this.addAllRecsPhotoViewEvent.execute(new RecsAllPhotosViewedEventRequest(RecsPhotoSource.CARD, i2, userRec.getId(), userRec.isSuperLike())).b(Schedulers.io()).a(TappyUserRecCardPresenter$handleOnPhotoChanged$1.INSTANCE, TappyUserRecCardPresenter$handleOnPhotoChanged$2.INSTANCE);
        }
        if (i >= 0) {
            if (i < userRec.getUser().photos().size()) {
                notifyPhotoViewed(i, userRec);
                this.addRecsPhotoViewEvent.execute(createRecsPhotoViewEventRequest(i, userRec)).b(Schedulers.io()).a((Action0) TappyUserRecCardPresenter$handleOnPhotoChanged$3.INSTANCE, (Action1) TappyUserRecCardPresenter$handleOnPhotoChanged$4.INSTANCE);
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected position=");
        stringBuilder.append(i);
        stringBuilder.append(", where photosCount=");
        stringBuilder.append(userRec.getUser().photos().size());
        C0001a.c((Throwable) new RuntimeException(stringBuilder.toString()));
    }

    public final void handleCardMovedToTop(int i, @NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        if (i >= 0) {
            if (i < userRec.getUser().photos().size()) {
                notifyPhotoViewed(i, userRec);
                this.addRecsPhotoViewEvent.execute(createRecsPhotoViewEventRequest(i, userRec)).b(Schedulers.io()).a((Action0) TappyUserRecCardPresenter$handleCardMovedToTop$1.INSTANCE, TappyUserRecCardPresenter$handleCardMovedToTop$2.INSTANCE);
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected position=");
        stringBuilder.append(i);
        stringBuilder.append(", where photosCount=");
        stringBuilder.append(userRec.getUser().photos().size());
        C0001a.c(new RuntimeException(stringBuilder.toString()));
    }

    public final void onUserRecBound(@NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        Disposable disposable = this.isSuperlikeEnabledDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.isSuperlikeEnabledDisposable = observeIsSuperlikeEnabled(RecFieldDecorationExtensionsKt.isSuperLikeable(userRec));
    }

    @Drop
    public final void onDropTarget() {
        Disposable disposable = this.isSuperlikeEnabledDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    private final Disposable observeIsSuperlikeEnabled(boolean z) {
        z = C3957b.a(this.observeIsSuperLikeEnabled.execute().toFlowable(BackpressureStrategy.LATEST), this.observeFireboardingConfig.execute(), new TappyUserRecCardPresenter$observeIsSuperlikeEnabled$1(this, z)).b(C15756a.m59010b()).a(C15674a.m58830a()).a(TappyUserRecCardPresenter$observeIsSuperlikeEnabled$2.INSTANCE, TappyUserRecCardPresenter$observeIsSuperlikeEnabled$3.INSTANCE);
        C2668g.a(z, "Flowable.combineLatest(o…ibe({}, { Timber.e(it) })");
        return z;
    }

    private final void notifyPhotoViewed(int i, UserRec userRec) {
        this.recsPhotosViewedCache.notifyPhotoViewed(i, userRec.getId(), RecsPhotoSource.CARD);
    }

    private final RecsPhotoViewEventRequest createRecsPhotoViewEventRequest(int i, UserRec userRec) {
        String id = ((Photo) userRec.getUser().photos().get(i)).id();
        boolean isSuperLike = userRec.isSuperLike();
        String id2 = userRec.getId();
        RecsPhotoSource recsPhotoSource = RecsPhotoSource.CARD;
        C2668g.a(id, "photoId");
        return new RecsPhotoViewEventRequest(isSuperLike, id2, recsPhotoSource, id, RecFieldDecorationExtensionsKt.deepLinkInfo(userRec));
    }
}
