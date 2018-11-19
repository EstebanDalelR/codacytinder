package com.tinder.addy.ping;

import com.tinder.addy.tracker.TrackingUrl;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/tinder/addy/ping/PingRepository;", "", "createPing", "Lrx/Completable;", "trackingUrl", "Lcom/tinder/addy/tracker/TrackingUrl;", "pingTimeMs", "", "loadLastPingForTrackingUrls", "Lrx/Single;", "", "Lcom/tinder/addy/ping/Ping;", "trackingUrls", "loadPingsForTrackingUrl", "addy_release"}, k = 1, mv = {1, 1, 10})
public interface PingRepository {
    @NotNull
    Completable createPing(@NotNull TrackingUrl trackingUrl, long j);

    @NotNull
    Single<List<C6188a>> loadLastPingForTrackingUrls(@NotNull List<TrackingUrl> list);

    @NotNull
    Single<List<C6188a>> loadPingsForTrackingUrl(@NotNull TrackingUrl trackingUrl);
}
