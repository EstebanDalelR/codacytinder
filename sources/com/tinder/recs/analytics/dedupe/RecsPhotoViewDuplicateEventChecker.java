package com.tinder.recs.analytics.dedupe;

import com.tinder.recs.analytics.AddRecsPhotoViewEvent.RecsPhotoViewEventRequest;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/recs/analytics/dedupe/RecsPhotoViewDuplicateEventChecker;", "Lcom/tinder/recs/analytics/dedupe/DuplicateEventsChecker;", "Lcom/tinder/recs/analytics/AddRecsPhotoViewEvent$RecsPhotoViewEventRequest;", "cacheSize", "", "(I)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsPhotoViewDuplicateEventChecker extends DuplicateEventsChecker<RecsPhotoViewEventRequest> {
    public RecsPhotoViewDuplicateEventChecker(int i) {
        super(i);
    }
}
