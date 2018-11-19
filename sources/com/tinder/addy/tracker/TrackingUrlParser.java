package com.tinder.addy.tracker;

import com.tinder.addy.Ad;
import com.tinder.addy.tracker.TrackingUrl.EventType;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&¨\u0006\t"}, d2 = {"Lcom/tinder/addy/tracker/TrackingUrlParser;", "", "parseTrackingUrls", "", "Lcom/tinder/addy/tracker/TrackingUrl;", "ad", "Lcom/tinder/addy/Ad;", "trackedEventTypes", "Lcom/tinder/addy/tracker/TrackingUrl$EventType;", "addy_release"}, k = 1, mv = {1, 1, 10})
public interface TrackingUrlParser {
    @NotNull
    List<TrackingUrl> parseTrackingUrls(@NotNull Ad ad);

    @NotNull
    List<EventType> trackedEventTypes();
}
