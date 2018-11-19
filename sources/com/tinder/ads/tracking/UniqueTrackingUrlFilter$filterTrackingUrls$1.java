package com.tinder.ads.tracking;

import kotlin.Metadata;
import kotlin.text.C19303i;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/ads/tracking/TrackingUrl;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 7})
final class UniqueTrackingUrlFilter$filterTrackingUrls$1<T, R> implements Func1<TrackingUrl, Boolean> {
    final /* synthetic */ PingStore $pingStore;

    UniqueTrackingUrlFilter$filterTrackingUrls$1(PingStore pingStore) {
        this.$pingStore = pingStore;
    }

    public /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((TrackingUrl) obj));
    }

    public final boolean call(TrackingUrl trackingUrl) {
        boolean z = true;
        if (!C19303i.b(trackingUrl.getUrl(), "unique", false, 2, null)) {
            return true;
        }
        if (this.$pingStore.load(trackingUrl.getUrl()).getTimestamp() != null) {
            z = false;
        }
        return z;
    }
}
