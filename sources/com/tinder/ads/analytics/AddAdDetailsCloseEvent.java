package com.tinder.ads.analytics;

import android.support.annotation.NonNull;
import com.tinder.ads.analytics.AdEventFields.Factory;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.C11539w;
import com.tinder.etl.event.EtlEvent;

public class AddAdDetailsCloseEvent extends AddAdEvent<Request> {

    public static abstract class Request {

        public static abstract class Builder {
            public abstract Request build();

            public abstract Builder like(Boolean bool);

            public abstract Builder method(String str);

            public abstract Builder originalUrl(String str);

            public abstract Builder otherId(String str);

            public abstract Builder paused(Boolean bool);

            public abstract Builder progress(Number number);

            public abstract Builder timeViewed(Number number);

            public abstract Builder url(String str);
        }

        @NonNull
        public abstract Boolean like();

        @NonNull
        public abstract String method();

        @NonNull
        public abstract String originalUrl();

        @NonNull
        public abstract String otherId();

        @NonNull
        public abstract Boolean paused();

        @NonNull
        public abstract Number progress();

        @NonNull
        public abstract Number timeViewed();

        @NonNull
        public abstract String url();

        public static Builder builder() {
            return new Builder();
        }
    }

    AddAdDetailsCloseEvent(C2630h c2630h, Factory factory) {
        super(c2630h, factory);
    }

    protected EtlEvent createEvent(Request request, AdEventFields adEventFields) {
        return C11539w.a().a(adEventFields.adCadence()).a(adEventFields.campaignId()).b(adEventFields.creativeId()).c(adEventFields.from().key()).a(adEventFields.mute()).b(adEventFields.provider().key()).c(String.valueOf(adEventFields.type().key())).a();
    }
}
