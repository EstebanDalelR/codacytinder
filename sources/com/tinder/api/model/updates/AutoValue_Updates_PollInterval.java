package com.tinder.api.model.updates;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.updates.Updates.PollInterval;
import java.io.IOException;

final class AutoValue_Updates_PollInterval extends C$AutoValue_Updates_PollInterval {

    public static final class MoshiJsonAdapter extends JsonAdapter<PollInterval> {
        private static final String[] NAMES = new String[]{"persistent", "standard"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Long> persistentAdapter;
        private final JsonAdapter<Long> standardAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.persistentAdapter = c5987p.a(Long.class);
            this.standardAdapter = c5987p.a(Long.class);
        }

        public PollInterval fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Long l = null;
            Long l2 = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        l = (Long) this.persistentAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        l2 = (Long) this.standardAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Updates_PollInterval(l, l2);
        }

        public void toJson(C5983k c5983k, PollInterval pollInterval) throws IOException {
            c5983k.c();
            Long persistent = pollInterval.persistent();
            if (persistent != null) {
                c5983k.b("persistent");
                this.persistentAdapter.toJson(c5983k, persistent);
            }
            pollInterval = pollInterval.standard();
            if (pollInterval != null) {
                c5983k.b("standard");
                this.standardAdapter.toJson(c5983k, pollInterval);
            }
            c5983k.d();
        }
    }

    AutoValue_Updates_PollInterval(Long l, Long l2) {
        super(l, l2);
    }
}
