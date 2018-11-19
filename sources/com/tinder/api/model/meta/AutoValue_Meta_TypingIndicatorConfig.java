package com.tinder.api.model.meta;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.meta.Meta.TypingIndicatorConfig;
import java.io.IOException;

final class AutoValue_Meta_TypingIndicatorConfig extends C$AutoValue_Meta_TypingIndicatorConfig {

    public static final class MoshiJsonAdapter extends JsonAdapter<TypingIndicatorConfig> {
        private static final String[] NAMES = new String[]{"typing_heartbeat", "typing_ttl"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Long> typingHeartbeatAdapter;
        private final JsonAdapter<Long> typingTimeToLiveAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.typingHeartbeatAdapter = c5987p.a(Long.class);
            this.typingTimeToLiveAdapter = c5987p.a(Long.class);
        }

        public TypingIndicatorConfig fromJson(JsonReader jsonReader) throws IOException {
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
                        l = (Long) this.typingHeartbeatAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        l2 = (Long) this.typingTimeToLiveAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Meta_TypingIndicatorConfig(l, l2);
        }

        public void toJson(C5983k c5983k, TypingIndicatorConfig typingIndicatorConfig) throws IOException {
            c5983k.c();
            Long typingHeartbeat = typingIndicatorConfig.typingHeartbeat();
            if (typingHeartbeat != null) {
                c5983k.b("typing_heartbeat");
                this.typingHeartbeatAdapter.toJson(c5983k, typingHeartbeat);
            }
            typingIndicatorConfig = typingIndicatorConfig.typingTimeToLive();
            if (typingIndicatorConfig != null) {
                c5983k.b("typing_ttl");
                this.typingTimeToLiveAdapter.toJson(c5983k, typingIndicatorConfig);
            }
            c5983k.d();
        }
    }

    AutoValue_Meta_TypingIndicatorConfig(Long l, Long l2) {
        super(l, l2);
    }
}
