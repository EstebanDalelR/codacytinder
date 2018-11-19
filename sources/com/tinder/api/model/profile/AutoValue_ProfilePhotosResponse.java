package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.Photo;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_ProfilePhotosResponse extends C$AutoValue_ProfilePhotosResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<ProfilePhotosResponse> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_PROCESSING_PHOTOS, "photos"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Boolean> arePhotosProcessingAdapter;
        private final JsonAdapter<List<Photo>> photosAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.arePhotosProcessingAdapter = c5987p.a(Boolean.class);
            this.photosAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Photo.class}));
        }

        public ProfilePhotosResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Boolean bool = null;
            List list = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        bool = (Boolean) this.arePhotosProcessingAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        list = (List) this.photosAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_ProfilePhotosResponse(bool, list);
        }

        public void toJson(C5983k c5983k, ProfilePhotosResponse profilePhotosResponse) throws IOException {
            c5983k.c();
            Boolean arePhotosProcessing = profilePhotosResponse.arePhotosProcessing();
            if (arePhotosProcessing != null) {
                c5983k.b(ManagerWebServices.PARAM_PROCESSING_PHOTOS);
                this.arePhotosProcessingAdapter.toJson(c5983k, arePhotosProcessing);
            }
            profilePhotosResponse = profilePhotosResponse.photos();
            if (profilePhotosResponse != null) {
                c5983k.b("photos");
                this.photosAdapter.toJson(c5983k, profilePhotosResponse);
            }
            c5983k.d();
        }
    }

    AutoValue_ProfilePhotosResponse(Boolean bool, List<Photo> list) {
        super(bool, list);
    }
}
