package com.tinder.ads.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AdEventFields.Factory;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.ae;

public class AddAdReplayEvent extends AddAdEvent<Request> {

    public static abstract class Request {

        public static abstract class Builder {
            public abstract Request build();

            public abstract Builder format(String str);

            public abstract Builder otherId(String str);

            public abstract Builder progress(Integer num);
        }

        @Nullable
        public abstract String format();

        @Nullable
        public abstract String otherId();

        @Nullable
        public abstract Integer progress();

        public static Builder builder() {
            return new Builder();
        }
    }

    public AddAdReplayEvent(C2630h c2630h, Factory factory) {
        super(c2630h, factory);
    }

    protected EtlEvent createEvent(@NonNull Request request, AdEventFields adEventFields) {
        return ae.a().a(adEventFields.adCadence()).a(adEventFields.campaignId()).b(adEventFields.creativeId()).b(adEventFields.from().key()).a(adEventFields.mute()).c(adEventFields.provider().key()).d(Integer.valueOf(adEventFields.type().key())).a();
    }
}
