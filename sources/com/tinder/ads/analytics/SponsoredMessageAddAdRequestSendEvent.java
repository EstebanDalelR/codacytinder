package com.tinder.ads.analytics;

import com.tinder.addy.AdLoader;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/ads/analytics/SponsoredMessageAddAdRequestSendEvent;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/ads/analytics/SponsoredMessageAddAdRequestSendEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "Lio/reactivex/Completable;", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SponsoredMessageAddAdRequestSendEvent implements CompletableUseCase<Request> {
    private final C2630h fireworks;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/ads/analytics/SponsoredMessageAddAdRequestSendEvent$Request;", "", "loader", "Lcom/tinder/addy/AdLoader;", "(Lcom/tinder/addy/AdLoader;)V", "getLoader", "()Lcom/tinder/addy/AdLoader;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @NotNull
        private final AdLoader loader;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, AdLoader adLoader, int i, Object obj) {
            if ((i & 1) != 0) {
                adLoader = request.loader;
            }
            return request.copy(adLoader);
        }

        @NotNull
        public final AdLoader component1() {
            return this.loader;
        }

        @NotNull
        public final Request copy(@NotNull AdLoader adLoader) {
            C2668g.b(adLoader, "loader");
            return new Request(adLoader);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    if (C2668g.a(this.loader, ((Request) obj).loader)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            AdLoader adLoader = this.loader;
            return adLoader != null ? adLoader.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(loader=");
            stringBuilder.append(this.loader);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull AdLoader adLoader) {
            C2668g.b(adLoader, "loader");
            this.loader = adLoader;
        }

        @NotNull
        public final AdLoader getLoader() {
            return this.loader;
        }
    }

    @Inject
    public SponsoredMessageAddAdRequestSendEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.fireworks = c2630h;
    }

    @NotNull
    public C3956a execute(@NotNull Request request) {
        C2668g.b(request, "request");
        request = C3956a.a(new SponsoredMessageAddAdRequestSendEvent$execute$1(this, request));
        C2668g.a(request, "Completable.fromAction {…addEvent(event)\n        }");
        return request;
    }
}
