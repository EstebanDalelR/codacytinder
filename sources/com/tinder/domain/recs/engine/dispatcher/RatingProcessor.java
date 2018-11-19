package com.tinder.domain.recs.engine.dispatcher;

import com.tinder.domain.recs.RatingsApiClient;
import com.tinder.domain.recs.model.RatingResult;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.SwipeRatingStatus;
import com.tinder.domain.recs.model.SwipeRatingStatus.Ended;
import com.tinder.domain.recs.model.SwipeRatingStatus.InProgress;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Single;
import rx.subjects.C19786b;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000RN\u0010\u0005\u001aB\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b* \u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/domain/recs/engine/dispatcher/RatingProcessor;", "", "ratingsApiClient", "Lcom/tinder/domain/recs/RatingsApiClient;", "(Lcom/tinder/domain/recs/RatingsApiClient;)V", "swipeRatingStatusSubject", "Lrx/subjects/SerializedSubject;", "Lcom/tinder/domain/recs/model/SwipeRatingStatus;", "kotlin.jvm.PlatformType", "markSwipeAsRated", "", "swipe", "Lcom/tinder/domain/recs/model/Swipe;", "ratingResult", "Lcom/tinder/domain/recs/model/RatingResult;", "notifySwipeRatingEndedWithError", "notifySwipeRatingInProgress", "notifySwipeRatingStatus", "swipeRatingStatus", "observeSwipeRatingStatus", "Lrx/Observable;", "rate", "Lrx/Single;", "Lcom/tinder/domain/recs/model/SwipeRatingStatus$Ended;", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class RatingProcessor {
    private final RatingsApiClient ratingsApiClient;
    private final C19786b<SwipeRatingStatus, SwipeRatingStatus> swipeRatingStatusSubject = PublishSubject.w().B();

    public RatingProcessor(@NotNull RatingsApiClient ratingsApiClient) {
        C2668g.b(ratingsApiClient, "ratingsApiClient");
        this.ratingsApiClient = ratingsApiClient;
    }

    @NotNull
    public final Single<Ended> rate(@NotNull Swipe swipe) {
        C2668g.b(swipe, "swipe");
        swipe = this.ratingsApiClient.rate(swipe).a(new RatingProcessor$rate$1(this, swipe)).d(new RatingProcessor$rate$2(swipe)).d(new RatingProcessor$rate$3(this)).c(new RatingProcessor$rate$4(this, swipe));
        C2668g.a(swipe, "ratingsApiClient.rate(sw…ngEndedWithError(swipe) }");
        return swipe;
    }

    public final void markSwipeAsRated(@NotNull Swipe swipe, @NotNull RatingResult ratingResult) {
        C2668g.b(swipe, "swipe");
        C2668g.b(ratingResult, "ratingResult");
        notifySwipeRatingStatus(new Ended(swipe, ratingResult));
    }

    @NotNull
    public final Observable<SwipeRatingStatus> observeSwipeRatingStatus() {
        Observable<SwipeRatingStatus> e = this.swipeRatingStatusSubject.k().e();
        C2668g.a(e, "swipeRatingStatusSubject…reBuffer().asObservable()");
        return e;
    }

    private final void notifySwipeRatingStatus(SwipeRatingStatus swipeRatingStatus) {
        this.swipeRatingStatusSubject.onNext(swipeRatingStatus);
    }

    private final void notifySwipeRatingInProgress(Swipe swipe) {
        notifySwipeRatingStatus(new InProgress(swipe));
    }

    private final void notifySwipeRatingEndedWithError(Swipe swipe) {
        notifySwipeRatingStatus(new Ended(swipe, RatingResult.ERROR));
    }
}
