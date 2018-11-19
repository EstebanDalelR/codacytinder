package com.tinder.recs.analytics.dedupe;

import com.tinder.recs.analytics.AddRecsAllPhotosViewedEvent.RecsAllPhotosViewedEventRequest;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/recs/analytics/dedupe/RecsAllPhotosViewedDuplicateEventChecker;", "Lcom/tinder/recs/analytics/dedupe/DuplicateEventsChecker;", "Lcom/tinder/recs/analytics/AddRecsAllPhotosViewedEvent$RecsAllPhotosViewedEventRequest;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsAllPhotosViewedDuplicateEventChecker extends DuplicateEventsChecker<RecsAllPhotosViewedEventRequest> {
    @Inject
    public RecsAllPhotosViewedDuplicateEventChecker() {
        super(0, 1, null);
    }
}