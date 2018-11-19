package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_Share extends C$AutoValue_Share {

    public static final class MoshiJsonAdapter extends JsonAdapter<Share> {
        private static final String[] NAMES = new String[]{ManagerWebServices.IG_PARAM_LINK, "share_text_v2"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> linkAdapter;
        private final JsonAdapter<String> shareTextAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.linkAdapter = c5987p.a(String.class);
            this.shareTextAdapter = c5987p.a(String.class);
        }

        public Share fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.linkAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.shareTextAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Share(str, str2);
        }

        public void toJson(C5983k c5983k, Share share) throws IOException {
            c5983k.c();
            String link = share.link();
            if (link != null) {
                c5983k.b(ManagerWebServices.IG_PARAM_LINK);
                this.linkAdapter.toJson(c5983k, link);
            }
            share = share.shareText();
            if (share != null) {
                c5983k.b("share_text_v2");
                this.shareTextAdapter.toJson(c5983k, share);
            }
            c5983k.d();
        }
    }

    AutoValue_Share(String str, String str2) {
        super(str, str2);
    }
}
