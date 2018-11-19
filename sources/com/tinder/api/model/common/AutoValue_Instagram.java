package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.Instagram.Photo;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Instagram extends C$AutoValue_Instagram {

    public static final class MoshiJsonAdapter extends JsonAdapter<Instagram> {
        private static final String[] NAMES = new String[]{"username", ManagerWebServices.IG_PARAM_PROFILE_PIC, ManagerWebServices.IG_PARAM_MEDIA_COUNT, "photos", "completed_initial_fetch", ManagerWebServices.IG_PARAM_LAST_FETCH_TIME};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> completedInitialFetchAdapter;
        private final JsonAdapter<String> lastFetchTimeAdapter;
        private final JsonAdapter<Integer> mediaCountAdapter;
        private final JsonAdapter<List<Photo>> photosAdapter;
        private final JsonAdapter<String> profilePictureAdapter;
        private final JsonAdapter<String> usernameAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.usernameAdapter = c5987p.a(String.class);
            this.profilePictureAdapter = c5987p.a(String.class);
            this.mediaCountAdapter = c5987p.a(Integer.class);
            this.photosAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Photo.class}));
            this.completedInitialFetchAdapter = c5987p.a(Boolean.class);
            this.lastFetchTimeAdapter = c5987p.a(String.class);
        }

        public Instagram fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = str;
            Integer num = str2;
            List list = num;
            Boolean bool = list;
            String str3 = bool;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.usernameAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.profilePictureAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        num = (Integer) this.mediaCountAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        list = (List) this.photosAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        bool = (Boolean) this.completedInitialFetchAdapter.fromJson(jsonReader);
                        break;
                    case 5:
                        str3 = (String) this.lastFetchTimeAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Instagram(str, str2, num, list, bool, str3);
        }

        public void toJson(C5983k c5983k, Instagram instagram) throws IOException {
            c5983k.c();
            String username = instagram.username();
            if (username != null) {
                c5983k.b("username");
                this.usernameAdapter.toJson(c5983k, username);
            }
            username = instagram.profilePicture();
            if (username != null) {
                c5983k.b(ManagerWebServices.IG_PARAM_PROFILE_PIC);
                this.profilePictureAdapter.toJson(c5983k, username);
            }
            Integer mediaCount = instagram.mediaCount();
            if (mediaCount != null) {
                c5983k.b(ManagerWebServices.IG_PARAM_MEDIA_COUNT);
                this.mediaCountAdapter.toJson(c5983k, mediaCount);
            }
            List photos = instagram.photos();
            if (photos != null) {
                c5983k.b("photos");
                this.photosAdapter.toJson(c5983k, photos);
            }
            Boolean completedInitialFetch = instagram.completedInitialFetch();
            if (completedInitialFetch != null) {
                c5983k.b("completed_initial_fetch");
                this.completedInitialFetchAdapter.toJson(c5983k, completedInitialFetch);
            }
            instagram = instagram.lastFetchTime();
            if (instagram != null) {
                c5983k.b(ManagerWebServices.IG_PARAM_LAST_FETCH_TIME);
                this.lastFetchTimeAdapter.toJson(c5983k, instagram);
            }
            c5983k.d();
        }
    }

    AutoValue_Instagram(String str, String str2, Integer num, List<Photo> list, Boolean bool, String str3) {
        super(str, str2, num, list, bool, str3);
    }
}
