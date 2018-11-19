package com.tinder.api.response.v2;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.recs.Rec;
import com.tinder.api.response.v2.FastMatchRecsResponse.Data;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_FastMatchRecsResponse_Data extends C$AutoValue_FastMatchRecsResponse_Data {

    public static final class MoshiJsonAdapter extends JsonAdapter<Data> {
        private static final String[] NAMES = new String[]{"next_page_token", "new_count_token", ManagerWebServices.PARAM_RESULTS};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> newCountTokenAdapter;
        private final JsonAdapter<String> nextPageTokenAdapter;
        private final JsonAdapter<List<Rec>> resultsAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.nextPageTokenAdapter = c5987p.a(String.class);
            this.newCountTokenAdapter = c5987p.a(String.class);
            this.resultsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Rec.class}));
        }

        public Data fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            List list = str2;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.nextPageTokenAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.newCountTokenAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        list = (List) this.resultsAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_FastMatchRecsResponse_Data(str, str2, list);
        }

        public void toJson(C5983k c5983k, Data data) throws IOException {
            c5983k.c();
            String nextPageToken = data.nextPageToken();
            if (nextPageToken != null) {
                c5983k.b("next_page_token");
                this.nextPageTokenAdapter.toJson(c5983k, nextPageToken);
            }
            nextPageToken = data.newCountToken();
            if (nextPageToken != null) {
                c5983k.b("new_count_token");
                this.newCountTokenAdapter.toJson(c5983k, nextPageToken);
            }
            data = data.results();
            if (data != null) {
                c5983k.b(ManagerWebServices.PARAM_RESULTS);
                this.resultsAdapter.toJson(c5983k, data);
            }
            c5983k.d();
        }
    }

    AutoValue_FastMatchRecsResponse_Data(String str, String str2, List<Rec> list) {
        super(str, str2, list);
    }
}
