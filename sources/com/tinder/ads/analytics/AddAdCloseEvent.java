package com.tinder.ads.analytics;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AdEventFields.Factory;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.C11503u;
import com.tinder.etl.event.EtlEvent;
import javax.inject.Inject;

public class AddAdCloseEvent extends AddAdEvent<Request> {

    public static abstract class Request {

        public static abstract class Builder {
            public abstract Request build();

            public abstract Builder like(boolean z);

            public abstract Builder method(@Nullable String str);

            public abstract Builder otherId(@Nullable String str);

            public abstract Builder progress(@Nullable Integer num);

            public abstract Builder timeViewed(@Nullable Integer num);
        }

        public abstract boolean like();

        @Nullable
        public abstract String method();

        @Nullable
        public abstract String otherId();

        @Nullable
        public abstract Integer progress();

        @Nullable
        public abstract Integer timeViewed();

        public static Builder builder() {
            return new Builder();
        }
    }

    @Inject
    AddAdCloseEvent(@NonNull C2630h c2630h, @NonNull Factory factory) {
        super(c2630h, factory);
    }

    protected EtlEvent createEvent(@NonNull Request request, AdEventFields adEventFields) {
        return C11503u.a().a(adEventFields.adCadence()).a(adEventFields.campaignId()).b(adEventFields.creativeId()).b(adEventFields.from().key()).a(Boolean.valueOf(request.like())).b(adEventFields.mute()).e(request.progress()).c(adEventFields.provider().key()).f(request.timeViewed()).d(Integer.valueOf(adEventFields.type().key())).a();
    }
}
