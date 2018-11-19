package com.tinder.ads.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AdEventFields.Factory;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.ak;
import javax.inject.Inject;

public class AddAdViewEvent extends AddAdEvent<Request> {

    public static abstract class Request {

        public static abstract class Builder {
            public abstract Builder aspectRatio(@Nullable Number number);

            public abstract Request build();

            public abstract Builder format(@Nullable String str);

            public abstract Builder otherId(@Nullable String str);

            public abstract Builder thirdPartyTrackingUrl(@Nullable String str);
        }

        @Nullable
        public abstract Number aspectRatio();

        @Nullable
        public abstract String format();

        @Nullable
        public abstract String otherId();

        @Nullable
        public abstract String thirdPartyTrackingUrl();

        public static Builder builder() {
            return new Builder();
        }
    }

    @Inject
    public AddAdViewEvent(C2630h c2630h, Factory factory) {
        super(c2630h, factory);
    }

    protected EtlEvent createEvent(@NonNull Request request, AdEventFields adEventFields) {
        return ak.a().a(adEventFields.adCadence()).a(adEventFields.campaignId()).b(adEventFields.creativeId()).b(adEventFields.from().key()).a(adEventFields.mute()).c(adEventFields.provider().key()).d(Integer.valueOf(adEventFields.type().key())).e(request.aspectRatio()).c(request.format()).a();
    }
}
