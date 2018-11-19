package com.tinder.api.model.meta;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.meta.Meta.AccountConfig;
import java.io.IOException;

final class AutoValue_Meta_AccountConfig extends C$AutoValue_Meta_AccountConfig {

    public static final class MoshiJsonAdapter extends JsonAdapter<AccountConfig> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_NEEDS_PASSWORD};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> needPasswordAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.needPasswordAdapter = c5987p.a(Boolean.class);
        }

        public AccountConfig fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.needPasswordAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Meta_AccountConfig(bool);
        }

        public void toJson(C5983k c5983k, AccountConfig accountConfig) throws IOException {
            c5983k.c();
            accountConfig = accountConfig.needPassword();
            if (accountConfig != null) {
                c5983k.b(ManagerWebServices.PARAM_NEEDS_PASSWORD);
                this.needPasswordAdapter.toJson(c5983k, accountConfig);
            }
            c5983k.d();
        }
    }

    AutoValue_Meta_AccountConfig(Boolean bool) {
        super(bool);
    }
}
