package com.tinder.api.request;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_ReportUserRequest extends C$AutoValue_ReportUserRequest {

    public static final class MoshiJsonAdapter extends JsonAdapter<ReportUserRequest> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_CAUSE, ManagerWebServices.PARAM_TEXT};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> causeAdapter;
        private final JsonAdapter<String> textAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.causeAdapter = c5987p.a(Integer.class);
            this.textAdapter = c5987p.a(String.class);
        }

        public ReportUserRequest fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Integer num = null;
            String str = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) this.causeAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str = (String) this.textAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_ReportUserRequest(num, str);
        }

        public void toJson(C5983k c5983k, ReportUserRequest reportUserRequest) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_CAUSE);
            this.causeAdapter.toJson(c5983k, reportUserRequest.cause());
            reportUserRequest = reportUserRequest.text();
            if (reportUserRequest != null) {
                c5983k.b(ManagerWebServices.PARAM_TEXT);
                this.textAdapter.toJson(c5983k, reportUserRequest);
            }
            c5983k.d();
        }
    }

    AutoValue_ReportUserRequest(Integer num, String str) {
        super(num, str);
    }
}
