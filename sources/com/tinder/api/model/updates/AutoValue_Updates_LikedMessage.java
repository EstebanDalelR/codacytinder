package com.tinder.api.model.updates;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.model.updates.Updates.LikedMessage;
import java.io.IOException;

final class AutoValue_Updates_LikedMessage extends C$AutoValue_Updates_LikedMessage {

    public static final class MoshiJsonAdapter extends JsonAdapter<LikedMessage> {
        private static final String[] NAMES = new String[]{"message_id", "updated_at", "liker_id", "match_id", "is_liked"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> isLikedAdapter;
        private final JsonAdapter<String> likerIdAdapter;
        private final JsonAdapter<String> matchIdAdapter;
        private final JsonAdapter<String> messageIdAdapter;
        private final JsonAdapter<String> updatedAtAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.messageIdAdapter = c5987p.a(String.class);
            this.updatedAtAdapter = c5987p.a(String.class);
            this.likerIdAdapter = c5987p.a(String.class);
            this.matchIdAdapter = c5987p.a(String.class);
            this.isLikedAdapter = c5987p.a(Boolean.class);
        }

        public LikedMessage fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = str;
            String str3 = str2;
            String str4 = str3;
            Boolean bool = str4;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.messageIdAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.updatedAtAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str3 = (String) this.likerIdAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        str4 = (String) this.matchIdAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        bool = (Boolean) this.isLikedAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Updates_LikedMessage(str, str2, str3, str4, bool);
        }

        public void toJson(C5983k c5983k, LikedMessage likedMessage) throws IOException {
            c5983k.c();
            String messageId = likedMessage.messageId();
            if (messageId != null) {
                c5983k.b("message_id");
                this.messageIdAdapter.toJson(c5983k, messageId);
            }
            messageId = likedMessage.updatedAt();
            if (messageId != null) {
                c5983k.b("updated_at");
                this.updatedAtAdapter.toJson(c5983k, messageId);
            }
            messageId = likedMessage.likerId();
            if (messageId != null) {
                c5983k.b("liker_id");
                this.likerIdAdapter.toJson(c5983k, messageId);
            }
            messageId = likedMessage.matchId();
            if (messageId != null) {
                c5983k.b("match_id");
                this.matchIdAdapter.toJson(c5983k, messageId);
            }
            likedMessage = likedMessage.isLiked();
            if (likedMessage != null) {
                c5983k.b("is_liked");
                this.isLikedAdapter.toJson(c5983k, likedMessage);
            }
            c5983k.d();
        }
    }

    AutoValue_Updates_LikedMessage(String str, String str2, String str3, String str4, Boolean bool) {
        super(str, str2, str3, str4, bool);
    }
}
