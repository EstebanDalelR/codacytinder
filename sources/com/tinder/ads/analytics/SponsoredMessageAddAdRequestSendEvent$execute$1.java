package com.tinder.ads.analytics;

import com.tinder.ads.analytics.SponsoredMessageAddAdRequestSendEvent.Request;
import com.tinder.etl.event.ag;
import com.tinder.recsads.analytics.AdEventFields.From;
import com.tinder.recsads.analytics.Provider;
import io.reactivex.functions.Action;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class SponsoredMessageAddAdRequestSendEvent$execute$1 implements Action {
    final /* synthetic */ Request $request;
    final /* synthetic */ SponsoredMessageAddAdRequestSendEvent this$0;

    SponsoredMessageAddAdRequestSendEvent$execute$1(SponsoredMessageAddAdRequestSendEvent sponsoredMessageAddAdRequestSendEvent, Request request) {
        this.this$0 = sponsoredMessageAddAdRequestSendEvent;
        this.$request = request;
    }

    public final void run() {
        this.this$0.fireworks.a(ag.a().c(Provider.Companion.a(this.$request.getLoader()).key()).b(From.POST_MATCH.key()).a());
    }
}
