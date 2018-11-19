package com.tinder.ads.analytics;

import com.tinder.addy.Ad;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.messageads.model.MessageAdType;
import com.tinder.recsads.analytics.AdEventFields.C14729c;
import com.tinder.recsads.analytics.Provider;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/ads/analytics/SponsoredMessageAddAdRequestReceiveEvent;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/ads/analytics/SponsoredMessageAddAdRequestReceiveEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "adEventFieldsFactory", "Lcom/tinder/recsads/analytics/AdEventFields$Factory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/recsads/analytics/AdEventFields$Factory;)V", "execute", "Lio/reactivex/Completable;", "request", "provider", "Lcom/tinder/recsads/analytics/Provider;", "Lcom/tinder/addy/Ad;", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SponsoredMessageAddAdRequestReceiveEvent implements CompletableUseCase<Request> {
    private final C14729c adEventFieldsFactory;
    private final C2630h fireworks;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tinder/ads/analytics/SponsoredMessageAddAdRequestReceiveEvent$Request;", "", "ad", "Lcom/tinder/addy/Ad;", "title", "", "body", "(Lcom/tinder/addy/Ad;Ljava/lang/String;Ljava/lang/String;)V", "getAd", "()Lcom/tinder/addy/Ad;", "getBody", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @NotNull
        private final Ad ad;
        @NotNull
        private final String body;
        @NotNull
        private final String title;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, Ad ad, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                ad = request.ad;
            }
            if ((i & 2) != 0) {
                str = request.title;
            }
            if ((i & 4) != 0) {
                str2 = request.body;
            }
            return request.copy(ad, str, str2);
        }

        @NotNull
        public final Ad component1() {
            return this.ad;
        }

        @NotNull
        public final String component2() {
            return this.title;
        }

        @NotNull
        public final String component3() {
            return this.body;
        }

        @NotNull
        public final Request copy(@NotNull Ad ad, @NotNull String str, @NotNull String str2) {
            C2668g.b(ad, "ad");
            C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
            C2668g.b(str2, "body");
            return new Request(ad, str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    Request request = (Request) obj;
                    if (C2668g.a(this.ad, request.ad) && C2668g.a(this.title, request.title) && C2668g.a(this.body, request.body)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Ad ad = this.ad;
            int i = 0;
            int hashCode = (ad != null ? ad.hashCode() : 0) * 31;
            String str = this.title;
            hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            str = this.body;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(ad=");
            stringBuilder.append(this.ad);
            stringBuilder.append(", title=");
            stringBuilder.append(this.title);
            stringBuilder.append(", body=");
            stringBuilder.append(this.body);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull Ad ad, @NotNull String str, @NotNull String str2) {
            C2668g.b(ad, "ad");
            C2668g.b(str, ManagerWebServices.PARAM_JOB_TITLE);
            C2668g.b(str2, "body");
            this.ad = ad;
            this.title = str;
            this.body = str2;
        }

        @NotNull
        public final Ad getAd() {
            return this.ad;
        }

        @NotNull
        public final String getBody() {
            return this.body;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }
    }

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[MessageAdType.values().length];

        static {
            $EnumSwitchMapping$0[MessageAdType.SPONSORED_MESSAGE.ordinal()] = 1;
            $EnumSwitchMapping$0[MessageAdType.TINDER_UPDATE_MESSAGE.ordinal()] = 2;
        }
    }

    @Inject
    public SponsoredMessageAddAdRequestReceiveEvent(@NotNull C2630h c2630h, @NotNull C14729c c14729c) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c14729c, "adEventFieldsFactory");
        this.fireworks = c2630h;
        this.adEventFieldsFactory = c14729c;
    }

    @NotNull
    public C3956a execute(@NotNull Request request) {
        C2668g.b(request, "request");
        request = C3956a.a(new SponsoredMessageAddAdRequestReceiveEvent$execute$1(this, request));
        C2668g.a(request, "Completable.fromAction {…addEvent(event)\n        }");
        return request;
    }

    private final Provider provider(@NotNull Ad ad) {
        ad = ad.adType();
        if (!(ad instanceof MessageAdType)) {
            ad = null;
        }
        MessageAdType messageAdType = (MessageAdType) ad;
        if (messageAdType == null) {
            return Provider.OTHER;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[messageAdType.ordinal()]) {
            case 1:
                ad = Provider.DFP;
                break;
            case 2:
                ad = Provider.OTHER;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return ad;
    }
}
