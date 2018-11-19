package com.tinder.ads.analytics;

import com.tinder.ads.analytics.AdEventFields.Factory;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.C11550x;
import com.tinder.etl.event.EtlEvent;

public class AddAdDetailsOpenEvent extends AddAdEvent<Request> {

    public static abstract class Request {

        public static abstract class Builder {
            public abstract Request build();

            public abstract Builder method(String str);

            public abstract Builder originalUrl(String str);

            public abstract Builder url(String str);
        }

        public abstract String method();

        public abstract String originalUrl();

        public abstract String url();

        public static Builder builder() {
            return new Builder();
        }
    }

    AddAdDetailsOpenEvent(C2630h c2630h, Factory factory) {
        super(c2630h, factory);
    }

    protected EtlEvent createEvent(Request request, AdEventFields adEventFields) {
        return C11550x.a().a(adEventFields.adCadence()).a(adEventFields.campaignId()).b(adEventFields.creativeId()).c(adEventFields.from().key()).a(adEventFields.mute()).b(adEventFields.provider().key()).c(String.valueOf(adEventFields.type().key())).a();
    }
}
