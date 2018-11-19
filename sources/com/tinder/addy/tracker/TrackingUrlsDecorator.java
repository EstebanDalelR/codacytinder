package com.tinder.addy.tracker;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/addy/tracker/TrackingUrlsDecorator;", "", "decorate", "", "Lcom/tinder/addy/tracker/TrackingUrl;", "trackingUrls", "adUrlTracker", "Lcom/tinder/addy/tracker/AdUrlTracker;", "addy_release"}, k = 1, mv = {1, 1, 10})
public interface TrackingUrlsDecorator {
    @NotNull
    List<TrackingUrl> decorate(@NotNull List<TrackingUrl> list, @NotNull AdUrlTracker adUrlTracker);
}
