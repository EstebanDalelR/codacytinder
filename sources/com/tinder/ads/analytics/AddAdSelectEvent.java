package com.tinder.ads.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AdEventFields.Factory;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.ah;
import javax.inject.Inject;

public class AddAdSelectEvent extends AddAdEvent<Request> {
    public static final int ACTION_CTA_BUTTON = 7;
    public static final int ACTION_IMAGE_OR_VIDEO = 4;
    public static final int ACTION_MUTE_OR_UNMUTE = 8;
    public static final int ACTION_PAUSE = 1;
    public static final int ACTION_SPONSORED = 6;
    public static final int ACTION_TITLE = 5;

    public static abstract class Request {

        public static abstract class Builder {
            public abstract Builder action(int i);

            public abstract Request build();

            public abstract Builder progress(Float f);

            public abstract Builder timeViewed(Integer num);
        }

        public abstract int action();

        @Nullable
        public abstract Float progress();

        @Nullable
        public abstract Integer timeViewed();

        public static Builder builder() {
            return new Builder();
        }
    }

    @Inject
    AddAdSelectEvent(@NonNull C2630h c2630h, @NonNull Factory factory) {
        super(c2630h, factory);
    }

    protected EtlEvent createEvent(Request request, AdEventFields adEventFields) {
        return ah.a().b(adEventFields.adCadence()).a(adEventFields.campaignId()).b(adEventFields.creativeId()).c(adEventFields.from().key()).a(adEventFields.mute()).f(request.progress()).d(adEventFields.provider().key()).g(request.timeViewed()).e(Integer.valueOf(adEventFields.type().key())).g(request.timeViewed()).a(Integer.valueOf(request.action())).a();
    }
}
