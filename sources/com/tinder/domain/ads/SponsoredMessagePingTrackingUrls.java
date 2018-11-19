package com.tinder.domain.ads;

import com.tinder.domain.common.TrackingUrl;
import com.tinder.domain.common.TrackingUrl.Event;
import com.tinder.domain.match.repository.TrackingUrlRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/domain/ads/SponsoredMessagePingTrackingUrls;", "Lcom/tinder/domain/ads/PingTrackingUrls;", "Lcom/tinder/domain/ads/SponsoredMessagePingTrackingUrls$Request;", "trackingUrlRepository", "Lcom/tinder/domain/match/repository/TrackingUrlRepository;", "(Lcom/tinder/domain/match/repository/TrackingUrlRepository;)V", "loadTrackingUrls", "Lrx/Observable;", "", "Lcom/tinder/domain/common/TrackingUrl;", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SponsoredMessagePingTrackingUrls extends PingTrackingUrls<Request> {
    private final TrackingUrlRepository trackingUrlRepository;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/tinder/domain/ads/SponsoredMessagePingTrackingUrls$Request;", "Lcom/tinder/domain/ads/PingTrackingUrls$Request;", "templateId", "", "event", "Lcom/tinder/domain/common/TrackingUrl$Event;", "dateTime", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Lcom/tinder/domain/common/TrackingUrl$Event;Lorg/joda/time/DateTime;)V", "getDateTime", "()Lorg/joda/time/DateTime;", "getEvent", "()Lcom/tinder/domain/common/TrackingUrl$Event;", "getTemplateId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request implements com.tinder.domain.ads.PingTrackingUrls.Request {
        @NotNull
        private final DateTime dateTime;
        @NotNull
        private final Event event;
        @NotNull
        private final String templateId;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, String str, Event event, DateTime dateTime, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.templateId;
            }
            if ((i & 2) != 0) {
                event = request.event;
            }
            if ((i & 4) != 0) {
                dateTime = request.dateTime;
            }
            return request.copy(str, event, dateTime);
        }

        @NotNull
        public final String component1() {
            return this.templateId;
        }

        @NotNull
        public final Event component2() {
            return this.event;
        }

        @NotNull
        public final DateTime component3() {
            return this.dateTime;
        }

        @NotNull
        public final Request copy(@NotNull String str, @NotNull Event event, @NotNull DateTime dateTime) {
            C2668g.b(str, "templateId");
            C2668g.b(event, "event");
            C2668g.b(dateTime, "dateTime");
            return new Request(str, event, dateTime);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    Request request = (Request) obj;
                    if (C2668g.a(this.templateId, request.templateId) && C2668g.a(this.event, request.event) && C2668g.a(this.dateTime, request.dateTime)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.templateId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Event event = this.event;
            hashCode = (hashCode + (event != null ? event.hashCode() : 0)) * 31;
            DateTime dateTime = this.dateTime;
            if (dateTime != null) {
                i = dateTime.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(templateId=");
            stringBuilder.append(this.templateId);
            stringBuilder.append(", event=");
            stringBuilder.append(this.event);
            stringBuilder.append(", dateTime=");
            stringBuilder.append(this.dateTime);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull String str, @NotNull Event event, @NotNull DateTime dateTime) {
            C2668g.b(str, "templateId");
            C2668g.b(event, "event");
            C2668g.b(dateTime, "dateTime");
            this.templateId = str;
            this.event = event;
            this.dateTime = dateTime;
        }

        @NotNull
        public final String getTemplateId() {
            return this.templateId;
        }

        @NotNull
        public final Event getEvent() {
            return this.event;
        }

        public /* synthetic */ Request(String str, Event event, DateTime dateTime, int i, C15823e c15823e) {
            if ((i & 4) != 0) {
                dateTime = DateTime.a();
                C2668g.a(dateTime, "DateTime.now()");
            }
            this(str, event, dateTime);
        }

        @NotNull
        public final DateTime getDateTime() {
            return this.dateTime;
        }

        @NotNull
        public String templateId() {
            return this.templateId;
        }

        @NotNull
        public Event event() {
            return this.event;
        }

        @NotNull
        public DateTime dateTime() {
            return this.dateTime;
        }
    }

    @Inject
    public SponsoredMessagePingTrackingUrls(@NotNull TrackingUrlRepository trackingUrlRepository) {
        C2668g.b(trackingUrlRepository, "trackingUrlRepository");
        super(trackingUrlRepository);
        this.trackingUrlRepository = trackingUrlRepository;
    }

    @NotNull
    public Observable<List<TrackingUrl>> loadTrackingUrls(@NotNull Request request) {
        C2668g.b(request, "request");
        return this.trackingUrlRepository.observeActive(request.getTemplateId(), request.getEvent());
    }
}
