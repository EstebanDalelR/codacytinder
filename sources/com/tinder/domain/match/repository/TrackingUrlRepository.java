package com.tinder.domain.match.repository;

import com.tinder.domain.common.TrackingUrl;
import com.tinder.domain.common.TrackingUrl.Event;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH&J,\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H&J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/match/repository/TrackingUrlRepository;", "", "insert", "Lrx/Completable;", "templateId", "", "trackingUrls", "", "Lcom/tinder/domain/common/TrackingUrl;", "notifyTrackingUrl", "trackingUrl", "observeActive", "Lrx/Observable;", "event", "Lcom/tinder/domain/common/TrackingUrl$Event;", "observeActiveForLineItemId", "lineItemId", "updatePingTimes", "url", "pingTime", "Lorg/joda/time/DateTime;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface TrackingUrlRepository {
    @NotNull
    Completable insert(@NotNull String str, @NotNull List<TrackingUrl> list);

    @NotNull
    Completable notifyTrackingUrl(@NotNull TrackingUrl trackingUrl);

    @NotNull
    Observable<List<TrackingUrl>> observeActive(@NotNull String str, @NotNull Event event);

    @NotNull
    Observable<List<TrackingUrl>> observeActiveForLineItemId(@NotNull String str, @NotNull Event event, @NotNull String str2);

    @NotNull
    Completable updatePingTimes(@NotNull String str, @NotNull Event event, @NotNull String str2, @NotNull DateTime dateTime);
}
