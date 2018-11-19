package com.tinder.ads.analytics;

import com.tinder.ads.analytics.AdEventFields.Factory;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.aa;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\u000f"}, d2 = {"Lcom/tinder/ads/analytics/V1AddAdOpenEvent;", "Lcom/tinder/ads/analytics/AddAdEvent;", "Lcom/tinder/ads/analytics/V1AddAdOpenEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "adEventFieldsFactory", "Lcom/tinder/ads/analytics/AdEventFields$Factory;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/ads/analytics/AdEventFields$Factory;)V", "createEvent", "Lcom/tinder/etl/event/EtlEvent;", "request", "commonFields", "Lcom/tinder/ads/analytics/AdEventFields;", "AdOpenMethodType", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class V1AddAdOpenEvent extends AddAdEvent<Request> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/ads/analytics/V1AddAdOpenEvent$AdOpenMethodType;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "TAP", "SWIPE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum AdOpenMethodType {
        ;
        
        @NotNull
        private final String key;

        protected AdOpenMethodType(String str) {
            C2668g.b(str, "key");
            this.key = str;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/ads/analytics/V1AddAdOpenEvent$Request;", "", "adOpenMethodType", "Lcom/tinder/ads/analytics/V1AddAdOpenEvent$AdOpenMethodType;", "(Lcom/tinder/ads/analytics/V1AddAdOpenEvent$AdOpenMethodType;)V", "getAdOpenMethodType", "()Lcom/tinder/ads/analytics/V1AddAdOpenEvent$AdOpenMethodType;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Request {
        @NotNull
        private final AdOpenMethodType adOpenMethodType;

        @NotNull
        public static /* synthetic */ Request copy$default(Request request, AdOpenMethodType adOpenMethodType, int i, Object obj) {
            if ((i & 1) != 0) {
                adOpenMethodType = request.adOpenMethodType;
            }
            return request.copy(adOpenMethodType);
        }

        @NotNull
        public final AdOpenMethodType component1() {
            return this.adOpenMethodType;
        }

        @NotNull
        public final Request copy(@NotNull AdOpenMethodType adOpenMethodType) {
            C2668g.b(adOpenMethodType, "adOpenMethodType");
            return new Request(adOpenMethodType);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Request) {
                    if (C2668g.a(this.adOpenMethodType, ((Request) obj).adOpenMethodType)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            AdOpenMethodType adOpenMethodType = this.adOpenMethodType;
            return adOpenMethodType != null ? adOpenMethodType.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(adOpenMethodType=");
            stringBuilder.append(this.adOpenMethodType);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Request(@NotNull AdOpenMethodType adOpenMethodType) {
            C2668g.b(adOpenMethodType, "adOpenMethodType");
            this.adOpenMethodType = adOpenMethodType;
        }

        @NotNull
        public final AdOpenMethodType getAdOpenMethodType() {
            return this.adOpenMethodType;
        }
    }

    @Inject
    public V1AddAdOpenEvent(@NotNull C2630h c2630h, @NotNull Factory factory) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(factory, "adEventFieldsFactory");
        super(c2630h, factory);
    }

    @NotNull
    protected EtlEvent createEvent(@NotNull Request request, @NotNull AdEventFields adEventFields) {
        C2668g.b(request, "request");
        C2668g.b(adEventFields, "commonFields");
        request = aa.a().a(adEventFields.adCadence()).b(adEventFields.campaignId()).c(adEventFields.creativeId()).b(adEventFields.from().key()).a(adEventFields.mute()).c(adEventFields.provider().key()).d(Integer.valueOf(adEventFields.type().key())).a(request.getAdOpenMethodType().getKey()).a();
        C2668g.a(request, "AdOpenEvent.builder()\n  …key)\n            .build()");
        return (EtlEvent) request;
    }
}
