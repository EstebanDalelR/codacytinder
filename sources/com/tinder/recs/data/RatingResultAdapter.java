package com.tinder.recs.data;

import android.support.annotation.NonNull;
import com.tinder.api.model.rating.LikeRatingResponse;
import com.tinder.api.model.rating.PassRatingResponse;
import com.tinder.api.model.rating.SuperLikeRatingResponse;
import com.tinder.domain.recs.model.RatingResult;
import javax.inject.Singleton;
import p000a.p001a.C0001a;
import rx.Notification;
import rx.Observable;

@Singleton
public class RatingResultAdapter {
    @NonNull
    Observable<RatingResult> fromLikeRatingResponse(@NonNull Observable<LikeRatingResponse> observable) {
        return observable.j().h(RatingResultAdapter$$Lambda$0.$instance);
    }

    static final /* synthetic */ Observable lambda$fromLikeRatingResponse$0$RatingResultAdapter(Notification notification) {
        if (notification.e()) {
            C0001a.c(notification.b(), "Failed to parse likeRatingResponse", new Object[0]);
            return Observable.a(RatingResult.ERROR);
        } else if (!notification.d()) {
            return Observable.c();
        } else {
            notification = ((LikeRatingResponse) notification.c()).likesRemaining();
            if (notification == null || notification.intValue() != null) {
                return Observable.a(RatingResult.SUCCESSFUL);
            }
            return Observable.a(RatingResult.BOUNCER);
        }
    }

    @NonNull
    Observable<RatingResult> fromSuperLikeRatingResponse(@NonNull Observable<SuperLikeRatingResponse> observable) {
        return observable.j().h(RatingResultAdapter$$Lambda$1.$instance);
    }

    static final /* synthetic */ Observable lambda$fromSuperLikeRatingResponse$1$RatingResultAdapter(Notification notification) {
        if (notification.e()) {
            C0001a.c(notification.b(), "Failed to parse superLikeRatingResponse", new Object[0]);
            return Observable.a(RatingResult.ERROR);
        } else if (!notification.d()) {
            return Observable.c();
        } else {
            notification = ((SuperLikeRatingResponse) notification.c()).limitExceeded();
            if (notification == null || notification.booleanValue() == null) {
                return Observable.a(RatingResult.SUCCESSFUL);
            }
            return Observable.a(RatingResult.BOUNCER);
        }
    }

    @NonNull
    Observable<RatingResult> fromPassRatingResponse(@NonNull Observable<PassRatingResponse> observable) {
        return observable.j().h(RatingResultAdapter$$Lambda$2.$instance);
    }

    static final /* synthetic */ Observable lambda$fromPassRatingResponse$2$RatingResultAdapter(Notification notification) {
        if (notification.e()) {
            C0001a.c(notification.b(), "Failed to parse passRatingResponse", new Object[0]);
            return Observable.a(RatingResult.ERROR);
        } else if (notification.d() != null) {
            return Observable.a(RatingResult.SUCCESSFUL);
        } else {
            return Observable.c();
        }
    }
}
