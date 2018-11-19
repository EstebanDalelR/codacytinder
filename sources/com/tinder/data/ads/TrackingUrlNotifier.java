package com.tinder.data.ads;

import com.tinder.domain.common.TrackingUrl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/data/ads/TrackingUrlNotifier;", "", "notifyTrackingUrl", "Lrx/Completable;", "trackingUrl", "Lcom/tinder/domain/common/TrackingUrl;", "data_release"}, k = 1, mv = {1, 1, 10})
public interface TrackingUrlNotifier {
    @NotNull
    Completable notifyTrackingUrl(@NotNull TrackingUrl trackingUrl);
}
