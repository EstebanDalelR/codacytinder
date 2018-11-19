package com.tinder.domain.ads;

import com.tinder.domain.common.TrackingUrl;
import com.tinder.domain.common.TrackingUrl.Event;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.domain.match.repository.TrackingUrlRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import rx.Completable;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/domain/ads/PingTrackingUrls;", "REQUEST", "Lcom/tinder/domain/ads/PingTrackingUrls$Request;", "Lcom/tinder/domain/common/usecase/CompletableUseCase;", "trackingUrlRepository", "Lcom/tinder/domain/match/repository/TrackingUrlRepository;", "(Lcom/tinder/domain/match/repository/TrackingUrlRepository;)V", "execute", "Lrx/Completable;", "request", "(Lcom/tinder/domain/ads/PingTrackingUrls$Request;)Lrx/Completable;", "loadTrackingUrls", "Lrx/Observable;", "", "Lcom/tinder/domain/common/TrackingUrl;", "(Lcom/tinder/domain/ads/PingTrackingUrls$Request;)Lrx/Observable;", "shouldPingUrl", "", "trackingUrl", "dateTime", "Lorg/joda/time/DateTime;", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class PingTrackingUrls<REQUEST extends Request> implements CompletableUseCase<REQUEST> {
    private final TrackingUrlRepository trackingUrlRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/domain/ads/PingTrackingUrls$Request;", "", "dateTime", "Lorg/joda/time/DateTime;", "event", "Lcom/tinder/domain/common/TrackingUrl$Event;", "templateId", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public interface Request {
        @NotNull
        DateTime dateTime();

        @NotNull
        Event event();

        @NotNull
        String templateId();
    }

    @NotNull
    public abstract Observable<List<TrackingUrl>> loadTrackingUrls(@NotNull REQUEST request);

    public PingTrackingUrls(@NotNull TrackingUrlRepository trackingUrlRepository) {
        C2668g.b(trackingUrlRepository, "trackingUrlRepository");
        this.trackingUrlRepository = trackingUrlRepository;
    }

    @NotNull
    public Completable execute(@NotNull REQUEST request) {
        C2668g.b(request, "request");
        request = loadTrackingUrls(request).h().f(PingTrackingUrls$execute$1.INSTANCE).i(new PingTrackingUrls$execute$2(this, request)).b();
        C2668g.a(request, "loadTrackingUrls(request…         .toCompletable()");
        return request;
    }

    private final boolean shouldPingUrl(TrackingUrl trackingUrl, DateTime dateTime) {
        if (trackingUrl.getPingTime() == null) {
            return true;
        }
        if (!trackingUrl.getUnique()) {
            if (trackingUrl.getEvent() != Event.IMPRESSION) {
                return true;
            }
            trackingUrl = Minutes.a(trackingUrl.getPingTime(), dateTime);
            C2668g.a(trackingUrl, "Minutes.minutesBetween(t…ngUrl.pingTime, dateTime)");
            if (trackingUrl.b() > 30) {
                return true;
            }
        }
        return false;
    }
}
