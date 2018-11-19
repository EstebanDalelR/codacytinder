package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.CommonConnection.Photo;
import java.io.IOException;

final class AutoValue_CommonConnection extends C$AutoValue_CommonConnection {

    public static final class MoshiJsonAdapter extends JsonAdapter<CommonConnection> {
        private static final String[] NAMES = new String[]{"id", "name", ManagerWebServices.PARAM_DEGREE, ManagerWebServices.PARAM_PHOTO};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> degreeAdapter;
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<String> nameAdapter;
        private final JsonAdapter<Photo> photoAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.nameAdapter = c5987p.a(String.class);
            this.degreeAdapter = c5987p.a(Integer.class);
            this.photoAdapter = c5987p.a(Photo.class);
        }

        public CommonConnection fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            Integer num = str2;
            Photo photo = num;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.idAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.nameAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        num = (Integer) this.degreeAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        photo = (Photo) this.photoAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_CommonConnection(str, str2, num, photo);
        }

        public void toJson(C5983k c5983k, CommonConnection commonConnection) throws IOException {
            c5983k.c();
            String id = commonConnection.id();
            if (id != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, id);
            }
            id = commonConnection.name();
            if (id != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, id);
            }
            Integer degree = commonConnection.degree();
            if (degree != null) {
                c5983k.b(ManagerWebServices.PARAM_DEGREE);
                this.degreeAdapter.toJson(c5983k, degree);
            }
            commonConnection = commonConnection.photo();
            if (commonConnection != null) {
                c5983k.b(ManagerWebServices.PARAM_PHOTO);
                this.photoAdapter.toJson(c5983k, commonConnection);
            }
            c5983k.d();
        }
    }

    AutoValue_CommonConnection(String str, String str2, Integer num, Photo photo) {
        super(str, str2, num, photo);
    }
}
