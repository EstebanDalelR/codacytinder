package com.tinder.domain.ads;

import com.tinder.domain.ads.PingTrackingUrls.Request;
import com.tinder.domain.common.TrackingUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.joda.time.DateTime;
import rx.Completable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "REQUEST", "Lcom/tinder/domain/ads/PingTrackingUrls$Request;", "trackingUrls", "", "Lcom/tinder/domain/common/TrackingUrl;", "call"}, k = 3, mv = {1, 1, 10})
final class PingTrackingUrls$execute$2<T, R> implements Func1<List<? extends TrackingUrl>, Completable> {
    final /* synthetic */ Request $request;
    final /* synthetic */ PingTrackingUrls this$0;

    PingTrackingUrls$execute$2(PingTrackingUrls pingTrackingUrls, Request request) {
        this.this$0 = pingTrackingUrls;
        this.$request = request;
    }

    public final Completable call(List<TrackingUrl> list) {
        DateTime dateTime = this.$request.dateTime();
        C2668g.a(list, "trackingUrls");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (this.this$0.shouldPingUrl((TrackingUrl) next, dateTime)) {
                arrayList.add(next);
            }
        }
        Iterable<TrackingUrl> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(C19301m.a(iterable, 10));
        for (TrackingUrl trackingUrl : iterable) {
            arrayList2.add(this.this$0.trackingUrlRepository.notifyTrackingUrl(trackingUrl).b(this.this$0.trackingUrlRepository.updatePingTimes(this.$request.templateId(), this.$request.event(), trackingUrl.getUrl(), dateTime)));
        }
        return Completable.a((List) arrayList2);
    }
}
