package com.tinder.recs.analytics;

import com.tinder.domain.recs.DeepLinkReferralInfo;
import com.tinder.etl.event.ub;
import com.tinder.etl.event.ub.C9278a;
import com.tinder.recs.analytics.AddRecsPhotoViewEvent.RecsPhotoViewEventRequest;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class AddRecsPhotoViewEvent$execute$1 implements Action0 {
    final /* synthetic */ RecsPhotoViewEventRequest $request;
    final /* synthetic */ AddRecsPhotoViewEvent this$0;

    AddRecsPhotoViewEvent$execute$1(AddRecsPhotoViewEvent addRecsPhotoViewEvent, RecsPhotoViewEventRequest recsPhotoViewEventRequest) {
        this.this$0 = addRecsPhotoViewEvent;
        this.$request = recsPhotoViewEventRequest;
    }

    public final void call() {
        if (!this.this$0.duplicateEventsChecker.isDuplicate(this.$request)) {
            C9278a b = ub.a().a(Boolean.valueOf(this.$request.isSuperLike())).d(this.$request.getUserId()).a(Integer.valueOf(this.$request.getSource().getValue())).b(this.$request.getPhotoId());
            DeepLinkReferralInfo deepLinkReferralInfo = this.$request.getDeepLinkReferralInfo();
            String str = null;
            b = b.a(deepLinkReferralInfo != null ? deepLinkReferralInfo.from() : null);
            deepLinkReferralInfo = this.$request.getDeepLinkReferralInfo();
            if (deepLinkReferralInfo != null) {
                str = deepLinkReferralInfo.referralUrl();
            }
            this.this$0.fireworks.a(b.c(str).a());
        }
    }
}
