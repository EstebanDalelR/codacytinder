package com.tinder.ads.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AdEventFields.Factory;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.ai;
import javax.inject.Inject;

public class AddAdToggleAudioEvent extends AddAdEvent<Request> {

    public static abstract class Request {

        public static abstract class Builder {
            public abstract Request build();

            public abstract Builder progress(Number number);

            public abstract Builder timeViewed(Number number);
        }

        @Nullable
        public abstract Number progress();

        @Nullable
        public abstract Number timeViewed();

        public static Builder builder() {
            return new Builder();
        }
    }

    @Inject
    AddAdToggleAudioEvent(C2630h c2630h, Factory factory) {
        super(c2630h, factory);
    }

    protected EtlEvent createEvent(@NonNull Request request, AdEventFields adEventFields) {
        return ai.a().a(adEventFields.adCadence()).a(adEventFields.campaignId()).b(adEventFields.creativeId()).b(adEventFields.from().key()).a(adEventFields.mute()).c(adEventFields.provider().key()).d(Integer.valueOf(adEventFields.type().key())).e(request.progress()).f(request.timeViewed()).a();
    }
}
