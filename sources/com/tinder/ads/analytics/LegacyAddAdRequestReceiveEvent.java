package com.tinder.ads.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AdEventFields.Factory;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.af;
import javax.inject.Inject;

public class LegacyAddAdRequestReceiveEvent extends AddAdEvent<Request> {

    public static abstract class Request {

        public static abstract class Builder {
            public abstract Builder adBody(String str);

            public abstract Request build();

            public abstract Builder cta(String str);

            public abstract Builder title(String str);
        }

        @Nullable
        public abstract String adBody();

        @Nullable
        public abstract String cta();

        @Nullable
        public abstract String title();

        public static Builder builder() {
            return new Builder();
        }
    }

    @Inject
    LegacyAddAdRequestReceiveEvent(C2630h c2630h, Factory factory) {
        super(c2630h, factory);
    }

    protected EtlEvent createEvent(@NonNull Request request, AdEventFields adEventFields) {
        return af.a().a(adEventFields.adCadence()).b(adEventFields.campaignId()).c(adEventFields.creativeId()).b(adEventFields.from().key()).a(adEventFields.mute()).c(adEventFields.provider().key()).d(Integer.valueOf(adEventFields.type().key())).e(request.title()).d(request.cta()).a(request.adBody()).a();
    }
}
