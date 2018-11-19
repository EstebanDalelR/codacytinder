package com.tinder.ads.analytics;

import com.tinder.ads.analytics.SponsoredMessageAddAdRequestReceiveEvent.Request;
import com.tinder.etl.event.af;
import com.tinder.recsads.analytics.AdEventFields;
import com.tinder.recsads.analytics.AdEventFields.From;
import io.reactivex.functions.Action;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class SponsoredMessageAddAdRequestReceiveEvent$execute$1 implements Action {
    final /* synthetic */ Request $request;
    final /* synthetic */ SponsoredMessageAddAdRequestReceiveEvent this$0;

    SponsoredMessageAddAdRequestReceiveEvent$execute$1(SponsoredMessageAddAdRequestReceiveEvent sponsoredMessageAddAdRequestReceiveEvent, Request request) {
        this.this$0 = sponsoredMessageAddAdRequestReceiveEvent;
        this.$request = request;
    }

    public final void run() {
        AdEventFields a = this.this$0.adEventFieldsFactory.a(this.$request.getAd(), From.POST_MATCH, this.this$0.provider(this.$request.getAd()));
        this.this$0.fireworks.a(af.a().b(a.c()).c(a.b()).b(a.f().key()).c(a.d().key()).d(Integer.valueOf(a.e().key())).e(this.$request.getTitle()).a(this.$request.getBody()).a());
    }
}
