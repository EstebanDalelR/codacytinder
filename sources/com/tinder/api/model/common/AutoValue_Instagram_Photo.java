package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.Instagram.Photo;
import java.io.IOException;

final class AutoValue_Instagram_Photo extends C$AutoValue_Instagram_Photo {

    public static final class MoshiJsonAdapter extends JsonAdapter<Photo> {
        private static final String[] NAMES = new String[]{ManagerWebServices.IG_PARAM_LINK, ManagerWebServices.IG_PARAM_TIMESTAMP, ManagerWebServices.IG_PARAM_THUMB, ManagerWebServices.IG_PARAM_IMAGE};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> imageAdapter;
        private final JsonAdapter<String> linkAdapter;
        private final JsonAdapter<String> thumbnailAdapter;
        private final JsonAdapter<Long> tsAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.linkAdapter = c5987p.a(String.class);
            this.tsAdapter = c5987p.a(Long.TYPE);
            this.thumbnailAdapter = c5987p.a(String.class);
            this.imageAdapter = c5987p.a(String.class);
        }

        public Photo fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = str;
            String str3 = str2;
            long j = 0;
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
                        j = ((Long) this.tsAdapter.fromJson(jsonReader)).longValue();
                        break;
                    case 2:
                        str2 = (String) this.thumbnailAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        str3 = (String) this.imageAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Instagram_Photo(str, j, str2, str3);
        }

        public void toJson(C5983k c5983k, Photo photo) throws IOException {
            c5983k.c();
            String link = photo.link();
            if (link != null) {
                c5983k.b(ManagerWebServices.IG_PARAM_LINK);
                this.linkAdapter.toJson(c5983k, link);
            }
            c5983k.b(ManagerWebServices.IG_PARAM_TIMESTAMP);
            this.tsAdapter.toJson(c5983k, Long.valueOf(photo.ts()));
            link = photo.thumbnail();
            if (link != null) {
                c5983k.b(ManagerWebServices.IG_PARAM_THUMB);
                this.thumbnailAdapter.toJson(c5983k, link);
            }
            photo = photo.image();
            if (photo != null) {
                c5983k.b(ManagerWebServices.IG_PARAM_IMAGE);
                this.imageAdapter.toJson(c5983k, photo);
            }
            c5983k.d();
        }
    }

    AutoValue_Instagram_Photo(String str, long j, String str2, String str3) {
        super(str, j, str2, str3);
    }
}
