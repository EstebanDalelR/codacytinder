package com.tinder.recs.presenter;

import android.support.annotation.UiThread;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.domain.recs.model.SwipeRatingStatus;
import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import com.tinder.domain.recs.model.SwipeRatingStatus.InProgress;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.recs.provider.SuperLikeRatingStatus;
import com.tinder.recs.provider.SuperLikeRatingStatusNotifier;
import com.tinder.recs.provider.SuperLikeRatingStatusProvider;
import com.tinder.recs.target.GridSuperLikeButtonTarget;
import io.reactivex.disposables.C17356a;
import io.reactivex.p453a.p455b.C15674a;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\u0016\u0010\u0016\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0007J\r\u0010\u0019\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u001cJ\f\u0010\u001d\u001a\u00020\f*\u00020\u001eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/tinder/recs/presenter/GridSuperLikeButtonPresenter;", "", "superLikeRatingStatusProvider", "Lcom/tinder/recs/provider/SuperLikeRatingStatusProvider;", "superLikeRatingStatusNotifier", "Lcom/tinder/recs/provider/SuperLikeRatingStatusNotifier;", "ratingProcessor", "Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;", "(Lcom/tinder/recs/provider/SuperLikeRatingStatusProvider;Lcom/tinder/recs/provider/SuperLikeRatingStatusNotifier;Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "currentRatingStatus", "Lcom/tinder/recs/provider/SuperLikeRatingStatus;", "target", "Lcom/tinder/recs/target/GridSuperLikeButtonTarget;", "getTarget$Tinder_release", "()Lcom/tinder/recs/target/GridSuperLikeButtonTarget;", "setTarget$Tinder_release", "(Lcom/tinder/recs/target/GridSuperLikeButtonTarget;)V", "clear", "", "clear$Tinder_release", "handleOnClick", "onClickAction", "Lkotlin/Function0;", "observeRatingProcessor", "observeRatingProcessor$Tinder_release", "observeSuperLikeRatingStatus", "observeSuperLikeRatingStatus$Tinder_release", "convertToSuperLikeRatingStatus", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GridSuperLikeButtonPresenter {
    private final C17356a compositeDisposable = new C17356a();
    private SuperLikeRatingStatus currentRatingStatus;
    private final RatingProcessor ratingProcessor;
    private final SuperLikeRatingStatusNotifier superLikeRatingStatusNotifier;
    private final SuperLikeRatingStatusProvider superLikeRatingStatusProvider;
    @DeadshotTarget
    @NotNull
    public GridSuperLikeButtonTarget target;

    @Inject
    public GridSuperLikeButtonPresenter(@NotNull SuperLikeRatingStatusProvider superLikeRatingStatusProvider, @NotNull SuperLikeRatingStatusNotifier superLikeRatingStatusNotifier, @NotNull RatingProcessor ratingProcessor) {
        C2668g.b(superLikeRatingStatusProvider, "superLikeRatingStatusProvider");
        C2668g.b(superLikeRatingStatusNotifier, "superLikeRatingStatusNotifier");
        C2668g.b(ratingProcessor, "ratingProcessor");
        this.superLikeRatingStatusProvider = superLikeRatingStatusProvider;
        this.superLikeRatingStatusNotifier = superLikeRatingStatusNotifier;
        this.ratingProcessor = ratingProcessor;
    }

    @NotNull
    public final GridSuperLikeButtonTarget getTarget$Tinder_release() {
        GridSuperLikeButtonTarget gridSuperLikeButtonTarget = this.target;
        if (gridSuperLikeButtonTarget == null) {
            C2668g.b("target");
        }
        return gridSuperLikeButtonTarget;
    }

    public final void setTarget$Tinder_release(@NotNull GridSuperLikeButtonTarget gridSuperLikeButtonTarget) {
        C2668g.b(gridSuperLikeButtonTarget, "<set-?>");
        this.target = gridSuperLikeButtonTarget;
    }

    @Take
    public final void observeSuperLikeRatingStatus$Tinder_release() {
        this.compositeDisposable.add(this.superLikeRatingStatusProvider.observe().distinctUntilChanged().subscribe(new GridSuperLikeButtonPresenter$observeSuperLikeRatingStatus$1(this), GridSuperLikeButtonPresenter$observeSuperLikeRatingStatus$2.INSTANCE));
    }

    @Take
    public final void observeRatingProcessor$Tinder_release() {
        this.compositeDisposable.add(RxJavaInteropExtKt.toV2Observable(this.ratingProcessor.observeSwipeRatingStatus()).filter(GridSuperLikeButtonPresenter$observeRatingProcessor$1.INSTANCE).map(new GridSuperLikeButtonPresenter$observeRatingProcessor$2(this)).observeOn(C15674a.m58830a()).subscribe(new GridSuperLikeButtonPresenter$observeRatingProcessor$3(this), GridSuperLikeButtonPresenter$observeRatingProcessor$4.INSTANCE));
    }

    @Drop
    public final void clear$Tinder_release() {
        this.compositeDisposable.m63446a();
    }

    private final SuperLikeRatingStatus convertToSuperLikeRatingStatus(@NotNull SwipeRatingStatus swipeRatingStatus) {
        if (swipeRatingStatus instanceof Ended) {
            return SuperLikeRatingStatus.ENDED;
        }
        if ((swipeRatingStatus instanceof InProgress) != null) {
            return SuperLikeRatingStatus.IN_PROGRESS;
        }
        throw new NoWhenBranchMatchedException();
    }

    @UiThread
    public final void handleOnClick(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "onClickAction");
        if (this.currentRatingStatus != SuperLikeRatingStatus.IN_PROGRESS) {
            this.superLikeRatingStatusNotifier.notify(SuperLikeRatingStatus.IN_PROGRESS);
            function0.invoke();
        }
    }
}
