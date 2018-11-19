package com.tinder.ads.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AdEventFields.Factory;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.C11530v;
import com.tinder.etl.event.EtlEvent;
import javax.inject.Inject;

public class AddAdCompleteEvent extends AddAdEvent<Request> {

    public static abstract class Request {

        public static abstract class Builder {
            public abstract Request build();

            public abstract Builder carouselLength(Number number);

            public abstract Builder format(String str);
        }

        @Nullable
        public abstract Number carouselLength();

        @Nullable
        public abstract String format();

        public static Builder builder() {
            return new Builder();
        }
    }

    @Inject
    AddAdCompleteEvent(C2630h c2630h, Factory factory) {
        super(c2630h, factory);
    }

    protected EtlEvent createEvent(@NonNull Request request, AdEventFields adEventFields) {
        return C11530v.a().a(adEventFields.adCadence()).a(adEventFields.campaignId()).e(request.carouselLength()).b(adEventFields.creativeId()).b(adEventFields.from().key()).a(adEventFields.mute()).c(adEventFields.provider().key()).d(Integer.valueOf(adEventFields.type().key())).a();
    }
}
