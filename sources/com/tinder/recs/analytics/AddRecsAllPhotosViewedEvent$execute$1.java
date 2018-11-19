package com.tinder.recs.analytics;

import com.tinder.etl.event.tv;
import com.tinder.recs.analytics.AddRecsAllPhotosViewedEvent.RecsAllPhotosViewedEventRequest;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class AddRecsAllPhotosViewedEvent$execute$1 implements Action0 {
    final /* synthetic */ RecsAllPhotosViewedEventRequest $request;
    final /* synthetic */ AddRecsAllPhotosViewedEvent this$0;

    AddRecsAllPhotosViewedEvent$execute$1(AddRecsAllPhotosViewedEvent addRecsAllPhotosViewedEvent, RecsAllPhotosViewedEventRequest recsAllPhotosViewedEventRequest) {
        this.this$0 = addRecsAllPhotosViewedEvent;
        this.$request = recsAllPhotosViewedEventRequest;
    }

    public final void call() {
        if (!this.this$0.duplicateEventsChecker.isDuplicate(this.$request)) {
            this.this$0.fireworks.a(tv.a().b(Integer.valueOf(this.$request.getSource().getValue())).a(Integer.valueOf(this.$request.getPhotoCount())).a(this.$request.getUserId()).a(Boolean.valueOf(this.$request.isSuperLike())).a());
        }
    }
}
