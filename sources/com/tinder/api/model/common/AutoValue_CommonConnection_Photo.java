package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.CommonConnection.Photo;
import java.io.IOException;

final class AutoValue_CommonConnection_Photo extends C$AutoValue_CommonConnection_Photo {

    public static final class MoshiJsonAdapter extends JsonAdapter<Photo> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_LARGE, ManagerWebServices.PARAM_MED, ManagerWebServices.PARAM_SMALL};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> largeAdapter;
        private final JsonAdapter<String> mediumAdapter;
        private final JsonAdapter<String> smallAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.largeAdapter = c5987p.a(String.class);
            this.mediumAdapter = c5987p.a(String.class);
            this.smallAdapter = c5987p.a(String.class);
        }

        public Photo fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            String str3 = str2;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.largeAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.mediumAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str3 = (String) this.smallAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_CommonConnection_Photo(str, str2, str3);
        }

        public void toJson(C5983k c5983k, Photo photo) throws IOException {
            c5983k.c();
            String large = photo.large();
            if (large != null) {
                c5983k.b(ManagerWebServices.PARAM_LARGE);
                this.largeAdapter.toJson(c5983k, large);
            }
            large = photo.medium();
            if (large != null) {
                c5983k.b(ManagerWebServices.PARAM_MED);
                this.mediumAdapter.toJson(c5983k, large);
            }
            photo = photo.small();
            if (photo != null) {
                c5983k.b(ManagerWebServices.PARAM_SMALL);
                this.smallAdapter.toJson(c5983k, photo);
            }
            c5983k.d();
        }
    }

    AutoValue_CommonConnection_Photo(String str, String str2, String str3) {
        super(str, str2, str3);
    }
}
