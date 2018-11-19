package com.tinder.ads.tracking;

import com.tinder.ads.Ad;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/ads/tracking/TrackingUrlFactory;", "", "createTrackingUrls", "", "Lcom/tinder/ads/tracking/TrackingUrl;", "AD", "Lcom/tinder/ads/Ad;", "ad", "trackingEvent", "Lcom/tinder/ads/tracking/TrackingEvent;", "(Lcom/tinder/ads/Ad;Lcom/tinder/ads/tracking/TrackingEvent;)Ljava/util/List;", "tracking_release"}, k = 1, mv = {1, 1, 7})
public interface TrackingUrlFactory {
    @NotNull
    <AD extends Ad<?>> List<TrackingUrl> createTrackingUrls(@NotNull AD ad, @NotNull TrackingEvent trackingEvent);
}
