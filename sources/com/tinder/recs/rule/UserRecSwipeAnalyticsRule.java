package com.tinder.recs.rule;

import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.rule.PostSwipeConsumptionRule;
import com.tinder.domain.recs.rule.SwipeProcessingRule.ResultType;
import com.tinder.recs.analytics.AddRecsRateEvent;
import com.tinder.recs.analytics.AddRecsRateEvent.AddRecsRateEventRequest;
import com.tinder.recs.analytics.RecsPhotoSource;
import com.tinder.recs.analytics.RecsPhotosViewedCache;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.schedulers.Schedulers;

@Singleton
public class UserRecSwipeAnalyticsRule implements PostSwipeConsumptionRule {
    private final AddRecsRateEvent addRecsRateEvent;
    private final RecsPhotosViewedCache recsPhotosViewedCache;

    @Inject
    UserRecSwipeAnalyticsRule(AddRecsRateEvent addRecsRateEvent, RecsPhotosViewedCache recsPhotosViewedCache) {
        this.addRecsRateEvent = addRecsRateEvent;
        this.recsPhotosViewedCache = recsPhotosViewedCache;
    }

    @WorkerThread
    @NonNull
    public ResultType perform(@NonNull Swipe swipe) {
        if (swipe.getRec().getType() == RecType.USER || swipe.getRec().getType() == RecType.TOP_PICK) {
            this.addRecsRateEvent.execute(createAddRecsRateEventRequest(swipe)).b(Schedulers.io()).b(RxUtils.b());
        }
        return ResultType.PROCEED;
    }

    private AddRecsRateEventRequest createAddRecsRateEventRequest(Swipe swipe) {
        String id = swipe.getRec().getId();
        return new AddRecsRateEventRequest(swipe, this.recsPhotosViewedCache.uniquePhotosViewed(id, RecsPhotoSource.CARD), this.recsPhotosViewedCache.uniquePhotosViewed(id, RecsPhotoSource.PROFILE));
    }
}
