package com.tinder.domain.ads;

import com.tinder.domain.common.TrackingUrl;
import java.util.List;
import kotlin.Metadata;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "REQUEST", "Lcom/tinder/domain/ads/PingTrackingUrls$Request;", "trackingUrls", "", "Lcom/tinder/domain/common/TrackingUrl;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class PingTrackingUrls$execute$1<T, R> implements Func1<List<? extends TrackingUrl>, Boolean> {
    public static final PingTrackingUrls$execute$1 INSTANCE = new PingTrackingUrls$execute$1();

    PingTrackingUrls$execute$1() {
    }

    public /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((List) obj));
    }

    public final boolean call(List<TrackingUrl> list) {
        return list.isEmpty() ^ 1;
    }
}
