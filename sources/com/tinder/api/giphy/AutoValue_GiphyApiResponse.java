package com.tinder.api.giphy;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.giphy.GiphyApiResponse.Giphy;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_GiphyApiResponse extends C$AutoValue_GiphyApiResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<GiphyApiResponse> {
        private static final String[] NAMES = new String[]{ManagerWebServices.FB_DATA};
        private static final C5971a OPTIONS = C5971a.m25580a(NAMES);
        private final JsonAdapter<List<Giphy>> dataAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.dataAdapter = c5987p.m25667a(C5992r.m25674a((Type) List.class, Giphy.class));
        }

        public GiphyApiResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.mo6451e();
            List list = null;
            while (jsonReader.mo6453g()) {
                switch (jsonReader.mo6447a(OPTIONS)) {
                    case -1:
                        jsonReader.mo6455i();
                        jsonReader.mo6462p();
                        break;
                    case 0:
                        list = (List) this.dataAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.mo6452f();
            return new AutoValue_GiphyApiResponse(list);
        }

        public void toJson(C5983k c5983k, GiphyApiResponse giphyApiResponse) throws IOException {
            c5983k.mo6472c();
            Object data = giphyApiResponse.data();
            if (data != null) {
                c5983k.mo6471b(ManagerWebServices.FB_DATA);
                this.dataAdapter.toJson(c5983k, data);
            }
            c5983k.mo6474d();
        }
    }

    AutoValue_GiphyApiResponse(List<Giphy> list) {
        super(list);
    }
}
