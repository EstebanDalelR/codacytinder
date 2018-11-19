package com.tinder.addy.tracker;

import com.tinder.addy.tracker.TrackingUrl.EventType;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/tinder/addy/tracker/TrackingUrlRepository;", "", "deleteExpiredTrackingUrls", "Lrx/Completable;", "insertTrackingUrls", "trackingUrls", "", "Lcom/tinder/addy/tracker/TrackingUrl;", "loadTrackingUrls", "Lrx/Single;", "adId", "", "eventType", "Lcom/tinder/addy/tracker/TrackingUrl$EventType;", "addy_release"}, k = 1, mv = {1, 1, 10})
public interface TrackingUrlRepository {
    @NotNull
    Completable deleteExpiredTrackingUrls();

    @NotNull
    Completable insertTrackingUrls(@NotNull List<TrackingUrl> list);

    @NotNull
    Single<List<TrackingUrl>> loadTrackingUrls(@NotNull String str, @NotNull EventType eventType);
}
