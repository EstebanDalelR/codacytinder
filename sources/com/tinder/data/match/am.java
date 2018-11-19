package com.tinder.data.match;

import com.tinder.data.ads.TrackingUrlNotifier;
import com.tinder.domain.common.TrackingUrl;
import com.tinder.domain.common.TrackingUrl.Event;
import com.tinder.domain.match.repository.TrackingUrlRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Completable;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\rH\u0016J$\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J,\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00112\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0016J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/data/match/TrackingUrlDataRepository;", "Lcom/tinder/domain/match/repository/TrackingUrlRepository;", "trackingUrlNotifier", "Lcom/tinder/data/ads/TrackingUrlNotifier;", "trackingUrlDataStore", "Lcom/tinder/data/match/TrackingUrlDataStore;", "(Lcom/tinder/data/ads/TrackingUrlNotifier;Lcom/tinder/data/match/TrackingUrlDataStore;)V", "insert", "Lrx/Completable;", "templateId", "", "trackingUrls", "", "Lcom/tinder/domain/common/TrackingUrl;", "notifyTrackingUrl", "trackingUrl", "observeActive", "Lrx/Observable;", "event", "Lcom/tinder/domain/common/TrackingUrl$Event;", "observeActiveForLineItemId", "lineItemId", "updatePingTimes", "url", "pingTime", "Lorg/joda/time/DateTime;", "data_release"}, k = 1, mv = {1, 1, 10})
public final class am implements TrackingUrlRepository {
    /* renamed from: a */
    private final TrackingUrlNotifier f35241a;
    /* renamed from: b */
    private final an f35242b;

    public am(@NotNull TrackingUrlNotifier trackingUrlNotifier, @NotNull an anVar) {
        C2668g.b(trackingUrlNotifier, "trackingUrlNotifier");
        C2668g.b(anVar, "trackingUrlDataStore");
        this.f35241a = trackingUrlNotifier;
        this.f35242b = anVar;
    }

    @NotNull
    public Completable insert(@NotNull String str, @NotNull List<TrackingUrl> list) {
        C2668g.b(str, "templateId");
        C2668g.b(list, "trackingUrls");
        return this.f35242b.m36959a(str, (List) list);
    }

    @NotNull
    public Completable updatePingTimes(@NotNull String str, @NotNull Event event, @NotNull String str2, @NotNull DateTime dateTime) {
        C2668g.b(str, "templateId");
        C2668g.b(event, "event");
        C2668g.b(str2, "url");
        C2668g.b(dateTime, "pingTime");
        return this.f35242b.m36958a(str, event, str2, dateTime);
    }

    @NotNull
    public Observable<List<TrackingUrl>> observeActive(@NotNull String str, @NotNull Event event) {
        C2668g.b(str, "templateId");
        C2668g.b(event, "event");
        return this.f35242b.m36960a(str, event);
    }

    @NotNull
    public Observable<List<TrackingUrl>> observeActiveForLineItemId(@NotNull String str, @NotNull Event event, @NotNull String str2) {
        C2668g.b(str, "templateId");
        C2668g.b(event, "event");
        C2668g.b(str2, "lineItemId");
        return this.f35242b.m36961a(str, event, str2);
    }

    @NotNull
    public Completable notifyTrackingUrl(@NotNull TrackingUrl trackingUrl) {
        C2668g.b(trackingUrl, "trackingUrl");
        return this.f35241a.notifyTrackingUrl(trackingUrl);
    }
}
